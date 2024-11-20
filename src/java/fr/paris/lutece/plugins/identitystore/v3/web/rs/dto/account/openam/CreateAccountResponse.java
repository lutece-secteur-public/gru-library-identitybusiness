package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

public class CreateAccountResponse extends ResponseDto
{
    private String _strUid;
    private String _strTokenId;

    public CreateAccountResponse( String strGuid, String strTokenId )
    {
        this._strUid = strGuid;
        this._strTokenId = strTokenId;
    }

    public CreateAccountResponse(  )
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
}
