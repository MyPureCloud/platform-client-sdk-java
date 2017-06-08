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
 * RoutingStatusRule
 */

public class RoutingStatusRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User agent = null;

  /**
   * The routing status on which to alert.
   */
  public enum RoutingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFF_QUEUE("OFF_QUEUE"),
    IDLE("IDLE"),
    INTERACTING("INTERACTING"),
    NOT_RESPONDING("NOT_RESPONDING"),
    COMMUNICATING("COMMUNICATING");

    private String value;

    RoutingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoutingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RoutingStatusEnum value : RoutingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoutingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoutingStatusEnum routingStatus = null;
  private Integer routingLimitInSeconds = null;
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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Name of the rule
   **/
  public RoutingStatusRule name(String name) {
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
   * The agent whose routing status will be watched.
   **/
  public RoutingStatusRule agent(User agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent whose routing status will be watched.")
  @JsonProperty("agent")
  public User getAgent() {
    return agent;
  }
  public void setAgent(User agent) {
    this.agent = agent;
  }

  
  /**
   * The routing status on which to alert.
   **/
  public RoutingStatusRule routingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The routing status on which to alert.")
  @JsonProperty("routingStatus")
  public RoutingStatusEnum getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  /**
   * The number of seconds to wait before alerting based upon the agent's routing status.
   **/
  public RoutingStatusRule routingLimitInSeconds(Integer routingLimitInSeconds) {
    this.routingLimitInSeconds = routingLimitInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of seconds to wait before alerting based upon the agent's routing status.")
  @JsonProperty("routingLimitInSeconds")
  public Integer getRoutingLimitInSeconds() {
    return routingLimitInSeconds;
  }
  public void setRoutingLimitInSeconds(Integer routingLimitInSeconds) {
    this.routingLimitInSeconds = routingLimitInSeconds;
  }

  
  /**
   * Indicates if the rule is enabled.
   **/
  public RoutingStatusRule enabled(Boolean enabled) {
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
  public RoutingStatusRule notificationUsers(List<User> notificationUsers) {
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
  public RoutingStatusRule alertTypes(List<AlertTypesEnum> alertTypes) {
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
    RoutingStatusRule routingStatusRule = (RoutingStatusRule) o;
    return Objects.equals(this.id, routingStatusRule.id) &&
        Objects.equals(this.name, routingStatusRule.name) &&
        Objects.equals(this.agent, routingStatusRule.agent) &&
        Objects.equals(this.routingStatus, routingStatusRule.routingStatus) &&
        Objects.equals(this.routingLimitInSeconds, routingStatusRule.routingLimitInSeconds) &&
        Objects.equals(this.enabled, routingStatusRule.enabled) &&
        Objects.equals(this.inAlarm, routingStatusRule.inAlarm) &&
        Objects.equals(this.notificationUsers, routingStatusRule.notificationUsers) &&
        Objects.equals(this.alertTypes, routingStatusRule.alertTypes) &&
        Objects.equals(this.selfUri, routingStatusRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agent, routingStatus, routingLimitInSeconds, enabled, inAlarm, notificationUsers, alertTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingStatusRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    routingLimitInSeconds: ").append(toIndentedString(routingLimitInSeconds)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
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

