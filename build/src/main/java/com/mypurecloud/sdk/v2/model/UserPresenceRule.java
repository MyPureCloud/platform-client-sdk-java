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
import java.util.List;

import java.io.Serializable;
/**
 * UserPresenceRule
 */

public class UserPresenceRule  implements Serializable {
  
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
  private Boolean enabled = null;
  private Boolean inAlarm = null;
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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Name of the rule
   **/
  public UserPresenceRule name(String name) {
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
  public UserPresenceRule presenceUser(User presenceUser) {
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
  public UserPresenceRule presenceType(PresenceTypeEnum presenceType) {
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
  public UserPresenceRule presenceValue(String presenceValue) {
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
  public UserPresenceRule presenceLimitInSeconds(Integer presenceLimitInSeconds) {
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

  
  /**
   * Indicates if the rule is enabled.
   **/
  public UserPresenceRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the rule is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if the rule is in alarm state.")
  @JsonProperty("inAlarm")
  public Boolean getInAlarm() {
    return inAlarm;
  }

  
  /**
   * The ids of users who will be notified of alarm state change.
   **/
  public UserPresenceRule notificationUsers(List<User> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of users who will be notified of alarm state change.")
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
  public UserPresenceRule alertTypes(List<AlertTypesEnum> alertTypes) {
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
    UserPresenceRule userPresenceRule = (UserPresenceRule) o;
    return Objects.equals(this.id, userPresenceRule.id) &&
        Objects.equals(this.name, userPresenceRule.name) &&
        Objects.equals(this.presenceUser, userPresenceRule.presenceUser) &&
        Objects.equals(this.presenceType, userPresenceRule.presenceType) &&
        Objects.equals(this.presenceValue, userPresenceRule.presenceValue) &&
        Objects.equals(this.presenceLimitInSeconds, userPresenceRule.presenceLimitInSeconds) &&
        Objects.equals(this.enabled, userPresenceRule.enabled) &&
        Objects.equals(this.inAlarm, userPresenceRule.inAlarm) &&
        Objects.equals(this.notificationUsers, userPresenceRule.notificationUsers) &&
        Objects.equals(this.alertTypes, userPresenceRule.alertTypes) &&
        Objects.equals(this.selfUri, userPresenceRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, presenceUser, presenceType, presenceValue, presenceLimitInSeconds, enabled, inAlarm, notificationUsers, alertTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresenceRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    presenceUser: ").append(toIndentedString(presenceUser)).append("\n");
    sb.append("    presenceType: ").append(toIndentedString(presenceType)).append("\n");
    sb.append("    presenceValue: ").append(toIndentedString(presenceValue)).append("\n");
    sb.append("    presenceLimitInSeconds: ").append(toIndentedString(presenceLimitInSeconds)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
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

