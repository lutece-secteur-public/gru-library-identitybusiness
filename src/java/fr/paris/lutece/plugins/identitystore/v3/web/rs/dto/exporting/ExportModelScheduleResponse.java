package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.exporting;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

public class ExportModelScheduleResponse extends ResponseDto {

    @JsonProperty("pwd")
    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(final String pwd) {
        this.pwd = pwd;
    }
}
