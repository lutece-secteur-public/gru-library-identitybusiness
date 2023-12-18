/*
 * Copyright (c) 2002-2023, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.identitystore.v3.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;

import java.util.Date;

public class CsvIdentity
{
    /**
     * Client identity external ID
     */
    @CsvBindByName( column = Constants.PARAM_EXTERNAL_ID_CUSTOMER )
    @CsvBindByPosition( position = 0 )
    private String _strExternalCustomerId;

    /**
     * GENDER
     */
    @CsvBindByName( column = Constants.PARAM_GENDER )
    @CsvBindByPosition( position = 1 )
    private String _strGenderValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_GENDER )
    @CsvBindByPosition( position = 2 )
    private String _strGenderCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_GENDER )
    @CsvBindByPosition( position = 3 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateGenderCertificationDate;

    /**
     * FAMILY NAME
     */
    @CsvBindByName( column = Constants.PARAM_FAMILY_NAME )
    @CsvBindByPosition( position = 4 )
    private String _strFamilyNameValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_FAMILY_NAME )
    @CsvBindByPosition( position = 5 )
    private String _strFamilyNameCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_FAMILY_NAME )
    @CsvBindByPosition( position = 6 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateFamilyNameCertificationDate;

    /**
     * PREFERRED USER NAME
     */
    @CsvBindByName( column = Constants.PARAM_PREFERRED_USERNAME )
    @CsvBindByPosition( position = 7 )
    private String _strPreferredUsernameValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_PREFERRED_USERNAME )
    @CsvBindByPosition( position = 8 )
    private String _strPreferredUsernameCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_PREFERRED_USERNAME )
    @CsvBindByPosition( position = 9 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _datePreferredUsernameCertificationDate;

    /**
     * FIRST NAME
     */
    @CsvBindByName( column = Constants.PARAM_FIRST_NAME )
    @CsvBindByPosition( position = 10 )
    private String _strFirstNameValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_FIRST_NAME )
    @CsvBindByPosition( position = 11 )
    private String _strFirstNameCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_FIRST_NAME )
    @CsvBindByPosition( position = 12 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateFirstNameCertificationDate;

    /**
     * BIRTH DATE
     */
    @CsvBindByName( column = Constants.PARAM_BIRTH_DATE )
    @CsvBindByPosition( position = 13 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateBirthdateValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_BIRTH_DATE )
    @CsvBindByPosition( position = 14 )
    private String _strBirthdateCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_BIRTH_DATE )
    @CsvBindByPosition( position = 15 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateBirthdateCertificationDate;

    /**
     * BIRTHPLACE CODE
     */
    @CsvBindByName( column = Constants.PARAM_BIRTH_PLACE_CODE )
    @CsvBindByPosition( position = 16 )
    private String _strBirthplaceCodeValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_BIRTH_PLACE_CODE )
    @CsvBindByPosition( position = 17 )
    private String _strBirthplaceCodeCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_BIRTH_PLACE_CODE )
    @CsvBindByPosition( position = 18 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateBirthplaceCodeCertificationDate;

    /**
     * BIRTH COUNTRY CODE
     */
    @CsvBindByName( column = Constants.PARAM_BIRTH_COUNTRY_CODE )
    @CsvBindByPosition( position = 19 )
    private String _strBirthCountryCodeValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_BIRTH_COUNTRY_CODE )
    @CsvBindByPosition( position = 20 )
    private String _strBirthCountryCodeCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_BIRTH_COUNTRY_CODE )
    @CsvBindByPosition( position = 21 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateBirthCountryCodeCertificationDate;

    /**
     * BIRTHPLACE
     */
    @CsvBindByName( column = Constants.PARAM_BIRTH_PLACE )
    @CsvBindByPosition( position = 22 )
    private String _strBirthplaceValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_BIRTH_PLACE )
    @CsvBindByPosition( position = 23 )
    private String _strBirthplaceCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_BIRTH_PLACE )
    @CsvBindByPosition( position = 24 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateBirthplaceCertificationDate;

    /**
     * BIRTH COUNTRY
     */
    @CsvBindByName( column = Constants.PARAM_BIRTH_COUNTRY )
    @CsvBindByPosition( position = 25 )
    private String _strBirthCountryValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_BIRTH_COUNTRY )
    @CsvBindByPosition( position = 26 )
    private String _strBirthCountryCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_BIRTH_COUNTRY )
    @CsvBindByPosition( position = 27 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateBirthCountryCertificationDate;

    /**
     * EMAIL
     */
    @CsvBindByName( column = Constants.PARAM_EMAIL )
    @CsvBindByPosition( position = 28 )
    private String _strEmailValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_EMAIL )
    @CsvBindByPosition( position = 29 )
    private String _strEmailCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_EMAIL )
    @CsvBindByPosition( position = 30 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateEmailCertificationDate;

    /**
     * MOBILE PHONE
     */
    @CsvBindByName( column = Constants.PARAM_MOBILE_PHONE )
    @CsvBindByPosition( position = 31 )
    private String _strMobilePhoneValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_MOBILE_PHONE )
    @CsvBindByPosition( position = 32 )
    private String _strMobilePhoneCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_MOBILE_PHONE )
    @CsvBindByPosition( position = 33 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateMobilePhoneCertificationDate;

    /**
     * FIXED PHONE
     */
    @CsvBindByName( column = Constants.PARAM_FIXED_PHONE )
    @CsvBindByPosition( position = 34 )
    private String _strFixedPhoneValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_FIXED_PHONE )
    @CsvBindByPosition( position = 35 )
    private String _strFixedPhoneCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_FIXED_PHONE )
    @CsvBindByPosition( position = 36 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateFixedPhoneCertificationDate;

    /**
     * ADDRESS
     */
    @CsvBindByName( column = Constants.PARAM_ADDRESS )
    @CsvBindByPosition( position = 37 )
    private String _strAddressValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_ADDRESS )
    @CsvBindByPosition( position = 38 )
    private String _strAddressCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_ADDRESS )
    @CsvBindByPosition( position = 39 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateAddressCertificationDate;

    /**
     * ADDRESS COMPLEMENT
     */
    @CsvBindByName( column = Constants.PARAM_ADDRESS_COMPLEMENT )
    @CsvBindByPosition( position = 40 )
    private String _strAddressComplementValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_ADDRESS_COMPLEMENT )
    @CsvBindByPosition( position = 41 )
    private String _strAddressComplementCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_ADDRESS_COMPLEMENT )
    @CsvBindByPosition( position = 42 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateAddressComplementCertificationDate;

    /**
     * ADDRESS POSTAL CODE
     */
    @CsvBindByName( column = Constants.PARAM_ADDRESS_POSTAL_CODE )
    @CsvBindByPosition( position = 43 )
    private String _strAddressPostalCodeValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_ADDRESS_POSTAL_CODE )
    @CsvBindByPosition( position = 44 )
    private String _strAddressPostalCodeCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_ADDRESS_POSTAL_CODE )
    @CsvBindByPosition( position = 45 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateAddressPostalCodeCertificationDate;

    /**
     * ADDRESS CITY
     */
    @CsvBindByName( column = Constants.PARAM_ADDRESS_CITY )
    @CsvBindByPosition( position = 46 )
    private String _strAddressCityValue;

    @CsvBindByName( column = Constants.PARAM_CERTIFIER_ADDRESS_CITY )
    @CsvBindByPosition( position = 47 )
    private String _strAddressCityCertifier;

    @CsvBindByName( column = Constants.PARAM_CERTIFICATION_DATE_ADDRESS_CITY )
    @CsvBindByPosition( position = 48 )
    @CsvDate( Constants.CSV_DATE_FORMAT )
    private Date _dateAddressCityCertificationDate;

    /**
     * Internal Customer ID
     */
    @CsvBindByName( column = Constants.PARAM_ID_CUSTOMER )
    @CsvBindByPosition( position = 49 )
    private String _strCustomerId;

    public String getExternalCustomerId( )
    {
        return _strExternalCustomerId;
    }

    public void setExternalCustomerId( String _strExternalCustomerId )
    {
        this._strExternalCustomerId = _strExternalCustomerId;
    }

    public String getCustomerId( )
    {
        return _strCustomerId;
    }

    public void setCustomerId( String _strCustomerId )
    {
        this._strCustomerId = _strCustomerId;
    }

    public String getGenderValue( )
    {
        return _strGenderValue;
    }

    public void setGenderValue( String _strGenderValue )
    {
        this._strGenderValue = _strGenderValue;
    }

    public String getGenderCertifier( )
    {
        return _strGenderCertifier;
    }

    public void setGenderCertifier( String _strGenderCertifier )
    {
        this._strGenderCertifier = _strGenderCertifier;
    }

    public Date getGenderCertificationDate( )
    {
        return _dateGenderCertificationDate;
    }

    public void setGenderCertificationDate( Date _dateGenderCertificationDate )
    {
        this._dateGenderCertificationDate = _dateGenderCertificationDate;
    }

    public String getFamilyNameValue( )
    {
        return _strFamilyNameValue;
    }

    public void setFamilyNameValue( String _strFamilyNameValue )
    {
        this._strFamilyNameValue = _strFamilyNameValue;
    }

    public String getFamilyNameCertifier( )
    {
        return _strFamilyNameCertifier;
    }

    public void setFamilyNameCertifier( String _strFamilyNameCertifier )
    {
        this._strFamilyNameCertifier = _strFamilyNameCertifier;
    }

    public Date getFamilyNameCertificationDate( )
    {
        return _dateFamilyNameCertificationDate;
    }

    public void setFamilyNameCertificationDate( Date _dateFamilyNameCertificationDate )
    {
        this._dateFamilyNameCertificationDate = _dateFamilyNameCertificationDate;
    }

    public String getPreferredUsernameValue( )
    {
        return _strPreferredUsernameValue;
    }

    public void setPreferredUsernameValue( String _strPreferredUsernameValue )
    {
        this._strPreferredUsernameValue = _strPreferredUsernameValue;
    }

    public String getPreferredUsernameCertifier( )
    {
        return _strPreferredUsernameCertifier;
    }

    public void setPreferredUsernameCertifier( String _strPreferredUsernameCertifier )
    {
        this._strPreferredUsernameCertifier = _strPreferredUsernameCertifier;
    }

    public Date getPreferredUsernameCertificationDate( )
    {
        return _datePreferredUsernameCertificationDate;
    }

    public void setPreferredUsernameCertificationDate( Date _datePreferredUsernameCertificationDate )
    {
        this._datePreferredUsernameCertificationDate = _datePreferredUsernameCertificationDate;
    }

    public String getFirstNameValue( )
    {
        return _strFirstNameValue;
    }

    public void setFirstNameValue( String _strFirstNameValue )
    {
        this._strFirstNameValue = _strFirstNameValue;
    }

    public String getFirstNameCertifier( )
    {
        return _strFirstNameCertifier;
    }

    public void setFirstNameCertifier( String _strFirstNameCertifier )
    {
        this._strFirstNameCertifier = _strFirstNameCertifier;
    }

    public Date getFirstNameCertificationDate( )
    {
        return _dateFirstNameCertificationDate;
    }

    public void setFirstNameCertificationDate( Date _dateFirstNameCertificationDate )
    {
        this._dateFirstNameCertificationDate = _dateFirstNameCertificationDate;
    }

    public Date getBirthdateValue( )
    {
        return _dateBirthdateValue;
    }

    public void setBirthdateValue( Date _strBirthdateValue )
    {
        this._dateBirthdateValue = _strBirthdateValue;
    }

    public String getBirthdateCertifier( )
    {
        return _strBirthdateCertifier;
    }

    public void setBirthdateCertifier( String _strBirthdateCertifier )
    {
        this._strBirthdateCertifier = _strBirthdateCertifier;
    }

    public Date getBirthdateCertificationDate( )
    {
        return _dateBirthdateCertificationDate;
    }

    public void setBirthdateCertificationDate( Date _dateBirthdateCertificationDate )
    {
        this._dateBirthdateCertificationDate = _dateBirthdateCertificationDate;
    }

    public String getBirthplaceCodeValue( )
    {
        return _strBirthplaceCodeValue;
    }

    public void setBirthplaceCodeValue( String _strBirthplaceCodeValue )
    {
        this._strBirthplaceCodeValue = _strBirthplaceCodeValue;
    }

    public String getBirthplaceCodeCertifier( )
    {
        return _strBirthplaceCodeCertifier;
    }

    public void setBirthplaceCodeCertifier( String _strBirthplaceCodeCertifier )
    {
        this._strBirthplaceCodeCertifier = _strBirthplaceCodeCertifier;
    }

    public Date getBirthplaceCodeCertificationDate( )
    {
        return _dateBirthplaceCodeCertificationDate;
    }

    public void setBirthplaceCodeCertificationDate( Date _dateBirthplaceCodeCertificationDate )
    {
        this._dateBirthplaceCodeCertificationDate = _dateBirthplaceCodeCertificationDate;
    }

    public String getBirthCountryCodeValue( )
    {
        return _strBirthCountryCodeValue;
    }

    public void setBirthCountryCodeValue( String _strBirthCountryCodeValue )
    {
        this._strBirthCountryCodeValue = _strBirthCountryCodeValue;
    }

    public String getBirthCountryCodeCertifier( )
    {
        return _strBirthCountryCodeCertifier;
    }

    public void setBirthCountryCodeCertifier( String _strBirthCountryCodeCertifier )
    {
        this._strBirthCountryCodeCertifier = _strBirthCountryCodeCertifier;
    }

    public Date getBirthCountryCodeCertificationDate( )
    {
        return _dateBirthCountryCodeCertificationDate;
    }

    public void setBirthCountryCodeCertificationDate( Date _dateBirthCountryCodeCertificationDate )
    {
        this._dateBirthCountryCodeCertificationDate = _dateBirthCountryCodeCertificationDate;
    }

    public String getBirthplaceValue( )
    {
        return _strBirthplaceValue;
    }

    public void setBirthplaceValue( String _strBirthplaceValue )
    {
        this._strBirthplaceValue = _strBirthplaceValue;
    }

    public String getBirthplaceCertifier( )
    {
        return _strBirthplaceCertifier;
    }

    public void setBirthplaceCertifier( String _strBirthplaceCertifier )
    {
        this._strBirthplaceCertifier = _strBirthplaceCertifier;
    }

    public Date getBirthplaceCertificationDate( )
    {
        return _dateBirthplaceCertificationDate;
    }

    public void setBirthplaceCertificationDate( Date _dateBirthplaceCertificationDate )
    {
        this._dateBirthplaceCertificationDate = _dateBirthplaceCertificationDate;
    }

    public String getBirthCountryValue( )
    {
        return _strBirthCountryValue;
    }

    public void setBirthCountryValue( String _strBirthCountryValue )
    {
        this._strBirthCountryValue = _strBirthCountryValue;
    }

    public String getBirthCountryCertifier( )
    {
        return _strBirthCountryCertifier;
    }

    public void setBirthCountryCertifier( String _strBirthCountryCertifier )
    {
        this._strBirthCountryCertifier = _strBirthCountryCertifier;
    }

    public Date getBirthCountryCertificationDate( )
    {
        return _dateBirthCountryCertificationDate;
    }

    public void setBirthCountryCertificationDate( Date _dateBirthCountryCertificationDate )
    {
        this._dateBirthCountryCertificationDate = _dateBirthCountryCertificationDate;
    }

    public String getEmailValue( )
    {
        return _strEmailValue;
    }

    public void setEmailValue( String _strEmailValue )
    {
        this._strEmailValue = _strEmailValue;
    }

    public String getEmailCertifier( )
    {
        return _strEmailCertifier;
    }

    public void setEmailCertifier( String _strEmailCertifier )
    {
        this._strEmailCertifier = _strEmailCertifier;
    }

    public Date getEmailCertificationDate( )
    {
        return _dateEmailCertificationDate;
    }

    public void setEmailCertificationDate( Date _dateEmailCertificationDate )
    {
        this._dateEmailCertificationDate = _dateEmailCertificationDate;
    }

    public String getMobilePhoneValue( )
    {
        return _strMobilePhoneValue;
    }

    public void setMobilePhoneValue( String _strMobilePhoneValue )
    {
        this._strMobilePhoneValue = _strMobilePhoneValue;
    }

    public String getMobilePhoneCertifier( )
    {
        return _strMobilePhoneCertifier;
    }

    public void setMobilePhoneCertifier( String _strMobilePhoneCertifier )
    {
        this._strMobilePhoneCertifier = _strMobilePhoneCertifier;
    }

    public Date getMobilePhoneCertificationDate( )
    {
        return _dateMobilePhoneCertificationDate;
    }

    public void setMobilePhoneCertificationDate( Date _dateMobilePhoneCertificationDate )
    {
        this._dateMobilePhoneCertificationDate = _dateMobilePhoneCertificationDate;
    }

    public String getFixedPhoneValue( )
    {
        return _strFixedPhoneValue;
    }

    public void setFixedPhoneValue( String _strFixedPhoneValue )
    {
        this._strFixedPhoneValue = _strFixedPhoneValue;
    }

    public String getFixedPhoneCertifier( )
    {
        return _strFixedPhoneCertifier;
    }

    public void setFixedPhoneCertifier( String _strFixedPhoneCertifier )
    {
        this._strFixedPhoneCertifier = _strFixedPhoneCertifier;
    }

    public Date getFixedPhoneCertificationDate( )
    {
        return _dateFixedPhoneCertificationDate;
    }

    public void setFixedPhoneCertificationDate( Date _dateFixedPhoneCertificationDate )
    {
        this._dateFixedPhoneCertificationDate = _dateFixedPhoneCertificationDate;
    }

    public String getAddressValue( )
    {
        return _strAddressValue;
    }

    public void setAddressValue( String _strAddressValue )
    {
        this._strAddressValue = _strAddressValue;
    }

    public String getAddressCertifier( )
    {
        return _strAddressCertifier;
    }

    public void setAddressCertifier( String _strAddressCertifier )
    {
        this._strAddressCertifier = _strAddressCertifier;
    }

    public Date getAddressCertificationDate( )
    {
        return _dateAddressCertificationDate;
    }

    public void setAddressCertificationDate( Date _dateAddressCertificationDate )
    {
        this._dateAddressCertificationDate = _dateAddressCertificationDate;
    }

    public String getAddressComplementValue( )
    {
        return _strAddressComplementValue;
    }

    public void setAddressComplementValue( String _strAddressComplementValue )
    {
        this._strAddressComplementValue = _strAddressComplementValue;
    }

    public String getAddressComplementCertifier( )
    {
        return _strAddressComplementCertifier;
    }

    public void setAddressComplementCertifier( String _strAddressComplementCertifier )
    {
        this._strAddressComplementCertifier = _strAddressComplementCertifier;
    }

    public Date getAddressComplementCertificationDate( )
    {
        return _dateAddressComplementCertificationDate;
    }

    public void setAddressComplementCertificationDate( Date _dateAddressComplementCertificationDate )
    {
        this._dateAddressComplementCertificationDate = _dateAddressComplementCertificationDate;
    }

    public String getAddressPostalCodeValue( )
    {
        return _strAddressPostalCodeValue;
    }

    public void setAddressPostalCodeValue( String _strAddressPostalCodeValue )
    {
        this._strAddressPostalCodeValue = _strAddressPostalCodeValue;
    }

    public String getAddressPostalCodeCertifier( )
    {
        return _strAddressPostalCodeCertifier;
    }

    public void setAddressPostalCodeCertifier( String _strAddressPostalCodeCertifier )
    {
        this._strAddressPostalCodeCertifier = _strAddressPostalCodeCertifier;
    }

    public Date getAddressPostalCodeCertificationDate( )
    {
        return _dateAddressPostalCodeCertificationDate;
    }

    public void setAddressPostalCodeCertificationDate( Date _dateAddressPostalCodeCertificationDate )
    {
        this._dateAddressPostalCodeCertificationDate = _dateAddressPostalCodeCertificationDate;
    }

    public String getAddressCityValue( )
    {
        return _strAddressCityValue;
    }

    public void setAddressCityValue( String _strAddressCityValue )
    {
        this._strAddressCityValue = _strAddressCityValue;
    }

    public String getAddressCityCertifier( )
    {
        return _strAddressCityCertifier;
    }

    public void setAddressCityCertifier( String _strAddressCityCertifier )
    {
        this._strAddressCityCertifier = _strAddressCityCertifier;
    }

    public Date getAddressCityCertificationDate( )
    {
        return _dateAddressCityCertificationDate;
    }

    public void setAddressCityCertificationDate( Date _dateAddressCityCertificationDate )
    {
        this._dateAddressCityCertificationDate = _dateAddressCityCertificationDate;
    }
}
