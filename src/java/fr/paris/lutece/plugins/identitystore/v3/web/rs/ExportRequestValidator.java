package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.exporting.ExportModelScheduleRequest;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
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

    public void validateScheduleExportRequest(final ExportModelScheduleRequest request) throws IdentityStoreException {
        if (request == null || request.getExportModelId() == null || StringUtils.isBlank(request.getEmail())) {
            throw new IdentityStoreException("Schedule export request is null or empty");
        }
    }

}
