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
 * CreateRecognition
 */

public class CreateRecognition  implements Serializable {
  
  private String recipientId = null;

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
   * The type of the recognition
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

  
  /**
   * The recipient of the recognition
   **/
  public CreateRecognition recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recipient of the recognition")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * The type of the recognition
   **/
  public CreateRecognition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the recognition")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The title of the recognition. Max length of 100 characters (optional)
   **/
  public CreateRecognition title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The title of the recognition. Max length of 100 characters (optional)")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The note of the recognition. Max length of 800 characters (optional)
   **/
  public CreateRecognition note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The note of the recognition. Max length of 800 characters (optional)")
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
  public CreateRecognition contextType(ContextTypeEnum contextType) {
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
  public CreateRecognition contextId(String contextId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRecognition createRecognition = (CreateRecognition) o;

    return Objects.equals(this.recipientId, createRecognition.recipientId) &&
            Objects.equals(this.type, createRecognition.type) &&
            Objects.equals(this.title, createRecognition.title) &&
            Objects.equals(this.note, createRecognition.note) &&
            Objects.equals(this.contextType, createRecognition.contextType) &&
            Objects.equals(this.contextId, createRecognition.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, type, title, note, contextType, contextId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRecognition {\n");
    
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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

