package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CoachingAnnotation
 */

public class CoachingAnnotation  implements Serializable {
  
  private String id = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private String text = null;
  private Boolean isDeleted = null;

  private static class AccessTypeEnumDeserializer extends StdDeserializer<AccessTypeEnum> {
    public AccessTypeEnumDeserializer() {
      super(AccessTypeEnumDeserializer.class);
    }

    @Override
    public AccessTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AccessTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Determines the permissions required to view this item.
   */
 @JsonDeserialize(using = AccessTypeEnumDeserializer.class)
  public enum AccessTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("Public"),
    PRIVATE("Private");

    private String value;

    AccessTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AccessTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AccessTypeEnum value : AccessTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AccessTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AccessTypeEnum accessType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The user who created the annotation.")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the annotation was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The last user to modify the annotation.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the annotation was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * The text of the annotation.
   **/
  public CoachingAnnotation text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text of the annotation.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  @ApiModelProperty(example = "null", value = "Flag indicating whether the annotation is deleted.")
  @JsonProperty("isDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  
  @ApiModelProperty(example = "null", value = "Determines the permissions required to view this item.")
  @JsonProperty("accessType")
  public AccessTypeEnum getAccessType() {
    return accessType;
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
    CoachingAnnotation coachingAnnotation = (CoachingAnnotation) o;
    return Objects.equals(this.id, coachingAnnotation.id) &&
        Objects.equals(this.createdBy, coachingAnnotation.createdBy) &&
        Objects.equals(this.dateCreated, coachingAnnotation.dateCreated) &&
        Objects.equals(this.modifiedBy, coachingAnnotation.modifiedBy) &&
        Objects.equals(this.dateModified, coachingAnnotation.dateModified) &&
        Objects.equals(this.text, coachingAnnotation.text) &&
        Objects.equals(this.isDeleted, coachingAnnotation.isDeleted) &&
        Objects.equals(this.accessType, coachingAnnotation.accessType) &&
        Objects.equals(this.selfUri, coachingAnnotation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, dateCreated, modifiedBy, dateModified, text, isDeleted, accessType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingAnnotation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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

