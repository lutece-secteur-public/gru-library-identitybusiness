package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

public class IdentityTaskGetStatusResponse extends ResponseDto {

    @JsonProperty("task_status")
    private String taskStatus;

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(final String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
