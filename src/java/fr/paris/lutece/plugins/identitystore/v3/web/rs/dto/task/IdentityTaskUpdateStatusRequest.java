package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName( "task_status_update" )
public class IdentityTaskUpdateStatusRequest {

    @JsonProperty("status")
    protected IdentityTaskStatusType status;

    public IdentityTaskStatusType getStatus() {
        return status;
    }

    public void setStatus(IdentityTaskStatusType status) {
        this.status = status;
    }
}
