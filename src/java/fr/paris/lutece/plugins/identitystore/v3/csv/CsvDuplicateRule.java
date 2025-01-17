package fr.paris.lutece.plugins.identitystore.v3.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;

public class CsvDuplicateRule
{

    @CsvBindByName( column = Constants.PARAMETER_CODE )
    @CsvBindByPosition( position = 0 )
    private String _strCode;

    @CsvBindByName( column = Constants.PARAMETER_NAME )
    @CsvBindByPosition( position = 1 )
    private String _strName;

    @CsvBindByName( column = Constants.PARAMETER_DESCRIPTION )
    @CsvBindByPosition( position = 2 )
    private String _strDescription;

    @CsvBindByName( column = Constants.PARAMETER_PRIORITY )
    @CsvBindByPosition( position = 3 )
    private int _nPriority;

    @CsvBindByName( column = Constants.PARAMETER_DETECTION_LIMIT )
    @CsvBindByPosition( position = 4 )
    private int _nDetectionLimit = -1;

    @CsvBindByName( column = Constants.PARAMETER_ACTIVE )
    @CsvBindByPosition( position = 5 )
    private boolean _bActive;

    @CsvBindByName( column = Constants.PARAMETER_DAEMON )
    @CsvBindByPosition( position = 6 )
    private boolean _bDaemon;

    @CsvBindByName( column = Constants.PARAMETER_NB_IMPACTED_ATTRIBUTES )
    @CsvBindByPosition( position = 7 )
    private int _nImpactedAttributes;

    @CsvBindByName( column = Constants.PARAMETER_NB_FILLED_ATTRIBUTES )
    @CsvBindByPosition( position = 8 )
    private int _nNbFilledAttributes;

    @CsvBindByName( column = Constants.PARAMETER_NB_EQUALS_ATTRIBUTES )
    @CsvBindByPosition( position = 9 )
    private int _nNbEqualAttributes;

    @CsvBindByName( column = Constants.PARAMETER_NB_MISSING_ATTRIBUTES )
    @CsvBindByPosition( position = 10 )
    private int _nNbMissingAttributes;

    @CsvBindByName( column = Constants.PARAMETER_TREATMENT_TYPES )
    @CsvBindByPosition( position = 11 )
    private String _strtreatmentType;

    public String getCode()
    {
        return _strCode;
    }

    public void setCode(String _strCode)
    {
        this._strCode = _strCode;
    }

    public String getName()
    {
        return _strName;
    }

    public void setName(String _strName)
    {
        this._strName = _strName;
    }

    public String getDescription()
    {
        return _strDescription;
    }

    public void setDescription(String _strDescription)
    {
        this._strDescription = _strDescription;
    }

    public int getPriority()
    {
        return _nPriority;
    }

    public void setPriority(int _nPriority)
    {
        this._nPriority = _nPriority;
    }

    public int getDetectionLimit()
    {
        return _nDetectionLimit;
    }

    public void setDetectionLimit(int _nDetectionLimit)
    {
        this._nDetectionLimit = _nDetectionLimit;
    }

    public boolean isActive()
    {
        return _bActive;
    }

    public void setActive(boolean _bActive)
    {
        this._bActive = _bActive;
    }

    public boolean isDaemon()
    {
        return _bDaemon;
    }

    public void setDaemon(boolean _bDaemon)
    {
        this._bDaemon = _bDaemon;
    }

    public int getImpactedAttributes()
    {
        return _nImpactedAttributes;
    }

    public void setImpactedAttributes(int _nImpactedAttributes)
    {
        this._nImpactedAttributes = _nImpactedAttributes;
    }

    public int getNbFilledAttributes()
    {
        return _nNbFilledAttributes;
    }

    public void setNbFilledAttributes(int _nNbFilledAttributes)
    {
        this._nNbFilledAttributes = _nNbFilledAttributes;
    }

    public int getNbEqualAttributes()
    {
        return _nNbEqualAttributes;
    }

    public void setNbEqualAttributes(int _nNbEqualAttributes)
    {
        this._nNbEqualAttributes = _nNbEqualAttributes;
    }

    public int getNbMissingAttributes()
    {
        return _nNbMissingAttributes;
    }

    public void setNbMissingAttributes(int _nNbMissingAttributes)
    {
        this._nNbMissingAttributes = _nNbMissingAttributes;
    }

    public String gettreatmentType()
    {
        return _strtreatmentType;
    }

    public void settreatmentType(String _strtreatmentType)
    {
        this._strtreatmentType = _strtreatmentType;
    }
}
