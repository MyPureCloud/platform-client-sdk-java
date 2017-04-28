package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
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
  

  /**
   * Gets or Sets code
   */
  public enum CodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CAMPAIGN_START_ERROR("CAMPAIGN_START_ERROR"),
    CAMPAIGN_RULE_START_ERROR("CAMPAIGN_RULE_START_ERROR"),
    CAMPAIGN_SET_DIALING_MODE_ERROR("CAMPAIGN_SET_DIALING_MODE_ERROR"),
    INVALID_CALLABLE_TIME_ZONE("INVALID_CALLABLE_TIME_ZONE"),
    CALLBACK_CREATION_INVALID_NUMBER("CALLBACK_CREATION_INVALID_NUMBER"),
    CALL_RULE_INVALID_CONTACT_COLUMN("CALL_RULE_INVALID_CONTACT_COLUMN"),
    CALL_RULE_MISMATCH_TYPE("CALL_RULE_MISMATCH_TYPE"),
    CALL_RULE_INVALID_OPERATOR("CALL_RULE_INVALID_OPERATOR"),
    CALL_RULE_NO_DNC_LISTS_CONFIGURED("CALL_RULE_NO_DNC_LISTS_CONFIGURED"),
    INVALID_PHONE_NUMBER("INVALID_PHONE_NUMBER"),
    IMPORT_FAILED_TO_READ_HEADERS("IMPORT_FAILED_TO_READ_HEADERS"),
    IMPORT_COULD_NOT_PARSE_AN_ENTRY("IMPORT_COULD_NOT_PARSE_AN_ENTRY"),
    IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT("IMPORT_CONTACT_DOES_NOT_MATCH_LIST_FORMAT"),
    IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS("IMPORT_ENTRY_DOES_NOT_ALIGN_WITH_HEADERS"),
    IMPORT_INVALID_CUSTOM_ID("IMPORT_INVALID_CUSTOM_ID"),
    IMPORT_INVALID_DATA("IMPORT_INVALID_DATA"),
    IMPORT_NO_COLUMNS_DEFINED("IMPORT_NO_COLUMNS_DEFINED"),
    IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST("IMPORT_COLUMNS_DO_NOT_EXIST_ON_LIST"),
    IMPORT_LIST_NO_LONGER_EXISTS("IMPORT_LIST_NO_LONGER_EXISTS"),
    RECYCLE_CAMPAIGN("RECYCLE_CAMPAIGN");

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
  private Map<String, Object> messageParams = new HashMap<String, Object>();
  private String documentationUri = null;
  private List<String> resourceURIs = new ArrayList<String>();

  
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

