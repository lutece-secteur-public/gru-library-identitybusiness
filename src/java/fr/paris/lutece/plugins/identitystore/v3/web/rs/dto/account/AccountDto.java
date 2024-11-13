package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

public class AccountDto
{
    String email;
    String password;
    String cuid;
    String guid;

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
}
