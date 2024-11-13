package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.List;

public class AccountResponse extends ResponseDto
{
    private List<AccountDto> accountList;

    public List<AccountDto> getAccountList()
    {
        return accountList;
    }

    public void setAccountList(List<AccountDto> accountList)
    {
        this.accountList = accountList;
    }
}
