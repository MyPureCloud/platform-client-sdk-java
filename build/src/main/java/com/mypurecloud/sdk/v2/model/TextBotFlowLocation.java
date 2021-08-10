package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Describes a flow location.
 */
@ApiModel(description = "Describes a flow location.")

public class TextBotFlowLocation  implements Serializable {
  
  private String actionName = null;
  private Integer actionNumber = null;
  private String sequenceName = null;

  
  /**
   * The name of the action that was active when the event of interest happened.
   **/
  public TextBotFlowLocation actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the action that was active when the event of interest happened.")
  @JsonProperty("actionName")
  public String getActionName() {
    return actionName;
  }
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  
  /**
   * The number of the action that was active when the event of interest happened.
   **/
  public TextBotFlowLocation actionNumber(Integer actionNumber) {
    this.actionNumber = actionNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the action that was active when the event of interest happened.")
  @JsonProperty("actionNumber")
  public Integer getActionNumber() {
    return actionNumber;
  }
  public void setActionNumber(Integer actionNumber) {
    this.actionNumber = actionNumber;
  }

  
  /**
   * The name of the state or task which was active when the event of interest happened.
   **/
  public TextBotFlowLocation sequenceName(String sequenceName) {
    this.sequenceName = sequenceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the state or task which was active when the event of interest happened.")
  @JsonProperty("sequenceName")
  public String getSequenceName() {
    return sequenceName;
  }
  public void setSequenceName(String sequenceName) {
    this.sequenceName = sequenceName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotFlowLocation textBotFlowLocation = (TextBotFlowLocation) o;
    return Objects.equals(this.actionName, textBotFlowLocation.actionName) &&
        Objects.equals(this.actionNumber, textBotFlowLocation.actionNumber) &&
        Objects.equals(this.sequenceName, textBotFlowLocation.sequenceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, actionNumber, sequenceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotFlowLocation {\n");
    
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionNumber: ").append(toIndentedString(actionNumber)).append("\n");
    sb.append("    sequenceName: ").append(toIndentedString(sequenceName)).append("\n");
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

