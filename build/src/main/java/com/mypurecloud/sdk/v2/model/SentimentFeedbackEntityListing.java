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
import com.mypurecloud.sdk.v2.model.SentimentFeedback;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SentimentFeedbackEntityListing
 */

public class SentimentFeedbackEntityListing  implements Serializable {
  
  private List<SentimentFeedback> entities = new ArrayList<SentimentFeedback>();

  
  /**
   **/
  public SentimentFeedbackEntityListing entities(List<SentimentFeedback> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<SentimentFeedback> getEntities() {
    return entities;
  }
  public void setEntities(List<SentimentFeedback> entities) {
    this.entities = entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentFeedbackEntityListing sentimentFeedbackEntityListing = (SentimentFeedbackEntityListing) o;
    return Objects.equals(this.entities, sentimentFeedbackEntityListing.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentFeedbackEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

