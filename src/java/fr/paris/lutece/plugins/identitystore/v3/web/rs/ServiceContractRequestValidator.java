package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.RequestFormatException;
import org.apache.commons.lang3.StringUtils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ServiceContractRequestValidator extends RequestValidator {
    private static ServiceContractRequestValidator instance;

    public static ServiceContractRequestValidator getInstance() {
        if (instance == null) {
            instance = new ServiceContractRequestValidator();
        }
        return instance;
    }

    private ServiceContractRequestValidator() {
    }

    public boolean checkAndParseLoadDetails(final String strLoadDetails) throws RequestFormatException {
        if (StringUtils.isNotBlank( strLoadDetails ) ) {
            if (!List.of("true", "false").contains(strLoadDetails.toLowerCase())) {
                throw new RequestFormatException("Wrong " + Constants.PARAM_LOAD_DETAILS + " parameter value. Should be 'true' or 'false'.",
                                                 Constants.PROPERTY_REST_ERROR_LOAD_DETAILS_WRONG_VALUE);
            }
            return Boolean.parseBoolean(strLoadDetails.toLowerCase());
        }
        // default
        return false;
    }

    public Date checkAndParseMinEndDate(final String strMinEndDate) throws RequestFormatException {
        if (StringUtils.isNotBlank(strMinEndDate)) {
            try {
                return Date.valueOf(LocalDate.parse(strMinEndDate, DateTimeFormatter.ISO_LOCAL_DATE));
            } catch (final Exception e) {
                throw new RequestFormatException("Wrong " + Constants.PARAM_MIN_END_DATE + " parameter value. Should match the 'yyyy-MM-dd' format.",
                                                 Constants.PROPERTY_REST_ERROR_MIN_END_DATE_WRONG_VALUE);
            }
        }
        return null;
    }

}
