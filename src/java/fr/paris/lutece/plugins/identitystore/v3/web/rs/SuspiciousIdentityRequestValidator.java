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

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud.SuspiciousIdentityChangeRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud.SuspiciousIdentityExcludeRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud.SuspiciousIdentitySearchRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.lock.SuspiciousIdentityLockRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search.DuplicateSearchRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * util class used to validate suspicious identity store request
 *
 */
public final class SuspiciousIdentityRequestValidator extends RequestValidator
{
    /**
     * singleton
     */
    private static SuspiciousIdentityRequestValidator _singleton;

    /**
     * private constructor
     */
    private SuspiciousIdentityRequestValidator( )
    {

    }

    /**
     * return singleton's instance
     * 
     * @return SuspiciousIdentityRequestValidator
     */
    public static SuspiciousIdentityRequestValidator instance( )
    {
        if ( _singleton == null )
        {
            _singleton = new SuspiciousIdentityRequestValidator( );
        }

        return _singleton;
    }

    /**
     * Check whether the parameters related to the duplicate search request are valid.
     * 
     * @param request
     *            the request
     * @throws IdentityStoreException
     *             if params are not valid
     */
    public void checkDuplicateSearch( final DuplicateSearchRequest request ) throws IdentityStoreException
    {
        if ( request == null )
        {
            throw new IdentityStoreException( "Provided duplicate search request is null" );
        }

        if ( request.getRuleCodes( ) == null || request.getRuleCodes( ).isEmpty( ) )
        {
            throw new IdentityStoreException( "Provided duplicate search request must define at least one rule code" );
        }

        if ( request.getAttributes( ) == null || request.getAttributes( ).isEmpty( ) )
        {
            throw new IdentityStoreException( "Provided duplicate search request must define at least one attribute" );
        }
    }

    /**
     * Check whether the parameters related to the suspicious identity search request are valid.
     *
     * @param request
     *            the request
     * @throws IdentityStoreException
     *             if params are not valid
     */
    public void checkSuspiciousIdentitySearch( final SuspiciousIdentitySearchRequest request ) throws IdentityStoreException
    {
        if ( request == null )
        {
            throw new IdentityStoreException( "Provided suspicious identity search request is null" );
        }
    }

    /**
     * check whether the parameters related to the identity are valid or not
     *
     * @param request
     * @throws IdentityStoreException
     */
    public void checkSuspiciousIdentityChange( SuspiciousIdentityChangeRequest request ) throws IdentityStoreException
    {
        if ( request == null || request.getSuspiciousIdentity( ) == null )
        {
            throw new IdentityStoreException( "Provided Suspicious Identity Change request is null or empty" );
        }
    }

    /**
     * check whether the parameters related to the identity are valid or not
     *
     * @param request
     * @throws IdentityStoreException
     */
    public void checkLockRequest( SuspiciousIdentityLockRequest request ) throws IdentityStoreException
    {
        if ( request == null || request.getCustomerId( ) == null )
        {
            throw new IdentityStoreException( "Provided Suspicious Lock request is null or empty" );
        }
    }

    /**
     * check suspicious identity exclusion request
     *
     * @param request
     * @throws IdentityStoreException
     */
    public void checkSuspiciousIdentityChange( SuspiciousIdentityExcludeRequest request ) throws IdentityStoreException
    {
        if ( request == null )
        {
            throw new IdentityStoreException( "The provided request is null or empty." );
        }

        if ( StringUtils.isEmpty( request.getIdentityCuid1( ) ) )
        {
            throw new IdentityStoreException( "Parameter identity_cuid_1 is missing." );
        }

        if ( StringUtils.isEmpty( request.getIdentityCuid2( ) ) )
        {
            throw new IdentityStoreException( "Parameter identity_cuid_2 is missing." );
        }
    }

    /**
     * check whether the parameters related to the identity are valid or not
     *
     * @param strCustomerId
     *            the customer id
     * @throws IdentityStoreException
     *             if the parameters are not valid
     */
    public void checkCustomerId( String strCustomerId ) throws IdentityStoreException
    {
        if ( StringUtils.isBlank( strCustomerId ) )
        {
            throw new IdentityStoreException( Constants.PARAM_ID_CUSTOMER + " is missing." );
        }
    }

    /**
     * check whether the parameters related to the identity are valid or not
     *
     * @param strRuleCode
     *            the rule code
     * @throws IdentityStoreException
     *             if the parameters are not valid
     */
    public void checkRuleCode( String strRuleCode ) throws IdentityStoreException
    {
        if ( StringUtils.isBlank( strRuleCode ) )
        {
            throw new IdentityStoreException( Constants.PARAM_RULE_CODE + " is missing." );
        }
    }
}
