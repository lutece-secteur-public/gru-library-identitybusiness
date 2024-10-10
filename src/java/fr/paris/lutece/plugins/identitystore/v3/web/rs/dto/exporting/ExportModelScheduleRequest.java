package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.exporting;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExportModelScheduleRequest {

    @JsonProperty("export_model_id")
    private Integer exportModelId;

    @JsonProperty("email")
    private String email;

    public Integer getExportModelId() {
        return exportModelId;
    }

    public void setExportModelId(final Integer exportModelId) {
        this.exportModelId = exportModelId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}
