package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName( "task_create" )
public class IdentityTaskCreateRequest {

    @JsonProperty("task")
    private IdentityTaskDto task;

    public IdentityTaskDto getTask() {
        return task;
    }

    public void setTask(final IdentityTaskDto task) {
        this.task = task;
    }
}
