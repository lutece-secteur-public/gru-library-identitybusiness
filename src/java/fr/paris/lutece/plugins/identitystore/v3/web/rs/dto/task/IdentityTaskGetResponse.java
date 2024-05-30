package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

public class IdentityTaskGetResponse extends ResponseDto {

    @JsonProperty("task")
    private IdentityTaskDto task;

    public IdentityTaskDto getTask() {
        return task;
    }

    public void setTask(final IdentityTaskDto task) {
        this.task = task;
    }
}
