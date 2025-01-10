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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.duplicate.IdentityDuplicateDefinition;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class IdentityDto
{
    /**
     * Le connection_id (= guid)(optionnel)(+ contrôle d'existence dans RHSSO)(ajout dans le contrat de service le droit de modif)
     */
    @JsonProperty( "connection_id" )
    protected String connectionId;

    /**
     * l'identifiant de l'identité => uniquement en cas de modif
     */
    @JsonProperty( "customer_id" )
    protected String customerId;

    /**
     * L'identifiant de l'identité dans le référentiel du client
     */
    @JsonProperty( Constants.PARAM_EXTERNAL_ID_CUSTOMER )
    protected String externalCustomerId;

    /**
     * Flag indiquant que cette identité est lié à un compte MonParis actif
     */
    @JsonProperty( "mon_paris_active" )
    protected Boolean monParisActive;

    /**
     * Creation date
     */
    @JsonProperty( "creation_date" )
    protected Timestamp creationDate;

    /**
     * La date de dernière modification de l'identité.
     */
    @JsonProperty( "last_update_date" )
    protected Timestamp lastUpdateDate;

    /**
     * Bloc optionnel définissant le niveau de qualité de l'identité
     */
    @JsonProperty( "quality" )
    protected QualityDefinition quality;

    /**
     * Bloc optionnel définissant l'expiration de l'identité
     */
    @JsonProperty( "expiration" )
    protected ExpirationDefinition expiration;

    /**
     * Bloc optionnel définissant si et comment l'identité a été fusionnée
     */
    @JsonProperty( "merge" )
    protected MergeDefinition merge;

    /**
     * Bloc optionnel indiquant les identités ayant été rapprochées de celle-ci.
     */
    @JsonProperty( "consolidate" )
    protected ConsolidateDefinition consolidate;

    /**
     * Bloc optionnel indiquant si et comment l'identité est impliquée dans une suspicion de doublons
     */
    protected IdentityDuplicateDefinition duplicateDefinition;

    /**
     * Propriété renseignée lors d'une recherche de doublons potentiels. Si cette identité fait partie des résultats de la recherche, ce champ contiendra le
     * code de la règle de détection de doublon ayant matché.
     */
    @JsonProperty( "matched_duplicate_rule_code" )
    protected String matchedDuplicateRuleCode;

    /**
     * Flag indiquant si l'identité figure dans les doublons suspectés
     */
    @JsonProperty( "suspicious" )
    protected Boolean suspicious;

    /**
     * Liste des attributs décrivant l'identité
     */
    @JsonProperty( "attributes" )
    protected List<AttributeDto> attributes = new ArrayList<>( );

    @JsonIgnore
    public boolean isMerged( )
    {
        return this.getMerge( ) != null && this.getMerge( ).isMerged( );
    }

    @JsonIgnore
    public boolean isNotMerged( )
    {
        return this.getMerge( ) == null || !this.getMerge( ).isMerged( );
    }

    @JsonIgnore
    public boolean isDeleted( )
    {
        return this.getExpiration( ) != null && this.getExpiration( ).isDeleted( );
    }

    public String getConnectionId( )
    {
        return connectionId;
    }

    public void setConnectionId( String connectionId )
    {
        this.connectionId = connectionId;
    }

    public String getCustomerId( )
    {
        return customerId;
    }

    public void setCustomerId( String customerId )
    {
        this.customerId = customerId;
    }

    public String getExternalCustomerId( )
    {
        return externalCustomerId;
    }

    public void setExternalCustomerId( String externalCustomerId )
    {
        this.externalCustomerId = externalCustomerId;
    }

    public Boolean getMonParisActive( )
    {
        return monParisActive;
    }

    @JsonIgnore
    public boolean isMonParisActive( )
    {
        return Objects.equals( this.getMonParisActive( ), Boolean.TRUE );
    }

    public void setMonParisActive( Boolean monParisActive )
    {
        this.monParisActive = monParisActive;
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

    public QualityDefinition getQuality( )
    {
        return quality;
    }

    public void setQuality( QualityDefinition quality )
    {
        this.quality = quality;
    }

    public ExpirationDefinition getExpiration( )
    {
        return expiration;
    }

    public void setExpiration( ExpirationDefinition expiration )
    {
        this.expiration = expiration;
    }

    public MergeDefinition getMerge( )
    {
        return merge;
    }

    public void setMerge( MergeDefinition merge )
    {
        this.merge = merge;
    }

    public ConsolidateDefinition getConsolidate( )
    {
        return consolidate;
    }

    public void setConsolidate( final ConsolidateDefinition consolidate )
    {
        this.consolidate = consolidate;
    }

    public IdentityDuplicateDefinition getDuplicateDefinition( )
    {
        return duplicateDefinition;
    }

    public void setDuplicateDefinition( IdentityDuplicateDefinition duplicateDefinition )
    {
        this.duplicateDefinition = duplicateDefinition;
    }

    public String getMatchedDuplicateRuleCode( )
    {
        return matchedDuplicateRuleCode;
    }

    public void setMatchedDuplicateRuleCode( final String matchedDuplicateRuleCode )
    {
        this.matchedDuplicateRuleCode = matchedDuplicateRuleCode;
    }

    public Boolean isSuspicious( )
    {
        return suspicious;
    }

    public void setSuspicious( Boolean suspicious )
    {
        this.suspicious = suspicious;
    }

    public List<AttributeDto> getAttributes( )
    {
        return attributes;
    }

    public void setAttributes( List<AttributeDto> attributes )
    {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "IdentityDto{" +
                "connectionId='" + connectionId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", externalCustomerId='" + externalCustomerId + '\'' +
                ", monParisActive=" + monParisActive +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", quality=" + quality +
                ", expiration=" + expiration +
                ", merge=" + merge +
                ", consolidate=" + consolidate +
                ", duplicateDefinition=" + duplicateDefinition +
                ", matchedDuplicateRuleCode='" + matchedDuplicateRuleCode + '\'' +
                ", suspicious=" + suspicious +
                ", attributes=" + attributes +
                '}';
    }
}
