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
 * LexV2Slot
 */

public class LexV2Slot  implements Serializable {
  
  private String slotName = null;
  private String description = null;
  private String slotId = null;
  private String type = null;
  private String slotTypeId = null;

  public LexV2Slot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The slot name
   **/
  public LexV2Slot slotName(String slotName) {
    this.slotName = slotName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The slot name")
  @JsonProperty("slotName")
  public String getSlotName() {
    return slotName;
  }
  public void setSlotName(String slotName) {
    this.slotName = slotName;
  }


  /**
   * The slot description
   **/
  public LexV2Slot description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The slot description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The slot id
   **/
  public LexV2Slot slotId(String slotId) {
    this.slotId = slotId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The slot id")
  @JsonProperty("slotId")
  public String getSlotId() {
    return slotId;
  }
  public void setSlotId(String slotId) {
    this.slotId = slotId;
  }


  /**
   * The slot type
   **/
  public LexV2Slot type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The slot type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * The slot type id
   **/
  public LexV2Slot slotTypeId(String slotTypeId) {
    this.slotTypeId = slotTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The slot type id")
  @JsonProperty("slotTypeId")
  public String getSlotTypeId() {
    return slotTypeId;
  }
  public void setSlotTypeId(String slotTypeId) {
    this.slotTypeId = slotTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexV2Slot lexV2Slot = (LexV2Slot) o;

    return Objects.equals(this.slotName, lexV2Slot.slotName) &&
            Objects.equals(this.description, lexV2Slot.description) &&
            Objects.equals(this.slotId, lexV2Slot.slotId) &&
            Objects.equals(this.type, lexV2Slot.type) &&
            Objects.equals(this.slotTypeId, lexV2Slot.slotTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotName, description, slotId, type, slotTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexV2Slot {\n");
    
    sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    slotId: ").append(toIndentedString(slotId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    slotTypeId: ").append(toIndentedString(slotTypeId)).append("\n");
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

