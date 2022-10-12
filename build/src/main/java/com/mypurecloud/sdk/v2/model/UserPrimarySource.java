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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserPrimarySource
 */

public class UserPrimarySource  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String sourceId = null;
  private Boolean registered = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public UserPrimarySource name(String name) {
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
   * The id of the source
   **/
  public UserPrimarySource sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the source")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * Whether or not the source is registered
   **/
  public UserPrimarySource registered(Boolean registered) {
    this.registered = registered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the source is registered")
  @JsonProperty("registered")
  public Boolean getRegistered() {
    return registered;
  }
  public void setRegistered(Boolean registered) {
    this.registered = registered;
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
    UserPrimarySource userPrimarySource = (UserPrimarySource) o;

    return Objects.equals(this.id, userPrimarySource.id) &&
            Objects.equals(this.name, userPrimarySource.name) &&
            Objects.equals(this.sourceId, userPrimarySource.sourceId) &&
            Objects.equals(this.registered, userPrimarySource.registered) &&
            Objects.equals(this.selfUri, userPrimarySource.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sourceId, registered, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPrimarySource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
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

