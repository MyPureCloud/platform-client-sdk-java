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
 * CopyDecisionTableRequest
 */

public class CopyDecisionTableRequest  implements Serializable {
  
  private String name = null;
  private String description = null;

  public CopyDecisionTableRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the newly created decision table. Must be unique
   **/
  public CopyDecisionTableRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the newly created decision table. Must be unique")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of newly created decision table.
   **/
  public CopyDecisionTableRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of newly created decision table.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyDecisionTableRequest copyDecisionTableRequest = (CopyDecisionTableRequest) o;

    return Objects.equals(this.name, copyDecisionTableRequest.name) &&
            Objects.equals(this.description, copyDecisionTableRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyDecisionTableRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

