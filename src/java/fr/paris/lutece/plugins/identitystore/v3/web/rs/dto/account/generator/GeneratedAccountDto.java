package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.generator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class GeneratedAccountDto
{
    protected String email;
    protected String password;
    protected String cuid;
    protected String guid;
    protected List<String> status = new ArrayList<>();

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getCuid()
    {
        return cuid;
    }

    public void setCuid(String cuid)
    {
        this.cuid = cuid;
    }

    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    @JsonIgnore
    public boolean isStorable()
    {
        return (this.hasAccount() && this.hasIdentity()) || this.hasIdentity();
    }

    @JsonIgnore
    public boolean hasAccount()
    {
        return this.getGuid() != null && !this.getGuid().isEmpty();
    }

    @JsonIgnore
    public boolean hasIdentity()
    {
        return this.getCuid() != null && !this.getCuid().isEmpty();
    }

    @Override
    public String toString() {
        return "GeneratedAccountDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cuid='" + cuid + '\'' +
                ", guid='" + guid + '\'' +
                ", status=" + status +
                '}';
    }
}
