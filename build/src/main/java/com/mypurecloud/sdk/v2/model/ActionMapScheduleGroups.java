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
import com.mypurecloud.sdk.v2.model.ActionMapScheduleGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActionMapScheduleGroups
 */

public class ActionMapScheduleGroups  implements Serializable {
  
  private ActionMapScheduleGroup actionMapScheduleGroup = null;
  private ActionMapScheduleGroup emergencyActionMapScheduleGroup = null;

  
  /**
   * The actions map's associated schedule group.
   **/
  public ActionMapScheduleGroups actionMapScheduleGroup(ActionMapScheduleGroup actionMapScheduleGroup) {
    this.actionMapScheduleGroup = actionMapScheduleGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The actions map's associated schedule group.")
  @JsonProperty("actionMapScheduleGroup")
  public ActionMapScheduleGroup getActionMapScheduleGroup() {
    return actionMapScheduleGroup;
  }
  public void setActionMapScheduleGroup(ActionMapScheduleGroup actionMapScheduleGroup) {
    this.actionMapScheduleGroup = actionMapScheduleGroup;
  }

  
  /**
   * The action map's associated emergency schedule group.
   **/
  public ActionMapScheduleGroups emergencyActionMapScheduleGroup(ActionMapScheduleGroup emergencyActionMapScheduleGroup) {
    this.emergencyActionMapScheduleGroup = emergencyActionMapScheduleGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action map's associated emergency schedule group.")
  @JsonProperty("emergencyActionMapScheduleGroup")
  public ActionMapScheduleGroup getEmergencyActionMapScheduleGroup() {
    return emergencyActionMapScheduleGroup;
  }
  public void setEmergencyActionMapScheduleGroup(ActionMapScheduleGroup emergencyActionMapScheduleGroup) {
    this.emergencyActionMapScheduleGroup = emergencyActionMapScheduleGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMapScheduleGroups actionMapScheduleGroups = (ActionMapScheduleGroups) o;
    return Objects.equals(this.actionMapScheduleGroup, actionMapScheduleGroups.actionMapScheduleGroup) &&
        Objects.equals(this.emergencyActionMapScheduleGroup, actionMapScheduleGroups.emergencyActionMapScheduleGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionMapScheduleGroup, emergencyActionMapScheduleGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMapScheduleGroups {\n");
    
    sb.append("    actionMapScheduleGroup: ").append(toIndentedString(actionMapScheduleGroup)).append("\n");
    sb.append("    emergencyActionMapScheduleGroup: ").append(toIndentedString(emergencyActionMapScheduleGroup)).append("\n");
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

