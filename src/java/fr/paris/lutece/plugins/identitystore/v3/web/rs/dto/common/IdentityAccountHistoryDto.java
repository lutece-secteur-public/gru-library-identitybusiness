package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

@JsonInclude( JsonInclude.Include.NON_NULL )
public class IdentityAccountHistoryDto {

    @JsonProperty( "connection_id" )
    private String connectionId;

    @JsonProperty( "creation_date" )
    private Timestamp creationDate;

    @JsonProperty( "deletion_date" )
    private Timestamp deletionDate;

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(final String connectionId) {
        this.connectionId = connectionId;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getDeletionDate() {
        return deletionDate;
    }

    public void setDeletionDate(final Timestamp deletionDate) {
        this.deletionDate = deletionDate;
    }

    @Override
    public String toString() {
        return "IdentityAccountHistoryDto{" +
               "connectionId='" + connectionId + '\'' +
               ", creationDate=" + creationDate +
               ", deletionDate=" + deletionDate +
               '}';
    }
}
