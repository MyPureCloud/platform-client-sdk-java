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
import com.mypurecloud.sdk.v2.model.ActionConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateActionInput
 */

public class UpdateActionInput  implements Serializable {
  
  private String category = null;
  private String name = null;
  private ActionConfig config = null;
  private Integer version = null;

  
  /**
   * Category of action, Can be up to 256 characters long
   **/
  public UpdateActionInput category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category of action, Can be up to 256 characters long")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Name of action, Can be up to 256 characters long
   **/
  public UpdateActionInput name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of action, Can be up to 256 characters long")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Configuration to support request and response processing
   **/
  public UpdateActionInput config(ActionConfig config) {
    this.config = config;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration to support request and response processing")
  @JsonProperty("config")
  public ActionConfig getConfig() {
    return config;
  }
  public void setConfig(ActionConfig config) {
    this.config = config;
  }

  
  /**
   * Version of this action
   **/
  public UpdateActionInput version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version of this action")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateActionInput updateActionInput = (UpdateActionInput) o;
    return Objects.equals(this.category, updateActionInput.category) &&
        Objects.equals(this.name, updateActionInput.name) &&
        Objects.equals(this.config, updateActionInput.config) &&
        Objects.equals(this.version, updateActionInput.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, config, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateActionInput {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

