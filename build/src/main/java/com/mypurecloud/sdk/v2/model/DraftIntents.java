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
 * DraftIntents
 */

public class DraftIntents  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<String> utterances = new ArrayList<String>();
  private String selfUri = null;

  
  /**
   * Id for an intent.
   **/
  public DraftIntents id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for an intent.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name/Label for an intent.
   **/
  public DraftIntents name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name/Label for an intent.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The utterances that are extracted for an Intent.
   **/
  public DraftIntents utterances(List<String> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The utterances that are extracted for an Intent.")
  @JsonProperty("utterances")
  public List<String> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<String> utterances) {
    this.utterances = utterances;
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
    DraftIntents draftIntents = (DraftIntents) o;
    return Objects.equals(this.id, draftIntents.id) &&
        Objects.equals(this.name, draftIntents.name) &&
        Objects.equals(this.utterances, draftIntents.utterances) &&
        Objects.equals(this.selfUri, draftIntents.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, utterances, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftIntents {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
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

