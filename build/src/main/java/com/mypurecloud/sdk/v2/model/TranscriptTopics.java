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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptTopics
 */

public class TranscriptTopics  implements Serializable {
  
  private List<String> includes = new ArrayList<String>();
  private List<String> excludes = new ArrayList<String>();

  
  /**
   * List of topics which need to be included in exact match criteria. This field is not mutually exclusive with excludes topic list.
   **/
  public TranscriptTopics includes(List<String> includes) {
    this.includes = includes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of topics which need to be included in exact match criteria. This field is not mutually exclusive with excludes topic list.")
  @JsonProperty("includes")
  public List<String> getIncludes() {
    return includes;
  }
  public void setIncludes(List<String> includes) {
    this.includes = includes;
  }

  
  /**
   * List of topics which need to be excluded in exact match criteria. This field is not mutually exclusive with includes topic list.
   **/
  public TranscriptTopics excludes(List<String> excludes) {
    this.excludes = excludes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of topics which need to be excluded in exact match criteria. This field is not mutually exclusive with includes topic list.")
  @JsonProperty("excludes")
  public List<String> getExcludes() {
    return excludes;
  }
  public void setExcludes(List<String> excludes) {
    this.excludes = excludes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptTopics transcriptTopics = (TranscriptTopics) o;
    return Objects.equals(this.includes, transcriptTopics.includes) &&
        Objects.equals(this.excludes, transcriptTopics.excludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includes, excludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptTopics {\n");
    
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
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

