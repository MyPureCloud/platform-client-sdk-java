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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AlertSummaryEntity
 */

public class AlertSummaryEntity  implements Serializable {
  

  private static class EntityTypeEnumDeserializer extends StdDeserializer<EntityTypeEnum> {
    public EntityTypeEnumDeserializer() {
      super(EntityTypeEnumDeserializer.class);
    }

    @Override
    public EntityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies the type of entity being evaluated
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    GROUP("Group"),
    QUEUE("Queue"),
    TEAM("Team"),
    TEAMMEMBERS("TeamMembers"),
    ORGANIZATION("Organization");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EntityTypeEnum value : EntityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntityTypeEnum entityType = null;
  private AddressableEntityRef user = null;
  private AddressableEntityRef group = null;
  private AddressableEntityRef queue = null;
  private AddressableEntityRef team = null;
  private Boolean alerting = null;

  public AlertSummaryEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Specifies the type of entity being evaluated
   **/
  public AlertSummaryEntity entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the type of entity being evaluated")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  /**
   * User id of the entity being monitored
   **/
  public AlertSummaryEntity user(AddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User id of the entity being monitored")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }
  public void setUser(AddressableEntityRef user) {
    this.user = user;
  }


  /**
   * Group id of the entity being monitored
   **/
  public AlertSummaryEntity group(AddressableEntityRef group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group id of the entity being monitored")
  @JsonProperty("group")
  public AddressableEntityRef getGroup() {
    return group;
  }
  public void setGroup(AddressableEntityRef group) {
    this.group = group;
  }


  /**
   * Queue id of the entity being monitored
   **/
  public AlertSummaryEntity queue(AddressableEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue id of the entity being monitored")
  @JsonProperty("queue")
  public AddressableEntityRef getQueue() {
    return queue;
  }
  public void setQueue(AddressableEntityRef queue) {
    this.queue = queue;
  }


  /**
   * Team id of the entity being monitored
   **/
  public AlertSummaryEntity team(AddressableEntityRef team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Team id of the entity being monitored")
  @JsonProperty("team")
  public AddressableEntityRef getTeam() {
    return team;
  }
  public void setTeam(AddressableEntityRef team) {
    this.team = team;
  }


  /**
   * Flag that indicated if the entity is current causing the alert to be triggered
   **/
  public AlertSummaryEntity alerting(Boolean alerting) {
    this.alerting = alerting;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Flag that indicated if the entity is current causing the alert to be triggered")
  @JsonProperty("alerting")
  public Boolean getAlerting() {
    return alerting;
  }
  public void setAlerting(Boolean alerting) {
    this.alerting = alerting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSummaryEntity alertSummaryEntity = (AlertSummaryEntity) o;

    return Objects.equals(this.entityType, alertSummaryEntity.entityType) &&
            Objects.equals(this.user, alertSummaryEntity.user) &&
            Objects.equals(this.group, alertSummaryEntity.group) &&
            Objects.equals(this.queue, alertSummaryEntity.queue) &&
            Objects.equals(this.team, alertSummaryEntity.team) &&
            Objects.equals(this.alerting, alertSummaryEntity.alerting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, user, group, queue, team, alerting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSummaryEntity {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    alerting: ").append(toIndentedString(alerting)).append("\n");
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

