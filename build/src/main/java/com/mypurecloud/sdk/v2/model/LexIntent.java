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
import com.mypurecloud.sdk.v2.model.LexSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * LexIntent
 */

public class LexIntent  implements Serializable {
  
  private String name = null;
  private String description = null;
  private Map<String, LexSlot> slots = null;
  private String version = null;

  
  /**
   * The intent name
   **/
  public LexIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intent name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A description of the intent
   **/
  public LexIntent description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the intent")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * An object mapping slot names to Slot objects
   **/
  public LexIntent slots(Map<String, LexSlot> slots) {
    this.slots = slots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An object mapping slot names to Slot objects")
  @JsonProperty("slots")
  public Map<String, LexSlot> getSlots() {
    return slots;
  }
  public void setSlots(Map<String, LexSlot> slots) {
    this.slots = slots;
  }

  
  /**
   * The intent version
   **/
  public LexIntent version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intent version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
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
    LexIntent lexIntent = (LexIntent) o;
    return Objects.equals(this.name, lexIntent.name) &&
        Objects.equals(this.description, lexIntent.description) &&
        Objects.equals(this.slots, lexIntent.slots) &&
        Objects.equals(this.version, lexIntent.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, slots, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexIntent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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

