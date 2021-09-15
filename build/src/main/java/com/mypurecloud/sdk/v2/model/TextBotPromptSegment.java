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
import com.mypurecloud.sdk.v2.model.Format;
import com.mypurecloud.sdk.v2.model.MessageContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Data for a single bot flow prompt segment.
 */
@ApiModel(description = "Data for a single bot flow prompt segment.")

public class TextBotPromptSegment  implements Serializable {
  
  private String text = null;

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
   * The segment type which describes any semantics about the 'text' and also indicates which other field might include additional relevant info.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("Text"),
    RICHMEDIA("RichMedia");

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
  private Format format = null;
  private List<MessageContent> content = new ArrayList<MessageContent>();

  
  /**
   * The text of this prompt segment.
   **/
  public TextBotPromptSegment text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text of this prompt segment.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * The segment type which describes any semantics about the 'text' and also indicates which other field might include additional relevant info.
   **/
  public TextBotPromptSegment type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment type which describes any semantics about the 'text' and also indicates which other field might include additional relevant info.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Additional details describing the segment’s contents, which the client should honour where possible.
   **/
  public TextBotPromptSegment format(Format format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional details describing the segment’s contents, which the client should honour where possible.")
  @JsonProperty("format")
  public Format getFormat() {
    return format;
  }
  public void setFormat(Format format) {
    this.format = format;
  }

  
  /**
   * Details to display Rich Media content. This is only populated when the segment 'type' is 'Rich Media'.
   **/
  public TextBotPromptSegment content(List<MessageContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details to display Rich Media content. This is only populated when the segment 'type' is 'Rich Media'.")
  @JsonProperty("content")
  public List<MessageContent> getContent() {
    return content;
  }
  public void setContent(List<MessageContent> content) {
    this.content = content;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotPromptSegment textBotPromptSegment = (TextBotPromptSegment) o;
    return Objects.equals(this.text, textBotPromptSegment.text) &&
        Objects.equals(this.type, textBotPromptSegment.type) &&
        Objects.equals(this.format, textBotPromptSegment.format) &&
        Objects.equals(this.content, textBotPromptSegment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type, format, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotPromptSegment {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

