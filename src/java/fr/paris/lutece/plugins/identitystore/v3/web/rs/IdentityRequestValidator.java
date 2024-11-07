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
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AttributeDto;
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
import fr.paris.lutece.plugins.identitystore.web.exception.RequestFormatException;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    public void checkCustomerId( String strCustomerId ) throws RequestFormatException
    {
        if ( StringUtils.isBlank( strCustomerId ) )
        {
            throw new RequestFormatException( Constants.PARAM_ID_CUSTOMER + " is missing.", Constants.PROPERTY_REST_ERROR_MISSING_CUSTOMER_ID );
        }
    }

    /**
     * check whether the parameters related to the service contract are valid or not
     *
     * @param contractId
     *            the service contract id
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkContractId( Integer contractId ) throws RequestFormatException
    {
        if ( contractId == null )
        {
            throw new RequestFormatException( "service_contract_id is missing.", Constants.PROPERTY_REST_ERROR_MISSING_SERVICE_CONTRACT_ID );
        }
    }

    /**
     * check whether the parameters related to the identity update are valid or not
     *
     * @param strConnectionId
     *            the connection id
     * @param strCustomerId
     *            the customer id
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkIdentityForUpdate( String strConnectionId, String strCustomerId ) throws RequestFormatException
    {
        if ( StringUtils.isNotEmpty( strConnectionId ) && StringUtils.isBlank( strCustomerId ) )
        {
            throw new RequestFormatException( "You cannot update an identity providing its connection_id. You must specify a customer_id",
                    Constants.PROPERTY_REST_ERROR_IDENTITY_UPDATE_WITH_ONLY_CONNECTION_ID );
        }

        if ( StringUtils.isBlank( strCustomerId ) )
        {
            throw new RequestFormatException( "customer_id is missing", Constants.PROPERTY_REST_ERROR_MISSING_CUSTOMER_ID );
        }
    }

    /**
     * check whether the parameters related to the identity change request are valid or not
     * 
     * @param identityChange
     *            the change request
     * @param isUpdate
     *            <code>true</code> for updating an existing identity, <code>false</code> for creating a new one
     * @throws RequestFormatException
     */
    public void checkIdentityChange( final IdentityChangeRequest identityChange, final boolean isUpdate ) throws RequestFormatException
    {
        if ( identityChange == null || identityChange.getIdentity( ) == null || identityChange.getIdentity( ).getAttributes( ) == null
                || identityChange.getIdentity( ).getAttributes( ).isEmpty( ) )
        {
            throw new RequestFormatException( "Provided Identity Change request is null or empty", Constants.PROPERTY_REST_ERROR_EMPTY_CHANGE_CRITERIAS );
        }

        if ( isUpdate && identityChange.getIdentity( ).getLastUpdateDate( ) == null )
        {
            throw new RequestFormatException( "The identity's last update date must be provided.",
                    Constants.PROPERTY_REST_ERROR_EMPTY_IDENTITY_LAST_UPDATE_DATE );
        }

        if ( identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> a.getKey( ) == null || a.getKey( ).isEmpty( ) ) )
        {
            throw new RequestFormatException( "Provided attributes must specify their key.", Constants.PROPERTY_REST_ERROR_IDENTITY_ATTRIBUTE_MISSING_KEY );
        }

        if ( identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> !a.isCertified( ) ) )
        {
            throw new RequestFormatException( "Provided attributes must be fully certified (process + date)",
                    Constants.PROPERTY_REST_ERROR_IDENTITY_ATTRIBUTE_NOT_CERTIFIED );
        }

        if ( identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> a.getValue( ) == null ) )
        {
            throw new RequestFormatException( "Provided attributes must specify a value", Constants.PROPERTY_REST_ERROR_IDENTITY_ATTRIBUTE_MISSING_VALUE );
        }

        if ( !isUpdate && identityChange.getIdentity( ).getAttributes( ).stream( ).anyMatch( a -> a.getValue( ) == null || a.getValue( ).isEmpty( ) ) )
        {
            throw new RequestFormatException( "You cannot provide empty attribute values for creating an identity.",
                    Constants.PROPERTY_REST_ERROR_IDENTITY_ATTRIBUTE_EMPTY_VALUE_FOR_CREATE );
        }

        if ( !isUpdate && StringUtils.isNotEmpty( identityChange.getIdentity( ).getCustomerId( ) ) )
        {
            throw new RequestFormatException( "You cannot specify a CUID when requesting for a creation",
                    Constants.PROPERTY_REST_ERROR_IDENTITY_CREATE_WITH_CUID );
        }

        // check if duplicates were sent in the attributes
        final Map<String, List<AttributeDto>> attrMap = new HashMap<>( );
        identityChange.getIdentity( ).getAttributes( ).forEach( a -> attrMap.compute( a.getKey( ), ( key, value ) -> {
            final List<AttributeDto> attrList = value == null ? new ArrayList<>( ) : value;
            attrList.add( a );
            return attrList;
        } ) );
        final List<List<AttributeDto>> duplicateAttrLists = attrMap.values( ).stream( ).filter( l -> l.size( ) > 1 ).collect( Collectors.toList( ) );
        if ( !duplicateAttrLists.isEmpty( ) )
        {
            for ( final List<AttributeDto> duplicateAttrList : duplicateAttrLists )
            {
                final long diffValueDuplicateCount = duplicateAttrList.stream( ).map( AttributeDto::getValue )
                        .collect( Collectors.groupingBy( Function.identity( ), Collectors.counting( ) ) ).size();
                if ( diffValueDuplicateCount > 1 )
                {
                    throw new RequestFormatException( "You cannot provide the same attribute multiple times with different values",
                            Constants.PROPERTY_REST_ERROR_CHANGE_REQUEST_SAME_ATTRIUTE_DIFFERENT_VALUE );
                }
            }

            // No duplicate with different value => remove the duplicates from the request
            identityChange.getIdentity( ).setAttributes( attrMap.values( ).stream( ).map( l -> l.get( 0 ) ).collect( Collectors.toList( ) ) );
        }
    }

    /**
     * check whether the parameters related to the identity search request are valid or not
     *
     * @param identitySearch
     * @throws RequestFormatException
     */
    public void checkIdentitySearch( final IdentitySearchRequest identitySearch ) throws RequestFormatException
    {
        if ( identitySearch == null || ( StringUtils.isEmpty( identitySearch.getConnectionId( ) ) && ( identitySearch.getSearch( ) == null
                || identitySearch.getSearch( ).getAttributes( ) == null || identitySearch.getSearch( ).getAttributes( ).isEmpty( ) ) ) )
        {
            throw new RequestFormatException( "Provided Identity Search request is null or empty", Constants.PROPERTY_REST_ERROR_EMPTY_SEARCH_CRITERIAS );
        }

        if ( StringUtils.isNotEmpty( identitySearch.getConnectionId( ) ) && identitySearch.getSearch( ) != null )
        {
            throw new RequestFormatException( "You cannot provide a connection_id and a Search at the same time.",
                    Constants.PROPERTY_REST_ERROR_SEARCH_IDENTITY_CONNECTION_ID_OR_CRITERIAS );
        }
        if ( identitySearch.getSearch( ) != null && identitySearch.getSearch( ).getAttributes( ) != null
                && identitySearch.getSearch( ).getAttributes( ).stream( ).anyMatch( a -> a.getValue( ) == null || a.getValue( ).isEmpty( ) ) )
        {
            throw new RequestFormatException( "You cannot provide empty attribute values for searching identities.",
                    Constants.PROPERTY_REST_ERROR_EMPTY_SEARCH_CRITERIAS_ATTRIBUTES );
        }
    }

    public void checkIdentityHistory( final IdentityHistorySearchRequest request ) throws RequestFormatException
    {
        if (request == null || (StringUtils.isAllEmpty( request.getCustomerId( ), request.getAuthorName( ), request.getClientCode( ), request.getChangeStatus( ) )
            && (request.getMetadata() == null || request.getMetadata().isEmpty()) && request.getIdentityChangeType() == null && request.getModificationDateIntervalStart() == null
                        && request.getModificationDateIntervalEnd( ) == null && (request.getNbDaysFrom() == null || request.getNbDaysFrom() == 0 ) ))
        {
            throw new RequestFormatException( "Provided Identity history Search request is null or empty", Constants.PROPERTY_REST_ERROR_HISTORY_SEARCH_EMPTY );
        }
        if ( request.getNbDaysFrom( ) != null && request.getNbDaysFrom( ) != 0
                && ( request.getModificationDateIntervalStart( ) != null || request.getModificationDateIntervalEnd( ) != null ) )
        {
            throw new RequestFormatException(
                    "Provided Identity history Search request is invalid : providing both 'nb_days_from' and a date interval is forbidden.",
                    Constants.PROPERTY_REST_ERROR_HISTORY_SEARCH_INVALID );
        }
        if (request.getModificationDateIntervalStart() != null && request.getModificationDateIntervalEnd() != null &&
            request.getModificationDateIntervalEnd().before(request.getModificationDateIntervalStart())) {
            throw new RequestFormatException(
                    "Provided Identity history Search request is invalid : end date is before start date",
                    Constants.PROPERTY_REST_ERROR_END_DATE_BEFORE_START_DATE);
        }
    }

    /**
     * Check whether the parameters related to the identity merge request are valid or not
     *
     * @param identityMergeRequest
     *            the identity merge request
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkMergeRequest( final IdentityMergeRequest identityMergeRequest ) throws RequestFormatException
    {
        if ( identityMergeRequest == null )
        {
            throw new RequestFormatException( "Provided Identity Merge request is null", Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NULL );
        }

        if ( identityMergeRequest.getPrimaryCuid( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the CUID of the primary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_PRIMARY_CUID );
        }

        if ( identityMergeRequest.getSecondaryCuid( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the CUID of the secondary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_SECONDARY_CUID );
        }

        if ( identityMergeRequest.getPrimaryLastUpdateDate( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the last update date of the primary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_PRIMARY_LAST_UPDATE_DATE );
        }

        if ( identityMergeRequest.getSecondaryLastUpdateDate( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the last update date of the secondary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_SECONDARY_LAST_UPDATE_DATE );
        }
    }

    /**
     * Check whether the parameters related to the identity merge request are valid or not
     *
     * @param identityMergeRequest
     *            the identity merge request
     * @throws RequestFormatException
     *             if the parameters are not valid
     */
    public void checkCancelMergeRequest( final IdentityMergeRequest identityMergeRequest ) throws RequestFormatException
    {

        if ( identityMergeRequest == null )
        {
            throw new RequestFormatException( "Provided Identity Merge request is null", Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NULL );
        }

        if ( identityMergeRequest.getPrimaryCuid( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the CUID of the primary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_PRIMARY_CUID );
        }

        if ( identityMergeRequest.getSecondaryCuid( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the CUID of the secondary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_SECONDARY_CUID );
        }

        if ( identityMergeRequest.getPrimaryLastUpdateDate( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the last update date of the primary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_PRIMARY_LAST_UPDATE_DATE );
        }

        if ( identityMergeRequest.getSecondaryLastUpdateDate( ) == null )
        {
            throw new RequestFormatException( "An Identity merge request must provide the last update date of the secondary Identity",
                    Constants.PROPERTY_REST_ERROR_MERGE_REQUEST_NO_SECONDARY_LAST_UPDATE_DATE );
        }

        if ( identityMergeRequest.getIdentity( ) != null )
        {
            throw new RequestFormatException( "A cancel identity merge request cannot provide an Identity. Only primary and secondary CUIDs are authorized.",
                    Constants.PROPERTY_REST_ERROR_CANCEL_MERGE_REQUEST_WITH_IDENTITY );
        }
    }

    public void checkServiceContract( final ServiceContractDto serviceContractDto ) throws RequestFormatException
    {
        if ( serviceContractDto == null )
        {
            throw new RequestFormatException( "Provided service contract is null", Constants.PROPERTY_REST_ERROR_PROVIDED_SERVICE_CONTRACT_NULL );
        }

        if(serviceContractDto.getStartingDate() == null || StringUtils.isEmpty( serviceContractDto.getClientCode( ) ) ||
           serviceContractDto.getName() == null || serviceContractDto.getMoaContactName() == null || serviceContractDto.getMoaEntityName() == null ||
           serviceContractDto.getMoeEntityName() == null || serviceContractDto.getMoeResponsibleName() == null || serviceContractDto.getServiceType() == null){
            throw new RequestFormatException("Provided ServiceContractDto must specify those fields : clientCode, startingDate, name, moaEntityName, moaContactName, moeResponsibleName, moeEntityName, serviceType",
                                             Constants.PROPERTY_REST_ERROR_SERVICE_CONTRACT_WITHOUT_MANDATORY_FIELDS);
        }

        if ( serviceContractDto.getAttributeDefinitions( ) != null && !serviceContractDto.getAttributeDefinitions( ).isEmpty( ) )
        {
            final Optional<AttributeDefinitionDto> malformedAttributeRequirement = serviceContractDto.getAttributeDefinitions( ).stream( )
                    .filter( def -> def.getAttributeRight( ) != null && def.getAttributeRight( ).isMandatory( )
                            && ( def.getAttributeRequirement( ) == null || def.getAttributeRequirement( ).getLevel( ) == null ) )
                    .findAny( );
            if ( malformedAttributeRequirement.isPresent( ) )
            {
                throw new RequestFormatException( "Provided mandatory attributes must specify a minimum certification level",
                        Constants.PROPERTY_REST_ERROR_SERVICE_CONTRACT_MANDATORY_ATTRIBUTES_MINIMUM_CERTIFICATION );
            }
        }
    }

    public void checkClosingServiceContract( final ServiceContractDto serviceContractDto ) throws RequestFormatException
    {
        if ( serviceContractDto == null )
        {
            throw new RequestFormatException( "Provided service contract is null", Constants.PROPERTY_REST_ERROR_PROVIDED_SERVICE_CONTRACT_NULL );
        }

        if ( serviceContractDto.getEndingDate( ) == null )
        {
            throw new RequestFormatException( "Provided ServiceContractDto must specify an ending date",
                    Constants.PROPERTY_REST_ERROR_SERVICE_CONTRACT_WITHOUT_END_DATE );
        }
    }

    public void checkClientApplicationDto( final ClientApplicationDto clientApplicationDto ) throws RequestFormatException
    {
        if ( clientApplicationDto == null )
        {
            throw new RequestFormatException( "Provided client is null", Constants.PROPERTY_REST_ERROR_CLIENT_APPLICATION_NULL );
        }

        if ( clientApplicationDto.getClientCode( ) == null )
        {
            throw new RequestFormatException( "Provided client must specify a client code",
                    Constants.PROPERTY_REST_ERROR_CLIENT_APPLICATION_WITHOUT_CLIENT_CODE );
        }
    }

    public void checkUpdatedIdentitySearchRequest( final UpdatedIdentitySearchRequest request ) throws RequestFormatException
    {
        if ( request == null || ( request.getDays( ) == null && request.getUpdatedAttributes( ).isEmpty( ) && request.getIdentityChangeTypes( ).isEmpty( ) ) )
        {
            throw new RequestFormatException( "Provided Updated Identity Search request is null or empty",
                    Constants.PROPERTY_REST_ERROR_UPDATED_IDENTITY_SEARCH_REQUEST_NULL_OR_EMPTY );
        }
        if ( request.getPage( ) != null && request.getPage( ) < 1 )
        {
            throw new RequestFormatException( "Pagination should start at index 1", Constants.PROPERTY_REST_PAGINATION_START_ERROR );
        }
        if ( request.getSize( ) != null && request.getSize( ) < 1 )
        {
            throw new RequestFormatException( "Page size should be of at least 1", Constants.PROPERTY_REST_PAGE_SIZE_ERROR );
        }
    }

    /**
     * Check whether the Identity Export Request is valid or not
     *
     * @param request
     *            the request
     * @throws RequestFormatException
     *             if the request is null or contains an empty or null CUID list
     */
    public void checkExportRequest( final IdentityExportRequest request ) throws RequestFormatException
    {
        if ( request == null || request.getCuidList( ) == null || request.getCuidList( ).isEmpty( ) )
        {
            throw new RequestFormatException( "Provided request is null or contains an empty CUID list",
                    Constants.PROPERTY_REST_ERROR_EXPORT_REQUEST_NULL_OR_EMPTY );
        }
    }
}
