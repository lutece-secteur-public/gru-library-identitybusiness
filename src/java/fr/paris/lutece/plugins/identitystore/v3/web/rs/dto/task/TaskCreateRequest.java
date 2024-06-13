package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName( "task_create" )
public class TaskCreateRequest {

    @JsonProperty("task")
    private TaskDto task;

    public TaskDto getTask() {
        return task;
    }

    public void setTask(final TaskDto task) {
        this.task = task;
    }
}
