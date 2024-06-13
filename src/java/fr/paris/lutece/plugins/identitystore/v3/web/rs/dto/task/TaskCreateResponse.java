package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

public class TaskCreateResponse extends ResponseDto {

    @JsonProperty("task_code")
    private String taskCode;

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(final String taskCode) {
        this.taskCode = taskCode;
    }
}
