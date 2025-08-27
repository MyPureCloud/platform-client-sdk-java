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
import com.mypurecloud.sdk.v2.model.DataIngestionRuleCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TopicCriteria
 */

public class TopicCriteria  implements Serializable {
  
  private String topicId = null;
  private List<DataIngestionRuleCriteria> dataIngestionRules = null;

  public TopicCriteria() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dataIngestionRules = new ArrayList<DataIngestionRuleCriteria>();
    }
  }

  
  /**
   * The ID of the topic.
   **/
  public TopicCriteria topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the topic.")
  @JsonProperty("topicId")
  public String getTopicId() {
    return topicId;
  }
  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }


  /**
   * The data ingestion rules for this topic.
   **/
  public TopicCriteria dataIngestionRules(List<DataIngestionRuleCriteria> dataIngestionRules) {
    this.dataIngestionRules = dataIngestionRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data ingestion rules for this topic.")
  @JsonProperty("dataIngestionRules")
  public List<DataIngestionRuleCriteria> getDataIngestionRules() {
    return dataIngestionRules;
  }
  public void setDataIngestionRules(List<DataIngestionRuleCriteria> dataIngestionRules) {
    this.dataIngestionRules = dataIngestionRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicCriteria topicCriteria = (TopicCriteria) o;

    return Objects.equals(this.topicId, topicCriteria.topicId) &&
            Objects.equals(this.dataIngestionRules, topicCriteria.dataIngestionRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, dataIngestionRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicCriteria {\n");
    
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    dataIngestionRules: ").append(toIndentedString(dataIngestionRules)).append("\n");
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

