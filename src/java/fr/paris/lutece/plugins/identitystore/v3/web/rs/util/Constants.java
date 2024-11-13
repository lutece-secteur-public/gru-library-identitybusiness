/*
 * Copyright (c) 2002-2024, City of Paris
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
    public static final String VERSION_PATH_V1 = "/v1";
    public static final String VERSION_PATH_V2 = "/v2";
    public static final String VERSION_PATH_V3 = "/v3";
    public static final String IDENTITY_PATH = "/identity";
    public static final String SERVICECONTRACT_PATH = "/contract";
    public static final String ACTIVE_SERVICE_CONTRACT_PATH = SERVICECONTRACT_PATH + "/active";
    public static final String DOWNLOAD_FILE_PATH = "/file";
    public static final String UPDATE_IDENTITY_PATH = "/update";
    public static final String UPDATED_IDENTITIES_PATH = "/updated";
    public static final String CREATE_IDENTITY_PATH = "/create";
    public static final String IMPORT_IDENTITY_PATH = "/import";
    public static final String SEARCH_IDENTITIES_PATH = "/search";
    public static final String MERGE_IDENTITIES_PATH = "/merge";
    public static final String CANCEL_MERGE_IDENTITIES_PATH = "/unmerge";
    public static final String APPLICATION_RIGHTS_PATH = "/apprights";
    public static final String EXPORT_IDENTITIES_PATH = "/export";
    public static final String PARAM_AUTHOR_NAME = "author_name";
    public static final String PARAM_AUTHOR_TYPE = "author_type";
    public static final String PARAM_MODIFICATION_DATE = "modification_date";

    public static final String PARAM_CLIENT_CODE = "client_code";
    public static final String PARAM_TARGET_CLIENT_CODE = "target_client_code";
    public static final String PARAM_APPLICATION_CODE = "application_code";
    public static final String PARAM_CLIENT_TOKEN = "client_token";
    public static final String PARAM_DAYS = "days";
    public static final String PARAM_CERTIFIER_CODE = "certifier_code";
    public static final String PARAM_FILE = "file";
    public static final String PARAM_ATTRIBUTE_KEY = "attribute_key";
    public static final String PLUGIN_PATH = "identitystore";
    public static final String INTERNAL_API_PATH = "/internal/api/";
    public static final String RESPONSE_OK = "OK";
    public static final String PARAM_IDENTITY_CHANGE = "identityChange";
    public static final String ERROR_FIELD_MISSING = "FIELD_MISSING";
    public static final String ERROR_FIELD_PERMISSION = "FIELD_PERMISION_ERROR";
    public static final String PARAMETER_NAME = "name";
    public static final String CERTIFY_ATTRIBUTES_PATH = "/certify";
    public static final String UNCERTIFY_ATTRIBUTES_PATH = "/uncertify";
    
    public static final String CONSTANT_DEFAULT_IDENTITY_PATH = "/identity";
    public static final String CONSTANT_DEFAULT_TASKSTACK_PATH = "/taskstack";

    /**
     * Tasks
     */
    public static final String TASK_PATH = "/task";
    public static final String TASK_STATUS_PATH = "/status";
    public static final String SEARCH_TASK_PATH = "/search";
    public static final String PARAM_RESOURCE_ID = "resource_id";
    public static final String PARAM_RESOURCE_TYPE = "resource_type";
    public static final String PARAM_CHANGE_TYPE = "change_type";
    public static final String PARAM_CHANGE_STATUS = "status";


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
    public static final String GEOCODE_MAIN_COUNTRY_CODE = "99100";

    /** The Constant CONTENT_FORMAT. */
    public static final String CONTENT_FORMAT_CHARSET = "application/json; charset=utf-8";

    // HTTP Headers
    public static final String APPLICATION_JSON = "application/json";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String ACCEPT = "Accept";
    public static final String AUTHORIZATION = "Authorization";
    public static final String APPLICATION_FORM_URLENCODED = "application/x-www-form-urlencoded";

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

    /** CSV */
    private static final String CERTIFIER_SUFFIX = "_certifier";
    private static final String CERTIFICATION_DATE_SUFFIX = "_certification_date";
    public static final String CSV_DATE_FORMAT = "dd/MM/yyyy";
    public static final char CSV_SEPARATOR = ';';
    public static final String PARAM_CERTIFIER_GENDER = PARAM_GENDER + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_GENDER = PARAM_GENDER + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_FAMILY_NAME = PARAM_FAMILY_NAME + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_FAMILY_NAME = PARAM_FAMILY_NAME + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_PREFERRED_USERNAME = PARAM_PREFERRED_USERNAME + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_PREFERRED_USERNAME = PARAM_PREFERRED_USERNAME + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_FIRST_NAME = PARAM_FIRST_NAME + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_FIRST_NAME = PARAM_FIRST_NAME + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_BIRTH_DATE = PARAM_BIRTH_DATE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_BIRTH_DATE = PARAM_BIRTH_DATE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_BIRTH_PLACE_CODE = PARAM_BIRTH_PLACE_CODE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_BIRTH_PLACE_CODE = PARAM_BIRTH_PLACE_CODE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_BIRTH_COUNTRY_CODE = PARAM_BIRTH_COUNTRY_CODE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_BIRTH_COUNTRY_CODE = PARAM_BIRTH_COUNTRY_CODE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_BIRTH_PLACE = PARAM_BIRTH_PLACE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_BIRTH_PLACE = PARAM_BIRTH_PLACE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_BIRTH_COUNTRY = PARAM_BIRTH_COUNTRY + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_BIRTH_COUNTRY = PARAM_BIRTH_COUNTRY + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_EMAIL = PARAM_EMAIL + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_EMAIL = PARAM_EMAIL + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_LOGIN = PARAM_LOGIN + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_LOGIN = PARAM_LOGIN + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_MOBILE_PHONE = PARAM_MOBILE_PHONE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_MOBILE_PHONE = PARAM_MOBILE_PHONE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_FIXED_PHONE = PARAM_FIXED_PHONE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_FIXED_PHONE = PARAM_FIXED_PHONE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_ADDRESS = PARAM_ADDRESS + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_ADDRESS = PARAM_ADDRESS + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_ADDRESS_COMPLEMENT = PARAM_ADDRESS_COMPLEMENT + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_ADDRESS_COMPLEMENT = PARAM_ADDRESS_COMPLEMENT + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_ADDRESS_POSTAL_CODE = PARAM_ADDRESS_POSTAL_CODE + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_ADDRESS_POSTAL_CODE = PARAM_ADDRESS_POSTAL_CODE + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_CERTIFIER_ADDRESS_CITY = PARAM_ADDRESS_CITY + CERTIFIER_SUFFIX;
    public static final String PARAM_CERTIFICATION_DATE_ADDRESS_CITY = PARAM_ADDRESS_CITY + CERTIFICATION_DATE_SUFFIX;
    public static final String PARAM_EXTERNAL_ID_CUSTOMER = "external_customer_id";

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
    public static final String REFERENTIAL_ATTRIBUTE_KEYS_PATH = "/attributes";
    public static final String REFERENTIAL_PROCESSUS_PATH = "/processus";

    /** Import */
    public static final String BATCH_PATH = "/batch";
    public static final String BATCH_STATUS_PATH = "/status";
    public static final String PARAM_BATCH_REFERENCE = "batch_reference";
    public static final String PARAM_BATCH_STATUS_MODE = "mode";

    /** Account Generator */
    public static final String GENERATOR_PATH = "/generator";
    public static final String ACCOUNT_GENERATOR_PATH = "/account";
    public static final String GENERATE_PATH = "/generate";

    /** Attribute keys for user search */
    public static final String PARAM_COMMON_EMAIL = "common_email";
    public static final String PARAM_COMMON_PHONE = "common_phone";
    public static final String PARAM_COMMON_LASTNAME = "common_lastname";

    /** Module identity quality */
    public static final String QUALITY_PATH = "/quality";
    public static final String SUSPICIONS_PATH = "suspicions";
    public static final String LOCK_PATH = "lock";
    public static final String EXCLUSION_PATH = "/exclusion";
    public static final String CANCEL_IDENTITIES_EXCLUSION_PATH = "/unexclude";
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
    public static final String SEARCH_HISTORY_PATH = "/search";
    public static final String METADATA_EXCLUDED_CUID_KEY = "excluded_cuid";
    public static final String METADATA_DUPLICATE_RULE_CODE = "duplicate_rule_code";
    public static final String METADATA_MERGED_MASTER_IDENTITY_CUID = "merged_master_identity_cuid";
    public static final String METADATA_MERGED_CHILD_IDENTITY_CUID = "merged_child_identity_cuid";
    public static final String METADATA_UNMERGED_MASTER_CUID = "unmerged_master_cuid";
    public static final String METADATA_UNMERGED_CHILD_CUID = "unmerged_child_cuid";
    public static final String METADATA_ACCOUNT_MERGE_SECOND_CUID = "account_merge_second_cuid";
    public static final String METADATA_OLD_GUID = "old_guid";
    public static final String METADATA_NEW_GUID = "new_guid";
    public static final String METADATA_OLD_MON_PARIS_ACTIF = "old_mon_paris_actif";
    public static final String METADATA_NEW_MON_PARIS_ACTIF = "new_mon_paris_actif";
    public static final String METADATA_ORIGIN = "origin";

    /** Global Properties */
    public static final String PROPERTY_APPLICATION_VERSION = "identitystore.version";

    /** REST message properties */
    public static final String PROPERTY_REST_ERROR_DURING_TREATMENT = "identitystore.rest.error.during.treatment";
    public static final String PROPERTY_REST_ERROR_API_COMMUNICATION = "identitystore.rest.error.api.communication";
    public static final String PROPERTY_REST_PAGINATION_START_ERROR = "identitystore.rest.error.pagination.start";
    public static final String PROPERTY_REST_PAGE_SIZE_ERROR = "identitystore.rest.error.page.size";
    public static final String PROPERTY_REST_PAGINATION_END_ERROR = "identitystore.rest.error.pagination.end";
    public static final String PROPERTY_REST_ERROR_NO_IDENTITY_FOUND = "identitystore.rest.error.no.identity.found";
    public static final String PROPERTY_REST_ERROR_IDENTITY_DELETED = "identitystore.rest.error.identity.deleted";
    public static final String PROPERTY_REST_ERROR_NO_SERVICE_CONTRACT_FOUND = "identitystore.rest.error.no.service.contract.found";
    public static final String PROPERTY_REST_ERROR_DAYS_NUMERIC_FORMAT = "identitystore.rest.error.days.numeric.format";
    public static final String PROPERTY_REST_ERROR_CLIENT_ALREADY_EXISTS = "identitystore.rest.error.client.already.exists";
    public static final String PROPERTY_REST_ERROR_NO_CLIENT_FOUND = "identitystore.rest.error.no.client.found";
    public static final String PROPERTY_REST_ERROR_FAIL_ATTRIBUTE_VALIDATION = "identitystore.rest.error.fail.attribute.validation";
    public static final String PROPERTY_REST_ERROR_SERVICE_CONTRACT_VIOLATION = "identitystore.rest.error.service.contract.violation";
    public static final String PROPERTY_REST_ERROR_MERGE_UNAUTHORIZED = "identitystore.rest.error.merge.unauthorized";
    public static final String PROPERTY_REST_ERROR_IMPORT_UNAUTHORIZED = "identitystore.rest.error.import.unauthorized";
    public static final String PROPERTY_REST_ERROR_NO_POTENTIAL_DUPLICATE_FOUND = "identitystore.rest.error.no.potential.duplicate.found";
    public static final String PROPERTY_REST_ERROR_NO_DUPLICATE_RULE_CODE_SENT = "identitystore.rest.error.no.duplicate.rule.code.sent";
    public static final String PROPERTY_REST_ERROR_NO_ATTRIBUTE_SENT = "identitystore.rest.error.no.attribute.sent";
    public static final String PROPERTY_REST_ERROR_UNKNOWN_DUPLICATE_RULE_CODE = "identitystore.rest.error.unknown.duplicate.rule.code";
    public static final String PROPERTY_REST_ERROR_INACTIVE_DUPLICATE_RULE = "identitystore.rest.error.inactive.duplicate.rule";
    public static final String PROPERTY_REST_ERROR_UNKNOWN_ATTRIBUTE_KEY = "identitystore.rest.error.unknown.attribute.key";
    public static final String PROPERTY_REST_ERROR_CREATE_UNAUTHORIZED = "identitystore.rest.error.create.unauthorized";
    public static final String PROPERTY_REST_ERROR_MISSING_MANDATORY_ATTRIBUTES = "identitystore.rest.error.missing.mandatory.attributes";
    public static final String PROPERTY_REST_ERROR_UPDATE_UNAUTHORIZED = "identitystore.rest.error.update.unauthorized";
    public static final String PROPERTY_REST_ERROR_NO_MATCHING_IDENTITY = "identitystore.rest.error.no.matching.identity";
    public static final String PROPERTY_REST_ERROR_UPDATE_CONFLICT = "identitystore.rest.error.update.conflict";
    public static final String PROPERTY_REST_ERROR_FORBIDDEN_UPDATE_ON_MERGED_IDENTITY = "identitystore.rest.error.forbidden.update.on.merged.identity";
    public static final String PROPERTY_REST_ERROR_FORBIDDEN_UPDATE_ON_DELETED_IDENTITY = "identitystore.rest.error.forbidden.update.on.deleted.identity";
    public static final String PROPERTY_REST_ERROR_FORBIDDEN_MON_PARIS_ACTIVE_UPDATE = "identitystore.rest.error.forbidden.mon.paris.active.update";
    public static final String PROPERTY_REST_ERROR_CONFLICT_CONNECTION_ID = "identitystore.rest.error.conflict.connection.id";
    public static final String PROPERTY_REST_ERROR_PRIMARY_IDENTITY_NOT_FOUND = "identitystore.rest.error.primary.identity.not.found";
    public static final String PROPERTY_REST_ERROR_PRIMARY_IDENTITY_DELETED = "identitystore.rest.error.primary.identity.deleted";
    public static final String PROPERTY_REST_ERROR_PRIMARY_IDENTITY_MERGED = "identitystore.rest.error.primary.identity.merged";
    public static final String PROPERTY_REST_ERROR_PRIMARY_IDENTITY_UPDATE_CONFLICT = "identitystore.rest.error.primary.identity.update.conflict";
    public static final String PROPERTY_REST_ERROR_SECONDARY_IDENTITY_NOT_FOUND = "identitystore.rest.error.secondary.identity.not.found";
    public static final String PROPERTY_REST_ERROR_SECONDARY_IDENTITY_DELETED = "identitystore.rest.error.secondary.identity.deleted";
    public static final String PROPERTY_REST_ERROR_SECONDARY_IDENTITY_MERGED = "identitystore.rest.error.secondary.identity.merged";
    public static final String PROPERTY_REST_ERROR_SECONDARY_IDENTITY_UPDATE_CONFLICT = "identitystore.rest.error.secondary.identity.update.conflict";
    public static final String PROPERTY_REST_ERROR_SECONDARY_IDENTITY_NOT_MERGED = "identitystore.rest.error.secondary.identity.not.merged";
    public static final String PROPERTY_REST_ERROR_IDENTITIES_NOT_MERGED_TOGETHER = "identitystore.rest.error.identities.not.merged.together";
    public static final String PROPERTY_REST_ERROR_DELETE_UNAUTHORIZED = "identitystore.rest.error.delete.unauthorized";
    public static final String PROPERTY_REST_ERROR_IDENTITY_NOT_FOUND = "identitystore.rest.error.identity.not.found";
    public static final String PROPERTY_REST_ERROR_IDENTITY_ALREADY_DELETED = "identitystore.rest.error.identity.already.deleted";
    public static final String PROPERTY_REST_ERROR_FORBIDDEN_DELETE_ON_MERGED_IDENTITY = "identitystore.rest.error.forbidden.delete.on.merged.identity";
    public static final String PROPERTY_REST_ERROR_APPLICATION_NOT_FOUND = "identitystore.rest.error.application.not.found";
    public static final String PROPERTY_REST_ERROR_SERVICE_CONTRACT_NOT_FOUND = "identitystore.rest.error.service.contract.not.found";
    public static final String PROPERTY_REST_ERROR_UNAUTHORIZED_OPERATION = "identitystore.rest.error.unauthorized.operation";
    public static final String PROPERTY_REST_ERROR_SEARCH_UNAUTHORIZED = "identitystore.rest.error.search.unauthorized";
    public static final String PROPERTY_REST_ERROR_NO_HISTORY_FOUND = "identitystore.rest.error.no.history.found";
    public static final String PROPERTY_REST_ERROR_NO_DUPLICATE_RULE_FOUND = "identitystore.rest.error.no.duplicate.rule.found";
    public static final String PROPERTY_REST_ERROR_NO_CERTIFICATION_LEVEL_FOUND = "identitystore.rest.error.no.certification.level.found";
    public static final String PROPERTY_REST_ERROR_NO_ATTRIBUTE_KEYS_FOUND = "identitystore.rest.error.no.atribute.key.found";
    public static final String PROPERTY_REST_ERROR_NO_CERTIFICATION_PROCESSUS_FOUND = "identitystore.rest.error.no.certification.processus.found";
    public static final String PROPERTY_REST_ERROR_NO_UPDATED_IDENTITY_FOUND = "identitystore.rest.error.no.updated.identity.found";
    public static final String PROPERTY_REST_ERROR_ALREADY_EXCLUDED = "identitystore.rest.error.already.excluded";
    public static final String PROPERTY_REST_ERROR_NOT_EXCLUDED = "identitystore.rest.error.not.excluded";
    public static final String PROPERTY_REST_ERROR_IDENTITY_ALREADY_SUSPICIOUS = "identitystore.rest.error.identity.already.suspicious";
    public static final String PROPERTY_REST_ERROR_NO_SUSPICIOUS_IDENTITY_FOUND = "identitystore.rest.error.no.suspicious.identity.found";
    public static final String PROPERTY_REST_ERROR_NO_CLIENT_FOUND_WITH_TOKEN = "identitystore.rest.error.no.client.found.with.token";
    public static final String PROPERTY_REST_ERROR_MUST_PROVIDE_CLIENT_CODE_OR_TOKEN = "identitystore.rest.error.must.provide.client.code.or.token";
    public static final String PROPERTY_REST_ERROR_CONNECTED_IDENTITY_RESTRICTED_ATTRIBUTE_UPDATE = "identitystore.rest.error.connected.identity.restricted.attribute.update";
    public static final String PROPERTY_REST_ERROR_CONNECTED_IDENTITY_FORBIDDEN_SELF_DECLARE = "identitystore.rest.error.connected.identity.forbidden.self.declare";
    public static final String PROPERTY_REST_ERROR_CONNECTED_IDENTITY_FORBIDDEN_UPDATE_LESSER_CERTIFICATION = "identitystore.rest.error.connected.identity.forbidden.update.lesser.certification";
    public static final String PROPERTY_REST_ERROR_CONNECTED_IDENTITY_FORBIDDEN_PIVOT_CERTIFICATION_UNDER_THRESHOLD = "identitystore.rest.error.connected.identity.forbidden.pivot.certification.under.threshold";
    public static final String PROPERTY_REST_ERROR_BATCH_NOT_FOUND = "identityimport.rest.error.batch.not.found";
    public static final String PROPERTY_REST_ERROR_BATCH_STATE_NOT_FOUND = "identityimport.rest.error.batch.state.not.found";
    public static final String PROPERTY_REST_ERROR_IDENTITY_ALL_PIVOT_ATTRIBUTE_SAME_CERTIFICATION = "identitystore.rest.error.identity.all.pivot.attribute.same.certification";
    public static final String PROPERTY_REST_ERROR_IDENTITY_FORBIDDEN_PIVOT_ATTRIBUTE_DELETION = "identitystore.rest.error.identity.forbidden.pivot.attribute.deletion";
    public static final String PROPERTY_REST_ERROR_EXPORT_LIMIT_EXCEEDED = "identitystore.rest.error.export.limit.exceeded";
    public static final String PROPERTY_REST_ERROR_EXPORT_UNAUTHORIZED = "identitystore.rest.error.export.unauthorized";

    public static final String PROPERTY_REST_INFO_POTENTIAL_DUPLICATE_FOUND = "identitystore.rest.info.potential.duplicate.found";
    public static final String PROPERTY_REST_INFO_SUCCESSFUL_OPERATION = "identitystore.rest.info.successful.operation";
    public static final String PROPERTY_REST_INFO_NO_ATTRIBUTE_CHANGE = "identitystore.rest.info.no.attribute.change";

    public static final String PROPERTY_ATTRIBUTE_STATUS_VALIDATION_ERROR_UNKNOWN_GEOCODES_CODE = "identitystore.attribute.status.validation.error.unknown.geocodes.code";
    public static final String PROPERTY_ATTRIBUTE_STATUS_VALIDATION_ERROR_UNKNOWN_GEOCODES_LABEL = "identitystore.attribute.status.validation.error.unknown.geocodes.label";
    public static final String PROPERTY_ATTRIBUTE_STATUS_VALIDATION_ERROR_GEOCODES_LABEL_MULTIPLE_RESULTS = "identitystore.attribute.status.validation.error.geocodes.label.multiple.results";

    public static final String PROPERTY_ATTRIBUTE_STATUS_NOT_CREATED = "identitystore.attribute.status.not.created";
    public static final String PROPERTY_ATTRIBUTE_STATUS_CREATED = "identitystore.attribute.status.created";
    public static final String PROPERTY_ATTRIBUTE_STATUS_GEOCODES_LABEL_OVERRIDDEN = "identitystore.attribute.status.geocodes.label.overridden";
    public static final String PROPERTY_ATTRIBUTE_STATUS_NOT_UPDATED = "identitystore.attribute.status.not.updated";
    public static final String PROPERTY_ATTRIBUTE_STATUS_UPDATED = "identitystore.attribute.status.updated";
    public static final String PROPERTY_ATTRIBUTE_STATUS_NOT_REMOVED = "identitystore.attribute.status.not.removed";
    public static final String PROPERTY_ATTRIBUTE_STATUS_REMOVED = "identitystore.attribute.status.removed";
    public static final String PROPERTY_ATTRIBUTE_STATUS_UNCERTIFIED = "identitystore.attribute.status.uncertified";
    public static final String PROPERTY_ATTRIBUTE_STATUS_FORMATTED_VALUE = "identitystore.attribute.status.formatted.value";

    public static final String PROPERTY_ATTRIBUTE_STATUS_INSUFFICIENT_CERTIFICATION_LEVEL = "identitystore.attribute.status.insufficient.certification.level";

    /**
     * Default constructor
     */
    private Constants( )
    {
    }
}
