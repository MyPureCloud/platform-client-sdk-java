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
import com.mypurecloud.sdk.v2.model.GuideSessionTurnInvocationParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GuideSessionTurnInvocationResponse
 */

public class GuideSessionTurnInvocationResponse  implements Serializable {
  
  private String id = null;
  private String group = null;
  private String actionName = null;
  private List<GuideSessionTurnInvocationParameters> parameters = null;

  public GuideSessionTurnInvocationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      parameters = new ArrayList<GuideSessionTurnInvocationParameters>();
    }
  }

  
  /**
   * The action ID of the invocation data.
   **/
  public GuideSessionTurnInvocationResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action ID of the invocation data.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The action group of the invocation data.
   **/
  public GuideSessionTurnInvocationResponse group(String group) {
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
  public GuideSessionTurnInvocationResponse actionName(String actionName) {
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
   * The parameters of the invocation response.
   **/
  public GuideSessionTurnInvocationResponse parameters(List<GuideSessionTurnInvocationParameters> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The parameters of the invocation response.")
  @JsonProperty("parameters")
  public List<GuideSessionTurnInvocationParameters> getParameters() {
    return parameters;
  }
  public void setParameters(List<GuideSessionTurnInvocationParameters> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionTurnInvocationResponse guideSessionTurnInvocationResponse = (GuideSessionTurnInvocationResponse) o;

    return Objects.equals(this.id, guideSessionTurnInvocationResponse.id) &&
            Objects.equals(this.group, guideSessionTurnInvocationResponse.group) &&
            Objects.equals(this.actionName, guideSessionTurnInvocationResponse.actionName) &&
            Objects.equals(this.parameters, guideSessionTurnInvocationResponse.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, group, actionName, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionTurnInvocationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

