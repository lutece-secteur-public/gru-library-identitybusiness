package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.generator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonRootName( "account_generation" )
public class AccountGenerationRequest
{

    @JsonProperty("generation")
    protected AccountGenerationDto accountGenerationDto;

    public AccountGenerationDto getAccountGenerationDto()
    {
        return accountGenerationDto;
    }

    public void setAccountGenerationDto(AccountGenerationDto accountGenerationDto)
    {
        this.accountGenerationDto = accountGenerationDto;
    }
}
