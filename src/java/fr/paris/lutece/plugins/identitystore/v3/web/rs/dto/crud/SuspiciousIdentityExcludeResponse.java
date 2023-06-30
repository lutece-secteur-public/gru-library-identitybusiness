package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuspiciousIdentityExcludeResponse {

    @JsonProperty("status")
    private SuspiciousIdentityExcludeStatus status;

    @JsonProperty("message")
    private String message;

    public SuspiciousIdentityExcludeStatus getStatus() {
        return status;
    }

    public void setStatus(SuspiciousIdentityExcludeStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
