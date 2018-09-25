package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateSchedulingRunRequest
 */

public class UpdateSchedulingRunRequest  implements Serializable {
  
  private Boolean applied = null;

  
  /**
   * Mark the run as applied.  Request will be rejected if the value != true. Note: To discard a run without applying, you still need to mark it as applied so that other reschedule runs can be done
   **/
  public UpdateSchedulingRunRequest applied(Boolean applied) {
    this.applied = applied;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mark the run as applied.  Request will be rejected if the value != true. Note: To discard a run without applying, you still need to mark it as applied so that other reschedule runs can be done")
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
    UpdateSchedulingRunRequest updateSchedulingRunRequest = (UpdateSchedulingRunRequest) o;
    return Objects.equals(this.applied, updateSchedulingRunRequest.applied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSchedulingRunRequest {\n");
    
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

