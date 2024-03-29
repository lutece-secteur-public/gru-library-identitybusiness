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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class SuspiciousIdentityDto
{

    /**
     * duplicate rule ID that detected this suspicious identity
     */
    @JsonProperty( "duplicate_rule_code" )
    protected String duplicationRuleCode;

    /**
     * customer ID
     */
    @JsonProperty( "customer_id" )
    protected String customerId;

    /**
     * Creation date
     */
    @JsonProperty( "creation_date" )
    protected Timestamp creationDate;

    /**
     * Last update date
     */
    @JsonProperty( "last_update_date" )
    protected Timestamp lastUpdateDate;

    /**
     * Lock
     */
    @JsonProperty( "lock" )
    protected SuspiciousIdentityLockDto lock;

    /**
     * Metadata
     */
    @JsonProperty( "metadata" )
    protected Map<String, String> metadata = new HashMap<>( );

    public String getDuplicationRuleCode( )
    {
        return duplicationRuleCode;
    }

    public void setDuplicationRuleCode( String duplicationRuleCode )
    {
        this.duplicationRuleCode = duplicationRuleCode;
    }

    public String getCustomerId( )
    {
        return customerId;
    }

    public void setCustomerId( String customerId )
    {
        this.customerId = customerId;
    }

    public Timestamp getCreationDate( )
    {
        return creationDate;
    }

    public void setCreationDate( Timestamp creationDate )
    {
        this.creationDate = creationDate;
    }

    public Timestamp getLastUpdateDate( )
    {
        return lastUpdateDate;
    }

    public void setLastUpdateDate( Timestamp lastUpdateDate )
    {
        this.lastUpdateDate = lastUpdateDate;
    }

    public SuspiciousIdentityLockDto getLock( )
    {
        return lock;
    }

    public void setLock( SuspiciousIdentityLockDto lock )
    {
        this.lock = lock;
    }

    public Map<String, String> getMetadata( )
    {
        return metadata;
    }

    public void setMetadata( Map<String, String> metadata )
    {
        this.metadata = metadata;
    }
}
