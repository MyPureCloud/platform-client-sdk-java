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
 * ContactListUploadUrlRequest
 */

public class ContactListUploadUrlRequest  implements Serializable {
  
  private Integer signedUrlTimeoutSeconds = null;
  private String contentType = null;
  private String id = null;
  private String contactIdName = null;
  private String importTemplateId = null;
  private String listNamePrefix = null;
  private Boolean clearSystemData = null;
  private String divisionIdForTargetContactLists = null;
  private String fileSpecificationTemplateId = null;

  public ContactListUploadUrlRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds
   **/
  public ContactListUploadUrlRequest signedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
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
   * The content type of the file to upload. Allows MIME types are text/csv, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   **/
  public ContactListUploadUrlRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The content type of the file to upload. Allows MIME types are text/csv, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * Id of your contact list to upload to
   **/
  public ContactListUploadUrlRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of your contact list to upload to")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The column name from your file to use as the contact id.
   **/
  public ContactListUploadUrlRequest contactIdName(String contactIdName) {
    this.contactIdName = contactIdName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column name from your file to use as the contact id.")
  @JsonProperty("contactIdName")
  public String getContactIdName() {
    return contactIdName;
  }
  public void setContactIdName(String contactIdName) {
    this.contactIdName = contactIdName;
  }


  /**
   * Id of your import template to use.
   **/
  public ContactListUploadUrlRequest importTemplateId(String importTemplateId) {
    this.importTemplateId = importTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of your import template to use.")
  @JsonProperty("importTemplateId")
  public String getImportTemplateId() {
    return importTemplateId;
  }
  public void setImportTemplateId(String importTemplateId) {
    this.importTemplateId = importTemplateId;
  }


  /**
   * String that will replace %N in the listNameFormat specified on the import template.
   **/
  public ContactListUploadUrlRequest listNamePrefix(String listNamePrefix) {
    this.listNamePrefix = listNamePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "String that will replace %N in the listNameFormat specified on the import template.")
  @JsonProperty("listNamePrefix")
  public String getListNamePrefix() {
    return listNamePrefix;
  }
  public void setListNamePrefix(String listNamePrefix) {
    this.listNamePrefix = listNamePrefix;
  }


  /**
   * Whether to clear system data
   **/
  public ContactListUploadUrlRequest clearSystemData(Boolean clearSystemData) {
    this.clearSystemData = clearSystemData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to clear system data")
  @JsonProperty("clearSystemData")
  public Boolean getClearSystemData() {
    return clearSystemData;
  }
  public void setClearSystemData(Boolean clearSystemData) {
    this.clearSystemData = clearSystemData;
  }


  /**
   * Id of the division to be used for the creation of the target contact lists. If not provided, Home division will be used.
   **/
  public ContactListUploadUrlRequest divisionIdForTargetContactLists(String divisionIdForTargetContactLists) {
    this.divisionIdForTargetContactLists = divisionIdForTargetContactLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the division to be used for the creation of the target contact lists. If not provided, Home division will be used.")
  @JsonProperty("divisionIdForTargetContactLists")
  public String getDivisionIdForTargetContactLists() {
    return divisionIdForTargetContactLists;
  }
  public void setDivisionIdForTargetContactLists(String divisionIdForTargetContactLists) {
    this.divisionIdForTargetContactLists = divisionIdForTargetContactLists;
  }


  /**
   * File specification template ID
   **/
  public ContactListUploadUrlRequest fileSpecificationTemplateId(String fileSpecificationTemplateId) {
    this.fileSpecificationTemplateId = fileSpecificationTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File specification template ID")
  @JsonProperty("fileSpecificationTemplateId")
  public String getFileSpecificationTemplateId() {
    return fileSpecificationTemplateId;
  }
  public void setFileSpecificationTemplateId(String fileSpecificationTemplateId) {
    this.fileSpecificationTemplateId = fileSpecificationTemplateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListUploadUrlRequest contactListUploadUrlRequest = (ContactListUploadUrlRequest) o;

    return Objects.equals(this.signedUrlTimeoutSeconds, contactListUploadUrlRequest.signedUrlTimeoutSeconds) &&
            Objects.equals(this.contentType, contactListUploadUrlRequest.contentType) &&
            Objects.equals(this.id, contactListUploadUrlRequest.id) &&
            Objects.equals(this.contactIdName, contactListUploadUrlRequest.contactIdName) &&
            Objects.equals(this.importTemplateId, contactListUploadUrlRequest.importTemplateId) &&
            Objects.equals(this.listNamePrefix, contactListUploadUrlRequest.listNamePrefix) &&
            Objects.equals(this.clearSystemData, contactListUploadUrlRequest.clearSystemData) &&
            Objects.equals(this.divisionIdForTargetContactLists, contactListUploadUrlRequest.divisionIdForTargetContactLists) &&
            Objects.equals(this.fileSpecificationTemplateId, contactListUploadUrlRequest.fileSpecificationTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUrlTimeoutSeconds, contentType, id, contactIdName, importTemplateId, listNamePrefix, clearSystemData, divisionIdForTargetContactLists, fileSpecificationTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListUploadUrlRequest {\n");
    
    sb.append("    signedUrlTimeoutSeconds: ").append(toIndentedString(signedUrlTimeoutSeconds)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactIdName: ").append(toIndentedString(contactIdName)).append("\n");
    sb.append("    importTemplateId: ").append(toIndentedString(importTemplateId)).append("\n");
    sb.append("    listNamePrefix: ").append(toIndentedString(listNamePrefix)).append("\n");
    sb.append("    clearSystemData: ").append(toIndentedString(clearSystemData)).append("\n");
    sb.append("    divisionIdForTargetContactLists: ").append(toIndentedString(divisionIdForTargetContactLists)).append("\n");
    sb.append("    fileSpecificationTemplateId: ").append(toIndentedString(fileSpecificationTemplateId)).append("\n");
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

