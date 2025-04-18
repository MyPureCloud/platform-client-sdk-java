package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * EventMessage
 */

public class EventMessage  implements Serializable {
  

  private static class CodeEnumDeserializer extends StdDeserializer<CodeEnum> {
    public CodeEnumDeserializer() {
      super(CodeEnumDeserializer.class);
    }

    @Override
    public CodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets code
   */
 @JsonDeserialize(using = CodeEnumDeserializer.class)
  public enum CodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE_CAMPAIGNS_LIMIT_EXCEEDED("ACTIVE_CAMPAIGNS_LIMIT_EXCEEDED"),
    ALL_CAMPAIGNS_BLACKLISTED("ALL_CAMPAIGNS_BLACKLISTED"),
    ANOTHER_CAMPAIGN_STARTING("ANOTHER_CAMPAIGN_STARTING"),
    APPROACHING_CONTACT_LIMIT("APPROACHING_CONTACT_LIMIT"),
    APPROACHING_DNC_LIST_PHONE_NUMBER_LIMIT("APPROACHING_DNC_LIST_PHONE_NUMBER_LIMIT"),
    APPROACHING_DNC_ORGANIZATION_PHONE_NUMBER_LIMIT("APPROACHING_DNC_ORGANIZATION_PHONE_NUMBER_LIMIT"),
    APPROACHING_ENTITY_LIMIT("APPROACHING_ENTITY_LIMIT"),
    AUTOMATIC_TIME_ZONE_ZIP_CODE_INVALID("AUTOMATIC_TIME_ZONE_ZIP_CODE_INVALID"),
    CAMPAIGN_BLACKLISTED("CAMPAIGN_BLACKLISTED"),
    CAMPAIGN_BUILD_CONTACT_QUEUE_ERROR("CAMPAIGN_BUILD_CONTACT_QUEUE_ERROR"),
    CAMPAIGN_CONTENT_TEMPLATE_SUBSTITUTION_MISMATCH("CAMPAIGN_CONTENT_TEMPLATE_SUBSTITUTION_MISMATCH"),
    CAMPAIGN_CALLS_PER_AGENT_LOW("CAMPAIGN_CALLS_PER_AGENT_LOW"),
    CAMPAIGN_EMAIL_BODY_CHARACTER_LIMIT_EXCEEDED("CAMPAIGN_EMAIL_BODY_CHARACTER_LIMIT_EXCEEDED"),
    CAMPAIGN_EMAIL_SUBJECT_CHARACTER_LIMIT_EXCEEDED("CAMPAIGN_EMAIL_SUBJECT_CHARACTER_LIMIT_EXCEEDED"),
    CAMPAIGN_WHATSAPP_HEADER_VALUE_LIMIT_EXCEEDED("CAMPAIGN_WHATSAPP_HEADER_VALUE_LIMIT_EXCEEDED"),
    CAMPAIGN_WHATSAPP_BUTTON_URL_VALUE_LIMIT_EXCEEDED("CAMPAIGN_WHATSAPP_BUTTON_URL_VALUE_LIMIT_EXCEEDED"),
    CAMPAIGN_INVALIDATED("CAMPAIGN_INVALIDATED"),
    CAMPAIGN_FORCE_STOPPED("CAMPAIGN_FORCE_STOPPED"),
    CAMPAIGN_MESSAGE_CHARACTER_LIMIT_EXCEEDED("CAMPAIGN_MESSAGE_CHARACTER_LIMIT_EXCEEDED"),
    CAMPAIGN_START_ERROR("CAMPAIGN_START_ERROR"),
    CAMPAIGN_RULE_START_ERROR("CAMPAIGN_RULE_START_ERROR"),
    CAMPAIGN_SCRIPT_STAGE_MISSING("CAMPAIGN_SCRIPT_STAGE_MISSING"),
    CAMPAIGN_SET_DIALING_MODE_ERROR("CAMPAIGN_SET_DIALING_MODE_ERROR"),
    CAMPAIGN_STOPPED("CAMPAIGN_STOPPED"),
    CAMPAIGN_THROTTLED("CAMPAIGN_THROTTLED"),
    CAMPAIGN_QUEUE_MEMBERS_LIMIT_EXCEEDED("CAMPAIGN_QUEUE_MEMBERS_LIMIT_EXCEEDED"),
    CAMPAIGN_WEIGHT_ZERO("CAMPAIGN_WEIGHT_ZERO"),
    INVALID_CALLABLE_TIME_ZONE("INVALID_CALLABLE_TIME_ZONE"),
    CALLBACK_CREATION_INVALID_NUMBER("CALLBACK_CREATION_INVALID_NUMBER"),
    CALL_RULE_INVALID_CONTACT_COLUMN("CALL_RULE_INVALID_CONTACT_COLUMN"),
    CALL_RULE_MISSING_DATA_ACTION_INPUT("CALL_RULE_MISSING_DATA_ACTION_INPUT"),
    CALL_RULE_MISMATCH_TYPE("CALL_RULE_MISMATCH_TYPE"),
    CALL_RULE_INVALID_OPERATOR("CALL_RULE_INVALID_OPERATOR"),
    CALL_RULE_NO_DNC_LISTS_CONFIGURED("CALL_RULE_NO_DNC_LISTS_CONFIGURED"),
    CALL_RULE_UPDATED_PHONE_COLUMN("CALL_RULE_UPDATED_PHONE_COLUMN"),
    CONTACT_LIST_FILTER_EVALUATION_FAILED("CONTACT_LIST_FILTER_EVALUATION_FAILED"),
    CONTACT_LIST_FILTER_INTERNAL_ERROR("CONTACT_LIST_FILTER_INTERNAL_ERROR"),
    CONTACT_COLUMNS_LIMIT_EXCEEDED("CONTACT_COLUMNS_LIMIT_EXCEEDED"),
    CONTACT_COLUMN_LENGTH_LIMIT_EXCEEDED("CONTACT_COLUMN_LENGTH_LIMIT_EXCEEDED"),
    CONTACT_ID_LENGTH_LIMIT_EXCEEDED("CONTACT_ID_LENGTH_LIMIT_EXCEEDED"),
    CONTACT_DATUM_LENGTH_LIMIT_EXCEEDED("CONTACT_DATUM_LENGTH_LIMIT_EXCEEDED"),
    CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID("CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID"),
    DATA_ACTION_EXECUTION_FAILED("DATA_ACTION_EXECUTION_FAILED"),
    DATA_ACTION_AUTHENTICATION_FAILURE("DATA_ACTION_AUTHENTICATION_FAILURE"),
    DATA_ACTION_NOT_FOUND("DATA_ACTION_NOT_FOUND"),
    DATA_ACTION_TOO_MANY_REQUESTS("DATA_ACTION_TOO_MANY_REQUESTS"),
    DATA_ACTION_TOO_MANY_REQUESTS_REMOTE("DATA_ACTION_TOO_MANY_REQUESTS_REMOTE"),
    ACTION_EXECUTION_FAILED("ACTION_EXECUTION_FAILED"),
    ACTION_EXECUTION_FAILED_INVALID_PARAMETER("ACTION_EXECUTION_FAILED_INVALID_PARAMETER"),
    DIGITAL_RULE_EVALUATION_FAILED("DIGITAL_RULE_EVALUATION_FAILED"),
    DIGITAL_RULE_INTERNAL_ERROR("DIGITAL_RULE_INTERNAL_ERROR"),
    DIGITAL_RULE_NO_DNC_LISTS_CONFIGURED("DIGITAL_RULE_NO_DNC_LISTS_CONFIGURED"),
    DIGITAL_RULE_UPDATED_CONTACT_ADDRESS("DIGITAL_RULE_UPDATED_CONTACT_ADDRESS"),
    DIGITAL_RULE_SMS_PHONE_NUMBER_TYPE_MISMATCH("DIGITAL_RULE_SMS_PHONE_NUMBER_TYPE_MISMATCH"),
    DIGITAL_RULE_ERROR_SKIPPED("DIGITAL_RULE_ERROR_SKIPPED"),
    DNC_AUTHENTICATION_FAILURE("DNC_AUTHENTICATION_FAILURE"),
    EXCEEDED_CONTACT_LIMIT("EXCEEDED_CONTACT_LIMIT"),
    EXCEEDED_DNC_RECORD_LIMIT("EXCEEDED_DNC_RECORD_LIMIT"),
    EXCEEDED_DNC_PHONE_NUMBER_LENGTH("EXCEEDED_DNC_PHONE_NUMBER_LENGTH"),
    INACTIVE_EDGES_FAILED_PLACE_CALLS("INACTIVE_EDGES_FAILED_PLACE_CALLS"),
    INACTIVE_EDGES_TURNED_CAMPAIGN_OFF("INACTIVE_EDGES_TURNED_CAMPAIGN_OFF"),
    INVALID_AGENT("INVALID_AGENT"),
    INVALID_EMAIL_ADDRESS("INVALID_EMAIL_ADDRESS"),
    INVALID_PHONE_NUMBER("INVALID_PHONE_NUMBER"),
    IMPORT_FAILED_TO_READ_HEADERS("IMPORT_FAILED_TO_READ_HEADERS"),
    IMPORT_COULD_NOT_PARSE_AN_ENTRY("IMPORT_COULD_NOT_PARSE_AN_ENTRY"),
    IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT("IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT"),
    IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS("IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS"),
    IMPORT_INVALID_CUSTOM_ID("IMPORT_INVALID_CUSTOM_ID"),
    IMPORT_INVALID_DATA("IMPORT_INVALID_DATA"),
    IMPORT_INVALID_EMAIL_ADDRESSES("IMPORT_INVALID_EMAIL_ADDRESSES"),
    IMPORT_INVALID_PHONE_NUMBERS("IMPORT_INVALID_PHONE_NUMBERS"),
    IMPORT_INVALID_EXPIRATION_DATE("IMPORT_INVALID_EXPIRATION_DATE"),
    IMPORT_EXPIRATION_DATE_EXCEEDS_MAX_DAYS("IMPORT_EXPIRATION_DATE_EXCEEDS_MAX_DAYS"),
    IMPORT_COLUMN_EXCEEDS_LENGTH_LIMIT("IMPORT_COLUMN_EXCEEDS_LENGTH_LIMIT"),
    IMPORT_DATUM_EXCEEDS_LENGTH_LIMIT("IMPORT_DATUM_EXCEEDS_LENGTH_LIMIT"),
    IMPORT_MISSING_CUSTOM_ID("IMPORT_MISSING_CUSTOM_ID"),
    IMPORT_NO_COLUMNS_DEFINED("IMPORT_NO_COLUMNS_DEFINED"),
    IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST("IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST"),
    IMPORT_LIST_NO_LONGER_EXISTS("IMPORT_LIST_NO_LONGER_EXISTS"),
    IMPORT_NO_LISTS_CREATED_NO_CONTACTS_MATCH_FILTER("IMPORT_NO_LISTS_CREATED_NO_CONTACTS_MATCH_FILTER"),
    IMPORT_TARGET_CONTACT_LIST_NAME_EXISTS("IMPORT_TARGET_CONTACT_LIST_NAME_EXISTS"),
    IMPORT_FAILED_CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID("IMPORT_FAILED_CONTACT_ZIP_CODE_COLUMN_VALUE_INVALID"),
    IMPORT_FAILED_CONTACT_DATA_GREATER_THAN_MAX_LENGTH("IMPORT_FAILED_CONTACT_DATA_GREATER_THAN_MAX_LENGTH"),
    IMPORT_FAILED_CONTACT_DATA_NOT_WITHIN_MIN_MAX_RANGE("IMPORT_FAILED_CONTACT_DATA_NOT_WITHIN_MIN_MAX_RANGE"),
    IMPORT_FAILED_CONTACT_DATA_INVALID_DATATYPE("IMPORT_FAILED_CONTACT_DATA_INVALID_DATATYPE"),
    IMPORT_TOO_MANY_COLUMNS("IMPORT_TOO_MANY_COLUMNS"),
    IMPORT_TOO_MANY_EXTRA_COLUMNS("IMPORT_TOO_MANY_EXTRA_COLUMNS"),
    IMPORT_CONTACT_LIST_NAME_LENGTH_EXCEEDED("IMPORT_CONTACT_LIST_NAME_LENGTH_EXCEEDED"),
    ORGANIZATION_HAS_NO_DOMAIN_SET("ORGANIZATION_HAS_NO_DOMAIN_SET"),
    QUEUE_NOT_FOUND("QUEUE_NOT_FOUND"),
    RECYCLE_CAMPAIGN("RECYCLE_CAMPAIGN"),
    SCHEDULED_CAMPAIGN_INVALID("SCHEDULED_CAMPAIGN_INVALID"),
    SCHEDULE_UNKNOWN_ERROR("SCHEDULE_UNKNOWN_ERROR"),
    SMS_CONTENT_TEMPLATE_NOT_FOUND("SMS_CONTENT_TEMPLATE_NOT_FOUND"),
    RECURRING_SCHEDULE_NEXT_OCCURRENCE_FAILURE("RECURRING_SCHEDULE_NEXT_OCCURRENCE_FAILURE"),
    RECURRING_SCHEDULE_ENDED("RECURRING_SCHEDULE_ENDED"),
    RECURRING_SCHEDULE_MISSED_OCCURRENCES("RECURRING_SCHEDULE_MISSED_OCCURRENCES"),
    VERSION_CONFLICT("VERSION_CONFLICT");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CodeEnum fromString(String key) {
      if (key == null) return null;

      for (CodeEnum value : CodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CodeEnum code = null;
  private String message = null;
  private String messageWithParams = null;
  private Map<String, Object> messageParams = null;
  private String documentationUri = null;
  private List<String> resourceURIs = null;

  public EventMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      resourceURIs = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public EventMessage code(CodeEnum code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  /**
   **/
  public EventMessage message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public EventMessage messageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageWithParams")
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }


  /**
   **/
  public EventMessage messageParams(Map<String, Object> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageParams")
  public Map<String, Object> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, Object> messageParams) {
    this.messageParams = messageParams;
  }


  /**
   **/
  public EventMessage documentationUri(String documentationUri) {
    this.documentationUri = documentationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentationUri")
  public String getDocumentationUri() {
    return documentationUri;
  }
  public void setDocumentationUri(String documentationUri) {
    this.documentationUri = documentationUri;
  }


  /**
   **/
  public EventMessage resourceURIs(List<String> resourceURIs) {
    this.resourceURIs = resourceURIs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceURIs")
  public List<String> getResourceURIs() {
    return resourceURIs;
  }
  public void setResourceURIs(List<String> resourceURIs) {
    this.resourceURIs = resourceURIs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventMessage eventMessage = (EventMessage) o;

    return Objects.equals(this.code, eventMessage.code) &&
            Objects.equals(this.message, eventMessage.message) &&
            Objects.equals(this.messageWithParams, eventMessage.messageWithParams) &&
            Objects.equals(this.messageParams, eventMessage.messageParams) &&
            Objects.equals(this.documentationUri, eventMessage.documentationUri) &&
            Objects.equals(this.resourceURIs, eventMessage.resourceURIs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, messageWithParams, messageParams, documentationUri, resourceURIs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
    sb.append("    resourceURIs: ").append(toIndentedString(resourceURIs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

