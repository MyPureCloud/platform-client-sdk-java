package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * UserPresenceAlert
 */

public class UserPresenceAlert  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User presenceUser = null;

  /**
   * Indicates to which presence type the presence value belongs.
   */
  public enum PresenceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SYSTEM("SYSTEM"),
    ORGANIZATION("ORGANIZATION");

    private String value;

    PresenceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PresenceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PresenceTypeEnum value : PresenceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PresenceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PresenceTypeEnum presenceType = null;
  private String presenceValue = null;
  private Integer presenceLimitInSeconds = null;
  private String ruleId = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<User> notificationUsers = new ArrayList<User>();

  /**
   * Gets or Sets alertTypes
   */
  public enum AlertTypesEnum {
    SMS("SMS"),
    DEVICE("DEVICE"),
    EMAIL("EMAIL");

    private String value;

    AlertTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlertTypesEnum fromString(String key) {
      if (key == null) return null;

      for (AlertTypesEnum value : AlertTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlertTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AlertTypesEnum> alertTypes = new ArrayList<AlertTypesEnum>();
  private String ruleUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Name of the rule
   **/
  public UserPresenceAlert name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the rule")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The user whose presence will be watched.
   **/
  public UserPresenceAlert presenceUser(User presenceUser) {
    this.presenceUser = presenceUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user whose presence will be watched.")
  @JsonProperty("presenceUser")
  public User getPresenceUser() {
    return presenceUser;
  }
  public void setPresenceUser(User presenceUser) {
    this.presenceUser = presenceUser;
  }

  
  /**
   * Indicates to which presence type the presence value belongs.
   **/
  public UserPresenceAlert presenceType(PresenceTypeEnum presenceType) {
    this.presenceType = presenceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates to which presence type the presence value belongs.")
  @JsonProperty("presenceType")
  public PresenceTypeEnum getPresenceType() {
    return presenceType;
  }
  public void setPresenceType(PresenceTypeEnum presenceType) {
    this.presenceType = presenceType;
  }

  
  /**
   * The Org's UUID or Systems enum constance indicating the presence of concern.
   **/
  public UserPresenceAlert presenceValue(String presenceValue) {
    this.presenceValue = presenceValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Org's UUID or Systems enum constance indicating the presence of concern.")
  @JsonProperty("presenceValue")
  public String getPresenceValue() {
    return presenceValue;
  }
  public void setPresenceValue(String presenceValue) {
    this.presenceValue = presenceValue;
  }

  
  /**
   * The number of seconds to wait before alerting based upon the user's presence.
   **/
  public UserPresenceAlert presenceLimitInSeconds(Integer presenceLimitInSeconds) {
    this.presenceLimitInSeconds = presenceLimitInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of seconds to wait before alerting based upon the user's presence.")
  @JsonProperty("presenceLimitInSeconds")
  public Integer getPresenceLimitInSeconds() {
    return presenceLimitInSeconds;
  }
  public void setPresenceLimitInSeconds(Integer presenceLimitInSeconds) {
    this.presenceLimitInSeconds = presenceLimitInSeconds;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The id of the rule.")
  @JsonProperty("ruleId")
  public String getRuleId() {
    return ruleId;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  
  /**
   * The ids of users who were notified of alarm state change.
   **/
  public UserPresenceAlert notificationUsers(List<User> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of users who were notified of alarm state change.")
  @JsonProperty("notificationUsers")
  public List<User> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<User> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   * A collection of notification methods.
   **/
  public UserPresenceAlert alertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of notification methods.")
  @JsonProperty("alertTypes")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }
  public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
  }

  
  /**
   **/
  public UserPresenceAlert ruleUri(String ruleUri) {
    this.ruleUri = ruleUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleUri")
  public String getRuleUri() {
    return ruleUri;
  }
  public void setRuleUri(String ruleUri) {
    this.ruleUri = ruleUri;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPresenceAlert userPresenceAlert = (UserPresenceAlert) o;
    return Objects.equals(this.id, userPresenceAlert.id) &&
        Objects.equals(this.name, userPresenceAlert.name) &&
        Objects.equals(this.presenceUser, userPresenceAlert.presenceUser) &&
        Objects.equals(this.presenceType, userPresenceAlert.presenceType) &&
        Objects.equals(this.presenceValue, userPresenceAlert.presenceValue) &&
        Objects.equals(this.presenceLimitInSeconds, userPresenceAlert.presenceLimitInSeconds) &&
        Objects.equals(this.ruleId, userPresenceAlert.ruleId) &&
        Objects.equals(this.startDate, userPresenceAlert.startDate) &&
        Objects.equals(this.endDate, userPresenceAlert.endDate) &&
        Objects.equals(this.notificationUsers, userPresenceAlert.notificationUsers) &&
        Objects.equals(this.alertTypes, userPresenceAlert.alertTypes) &&
        Objects.equals(this.ruleUri, userPresenceAlert.ruleUri) &&
        Objects.equals(this.selfUri, userPresenceAlert.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, presenceUser, presenceType, presenceValue, presenceLimitInSeconds, ruleId, startDate, endDate, notificationUsers, alertTypes, ruleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresenceAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    presenceUser: ").append(toIndentedString(presenceUser)).append("\n");
    sb.append("    presenceType: ").append(toIndentedString(presenceType)).append("\n");
    sb.append("    presenceValue: ").append(toIndentedString(presenceValue)).append("\n");
    sb.append("    presenceLimitInSeconds: ").append(toIndentedString(presenceLimitInSeconds)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    ruleUri: ").append(toIndentedString(ruleUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

