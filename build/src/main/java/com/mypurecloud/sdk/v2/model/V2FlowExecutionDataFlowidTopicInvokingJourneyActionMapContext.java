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

public class V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext  implements Serializable {
  
  private String actionMapId = null;
  private String actionId = null;

  public V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The identifier of the journey action map that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext actionMapId(String actionMapId) {
    this.actionMapId = actionMapId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the journey action map that invoked this flow.")
  @JsonProperty("actionMapId")
  public String getActionMapId() {
    return actionMapId;
  }
  public void setActionMapId(String actionMapId) {
    this.actionMapId = actionMapId;
  }


  /**
   * The identifier of the specific action map instance that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the specific action map instance that invoked this flow.")
  @JsonProperty("actionId")
  public String getActionId() {
    return actionId;
  }
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext v2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext = (V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext) o;

    return Objects.equals(this.actionMapId, v2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext.actionMapId) &&
            Objects.equals(this.actionId, v2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext.actionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionMapId, actionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicInvokingJourneyActionMapContext {\n");
    
    sb.append("    actionMapId: ").append(toIndentedString(actionMapId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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

