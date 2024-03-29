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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class IdentityHistorySearchRequest
{
    @JsonProperty( "client_code" )
    protected String _strClientCode;

    @JsonProperty( "customer_id" )
    protected String _strCustomerId;

    @JsonProperty( "author_name" )
    protected String _strAuthorName;

    @JsonProperty( "change_type" )
    protected IdentityChangeType _identityChangeType;

    @JsonProperty( "change_status" )
    protected String _strChangeStatus;

    @JsonProperty( "metadata" )
    protected Map<String, String> metadata = new HashMap<>( );

    @JsonProperty( "nb_days_from" )
    protected Integer _nbDaysFrom;

    @JsonProperty( "modification_date_interval_start" )
    protected Date _dateModificationDateIntervalStart;

    @JsonProperty( "modification_date_interval_end" )
    protected Date _dateModificationDateIntervalEnd;

    public String getClientCode( )
    {
        return _strClientCode;
    }

    public void setClientCode( String _strClientCode )
    {
        this._strClientCode = _strClientCode;
    }

    public String getCustomerId( )
    {
        return _strCustomerId;
    }

    public void setCustomerId( String _strCustomerId )
    {
        this._strCustomerId = _strCustomerId;
    }

    public String getAuthorName( )
    {
        return _strAuthorName;
    }

    public void setAuthorName( String _strAuthorName )
    {
        this._strAuthorName = _strAuthorName;
    }

    public IdentityChangeType getIdentityChangeType( )
    {
        return _identityChangeType;
    }

    public void setIdentityChangeType( IdentityChangeType _identityChangeType )
    {
        this._identityChangeType = _identityChangeType;
    }

    public String getChangeStatus( )
    {
        return _strChangeStatus;
    }

    public void setChangeStatus( final String changeStatus )
    {
        this._strChangeStatus = changeStatus;
    }

    public Map<String, String> getMetadata( )
    {
        return metadata;
    }

    public void setMetadata( Map<String, String> metadata )
    {
        this.metadata = metadata;
    }

    public Integer getNbDaysFrom( )
    {
        return _nbDaysFrom;
    }

    public void setNbDaysFrom( Integer _nbDaysFrom )
    {
        this._nbDaysFrom = _nbDaysFrom;
    }

    public Date getModificationDateIntervalStart( )
    {
        return _dateModificationDateIntervalStart;
    }

    public void setModificationDateIntervalStart( final Date modificationDateIntervalStart )
    {
        this._dateModificationDateIntervalStart = modificationDateIntervalStart;
    }

    public Date getModificationDateIntervalEnd( )
    {
        return _dateModificationDateIntervalEnd;
    }

    public void setModificationDateIntervalEnd( final Date modificationDateIntervalEnd )
    {
        this._dateModificationDateIntervalEnd = modificationDateIntervalEnd;
    }
}
