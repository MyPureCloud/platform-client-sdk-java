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
  private String userDisplayName = null;
  private String groupDisplayName = null;
  private String queueDisplayName = null;
  private String teamDisplayName = null;

  
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
  public V2MobiusRulesTopicEntityProperties userDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userDisplayName")
  public String getUserDisplayName() {
    return userDisplayName;
  }
  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }


  /**
   **/
  public V2MobiusRulesTopicEntityProperties groupDisplayName(String groupDisplayName) {
    this.groupDisplayName = groupDisplayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groupDisplayName")
  public String getGroupDisplayName() {
    return groupDisplayName;
  }
  public void setGroupDisplayName(String groupDisplayName) {
    this.groupDisplayName = groupDisplayName;
  }


  /**
   **/
  public V2MobiusRulesTopicEntityProperties queueDisplayName(String queueDisplayName) {
    this.queueDisplayName = queueDisplayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueDisplayName")
  public String getQueueDisplayName() {
    return queueDisplayName;
  }
  public void setQueueDisplayName(String queueDisplayName) {
    this.queueDisplayName = queueDisplayName;
  }


  /**
   **/
  public V2MobiusRulesTopicEntityProperties teamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("teamDisplayName")
  public String getTeamDisplayName() {
    return teamDisplayName;
  }
  public void setTeamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
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
            Objects.equals(this.userDisplayName, v2MobiusRulesTopicEntityProperties.userDisplayName) &&
            Objects.equals(this.groupDisplayName, v2MobiusRulesTopicEntityProperties.groupDisplayName) &&
            Objects.equals(this.queueDisplayName, v2MobiusRulesTopicEntityProperties.queueDisplayName) &&
            Objects.equals(this.teamDisplayName, v2MobiusRulesTopicEntityProperties.teamDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, userDisplayName, groupDisplayName, queueDisplayName, teamDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicEntityProperties {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
    sb.append("    groupDisplayName: ").append(toIndentedString(groupDisplayName)).append("\n");
    sb.append("    queueDisplayName: ").append(toIndentedString(queueDisplayName)).append("\n");
    sb.append("    teamDisplayName: ").append(toIndentedString(teamDisplayName)).append("\n");
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

