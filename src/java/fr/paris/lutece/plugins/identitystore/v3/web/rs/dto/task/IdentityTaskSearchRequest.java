package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName( "task_search" )
public class IdentityTaskSearchRequest {

    @JsonProperty("task_type")
    protected IdentityTaskType identityTaskType;

    @JsonProperty("task_status")
    protected List<IdentityTaskStatusType> _enumTaskStatus;

    @JsonProperty("nb_days_since_creation")
    protected Integer _nNbDaysSinceCreated;

    @JsonProperty("creation_date_ordering")
    protected IdentityCreationDateOrdering creationDateOrdering;

    public IdentityTaskType getTaskType() {
        return identityTaskType;
    }

    public void setTaskType(IdentityTaskType _strTaskType) {
        this.identityTaskType = _strTaskType;
    }

    public List<IdentityTaskStatusType> getTaskStatus() {
        return _enumTaskStatus;
    }

    public void setTaskStatus(List<IdentityTaskStatusType> _enumTaskStatus) {
        this._enumTaskStatus = _enumTaskStatus;
    }

    public Integer getNbDaysSinceCreated() {
        return _nNbDaysSinceCreated;
    }

    public void setNbDaysSinceCreated(Integer _nNbDaysSinceCreated) {
        this._nNbDaysSinceCreated = _nNbDaysSinceCreated;
    }

    public IdentityCreationDateOrdering getCreationDateOrdering() {
        return creationDateOrdering;
    }

    public void setCreationDateOrdering(IdentityCreationDateOrdering creationDateOrdering) {
        this.creationDateOrdering = creationDateOrdering;
    }
}
