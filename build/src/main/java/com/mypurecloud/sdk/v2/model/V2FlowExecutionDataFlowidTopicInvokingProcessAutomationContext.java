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
 * This contains contextual information about an invoking entity.
 */
@ApiModel(description = "This contains contextual information about an invoking entity.")

public class V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext  implements Serializable {
  
  private String triggerId = null;
  private String triggerName = null;

  public V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The identifier of the process automation trigger that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext triggerId(String triggerId) {
    this.triggerId = triggerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the process automation trigger that invoked this flow.")
  @JsonProperty("triggerId")
  public String getTriggerId() {
    return triggerId;
  }
  public void setTriggerId(String triggerId) {
    this.triggerId = triggerId;
  }


  /**
   * The name of the process automation trigger that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext triggerName(String triggerName) {
    this.triggerName = triggerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the process automation trigger that invoked this flow.")
  @JsonProperty("triggerName")
  public String getTriggerName() {
    return triggerName;
  }
  public void setTriggerName(String triggerName) {
    this.triggerName = triggerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext v2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext = (V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext) o;

    return Objects.equals(this.triggerId, v2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext.triggerId) &&
            Objects.equals(this.triggerName, v2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext.triggerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerId, triggerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicInvokingProcessAutomationContext {\n");
    
    sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
    sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
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

