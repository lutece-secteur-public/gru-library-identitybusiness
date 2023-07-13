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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.RequestAuthor;

import java.sql.Timestamp;

public class IdentityChange
{

    @JsonProperty( "change_type" )
    protected String changeType;

    @JsonProperty( "change_status" )
    protected String changeStatus;

    @JsonProperty( "author" )
    protected RequestAuthor author;

    @JsonProperty( "change_message" )
    protected String changeMessage;

    @JsonProperty( "client_code" )
    protected String clientCode;

    @JsonProperty( "modification_date" )
    protected Timestamp modificationDate;

    public String getChangeType( )
    {
        return changeType;
    }

    public void setChangeType( String changeType )
    {
        this.changeType = changeType;
    }

    public String getChangeStatus( )
    {
        return changeStatus;
    }

    public void setChangeStatus( String changeStatus )
    {
        this.changeStatus = changeStatus;
    }

    public RequestAuthor getAuthor( )
    {
        return author;
    }

    public void setAuthor( RequestAuthor author )
    {
        this.author = author;
    }

    public String getChangeMessage( )
    {
        return changeMessage;
    }

    public void setChangeMessage( String changeMessage )
    {
        this.changeMessage = changeMessage;
    }

    public String getClientCode( )
    {
        return clientCode;
    }

    public void setClientCode( String clientCode )
    {
        this.clientCode = clientCode;
    }

    public Timestamp getModificationDate( )
    {
        return modificationDate;
    }

    public void setModificationDate( Timestamp modificationDate )
    {
        this.modificationDate = modificationDate;
    }
}
