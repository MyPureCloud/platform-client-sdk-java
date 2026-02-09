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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DNCListUploadUrlRequest
 */

public class DNCListUploadUrlRequest  implements Serializable {
  
  private Integer signedUrlTimeoutSeconds = null;
  private String contentType = null;
  private String id = null;
  private String phoneColumns = null;
  private String emailColumns = null;
  private String customExclusionColumns = null;
  private String expirationDateTimeColumn = null;
  private String whatsAppColumns = null;

  public DNCListUploadUrlRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds
   **/
  public DNCListUploadUrlRequest signedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds")
  @JsonProperty("signedUrlTimeoutSeconds")
  public Integer getSignedUrlTimeoutSeconds() {
    return signedUrlTimeoutSeconds;
  }
  public void setSignedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
  }


  /**
   * The content type of the file to upload. Allows all types are text/csv, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   **/
  public DNCListUploadUrlRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The content type of the file to upload. Allows all types are text/csv, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * Id of your dnc list to upload to
   **/
  public DNCListUploadUrlRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of your dnc list to upload to")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The column names from your file from which to upload dnc phone numbers.
   **/
  public DNCListUploadUrlRequest phoneColumns(String phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column names from your file from which to upload dnc phone numbers.")
  @JsonProperty("phoneColumns")
  public String getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(String phoneColumns) {
    this.phoneColumns = phoneColumns;
  }


  /**
   * The column names from your file from which to upload dnc emails.
   **/
  public DNCListUploadUrlRequest emailColumns(String emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column names from your file from which to upload dnc emails.")
  @JsonProperty("emailColumns")
  public String getEmailColumns() {
    return emailColumns;
  }
  public void setEmailColumns(String emailColumns) {
    this.emailColumns = emailColumns;
  }


  /**
   * The column names from your file from which to upload dnc custom exclusion column entries.
   **/
  public DNCListUploadUrlRequest customExclusionColumns(String customExclusionColumns) {
    this.customExclusionColumns = customExclusionColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column names from your file from which to upload dnc custom exclusion column entries.")
  @JsonProperty("customExclusionColumns")
  public String getCustomExclusionColumns() {
    return customExclusionColumns;
  }
  public void setCustomExclusionColumns(String customExclusionColumns) {
    this.customExclusionColumns = customExclusionColumns;
  }


  /**
   * The column name from your file to use as the dnc expiration date time.
   **/
  public DNCListUploadUrlRequest expirationDateTimeColumn(String expirationDateTimeColumn) {
    this.expirationDateTimeColumn = expirationDateTimeColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column name from your file to use as the dnc expiration date time.")
  @JsonProperty("expirationDateTimeColumn")
  public String getExpirationDateTimeColumn() {
    return expirationDateTimeColumn;
  }
  public void setExpirationDateTimeColumn(String expirationDateTimeColumn) {
    this.expirationDateTimeColumn = expirationDateTimeColumn;
  }


  /**
   * The column names from your file from which to upload dnc whatsapp.
   **/
  public DNCListUploadUrlRequest whatsAppColumns(String whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column names from your file from which to upload dnc whatsapp.")
  @JsonProperty("whatsAppColumns")
  public String getWhatsAppColumns() {
    return whatsAppColumns;
  }
  public void setWhatsAppColumns(String whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNCListUploadUrlRequest dNCListUploadUrlRequest = (DNCListUploadUrlRequest) o;

    return Objects.equals(this.signedUrlTimeoutSeconds, dNCListUploadUrlRequest.signedUrlTimeoutSeconds) &&
            Objects.equals(this.contentType, dNCListUploadUrlRequest.contentType) &&
            Objects.equals(this.id, dNCListUploadUrlRequest.id) &&
            Objects.equals(this.phoneColumns, dNCListUploadUrlRequest.phoneColumns) &&
            Objects.equals(this.emailColumns, dNCListUploadUrlRequest.emailColumns) &&
            Objects.equals(this.customExclusionColumns, dNCListUploadUrlRequest.customExclusionColumns) &&
            Objects.equals(this.expirationDateTimeColumn, dNCListUploadUrlRequest.expirationDateTimeColumn) &&
            Objects.equals(this.whatsAppColumns, dNCListUploadUrlRequest.whatsAppColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUrlTimeoutSeconds, contentType, id, phoneColumns, emailColumns, customExclusionColumns, expirationDateTimeColumn, whatsAppColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNCListUploadUrlRequest {\n");
    
    sb.append("    signedUrlTimeoutSeconds: ").append(toIndentedString(signedUrlTimeoutSeconds)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    emailColumns: ").append(toIndentedString(emailColumns)).append("\n");
    sb.append("    customExclusionColumns: ").append(toIndentedString(customExclusionColumns)).append("\n");
    sb.append("    expirationDateTimeColumn: ").append(toIndentedString(expirationDateTimeColumn)).append("\n");
    sb.append("    whatsAppColumns: ").append(toIndentedString(whatsAppColumns)).append("\n");
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

