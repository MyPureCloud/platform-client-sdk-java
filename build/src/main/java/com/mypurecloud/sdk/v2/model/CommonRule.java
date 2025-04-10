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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AlertNotification;
import com.mypurecloud.sdk.v2.model.CommonRuleConditions;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CommonRule
 */

public class CommonRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean enabled = null;
  private List<AlertNotification> notifications = null;
  private Boolean sendExitingAlarmNotifications = null;
  private Long waitBetweenNotificationMs = null;
  private CommonRuleConditions conditions = null;

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
   * The type of the rule.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATIONMETRICS("ConversationMetrics"),
    USERPRESENCE("UserPresence"),
    WORKFORCEMANAGEMENT("WorkforceManagement"),
    OPERATIONALCONSOLE("OperationalConsole"),
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
  private Boolean inAlarm = null;
  private UserReference user = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateLastModified = null;
  private String selfUri = null;

  public CommonRule() {
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
  public CommonRule name(String name) {
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
  public CommonRule description(String description) {
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
  public CommonRule enabled(Boolean enabled) {
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
  public CommonRule notifications(List<AlertNotification> notifications) {
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
  public CommonRule sendExitingAlarmNotifications(Boolean sendExitingAlarmNotifications) {
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
  public CommonRule waitBetweenNotificationMs(Long waitBetweenNotificationMs) {
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
  public CommonRule conditions(CommonRuleConditions conditions) {
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


  /**
   * The type of the rule.
   **/
  public CommonRule type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the rule.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Indicates if the rule is in alarm state.
   **/
  public CommonRule inAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the rule is in alarm state.")
  @JsonProperty("inAlarm")
  public Boolean getInAlarm() {
    return inAlarm;
  }
  public void setInAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
  }


  /**
   * The entity that created the rule.
   **/
  public CommonRule user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity that created the rule.")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The current version number of the rule.
   **/
  public CommonRule version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current version number of the rule.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The creation date of the rule when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommonRule dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creation date of the rule when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The timestamp of the last update to the rule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommonRule dateLastModified(Date dateLastModified) {
    this.dateLastModified = dateLastModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of the last update to the rule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastModified")
  public Date getDateLastModified() {
    return dateLastModified;
  }
  public void setDateLastModified(Date dateLastModified) {
    this.dateLastModified = dateLastModified;
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
    CommonRule commonRule = (CommonRule) o;

    return Objects.equals(this.id, commonRule.id) &&
            Objects.equals(this.name, commonRule.name) &&
            Objects.equals(this.description, commonRule.description) &&
            Objects.equals(this.enabled, commonRule.enabled) &&
            Objects.equals(this.notifications, commonRule.notifications) &&
            Objects.equals(this.sendExitingAlarmNotifications, commonRule.sendExitingAlarmNotifications) &&
            Objects.equals(this.waitBetweenNotificationMs, commonRule.waitBetweenNotificationMs) &&
            Objects.equals(this.conditions, commonRule.conditions) &&
            Objects.equals(this.type, commonRule.type) &&
            Objects.equals(this.inAlarm, commonRule.inAlarm) &&
            Objects.equals(this.user, commonRule.user) &&
            Objects.equals(this.version, commonRule.version) &&
            Objects.equals(this.dateCreated, commonRule.dateCreated) &&
            Objects.equals(this.dateLastModified, commonRule.dateLastModified) &&
            Objects.equals(this.selfUri, commonRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, enabled, notifications, sendExitingAlarmNotifications, waitBetweenNotificationMs, conditions, type, inAlarm, user, version, dateCreated, dateLastModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    sendExitingAlarmNotifications: ").append(toIndentedString(sendExitingAlarmNotifications)).append("\n");
    sb.append("    waitBetweenNotificationMs: ").append(toIndentedString(waitBetweenNotificationMs)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateLastModified: ").append(toIndentedString(dateLastModified)).append("\n");
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

