package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.List;

public class SearchListIdentityResult extends ResponseDto
{
    private List<IdentityOpenAMDto> _listIdentities;

    public List<IdentityOpenAMDto> getIdentities(  )
    {
        return _listIdentities;
    }

    public void setIdentities( List<IdentityOpenAMDto> _listIdentities )
    {
        this._listIdentities = _listIdentities;
    }
}
