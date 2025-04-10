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
import com.mypurecloud.sdk.v2.model.ContentSetting;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EventSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Messaging setting for messaging platform integrations
 */
@ApiModel(description = "Messaging setting for messaging platform integrations")

public class MessagingSetting  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String version = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef updatedBy = null;
  private ContentSetting content = null;
  private EventSetting event = null;
  private String selfUri = null;

  public MessagingSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The messaging Setting unique identifier associated with this integration")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The messaging Setting profile name
   **/
  public MessagingSetting name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging Setting profile name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "Date this messaging setting was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date this messaging setting was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "Version number")
  @JsonProperty("version")
  public String getVersion() {
    return version;
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
   * Configuration relating to message contents
   **/
  public MessagingSetting content(ContentSetting content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration relating to message contents")
  @JsonProperty("content")
  public ContentSetting getContent() {
    return content;
  }
  public void setContent(ContentSetting content) {
    this.content = content;
  }


  /**
   * Configuration relating to events which may occur
   **/
  public MessagingSetting event(EventSetting event) {
    this.event = event;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration relating to events which may occur")
  @JsonProperty("event")
  public EventSetting getEvent() {
    return event;
  }
  public void setEvent(EventSetting event) {
    this.event = event;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingSetting messagingSetting = (MessagingSetting) o;

    return Objects.equals(this.id, messagingSetting.id) &&
            Objects.equals(this.name, messagingSetting.name) &&
            Objects.equals(this.dateCreated, messagingSetting.dateCreated) &&
            Objects.equals(this.dateModified, messagingSetting.dateModified) &&
            Objects.equals(this.version, messagingSetting.version) &&
            Objects.equals(this.createdBy, messagingSetting.createdBy) &&
            Objects.equals(this.updatedBy, messagingSetting.updatedBy) &&
            Objects.equals(this.content, messagingSetting.content) &&
            Objects.equals(this.event, messagingSetting.event) &&
            Objects.equals(this.selfUri, messagingSetting.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, createdBy, updatedBy, content, event, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingSetting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

