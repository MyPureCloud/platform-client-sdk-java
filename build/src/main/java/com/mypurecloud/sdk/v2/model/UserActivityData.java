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
import com.mypurecloud.sdk.v2.model.UserActivityEntityData;
import com.mypurecloud.sdk.v2.model.UserActivityMetricValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UserActivityData
 */

public class UserActivityData  implements Serializable {
  
  private Map<String, String> group = null;
  private List<UserActivityMetricValue> data = null;
  private Boolean truncated = null;
  private List<UserActivityEntityData> entities = null;

  public UserActivityData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      data = new ArrayList<UserActivityMetricValue>();
      entities = new ArrayList<UserActivityEntityData>();
    }
  }

  
  /**
   * A mapping from grouping dimension to value
   **/
  public UserActivityData group(Map<String, String> group) {
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
  public UserActivityData data(List<UserActivityMetricValue> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data for metrics")
  @JsonProperty("data")
  public List<UserActivityMetricValue> getData() {
    return data;
  }
  public void setData(List<UserActivityMetricValue> data) {
    this.data = data;
  }


  /**
   * Flag for a truncated list of entities. If truncated, the first half of the list of entities will contain the oldest entities and the second half the newest entities.
   **/
  public UserActivityData truncated(Boolean truncated) {
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
  public UserActivityData entities(List<UserActivityEntityData> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details for active entities")
  @JsonProperty("entities")
  public List<UserActivityEntityData> getEntities() {
    return entities;
  }
  public void setEntities(List<UserActivityEntityData> entities) {
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
    UserActivityData userActivityData = (UserActivityData) o;

    return Objects.equals(this.group, userActivityData.group) &&
            Objects.equals(this.data, userActivityData.data) &&
            Objects.equals(this.truncated, userActivityData.truncated) &&
            Objects.equals(this.entities, userActivityData.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data, truncated, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityData {\n");
    
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

