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
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicAlertNotification;
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicAlertRuleProperties;
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicAlertSummary;
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V2MobiusAlertsTopicAlert
 */

public class V2MobiusAlertsTopicAlert  implements Serializable {
  
  private V2MobiusAlertsTopicAlertRuleProperties rule = null;
  private String id = null;
  private String userId = null;
  private List<V2MobiusAlertsTopicAlertNotification> notifications = new ArrayList<V2MobiusAlertsTopicAlertNotification>();
  private Date dateStart = null;
  private Date dateEnd = null;
  private V2MobiusAlertsTopicCondition conditions = null;
  private Map<String, String> additionalProperties = null;
  private Boolean active = null;
  private Boolean unread = null;
  private Boolean muted = null;
  private Boolean snoozed = null;
  private Date dateMutedUntil = null;
  private Date dateSnoozedUntil = null;

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
    DELETE("DELETE"),
    CLOSE("CLOSE"),
    RENOTIFY("RENOTIFY"),
    BULK_DELETE("BULK_DELETE"),
    BULK_UPDATE("BULK_UPDATE"),
    UNREAD_COUNT_UPDATE("UNREAD_COUNT_UPDATE");

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
  private V2MobiusAlertsTopicAlertSummary alertSummary = null;
  private Boolean sendExitingAlarmNotification = null;

  
  /**
   **/
  public V2MobiusAlertsTopicAlert rule(V2MobiusAlertsTopicAlertRuleProperties rule) {
    this.rule = rule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rule")
  public V2MobiusAlertsTopicAlertRuleProperties getRule() {
    return rule;
  }
  public void setRule(V2MobiusAlertsTopicAlertRuleProperties rule) {
    this.rule = rule;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert id(String id) {
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
  public V2MobiusAlertsTopicAlert userId(String userId) {
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
  public V2MobiusAlertsTopicAlert notifications(List<V2MobiusAlertsTopicAlertNotification> notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notifications")
  public List<V2MobiusAlertsTopicAlertNotification> getNotifications() {
    return notifications;
  }
  public void setNotifications(List<V2MobiusAlertsTopicAlertNotification> notifications) {
    this.notifications = notifications;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert conditions(V2MobiusAlertsTopicCondition conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conditions")
  public V2MobiusAlertsTopicCondition getConditions() {
    return conditions;
  }
  public void setConditions(V2MobiusAlertsTopicCondition conditions) {
    this.conditions = conditions;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert additionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert unread(Boolean unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unread")
  public Boolean getUnread() {
    return unread;
  }
  public void setUnread(Boolean unread) {
    this.unread = unread;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert snoozed(Boolean snoozed) {
    this.snoozed = snoozed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("snoozed")
  public Boolean getSnoozed() {
    return snoozed;
  }
  public void setSnoozed(Boolean snoozed) {
    this.snoozed = snoozed;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert dateMutedUntil(Date dateMutedUntil) {
    this.dateMutedUntil = dateMutedUntil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateMutedUntil")
  public Date getDateMutedUntil() {
    return dateMutedUntil;
  }
  public void setDateMutedUntil(Date dateMutedUntil) {
    this.dateMutedUntil = dateMutedUntil;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert dateSnoozedUntil(Date dateSnoozedUntil) {
    this.dateSnoozedUntil = dateSnoozedUntil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateSnoozedUntil")
  public Date getDateSnoozedUntil() {
    return dateSnoozedUntil;
  }
  public void setDateSnoozedUntil(Date dateSnoozedUntil) {
    this.dateSnoozedUntil = dateSnoozedUntil;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert action(ActionEnum action) {
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
  public V2MobiusAlertsTopicAlert alertSummary(V2MobiusAlertsTopicAlertSummary alertSummary) {
    this.alertSummary = alertSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertSummary")
  public V2MobiusAlertsTopicAlertSummary getAlertSummary() {
    return alertSummary;
  }
  public void setAlertSummary(V2MobiusAlertsTopicAlertSummary alertSummary) {
    this.alertSummary = alertSummary;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlert sendExitingAlarmNotification(Boolean sendExitingAlarmNotification) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusAlertsTopicAlert v2MobiusAlertsTopicAlert = (V2MobiusAlertsTopicAlert) o;

    return Objects.equals(this.rule, v2MobiusAlertsTopicAlert.rule) &&
            Objects.equals(this.id, v2MobiusAlertsTopicAlert.id) &&
            Objects.equals(this.userId, v2MobiusAlertsTopicAlert.userId) &&
            Objects.equals(this.notifications, v2MobiusAlertsTopicAlert.notifications) &&
            Objects.equals(this.dateStart, v2MobiusAlertsTopicAlert.dateStart) &&
            Objects.equals(this.dateEnd, v2MobiusAlertsTopicAlert.dateEnd) &&
            Objects.equals(this.conditions, v2MobiusAlertsTopicAlert.conditions) &&
            Objects.equals(this.additionalProperties, v2MobiusAlertsTopicAlert.additionalProperties) &&
            Objects.equals(this.active, v2MobiusAlertsTopicAlert.active) &&
            Objects.equals(this.unread, v2MobiusAlertsTopicAlert.unread) &&
            Objects.equals(this.muted, v2MobiusAlertsTopicAlert.muted) &&
            Objects.equals(this.snoozed, v2MobiusAlertsTopicAlert.snoozed) &&
            Objects.equals(this.dateMutedUntil, v2MobiusAlertsTopicAlert.dateMutedUntil) &&
            Objects.equals(this.dateSnoozedUntil, v2MobiusAlertsTopicAlert.dateSnoozedUntil) &&
            Objects.equals(this.action, v2MobiusAlertsTopicAlert.action) &&
            Objects.equals(this.alertSummary, v2MobiusAlertsTopicAlert.alertSummary) &&
            Objects.equals(this.sendExitingAlarmNotification, v2MobiusAlertsTopicAlert.sendExitingAlarmNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, id, userId, notifications, dateStart, dateEnd, conditions, additionalProperties, active, unread, muted, snoozed, dateMutedUntil, dateSnoozedUntil, action, alertSummary, sendExitingAlarmNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusAlertsTopicAlert {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    snoozed: ").append(toIndentedString(snoozed)).append("\n");
    sb.append("    dateMutedUntil: ").append(toIndentedString(dateMutedUntil)).append("\n");
    sb.append("    dateSnoozedUntil: ").append(toIndentedString(dateSnoozedUntil)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alertSummary: ").append(toIndentedString(alertSummary)).append("\n");
    sb.append("    sendExitingAlarmNotification: ").append(toIndentedString(sendExitingAlarmNotification)).append("\n");
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

