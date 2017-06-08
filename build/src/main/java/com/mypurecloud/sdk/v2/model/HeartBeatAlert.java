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
 * HeartBeatAlert
 */

public class HeartBeatAlert  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String senderId = null;
  private Integer heartBeatTimeoutInMinutes = null;
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

  /**
   * The type of heartbeat rule that generated the alert
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
  public HeartBeatAlert name(String name) {
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
  public HeartBeatAlert senderId(String senderId) {
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
  public HeartBeatAlert heartBeatTimeoutInMinutes(Integer heartBeatTimeoutInMinutes) {
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
  public HeartBeatAlert notificationUsers(List<User> notificationUsers) {
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
  public HeartBeatAlert alertTypes(List<AlertTypesEnum> alertTypes) {
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
   * The type of heartbeat rule that generated the alert
   **/
  public HeartBeatAlert ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of heartbeat rule that generated the alert")
  @JsonProperty("ruleType")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }

  
  /**
   **/
  public HeartBeatAlert ruleUri(String ruleUri) {
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
    HeartBeatAlert heartBeatAlert = (HeartBeatAlert) o;
    return Objects.equals(this.id, heartBeatAlert.id) &&
        Objects.equals(this.name, heartBeatAlert.name) &&
        Objects.equals(this.senderId, heartBeatAlert.senderId) &&
        Objects.equals(this.heartBeatTimeoutInMinutes, heartBeatAlert.heartBeatTimeoutInMinutes) &&
        Objects.equals(this.ruleId, heartBeatAlert.ruleId) &&
        Objects.equals(this.startDate, heartBeatAlert.startDate) &&
        Objects.equals(this.endDate, heartBeatAlert.endDate) &&
        Objects.equals(this.notificationUsers, heartBeatAlert.notificationUsers) &&
        Objects.equals(this.alertTypes, heartBeatAlert.alertTypes) &&
        Objects.equals(this.ruleType, heartBeatAlert.ruleType) &&
        Objects.equals(this.ruleUri, heartBeatAlert.ruleUri) &&
        Objects.equals(this.selfUri, heartBeatAlert.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, senderId, heartBeatTimeoutInMinutes, ruleId, startDate, endDate, notificationUsers, alertTypes, ruleType, ruleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartBeatAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    heartBeatTimeoutInMinutes: ").append(toIndentedString(heartBeatTimeoutInMinutes)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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

