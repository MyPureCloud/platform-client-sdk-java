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
import com.mypurecloud.sdk.v2.model.KlaxonHeartBeatRulesTopicNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KlaxonHeartBeatRulesTopicHeartBeatRule
 */

public class KlaxonHeartBeatRulesTopicHeartBeatRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String senderId = null;
  private BigDecimal heartBeatTimeoutInMinutes = null;
  private Boolean enabled = null;
  private Boolean inAlarm = null;
  private List<KlaxonHeartBeatRulesTopicNotificationUser> notificationUsers = new ArrayList<KlaxonHeartBeatRulesTopicNotificationUser>();

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
  public KlaxonHeartBeatRulesTopicHeartBeatRule id(String id) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule name(String name) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule senderId(String senderId) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule heartBeatTimeoutInMinutes(BigDecimal heartBeatTimeoutInMinutes) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule enabled(Boolean enabled) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule inAlarm(Boolean inAlarm) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule notificationUsers(List<KlaxonHeartBeatRulesTopicNotificationUser> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationUsers")
  public List<KlaxonHeartBeatRulesTopicNotificationUser> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<KlaxonHeartBeatRulesTopicNotificationUser> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   **/
  public KlaxonHeartBeatRulesTopicHeartBeatRule alertTypes(List<AlertTypesEnum> alertTypes) {
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
  public KlaxonHeartBeatRulesTopicHeartBeatRule ruleType(RuleTypeEnum ruleType) {
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
    KlaxonHeartBeatRulesTopicHeartBeatRule klaxonHeartBeatRulesTopicHeartBeatRule = (KlaxonHeartBeatRulesTopicHeartBeatRule) o;
    return Objects.equals(this.id, klaxonHeartBeatRulesTopicHeartBeatRule.id) &&
        Objects.equals(this.name, klaxonHeartBeatRulesTopicHeartBeatRule.name) &&
        Objects.equals(this.senderId, klaxonHeartBeatRulesTopicHeartBeatRule.senderId) &&
        Objects.equals(this.heartBeatTimeoutInMinutes, klaxonHeartBeatRulesTopicHeartBeatRule.heartBeatTimeoutInMinutes) &&
        Objects.equals(this.enabled, klaxonHeartBeatRulesTopicHeartBeatRule.enabled) &&
        Objects.equals(this.inAlarm, klaxonHeartBeatRulesTopicHeartBeatRule.inAlarm) &&
        Objects.equals(this.notificationUsers, klaxonHeartBeatRulesTopicHeartBeatRule.notificationUsers) &&
        Objects.equals(this.alertTypes, klaxonHeartBeatRulesTopicHeartBeatRule.alertTypes) &&
        Objects.equals(this.ruleType, klaxonHeartBeatRulesTopicHeartBeatRule.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, senderId, heartBeatTimeoutInMinutes, enabled, inAlarm, notificationUsers, alertTypes, ruleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlaxonHeartBeatRulesTopicHeartBeatRule {\n");
    
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

