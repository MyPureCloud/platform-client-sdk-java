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
import com.mypurecloud.sdk.v2.model.ContentSetting;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EventSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Messaging Setting for messaging platform integrations
 */
@ApiModel(description = "Messaging Setting for messaging platform integrations")

public class MessagingSettingReference  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String version = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef updatedBy = null;
  private ContentSetting content = null;
  private EventSetting event = null;

  
  /**
   * The messaging Setting unique identifier associated with this integration
   **/
  public MessagingSettingReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging Setting unique identifier associated with this integration")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  @ApiModelProperty(example = "null", value = "The messaging Setting profile name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The messaging Setting profile URI")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "Date this messaging Setting was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Date this messaging Setting was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Version number
   **/
  public MessagingSettingReference version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version number")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  @ApiModelProperty(example = "null", value = "User reference that created this Setting")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "User reference that modified this Setting")
  @JsonProperty("updatedBy")
  public DomainEntityRef getUpdatedBy() {
    return updatedBy;
  }

  
  /**
   * Settings relating to message contents
   **/
  public MessagingSettingReference content(ContentSetting content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings relating to message contents")
  @JsonProperty("content")
  public ContentSetting getContent() {
    return content;
  }
  public void setContent(ContentSetting content) {
    this.content = content;
  }

  
  /**
   * Settings relating to events which may occur
   **/
  public MessagingSettingReference event(EventSetting event) {
    this.event = event;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings relating to events which may occur")
  @JsonProperty("event")
  public EventSetting getEvent() {
    return event;
  }
  public void setEvent(EventSetting event) {
    this.event = event;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingSettingReference messagingSettingReference = (MessagingSettingReference) o;
    return Objects.equals(this.id, messagingSettingReference.id) &&
        Objects.equals(this.name, messagingSettingReference.name) &&
        Objects.equals(this.selfUri, messagingSettingReference.selfUri) &&
        Objects.equals(this.dateCreated, messagingSettingReference.dateCreated) &&
        Objects.equals(this.dateModified, messagingSettingReference.dateModified) &&
        Objects.equals(this.version, messagingSettingReference.version) &&
        Objects.equals(this.createdBy, messagingSettingReference.createdBy) &&
        Objects.equals(this.updatedBy, messagingSettingReference.updatedBy) &&
        Objects.equals(this.content, messagingSettingReference.content) &&
        Objects.equals(this.event, messagingSettingReference.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, dateCreated, dateModified, version, createdBy, updatedBy, content, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingSettingReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

