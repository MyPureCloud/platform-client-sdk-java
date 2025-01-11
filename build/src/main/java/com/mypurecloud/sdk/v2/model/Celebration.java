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
import com.mypurecloud.sdk.v2.model.SourceEntity;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Celebration
 */

public class Celebration  implements Serializable {
  
  private String id = null;
  private UserReference recipient = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;

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
   * The Celebration Type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RECOGNITION("Recognition"),
    CONTESTCOMPLETE("ContestComplete");

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
  private SourceEntity sourceEntity = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The Recipient of the celebration
   **/
  public Celebration recipient(UserReference recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Recipient of the celebration")
  @JsonProperty("recipient")
  public UserReference getRecipient() {
    return recipient;
  }
  public void setRecipient(UserReference recipient) {
    this.recipient = recipient;
  }


  /**
   * The creator of the celebration
   **/
  public Celebration createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creator of the celebration")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The date the celebration was created on. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Celebration dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "2023-01-01T01:01:01Z", value = "The date the celebration was created on. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The Celebration Type
   **/
  public Celebration type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Celebration Type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The Celebration title
   **/
  public Celebration title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Celebration title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The Celebration note
   **/
  public Celebration note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Celebration note")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  /**
   * The celebration's source entity
   **/
  public Celebration sourceEntity(SourceEntity sourceEntity) {
    this.sourceEntity = sourceEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The celebration's source entity")
  @JsonProperty("sourceEntity")
  public SourceEntity getSourceEntity() {
    return sourceEntity;
  }
  public void setSourceEntity(SourceEntity sourceEntity) {
    this.sourceEntity = sourceEntity;
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
    Celebration celebration = (Celebration) o;

    return Objects.equals(this.id, celebration.id) &&
            Objects.equals(this.recipient, celebration.recipient) &&
            Objects.equals(this.createdBy, celebration.createdBy) &&
            Objects.equals(this.dateCreated, celebration.dateCreated) &&
            Objects.equals(this.type, celebration.type) &&
            Objects.equals(this.title, celebration.title) &&
            Objects.equals(this.note, celebration.note) &&
            Objects.equals(this.sourceEntity, celebration.sourceEntity) &&
            Objects.equals(this.selfUri, celebration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipient, createdBy, dateCreated, type, title, note, sourceEntity, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Celebration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    sourceEntity: ").append(toIndentedString(sourceEntity)).append("\n");
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

