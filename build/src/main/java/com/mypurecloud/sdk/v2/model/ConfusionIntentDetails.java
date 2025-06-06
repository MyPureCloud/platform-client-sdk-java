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
import com.mypurecloud.sdk.v2.model.ConfusionUtterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConfusionIntentDetails
 */

public class ConfusionIntentDetails  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer utteranceCount = null;
  private List<ConfusionUtterance> utterances = null;
  private String selfUri = null;

  public ConfusionIntentDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      utterances = new ArrayList<ConfusionUtterance>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ConfusionIntentDetails name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Number of utterances in this intent which are similar to parent utterance.
   **/
  public ConfusionIntentDetails utteranceCount(Integer utteranceCount) {
    this.utteranceCount = utteranceCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of utterances in this intent which are similar to parent utterance.")
  @JsonProperty("utteranceCount")
  public Integer getUtteranceCount() {
    return utteranceCount;
  }
  public void setUtteranceCount(Integer utteranceCount) {
    this.utteranceCount = utteranceCount;
  }


  /**
   * List of utterance which are similar to parent utterance.
   **/
  public ConfusionIntentDetails utterances(List<ConfusionUtterance> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of utterance which are similar to parent utterance.")
  @JsonProperty("utterances")
  public List<ConfusionUtterance> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<ConfusionUtterance> utterances) {
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
    ConfusionIntentDetails confusionIntentDetails = (ConfusionIntentDetails) o;

    return Objects.equals(this.id, confusionIntentDetails.id) &&
            Objects.equals(this.name, confusionIntentDetails.name) &&
            Objects.equals(this.utteranceCount, confusionIntentDetails.utteranceCount) &&
            Objects.equals(this.utterances, confusionIntentDetails.utterances) &&
            Objects.equals(this.selfUri, confusionIntentDetails.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, utteranceCount, utterances, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfusionIntentDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    utteranceCount: ").append(toIndentedString(utteranceCount)).append("\n");
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

