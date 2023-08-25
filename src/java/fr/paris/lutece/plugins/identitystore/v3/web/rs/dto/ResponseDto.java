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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.IStatusType;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseStatus;

import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_I18N_MESSAGE_KEY;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_LOCALIZED_MESSAGE;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_MESSAGE;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_RESPONSE;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_STATUS;

/**
 *
 * Response Dto
 *
 */
@JsonRootName( value = KEY_RESPONSE )
@JsonPropertyOrder( {
        KEY_STATUS, KEY_MESSAGE, KEY_I18N_MESSAGE_KEY
} )
@JsonFormat( shape = JsonFormat.Shape.OBJECT )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class ResponseDto<S extends IStatusType>
{
    @JsonIgnore
    protected S _status;

    protected ResponseStatus _responseStatus;
    protected String _strMessage;
    protected String _strI18nMessageKey;
    protected String _strLocalizedMessage;

    /**
     * @return the _status
     */
    @JsonIgnore
    public S getStatus( )
    {
        return _status;
    }

    /**
     * @param status
     *            the _status to set
     */
    @JsonIgnore
    public void setStatus( S status )
    {
        this._status = status;
        this._responseStatus = ResponseStatus.from( status );
    }

    /**
     * @return the _responseStatus
     */
    @JsonProperty( value = KEY_STATUS )
    public ResponseStatus getResponseStatus( )
    {
        return _responseStatus;
    }

    /**
     * @param _responseStatus
     *            the _responseStatus to set
     */
    @JsonProperty( value = KEY_STATUS )
    public void setResponseStatus( ResponseStatus _responseStatus )
    {
        this._responseStatus = _responseStatus;
    }

    /**
     * @return the _strMessage
     */
    @JsonProperty( value = KEY_MESSAGE )
    public String getMessage( )
    {
        return _strMessage;
    }

    /**
     * @param strMessage
     *            the strMessage to set
     */
    @JsonProperty( value = KEY_MESSAGE )
    public void setMessage( String strMessage )
    {
        this._strMessage = strMessage;
    }

    /**
     * @return the _strI18nMessageKey
     */
    @JsonProperty( value = KEY_I18N_MESSAGE_KEY )
    public String getI18nMessageKey( )
    {
        return _strI18nMessageKey;
    }

    /**
     * @param _strI18nMessageKey
     *            the _strI18nMessageKey to set
     */
    @JsonProperty( value = KEY_I18N_MESSAGE_KEY )
    public void setI18nMessageKey( String _strI18nMessageKey )
    {
        this._strI18nMessageKey = _strI18nMessageKey;
    }

    /**
     * @return the _strLocalizedMessage
     */
    @JsonProperty( value = KEY_LOCALIZED_MESSAGE )
    public String getLocalizedMessage( )
    {
        return _strLocalizedMessage;
    }

    /**
     * @param _strLocalizedMessage
     *            the _strLocalizedMessage to set
     */
    @JsonProperty( value = KEY_LOCALIZED_MESSAGE )
    public void setLocalizedMessage( String _strLocalizedMessage )
    {
        this._strLocalizedMessage = _strLocalizedMessage;
    }
}
