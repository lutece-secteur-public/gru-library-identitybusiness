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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AuthorType;

import java.sql.Timestamp;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class AttributeChange extends Change
{
    @JsonProperty( "id" )
    protected Integer id;

    @JsonProperty( "change_type" )
    protected AttributeChangeType changeType;

    @JsonProperty( "change_satus" )
    protected String changeSatus;

    @JsonProperty( "change_message" )
    protected String changeMessage;

    @JsonProperty( "author_type" )
    protected AuthorType authorType;

    @JsonProperty( "author_name" )
    protected String authorName;

    @JsonProperty( "client_code" )
    protected String clientCode;

    @JsonProperty( "id_identity" )
    protected int idIdentity;

    @JsonProperty( "attribute_key" )
    protected String attributeKey;

    @JsonProperty( "attribute_value" )
    protected String attributeValue;

    @JsonProperty( "certification_processus" )
    protected String certificationProcessus;

    @JsonProperty( "certification_date" )
    protected Timestamp certificationDate;

    @JsonProperty( "modification_date" )
    protected Timestamp modificationDate;

    public Integer getId( )
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public AttributeChangeType getChangeType( )
    {
        return changeType;
    }

    public void setChangeType( AttributeChangeType changeType )
    {
        this.changeType = changeType;
    }

    public String getChangeSatus( )
    {
        return changeSatus;
    }

    public void setChangeSatus( String changeSatus )
    {
        this.changeSatus = changeSatus;
    }

    public String getChangeMessage( )
    {
        return changeMessage;
    }

    public void setChangeMessage( String changeMessage )
    {
        this.changeMessage = changeMessage;
    }

    public AuthorType getAuthorType( )
    {
        return authorType;
    }

    public void setAuthorType( AuthorType authorType )
    {
        this.authorType = authorType;
    }

    public String getAuthorName( )
    {
        return authorName;
    }

    public void setAuthorName( String authorName )
    {
        this.authorName = authorName;
    }

    public String getClientCode( )
    {
        return clientCode;
    }

    public void setClientCode( String clientCode )
    {
        this.clientCode = clientCode;
    }

    public int getIdIdentity( )
    {
        return idIdentity;
    }

    public void setIdIdentity( int idIdentity )
    {
        this.idIdentity = idIdentity;
    }

    public String getAttributeKey( )
    {
        return attributeKey;
    }

    public void setAttributeKey( String attributeKey )
    {
        this.attributeKey = attributeKey;
    }

    public String getAttributeValue( )
    {
        return attributeValue;
    }

    public void setAttributeValue( String attributeValue )
    {
        this.attributeValue = attributeValue;
    }

    public String getCertificationProcessus( )
    {
        return certificationProcessus;
    }

    public void setCertificationProcessus( String certificationProcessus )
    {
        this.certificationProcessus = certificationProcessus;
    }

    public Timestamp getCertificationDate( )
    {
        return certificationDate;
    }

    public void setCertificationDate( Timestamp certificationDate )
    {
        this.certificationDate = certificationDate;
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
