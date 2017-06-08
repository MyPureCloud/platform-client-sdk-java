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
 * HeartBeatRule
 */

public class HeartBeatRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String senderId = null;
  private Integer heartBeatTimeoutInMinutes = null;
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

  /**
   * The type of system the will be generating the heartbeat.
   */
  public enum RuleTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EDGE("EDGE");

    private String value;

    RuleTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RuleTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RuleTypeEnum value : RuleTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RuleTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RuleTypeEnum ruleType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Name of the rule
   **/
  public HeartBeatRule name(String name) {
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
   * The value that identifies the sender of the heartbeat.
   **/
  public HeartBeatRule senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value that identifies the sender of the heartbeat.")
  @JsonProperty("senderId")
  public String getSenderId() {
    return senderId;
  }
  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  
  /**
   * The number of minutes to wait before alerting missing heartbeats.
   **/
  public HeartBeatRule heartBeatTimeoutInMinutes(Integer heartBeatTimeoutInMinutes) {
    this.heartBeatTimeoutInMinutes = heartBeatTimeoutInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of minutes to wait before alerting missing heartbeats.")
  @JsonProperty("heartBeatTimeoutInMinutes")
  public Integer getHeartBeatTimeoutInMinutes() {
    return heartBeatTimeoutInMinutes;
  }
  public void setHeartBeatTimeoutInMinutes(Integer heartBeatTimeoutInMinutes) {
    this.heartBeatTimeoutInMinutes = heartBeatTimeoutInMinutes;
  }

  
  /**
   * Indicates if the rule is enabled.
   **/
  public HeartBeatRule enabled(Boolean enabled) {
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
  public HeartBeatRule notificationUsers(List<User> notificationUsers) {
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
  public HeartBeatRule alertTypes(List<AlertTypesEnum> alertTypes) {
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
   * The type of system the will be generating the heartbeat.
   **/
  public HeartBeatRule ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of system the will be generating the heartbeat.")
  @JsonProperty("ruleType")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
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
    HeartBeatRule heartBeatRule = (HeartBeatRule) o;
    return Objects.equals(this.id, heartBeatRule.id) &&
        Objects.equals(this.name, heartBeatRule.name) &&
        Objects.equals(this.senderId, heartBeatRule.senderId) &&
        Objects.equals(this.heartBeatTimeoutInMinutes, heartBeatRule.heartBeatTimeoutInMinutes) &&
        Objects.equals(this.enabled, heartBeatRule.enabled) &&
        Objects.equals(this.inAlarm, heartBeatRule.inAlarm) &&
        Objects.equals(this.notificationUsers, heartBeatRule.notificationUsers) &&
        Objects.equals(this.alertTypes, heartBeatRule.alertTypes) &&
        Objects.equals(this.ruleType, heartBeatRule.ruleType) &&
        Objects.equals(this.selfUri, heartBeatRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, senderId, heartBeatTimeoutInMinutes, enabled, inAlarm, notificationUsers, alertTypes, ruleType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartBeatRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    heartBeatTimeoutInMinutes: ").append(toIndentedString(heartBeatTimeoutInMinutes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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

