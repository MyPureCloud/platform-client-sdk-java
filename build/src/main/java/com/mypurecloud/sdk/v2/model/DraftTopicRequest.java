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
 * DraftTopicRequest
 */

public class DraftTopicRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<String> phrases = new ArrayList<String>();
  private String selfUri = null;

  
  /**
   * Id for a topic.
   **/
  public DraftTopicRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for a topic.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name/Label for a topic.
   **/
  public DraftTopicRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name/Label for a topic.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The phrases that are extracted for a topic.
   **/
  public DraftTopicRequest phrases(List<String> phrases) {
    this.phrases = phrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phrases that are extracted for a topic.")
  @JsonProperty("phrases")
  public List<String> getPhrases() {
    return phrases;
  }
  public void setPhrases(List<String> phrases) {
    this.phrases = phrases;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftTopicRequest draftTopicRequest = (DraftTopicRequest) o;
    return Objects.equals(this.id, draftTopicRequest.id) &&
        Objects.equals(this.name, draftTopicRequest.name) &&
        Objects.equals(this.phrases, draftTopicRequest.phrases) &&
        Objects.equals(this.selfUri, draftTopicRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phrases, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftTopicRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

