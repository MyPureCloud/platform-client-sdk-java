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
 * Transcripts
 */

public class Transcripts  implements Serializable {
  
  private List<String> exactMatch = new ArrayList<String>();
  private List<String> contains = new ArrayList<String>();
  private List<String> doesNotContain = new ArrayList<String>();

  
  /**
   * List of transcript contents which needs to satisfy exact match criteria
   **/
  public Transcripts exactMatch(List<String> exactMatch) {
    this.exactMatch = exactMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of transcript contents which needs to satisfy exact match criteria")
  @JsonProperty("exactMatch")
  public List<String> getExactMatch() {
    return exactMatch;
  }
  public void setExactMatch(List<String> exactMatch) {
    this.exactMatch = exactMatch;
  }

  
  /**
   * List of transcript contents which needs to satisfy contains criteria
   **/
  public Transcripts contains(List<String> contains) {
    this.contains = contains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of transcript contents which needs to satisfy contains criteria")
  @JsonProperty("contains")
  public List<String> getContains() {
    return contains;
  }
  public void setContains(List<String> contains) {
    this.contains = contains;
  }

  
  /**
   * List of transcript contents which needs to satisfy does not contain criteria
   **/
  public Transcripts doesNotContain(List<String> doesNotContain) {
    this.doesNotContain = doesNotContain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of transcript contents which needs to satisfy does not contain criteria")
  @JsonProperty("doesNotContain")
  public List<String> getDoesNotContain() {
    return doesNotContain;
  }
  public void setDoesNotContain(List<String> doesNotContain) {
    this.doesNotContain = doesNotContain;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transcripts transcripts = (Transcripts) o;
    return Objects.equals(this.exactMatch, transcripts.exactMatch) &&
        Objects.equals(this.contains, transcripts.contains) &&
        Objects.equals(this.doesNotContain, transcripts.doesNotContain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exactMatch, contains, doesNotContain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transcripts {\n");
    
    sb.append("    exactMatch: ").append(toIndentedString(exactMatch)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    doesNotContain: ").append(toIndentedString(doesNotContain)).append("\n");
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

