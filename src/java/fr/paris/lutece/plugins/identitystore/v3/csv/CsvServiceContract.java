package fr.paris.lutece.plugins.identitystore.v3.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;

import java.sql.Date;

public class CsvServiceContract
{

    @CsvBindByName( column = Constants.PARAMETER_NAME )
    @CsvBindByPosition( position = 0 )
    private String name;

    @CsvBindByName( column = Constants.PARAM_CLIENT_CODE )
    @CsvBindByPosition( position = 1 )
    private String clientCode;

    @CsvBindByName( column = Constants.PARAM_MOA_ENTITY_NAME )
    @CsvBindByPosition( position = 2 )
    private String moaEntityName;

    @CsvBindByName( column = Constants.PARAM_MOE_ENTITY_NAME )
    @CsvBindByPosition( position = 3 )
    private String moeEntityName;

    @CsvBindByName( column = Constants.PARAM_STARTING_DATE )
    @CsvBindByPosition( position = 4 )
    private String startingDate;

    @CsvBindByName( column = Constants.PARAM_ENDING_DATE )
    @CsvBindByPosition( position = 5 )
    private String endingDate;

    @CsvBindByName( column = Constants.PARAM_SERVICE_TYPE )
    @CsvBindByPosition( position = 6 )
    private String serviceType;

    @CsvBindByName( column = Constants.PARAM_DATA_RETENTION_IN_MONTH )
    @CsvBindByPosition( position = 7 )
    private int dataRetentionPeriodInMonths;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_CREATION )
    @CsvBindByPosition( position = 8 )
    private boolean authorizedCreation;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_UPDATE )
    @CsvBindByPosition( position = 9 )
    private boolean authorizedUpdate;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_SEARCH )
    @CsvBindByPosition( position = 10 )
    private boolean authorizedSearch;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_MERGE )
    @CsvBindByPosition( position = 11 )
    private boolean authorizedMerge;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_ACCOUNT_UPDATE )
    @CsvBindByPosition( position = 12 )
    private boolean authorizedAccountUpdate;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_DELETION )
    @CsvBindByPosition( position = 13 )
    private boolean authorizedDeletion;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_IMPORT )
    @CsvBindByPosition( position = 14 )
    private boolean authorizedImport;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_EXPORT )
    @CsvBindByPosition( position = 15 )
    private boolean authorizedExport;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_DECERTIFICATION )
    @CsvBindByPosition( position = 16 )
    private boolean authorizedDecertification;

    @CsvBindByName( column = Constants.PARAM_AUTHORIZED_AGENT_HISTORY_READ )
    @CsvBindByPosition( position = 17 )
    private boolean authorizedAgentHistoryRead;

    @CsvBindByName( column = Constants.PARAM_CREATION_DATE )
    @CsvBindByPosition( position = 18 )
    private Date creationDate;

    @CsvBindByName( column = Constants.PARAM_LAST_UPDATE_DATE )
    @CsvBindByPosition( position = 19 )
    private Date lastUpdatedDate;

    @CsvBindByName( column = Constants.PARAM_AUTHOR_NAME )
    @CsvBindByPosition( position = 20 )
    private String authorName;

    public boolean isAuthorizedAccountUpdate()
    {
        return authorizedAccountUpdate;
    }

    public void setAuthorizedAccountUpdate(boolean authorizedAccountUpdate)
    {
        this.authorizedAccountUpdate = authorizedAccountUpdate;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getClientCode()
    {
        return clientCode;
    }

    public void setClientCode(String clientCode)
    {
        this.clientCode = clientCode;
    }

    public String getMoaEntityName()
    {
        return moaEntityName;
    }

    public void setMoaEntityName(String moaEntityName)
    {
        this.moaEntityName = moaEntityName;
    }

    public String getMoeEntityName()
    {
        return moeEntityName;
    }

    public void setMoeEntityName(String moeEntityName)
    {
        this.moeEntityName = moeEntityName;
    }

    public String getStartingDate()
    {
        return startingDate;
    }

    public void setStartingDate(String startingDate)
    {
        this.startingDate = startingDate;
    }

    public String getEndingDate()
    {
        return endingDate;
    }

    public void setEndingDate(String endingDate)
    {
        this.endingDate = endingDate;
    }

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public int getDataRetentionPeriodInMonths()
    {
        return dataRetentionPeriodInMonths;
    }

    public void setDataRetentionPeriodInMonths(int dataRetentionPeriodInMonths)
    {
        this.dataRetentionPeriodInMonths = dataRetentionPeriodInMonths;
    }

    public boolean isAuthorizedCreation()
    {
        return authorizedCreation;
    }

    public void setAuthorizedCreation(boolean authorizedCreation)
    {
        this.authorizedCreation = authorizedCreation;
    }

    public boolean isAuthorizedUpdate()
    {
        return authorizedUpdate;
    }

    public void setAuthorizedUpdate(boolean authorizedUpdate)
    {
        this.authorizedUpdate = authorizedUpdate;
    }

    public boolean isAuthorizedSearch()
    {
        return authorizedSearch;
    }

    public void setAuthorizedSearch(boolean authorizedSearch)
    {
        this.authorizedSearch = authorizedSearch;
    }

    public boolean isAuthorizedMerge()
    {
        return authorizedMerge;
    }

    public void setAuthorizedMerge(boolean authorizedMerge)
    {
        this.authorizedMerge = authorizedMerge;
    }

    public boolean isAuthorizedDeletion()
    {
        return authorizedDeletion;
    }

    public void setAuthorizedDeletion(boolean authorizedDeletion)
    {
        this.authorizedDeletion = authorizedDeletion;
    }

    public boolean isAuthorizedImport()
    {
        return authorizedImport;
    }

    public void setAuthorizedImport(boolean authorizedImport)
    {
        this.authorizedImport = authorizedImport;
    }

    public boolean isAuthorizedExport()
    {
        return authorizedExport;
    }

    public void setAuthorizedExport(boolean authorizedExport)
    {
        this.authorizedExport = authorizedExport;
    }

    public boolean isAuthorizedDecertification()
    {
        return authorizedDecertification;
    }

    public void setAuthorizedDecertification(boolean authorizedDecertification)
    {
        this.authorizedDecertification = authorizedDecertification;
    }

    public boolean isAuthorizedAgentHistoryRead()
    {
        return authorizedAgentHistoryRead;
    }

    public void setAuthorizedAgentHistoryRead(boolean authorizedAgentHistoryRead)
    {
        this.authorizedAgentHistoryRead = authorizedAgentHistoryRead;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
