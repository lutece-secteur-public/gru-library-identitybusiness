/*
 * Copyright (c) 2002-2023, City of Paris
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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.duplicate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.IStatusType;

import java.util.Arrays;
import java.util.Objects;

@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonFormat( shape = JsonFormat.Shape.OBJECT )
public enum DuplicateRuleSummarySearchStatusType implements IStatusType
{
    SUCCESS( 200 ),
    FAILURE( 403 ),
    NOT_FOUND( 404, "Aucune resource n'a été trouvée" );

    @JsonProperty( "code" )
    private int code;

    @JsonProperty( "message" )
    private String message;

    DuplicateRuleSummarySearchStatusType( final int code )
    {
        this.code = code;
        this.message = this.name( );
    }

    DuplicateRuleSummarySearchStatusType( int code, String message )
    {
        this.code = code;
        this.message = message;
    }

    @JsonCreator
    public static DuplicateRuleSummarySearchStatusType forValues( @JsonProperty( "code" ) int code, @JsonProperty( "message" ) String message )
    {
        return Arrays.stream( DuplicateRuleSummarySearchStatusType.values( ) )
                .filter( duplicateRuleSummarySearchStatusType -> Objects.equals( code, duplicateRuleSummarySearchStatusType.getCode( ) )
                        && Objects.equals( message, duplicateRuleSummarySearchStatusType.getMessage( ) ) )
                .findFirst( ).orElse( null );
    }

    @Override
    public int getCode( )
    {
        return code;
    }

    public void setCode( int code )
    {
        this.code = code;
    }

    @Override
    public String getMessage( )
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

}
