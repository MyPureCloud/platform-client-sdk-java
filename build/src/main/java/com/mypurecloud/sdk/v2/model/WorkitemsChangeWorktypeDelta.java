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
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorktypeDelta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemsChangeWorktypeDelta
 */

public class WorkitemsChangeWorktypeDelta  implements Serializable {
  
  private Integer version = null;
  private UserReference modifiedBy = null;
  private WorktypeDelta delta = null;

  
  /**
   * Version
   **/
  public WorkitemsChangeWorktypeDelta version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * modifiedBy
   **/
  public WorkitemsChangeWorktypeDelta modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "modifiedBy")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The changes that originated this version
   **/
  public WorkitemsChangeWorktypeDelta delta(WorktypeDelta delta) {
    this.delta = delta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The changes that originated this version")
  @JsonProperty("delta")
  public WorktypeDelta getDelta() {
    return delta;
  }
  public void setDelta(WorktypeDelta delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsChangeWorktypeDelta workitemsChangeWorktypeDelta = (WorkitemsChangeWorktypeDelta) o;

    return Objects.equals(this.version, workitemsChangeWorktypeDelta.version) &&
            Objects.equals(this.modifiedBy, workitemsChangeWorktypeDelta.modifiedBy) &&
            Objects.equals(this.delta, workitemsChangeWorktypeDelta.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, modifiedBy, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsChangeWorktypeDelta {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

