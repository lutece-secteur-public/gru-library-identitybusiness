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

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.RequestAuthor;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import fr.paris.lutece.plugins.identitystore.web.exception.RequestFormatException;
import org.apache.commons.lang3.StringUtils;

public abstract class RequestValidator
{
    /**
     * Check whether the parameters related to the author are valid or not
     *
     * @param author
     *            the request author to validate
     * @throws RequestFormatException
     *             in case of error
     */
    public void checkAuthor( RequestAuthor author ) throws RequestFormatException
    {

        if ( author == null )
        {
            throw new RequestFormatException( "Provided Author is null", Constants.PROPERTY_REST_ERROR_MISSING_AUTHOR_NAME_AND_TYPE_HEADERS );
        }

        if ( StringUtils.isEmpty( author.getName( ) ) || author.getType( ) == null )
        {
            throw new RequestFormatException( "Author and author type fields shall be set",
                    Constants.PROPERTY_REST_ERROR_MISSING_AUTHOR_NAME_AND_TYPE_HEADERS );
        }

    }

    /**
     * check whether the parameters related to the application are valid or not
     *
     * @param strClientCode
     *            client application code
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkClientCode( String strClientCode ) throws RequestFormatException
    {
        if ( StringUtils.isBlank( strClientCode ) )
        {
            throw new RequestFormatException( Constants.PARAM_CLIENT_CODE + " is missing", Constants.PROPERTY_REST_ERROR_MISSING_CLIENT_CODE );
        }
    }

    /**
     * check whether the parameters related to the application are valid or not
     *
     * @param strTargetClientCode
     *            target client application code
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkTargetClientCode( final String strTargetClientCode ) throws RequestFormatException
    {
        if ( StringUtils.isBlank( strTargetClientCode ) )
        {
            throw new RequestFormatException( "target_client_code is missing", Constants.PROPERTY_REST_ERROR_MISSING_TARGET_CLIENT_CODE );
        }
    }

    /**
     * check whether the parameters related to the application are valid or not
     *
     * @param strApplicationCode
     *            client application code
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkApplicationCode( String strApplicationCode ) throws RequestFormatException
    {
        if ( StringUtils.isBlank( strApplicationCode ) )
        {
            throw new RequestFormatException( "application_code is missing", Constants.PROPERTY_REST_ERROR_MISSING_APPLICATION_CODE );
        }
    }
}
