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
import com.mypurecloud.sdk.v2.model.Detail;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Limit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Validation error for a decision table import or export job (e.g. import file row or header, export division checks)
 */
@ApiModel(description = "Validation error for a decision table import or export job (e.g. import file row or header, export division checks)")

public class DecisionTableJobValidationError  implements Serializable {
  
  private String message = null;
  private String code = null;
  private Integer status = null;
  private String entityId = null;
  private String entityName = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private String contextId = null;
  private List<Detail> details = null;
  private List<ErrorBody> errors = null;
  private Limit limit = null;
  private Integer rowNumber = null;

  public DecisionTableJobValidationError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      details = new ArrayList<Detail>();
      errors = new ArrayList<ErrorBody>();
    }
  }

  public DecisionTableJobValidationError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      details = new ArrayList<Detail>();
      errors = new ArrayList<ErrorBody>();
    }
  }

  
  /**
   **/
  public DecisionTableJobValidationError message(String message) {
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
  public DecisionTableJobValidationError code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public DecisionTableJobValidationError status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   **/
  public DecisionTableJobValidationError entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   **/
  public DecisionTableJobValidationError entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  /**
   **/
  public DecisionTableJobValidationError messageWithParams(String messageWithParams) {
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
  public DecisionTableJobValidationError messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }


  /**
   **/
  public DecisionTableJobValidationError contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  /**
   **/
  public DecisionTableJobValidationError details(List<Detail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<Detail> getDetails() {
    return details;
  }
  public void setDetails(List<Detail> details) {
    this.details = details;
  }


  /**
   **/
  public DecisionTableJobValidationError errors(List<ErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorBody> errors) {
    this.errors = errors;
  }


  /**
   **/
  public DecisionTableJobValidationError limit(Limit limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limit")
  public Limit getLimit() {
    return limit;
  }
  public void setLimit(Limit limit) {
    this.limit = limit;
  }


  /**
   * Row number in the import file when applicable (1-based for data rows; 0 may be used for file-level issues such as headers)
   **/
  public DecisionTableJobValidationError rowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Row number in the import file when applicable (1-based for data rows; 0 may be used for file-level issues such as headers)")
  @JsonProperty("rowNumber")
  public Integer getRowNumber() {
    return rowNumber;
  }
  public void setRowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableJobValidationError decisionTableJobValidationError = (DecisionTableJobValidationError) o;

    return Objects.equals(this.message, decisionTableJobValidationError.message) &&
            Objects.equals(this.code, decisionTableJobValidationError.code) &&
            Objects.equals(this.status, decisionTableJobValidationError.status) &&
            Objects.equals(this.entityId, decisionTableJobValidationError.entityId) &&
            Objects.equals(this.entityName, decisionTableJobValidationError.entityName) &&
            Objects.equals(this.messageWithParams, decisionTableJobValidationError.messageWithParams) &&
            Objects.equals(this.messageParams, decisionTableJobValidationError.messageParams) &&
            Objects.equals(this.contextId, decisionTableJobValidationError.contextId) &&
            Objects.equals(this.details, decisionTableJobValidationError.details) &&
            Objects.equals(this.errors, decisionTableJobValidationError.errors) &&
            Objects.equals(this.limit, decisionTableJobValidationError.limit) &&
            Objects.equals(this.rowNumber, decisionTableJobValidationError.rowNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, status, entityId, entityName, messageWithParams, messageParams, contextId, details, errors, limit, rowNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableJobValidationError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
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

