package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.ArrayList;
import java.util.List;

public class IdentityTaskListGetResponse extends ResponseDto {
    @JsonProperty( "tasks" )
    private List<IdentityTaskDto> tasks = new ArrayList<>( );

    public List<IdentityTaskDto> getTasks( )
    {
        return tasks;
    }

    public void setTasks( List<IdentityTaskDto> tasks )
    {
        this.tasks = tasks;
    }
}
