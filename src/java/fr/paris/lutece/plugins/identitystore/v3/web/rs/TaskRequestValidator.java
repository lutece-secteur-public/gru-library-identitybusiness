package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.TaskCreateRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.TaskType;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TaskRequestValidator extends RequestValidator {

    private static TaskRequestValidator instance;

    private TaskRequestValidator() {
    }

    public static TaskRequestValidator instance() {
        if (instance == null) {
            instance = new TaskRequestValidator();
        }
        return instance;
    }

    public void validateTaskCreateRequest(final TaskCreateRequest request) throws IdentityStoreException {
        if(request == null || request.getTask() == null) {
            throw new IdentityStoreException( "Provided request is null or empty" );
        }

        if(StringUtils.isBlank(request.getTask().getTaskType())){
            throw new IdentityStoreException( "Provided task must have a type" );
        } else if (Arrays.stream(TaskType.values()).noneMatch(t -> t.name().equals(request.getTask().getTaskType()))) {
            throw new IdentityStoreException( "Provided task type is invalid. Authorized values : " + Arrays.toString( TaskType.values() ) );
        }

        if(StringUtils.isBlank(request.getTask().getResourceId())) {
            throw new IdentityStoreException("Provided task must have a resource id");
        }

        if(!"CUID".equals(request.getTask().getResourceType())){
            throw new IdentityStoreException("Provided task resource type is invalid. Only 'CUID' is allowed");
        }
    }

    public void validateTaskCode(final String taskCode) throws IdentityStoreException {
        if(StringUtils.isBlank(taskCode)) {
            throw new IdentityStoreException("Provided task code is null or empty");
        }
    }
}
