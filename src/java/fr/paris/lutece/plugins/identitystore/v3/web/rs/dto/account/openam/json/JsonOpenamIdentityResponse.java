package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam.json;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.io.Serializable;

public abstract class JsonOpenamIdentityResponse extends ResponseDto implements Serializable
{
    private static final long serialVersionUID = -7811967393400814987L;
    private String _strStatus;

    /**
     *
     * @return the response status
     */
    public String getJsonOpenamIdentityStatus(  )
    {
        return _strStatus;
    }

    void setJsonOpenamIdentityStatus( String strStatus )
    {
        _strStatus = strStatus;
    }
}
