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
import com.mypurecloud.sdk.v2.model.LexV2Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * LexV2Intent
 */

public class LexV2Intent  implements Serializable {
  
  private String intentName = null;
  private String description = null;
  private Map<String, LexV2Slot> slots = null;
  private String intentId = null;

  
  /**
   * The intent name
   **/
  public LexV2Intent intentName(String intentName) {
    this.intentName = intentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intent name")
  @JsonProperty("intentName")
  public String getIntentName() {
    return intentName;
  }
  public void setIntentName(String intentName) {
    this.intentName = intentName;
  }


  /**
   * A description of the intent
   **/
  public LexV2Intent description(String description) {
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
  public LexV2Intent slots(Map<String, LexV2Slot> slots) {
    this.slots = slots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An object mapping slot names to Slot objects")
  @JsonProperty("slots")
  public Map<String, LexV2Slot> getSlots() {
    return slots;
  }
  public void setSlots(Map<String, LexV2Slot> slots) {
    this.slots = slots;
  }


  /**
   * The intent id
   **/
  public LexV2Intent intentId(String intentId) {
    this.intentId = intentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intent id")
  @JsonProperty("intentId")
  public String getIntentId() {
    return intentId;
  }
  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexV2Intent lexV2Intent = (LexV2Intent) o;

    return Objects.equals(this.intentName, lexV2Intent.intentName) &&
            Objects.equals(this.description, lexV2Intent.description) &&
            Objects.equals(this.slots, lexV2Intent.slots) &&
            Objects.equals(this.intentId, lexV2Intent.intentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentName, description, slots, intentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexV2Intent {\n");
    
    sb.append("    intentName: ").append(toIndentedString(intentName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
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

