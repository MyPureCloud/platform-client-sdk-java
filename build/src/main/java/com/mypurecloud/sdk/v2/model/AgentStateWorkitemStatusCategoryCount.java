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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentStateWorkitemStatusCategoryCount
 */

public class AgentStateWorkitemStatusCategoryCount  implements Serializable {
  

  private static class StatusCategoryEnumDeserializer extends StdDeserializer<StatusCategoryEnum> {
    public StatusCategoryEnumDeserializer() {
      super(StatusCategoryEnumDeserializer.class);
    }

    @Override
    public StatusCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Workitem status category
   */
 @JsonDeserialize(using = StatusCategoryEnumDeserializer.class)
  public enum StatusCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (StatusCategoryEnum value : StatusCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusCategoryEnum statusCategory = null;
  private Integer count = null;

  public AgentStateWorkitemStatusCategoryCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentStateWorkitemStatusCategoryCount(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Workitem status category
   **/
  public AgentStateWorkitemStatusCategoryCount statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Workitem status category")
  @JsonProperty("statusCategory")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }
  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }


  /**
   * Count of workitems with this status category
   **/
  public AgentStateWorkitemStatusCategoryCount count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of workitems with this status category")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateWorkitemStatusCategoryCount agentStateWorkitemStatusCategoryCount = (AgentStateWorkitemStatusCategoryCount) o;

    return Objects.equals(this.statusCategory, agentStateWorkitemStatusCategoryCount.statusCategory) &&
            Objects.equals(this.count, agentStateWorkitemStatusCategoryCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCategory, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateWorkitemStatusCategoryCount {\n");
    
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

