package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ValidationServiceRequest
 */

public class ValidationServiceRequest  implements Serializable {
  
  private Date dateImportEnded = null;
  private String fileUrl = null;

  
  /**
   * The last day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ValidationServiceRequest dateImportEnded(Date dateImportEnded) {
    this.dateImportEnded = dateImportEnded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateImportEnded")
  public Date getDateImportEnded() {
    return dateImportEnded;
  }
  public void setDateImportEnded(Date dateImportEnded) {
    this.dateImportEnded = dateImportEnded;
  }

  
  /**
   * Path to the file in the storage including the file name
   **/
  public ValidationServiceRequest fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Path to the file in the storage including the file name")
  @JsonProperty("fileUrl")
  public String getFileUrl() {
    return fileUrl;
  }
  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationServiceRequest validationServiceRequest = (ValidationServiceRequest) o;
    return Objects.equals(this.dateImportEnded, validationServiceRequest.dateImportEnded) &&
        Objects.equals(this.fileUrl, validationServiceRequest.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateImportEnded, fileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationServiceRequest {\n");
    
    sb.append("    dateImportEnded: ").append(toIndentedString(dateImportEnded)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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

