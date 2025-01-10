package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDto
{
    private String _strUid;
    private String _strLogin;
    private String _strStatus;
    private String _strCreationDate;
    private String _strModificationDate;
    private String _strValidated;
    private boolean _bLocked;
    private String _strAuthTimestamp;
    private String _strModificationPasswordDate;

    public String getUid(  )
    {
        return _strUid;
    }

    public void setUid( String _strGuid )
    {
        this._strUid = _strGuid;
    }
    @JsonProperty("mail")
    public String getLogin(  )
    {
        return _strLogin;
    }
    @JsonProperty("mail")
    public void setLogin( String strLogin )
    {
        this._strLogin = strLogin;
    }

    @JsonProperty("inetUserStatus")
    public String getAccountStatus(  )
    {
        return _strStatus;
    }
    @JsonProperty("inetUserStatus")
    public void setAccountStatus( String strStatus )
    {
        this._strStatus = strStatus;
    }

    @JsonProperty("validatedAccount")
    public String getValidated(  )
    {
        return _strValidated;
    }
    @JsonProperty("validatedAccount")
    public void setValidated( String strValidated )
    {
        this._strValidated = strValidated;
    }

    public String getCreationDate(  )
    {
        return _strCreationDate;
    }

    public void setCreationDate( String _strCreationDate )
    {
        this._strCreationDate = _strCreationDate;
    }

    public String getModificationDate(  )
    {
        return _strModificationDate;
    }

    public void setModificationDate( String strModificationDate )
    {
        this._strModificationDate = strModificationDate;
    }

    /**
     * @return the _bLocked
     */
    public boolean isLocked( )
    {
        return _bLocked;
    }

    /**
     * @param bLocked the _bLocked to set
     */
    public void setLocked( boolean bLocked )
    {
        this._bLocked = bLocked;
    }

    /**
     * @return the _strAuthTimestamp
     */
    @JsonProperty("authTimestamp")
    public String getAuthTimestamp( )
    {
        return _strAuthTimestamp;
    }

    /**
     * @param strAuthTimestamp the _strAuthTimestamp to set
     */
    @JsonProperty("authTimestamp")
    public void setAuthTimestamp( String strAuthTimestamp )
    {
        this._strAuthTimestamp = strAuthTimestamp;
    }

    /**
     * @return the _strModificationPasswordDate
     */
    @JsonProperty("modificationPasswordDate")
    public String getModificationPasswordDate( )
    {
        return _strModificationPasswordDate;
    }

    /**
     * @param strModificationPasswordDate the _strModificationPasswordDate to set
     */
    @JsonProperty("modificationPasswordDate")
    public void setModificationPasswordDate( String strModificationPasswordDate )
    {
        this._strModificationPasswordDate = strModificationPasswordDate;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "_strUid='" + _strUid + '\'' +
                ", _strLogin='" + _strLogin + '\'' +
                ", _strStatus='" + _strStatus + '\'' +
                ", _strCreationDate='" + _strCreationDate + '\'' +
                ", _strModificationDate='" + _strModificationDate + '\'' +
                ", _strValidated='" + _strValidated + '\'' +
                ", _bLocked=" + _bLocked +
                ", _strAuthTimestamp='" + _strAuthTimestamp + '\'' +
                ", _strModificationPasswordDate='" + _strModificationPasswordDate + '\'' +
                '}';
    }
}
