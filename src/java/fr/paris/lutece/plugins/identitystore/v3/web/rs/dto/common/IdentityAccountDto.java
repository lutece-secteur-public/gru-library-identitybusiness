package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class IdentityAccountDto {

    @JsonProperty( "connection_id" )
    private String connectionId;

    @JsonProperty( "current" )
    private boolean current;

    @JsonProperty( "creation_date" )
    private Timestamp creationDate;

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(final String connectionId) {
        this.connectionId = connectionId;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(final boolean current) {
        this.current = current;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "AccountHistoryDto{" +
               "connectionId='" + connectionId + '\'' +
               ", current=" + current +
               ", creationDate=" + creationDate +
               '}';
    }
}
