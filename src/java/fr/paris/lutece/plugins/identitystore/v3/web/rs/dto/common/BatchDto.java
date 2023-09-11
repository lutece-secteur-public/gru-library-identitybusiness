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
import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class BatchDto
{
    protected String reference;

    protected Date date;

    protected String user;

    @JsonIgnore
    protected String appCode;

    protected String comment;

    protected List<IdentityDto> identities = new ArrayList<>( );

    public String getReference( )
    {
        return reference;
    }

    public void setReference( String reference )
    {
        this.reference = reference;
    }

    public Date getDate( )
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public String getUser( )
    {
        return user;
    }

    public void setUser( String user )
    {
        this.user = user;
    }

    public String getAppCode( )
    {
        return appCode;
    }

    public void setAppCode( String appCode )
    {
        this.appCode = appCode;
    }

    public String getComment( )
    {
        return comment;
    }

    public void setComment( String comment )
    {
        this.comment = comment;
    }

    public List<IdentityDto> getIdentities( )
    {
        return identities;
    }

    public void setIdentities( List<IdentityDto> identities )
    {
        this.identities = identities;
    }
}
