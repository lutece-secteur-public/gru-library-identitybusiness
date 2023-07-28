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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.merge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ChangeRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.RequestAuthor;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud.Identity;

import java.sql.Timestamp;

@JsonRootName( "identity_merge" )
public class IdentityMergeRequest extends ChangeRequest
{
    @JsonProperty( "primary_customer_id" )
    protected String primaryCuid;

    @JsonProperty( "primary_last_update_date" )
    protected Timestamp primaryLastUpdateDate;

    @JsonProperty( "secondary_customer_id" )
    protected String secondaryCuid;

    @JsonProperty( "secondary_last_update_date" )
    protected Timestamp secondaryLastUpdateDate;

    @JsonProperty( "identity" )
    protected Identity identity;

    public String getPrimaryCuid( )
    {
        return primaryCuid;
    }

    public void setPrimaryCuid( String primaryCuid )
    {
        this.primaryCuid = primaryCuid;
    }

    public Timestamp getPrimaryLastUpdateDate( )
    {
        return primaryLastUpdateDate;
    }

    public void setPrimaryLastUpdateDate( Timestamp primaryLastUpdateDate )
    {
        this.primaryLastUpdateDate = primaryLastUpdateDate;
    }

    public String getSecondaryCuid( )
    {
        return secondaryCuid;
    }

    public void setSecondaryCuid( String secondaryCuid )
    {
        this.secondaryCuid = secondaryCuid;
    }

    public Timestamp getSecondaryLastUpdateDate( )
    {
        return secondaryLastUpdateDate;
    }

    public void setSecondaryLastUpdateDate( Timestamp secondaryLastUpdateDate )
    {
        this.secondaryLastUpdateDate = secondaryLastUpdateDate;
    }

    public Identity getIdentity( )
    {
        return identity;
    }

    public void setIdentity( Identity identity )
    {
        this.identity = identity;
    }
}
