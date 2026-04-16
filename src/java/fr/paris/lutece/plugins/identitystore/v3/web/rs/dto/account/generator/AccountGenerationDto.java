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

    /**
     * Defines the login prefix. Login format: [loginPrefix][incremental number][loginSuffix]
     */
    private String loginPrefix;

    /**
     * Defines the login suffix. Login format: [loginPrefix][incremental number][loginSuffix]
     */
    private String loginSuffix;

    /**
     * Defines the common password for all generated accounts
     */
    private String password;

    /**
     * Defines the first name prefix. Format: [firstNamePrefix]-[random chars]
     */
    private String firstNamePrefix;

    /**
     * Defines the family name prefix. Format: [familyNamePrefix]-[same random chars as first name]
     */
    private String familyNamePrefix;

    /**
     * Defines a fixed birthdate for all generated identities (format dd/MM/yyyy)
     */
    private String birthdate;

    /**
     * Defines the birth country code (e.g. 99100 for France)
     */
    private String birthCountryCode;

    /**
     * Defines the birth place (commune) code (e.g. 75012)
     */
    private String birthplaceCode;

    /**
     * Defines the certifier for all identity attributes except email and login
     */
    private String identityCertifier;

    /**
     * Defines the certifier for email and login attributes
     */
    private String mailLoginCertifier;

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

    public String getLoginPrefix() {
        return loginPrefix;
    }

    public void setLoginPrefix(String loginPrefix) {
        this.loginPrefix = loginPrefix;
    }

    public String getLoginSuffix() {
        return loginSuffix;
    }

    public void setLoginSuffix(String loginSuffix) {
        this.loginSuffix = loginSuffix;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstNamePrefix() {
        return firstNamePrefix;
    }

    public void setFirstNamePrefix(String firstNamePrefix) {
        this.firstNamePrefix = firstNamePrefix;
    }

    public String getFamilyNamePrefix() {
        return familyNamePrefix;
    }

    public void setFamilyNamePrefix(String familyNamePrefix) {
        this.familyNamePrefix = familyNamePrefix;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    public void setBirthCountryCode(String birthCountryCode) {
        this.birthCountryCode = birthCountryCode;
    }

    public String getBirthplaceCode() {
        return birthplaceCode;
    }

    public void setBirthplaceCode(String birthplaceCode) {
        this.birthplaceCode = birthplaceCode;
    }

    public String getIdentityCertifier() {
        return identityCertifier;
    }

    public void setIdentityCertifier(String identityCertifier) {
        this.identityCertifier = identityCertifier;
    }

    public String getMailLoginCertifier() {
        return mailLoginCertifier;
    }

    public void setMailLoginCertifier(String mailLoginCertifier) {
        this.mailLoginCertifier = mailLoginCertifier;
    }

    @Override
    public String toString() {
        return "AccountGenerationDto{" +
                "generateAccount=" + generateAccount +
                ", generationPattern='" + generationPattern + '\'' +
                ", generationIncrementOffset=" + generationIncrementOffset +
                ", nbDaysOfValidity=" + nbDaysOfValidity +
                ", batchSize=" + batchSize +
                ", loginPrefix='" + loginPrefix + '\'' +
                ", loginSuffix='" + loginSuffix + '\'' +
                ", password='" + password + '\'' +
                ", firstNamePrefix='" + firstNamePrefix + '\'' +
                ", familyNamePrefix='" + familyNamePrefix + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", birthCountryCode='" + birthCountryCode + '\'' +
                ", birthplaceCode='" + birthplaceCode + '\'' +
                ", identityCertifier='" + identityCertifier + '\'' +
                ", mailLoginCertifier='" + mailLoginCertifier + '\'' +
                '}';
    }
}
