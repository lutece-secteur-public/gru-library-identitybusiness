package fr.paris.lutece.plugins.identitystore.v3.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;

public class CsvIdentityChange
{

    @CsvBindByName( column = Constants.PARAM_ID_CUSTOMER )
    @CsvBindByPosition( position = 0 )
    private String _strCustomerId;

    @CsvBindByName( column = Constants.PARAM_CHANGE_TYPE )
    @CsvBindByPosition( position = 1 )
    private String _strChangeType;

    @CsvBindByName( column = Constants.PARAM_CHANGE_STATUS )
    @CsvBindByPosition( position = 2 )
    private String _strStatus;

    @CsvBindByName( column = Constants.PARAM_MODIFICATION_DATE )
    @CsvBindByPosition( position = 3 )
    private String _strModificationDate;

    @CsvBindByName( column = Constants.PARAM_AUTHOR_TYPE )
    @CsvBindByPosition( position = 4 )
    private String _strAuthorType;

    @CsvBindByName( column = Constants.PARAM_AUTHOR_NAME )
    @CsvBindByPosition( position = 5 )
    private String _strAuthorName;

    @CsvBindByName( column = Constants.PARAM_CLIENT_CODE )
    @CsvBindByPosition( position = 6 )
    private String _strClientCode;

    public String getCustomerId()
    {
        return _strCustomerId;
    }

    public void setCustomerId(String _strCustomerId)
    {
        this._strCustomerId = _strCustomerId;
    }

    public String getChangeType()
    {
        return _strChangeType;
    }

    public void setChangeType(String _strChangeType)
    {
        this._strChangeType = _strChangeType;
    }

    public String getStatus()
    {
        return _strStatus;
    }

    public void setStatus(String _strStatus)
    {
        this._strStatus = _strStatus;
    }

    public String getModificationDate()
    {
        return _strModificationDate;
    }

    public void setModificationDate(String _strModificationDate)
    {
        this._strModificationDate = _strModificationDate;
    }

    public String getAuthorType()
    {
        return _strAuthorType;
    }

    public void setAuthorType(String _strAuthorType)
    {
        this._strAuthorType = _strAuthorType;
    }

    public String getAuthorName()
    {
        return _strAuthorName;
    }

    public void setAuthorName(String _strAuthorName)
    {
        this._strAuthorName = _strAuthorName;
    }

    public String get_strClientCode()
    {
        return _strClientCode;
    }

    public void setClientCode(String _strClientCode)
    {
        this._strClientCode = _strClientCode;
    }
}
