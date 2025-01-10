package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

public class ChangeAccountResult
{
    private String _strUid;
    private String _strTokenId;

    public ChangeAccountResult(String strGuid, String strTokenId )
    {
        this._strUid = strGuid;
        this._strTokenId = strTokenId;
    }

    public ChangeAccountResult(  )
    {
    }

    public String getUid(  )
    {
        return _strUid;
    }

    public void setUid( String _strGuid )
    {
        this._strUid = _strGuid;
    }

    public String getTokenId(  )
    {
        return _strTokenId;
    }

    public void setTokenId( String _strTokenId )
    {
        this._strTokenId = _strTokenId;
    }

    @Override
    public String toString() {
        return "CreateAccountResult{" +
                "_strUid='" + _strUid + '\'' +
                ", _strTokenId='" + _strTokenId + '\'' +
                '}';
    }
}
