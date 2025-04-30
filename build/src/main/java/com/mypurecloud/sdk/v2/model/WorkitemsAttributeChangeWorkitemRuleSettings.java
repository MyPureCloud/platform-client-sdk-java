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
import com.mypurecloud.sdk.v2.model.WorkitemRuleSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemsAttributeChangeWorkitemRuleSettings
 */

public class WorkitemsAttributeChangeWorkitemRuleSettings  implements Serializable {
  
  private WorkitemRuleSettings newValue = null;
  private WorkitemRuleSettings oldValue = null;

  public WorkitemsAttributeChangeWorkitemRuleSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * New property value
   **/
  public WorkitemsAttributeChangeWorkitemRuleSettings newValue(WorkitemRuleSettings newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New property value")
  @JsonProperty("newValue")
  public WorkitemRuleSettings getNewValue() {
    return newValue;
  }
  public void setNewValue(WorkitemRuleSettings newValue) {
    this.newValue = newValue;
  }


  /**
   * Old property value
   **/
  public WorkitemsAttributeChangeWorkitemRuleSettings oldValue(WorkitemRuleSettings oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Old property value")
  @JsonProperty("oldValue")
  public WorkitemRuleSettings getOldValue() {
    return oldValue;
  }
  public void setOldValue(WorkitemRuleSettings oldValue) {
    this.oldValue = oldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsAttributeChangeWorkitemRuleSettings workitemsAttributeChangeWorkitemRuleSettings = (WorkitemsAttributeChangeWorkitemRuleSettings) o;

    return Objects.equals(this.newValue, workitemsAttributeChangeWorkitemRuleSettings.newValue) &&
            Objects.equals(this.oldValue, workitemsAttributeChangeWorkitemRuleSettings.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsAttributeChangeWorkitemRuleSettings {\n");
    
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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

