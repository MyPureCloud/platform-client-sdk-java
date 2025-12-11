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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity
 */

public class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity  implements Serializable {
  
  private String activityCodeId = null;
  private Long startOffsetSeconds = null;
  private Long endOffsetSeconds = null;

  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity startOffsetSeconds(Long startOffsetSeconds) {
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
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity endOffsetSeconds(Long endOffsetSeconds) {
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
    WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity = (WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity) o;

    return Objects.equals(this.activityCodeId, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity.activityCodeId) &&
            Objects.equals(this.startOffsetSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity.startOffsetSeconds) &&
            Objects.equals(this.endOffsetSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity.endOffsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, startOffsetSeconds, endOffsetSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
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

