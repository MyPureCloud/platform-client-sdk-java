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
 * ProgramRequest
 */

public class ProgramRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private List<String> topicIds = new ArrayList<String>();
  private List<String> tags = new ArrayList<String>();

  
  /**
   * The program name
   **/
  public ProgramRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The program name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The program description
   **/
  public ProgramRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The program description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The ids of topics associated to the program
   **/
  public ProgramRequest topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ids of topics associated to the program")
  @JsonProperty("topicIds")
  public List<String> getTopicIds() {
    return topicIds;
  }
  public void setTopicIds(List<String> topicIds) {
    this.topicIds = topicIds;
  }

  
  /**
   * The program tags
   **/
  public ProgramRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The program tags")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramRequest programRequest = (ProgramRequest) o;
    return Objects.equals(this.name, programRequest.name) &&
        Objects.equals(this.description, programRequest.description) &&
        Objects.equals(this.topicIds, programRequest.topicIds) &&
        Objects.equals(this.tags, programRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, topicIds, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

