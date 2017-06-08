package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import com.mypurecloud.sdk.v2.model.FlowNotificationNotificationFlowVersion;
import com.mypurecloud.sdk.v2.model.PromptNotificationNotificationCurrentOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowNotificationNotification
 */

public class FlowNotificationNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean deleted = null;
  private DocumentDataV2NotificationWorkspace checkedInVersion = null;
  private FlowNotificationNotificationFlowVersion savedVersion = null;
  private FlowNotificationNotificationFlowVersion publishedVersion = null;
  private PromptNotificationNotificationCurrentOperation currentOperation = null;

  
  /**
   **/
  public FlowNotificationNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public FlowNotificationNotification name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public FlowNotificationNotification description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public FlowNotificationNotification deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  
  /**
   **/
  public FlowNotificationNotification checkedInVersion(DocumentDataV2NotificationWorkspace checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("checkedInVersion")
  public DocumentDataV2NotificationWorkspace getCheckedInVersion() {
    return checkedInVersion;
  }
  public void setCheckedInVersion(DocumentDataV2NotificationWorkspace checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
  }

  
  /**
   **/
  public FlowNotificationNotification savedVersion(FlowNotificationNotificationFlowVersion savedVersion) {
    this.savedVersion = savedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("savedVersion")
  public FlowNotificationNotificationFlowVersion getSavedVersion() {
    return savedVersion;
  }
  public void setSavedVersion(FlowNotificationNotificationFlowVersion savedVersion) {
    this.savedVersion = savedVersion;
  }

  
  /**
   **/
  public FlowNotificationNotification publishedVersion(FlowNotificationNotificationFlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedVersion")
  public FlowNotificationNotificationFlowVersion getPublishedVersion() {
    return publishedVersion;
  }
  public void setPublishedVersion(FlowNotificationNotificationFlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
  }

  
  /**
   **/
  public FlowNotificationNotification currentOperation(PromptNotificationNotificationCurrentOperation currentOperation) {
    this.currentOperation = currentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentOperation")
  public PromptNotificationNotificationCurrentOperation getCurrentOperation() {
    return currentOperation;
  }
  public void setCurrentOperation(PromptNotificationNotificationCurrentOperation currentOperation) {
    this.currentOperation = currentOperation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowNotificationNotification flowNotificationNotification = (FlowNotificationNotification) o;
    return Objects.equals(this.id, flowNotificationNotification.id) &&
        Objects.equals(this.name, flowNotificationNotification.name) &&
        Objects.equals(this.description, flowNotificationNotification.description) &&
        Objects.equals(this.deleted, flowNotificationNotification.deleted) &&
        Objects.equals(this.checkedInVersion, flowNotificationNotification.checkedInVersion) &&
        Objects.equals(this.savedVersion, flowNotificationNotification.savedVersion) &&
        Objects.equals(this.publishedVersion, flowNotificationNotification.publishedVersion) &&
        Objects.equals(this.currentOperation, flowNotificationNotification.currentOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, deleted, checkedInVersion, savedVersion, publishedVersion, currentOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowNotificationNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    checkedInVersion: ").append(toIndentedString(checkedInVersion)).append("\n");
    sb.append("    savedVersion: ").append(toIndentedString(savedVersion)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
    sb.append("    currentOperation: ").append(toIndentedString(currentOperation)).append("\n");
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

