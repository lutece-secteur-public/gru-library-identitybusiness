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

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.application.ClientApplicationDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.contract.AttributeDefinitionDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.contract.ServiceContractDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud.IdentityChangeRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.exporting.IdentityExportRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.history.IdentityHistorySearchRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.merge.IdentityMergeRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search.IdentitySearchRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search.UpdatedIdentitySearchRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Optional;

/**
 *
 * util class used to validate identity store request
 *
 */
public final class IdentityRequestValidator extends RequestValidator
{
    /**
     * singleton
     */
    private static IdentityRequestValidator _singleton;

    /**
     * private constructor
     */
    private IdentityRequestValidator( )
    {

    }

    /**
     * return singleton's instance
     * 
     * @return IdentityRequestValidator
     */
    public static IdentityRequestValidator instance( )
    {
        if ( _singleton == null )
        {
            _singleton = new IdentityRequestValidator( );
        }

        return _singleton;
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
     * check whether the parameters related to the service contract are valid or not
     *
     * @param contractId
     *            the service contract id
     * @throws IdentityStoreException
     *             if the parameters are not valid
     */
    public void checkContractId( Integer contractId ) throws IdentityStoreException
    {
        if ( contractId == null )
        {
            throw new IdentityStoreException( Constants.PARAM_ID_SERVICE_CONTRACT + " is missing." );
        }
    }

    /**
     * check whether the parameters related to the identity update are valid or not
     *
     * @param strConnectionId
     *            the connection id
     * @param strCustomerId
     *            the customer id
     * @throws IdentityStoreException
     *             if the parameters are not valid
     */
    public void checkIdentityForUpdate( String strConnectionId, String strCustomerId ) throws IdentityStoreException
    {
        if ( StringUtils.isNotEmpty( strConnectionId ) && StringUtils.isBlank( strCustomerId ) )
        {
            throw new IdentityStoreException( "You cannot update an identity providing its connection_id. You must specify " + Constants.PARAM_ID_CUSTOMER );
        }

        if ( StringUtils.isBlank( strCustomerId ) )
        {
            throw new IdentityStoreException( Constants.PARAM_ID_CUSTOMER + " is missing" );
        }
    }

    /**
     * check whether the parameters related to the identity are valid or not
     * 
     * @param identityChange
     * @throws IdentityStoreException
     */
    public void checkIdentityChange( final IdentityChangeRequest identityChange, final boolean isUpdate ) throws IdentityStoreException
    {
        if ( identityChange == null || identityChange.getIdentity( ) == null || identityChange.getIdentity( ).getAttributes( ) == null
                || identityChange.getIdentity( ).getAttributes( ).isEmpty( ) )
        {
            throw new IdentityStoreException( "Provided Identity Change request is null or empty" );
        }

        if ( isUpdate && identityChange.getIdentity( ).getLastUpdateDate( ) == null )
        {
            throw new IdentityStoreException( "The identity's last update date must be provided." );
        }

        if ( identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> a.getKey( ) == null || a.getKey( ).isEmpty( ) ) )
        {
            throw new IdentityStoreException( "Provided attributes shall specify their key." );
        }

        if ( identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> !a.isCertified( ) ) )
        {
            throw new IdentityStoreException( "Provided attributes shall be fully certified (process + date)" );
        }

        if ( identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> a.getValue( ) == null ) )
        {
            throw new IdentityStoreException( "Provided attributes shall specify a value" );
        }

        if ( !isUpdate && identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> a.getValue( ) == null || a.getValue( ).isEmpty( ) ) )
        {
            throw new IdentityStoreException( "You cannot provide empty attribute values for creating an identity." );
        }
    }

    public void checkIdentitySearch( final IdentitySearchRequest identitySearch ) throws IdentityStoreException
    {
        if ( StringUtils.isNotEmpty( identitySearch.getConnectionId( ) ) && identitySearch.getSearch( ) != null )
        {
            throw new IdentityStoreException( "You cannot provide a connection_id and a Search at the same time." );
        }
        if ( StringUtils.isEmpty( identitySearch.getConnectionId( ) ) && ( identitySearch.getSearch( ) == null
                || identitySearch.getSearch( ).getAttributes( ) == null || identitySearch.getSearch( ).getAttributes( ).isEmpty( ) ) )
        {
            throw new IdentityStoreException( "Provided Identity Search request is null or empty" );
        }
        if ( identitySearch.getSearch( ) != null && identitySearch.getSearch( ).getAttributes( ) != null
                && identitySearch.getSearch( ).getAttributes( ).stream( ).anyMatch( a -> a.getValue( ) == null || a.getValue( ).isEmpty( ) ) )
        {
            throw new IdentityStoreException( "You cannot provide empty attribute values for searching identities." );
        }
    }

    public void checkIdentityHistory( IdentityHistorySearchRequest request ) throws IdentityStoreException
    {
        if ( StringUtils.isAllEmpty( request.getCustomerId( ), request.getAuthorName( ), request.getClientCode( ), request.getChangeStatus( ) )
                && request.getMetadata( ).isEmpty( ) && request.getIdentityChangeType( ) == null && request.getModificationDateIntervalStart( ) == null
                && request.getModificationDateIntervalEnd( ) == null )
        {
            throw new IdentityStoreException( "Provided Identity history Search request is null or empty" );
        }
        if ( request.getNbDaysFrom( ) != null && request.getNbDaysFrom( ) != 0
                && ( request.getModificationDateIntervalStart( ) != null || request.getModificationDateIntervalEnd( ) != null ) )
        {
            throw new IdentityStoreException(
                    "Provided Identity history Search request is invalid : providing both 'nb_days_from' and a date interval is forbidden." );
        }
    }

    /**
     * Check whether the parameters related to the identity merge request are valid or not
     *
     * @param identityMergeRequest
     *            the identity merge request
     * @throws IdentityStoreException
     *             if the parameters are not valid
     */
    public void checkMergeRequest( IdentityMergeRequest identityMergeRequest ) throws IdentityStoreException
    {
        if ( identityMergeRequest == null )
        {
            throw new IdentityStoreException( "Provided Identity Merge request is null" );
        }

        if ( identityMergeRequest.getPrimaryCuid( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the CUID of the primary Identity" );
        }

        if ( identityMergeRequest.getSecondaryCuid( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the CUID of the secondary Identity" );
        }

        if ( identityMergeRequest.getPrimaryLastUpdateDate( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the last update date of the primary Identity" );
        }

        if ( identityMergeRequest.getSecondaryLastUpdateDate( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the last update date of the secondary Identity" );
        }
    }

    /**
     * Check whether the parameters related to the identity merge request are valid or not
     *
     * @param identityMergeRequest
     *            the identity merge request
     * @throws IdentityStoreException
     *             if the parameters are not valid
     */
    public void checkCancelMergeRequest( final IdentityMergeRequest identityMergeRequest ) throws IdentityStoreException
    {

        if ( identityMergeRequest == null )
        {
            throw new IdentityStoreException( "Provided Identity Merge request is null" );
        }

        if ( identityMergeRequest.getPrimaryCuid( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the CUID of the primary Identity" );
        }

        if ( identityMergeRequest.getSecondaryCuid( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the CUID of the secondary Identity" );
        }

        if ( identityMergeRequest.getPrimaryLastUpdateDate( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the last update date of the primary Identity" );
        }

        if ( identityMergeRequest.getSecondaryLastUpdateDate( ) == null )
        {
            throw new IdentityStoreException( "An Identity merge request must provide the last update date of the secondary Identity" );
        }

        if ( identityMergeRequest.getIdentity( ) != null )
        {
            throw new IdentityStoreException( "A cancel identity merge request cannot provide an Identity. Only primary and secondary CUIDs are authorized." );
        }
    }

    public void checkServiceContract( ServiceContractDto serviceContractDto ) throws IdentityStoreException
    {
        if ( serviceContractDto == null )
        {
            throw new IdentityStoreException( "Provided service contract is null" );
        }

        if ( StringUtils.isEmpty( serviceContractDto.getClientCode( ) ) )
        {
            throw new IdentityStoreException( "Provided ServiceContractDto must specify a target client code" );
        }

        if ( serviceContractDto.getStartingDate( ) == null )
        {
            throw new IdentityStoreException( "Provided ServiceContractDto must specify a starting date" );
        }

        if ( serviceContractDto.getAttributeDefinitions( ) != null && !serviceContractDto.getAttributeDefinitions( ).isEmpty( ) )
        {
            final Optional<AttributeDefinitionDto> malformedAttributeRequirement = serviceContractDto.getAttributeDefinitions( ).stream( )
                    .filter( def -> def.getAttributeRight( ) != null && def.getAttributeRight( ).isMandatory( )
                            && ( def.getAttributeRequirement( ) == null || def.getAttributeRequirement( ).getLevel( ) == null ) )
                    .findAny( );
            if ( malformedAttributeRequirement.isPresent( ) )
            {
                throw new IdentityStoreException( "Provided mandatory attributes must specify a minimum certification level" );
            }
        }
    }

    public void checkClosingServiceContract( ServiceContractDto serviceContractDto ) throws IdentityStoreException
    {
        if ( serviceContractDto == null )
        {
            throw new IdentityStoreException( "Provided service contract is null" );
        }

        if ( serviceContractDto.getEndingDate( ) == null )
        {
            throw new IdentityStoreException( "Provided ServiceContractDto must specify an ending date" );
        }
    }

    public void checkClientApplicationDto( ClientApplicationDto clientApplicationDto ) throws IdentityStoreException
    {
        if ( clientApplicationDto == null )
        {
            throw new IdentityStoreException( "Provided client is null" );
        }

        if ( clientApplicationDto.getClientCode( ) == null )
        {
            throw new IdentityStoreException( "Provided client must specify a client code" );
        }
    }

    public void checkUpdatedIdentitySearchRequest( final UpdatedIdentitySearchRequest updatedIdentitySearchRequest ) throws IdentityStoreException
    {
        if ( updatedIdentitySearchRequest == null || ( updatedIdentitySearchRequest.getDays( ) == null
                && updatedIdentitySearchRequest.getUpdatedAttributes( ).isEmpty( ) && updatedIdentitySearchRequest.getIdentityChangeTypes( ).isEmpty( ) ) )
        {
            throw new IdentityStoreException( "Provided Updated Identity Search request is null or empty" );
        }
    }

    /**
     * Check whether the Identity Export Request is valid or not
     *
     * @param request
     *            the request
     * @throws IdentityStoreException
     *             if the request is null or contains an empty or null CUID list
     */
    public void checkExportRequest( final IdentityExportRequest request ) throws IdentityStoreException
    {
        if ( request == null || request.getCuidList( ) == null || request.getCuidList( ).isEmpty( ) )
        {
            throw new IdentityStoreException( "Provided request is null or contains an empty CUID list" );
        }
    }
}
