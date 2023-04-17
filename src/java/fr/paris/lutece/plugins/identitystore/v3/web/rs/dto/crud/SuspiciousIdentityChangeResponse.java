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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
<<<<<<< HEAD
=======
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AttributeStatus;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search.DuplicateDto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
>>>>>>> #244:[Service dédoublonnage interne] API POST suggestion de doublon

/**
 * DTO contenant la réponse à une requête de création d'un suspicion identité
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class SuspiciousIdentityChangeResponse
{

    @JsonProperty( "status" )
    protected IdentityChangeStatus status;

    @JsonProperty( "message" )
    protected String message;

<<<<<<< HEAD
    @JsonProperty( "suspicious_identity" )
    protected SuspiciousIdentityDto suspiciousIdentity;
=======
    @JsonProperty( "customer_id" )
    protected String customerId;

    @JsonProperty( "duplicate_rule_id" )
    protected int duplicateRuleID;

    @JsonProperty( "creation_date" )
    protected Timestamp creationDate;

    @JsonProperty( "last_update_date" )
    protected Timestamp lastUpdateDate;

>>>>>>> #244:[Service dédoublonnage interne] API POST suggestion de doublon

    public IdentityChangeStatus getStatus( )
    {
        return status;
    }

    public void setStatus( IdentityChangeStatus status )
    {
        this.status = status;
    }

    public String getMessage( )
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

<<<<<<< HEAD
    public SuspiciousIdentityDto getSuspiciousIdentity( )
    {
        return suspiciousIdentity;
    }

    public void setSuspiciousIdentity( SuspiciousIdentityDto suspiciousIdentity )
    {
        this.suspiciousIdentity = suspiciousIdentity;
=======
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

    public int getDuplicateRuleID() {
        return duplicateRuleID;
    }

    public void setDuplicateRuleID(int duplicateRuleID) {
        this.duplicateRuleID = duplicateRuleID;
>>>>>>> #244:[Service dédoublonnage interne] API POST suggestion de doublon
    }
}
