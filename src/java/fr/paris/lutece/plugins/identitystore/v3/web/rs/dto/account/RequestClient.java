package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

public class RequestClient {
    private String _clientId;
    private String _clientSecret;

    public String getClientId() {
        return _clientId;
    }

    public void setClientId(String clientId) {
        this._clientId = clientId;
    }

    public String getClientSecret() {
        return _clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this._clientSecret = clientSecret;
    }

    @Override
    public String toString() {
        return "RequestClient{" +
                "_clientId='" + _clientId + '\'' +
                ", _clientSecret='" + _clientSecret + '\'' +
                '}';
    }
}
