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
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicInvokingFlowContext;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicInvokingQualityContext;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicInvokingWorkitemContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * This contains contextual information about an invoking entity.
 */
@ApiModel(description = "This contains contextual information about an invoking entity.")

public class V2FlowExecutionDataFlowidTopicInvokingContextInfo  implements Serializable {
  
  private V2FlowExecutionDataFlowidTopicInvokingFlowContext flow = null;
  private V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext journeyActionMap = null;
  private V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext processAutomation = null;
  private V2FlowExecutionDataFlowidTopicInvokingQualityContext quality = null;
  private V2FlowExecutionDataFlowidTopicInvokingWorkitemContext workitem = null;

  public V2FlowExecutionDataFlowidTopicInvokingContextInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContextInfo flow(V2FlowExecutionDataFlowidTopicInvokingFlowContext flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flow")
  public V2FlowExecutionDataFlowidTopicInvokingFlowContext getFlow() {
    return flow;
  }
  public void setFlow(V2FlowExecutionDataFlowidTopicInvokingFlowContext flow) {
    this.flow = flow;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContextInfo journeyActionMap(V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext journeyActionMap) {
    this.journeyActionMap = journeyActionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyActionMap")
  public V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext getJourneyActionMap() {
    return journeyActionMap;
  }
  public void setJourneyActionMap(V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext journeyActionMap) {
    this.journeyActionMap = journeyActionMap;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContextInfo processAutomation(V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext processAutomation) {
    this.processAutomation = processAutomation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processAutomation")
  public V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext getProcessAutomation() {
    return processAutomation;
  }
  public void setProcessAutomation(V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext processAutomation) {
    this.processAutomation = processAutomation;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContextInfo quality(V2FlowExecutionDataFlowidTopicInvokingQualityContext quality) {
    this.quality = quality;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quality")
  public V2FlowExecutionDataFlowidTopicInvokingQualityContext getQuality() {
    return quality;
  }
  public void setQuality(V2FlowExecutionDataFlowidTopicInvokingQualityContext quality) {
    this.quality = quality;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContextInfo workitem(V2FlowExecutionDataFlowidTopicInvokingWorkitemContext workitem) {
    this.workitem = workitem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workitem")
  public V2FlowExecutionDataFlowidTopicInvokingWorkitemContext getWorkitem() {
    return workitem;
  }
  public void setWorkitem(V2FlowExecutionDataFlowidTopicInvokingWorkitemContext workitem) {
    this.workitem = workitem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicInvokingContextInfo v2FlowExecutionDataFlowidTopicInvokingContextInfo = (V2FlowExecutionDataFlowidTopicInvokingContextInfo) o;

    return Objects.equals(this.flow, v2FlowExecutionDataFlowidTopicInvokingContextInfo.flow) &&
            Objects.equals(this.journeyActionMap, v2FlowExecutionDataFlowidTopicInvokingContextInfo.journeyActionMap) &&
            Objects.equals(this.processAutomation, v2FlowExecutionDataFlowidTopicInvokingContextInfo.processAutomation) &&
            Objects.equals(this.quality, v2FlowExecutionDataFlowidTopicInvokingContextInfo.quality) &&
            Objects.equals(this.workitem, v2FlowExecutionDataFlowidTopicInvokingContextInfo.workitem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, journeyActionMap, processAutomation, quality, workitem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicInvokingContextInfo {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    journeyActionMap: ").append(toIndentedString(journeyActionMap)).append("\n");
    sb.append("    processAutomation: ").append(toIndentedString(processAutomation)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
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

