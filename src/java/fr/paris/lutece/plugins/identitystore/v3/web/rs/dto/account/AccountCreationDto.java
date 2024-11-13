package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

public class AccountCreationDto
{
    private boolean isMonParis;
    private String userName;
    private String pattern;
    private int validityTime;
    private int batchSize;

    public boolean isMonParis()
    {
        return isMonParis;
    }

    public void setMonParis(boolean monParis)
    {
        isMonParis = monParis;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPattern()
    {
        return pattern;
    }

    public void setPattern(String pattern)
    {
        this.pattern = pattern;
    }

    public int getValidityTime()
    {
        return validityTime;
    }

    public void setValidityTime(int validityTime)
    {
        this.validityTime = validityTime;
    }

    public int getBatchSize()
    {
        return batchSize;
    }

    public void setBatchSize(int batchSize)
    {
        this.batchSize = batchSize;
    }
}
