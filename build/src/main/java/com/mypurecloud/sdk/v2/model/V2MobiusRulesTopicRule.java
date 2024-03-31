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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.V2MobiusRulesTopicAlertNotification;
import com.mypurecloud.sdk.v2.model.V2MobiusRulesTopicCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * V2MobiusRulesTopicRule
 */

public class V2MobiusRulesTopicRule  implements Serializable {
  
  private String id = null;
  private String userId = null;
  private String name = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATIONMETRICS("ConversationMetrics"),
    USERPRESENCE("UserPresence"),
    WORKFORCEMANAGEMENT("WorkforceManagement"),
    UNKNOWN("Unknown");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<V2MobiusRulesTopicAlertNotification> notifications = new ArrayList<V2MobiusRulesTopicAlertNotification>();
  private V2MobiusRulesTopicCondition conditions = null;
  private Boolean enabled = null;
  private Boolean inAlarm = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets action
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    DELETE("DELETE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private Date dateCreated = null;
  private Boolean sendExitingAlarmNotification = null;
  private Integer waitBetweenNotificationMs = null;

  
  /**
   **/
  public V2MobiusRulesTopicRule id(String id) {
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
  public V2MobiusRulesTopicRule userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public V2MobiusRulesTopicRule name(String name) {
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
  public V2MobiusRulesTopicRule type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public V2MobiusRulesTopicRule notifications(List<V2MobiusRulesTopicAlertNotification> notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notifications")
  public List<V2MobiusRulesTopicAlertNotification> getNotifications() {
    return notifications;
  }
  public void setNotifications(List<V2MobiusRulesTopicAlertNotification> notifications) {
    this.notifications = notifications;
  }


  /**
   **/
  public V2MobiusRulesTopicRule conditions(V2MobiusRulesTopicCondition conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conditions")
  public V2MobiusRulesTopicCondition getConditions() {
    return conditions;
  }
  public void setConditions(V2MobiusRulesTopicCondition conditions) {
    this.conditions = conditions;
  }


  /**
   **/
  public V2MobiusRulesTopicRule enabled(Boolean enabled) {
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
  public V2MobiusRulesTopicRule inAlarm(Boolean inAlarm) {
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
  public V2MobiusRulesTopicRule action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   **/
  public V2MobiusRulesTopicRule dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public V2MobiusRulesTopicRule sendExitingAlarmNotification(Boolean sendExitingAlarmNotification) {
    this.sendExitingAlarmNotification = sendExitingAlarmNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sendExitingAlarmNotification")
  public Boolean getSendExitingAlarmNotification() {
    return sendExitingAlarmNotification;
  }
  public void setSendExitingAlarmNotification(Boolean sendExitingAlarmNotification) {
    this.sendExitingAlarmNotification = sendExitingAlarmNotification;
  }


  /**
   **/
  public V2MobiusRulesTopicRule waitBetweenNotificationMs(Integer waitBetweenNotificationMs) {
    this.waitBetweenNotificationMs = waitBetweenNotificationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("waitBetweenNotificationMs")
  public Integer getWaitBetweenNotificationMs() {
    return waitBetweenNotificationMs;
  }
  public void setWaitBetweenNotificationMs(Integer waitBetweenNotificationMs) {
    this.waitBetweenNotificationMs = waitBetweenNotificationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusRulesTopicRule v2MobiusRulesTopicRule = (V2MobiusRulesTopicRule) o;

    return Objects.equals(this.id, v2MobiusRulesTopicRule.id) &&
            Objects.equals(this.userId, v2MobiusRulesTopicRule.userId) &&
            Objects.equals(this.name, v2MobiusRulesTopicRule.name) &&
            Objects.equals(this.type, v2MobiusRulesTopicRule.type) &&
            Objects.equals(this.notifications, v2MobiusRulesTopicRule.notifications) &&
            Objects.equals(this.conditions, v2MobiusRulesTopicRule.conditions) &&
            Objects.equals(this.enabled, v2MobiusRulesTopicRule.enabled) &&
            Objects.equals(this.inAlarm, v2MobiusRulesTopicRule.inAlarm) &&
            Objects.equals(this.action, v2MobiusRulesTopicRule.action) &&
            Objects.equals(this.dateCreated, v2MobiusRulesTopicRule.dateCreated) &&
            Objects.equals(this.sendExitingAlarmNotification, v2MobiusRulesTopicRule.sendExitingAlarmNotification) &&
            Objects.equals(this.waitBetweenNotificationMs, v2MobiusRulesTopicRule.waitBetweenNotificationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, name, type, notifications, conditions, enabled, inAlarm, action, dateCreated, sendExitingAlarmNotification, waitBetweenNotificationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    sendExitingAlarmNotification: ").append(toIndentedString(sendExitingAlarmNotification)).append("\n");
    sb.append("    waitBetweenNotificationMs: ").append(toIndentedString(waitBetweenNotificationMs)).append("\n");
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

