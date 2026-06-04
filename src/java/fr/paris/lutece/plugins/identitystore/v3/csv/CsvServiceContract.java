package fr.paris.lutece.plugins.identitystore.v3.csv;

import com.opencsv.bean.CsvBindByPosition;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;

import java.sql.Date;

public class CsvServiceContract
{

    @CsvBindByPosition( position = 0 )
    private String name;

    @CsvBindByPosition( position = 1 )
    private String clientCode;

    @CsvBindByPosition( position = 2 )
    private String moaEntityName;

    @CsvBindByPosition( position = 3 )
    private String moeEntityName;

    @CsvBindByPosition( position = 4 )
    private String moeResponsibleName;

    @CsvBindByPosition( position = 5 )
    private String startingDate;

    @CsvBindByPosition( position = 6 )
    private String endingDate;

    @CsvBindByPosition( position = 7 )
    private String serviceType;

    @CsvBindByPosition( position = 8 )
    private int dataRetentionPeriodInMonths;

    @CsvBindByPosition( position = 9 )
    private boolean authorizedCreation;

    @CsvBindByPosition( position = 10 )
    private boolean authorizedUpdate;

    @CsvBindByPosition( position = 11 )
    private boolean authorizedSearch;

    @CsvBindByPosition( position = 12 )
    private boolean authorizedMerge;

    @CsvBindByPosition( position = 13 )
    private boolean authorizedAccountUpdate;

    @CsvBindByPosition( position = 14 )
    private boolean authorizedDeletion;

    @CsvBindByPosition( position = 15 )
    private boolean authorizedImport;

    @CsvBindByPosition( position = 16 )
    private boolean authorizedExport;

    @CsvBindByPosition( position = 17 )
    private boolean authorizedDecertification;

    @CsvBindByPosition( position = 18 )
    private boolean authorizedAgentHistoryRead;

    @CsvBindByPosition( position = 19 )
    private boolean authorizedAttachmentCertification;

    @CsvBindByPosition( position = 20 )
    private Date creationDate;

    @CsvBindByPosition( position = 21 )
    private Date lastUpdatedDate;

    @CsvBindByPosition( position = 22 )
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

    public String getMoeResponsibleName() {
        return moeResponsibleName;
    }

    public void setMoeResponsibleName(final String moeResponsibleName) {
        this.moeResponsibleName = moeResponsibleName;
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

    public boolean isAuthorizedAttachmentCertification() {
        return authorizedAttachmentCertification;
    }

    public void setAuthorizedAttachmentCertification(final boolean authorizedAttachmentCertification) {
        this.authorizedAttachmentCertification = authorizedAttachmentCertification;
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
