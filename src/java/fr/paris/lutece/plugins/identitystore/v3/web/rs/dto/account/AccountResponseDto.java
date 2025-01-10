package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_ERROR_CODE;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_RESULT;
import static fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.DtoFormatConstants.KEY_STATUS;

@JsonInclude( JsonInclude.Include.NON_NULL )
public abstract class AccountResponseDto <T> {
    @JsonProperty( value = KEY_RESULT )
    protected T _result;

    @JsonProperty( value = KEY_STATUS )
    private String _strStatus;

    @JsonProperty( value = KEY_ERROR_CODE )
    private String _strErrorCode;

    public T getResult() {
        return _result;
    }

    public void setResult(T _result) {
        this._result = _result;
    }

    public String getStatus() {
        return _strStatus;
    }

    public void setStatus(String _strStatus) {
        this._strStatus = _strStatus;
    }

    public String getErrorCode() {
        return _strErrorCode;
    }

    public void setErrorCode(String _strErrorCode) {
        this._strErrorCode = _strErrorCode;
    }

    @Override
    public String toString() {
        return "AccountResponseDto{" +
                "_result=" + _result +
                ", _strStatus='" + _strStatus + '\'' +
                ", _strErrorCode='" + _strErrorCode + '\'' +
                '}';
    }
}
