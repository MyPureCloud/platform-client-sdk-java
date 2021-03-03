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
import com.mypurecloud.sdk.v2.model.UserStation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserStations
 */

public class UserStations  implements Serializable {
  
  private UserStation associatedStation = null;
  private UserStation effectiveStation = null;
  private UserStation defaultStation = null;
  private UserStation lastAssociatedStation = null;

  
  /**
   * Current associated station for this user.
   **/
  public UserStations associatedStation(UserStation associatedStation) {
    this.associatedStation = associatedStation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current associated station for this user.")
  @JsonProperty("associatedStation")
  public UserStation getAssociatedStation() {
    return associatedStation;
  }
  public void setAssociatedStation(UserStation associatedStation) {
    this.associatedStation = associatedStation;
  }

  
  /**
   * The station where the user can be reached based on their default and associated station.
   **/
  public UserStations effectiveStation(UserStation effectiveStation) {
    this.effectiveStation = effectiveStation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The station where the user can be reached based on their default and associated station.")
  @JsonProperty("effectiveStation")
  public UserStation getEffectiveStation() {
    return effectiveStation;
  }
  public void setEffectiveStation(UserStation effectiveStation) {
    this.effectiveStation = effectiveStation;
  }

  
  /**
   * Default station to be used if not associated with a station.
   **/
  public UserStations defaultStation(UserStation defaultStation) {
    this.defaultStation = defaultStation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default station to be used if not associated with a station.")
  @JsonProperty("defaultStation")
  public UserStation getDefaultStation() {
    return defaultStation;
  }
  public void setDefaultStation(UserStation defaultStation) {
    this.defaultStation = defaultStation;
  }

  
  /**
   * Last associated station for this user.
   **/
  public UserStations lastAssociatedStation(UserStation lastAssociatedStation) {
    this.lastAssociatedStation = lastAssociatedStation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last associated station for this user.")
  @JsonProperty("lastAssociatedStation")
  public UserStation getLastAssociatedStation() {
    return lastAssociatedStation;
  }
  public void setLastAssociatedStation(UserStation lastAssociatedStation) {
    this.lastAssociatedStation = lastAssociatedStation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStations userStations = (UserStations) o;
    return Objects.equals(this.associatedStation, userStations.associatedStation) &&
        Objects.equals(this.effectiveStation, userStations.effectiveStation) &&
        Objects.equals(this.defaultStation, userStations.defaultStation) &&
        Objects.equals(this.lastAssociatedStation, userStations.lastAssociatedStation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedStation, effectiveStation, defaultStation, lastAssociatedStation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStations {\n");
    
    sb.append("    associatedStation: ").append(toIndentedString(associatedStation)).append("\n");
    sb.append("    effectiveStation: ").append(toIndentedString(effectiveStation)).append("\n");
    sb.append("    defaultStation: ").append(toIndentedString(defaultStation)).append("\n");
    sb.append("    lastAssociatedStation: ").append(toIndentedString(lastAssociatedStation)).append("\n");
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

