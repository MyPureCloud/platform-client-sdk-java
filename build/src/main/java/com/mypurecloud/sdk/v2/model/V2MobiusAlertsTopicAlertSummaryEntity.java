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
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicAddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2MobiusAlertsTopicAlertSummaryEntity
 */

public class V2MobiusAlertsTopicAlertSummaryEntity  implements Serializable {
  

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
   * Gets or Sets entityType
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ORGANIZATION("Organization"),
    USER("User"),
    QUEUE("Queue"),
    GROUP("Group"),
    EDGE("Edge"),
    TEAM("Team"),
    TEAMMEMBERS("TeamMembers");

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
  private V2MobiusAlertsTopicAddressableEntityRef user = null;
  private V2MobiusAlertsTopicAddressableEntityRef group = null;
  private V2MobiusAlertsTopicAddressableEntityRef queue = null;
  private V2MobiusAlertsTopicAddressableEntityRef team = null;
  private Boolean alerting = null;

  
  /**
   **/
  public V2MobiusAlertsTopicAlertSummaryEntity entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummaryEntity user(V2MobiusAlertsTopicAddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public V2MobiusAlertsTopicAddressableEntityRef getUser() {
    return user;
  }
  public void setUser(V2MobiusAlertsTopicAddressableEntityRef user) {
    this.user = user;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummaryEntity group(V2MobiusAlertsTopicAddressableEntityRef group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public V2MobiusAlertsTopicAddressableEntityRef getGroup() {
    return group;
  }
  public void setGroup(V2MobiusAlertsTopicAddressableEntityRef group) {
    this.group = group;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummaryEntity queue(V2MobiusAlertsTopicAddressableEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public V2MobiusAlertsTopicAddressableEntityRef getQueue() {
    return queue;
  }
  public void setQueue(V2MobiusAlertsTopicAddressableEntityRef queue) {
    this.queue = queue;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummaryEntity team(V2MobiusAlertsTopicAddressableEntityRef team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public V2MobiusAlertsTopicAddressableEntityRef getTeam() {
    return team;
  }
  public void setTeam(V2MobiusAlertsTopicAddressableEntityRef team) {
    this.team = team;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummaryEntity alerting(Boolean alerting) {
    this.alerting = alerting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    V2MobiusAlertsTopicAlertSummaryEntity v2MobiusAlertsTopicAlertSummaryEntity = (V2MobiusAlertsTopicAlertSummaryEntity) o;

    return Objects.equals(this.entityType, v2MobiusAlertsTopicAlertSummaryEntity.entityType) &&
            Objects.equals(this.user, v2MobiusAlertsTopicAlertSummaryEntity.user) &&
            Objects.equals(this.group, v2MobiusAlertsTopicAlertSummaryEntity.group) &&
            Objects.equals(this.queue, v2MobiusAlertsTopicAlertSummaryEntity.queue) &&
            Objects.equals(this.team, v2MobiusAlertsTopicAlertSummaryEntity.team) &&
            Objects.equals(this.alerting, v2MobiusAlertsTopicAlertSummaryEntity.alerting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, user, group, queue, team, alerting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusAlertsTopicAlertSummaryEntity {\n");
    
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

