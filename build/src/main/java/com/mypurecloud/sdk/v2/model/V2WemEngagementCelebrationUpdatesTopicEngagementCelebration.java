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
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicSourceEntity;
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicUserId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2WemEngagementCelebrationUpdatesTopicEngagementCelebration
 */

public class V2WemEngagementCelebrationUpdatesTopicEngagementCelebration  implements Serializable {
  
  private String id = null;
  private V2WemEngagementCelebrationUpdatesTopicUserId recipient = null;
  private V2WemEngagementCelebrationUpdatesTopicUserId createdBy = null;
  private String dateCreated = null;

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    RECOGNITION("RECOGNITION");

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
  private String title = null;
  private String note = null;
  private V2WemEngagementCelebrationUpdatesTopicSourceEntity sourceEntity = null;

  
  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration id(String id) {
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
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration recipient(V2WemEngagementCelebrationUpdatesTopicUserId recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipient")
  public V2WemEngagementCelebrationUpdatesTopicUserId getRecipient() {
    return recipient;
  }
  public void setRecipient(V2WemEngagementCelebrationUpdatesTopicUserId recipient) {
    this.recipient = recipient;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration createdBy(V2WemEngagementCelebrationUpdatesTopicUserId createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public V2WemEngagementCelebrationUpdatesTopicUserId getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(V2WemEngagementCelebrationUpdatesTopicUserId createdBy) {
    this.createdBy = createdBy;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public String getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicEngagementCelebration sourceEntity(V2WemEngagementCelebrationUpdatesTopicSourceEntity sourceEntity) {
    this.sourceEntity = sourceEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceEntity")
  public V2WemEngagementCelebrationUpdatesTopicSourceEntity getSourceEntity() {
    return sourceEntity;
  }
  public void setSourceEntity(V2WemEngagementCelebrationUpdatesTopicSourceEntity sourceEntity) {
    this.sourceEntity = sourceEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WemEngagementCelebrationUpdatesTopicEngagementCelebration v2WemEngagementCelebrationUpdatesTopicEngagementCelebration = (V2WemEngagementCelebrationUpdatesTopicEngagementCelebration) o;

    return Objects.equals(this.id, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.id) &&
            Objects.equals(this.recipient, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.recipient) &&
            Objects.equals(this.createdBy, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.createdBy) &&
            Objects.equals(this.dateCreated, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.dateCreated) &&
            Objects.equals(this.type, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.type) &&
            Objects.equals(this.title, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.title) &&
            Objects.equals(this.note, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.note) &&
            Objects.equals(this.sourceEntity, v2WemEngagementCelebrationUpdatesTopicEngagementCelebration.sourceEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipient, createdBy, dateCreated, type, title, note, sourceEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WemEngagementCelebrationUpdatesTopicEngagementCelebration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    sourceEntity: ").append(toIndentedString(sourceEntity)).append("\n");
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

