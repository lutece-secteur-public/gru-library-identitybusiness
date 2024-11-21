package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam.json;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam.SearchListAccountResult;

public class JsonSearchListAccountResult extends JsonOpenamIdentityResponse
{
    /**
     *
     */
    private static final long serialVersionUID = 2555207641367930888L;
    private SearchListAccountResult _result;

    public SearchListAccountResult getResult(  )
    {
        return _result;
    }

    public void setResult( SearchListAccountResult _result )
    {
        this._result = _result;
    }
}