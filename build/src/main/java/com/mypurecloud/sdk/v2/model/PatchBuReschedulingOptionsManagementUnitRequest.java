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
 * PatchBuReschedulingOptionsManagementUnitRequest
 */

public class PatchBuReschedulingOptionsManagementUnitRequest  implements Serializable {
  
  private String managementUnitId = null;
  private Boolean applied = null;

  
  /**
   * The management unit portion of the rescheduling run to update
   **/
  public PatchBuReschedulingOptionsManagementUnitRequest managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit portion of the rescheduling run to update")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }

  
  /**
   * Whether to mark the run as applied.  Only applies to reschedule runs.  Once applied, a run cannot be un-marked as applied
   **/
  public PatchBuReschedulingOptionsManagementUnitRequest applied(Boolean applied) {
    this.applied = applied;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to mark the run as applied.  Only applies to reschedule runs.  Once applied, a run cannot be un-marked as applied")
  @JsonProperty("applied")
  public Boolean getApplied() {
    return applied;
  }
  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchBuReschedulingOptionsManagementUnitRequest patchBuReschedulingOptionsManagementUnitRequest = (PatchBuReschedulingOptionsManagementUnitRequest) o;
    return Objects.equals(this.managementUnitId, patchBuReschedulingOptionsManagementUnitRequest.managementUnitId) &&
        Objects.equals(this.applied, patchBuReschedulingOptionsManagementUnitRequest.applied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitId, applied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBuReschedulingOptionsManagementUnitRequest {\n");
    
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
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

