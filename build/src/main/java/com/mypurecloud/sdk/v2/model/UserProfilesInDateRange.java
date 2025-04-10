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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ProfileWithDateRange;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserProfilesInDateRange
 */

public class UserProfilesInDateRange  implements Serializable {
  
  private UserReference user = null;
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private List<ProfileWithDateRange> profiles = null;

  public UserProfilesInDateRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      profiles = new ArrayList<ProfileWithDateRange>();
    }
  }

  
  /**
   * The query agent
   **/
  public UserProfilesInDateRange user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The query agent")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UserProfilesInDateRange dateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }
  public void setDateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
  }


  /**
   * End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UserProfilesInDateRange dateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }
  public void setDateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
  }


  /**
   * The list of profiles of the agent
   **/
  public UserProfilesInDateRange profiles(List<ProfileWithDateRange> profiles) {
    this.profiles = profiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of profiles of the agent")
  @JsonProperty("profiles")
  public List<ProfileWithDateRange> getProfiles() {
    return profiles;
  }
  public void setProfiles(List<ProfileWithDateRange> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfilesInDateRange userProfilesInDateRange = (UserProfilesInDateRange) o;

    return Objects.equals(this.user, userProfilesInDateRange.user) &&
            Objects.equals(this.dateStartWorkday, userProfilesInDateRange.dateStartWorkday) &&
            Objects.equals(this.dateEndWorkday, userProfilesInDateRange.dateEndWorkday) &&
            Objects.equals(this.profiles, userProfilesInDateRange.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, dateStartWorkday, dateEndWorkday, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfilesInDateRange {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

