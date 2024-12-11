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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WrapupDelta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemsAttributeChangeWrapupDelta
 */

public class WorkitemsAttributeChangeWrapupDelta  implements Serializable {
  
  private WrapupDelta newValue = null;
  private WrapupDelta oldValue = null;

  
  /**
   * New property value
   **/
  public WorkitemsAttributeChangeWrapupDelta newValue(WrapupDelta newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New property value")
  @JsonProperty("newValue")
  public WrapupDelta getNewValue() {
    return newValue;
  }
  public void setNewValue(WrapupDelta newValue) {
    this.newValue = newValue;
  }


  /**
   * Old property value
   **/
  public WorkitemsAttributeChangeWrapupDelta oldValue(WrapupDelta oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Old property value")
  @JsonProperty("oldValue")
  public WrapupDelta getOldValue() {
    return oldValue;
  }
  public void setOldValue(WrapupDelta oldValue) {
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
    WorkitemsAttributeChangeWrapupDelta workitemsAttributeChangeWrapupDelta = (WorkitemsAttributeChangeWrapupDelta) o;

    return Objects.equals(this.newValue, workitemsAttributeChangeWrapupDelta.newValue) &&
            Objects.equals(this.oldValue, workitemsAttributeChangeWrapupDelta.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsAttributeChangeWrapupDelta {\n");
    
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

