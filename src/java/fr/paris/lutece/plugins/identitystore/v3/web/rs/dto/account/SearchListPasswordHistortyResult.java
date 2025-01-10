package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import java.util.List;

public class SearchListPasswordHistortyResult
{
    private List<String> _listPasswordHistory;

    public List<String> getPasswordHistory()
    {
        return _listPasswordHistory;
    }

    public void setPasswordHistory(List<String> _listPasswordHistory)
    {
        this._listPasswordHistory = _listPasswordHistory;
    }

    @Override
    public String toString() {
        return "SearchListPasswordHistortyResult{" +
                "_listPasswordHistory=" + _listPasswordHistory +
                '}';
    }
}
