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
import com.mypurecloud.sdk.v2.model.ExternalContactsContactNoteChangedTopicDivision;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactNoteChangedTopicUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ExternalContactsContactNoteChangedTopicNote
 */

public class ExternalContactsContactNoteChangedTopicNote  implements Serializable {
  
  private String id = null;
  private ExternalContactsContactNoteChangedTopicDivision division = null;
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
    CONTACT("Contact"),
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
  private String noteText = null;
  private ExternalContactsContactNoteChangedTopicUser createdBy = null;
  private Date createDate = null;
  private Date modifyDate = null;

  public ExternalContactsContactNoteChangedTopicNote() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsContactNoteChangedTopicNote id(String id) {
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
  public ExternalContactsContactNoteChangedTopicNote division(ExternalContactsContactNoteChangedTopicDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ExternalContactsContactNoteChangedTopicDivision getDivision() {
    return division;
  }
  public void setDivision(ExternalContactsContactNoteChangedTopicDivision division) {
    this.division = division;
  }


  /**
   **/
  public ExternalContactsContactNoteChangedTopicNote entityId(String entityId) {
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
  public ExternalContactsContactNoteChangedTopicNote entityType(EntityTypeEnum entityType) {
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
  public ExternalContactsContactNoteChangedTopicNote noteText(String noteText) {
    this.noteText = noteText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noteText")
  public String getNoteText() {
    return noteText;
  }
  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }


  /**
   **/
  public ExternalContactsContactNoteChangedTopicNote createdBy(ExternalContactsContactNoteChangedTopicUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public ExternalContactsContactNoteChangedTopicUser getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(ExternalContactsContactNoteChangedTopicUser createdBy) {
    this.createdBy = createdBy;
  }


  /**
   **/
  public ExternalContactsContactNoteChangedTopicNote createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  /**
   **/
  public ExternalContactsContactNoteChangedTopicNote modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsContactNoteChangedTopicNote externalContactsContactNoteChangedTopicNote = (ExternalContactsContactNoteChangedTopicNote) o;

    return Objects.equals(this.id, externalContactsContactNoteChangedTopicNote.id) &&
            Objects.equals(this.division, externalContactsContactNoteChangedTopicNote.division) &&
            Objects.equals(this.entityId, externalContactsContactNoteChangedTopicNote.entityId) &&
            Objects.equals(this.entityType, externalContactsContactNoteChangedTopicNote.entityType) &&
            Objects.equals(this.noteText, externalContactsContactNoteChangedTopicNote.noteText) &&
            Objects.equals(this.createdBy, externalContactsContactNoteChangedTopicNote.createdBy) &&
            Objects.equals(this.createDate, externalContactsContactNoteChangedTopicNote.createDate) &&
            Objects.equals(this.modifyDate, externalContactsContactNoteChangedTopicNote.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, entityId, entityType, noteText, createdBy, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactNoteChangedTopicNote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

