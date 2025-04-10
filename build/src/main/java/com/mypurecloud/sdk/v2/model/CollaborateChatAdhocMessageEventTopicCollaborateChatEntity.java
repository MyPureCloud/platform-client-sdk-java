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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CollaborateChatAdhocMessageEventTopicCollaborateChatEntity
 */

public class CollaborateChatAdhocMessageEventTopicCollaborateChatEntity  implements Serializable {
  
  private String entityJid = null;
  private String entityId = null;

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
    GROUP("Group"),
    USER("User"),
    ADHOC("Adhoc");

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

  public CollaborateChatAdhocMessageEventTopicCollaborateChatEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public CollaborateChatAdhocMessageEventTopicCollaborateChatEntity entityJid(String entityJid) {
    this.entityJid = entityJid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityJid")
  public String getEntityJid() {
    return entityJid;
  }
  public void setEntityJid(String entityJid) {
    this.entityJid = entityJid;
  }


  /**
   **/
  public CollaborateChatAdhocMessageEventTopicCollaborateChatEntity entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   **/
  public CollaborateChatAdhocMessageEventTopicCollaborateChatEntity entityType(EntityTypeEnum entityType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaborateChatAdhocMessageEventTopicCollaborateChatEntity collaborateChatAdhocMessageEventTopicCollaborateChatEntity = (CollaborateChatAdhocMessageEventTopicCollaborateChatEntity) o;

    return Objects.equals(this.entityJid, collaborateChatAdhocMessageEventTopicCollaborateChatEntity.entityJid) &&
            Objects.equals(this.entityId, collaborateChatAdhocMessageEventTopicCollaborateChatEntity.entityId) &&
            Objects.equals(this.entityType, collaborateChatAdhocMessageEventTopicCollaborateChatEntity.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityJid, entityId, entityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollaborateChatAdhocMessageEventTopicCollaborateChatEntity {\n");
    
    sb.append("    entityJid: ").append(toIndentedString(entityJid)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

