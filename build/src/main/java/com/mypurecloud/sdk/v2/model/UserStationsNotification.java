package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserStationsNotificationAssociatedStation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserStationsNotification
 */

public class UserStationsNotification  implements Serializable {
  
  private UserStationsNotificationAssociatedStation associatedStation = null;

  
  /**
   **/
  public UserStationsNotification associatedStation(UserStationsNotificationAssociatedStation associatedStation) {
    this.associatedStation = associatedStation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("associatedStation")
  public UserStationsNotificationAssociatedStation getAssociatedStation() {
    return associatedStation;
  }
  public void setAssociatedStation(UserStationsNotificationAssociatedStation associatedStation) {
    this.associatedStation = associatedStation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStationsNotification userStationsNotification = (UserStationsNotification) o;
    return Objects.equals(this.associatedStation, userStationsNotification.associatedStation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedStation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStationsNotification {\n");
    
    sb.append("    associatedStation: ").append(toIndentedString(associatedStation)).append("\n");
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

