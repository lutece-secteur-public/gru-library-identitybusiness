package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class AccountRequest
{

    protected AccountCreationDto accountDto;

    public AccountCreationDto getAccountDto()
    {
        return accountDto;
    }

    public void setAccountDto(AccountCreationDto accountDto)
    {
        this.accountDto = accountDto;
    }
}
