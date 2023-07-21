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
import com.mypurecloud.sdk.v2.model.AlertNotification;
import com.mypurecloud.sdk.v2.model.AlertRuleProperties;
import com.mypurecloud.sdk.v2.model.CommonRuleConditions;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CommonAlert
 */

public class CommonAlert  implements Serializable {
  
  private String id = null;
  private String name = null;
  private UserReference user = null;
  private AlertRuleProperties rule = null;
  private List<AlertNotification> notifications = new ArrayList<AlertNotification>();
  private Date dateStart = null;
  private Date dateEnd = null;
  private Boolean active = null;
  private Boolean unread = null;
  private Long waitBetweenNotificationMs = null;
  private Boolean muted = null;
  private Boolean snoozed = null;
  private Date dateMutedUntil = null;
  private Date dateSnoozedUntil = null;
  private CommonRuleConditions conditions = null;
  private String conversationId = null;
  private String ruleUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CommonAlert name(String name) {
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
   * The user who created the rule that triggered the alert.
   **/
  public CommonAlert user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who created the rule that triggered the alert.")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The properties of the rule that triggered the alert.
   **/
  public CommonAlert rule(AlertRuleProperties rule) {
    this.rule = rule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The properties of the rule that triggered the alert.")
  @JsonProperty("rule")
  public AlertRuleProperties getRule() {
    return rule;
  }
  public void setRule(AlertRuleProperties rule) {
    this.rule = rule;
  }


  /**
   * The collection of notification methods and the ids of users who were notified by those methods.
   **/
  public CommonAlert notifications(List<AlertNotification> notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The collection of notification methods and the ids of users who were notified by those methods.")
  @JsonProperty("notifications")
  public List<AlertNotification> getNotifications() {
    return notifications;
  }
  public void setNotifications(List<AlertNotification> notifications) {
    this.notifications = notifications;
  }


  /**
   * The timestamp of when the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommonAlert dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp of when the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The timestamp of when the alert ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommonAlert dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the alert ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Indicates if an alert is currently active.
   **/
  public CommonAlert active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if an alert is currently active.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   * Indicates if an alert has not been read.
   **/
  public CommonAlert unread(Boolean unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if an alert has not been read.")
  @JsonProperty("unread")
  public Boolean getUnread() {
    return unread;
  }
  public void setUnread(Boolean unread) {
    this.unread = unread;
  }


  /**
   * The amount of time to wait between notification. Time is in milliseconds.
   **/
  public CommonAlert waitBetweenNotificationMs(Long waitBetweenNotificationMs) {
    this.waitBetweenNotificationMs = waitBetweenNotificationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of time to wait between notification. Time is in milliseconds.")
  @JsonProperty("waitBetweenNotificationMs")
  public Long getWaitBetweenNotificationMs() {
    return waitBetweenNotificationMs;
  }
  public void setWaitBetweenNotificationMs(Long waitBetweenNotificationMs) {
    this.waitBetweenNotificationMs = waitBetweenNotificationMs;
  }


  /**
   * Flag indicating if the alert is in a muted state.
   **/
  public CommonAlert muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Flag indicating if the alert is in a muted state.")
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  /**
   * Flag indicating if the alert is in a snoozed state.
   **/
  public CommonAlert snoozed(Boolean snoozed) {
    this.snoozed = snoozed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Flag indicating if the alert is in a snoozed state.")
  @JsonProperty("snoozed")
  public Boolean getSnoozed() {
    return snoozed;
  }
  public void setSnoozed(Boolean snoozed) {
    this.snoozed = snoozed;
  }


  /**
   * Timestamp of when the mute status of the alert should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommonAlert dateMutedUntil(Date dateMutedUntil) {
    this.dateMutedUntil = dateMutedUntil;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp of when the mute status of the alert should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateMutedUntil")
  public Date getDateMutedUntil() {
    return dateMutedUntil;
  }
  public void setDateMutedUntil(Date dateMutedUntil) {
    this.dateMutedUntil = dateMutedUntil;
  }


  /**
   * Timestamp of when the snooze status of the alert should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommonAlert dateSnoozedUntil(Date dateSnoozedUntil) {
    this.dateSnoozedUntil = dateSnoozedUntil;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp of when the snooze status of the alert should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSnoozedUntil")
  public Date getDateSnoozedUntil() {
    return dateSnoozedUntil;
  }
  public void setDateSnoozedUntil(Date dateSnoozedUntil) {
    this.dateSnoozedUntil = dateSnoozedUntil;
  }


  /**
   * The conditions that make up the rule.
   **/
  public CommonAlert conditions(CommonRuleConditions conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conditions that make up the rule.")
  @JsonProperty("conditions")
  public CommonRuleConditions getConditions() {
    return conditions;
  }
  public void setConditions(CommonRuleConditions conditions) {
    this.conditions = conditions;
  }


  /**
   * The id of the conversation instance that caused the alert to trigger.
   **/
  public CommonAlert conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the conversation instance that caused the alert to trigger.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public CommonAlert ruleUri(String ruleUri) {
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
    CommonAlert commonAlert = (CommonAlert) o;

    return Objects.equals(this.id, commonAlert.id) &&
            Objects.equals(this.name, commonAlert.name) &&
            Objects.equals(this.user, commonAlert.user) &&
            Objects.equals(this.rule, commonAlert.rule) &&
            Objects.equals(this.notifications, commonAlert.notifications) &&
            Objects.equals(this.dateStart, commonAlert.dateStart) &&
            Objects.equals(this.dateEnd, commonAlert.dateEnd) &&
            Objects.equals(this.active, commonAlert.active) &&
            Objects.equals(this.unread, commonAlert.unread) &&
            Objects.equals(this.waitBetweenNotificationMs, commonAlert.waitBetweenNotificationMs) &&
            Objects.equals(this.muted, commonAlert.muted) &&
            Objects.equals(this.snoozed, commonAlert.snoozed) &&
            Objects.equals(this.dateMutedUntil, commonAlert.dateMutedUntil) &&
            Objects.equals(this.dateSnoozedUntil, commonAlert.dateSnoozedUntil) &&
            Objects.equals(this.conditions, commonAlert.conditions) &&
            Objects.equals(this.conversationId, commonAlert.conversationId) &&
            Objects.equals(this.ruleUri, commonAlert.ruleUri) &&
            Objects.equals(this.selfUri, commonAlert.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, rule, notifications, dateStart, dateEnd, active, unread, waitBetweenNotificationMs, muted, snoozed, dateMutedUntil, dateSnoozedUntil, conditions, conversationId, ruleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    waitBetweenNotificationMs: ").append(toIndentedString(waitBetweenNotificationMs)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    snoozed: ").append(toIndentedString(snoozed)).append("\n");
    sb.append("    dateMutedUntil: ").append(toIndentedString(dateMutedUntil)).append("\n");
    sb.append("    dateSnoozedUntil: ").append(toIndentedString(dateSnoozedUntil)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

