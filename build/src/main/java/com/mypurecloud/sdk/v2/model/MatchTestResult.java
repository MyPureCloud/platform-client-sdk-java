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
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Information about the results being matched by the expressions
 */
@ApiModel(description = "Information about the results being matched by the expressions")

public class MatchTestResult  implements Serializable {
  
  private JsonNode value = null;
  private String path = null;

  
  /**
   * The value of the field being matched
   **/
  public MatchTestResult value(JsonNode value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the field being matched")
  @JsonProperty("value")
  public JsonNode getValue() {
    return value;
  }
  public void setValue(JsonNode value) {
    this.value = value;
  }


  /**
   * The json path to the json node being matched on. ex: $['things'][1]
   **/
  public MatchTestResult path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The json path to the json node being matched on. ex: $['things'][1]")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTestResult matchTestResult = (MatchTestResult) o;

    return Objects.equals(this.value, matchTestResult.value) &&
            Objects.equals(this.path, matchTestResult.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTestResult {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

