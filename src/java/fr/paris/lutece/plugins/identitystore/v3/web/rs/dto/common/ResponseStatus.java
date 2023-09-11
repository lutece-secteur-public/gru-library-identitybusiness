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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.beans.ConstructorProperties;

import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_CODE;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_MESSAGE;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_MESSAGE_KEY;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_NAME;

@JsonPropertyOrder( {
        KEY_CODE, KEY_NAME, KEY_MESSAGE, KEY_MESSAGE_KEY
} )
public class ResponseStatus
{

    private final int code;
    private final String name;
    private String message;
    private String messageKey;

    @ConstructorProperties( {
            "code", "name"
    } )
    private ResponseStatus( final int code, final String name )
    {
        this.code = code;
        this.name = name;
    }

    @JsonIgnore
    public static ResponseStatus ok( )
    {
        return new ResponseStatus( 200, "OK" );
    }

    @JsonIgnore
    public static ResponseStatus success( )
    {
        return new ResponseStatus( 201, "SUCCESS" );
    }

    @JsonIgnore
    public static ResponseStatus incompleteSuccess( )
    {
        return new ResponseStatus( 201, "INCOMPLETE_SUCCESS" );
    }

    @JsonIgnore
    public static ResponseStatus badRequest( )
    {
        return new ResponseStatus( 400, "BAD_REQUEST" );
    }

    @JsonIgnore
    public static ResponseStatus failure( )
    {
        return new ResponseStatus( 403, "FAILURE" );
    }

    @JsonIgnore
    public static ResponseStatus notFound( )
    {
        return new ResponseStatus( 404, "NOT_FOUND" );
    }

    @JsonIgnore
    public static ResponseStatus conflict( )
    {
        return new ResponseStatus( 409, "CONFLICT" );
    }

    @JsonIgnore
    public static ResponseStatus internalServerError( )
    {
        return new ResponseStatus( 500, "INTERNAL_SERVER_ERROR" );
    }

    @JsonProperty( value = KEY_CODE )
    public int getCode( )
    {
        return code;
    }

    @JsonProperty( value = KEY_NAME )
    public String getName( )
    {
        return name;
    }

    @JsonProperty( value = KEY_MESSAGE )
    public String getMessage( )
    {
        return message;
    }

    @JsonProperty( value = KEY_MESSAGE )
    public ResponseStatus setMessage( final String message )
    {
        this.message = message;
        return this;
    }

    @JsonProperty( value = KEY_MESSAGE_KEY )
    public String getMessageKey( )
    {
        return messageKey;
    }

    @JsonProperty( value = KEY_MESSAGE_KEY )
    public ResponseStatus setMessageKey( final String messageKey )
    {
        this.messageKey = messageKey;
        return this;
    }

    @Override
    public boolean equals( final Object o )
    {
        if ( !( o instanceof ResponseStatus ) )
        {
            return false;
        }
        final ResponseStatus other = (ResponseStatus) o;
        return this.code == other.code && this.name.equals( other.name );
    }
}
