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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KlaxonHeartBeatAlertsTopicNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KlaxonHeartBeatAlertsTopicHeartBeatAlert
 */

public class KlaxonHeartBeatAlertsTopicHeartBeatAlert  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String senderId = null;
  private BigDecimal heartBeatTimeoutInMinutes = null;
  private String ruleId = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<KlaxonHeartBeatAlertsTopicNotificationUser> notificationUsers = new ArrayList<KlaxonHeartBeatAlertsTopicNotificationUser>();

  private static class AlertTypesEnumDeserializer extends StdDeserializer<AlertTypesEnum> {
    public AlertTypesEnumDeserializer() {
      super(AlertTypesEnumDeserializer.class);
    }

    @Override
    public AlertTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlertTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets alertTypes
   */
 @JsonDeserialize(using = AlertTypesEnumDeserializer.class)
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

  private static class RuleTypeEnumDeserializer extends StdDeserializer<RuleTypeEnum> {
    public RuleTypeEnumDeserializer() {
      super(RuleTypeEnumDeserializer.class);
    }

    @Override
    public RuleTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RuleTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets ruleType
   */
 @JsonDeserialize(using = RuleTypeEnumDeserializer.class)
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert id(String id) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert name(String name) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert senderId(String senderId) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert heartBeatTimeoutInMinutes(BigDecimal heartBeatTimeoutInMinutes) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert ruleId(String ruleId) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert startDate(Date startDate) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert endDate(Date endDate) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert notificationUsers(List<KlaxonHeartBeatAlertsTopicNotificationUser> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationUsers")
  public List<KlaxonHeartBeatAlertsTopicNotificationUser> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<KlaxonHeartBeatAlertsTopicNotificationUser> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   **/
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert alertTypes(List<AlertTypesEnum> alertTypes) {
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
  public KlaxonHeartBeatAlertsTopicHeartBeatAlert ruleType(RuleTypeEnum ruleType) {
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
    KlaxonHeartBeatAlertsTopicHeartBeatAlert klaxonHeartBeatAlertsTopicHeartBeatAlert = (KlaxonHeartBeatAlertsTopicHeartBeatAlert) o;
    return Objects.equals(this.id, klaxonHeartBeatAlertsTopicHeartBeatAlert.id) &&
        Objects.equals(this.name, klaxonHeartBeatAlertsTopicHeartBeatAlert.name) &&
        Objects.equals(this.senderId, klaxonHeartBeatAlertsTopicHeartBeatAlert.senderId) &&
        Objects.equals(this.heartBeatTimeoutInMinutes, klaxonHeartBeatAlertsTopicHeartBeatAlert.heartBeatTimeoutInMinutes) &&
        Objects.equals(this.ruleId, klaxonHeartBeatAlertsTopicHeartBeatAlert.ruleId) &&
        Objects.equals(this.startDate, klaxonHeartBeatAlertsTopicHeartBeatAlert.startDate) &&
        Objects.equals(this.endDate, klaxonHeartBeatAlertsTopicHeartBeatAlert.endDate) &&
        Objects.equals(this.notificationUsers, klaxonHeartBeatAlertsTopicHeartBeatAlert.notificationUsers) &&
        Objects.equals(this.alertTypes, klaxonHeartBeatAlertsTopicHeartBeatAlert.alertTypes) &&
        Objects.equals(this.ruleType, klaxonHeartBeatAlertsTopicHeartBeatAlert.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, senderId, heartBeatTimeoutInMinutes, ruleId, startDate, endDate, notificationUsers, alertTypes, ruleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlaxonHeartBeatAlertsTopicHeartBeatAlert {\n");
    
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

