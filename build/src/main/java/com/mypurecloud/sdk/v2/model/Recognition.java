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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Recognition
 */

public class Recognition  implements Serializable {
  
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
   * The type of recognition
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    THANKYOU("ThankYou"),
    CONGRATULATIONS("Congratulations"),
    HIGHPERFORMANCE("HighPerformance"),
    COMPANYVALUES("CompanyValues");

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

  private static class ContextTypeEnumDeserializer extends StdDeserializer<ContextTypeEnum> {
    public ContextTypeEnumDeserializer() {
      super(ContextTypeEnumDeserializer.class);
    }

    @Override
    public ContextTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContextTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The context type (optional)
   */
 @JsonDeserialize(using = ContextTypeEnumDeserializer.class)
  public enum ContextTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERACTION("Interaction"),
    INSIGHTS("Insights"),
    DEVELOPMENT("Development"),
    SCORECARD("Scorecard");

    private String value;

    ContextTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContextTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContextTypeEnum value : ContextTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContextTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContextTypeEnum contextType = null;
  private String contextId = null;
  private Date dateDisplayed = null;
  private Date dateAcknowledged = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The recipient of the recognition
   **/
  public Recognition recipient(UserReference recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient of the recognition")
  @JsonProperty("recipient")
  public UserReference getRecipient() {
    return recipient;
  }
  public void setRecipient(UserReference recipient) {
    this.recipient = recipient;
  }


  /**
   * The creator of the recognition
   **/
  public Recognition createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creator of the recognition")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recognition dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "2023-01-01T01:01:01Z", value = "The creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The type of recognition
   **/
  public Recognition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of recognition")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The recognition title
   **/
  public Recognition title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recognition title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The recognition note
   **/
  public Recognition note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recognition note")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  /**
   * The context type (optional)
   **/
  public Recognition contextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context type (optional)")
  @JsonProperty("contextType")
  public ContextTypeEnum getContextType() {
    return contextType;
  }
  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
  }


  /**
   * The context id (optional)
   **/
  public Recognition contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context id (optional)")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  /**
   * The displayed date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recognition dateDisplayed(Date dateDisplayed) {
    this.dateDisplayed = dateDisplayed;
    return this;
  }
  
  @ApiModelProperty(example = "2023-01-01T01:01:01Z", value = "The displayed date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDisplayed")
  public Date getDateDisplayed() {
    return dateDisplayed;
  }
  public void setDateDisplayed(Date dateDisplayed) {
    this.dateDisplayed = dateDisplayed;
  }


  /**
   * The acknowledged date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Recognition dateAcknowledged(Date dateAcknowledged) {
    this.dateAcknowledged = dateAcknowledged;
    return this;
  }
  
  @ApiModelProperty(example = "2023-01-01T01:01:01Z", value = "The acknowledged date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAcknowledged")
  public Date getDateAcknowledged() {
    return dateAcknowledged;
  }
  public void setDateAcknowledged(Date dateAcknowledged) {
    this.dateAcknowledged = dateAcknowledged;
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
    Recognition recognition = (Recognition) o;

    return Objects.equals(this.id, recognition.id) &&
            Objects.equals(this.recipient, recognition.recipient) &&
            Objects.equals(this.createdBy, recognition.createdBy) &&
            Objects.equals(this.dateCreated, recognition.dateCreated) &&
            Objects.equals(this.type, recognition.type) &&
            Objects.equals(this.title, recognition.title) &&
            Objects.equals(this.note, recognition.note) &&
            Objects.equals(this.contextType, recognition.contextType) &&
            Objects.equals(this.contextId, recognition.contextId) &&
            Objects.equals(this.dateDisplayed, recognition.dateDisplayed) &&
            Objects.equals(this.dateAcknowledged, recognition.dateAcknowledged) &&
            Objects.equals(this.selfUri, recognition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipient, createdBy, dateCreated, type, title, note, contextType, contextId, dateDisplayed, dateAcknowledged, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recognition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    dateDisplayed: ").append(toIndentedString(dateDisplayed)).append("\n");
    sb.append("    dateAcknowledged: ").append(toIndentedString(dateAcknowledged)).append("\n");
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

