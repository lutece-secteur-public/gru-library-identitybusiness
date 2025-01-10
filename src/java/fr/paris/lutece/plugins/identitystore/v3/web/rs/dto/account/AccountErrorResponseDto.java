package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

public abstract class AccountErrorResponseDto {
    protected String errorCode;
    protected String status;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountErrorResponseDto{" +
                "errorCode='" + errorCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
