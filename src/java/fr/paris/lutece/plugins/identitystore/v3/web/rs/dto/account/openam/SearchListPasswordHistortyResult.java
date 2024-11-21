package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.List;

public class SearchListPasswordHistortyResult extends ResponseDto
{
    private List<String> _listPasswordHistory;

    public List<String> get_listPasswordHistory()
    {
        return _listPasswordHistory;
    }

    public void set_listPasswordHistory(List<String> _listPasswordHistory)
    {
        this._listPasswordHistory = _listPasswordHistory;
    }
}
