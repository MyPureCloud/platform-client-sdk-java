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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConfusionIntentInfo
 */

public class ConfusionIntentInfo  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer utteranceCount = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The name of the object.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  /**
   * Number of utterances in this intent which are similar to parent utterance.
   **/
  public ConfusionIntentInfo utteranceCount(Integer utteranceCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfusionIntentInfo confusionIntentInfo = (ConfusionIntentInfo) o;

    return Objects.equals(this.id, confusionIntentInfo.id) &&
            Objects.equals(this.name, confusionIntentInfo.name) &&
            Objects.equals(this.utteranceCount, confusionIntentInfo.utteranceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, utteranceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfusionIntentInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    utteranceCount: ").append(toIndentedString(utteranceCount)).append("\n");
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

