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
 * LimitDocs
 */

public class LimitDocs  implements Serializable {
  
  private String key = null;
  private Long defaultValue = null;
  private String description = null;
  private String resource = null;
  private Boolean configurable = null;
  private Boolean trackable = null;

  public LimitDocs() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public LimitDocs key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  /**
   **/
  public LimitDocs defaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultValue")
  public Long getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
  }


  /**
   **/
  public LimitDocs description(String description) {
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
  public LimitDocs resource(String resource) {
    this.resource = resource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }
  public void setResource(String resource) {
    this.resource = resource;
  }


  /**
   **/
  public LimitDocs configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configurable")
  public Boolean getConfigurable() {
    return configurable;
  }
  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }


  /**
   **/
  public LimitDocs trackable(Boolean trackable) {
    this.trackable = trackable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trackable")
  public Boolean getTrackable() {
    return trackable;
  }
  public void setTrackable(Boolean trackable) {
    this.trackable = trackable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitDocs limitDocs = (LimitDocs) o;

    return Objects.equals(this.key, limitDocs.key) &&
            Objects.equals(this.defaultValue, limitDocs.defaultValue) &&
            Objects.equals(this.description, limitDocs.description) &&
            Objects.equals(this.resource, limitDocs.resource) &&
            Objects.equals(this.configurable, limitDocs.configurable) &&
            Objects.equals(this.trackable, limitDocs.trackable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, defaultValue, description, resource, configurable, trackable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitDocs {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    trackable: ").append(toIndentedString(trackable)).append("\n");
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

