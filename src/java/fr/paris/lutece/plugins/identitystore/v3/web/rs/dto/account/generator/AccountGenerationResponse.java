package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.generator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.List;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class AccountGenerationResponse extends ResponseDto
{
    @JsonProperty( "generated_accounts" )
    private List<GeneratedAccountDto> generatedAccountList;

    public List<GeneratedAccountDto> getGeneratedAccountList()
    {
        return generatedAccountList;
    }

    public void setGeneratedAccountList(List<GeneratedAccountDto> generatedAccountList)
    {
        this.generatedAccountList = generatedAccountList;
    }

    @Override
    public String toString() {
        return "AccountGenerationResponse{" +
                "generatedAccountList=" + generatedAccountList +
                ", _status=" + _status +
                ", metadata=" + metadata +
                '}';
    }
}
