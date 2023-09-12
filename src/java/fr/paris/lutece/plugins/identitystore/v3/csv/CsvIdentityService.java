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

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.AttributeDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.IdentityDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.util.Constants;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This service id dedicated to CSV format of {@link IdentityDto}
 */
public class CsvIdentityService
{

    private static CsvIdentityService instance;

    public static CsvIdentityService instance( )
    {
        if ( instance == null )
        {
            instance = new CsvIdentityService( );
        }
        return instance;
    }

    public List<IdentityDto> read( final InputStream inputStream ) throws IdentityStoreException
    {
        try
        {
            final InputStreamReader inputStreamReader = new InputStreamReader( inputStream );
            final CsvToBean<CsvIdentity> identitiesParser = new CsvToBeanBuilder<CsvIdentity>( inputStreamReader ).withSeparator( Constants.CSV_SEPARATOR )
                    .withType( CsvIdentity.class ).withSkipLines( 1 ).build( );
            return this.extractIdentityDtos( identitiesParser.parse( ) );
        }
        catch( Exception e )
        {
            throw new IdentityStoreException( "An error occurred while processing file " + e );
        }

    }

    public byte [ ] write( final List<IdentityDto> identities ) throws IdentityStoreException
    {
        try
        {
            final ByteArrayOutputStream out = new ByteArrayOutputStream( );
            final Writer writer = new OutputStreamWriter( out );
            final CustomMappingStrategy<CsvIdentity> mappingStrategy = new CustomMappingStrategy<>( );
            mappingStrategy.setType( CsvIdentity.class );
            final StatefulBeanToCsv<CsvIdentity> identitiesWriter = new StatefulBeanToCsvBuilder<CsvIdentity>( writer ).withMappingStrategy( mappingStrategy )
                    .withOrderedResults( true ).withSeparator( Constants.CSV_SEPARATOR ).withApplyQuotesToAll( false ).build( );
            identitiesWriter.write( this.extractCsvIdentities( identities ) );
            writer.close( );
            return out.toByteArray( );
        }
        catch( Exception e )
        {
            throw new IdentityStoreException( "An error occurred while exporting csv identities. ", e );
        }
    }

    public List<IdentityDto> extractIdentityDtos( final List<CsvIdentity> csvIdentities )
    {
        return csvIdentities.stream( ).map( csvIdentity -> {
            final IdentityDto identityDto = new IdentityDto( );
            identityDto.setExternalCustomerId( csvIdentity.getExternalCustomerId( ) );
            identityDto.setCustomerId( csvIdentity.getCustomerId( ) );
            if ( StringUtils.isNotEmpty( csvIdentity.getGenderValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getGenderCertifier( ) )
                    || csvIdentity.getGenderCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_GENDER );
                attributeDto.setValue( csvIdentity.getGenderValue( ) );
                attributeDto.setCertifier( csvIdentity.getGenderCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getGenderCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getFamilyNameValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getFamilyNameCertifier( ) )
                    || csvIdentity.getFamilyNameCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_FAMILY_NAME );
                attributeDto.setValue( csvIdentity.getGenderValue( ) );
                attributeDto.setCertifier( csvIdentity.getGenderCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getGenderCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getPreferredUsernameValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getPreferredUsernameCertifier( ) )
                    || csvIdentity.getPreferredUsernameCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_PREFERRED_USERNAME );
                attributeDto.setValue( csvIdentity.getPreferredUsernameValue( ) );
                attributeDto.setCertifier( csvIdentity.getPreferredUsernameCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getPreferredUsernameCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getFirstNameValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getFirstNameCertifier( ) )
                    || csvIdentity.getFirstNameCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_FIRST_NAME );
                attributeDto.setValue( csvIdentity.getFirstNameValue( ) );
                attributeDto.setCertifier( csvIdentity.getFirstNameCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getFirstNameCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( csvIdentity.getBirthdateValue( ) != null || StringUtils.isNotEmpty( csvIdentity.getBirthdateCertifier( ) )
                    || csvIdentity.getBirthdateCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_BIRTH_DATE );
                if ( csvIdentity.getBirthdateValue( ) != null )
                {
                    attributeDto.setValue( DateFormatUtils.format( csvIdentity.getBirthdateValue( ), Constants.CSV_DATE_FORMAT ) );
                }
                attributeDto.setCertifier( csvIdentity.getBirthdateCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getBirthdateCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getBirthplaceCodeValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getBirthplaceCodeCertifier( ) )
                    || csvIdentity.getBirthplaceCodeCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_BIRTH_PLACE_CODE );
                attributeDto.setValue( csvIdentity.getBirthplaceCodeValue( ) );
                attributeDto.setCertifier( csvIdentity.getBirthplaceCodeCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getBirthplaceCodeCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getBirthCountryCodeValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getBirthCountryCodeCertifier( ) )
                    || csvIdentity.getBirthCountryCodeCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_BIRTH_COUNTRY_CODE );
                attributeDto.setValue( csvIdentity.getBirthCountryCodeValue( ) );
                attributeDto.setCertifier( csvIdentity.getBirthCountryCodeCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getBirthCountryCodeCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getBirthplaceValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getBirthplaceCertifier( ) )
                    || csvIdentity.getBirthplaceCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_BIRTH_PLACE );
                attributeDto.setValue( csvIdentity.getBirthplaceValue( ) );
                attributeDto.setCertifier( csvIdentity.getBirthplaceCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getBirthplaceCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getBirthCountryValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getBirthCountryCertifier( ) )
                    || csvIdentity.getBirthCountryCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_BIRTH_COUNTRY );
                attributeDto.setValue( csvIdentity.getBirthCountryValue( ) );
                attributeDto.setCertifier( csvIdentity.getBirthCountryCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getBirthCountryCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getEmailValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getEmailCertifier( ) )
                    || csvIdentity.getEmailCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_EMAIL );
                attributeDto.setValue( csvIdentity.getEmailValue( ) );
                attributeDto.setCertifier( csvIdentity.getEmailCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getEmailCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getLoginValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getLoginCertifier( ) )
                    || csvIdentity.getLoginCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_LOGIN );
                attributeDto.setValue( csvIdentity.getLoginValue( ) );
                attributeDto.setCertifier( csvIdentity.getLoginCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getLoginCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getMobilePhoneValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getMobilePhoneCertifier( ) )
                    || csvIdentity.getMobilePhoneCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_MOBILE_PHONE );
                attributeDto.setValue( csvIdentity.getMobilePhoneValue( ) );
                attributeDto.setCertifier( csvIdentity.getMobilePhoneCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getMobilePhoneCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getFixedPhoneValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getFixedPhoneValue( ) )
                    || csvIdentity.getFixedPhoneCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_FIXED_PHONE );
                attributeDto.setValue( csvIdentity.getFixedPhoneValue( ) );
                attributeDto.setCertifier( csvIdentity.getFixedPhoneCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getFixedPhoneCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getAddressValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getAddressCertifier( ) )
                    || csvIdentity.getAddressCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_ADDRESS );
                attributeDto.setValue( csvIdentity.getAddressValue( ) );
                attributeDto.setCertifier( csvIdentity.getAddressCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getAddressCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getAddressComplementValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getAddressComplementCertifier( ) )
                    || csvIdentity.getAddressComplementCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_ADDRESS_COMPLEMENT );
                attributeDto.setValue( csvIdentity.getAddressComplementValue( ) );
                attributeDto.setCertifier( csvIdentity.getAddressComplementCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getAddressComplementCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getAddressPostalCodeValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getAddressPostalCodeCertifier( ) )
                    || csvIdentity.getAddressPostalCodeCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_ADDRESS_POSTAL_CODE );
                attributeDto.setValue( csvIdentity.getAddressPostalCodeValue( ) );
                attributeDto.setCertifier( csvIdentity.getAddressPostalCodeCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getAddressPostalCodeCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            if ( StringUtils.isNotEmpty( csvIdentity.getAddressCityValue( ) ) || StringUtils.isNotEmpty( csvIdentity.getAddressCityCertifier( ) )
                    || csvIdentity.getAddressCityCertificationDate( ) != null )
            {
                final AttributeDto attributeDto = new AttributeDto( );
                attributeDto.setKey( Constants.PARAM_ADDRESS_CITY );
                attributeDto.setValue( csvIdentity.getAddressCityValue( ) );
                attributeDto.setCertifier( csvIdentity.getAddressCityCertifier( ) );
                attributeDto.setCertificationDate( csvIdentity.getAddressCityCertificationDate( ) );
                identityDto.getAttributes( ).add( attributeDto );
            }
            return identityDto;
        } ).collect( Collectors.toList( ) );
    }

    public List<CsvIdentity> extractCsvIdentities( final List<IdentityDto> identities )
    {
        return identities.stream( ).map( identityDto -> {
            final CsvIdentity csvIdentity = new CsvIdentity( );
            csvIdentity.setExternalCustomerId( identityDto.getCustomerId( ) );
            csvIdentity.setCustomerId( identityDto.getCustomerId( ) );
            identityDto.getAttributes( ).forEach( attributeDto -> {
                switch( attributeDto.getKey( ) )
                {
                    case Constants.PARAM_GENDER:
                        csvIdentity.setGenderValue( attributeDto.getValue( ) );
                        csvIdentity.setGenderCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setGenderCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_FAMILY_NAME:
                        csvIdentity.setFamilyNameValue( attributeDto.getValue( ) );
                        csvIdentity.setFamilyNameCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setFamilyNameCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_PREFERRED_USERNAME:
                        csvIdentity.setPreferredUsernameValue( attributeDto.getValue( ) );
                        csvIdentity.setPreferredUsernameCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setPreferredUsernameCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_FIRST_NAME:
                        csvIdentity.setFirstNameValue( attributeDto.getValue( ) );
                        csvIdentity.setFirstNameCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setFirstNameCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_BIRTH_DATE:
                        try
                        {
                            if ( StringUtils.isNotEmpty( attributeDto.getValue( ) ) )
                            {
                                csvIdentity.setBirthdateValue( DateUtils.parseDate( attributeDto.getValue( ), Constants.CSV_DATE_FORMAT ) );
                            }
                            else
                            {
                                csvIdentity.setBirthdateValue( null );
                            }
                            csvIdentity.setBirthdateCertifier( attributeDto.getCertifier( ) );
                            csvIdentity.setBirthdateCertificationDate( attributeDto.getCertificationDate( ) );
                        }
                        catch( ParseException e )
                        {
                            throw new RuntimeException( e );
                        }

                        break;
                    case Constants.PARAM_BIRTH_PLACE_CODE:
                        csvIdentity.setBirthplaceCodeValue( attributeDto.getValue( ) );
                        csvIdentity.setBirthplaceCodeCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setBirthplaceCodeCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_BIRTH_COUNTRY_CODE:
                        csvIdentity.setBirthCountryCodeValue( attributeDto.getValue( ) );
                        csvIdentity.setBirthCountryCodeCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setBirthCountryCodeCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_BIRTH_PLACE:
                        csvIdentity.setBirthplaceValue( attributeDto.getValue( ) );
                        csvIdentity.setBirthplaceCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setBirthplaceCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_BIRTH_COUNTRY:
                        csvIdentity.setBirthCountryValue( attributeDto.getValue( ) );
                        csvIdentity.setBirthCountryCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setBirthCountryCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_EMAIL:
                        csvIdentity.setEmailValue( attributeDto.getValue( ) );
                        csvIdentity.setEmailCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setEmailCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_LOGIN:
                        csvIdentity.setLoginValue( attributeDto.getValue( ) );
                        csvIdentity.setLoginCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setLoginCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_MOBILE_PHONE:
                        csvIdentity.setMobilePhoneValue( attributeDto.getValue( ) );
                        csvIdentity.setMobilePhoneCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setMobilePhoneCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_FIXED_PHONE:
                        csvIdentity.setFixedPhoneValue( attributeDto.getValue( ) );
                        csvIdentity.setFixedPhoneCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setFixedPhoneCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_ADDRESS:
                        csvIdentity.setAddressValue( attributeDto.getValue( ) );
                        csvIdentity.setAddressCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setAddressCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_ADDRESS_COMPLEMENT:
                        csvIdentity.setAddressComplementValue( attributeDto.getValue( ) );
                        csvIdentity.setAddressComplementCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setAddressComplementCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_ADDRESS_POSTAL_CODE:
                        csvIdentity.setAddressPostalCodeValue( attributeDto.getValue( ) );
                        csvIdentity.setAddressPostalCodeCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setAddressPostalCodeCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    case Constants.PARAM_ADDRESS_CITY:
                        csvIdentity.setAddressCityValue( attributeDto.getValue( ) );
                        csvIdentity.setAddressCityCertifier( attributeDto.getCertifier( ) );
                        csvIdentity.setAddressCityCertificationDate( attributeDto.getCertificationDate( ) );
                        break;
                    default:
                        break;
                }
            } );
            return csvIdentity;
        } ).collect( Collectors.toList( ) );
    }
}
