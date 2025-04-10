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
import com.mypurecloud.sdk.v2.model.ConversationActivityEntityData;
import com.mypurecloud.sdk.v2.model.ConversationActivityMetricValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationActivityData
 */

public class ConversationActivityData  implements Serializable {
  
  private Map<String, String> group = null;
  private List<ConversationActivityMetricValue> data = null;
  private Boolean truncated = null;
  private List<ConversationActivityEntityData> entities = null;

  public ConversationActivityData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      data = new ArrayList<ConversationActivityMetricValue>();
      entities = new ArrayList<ConversationActivityEntityData>();
    }
  }

  
  /**
   * A mapping from grouping dimension to value
   **/
  public ConversationActivityData group(Map<String, String> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A mapping from grouping dimension to value")
  @JsonProperty("group")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }


  /**
   * Data for metrics
   **/
  public ConversationActivityData data(List<ConversationActivityMetricValue> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data for metrics")
  @JsonProperty("data")
  public List<ConversationActivityMetricValue> getData() {
    return data;
  }
  public void setData(List<ConversationActivityMetricValue> data) {
    this.data = data;
  }


  /**
   * Flag for a truncated list of entities. If truncated, the first half of the list of entities will contain the oldest entities and the second half the newest entities.
   **/
  public ConversationActivityData truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag for a truncated list of entities. If truncated, the first half of the list of entities will contain the oldest entities and the second half the newest entities.")
  @JsonProperty("truncated")
  public Boolean getTruncated() {
    return truncated;
  }
  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  /**
   * Details for active entities
   **/
  public ConversationActivityData entities(List<ConversationActivityEntityData> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details for active entities")
  @JsonProperty("entities")
  public List<ConversationActivityEntityData> getEntities() {
    return entities;
  }
  public void setEntities(List<ConversationActivityEntityData> entities) {
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
    ConversationActivityData conversationActivityData = (ConversationActivityData) o;

    return Objects.equals(this.group, conversationActivityData.group) &&
            Objects.equals(this.data, conversationActivityData.data) &&
            Objects.equals(this.truncated, conversationActivityData.truncated) &&
            Objects.equals(this.entities, conversationActivityData.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data, truncated, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationActivityData {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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

