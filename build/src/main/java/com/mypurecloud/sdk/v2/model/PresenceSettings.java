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
import com.mypurecloud.sdk.v2.model.RestorePresenceSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PresenceSettings
 */

public class PresenceSettings  implements Serializable {
  
  private String id = null;
  private String name = null;
  private RestorePresenceSettings restorePresenceSettings = null;
  private String selfUri = null;

  public PresenceSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public PresenceSettings name(String name) {
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
   * The settings for the restore presence feature
   **/
  public PresenceSettings restorePresenceSettings(RestorePresenceSettings restorePresenceSettings) {
    this.restorePresenceSettings = restorePresenceSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for the restore presence feature")
  @JsonProperty("restorePresenceSettings")
  public RestorePresenceSettings getRestorePresenceSettings() {
    return restorePresenceSettings;
  }
  public void setRestorePresenceSettings(RestorePresenceSettings restorePresenceSettings) {
    this.restorePresenceSettings = restorePresenceSettings;
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
    PresenceSettings presenceSettings = (PresenceSettings) o;

    return Objects.equals(this.id, presenceSettings.id) &&
            Objects.equals(this.name, presenceSettings.name) &&
            Objects.equals(this.restorePresenceSettings, presenceSettings.restorePresenceSettings) &&
            Objects.equals(this.selfUri, presenceSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, restorePresenceSettings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restorePresenceSettings: ").append(toIndentedString(restorePresenceSettings)).append("\n");
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

