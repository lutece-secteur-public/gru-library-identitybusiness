package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.exporting.ExportModelScheduleRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import fr.paris.lutece.plugins.identitystore.web.exception.RequestFormatException;
import org.apache.commons.lang3.StringUtils;

public class ExportRequestValidator extends RequestValidator {
    private static ExportRequestValidator instance;

    public static ExportRequestValidator getInstance() {
        if (instance == null) {
            instance = new ExportRequestValidator();
        }
        return instance;
    }

    private ExportRequestValidator() {
    }

    public void validateScheduleExportRequest(final ExportModelScheduleRequest request) throws RequestFormatException {
        if (request == null || request.getExportModelId() == null || StringUtils.isBlank(request.getEmail())) {
            throw new RequestFormatException("Schedule export request is null or empty", Constants.PROPERTY_REST_ERROR_SCHEDULE_EXPORT_REQUEST_NULL_OR_EMPTY);
        }
    }

}
