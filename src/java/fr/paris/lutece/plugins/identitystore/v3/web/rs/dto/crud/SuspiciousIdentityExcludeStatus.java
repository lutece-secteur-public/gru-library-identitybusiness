package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud;

public enum SuspiciousIdentityExcludeStatus {

    EXCLUDE_SUCCESS("SUCCESS", 201),
    EXCLUDE_FAILURE("FAILURE", 403);

    private final String label;
    private final Integer code;

    SuspiciousIdentityExcludeStatus(String label, Integer code) {
        this.label = label;
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public Integer getCode() {
        return code;
    }
}
