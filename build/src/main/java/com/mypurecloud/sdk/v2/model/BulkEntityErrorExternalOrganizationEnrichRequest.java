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
import com.mypurecloud.sdk.v2.model.BulkErrorDetail;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationEnrichRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkEntityErrorExternalOrganizationEnrichRequest
 */

public class BulkEntityErrorExternalOrganizationEnrichRequest  implements Serializable {
  
  private String code = null;
  private String message = null;
  private Integer status = null;
  private Boolean retryable = null;
  private List<BulkErrorDetail> details = null;
  private ExternalOrganizationEnrichRequest entity = null;

  public BulkEntityErrorExternalOrganizationEnrichRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      details = new ArrayList<BulkErrorDetail>();
    }
  }

  
  /**
   * An error code for the specific error condition.
   **/
  public BulkEntityErrorExternalOrganizationEnrichRequest code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An error code for the specific error condition.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * A short error message.
   **/
  public BulkEntityErrorExternalOrganizationEnrichRequest message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A short error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * The HTTP Status Code for the error.
   **/
  public BulkEntityErrorExternalOrganizationEnrichRequest status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The HTTP Status Code for the error.")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   * Whether this particular error should be retried.
   **/
  public BulkEntityErrorExternalOrganizationEnrichRequest retryable(Boolean retryable) {
    this.retryable = retryable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this particular error should be retried.")
  @JsonProperty("retryable")
  public Boolean getRetryable() {
    return retryable;
  }
  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }


  /**
   * Additional error details for specific fields.
   **/
  public BulkEntityErrorExternalOrganizationEnrichRequest details(List<BulkErrorDetail> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional error details for specific fields.")
  @JsonProperty("details")
  public List<BulkErrorDetail> getDetails() {
    return details;
  }
  public void setDetails(List<BulkErrorDetail> details) {
    this.details = details;
  }


  /**
   * The entity body specified in the Bulk request operation that caused this error.
   **/
  public BulkEntityErrorExternalOrganizationEnrichRequest entity(ExternalOrganizationEnrichRequest entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity body specified in the Bulk request operation that caused this error.")
  @JsonProperty("entity")
  public ExternalOrganizationEnrichRequest getEntity() {
    return entity;
  }
  public void setEntity(ExternalOrganizationEnrichRequest entity) {
    this.entity = entity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEntityErrorExternalOrganizationEnrichRequest bulkEntityErrorExternalOrganizationEnrichRequest = (BulkEntityErrorExternalOrganizationEnrichRequest) o;

    return Objects.equals(this.code, bulkEntityErrorExternalOrganizationEnrichRequest.code) &&
            Objects.equals(this.message, bulkEntityErrorExternalOrganizationEnrichRequest.message) &&
            Objects.equals(this.status, bulkEntityErrorExternalOrganizationEnrichRequest.status) &&
            Objects.equals(this.retryable, bulkEntityErrorExternalOrganizationEnrichRequest.retryable) &&
            Objects.equals(this.details, bulkEntityErrorExternalOrganizationEnrichRequest.details) &&
            Objects.equals(this.entity, bulkEntityErrorExternalOrganizationEnrichRequest.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, status, retryable, details, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEntityErrorExternalOrganizationEnrichRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

