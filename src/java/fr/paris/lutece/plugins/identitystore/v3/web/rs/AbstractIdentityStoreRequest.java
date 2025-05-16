/*
 * Copyright (c) 2002-2024, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AuthorType;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.RequestAuthor;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.ClientAuthorizationException;
import fr.paris.lutece.plugins.identitystore.web.exception.DuplicatesConsistencyException;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import fr.paris.lutece.plugins.identitystore.web.exception.RequestContentFormattingException;
import fr.paris.lutece.plugins.identitystore.web.exception.RequestFormatException;
import fr.paris.lutece.plugins.identitystore.web.exception.ResourceConsistencyException;
import fr.paris.lutece.plugins.identitystore.web.exception.ResourceNotFoundException;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractIdentityStoreRequest
{

    protected final String _strClientCode;
    protected final RequestAuthor _author;

    protected AbstractIdentityStoreRequest( final String strClientCode, final String authorName, final String authorType ) throws RequestFormatException
    {
        if ( StringUtils.isEmpty( authorName ) || StringUtils.isEmpty( authorType ) )
        {
            throw new RequestFormatException( "Author_name and author_type must be provided in request header",
                    Constants.PROPERTY_REST_ERROR_MISSING_AUTHOR_NAME_AND_TYPE_HEADERS );
        }

        if ( !AuthorType.valid( authorType ) )
        {
            throw new RequestFormatException( "The provided author type value is not valid: " + authorType, Constants.PROPERTY_REST_ERROR_INVALID_AUTHOR_TYPE );
        }
        this._strClientCode = strClientCode;
        this._author = new RequestAuthor( authorName, authorType );
    }

    /**
     * Valid the request according to parameter
     *
     * @throws IdentityStoreException
     *             if request not valid
     * @throws IdentityStoreException
     */
    protected void validateRequest( ) throws IdentityStoreException
    {
        this.validateRequestHeaderFormat( );
        this.fetchResources( );
        this.validateRequestFormat( );
        this.validateClientAuthorization( );
        this.validateResourcesConsistency( );
        this.formatRequestContent( );
        this.checkDuplicatesConsistency( );
    }

    protected void validateRequestHeaderFormat( ) throws RequestFormatException
    {
        IdentityRequestValidator.instance( ).checkClientCode( this._strClientCode );
        IdentityRequestValidator.instance( ).checkAuthor( this._author );
    }

    /**
     * Fetch the needed resources to perform the request and its validations
     * 
     * @throws ResourceNotFoundException
     *             in case of error
     */
    protected abstract void fetchResources( ) throws ResourceNotFoundException, ClientAuthorizationException;

    /**
     * Validates the request according to Request format validator
     *
     * @throws RequestFormatException
     *             in case of error
     *
     */
    protected abstract void validateRequestFormat( ) throws RequestFormatException;

    /**
     * Validates that client request is authorized
     *
     * @throws ClientAuthorizationException
     *             in case of error
     *
     */
    protected abstract void validateClientAuthorization( ) throws ClientAuthorizationException;

    /**
     * Validates that the request doesn't go against the resources consistency
     * 
     * @throws ResourceConsistencyException
     *             in case of error
     */
    protected abstract void validateResourcesConsistency( ) throws ResourceConsistencyException;

    /**
     * Format and validate request content
     *
     * @throws RequestContentFormattingException
     *             in case of error
     *
     */
    protected abstract void formatRequestContent( ) throws RequestContentFormattingException;

    /**
     * Ensure that the resource has no duplicate before executing the request
     *
     * @throws DuplicatesConsistencyException
     *             in case of error
     *
     */
    protected abstract void checkDuplicatesConsistency( ) throws DuplicatesConsistencyException;

    /**
     * Specific action for the request
     *
     * @return html/json string response
     * @throws IdentityStoreException
     *             in case of request fail
     */
    protected abstract ResponseDto doSpecificRequest( ) throws IdentityStoreException;

    /**
     * Do the request, call the inner validRequest and doSpecificRequest
     *
     * @return html/json string response
     * @throws IdentityStoreException
     *             in case of failure
     */
    public ResponseDto doRequest( ) throws IdentityStoreException
    {
        this.validateRequest( );
        return doSpecificRequest( );
    }
}
