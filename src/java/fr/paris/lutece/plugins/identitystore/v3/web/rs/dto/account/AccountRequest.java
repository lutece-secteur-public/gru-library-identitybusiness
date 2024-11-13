package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class AccountRequest
{

    protected AccountCreationDto accoutDto;

    public AccountCreationDto getAccoutDto()
    {
        return accoutDto;
    }

    public void setAccoutDto(AccountCreationDto accoutDto)
    {
        this.accoutDto = accoutDto;
    }
}
