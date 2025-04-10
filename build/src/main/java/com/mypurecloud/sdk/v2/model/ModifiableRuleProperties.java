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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AlertNotification;
import com.mypurecloud.sdk.v2.model.CommonRuleConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * ModifiableRuleProperties
 */

public class ModifiableRuleProperties  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean enabled = null;
  private List<AlertNotification> notifications = null;
  private Boolean sendExitingAlarmNotifications = null;
  private Long waitBetweenNotificationMs = null;
  private CommonRuleConditions conditions = null;
  private String selfUri = null;

  public ModifiableRuleProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      notifications = new ArrayList<AlertNotification>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the rule
   **/
  public ModifiableRuleProperties name(String name) {
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
   * The description of the rule.
   **/
  public ModifiableRuleProperties description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the rule.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Indicates if the rule is enabled.
   **/
  public ModifiableRuleProperties enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the rule is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The alert notification types to trigger when alarm state changes as well as the users they will be sent to.
   **/
  public ModifiableRuleProperties notifications(List<AlertNotification> notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The alert notification types to trigger when alarm state changes as well as the users they will be sent to.")
  @JsonProperty("notifications")
  public List<AlertNotification> getNotifications() {
    return notifications;
  }
  public void setNotifications(List<AlertNotification> notifications) {
    this.notifications = notifications;
  }


  /**
   * Indicates if the alert will send a notification when it is closed.
   **/
  public ModifiableRuleProperties sendExitingAlarmNotifications(Boolean sendExitingAlarmNotifications) {
    this.sendExitingAlarmNotifications = sendExitingAlarmNotifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the alert will send a notification when it is closed.")
  @JsonProperty("sendExitingAlarmNotifications")
  public Boolean getSendExitingAlarmNotifications() {
    return sendExitingAlarmNotifications;
  }
  public void setSendExitingAlarmNotifications(Boolean sendExitingAlarmNotifications) {
    this.sendExitingAlarmNotifications = sendExitingAlarmNotifications;
  }


  /**
   * The amount of time in milliseconds to wait between notification.
   **/
  public ModifiableRuleProperties waitBetweenNotificationMs(Long waitBetweenNotificationMs) {
    this.waitBetweenNotificationMs = waitBetweenNotificationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time in milliseconds to wait between notification.")
  @JsonProperty("waitBetweenNotificationMs")
  public Long getWaitBetweenNotificationMs() {
    return waitBetweenNotificationMs;
  }
  public void setWaitBetweenNotificationMs(Long waitBetweenNotificationMs) {
    this.waitBetweenNotificationMs = waitBetweenNotificationMs;
  }


  /**
   * The set of metric conditions that would trigger an alert.
   **/
  public ModifiableRuleProperties conditions(CommonRuleConditions conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of metric conditions that would trigger an alert.")
  @JsonProperty("conditions")
  public CommonRuleConditions getConditions() {
    return conditions;
  }
  public void setConditions(CommonRuleConditions conditions) {
    this.conditions = conditions;
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
    ModifiableRuleProperties modifiableRuleProperties = (ModifiableRuleProperties) o;

    return Objects.equals(this.id, modifiableRuleProperties.id) &&
            Objects.equals(this.name, modifiableRuleProperties.name) &&
            Objects.equals(this.description, modifiableRuleProperties.description) &&
            Objects.equals(this.enabled, modifiableRuleProperties.enabled) &&
            Objects.equals(this.notifications, modifiableRuleProperties.notifications) &&
            Objects.equals(this.sendExitingAlarmNotifications, modifiableRuleProperties.sendExitingAlarmNotifications) &&
            Objects.equals(this.waitBetweenNotificationMs, modifiableRuleProperties.waitBetweenNotificationMs) &&
            Objects.equals(this.conditions, modifiableRuleProperties.conditions) &&
            Objects.equals(this.selfUri, modifiableRuleProperties.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, enabled, notifications, sendExitingAlarmNotifications, waitBetweenNotificationMs, conditions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifiableRuleProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    sendExitingAlarmNotifications: ").append(toIndentedString(sendExitingAlarmNotifications)).append("\n");
    sb.append("    waitBetweenNotificationMs: ").append(toIndentedString(waitBetweenNotificationMs)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

