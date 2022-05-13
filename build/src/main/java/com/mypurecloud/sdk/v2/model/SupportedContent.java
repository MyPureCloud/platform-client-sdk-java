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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.MediaTypes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Supported content profile for inbound and outbound messages
 */
@ApiModel(description = "Supported content profile for inbound and outbound messages")

public class SupportedContent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;
  private Integer version = null;
  private MediaTypes mediaTypes = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", required = true, value = "A unique supported content Id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the supported content profile
   **/
  public SupportedContent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the supported content profile")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "Date this supported content profile was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date this supported content profile was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "User reference that created this supported content profile")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "User reference that modified this supported content profile")
  @JsonProperty("modifiedBy")
  public DomainEntityRef getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "Version number")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }


  /**
   * Defines the allowable media that may be accepted for an inbound message or to be sent in an outbound message. The following is an example of allowing all inbound media, and for outbound all images and only mpeg video: {   \"mediaTypes\": {     \"allow\": {       \"inbound\": [{\"type\": \"*\\/\\*\"}],       \"outbound\": [{\"type\": \"image/*\"}, {\"type\": \"video/mpeg\"}]     }   } }
   **/
  public SupportedContent mediaTypes(MediaTypes mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the allowable media that may be accepted for an inbound message or to be sent in an outbound message. The following is an example of allowing all inbound media, and for outbound all images and only mpeg video: {   \"mediaTypes\": {     \"allow\": {       \"inbound\": [{\"type\": \"*\\/\\*\"}],       \"outbound\": [{\"type\": \"image/*\"}, {\"type\": \"video/mpeg\"}]     }   } }")
  @JsonProperty("mediaTypes")
  public MediaTypes getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(MediaTypes mediaTypes) {
    this.mediaTypes = mediaTypes;
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
    SupportedContent supportedContent = (SupportedContent) o;

    return Objects.equals(this.id, supportedContent.id) &&
            Objects.equals(this.name, supportedContent.name) &&
            Objects.equals(this.dateCreated, supportedContent.dateCreated) &&
            Objects.equals(this.dateModified, supportedContent.dateModified) &&
            Objects.equals(this.createdBy, supportedContent.createdBy) &&
            Objects.equals(this.modifiedBy, supportedContent.modifiedBy) &&
            Objects.equals(this.version, supportedContent.version) &&
            Objects.equals(this.mediaTypes, supportedContent.mediaTypes) &&
            Objects.equals(this.selfUri, supportedContent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, createdBy, modifiedBy, version, mediaTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedContent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
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

