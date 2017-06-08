package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.HeartBeatAlertNotificationNotificationUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * HeartBeatRuleNotification
 */

public class HeartBeatRuleNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String senderId = null;
  private BigDecimal heartBeatTimeoutInMinutes = null;
  private Boolean enabled = null;
  private Boolean inAlarm = null;
  private List<HeartBeatAlertNotificationNotificationUsers> notificationUsers = new ArrayList<HeartBeatAlertNotificationNotificationUsers>();

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
   * Gets or Sets ruleType
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

  
  /**
   **/
  public HeartBeatRuleNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public HeartBeatRuleNotification name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public HeartBeatRuleNotification senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("senderId")
  public String getSenderId() {
    return senderId;
  }
  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  
  /**
   **/
  public HeartBeatRuleNotification heartBeatTimeoutInMinutes(BigDecimal heartBeatTimeoutInMinutes) {
    this.heartBeatTimeoutInMinutes = heartBeatTimeoutInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("heartBeatTimeoutInMinutes")
  public BigDecimal getHeartBeatTimeoutInMinutes() {
    return heartBeatTimeoutInMinutes;
  }
  public void setHeartBeatTimeoutInMinutes(BigDecimal heartBeatTimeoutInMinutes) {
    this.heartBeatTimeoutInMinutes = heartBeatTimeoutInMinutes;
  }

  
  /**
   **/
  public HeartBeatRuleNotification enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public HeartBeatRuleNotification inAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inAlarm")
  public Boolean getInAlarm() {
    return inAlarm;
  }
  public void setInAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
  }

  
  /**
   **/
  public HeartBeatRuleNotification notificationUsers(List<HeartBeatAlertNotificationNotificationUsers> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationUsers")
  public List<HeartBeatAlertNotificationNotificationUsers> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<HeartBeatAlertNotificationNotificationUsers> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   **/
  public HeartBeatRuleNotification alertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertTypes")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }
  public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
  }

  
  /**
   **/
  public HeartBeatRuleNotification ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleType")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeartBeatRuleNotification heartBeatRuleNotification = (HeartBeatRuleNotification) o;
    return Objects.equals(this.id, heartBeatRuleNotification.id) &&
        Objects.equals(this.name, heartBeatRuleNotification.name) &&
        Objects.equals(this.senderId, heartBeatRuleNotification.senderId) &&
        Objects.equals(this.heartBeatTimeoutInMinutes, heartBeatRuleNotification.heartBeatTimeoutInMinutes) &&
        Objects.equals(this.enabled, heartBeatRuleNotification.enabled) &&
        Objects.equals(this.inAlarm, heartBeatRuleNotification.inAlarm) &&
        Objects.equals(this.notificationUsers, heartBeatRuleNotification.notificationUsers) &&
        Objects.equals(this.alertTypes, heartBeatRuleNotification.alertTypes) &&
        Objects.equals(this.ruleType, heartBeatRuleNotification.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, senderId, heartBeatTimeoutInMinutes, enabled, inAlarm, notificationUsers, alertTypes, ruleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartBeatRuleNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    heartBeatTimeoutInMinutes: ").append(toIndentedString(heartBeatTimeoutInMinutes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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

