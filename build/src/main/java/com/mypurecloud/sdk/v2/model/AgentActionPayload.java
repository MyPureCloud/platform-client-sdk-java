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
import com.mypurecloud.sdk.v2.model.AgentAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentActionPayload
 */

public class AgentActionPayload  implements Serializable {
  
  private Boolean afterCallWork = null;
  private List<AgentAction> checklistItems = null;

  public AgentActionPayload() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      checklistItems = new ArrayList<AgentAction>();
    }
  }

  
  /**
   * Boolean flag to indicate if the agent action is in ACW stage.
   **/
  public AgentActionPayload afterCallWork(Boolean afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean flag to indicate if the agent action is in ACW stage.")
  @JsonProperty("afterCallWork")
  public Boolean getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(Boolean afterCallWork) {
    this.afterCallWork = afterCallWork;
  }


  /**
   * The list of checklist items and the agent action taken on each one of them.
   **/
  public AgentActionPayload checklistItems(List<AgentAction> checklistItems) {
    this.checklistItems = checklistItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of checklist items and the agent action taken on each one of them.")
  @JsonProperty("checklistItems")
  public List<AgentAction> getChecklistItems() {
    return checklistItems;
  }
  public void setChecklistItems(List<AgentAction> checklistItems) {
    this.checklistItems = checklistItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentActionPayload agentActionPayload = (AgentActionPayload) o;

    return Objects.equals(this.afterCallWork, agentActionPayload.afterCallWork) &&
            Objects.equals(this.checklistItems, agentActionPayload.checklistItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterCallWork, checklistItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActionPayload {\n");
    
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    checklistItems: ").append(toIndentedString(checklistItems)).append("\n");
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

