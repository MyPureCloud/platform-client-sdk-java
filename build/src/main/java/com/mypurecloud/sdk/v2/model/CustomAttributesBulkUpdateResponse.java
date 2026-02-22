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
import com.mypurecloud.sdk.v2.model.CustomAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CustomAttributesBulkUpdateResponse
 */

public class CustomAttributesBulkUpdateResponse  implements Serializable {
  
  private CustomAttributes attributes = null;
  private Integer statusCode = null;
  private String errorMessage = null;

  public CustomAttributesBulkUpdateResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Custom Attributes record.
   **/
  public CustomAttributesBulkUpdateResponse attributes(CustomAttributes attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Custom Attributes record.")
  @JsonProperty("attributes")
  public CustomAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CustomAttributes attributes) {
    this.attributes = attributes;
  }


  /**
   * The status code result of updating the Custom Attributes record.
   **/
  public CustomAttributesBulkUpdateResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status code result of updating the Custom Attributes record.")
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * The error message if an error occurs while updating the record, otherwise null.
   **/
  public CustomAttributesBulkUpdateResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error message if an error occurs while updating the record, otherwise null.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributesBulkUpdateResponse customAttributesBulkUpdateResponse = (CustomAttributesBulkUpdateResponse) o;

    return Objects.equals(this.attributes, customAttributesBulkUpdateResponse.attributes) &&
            Objects.equals(this.statusCode, customAttributesBulkUpdateResponse.statusCode) &&
            Objects.equals(this.errorMessage, customAttributesBulkUpdateResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, statusCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributesBulkUpdateResponse {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

