package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.IdentityResourceType;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.IdentityTaskCreateRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.IdentityTaskSearchRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.IdentityTaskType;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.task.IdentityTaskUpdateStatusRequest;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class IdentityTaskRequestValidator extends RequestValidator {

    private static IdentityTaskRequestValidator instance;

    private IdentityTaskRequestValidator() {
    }

    public static IdentityTaskRequestValidator instance() {
        if (instance == null) {
            instance = new IdentityTaskRequestValidator();
        }
        return instance;
    }

    public void validateTaskCreateRequest(final IdentityTaskCreateRequest request) throws IdentityStoreException {
        if(request == null || request.getTask() == null) {
            throw new IdentityStoreException( "Provided request is null or empty" );
        }

        if(StringUtils.isBlank(request.getTask().getTaskType())){
            throw new IdentityStoreException( "Provided task must have a type" );
        } else if (Arrays.stream(IdentityTaskType.values()).noneMatch(t -> t.name().equals(request.getTask().getTaskType()))) {
            throw new IdentityStoreException( "Provided task type is invalid. Authorized values : " + Arrays.toString( IdentityTaskType.values() ) );
        }

        this.validateTaskResourceId( request.getTask().getResourceId() );
        this.validateTaskResourceType( request.getTask().getResourceType() );
    }

    public void validateTaskStatusUpdateRequest( final IdentityTaskUpdateStatusRequest request ) throws IdentityStoreException {
        if(request == null || request.getStatus() == null) {
            throw new IdentityStoreException( "Provided request is null or empty" );
        }
    }

    public void validateTaskSearchRequest(final IdentityTaskSearchRequest request) throws IdentityStoreException {
        if(request == null || (CollectionUtils.isEmpty(request.getTaskStatus()) && request.getCreationDateOrdering() == null && request.getNbDaysSinceCreated() == null && request.getTaskType() == null )) {
            throw new IdentityStoreException( "Provided request is null or empty" );
        }
    }

    public void validateTaskCode(final String taskCode) throws IdentityStoreException {
        if(StringUtils.isBlank(taskCode)) {
            throw new IdentityStoreException("Provided task code is null or empty");
        }
    }

    public void validateTaskResourceId( final String taskResourceId ) throws IdentityStoreException
    {
        if ( StringUtils.isBlank( taskResourceId ) )
        {
            throw new IdentityStoreException( "Provided task resource id is null or empty" );
        }
    }

    public void validateTaskSecondCuid( final String taskSecondCuid ) throws IdentityStoreException
    {
        if ( StringUtils.isBlank( taskSecondCuid ) )
        {
            throw new IdentityStoreException( "Provided task second cuid is null or empty" );
        }
    }

    public void validateTaskResourceType( final String taskResourceType ) throws IdentityStoreException
    {
        if ( StringUtils.isBlank( taskResourceType ) )
        {
            throw new IdentityStoreException( "Provided task resource type is null or empty" );
        }

        if ( Arrays.stream(IdentityResourceType.values()).noneMatch(t -> t.name().equals( taskResourceType ) ) )
        {
            throw new IdentityStoreException( "Provided task resource type is invalid. Authorized values : " + Arrays.toString( IdentityResourceType.values() ) );
        }
    }
}
