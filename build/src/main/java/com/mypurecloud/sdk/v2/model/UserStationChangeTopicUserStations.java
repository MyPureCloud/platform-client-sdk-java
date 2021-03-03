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
import com.mypurecloud.sdk.v2.model.UserStationChangeTopicUserStation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserStationChangeTopicUserStations
 */

public class UserStationChangeTopicUserStations  implements Serializable {
  
  private UserStationChangeTopicUserStation associatedStation = null;

  
  /**
   **/
  public UserStationChangeTopicUserStations associatedStation(UserStationChangeTopicUserStation associatedStation) {
    this.associatedStation = associatedStation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("associatedStation")
  public UserStationChangeTopicUserStation getAssociatedStation() {
    return associatedStation;
  }
  public void setAssociatedStation(UserStationChangeTopicUserStation associatedStation) {
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
    UserStationChangeTopicUserStations userStationChangeTopicUserStations = (UserStationChangeTopicUserStations) o;
    return Objects.equals(this.associatedStation, userStationChangeTopicUserStations.associatedStation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedStation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStationChangeTopicUserStations {\n");
    
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

