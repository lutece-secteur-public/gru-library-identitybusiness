package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.RequestAuthor;

/**
 * DTO contenant les elements pour exclure deux identités des suspicions de doublons
 */
public class SuspiciousIdentityExcludeRequest {

    /**
     * Signature de l'envoi
     */
    @JsonProperty( "origin" )
    private RequestAuthor origin;

    /**
     * CUID 1
     */
    @JsonProperty("identity_cuid_1")
    private String identityCuid1;

    /**
     * CUID 2
     */
    @JsonProperty("identity_cuid_2")
    private String identityCuid2;

    /**
     * ID of the duplicate rule
     */
    @JsonProperty("rule_id")
    private Integer ruleId;

    public RequestAuthor getOrigin() {
        return origin;
    }

    public void setOrigin(RequestAuthor origin) {
        this.origin = origin;
    }

    public String getIdentityCuid1() {
        return identityCuid1;
    }

    public void setIdentityCuid1(String identityCuid1) {
        this.identityCuid1 = identityCuid1;
    }

    public String getIdentityCuid2() {
        return identityCuid2;
    }

    public void setIdentityCuid2(String identityCuid2) {
        this.identityCuid2 = identityCuid2;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }
}
