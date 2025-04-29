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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AttributeChangeStatusType.ERROR;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AttributeChangeStatusType.SUCCESS;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AttributeChangeStatusType.WARNING;

@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonFormat( shape = JsonFormat.Shape.OBJECT )
public enum AttributeChangeStatus
{
    CREATED( "created", null, SUCCESS ),
    NOT_CREATED( "not_created", "This attribute was not created because of an invalid provided value.", ERROR ),
    UPDATED( "updated", null, SUCCESS ),
    REMOVED( "removed", null, SUCCESS ),
    NOT_REMOVED( "not_removed", "This mandatory attribute cannot be removed.", ERROR ),
    NOT_UPDATED( "not_updated", "This attribute already exists with the same value and certificate.", WARNING ),
    NOT_FOUND( "not_found", "This attribute does not exist in the repository.", ERROR ),
    INSUFFICIENT_CERTIFICATION_LEVEL( "insufficient_certification_level",
            "This attribute cannot be updated because the existing certification level is higher than the level of the process provided in the request.",
            ERROR ),
    INSUFFICIENT_RIGHTS( "insufficient_rights",
            "This attribute cannot be written because the associated process in the request does not match the contract definition.", ERROR ),
    UNAUTHORIZED( "unauthorized", "This attribute is not writable in service contract definition", ERROR ),
    UNKNOWN_GEOCODES_CODE( "unknown_geocodes_code", "The provided code was not found in the Geocodes repository.", ERROR ),
    UNKNOWN_GEOCODES_LABEL( "unknown_geocodes_label", "The provided label was not found in the Geocodes repository.", ERROR ),
    MULTIPLE_GEOCODES_RESULTS_FOR_LABEL( "multiple_geocodes_results_for_label",
            "The provided label correspond to multiple results in Geocodes. Please specify by providing the code.", ERROR ),
    MULTIPLE_GEOCODES_RESULTS_FOR_CODE( "multiple_geocodes_results_for_code",
            "The provided code correspond to multiple results in Geocodes. Please specify by providing the date.", ERROR ),
    OVERRIDDEN_GEOCODES_LABEL( "overridden_geocodes_label",
            "The provided label was not corresponding to the provided code, and has been overridden with the correct Geocodes label.", SUCCESS ),
    INVALID_VALUE( "invalid_value", "This attribute value doesn't match its validation pattern.", ERROR ),
    FORMATTED_VALUE( "formatted_value", "This attribute value has been formatted before treatment.", WARNING ),
    UNCERTIFIED( "uncertified", null, SUCCESS );

    @JsonIgnore
    private static final List<AttributeChangeStatus> SUCCESS_STATUSES = Arrays.stream( values( ) ).filter( s -> s.type == SUCCESS )
            .collect( Collectors.toList( ) );

    @JsonProperty( "code" )
    private String code;

    @JsonProperty( "message" )
    private String message;

    @JsonProperty( "type" )
    private AttributeChangeStatusType type;

    AttributeChangeStatus( final String status, final String message, final AttributeChangeStatusType type )
    {
        this.code = status;
        this.message = message;
        this.type = type;
    }

    @JsonCreator
    public static AttributeChangeStatus forValues( @JsonProperty( "code" ) String code, @JsonProperty( "message" ) String message )
    {
        return Arrays.stream( AttributeChangeStatus.values( ) ).filter( attributeChangeStatus -> Objects.equals( code, attributeChangeStatus.getCode( ) )
                && Objects.equals( message, attributeChangeStatus.getMessage( ) ) ).findFirst( ).orElse( null );
    }

    public String getCode( )
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    public String getMessage( )
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    public AttributeChangeStatusType getType( )
    {
        return type;
    }

    public void setType( final AttributeChangeStatusType type )
    {
        this.type = type;
    }

    @JsonIgnore
    public static List<AttributeChangeStatus> getSuccessStatuses( )
    {
        return SUCCESS_STATUSES;
    }

}
