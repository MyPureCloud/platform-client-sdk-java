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
 * StageplanCreate
 */

public class StageplanCreate  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String after = null;

  public StageplanCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public StageplanCreate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the Stageplan. Valid length between 3 and 256 characters.
   **/
  public StageplanCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Stageplan. Valid length between 3 and 256 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the Stageplan. Maximum length of 512 characters.
   **/
  public StageplanCreate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Stageplan. Maximum length of 512 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The ID of the Stageplan to place the new Stageplan after. Omit or null to place at the front.
   **/
  public StageplanCreate after(String after) {
    this.after = after;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Stageplan to place the new Stageplan after. Omit or null to place at the front.")
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StageplanCreate stageplanCreate = (StageplanCreate) o;

    return Objects.equals(this.name, stageplanCreate.name) &&
            Objects.equals(this.description, stageplanCreate.description) &&
            Objects.equals(this.after, stageplanCreate.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StageplanCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

