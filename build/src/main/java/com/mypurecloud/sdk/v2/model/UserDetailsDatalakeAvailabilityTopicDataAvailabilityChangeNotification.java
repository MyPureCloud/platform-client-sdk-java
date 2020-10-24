package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserDetailsDatalakeAvailabilityTopicDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification
 */

public class UserDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification  implements Serializable {
  
  private UserDetailsDatalakeAvailabilityTopicDateTime dataAvailabilityDate = null;

  
  /**
   **/
  public UserDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification dataAvailabilityDate(UserDetailsDatalakeAvailabilityTopicDateTime dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAvailabilityDate")
  public UserDetailsDatalakeAvailabilityTopicDateTime getDataAvailabilityDate() {
    return dataAvailabilityDate;
  }
  public void setDataAvailabilityDate(UserDetailsDatalakeAvailabilityTopicDateTime dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification userDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification = (UserDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification) o;
    return Objects.equals(this.dataAvailabilityDate, userDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification.dataAvailabilityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAvailabilityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification {\n");
    
    sb.append("    dataAvailabilityDate: ").append(toIndentedString(dataAvailabilityDate)).append("\n");
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

