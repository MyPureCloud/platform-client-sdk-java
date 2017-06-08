package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Container for a map of ActivityCodeId to ActivityCode
 */
@ApiModel(description = "Container for a map of ActivityCodeId to ActivityCode")

public class ActivityCodeContainer  implements Serializable {
  
  private Map<String, ActivityCode> activityCodes = new HashMap<String, ActivityCode>();

  
  /**
   * Map of activity code id to activity code
   **/
  public ActivityCodeContainer activityCodes(Map<String, ActivityCode> activityCodes) {
    this.activityCodes = activityCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of activity code id to activity code")
  @JsonProperty("activityCodes")
  public Map<String, ActivityCode> getActivityCodes() {
    return activityCodes;
  }
  public void setActivityCodes(Map<String, ActivityCode> activityCodes) {
    this.activityCodes = activityCodes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityCodeContainer activityCodeContainer = (ActivityCodeContainer) o;
    return Objects.equals(this.activityCodes, activityCodeContainer.activityCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityCodeContainer {\n");
    
    sb.append("    activityCodes: ").append(toIndentedString(activityCodes)).append("\n");
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

