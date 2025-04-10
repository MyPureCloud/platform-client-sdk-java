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
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicFlow;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicJourneyActionMap;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicProcessAutomation;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicQuality;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicWorkitem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * This contains contextual information about an invoking entity.
 */
@ApiModel(description = "This contains contextual information about an invoking entity.")

public class V2FlowExecutionDataFlowidTopicInvokingContext  implements Serializable {
  
  private V2FlowExecutionDataFlowidTopicFlow flow = null;
  private V2FlowExecutionDataFlowidTopicJourneyActionMap journeyActionMap = null;
  private V2FlowExecutionDataFlowidTopicProcessAutomation processAutomation = null;
  private V2FlowExecutionDataFlowidTopicQuality quality = null;
  private V2FlowExecutionDataFlowidTopicWorkitem workitem = null;

  public V2FlowExecutionDataFlowidTopicInvokingContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContext flow(V2FlowExecutionDataFlowidTopicFlow flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flow")
  public V2FlowExecutionDataFlowidTopicFlow getFlow() {
    return flow;
  }
  public void setFlow(V2FlowExecutionDataFlowidTopicFlow flow) {
    this.flow = flow;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContext journeyActionMap(V2FlowExecutionDataFlowidTopicJourneyActionMap journeyActionMap) {
    this.journeyActionMap = journeyActionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyActionMap")
  public V2FlowExecutionDataFlowidTopicJourneyActionMap getJourneyActionMap() {
    return journeyActionMap;
  }
  public void setJourneyActionMap(V2FlowExecutionDataFlowidTopicJourneyActionMap journeyActionMap) {
    this.journeyActionMap = journeyActionMap;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContext processAutomation(V2FlowExecutionDataFlowidTopicProcessAutomation processAutomation) {
    this.processAutomation = processAutomation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processAutomation")
  public V2FlowExecutionDataFlowidTopicProcessAutomation getProcessAutomation() {
    return processAutomation;
  }
  public void setProcessAutomation(V2FlowExecutionDataFlowidTopicProcessAutomation processAutomation) {
    this.processAutomation = processAutomation;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContext quality(V2FlowExecutionDataFlowidTopicQuality quality) {
    this.quality = quality;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quality")
  public V2FlowExecutionDataFlowidTopicQuality getQuality() {
    return quality;
  }
  public void setQuality(V2FlowExecutionDataFlowidTopicQuality quality) {
    this.quality = quality;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicInvokingContext workitem(V2FlowExecutionDataFlowidTopicWorkitem workitem) {
    this.workitem = workitem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workitem")
  public V2FlowExecutionDataFlowidTopicWorkitem getWorkitem() {
    return workitem;
  }
  public void setWorkitem(V2FlowExecutionDataFlowidTopicWorkitem workitem) {
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
    V2FlowExecutionDataFlowidTopicInvokingContext v2FlowExecutionDataFlowidTopicInvokingContext = (V2FlowExecutionDataFlowidTopicInvokingContext) o;

    return Objects.equals(this.flow, v2FlowExecutionDataFlowidTopicInvokingContext.flow) &&
            Objects.equals(this.journeyActionMap, v2FlowExecutionDataFlowidTopicInvokingContext.journeyActionMap) &&
            Objects.equals(this.processAutomation, v2FlowExecutionDataFlowidTopicInvokingContext.processAutomation) &&
            Objects.equals(this.quality, v2FlowExecutionDataFlowidTopicInvokingContext.quality) &&
            Objects.equals(this.workitem, v2FlowExecutionDataFlowidTopicInvokingContext.workitem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, journeyActionMap, processAutomation, quality, workitem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicInvokingContext {\n");
    
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

