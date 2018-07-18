package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Request to upload partial set of user schedules
 */
@ApiModel(description = "Request to upload partial set of user schedules")

public class UserSchedulesPartialUploadRequest  implements Serializable {
  
  private Map<String, UserSchedule> userSchedules = null;

  
  /**
   * User schedules that are part of partial request
   **/
  public UserSchedulesPartialUploadRequest userSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User schedules that are part of partial request")
  @JsonProperty("userSchedules")
  public Map<String, UserSchedule> getUserSchedules() {
    return userSchedules;
  }
  public void setUserSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSchedulesPartialUploadRequest userSchedulesPartialUploadRequest = (UserSchedulesPartialUploadRequest) o;
    return Objects.equals(this.userSchedules, userSchedulesPartialUploadRequest.userSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSchedulesPartialUploadRequest {\n");
    
    sb.append("    userSchedules: ").append(toIndentedString(userSchedules)).append("\n");
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

