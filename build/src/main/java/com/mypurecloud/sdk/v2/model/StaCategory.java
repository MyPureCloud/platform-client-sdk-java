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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Operand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * StaCategory
 */

public class StaCategory  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  private static class InteractionTypeEnumDeserializer extends StdDeserializer<InteractionTypeEnum> {
    public InteractionTypeEnumDeserializer() {
      super(InteractionTypeEnumDeserializer.class);
    }

    @Override
    public InteractionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InteractionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of interaction the category will apply to
   */
 @JsonDeserialize(using = InteractionTypeEnumDeserializer.class)
  public enum InteractionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    DIGITAL("Digital"),
    ALL("All");

    private String value;

    InteractionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InteractionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InteractionTypeEnum value : InteractionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InteractionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InteractionTypeEnum interactionType = null;
  private Operand criteria = null;
  private AddressableEntityRef createdBy = null;
  private Date dateCreated = null;
  private AddressableEntityRef modifiedBy = null;
  private Date dateModified = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public StaCategory name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the category
   **/
  public StaCategory description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the category")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The type of interaction the category will apply to
   **/
  public StaCategory interactionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of interaction the category will apply to")
  @JsonProperty("interactionType")
  public InteractionTypeEnum getInteractionType() {
    return interactionType;
  }
  public void setInteractionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
  }


  /**
   * A collection of conditions joined together by logical operation to provide more refined filtering of conversations
   **/
  public StaCategory criteria(Operand criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of conditions joined together by logical operation to provide more refined filtering of conversations")
  @JsonProperty("criteria")
  public Operand getCriteria() {
    return criteria;
  }
  public void setCriteria(Operand criteria) {
    this.criteria = criteria;
  }


  /**
   * The user who created the record
   **/
  public StaCategory createdBy(AddressableEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who created the record")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(AddressableEntityRef createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The creation date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public StaCategory dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creation date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The user who last modified the record
   **/
  public StaCategory modifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who last modified the record")
  @JsonProperty("modifiedBy")
  public AddressableEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The last modified date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public StaCategory dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last modified date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
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
    StaCategory staCategory = (StaCategory) o;

    return Objects.equals(this.id, staCategory.id) &&
            Objects.equals(this.name, staCategory.name) &&
            Objects.equals(this.description, staCategory.description) &&
            Objects.equals(this.interactionType, staCategory.interactionType) &&
            Objects.equals(this.criteria, staCategory.criteria) &&
            Objects.equals(this.createdBy, staCategory.createdBy) &&
            Objects.equals(this.dateCreated, staCategory.dateCreated) &&
            Objects.equals(this.modifiedBy, staCategory.modifiedBy) &&
            Objects.equals(this.dateModified, staCategory.dateModified) &&
            Objects.equals(this.selfUri, staCategory.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, interactionType, criteria, createdBy, dateCreated, modifiedBy, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

