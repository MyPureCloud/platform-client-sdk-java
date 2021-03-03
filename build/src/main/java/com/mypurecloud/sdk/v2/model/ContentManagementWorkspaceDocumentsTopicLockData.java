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
import com.mypurecloud.sdk.v2.model.ContentManagementWorkspaceDocumentsTopicUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ContentManagementWorkspaceDocumentsTopicLockData
 */

public class ContentManagementWorkspaceDocumentsTopicLockData  implements Serializable {
  
  private ContentManagementWorkspaceDocumentsTopicUserData lockedBy = null;
  private Date dateCreated = null;
  private Date dateExpires = null;

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicLockData lockedBy(ContentManagementWorkspaceDocumentsTopicUserData lockedBy) {
    this.lockedBy = lockedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockedBy")
  public ContentManagementWorkspaceDocumentsTopicUserData getLockedBy() {
    return lockedBy;
  }
  public void setLockedBy(ContentManagementWorkspaceDocumentsTopicUserData lockedBy) {
    this.lockedBy = lockedBy;
  }

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicLockData dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public ContentManagementWorkspaceDocumentsTopicLockData dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentManagementWorkspaceDocumentsTopicLockData contentManagementWorkspaceDocumentsTopicLockData = (ContentManagementWorkspaceDocumentsTopicLockData) o;
    return Objects.equals(this.lockedBy, contentManagementWorkspaceDocumentsTopicLockData.lockedBy) &&
        Objects.equals(this.dateCreated, contentManagementWorkspaceDocumentsTopicLockData.dateCreated) &&
        Objects.equals(this.dateExpires, contentManagementWorkspaceDocumentsTopicLockData.dateExpires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockedBy, dateCreated, dateExpires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentManagementWorkspaceDocumentsTopicLockData {\n");
    
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
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

