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
 * FlowOutcomeDetailEventTopicFlowMilestone
 */

public class FlowOutcomeDetailEventTopicFlowMilestone  implements Serializable {
  
  private String milestoneId = null;
  private Long milestoneTime = null;

  public FlowOutcomeDetailEventTopicFlowMilestone() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public FlowOutcomeDetailEventTopicFlowMilestone milestoneId(String milestoneId) {
    this.milestoneId = milestoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("milestoneId")
  public String getMilestoneId() {
    return milestoneId;
  }
  public void setMilestoneId(String milestoneId) {
    this.milestoneId = milestoneId;
  }


  /**
   **/
  public FlowOutcomeDetailEventTopicFlowMilestone milestoneTime(Long milestoneTime) {
    this.milestoneTime = milestoneTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("milestoneTime")
  public Long getMilestoneTime() {
    return milestoneTime;
  }
  public void setMilestoneTime(Long milestoneTime) {
    this.milestoneTime = milestoneTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowOutcomeDetailEventTopicFlowMilestone flowOutcomeDetailEventTopicFlowMilestone = (FlowOutcomeDetailEventTopicFlowMilestone) o;

    return Objects.equals(this.milestoneId, flowOutcomeDetailEventTopicFlowMilestone.milestoneId) &&
            Objects.equals(this.milestoneTime, flowOutcomeDetailEventTopicFlowMilestone.milestoneTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(milestoneId, milestoneTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowOutcomeDetailEventTopicFlowMilestone {\n");
    
    sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
    sb.append("    milestoneTime: ").append(toIndentedString(milestoneTime)).append("\n");
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

