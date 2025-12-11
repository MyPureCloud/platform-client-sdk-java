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
 * WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals
 */

public class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals  implements Serializable {
  

  private static class ActualActivityCategoryEnumDeserializer extends StdDeserializer<ActualActivityCategoryEnum> {
    public ActualActivityCategoryEnumDeserializer() {
      super(ActualActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActualActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActualActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actualActivityCategory
   */
 @JsonDeserialize(using = ActualActivityCategoryEnumDeserializer.class)
  public enum ActualActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    ActualActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActualActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActualActivityCategoryEnum value : ActualActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActualActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActualActivityCategoryEnum actualActivityCategory = null;
  private String actualSecondaryPresenceId = null;
  private Long startOffsetSeconds = null;
  private Long endOffsetSeconds = null;

  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals actualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualActivityCategory")
  public ActualActivityCategoryEnum getActualActivityCategory() {
    return actualActivityCategory;
  }
  public void setActualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals actualSecondaryPresenceId(String actualSecondaryPresenceId) {
    this.actualSecondaryPresenceId = actualSecondaryPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualSecondaryPresenceId")
  public String getActualSecondaryPresenceId() {
    return actualSecondaryPresenceId;
  }
  public void setActualSecondaryPresenceId(String actualSecondaryPresenceId) {
    this.actualSecondaryPresenceId = actualSecondaryPresenceId;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals startOffsetSeconds(Long startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startOffsetSeconds")
  public Long getStartOffsetSeconds() {
    return startOffsetSeconds;
  }
  public void setStartOffsetSeconds(Long startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals endOffsetSeconds(Long endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endOffsetSeconds")
  public Long getEndOffsetSeconds() {
    return endOffsetSeconds;
  }
  public void setEndOffsetSeconds(Long endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals = (WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals) o;

    return Objects.equals(this.actualActivityCategory, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals.actualActivityCategory) &&
            Objects.equals(this.actualSecondaryPresenceId, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals.actualSecondaryPresenceId) &&
            Objects.equals(this.startOffsetSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals.startOffsetSeconds) &&
            Objects.equals(this.endOffsetSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals.endOffsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualActivityCategory, actualSecondaryPresenceId, startOffsetSeconds, endOffsetSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals {\n");
    
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    actualSecondaryPresenceId: ").append(toIndentedString(actualSecondaryPresenceId)).append("\n");
    sb.append("    startOffsetSeconds: ").append(toIndentedString(startOffsetSeconds)).append("\n");
    sb.append("    endOffsetSeconds: ").append(toIndentedString(endOffsetSeconds)).append("\n");
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

