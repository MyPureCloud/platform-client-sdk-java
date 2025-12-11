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
 * GuideSessionTurnInvocationData
 */

public class GuideSessionTurnInvocationData  implements Serializable {
  
  private String group = null;
  private String actionName = null;
  private String output = null;

  public GuideSessionTurnInvocationData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The action group of the invocation data.
   **/
  public GuideSessionTurnInvocationData group(String group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action group of the invocation data.")
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }


  /**
   * The action name of the invocation data.
   **/
  public GuideSessionTurnInvocationData actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action name of the invocation data.")
  @JsonProperty("actionName")
  public String getActionName() {
    return actionName;
  }
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  /**
   * The output of the invocation data.
   **/
  public GuideSessionTurnInvocationData output(String output) {
    this.output = output;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The output of the invocation data.")
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionTurnInvocationData guideSessionTurnInvocationData = (GuideSessionTurnInvocationData) o;

    return Objects.equals(this.group, guideSessionTurnInvocationData.group) &&
            Objects.equals(this.actionName, guideSessionTurnInvocationData.actionName) &&
            Objects.equals(this.output, guideSessionTurnInvocationData.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, actionName, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionTurnInvocationData {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

