package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FederationLinkDto
{
    public FederationLinkDto() {
        super();
    }

    private String _strGuid;
    private String _strIdentityProvider;
    private String _strIdentityId;
    private String _strIdentityName;


    public FederationLinkDto( String strGuid, String strIdentityProvider, String strIdentityId, String strIdentityName )
    {
        super( );
        this._strGuid = strGuid;
        this._strIdentityProvider = strIdentityProvider;
        this._strIdentityId = strIdentityId;
        this._strIdentityName = strIdentityName;
    }

    @JsonProperty( "uid" )
    public String getGuid( )
    {
        return _strGuid;
    }

    public void setGuid( String _strGuid )
    {
        this._strGuid = _strGuid;
    }

    public String getIdentityProvider( )
    {
        return _strIdentityProvider;
    }

    public void setIdentityProvider( String _strIdentityProvider )
    {
        this._strIdentityProvider = _strIdentityProvider;
    }

    public String getIdentityId( )
    {
        return _strIdentityId;
    }

    public void setIdentityId( String _strIdentityId )
    {
        this._strIdentityId = _strIdentityId;
    }

    public String getIdentityName( )
    {
        return _strIdentityName;
    }

    public void setIdentityName( String _strIdentityName )
    {
        this._strIdentityName = _strIdentityName;
    }

    @Override
    public String toString() {
        return "FederationLinkDto{" +
                "_strGuid='" + _strGuid + '\'' +
                ", _strIdentityProvider='" + _strIdentityProvider + '\'' +
                ", _strIdentityId='" + _strIdentityId + '\'' +
                ", _strIdentityName='" + _strIdentityName + '\'' +
                '}';
    }
}
