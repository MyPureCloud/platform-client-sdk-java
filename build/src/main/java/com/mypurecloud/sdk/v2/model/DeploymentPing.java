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
import com.mypurecloud.sdk.v2.model.DeploymentWebAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DeploymentPing
 */

public class DeploymentPing  implements Serializable {
  
  private List<DeploymentWebAction> actions = null;
  private Integer pollIntervalMilliseconds = null;

  public DeploymentPing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      actions = new ArrayList<DeploymentWebAction>();
    }
  }

  
  /**
   * Collection of actions to be offered or displayed to the visitor.
   **/
  public DeploymentPing actions(List<DeploymentWebAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of actions to be offered or displayed to the visitor.")
  @JsonProperty("actions")
  public List<DeploymentWebAction> getActions() {
    return actions;
  }
  public void setActions(List<DeploymentWebAction> actions) {
    this.actions = actions;
  }


  /**
   * Custom poll interval in milliseconds; when the return value is -1, disable pings.
   **/
  public DeploymentPing pollIntervalMilliseconds(Integer pollIntervalMilliseconds) {
    this.pollIntervalMilliseconds = pollIntervalMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom poll interval in milliseconds; when the return value is -1, disable pings.")
  @JsonProperty("pollIntervalMilliseconds")
  public Integer getPollIntervalMilliseconds() {
    return pollIntervalMilliseconds;
  }
  public void setPollIntervalMilliseconds(Integer pollIntervalMilliseconds) {
    this.pollIntervalMilliseconds = pollIntervalMilliseconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentPing deploymentPing = (DeploymentPing) o;

    return Objects.equals(this.actions, deploymentPing.actions) &&
            Objects.equals(this.pollIntervalMilliseconds, deploymentPing.pollIntervalMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, pollIntervalMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentPing {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    pollIntervalMilliseconds: ").append(toIndentedString(pollIntervalMilliseconds)).append("\n");
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

