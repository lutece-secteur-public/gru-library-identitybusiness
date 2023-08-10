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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.util;

/**
 * This class provides constants for REST services
 *
 */
public final class Constants
{
    public static final String PROPERTY_APPLICATION_VERSION = "identitystore.version";
    public static final String VERSION_PATH_V1 = "/v1";
    public static final String VERSION_PATH_V2 = "/v2";
    public static final String VERSION_PATH_V3 = "/v3";
    public static final String IDENTITY_PATH = "/identity";
    public static final String SERVICECONTRACT_PATH = "/contract";
    public static final String DOWNLOAD_FILE_PATH = "/file";
    public static final String UPDATE_IDENTITY_PATH = "/update";
    public static final String UPDATED_IDENTITIES_PATH = "/updated";
    public static final String CREATE_IDENTITY_PATH = "/create";
    public static final String IMPORT_IDENTITY_PATH = "/import";
    public static final String SEARCH_IDENTITIES_PATH = "/search";
    public static final String MERGE_IDENTITIES_PATH = "/merge";
    public static final String CANCEL_MERGE_IDENTITIES_PATH = "/unmerge";
    public static final String APPLICATION_RIGHTS_PATH = "/apprights";
    public static final String PARAM_CLIENT_CODE = "client_code";
    public static final String PARAM_APPLICATION_CODE = "application_code";
    public static final String PARAM_DAYS = "days";
    public static final String PARAM_CERTIFIER_CODE = "certifier_code";
    public static final String PARAM_FILE = "file";
    public static final String PARAM_ATTRIBUTE_KEY = "attribute_key";
    public static final String PLUGIN_PATH = "identitystore";
    public static final String RESPONSE_OK = "OK";
    public static final String PARAM_IDENTITY_CHANGE = "identityChange";
    public static final String ERROR_FIELD_MISSING = "FIELD_MISSING";
    public static final String ERROR_FIELD_PERMISSION = "FIELD_PERMISION_ERROR";
    public static final String PARAMETER_NAME = "name";
    public static final String CERTIFY_ATTRIBUTES_PATH = "/certify";

    /** Geocodes */
    public static final String SEARCH_PATH = "/search/{" + Constants.SEARCHED_STRING + "}";
    public static final String SEARCHED_STRING = "searched_string";
    public static final String VERSION = "version";
    public static final String ERROR_NOT_FOUND_VERSION = "Version not found";
    public static final String ERROR_NOT_FOUND_RESOURCE = "Resource not found";
    public static final String ERROR_SEARCH_STRING = "Search string must contain 3 chars at least";
    public static final String ID = "id";
    public static final String ID_PATH = "/{" + Constants.ID + "}";
    public static final String EMPTY_OBJECT = "{}";

    /** The Constant CONTENT_FORMAT. */
    public static final String CONTENT_FORMAT_CHARSET = "application/json; charset=utf-8";

    // HTTP ERROR MESSAGE
    public static final String ERROR_MESSAGE = "Failed : HTTP error code : ";
    public static final String NO_CUSTOMER_ID = "";

    /** Attribute keys */
    public static final String PARAM_ID_CONNECTION = "connection_id";
    public static final String PARAM_ID_CUSTOMER = "customer_id";
    public static final String PARAM_GENDER = "gender";
    public static final String PARAM_FAMILY_NAME = "family_name";
    public static final String PARAM_PREFERRED_USERNAME = "preferred_username";
    public static final String PARAM_FIRST_NAME = "first_name";
    public static final String PARAM_BIRTH_DATE = "birthdate";
    public static final String PARAM_BIRTH_PLACE_CODE = "birthplace_code";
    public static final String PARAM_BIRTH_COUNTRY_CODE = "birthcountry_code";
    public static final String PARAM_BIRTH_PLACE = "birthplace";
    public static final String PARAM_BIRTH_COUNTRY = "birthcountry";
    public static final String PARAM_EMAIL = "email";
    public static final String PARAM_LOGIN = "login";
    public static final String PARAM_MOBILE_PHONE = "mobile_phone";
    public static final String PARAM_FIXED_PHONE = "fixed_phone";
    public static final String PARAM_ADDRESS = "address";
    public static final String PARAM_ADDRESS_COMPLEMENT = "address_detail";
    public static final String PARAM_ADDRESS_POSTAL_CODE = "address_postal_code";
    public static final String PARAM_ADDRESS_CITY = "address_city";
    public static final String PARAM_FC_KEY = "fc_key";

    /** Service Contract */
    public static final String SERVICECONTRACTS_PATH = "/contracts";
    public static final String SERVICECONTRACT_END_DATE_PATH = "/enddate";
    public static final String PARAM_ID_SERVICE_CONTRACT = "service_contract_id";

    /** Client application */
    public static final String CLIENTS_PATH = "/clients";
    public static final String CLIENT_PATH = "/client";

    /** Referential */
    public static final String REFERENTIAL_PATH = "/referential";
    public static final String REFERENTIAL_LEVEL_PATH = "/level";
    public static final String REFERENTIAL_PROCESSUS_PATH = "/processus";

    /** Attribute keys for user search */
    public static final String PARAM_COMMON_EMAIL = "common_email";
    public static final String PARAM_COMMON_PHONE = "common_phone";
    public static final String PARAM_COMMON_LASTNAME = "common_lastname";

    /** Module identity quality */
    public static final String QUALITY_PATH = "/quality";
    public static final String SUSPICIONS_PATH = "suspicions";
    public static final String LOCK_PATH = "lock";
    public static final String EXCLUSION_PATH = "exclusion";
    public static final String RULES_PATH = "rules";
    public static final String DUPLICATE_PATH = "duplicate";
    public static final int MANUAL_SUSPICIOUS_RULE_ID = 0;
    public static final String PARAM_MAX = "max";
    public static final String PARAM_SIZE = "size";
    public static final String PARAM_PAGE = "page";
    public static final String PARAM_RULE_PRIORITY = "priority";
    public static final String PARAM_RULE_CODE = "code";

    /** History and metadata */
    public static final String HISTORY_PATH = "/history";
    public static final String METADATA_EXCLUDED_CUID_KEY = "excluded_cuid";
    public static final String METADATA_DUPLICATE_RULE_CODE = "duplicate_rule_code";
    public static final String METADATA_MERGED_MASTER_IDENTITY_CUID = "merged_master_identity_cuid";
    public static final String METADATA_MERGED_CHILD_IDENTITY_CUID = "merged_child_identity_cuid";
    public static final String METADATA_UNMERGED_MASTER_CUID = "unmerged_master_cuid";
    public static final String METADATA_UNMERGED_CHILD_CUID = "unmerged_child_cuid";

    /**
     * Default constructor
     */
    private Constants( )
    {
    }
}
