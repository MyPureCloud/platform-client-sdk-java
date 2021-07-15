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
import com.mypurecloud.sdk.v2.model.BotSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * A botConnector&#39;s bot intention
 */
@ApiModel(description = "A botConnector's bot intention")

public class BotIntent  implements Serializable {
  
  private String name = null;
  private Map<String, BotSlot> slots = null;

  
  /**
   * The name of this intent.  This can be up to 100 characters long and must be comprised of displayable characters without leading or trailing whitespace
   **/
  public BotIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of this intent.  This can be up to 100 characters long and must be comprised of displayable characters without leading or trailing whitespace")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Optional returned data values associated with this intent, limit of 50.
   **/
  public BotIntent slots(Map<String, BotSlot> slots) {
    this.slots = slots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional returned data values associated with this intent, limit of 50.")
  @JsonProperty("slots")
  public Map<String, BotSlot> getSlots() {
    return slots;
  }
  public void setSlots(Map<String, BotSlot> slots) {
    this.slots = slots;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotIntent botIntent = (BotIntent) o;
    return Objects.equals(this.name, botIntent.name) &&
        Objects.equals(this.slots, botIntent.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotIntent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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

