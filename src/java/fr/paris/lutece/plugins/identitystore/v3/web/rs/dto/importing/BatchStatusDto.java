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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.importing;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchStatusDto
{
    @JsonProperty( "reference" )
    protected String reference;

    @JsonProperty( "client_code" )
    protected String clientCode;

    @JsonProperty( "user" )
    protected String user;

    @JsonProperty( "comment" )
    protected String comment;

    @JsonProperty( "creation_date" )
    protected Date creationDate;

    @JsonProperty( "status" )
    protected String status;

    @JsonProperty( "status_description" )
    protected String statusDescription;

    @JsonProperty( "statistics" )
    protected BatchStatisticsDto statistics;

    @JsonProperty( "batch_history" )
    protected List<ImportingHistoryDto> batchHistory = new ArrayList<>( );

    @JsonProperty( "identities" )
    protected List<CandidateIdentityDto> identities = new ArrayList<>( );

    public String getReference( )
    {
        return reference;
    }

    public void setReference( final String reference )
    {
        this.reference = reference;
    }

    public String getStatus( )
    {
        return status;
    }

    public void setStatus( final String status )
    {
        this.status = status;
    }

    public String getUser( )
    {
        return user;
    }

    public void setUser( String user )
    {
        this.user = user;
    }

    public String getComment( )
    {
        return comment;
    }

    public void setComment( String comment )
    {
        this.comment = comment;
    }

    public String getClientCode( )
    {
        return clientCode;
    }

    public void setClientCode( String clientCode )
    {
        this.clientCode = clientCode;
    }

    public String getStatusDescription( )
    {
        return statusDescription;
    }

    public void setStatusDescription( final String statusDescription )
    {
        this.statusDescription = statusDescription;
    }

    public BatchStatisticsDto getStatistics( )
    {
        return statistics;
    }

    public void setStatistics( BatchStatisticsDto statistics )
    {
        this.statistics = statistics;
    }

    public Date getCreationDate( )
    {
        return creationDate;
    }

    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
    }

    public List<ImportingHistoryDto> getBatchHistory( )
    {
        return batchHistory;
    }

    public List<CandidateIdentityDto> getIdentities( )
    {
        return identities;
    }
}
