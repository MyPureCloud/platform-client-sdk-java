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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BulkErrorDetail;
import com.mypurecloud.sdk.v2.model.Relationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkErrorRelationship
 */

public class BulkErrorRelationship  implements Serializable {
  
  private String code = null;
  private String message = null;
  private Integer status = null;
  private Boolean retryable = null;
  private Relationship entity = null;
  private List<BulkErrorDetail> details = new ArrayList<BulkErrorDetail>();

  
  /**
   **/
  public BulkErrorRelationship code(String code) {
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
  public BulkErrorRelationship message(String message) {
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
  public BulkErrorRelationship status(Integer status) {
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
  public BulkErrorRelationship retryable(Boolean retryable) {
    this.retryable = retryable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retryable")
  public Boolean getRetryable() {
    return retryable;
  }
  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }


  /**
   **/
  public BulkErrorRelationship entity(Relationship entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public Relationship getEntity() {
    return entity;
  }
  public void setEntity(Relationship entity) {
    this.entity = entity;
  }


  /**
   **/
  public BulkErrorRelationship details(List<BulkErrorDetail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public List<BulkErrorDetail> getDetails() {
    return details;
  }
  public void setDetails(List<BulkErrorDetail> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkErrorRelationship bulkErrorRelationship = (BulkErrorRelationship) o;

    return Objects.equals(this.code, bulkErrorRelationship.code) &&
            Objects.equals(this.message, bulkErrorRelationship.message) &&
            Objects.equals(this.status, bulkErrorRelationship.status) &&
            Objects.equals(this.retryable, bulkErrorRelationship.retryable) &&
            Objects.equals(this.entity, bulkErrorRelationship.entity) &&
            Objects.equals(this.details, bulkErrorRelationship.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, status, retryable, entity, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkErrorRelationship {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

