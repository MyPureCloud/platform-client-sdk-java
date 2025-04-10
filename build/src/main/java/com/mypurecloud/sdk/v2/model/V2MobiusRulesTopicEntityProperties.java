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
import com.mypurecloud.sdk.v2.model.V2MobiusRulesTopicAlertingAddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2MobiusRulesTopicEntityProperties
 */

public class V2MobiusRulesTopicEntityProperties  implements Serializable {
  

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
  private V2MobiusRulesTopicAlertingAddressableEntityRef user = null;
  private V2MobiusRulesTopicAlertingAddressableEntityRef group = null;
  private V2MobiusRulesTopicAlertingAddressableEntityRef queue = null;
  private V2MobiusRulesTopicAlertingAddressableEntityRef team = null;

  public V2MobiusRulesTopicEntityProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2MobiusRulesTopicEntityProperties entityType(EntityTypeEnum entityType) {
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
  public V2MobiusRulesTopicEntityProperties user(V2MobiusRulesTopicAlertingAddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public V2MobiusRulesTopicAlertingAddressableEntityRef getUser() {
    return user;
  }
  public void setUser(V2MobiusRulesTopicAlertingAddressableEntityRef user) {
    this.user = user;
  }


  /**
   **/
  public V2MobiusRulesTopicEntityProperties group(V2MobiusRulesTopicAlertingAddressableEntityRef group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public V2MobiusRulesTopicAlertingAddressableEntityRef getGroup() {
    return group;
  }
  public void setGroup(V2MobiusRulesTopicAlertingAddressableEntityRef group) {
    this.group = group;
  }


  /**
   **/
  public V2MobiusRulesTopicEntityProperties queue(V2MobiusRulesTopicAlertingAddressableEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public V2MobiusRulesTopicAlertingAddressableEntityRef getQueue() {
    return queue;
  }
  public void setQueue(V2MobiusRulesTopicAlertingAddressableEntityRef queue) {
    this.queue = queue;
  }


  /**
   **/
  public V2MobiusRulesTopicEntityProperties team(V2MobiusRulesTopicAlertingAddressableEntityRef team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public V2MobiusRulesTopicAlertingAddressableEntityRef getTeam() {
    return team;
  }
  public void setTeam(V2MobiusRulesTopicAlertingAddressableEntityRef team) {
    this.team = team;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusRulesTopicEntityProperties v2MobiusRulesTopicEntityProperties = (V2MobiusRulesTopicEntityProperties) o;

    return Objects.equals(this.entityType, v2MobiusRulesTopicEntityProperties.entityType) &&
            Objects.equals(this.user, v2MobiusRulesTopicEntityProperties.user) &&
            Objects.equals(this.group, v2MobiusRulesTopicEntityProperties.group) &&
            Objects.equals(this.queue, v2MobiusRulesTopicEntityProperties.queue) &&
            Objects.equals(this.team, v2MobiusRulesTopicEntityProperties.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, user, group, queue, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicEntityProperties {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

