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
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * HeartBeatAlertNotification
 */

public class HeartBeatAlertNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String senderId = null;
  private BigDecimal heartBeatTimeoutInMinutes = null;
  private String ruleId = null;
  private Date startDate = null;
  private Date endDate = null;
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
  public HeartBeatAlertNotification id(String id) {
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
  public HeartBeatAlertNotification name(String name) {
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
  public HeartBeatAlertNotification senderId(String senderId) {
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
  public HeartBeatAlertNotification heartBeatTimeoutInMinutes(BigDecimal heartBeatTimeoutInMinutes) {
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
  public HeartBeatAlertNotification ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleId")
  public String getRuleId() {
    return ruleId;
  }
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  
  /**
   **/
  public HeartBeatAlertNotification startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  public HeartBeatAlertNotification endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  public HeartBeatAlertNotification notificationUsers(List<HeartBeatAlertNotificationNotificationUsers> notificationUsers) {
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
  public HeartBeatAlertNotification alertTypes(List<AlertTypesEnum> alertTypes) {
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
  public HeartBeatAlertNotification ruleType(RuleTypeEnum ruleType) {
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
    HeartBeatAlertNotification heartBeatAlertNotification = (HeartBeatAlertNotification) o;
    return Objects.equals(this.id, heartBeatAlertNotification.id) &&
        Objects.equals(this.name, heartBeatAlertNotification.name) &&
        Objects.equals(this.senderId, heartBeatAlertNotification.senderId) &&
        Objects.equals(this.heartBeatTimeoutInMinutes, heartBeatAlertNotification.heartBeatTimeoutInMinutes) &&
        Objects.equals(this.ruleId, heartBeatAlertNotification.ruleId) &&
        Objects.equals(this.startDate, heartBeatAlertNotification.startDate) &&
        Objects.equals(this.endDate, heartBeatAlertNotification.endDate) &&
        Objects.equals(this.notificationUsers, heartBeatAlertNotification.notificationUsers) &&
        Objects.equals(this.alertTypes, heartBeatAlertNotification.alertTypes) &&
        Objects.equals(this.ruleType, heartBeatAlertNotification.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, senderId, heartBeatTimeoutInMinutes, ruleId, startDate, endDate, notificationUsers, alertTypes, ruleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartBeatAlertNotification {\n");
    
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

