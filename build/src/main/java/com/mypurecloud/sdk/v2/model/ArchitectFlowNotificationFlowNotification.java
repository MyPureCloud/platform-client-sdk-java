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
import com.mypurecloud.sdk.v2.model.ArchitectFlowNotificationArchitectOperation;
import com.mypurecloud.sdk.v2.model.ArchitectFlowNotificationFlowVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchitectFlowNotificationFlowNotification
 */

public class ArchitectFlowNotificationFlowNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean deleted = null;
  private ArchitectFlowNotificationFlowVersion checkedInVersion = null;
  private ArchitectFlowNotificationFlowVersion savedVersion = null;
  private ArchitectFlowNotificationFlowVersion publishedVersion = null;
  private ArchitectFlowNotificationArchitectOperation currentOperation = null;

  
  /**
   **/
  public ArchitectFlowNotificationFlowNotification id(String id) {
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
  public ArchitectFlowNotificationFlowNotification name(String name) {
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
  public ArchitectFlowNotificationFlowNotification description(String description) {
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
  public ArchitectFlowNotificationFlowNotification deleted(Boolean deleted) {
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
  public ArchitectFlowNotificationFlowNotification checkedInVersion(ArchitectFlowNotificationFlowVersion checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("checkedInVersion")
  public ArchitectFlowNotificationFlowVersion getCheckedInVersion() {
    return checkedInVersion;
  }
  public void setCheckedInVersion(ArchitectFlowNotificationFlowVersion checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
  }

  
  /**
   **/
  public ArchitectFlowNotificationFlowNotification savedVersion(ArchitectFlowNotificationFlowVersion savedVersion) {
    this.savedVersion = savedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("savedVersion")
  public ArchitectFlowNotificationFlowVersion getSavedVersion() {
    return savedVersion;
  }
  public void setSavedVersion(ArchitectFlowNotificationFlowVersion savedVersion) {
    this.savedVersion = savedVersion;
  }

  
  /**
   **/
  public ArchitectFlowNotificationFlowNotification publishedVersion(ArchitectFlowNotificationFlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedVersion")
  public ArchitectFlowNotificationFlowVersion getPublishedVersion() {
    return publishedVersion;
  }
  public void setPublishedVersion(ArchitectFlowNotificationFlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
  }

  
  /**
   **/
  public ArchitectFlowNotificationFlowNotification currentOperation(ArchitectFlowNotificationArchitectOperation currentOperation) {
    this.currentOperation = currentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentOperation")
  public ArchitectFlowNotificationArchitectOperation getCurrentOperation() {
    return currentOperation;
  }
  public void setCurrentOperation(ArchitectFlowNotificationArchitectOperation currentOperation) {
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
    ArchitectFlowNotificationFlowNotification architectFlowNotificationFlowNotification = (ArchitectFlowNotificationFlowNotification) o;
    return Objects.equals(this.id, architectFlowNotificationFlowNotification.id) &&
        Objects.equals(this.name, architectFlowNotificationFlowNotification.name) &&
        Objects.equals(this.description, architectFlowNotificationFlowNotification.description) &&
        Objects.equals(this.deleted, architectFlowNotificationFlowNotification.deleted) &&
        Objects.equals(this.checkedInVersion, architectFlowNotificationFlowNotification.checkedInVersion) &&
        Objects.equals(this.savedVersion, architectFlowNotificationFlowNotification.savedVersion) &&
        Objects.equals(this.publishedVersion, architectFlowNotificationFlowNotification.publishedVersion) &&
        Objects.equals(this.currentOperation, architectFlowNotificationFlowNotification.currentOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, deleted, checkedInVersion, savedVersion, publishedVersion, currentOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowNotificationFlowNotification {\n");
    
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

