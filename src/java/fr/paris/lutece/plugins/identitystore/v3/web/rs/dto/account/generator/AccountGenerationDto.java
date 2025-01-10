package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.generator;

public class AccountGenerationDto
{
    /**
     * Defines whether the generator should create an account associated to the identity
     */
    private boolean generateAccount;

    /**
     * Defines the pattern used for some attribute generation (such as email)
     */
    private String generationPattern;

    /**
     * Defines the offset used in some attribute generation (such as email)
     */
    private int generationIncrementOffset;

    /**
     * Defines the number of days before the identity and/or account shall be automatically deleted
     */
    private int nbDaysOfValidity;

    /**
     * Defines the size of creation batch. That is to say the number of generated identities/accounts
     */
    private int batchSize;

    public boolean isGenerateAccount()
    {
        return generateAccount;
    }

    public void setGenerateAccount(boolean generateAccount)
    {
        this.generateAccount = generateAccount;
    }

    public String getGenerationPattern()
    {
        return generationPattern;
    }

    public void setGenerationPattern(String generationPattern)
    {
        this.generationPattern = generationPattern;
    }

    public int getNbDaysOfValidity()
    {
        return nbDaysOfValidity;
    }

    public void setNbDaysOfValidity(int nbDaysOfValidity)
    {
        this.nbDaysOfValidity = nbDaysOfValidity;
    }

    public int getBatchSize()
    {
        return batchSize;
    }

    public void setBatchSize(int batchSize)
    {
        this.batchSize = batchSize;
    }

    public int getGenerationIncrementOffset() {
        return generationIncrementOffset;
    }

    public void setGenerationIncrementOffset(int generationIncrementOffset) {
        this.generationIncrementOffset = generationIncrementOffset;
    }

    @Override
    public String toString() {
        return "AccountGenerationDto{" +
                "generateAccount=" + generateAccount +
                ", generationPattern='" + generationPattern + '\'' +
                ", generationIncrementOffset=" + generationIncrementOffset +
                ", nbDaysOfValidity=" + nbDaysOfValidity +
                ", batchSize=" + batchSize +
                '}';
    }
}
