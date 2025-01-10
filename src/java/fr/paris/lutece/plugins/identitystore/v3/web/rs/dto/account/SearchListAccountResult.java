package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import java.util.List;

public class SearchListAccountResult
{
    private List<AccountDto> _listUsers;
    private String _strQuery;
    private PaginationRangeDto _range;

    public List<AccountDto> getUsers(  )
    {
        return _listUsers;
    }

    public void setUsers( List<AccountDto> _listUsers )
    {
        this._listUsers = _listUsers;
    }

    public String getQuery() {
        return _strQuery;
    }

    public void setQuery(String _strQuery) {
        this._strQuery = _strQuery;
    }

    public PaginationRangeDto getRange() {
        return _range;
    }

    public void setRange(PaginationRangeDto _range) {
        this._range = _range;
    }

    @Override
    public String toString() {
        return "SearchListAccountResult{" +
                "_listUsers=" + _listUsers +
                ", _strQuery='" + _strQuery + '\'' +
                ", _range=" + _range +
                '}';
    }
}
