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
import com.mypurecloud.sdk.v2.model.ConversationContentAttachment;
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template header object.
 */
@ApiModel(description = "Template header object.")

public class ConversationNotificationTemplateHeader  implements Serializable {
  

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
   * Template header type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("Text"),
    MEDIA("Media");

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
  private String text = null;
  private ConversationContentAttachment media = null;
  private List<ConversationNotificationTemplateParameter> parameters = new ArrayList<ConversationNotificationTemplateParameter>();

  
  /**
   * Template header type.
   **/
  public ConversationNotificationTemplateHeader type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template header type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Header text. For WhatsApp, ignored.
   **/
  public ConversationNotificationTemplateHeader text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Header text. For WhatsApp, ignored.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Media template header image.
   **/
  public ConversationNotificationTemplateHeader media(ConversationContentAttachment media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media template header image.")
  @JsonProperty("media")
  public ConversationContentAttachment getMedia() {
    return media;
  }
  public void setMedia(ConversationContentAttachment media) {
    this.media = media;
  }

  
  /**
   * Template parameters for placeholders in template.
   **/
  public ConversationNotificationTemplateHeader parameters(List<ConversationNotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template parameters for placeholders in template.")
  @JsonProperty("parameters")
  public List<ConversationNotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<ConversationNotificationTemplateParameter> parameters) {
    this.parameters = parameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNotificationTemplateHeader conversationNotificationTemplateHeader = (ConversationNotificationTemplateHeader) o;
    return Objects.equals(this.type, conversationNotificationTemplateHeader.type) &&
        Objects.equals(this.text, conversationNotificationTemplateHeader.text) &&
        Objects.equals(this.media, conversationNotificationTemplateHeader.media) &&
        Objects.equals(this.parameters, conversationNotificationTemplateHeader.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, media, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationTemplateHeader {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

