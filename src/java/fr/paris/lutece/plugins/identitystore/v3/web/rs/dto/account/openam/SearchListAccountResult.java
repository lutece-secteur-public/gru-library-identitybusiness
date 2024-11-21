package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.List;

public class SearchListAccountResult extends ResponseDto
{
    private List<AccountOpenAMDto> _listUsers;

    public List<AccountOpenAMDto> getUsers(  )
    {
        return _listUsers;
    }

    public void setUsers( List<AccountOpenAMDto> _listUsers )
    {
        this._listUsers = _listUsers;
    }
}
