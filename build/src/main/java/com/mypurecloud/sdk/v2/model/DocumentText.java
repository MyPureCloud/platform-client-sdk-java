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
import com.mypurecloud.sdk.v2.model.DocumentTextProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentText
 */

public class DocumentText  implements Serializable {
  
  private String text = null;

  private static class MarksEnumDeserializer extends StdDeserializer<MarksEnum> {
    public MarksEnumDeserializer() {
      super(MarksEnumDeserializer.class);
    }

    @Override
    public MarksEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MarksEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets marks
   */
 @JsonDeserialize(using = MarksEnumDeserializer.class)
  public enum MarksEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOLD("Bold"),
    ITALIC("Italic"),
    UNDERLINE("Underline"),
    STRIKETHROUGH("Strikethrough"),
    SUBSCRIPT("Subscript"),
    SUPERSCRIPT("Superscript");

    private String value;

    MarksEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MarksEnum fromString(String key) {
      if (key == null) return null;

      for (MarksEnum value : MarksEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MarksEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MarksEnum> marks = null;
  private String hyperlink = null;
  private DocumentTextProperties properties = null;

  public DocumentText() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      marks = new ArrayList<MarksEnum>();
    }
  }

  
  /**
   * Text.
   **/
  public DocumentText text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The unique list of marks (whether it is bold and/or underlined etc.) for the text.
   **/
  public DocumentText marks(List<MarksEnum> marks) {
    this.marks = marks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique list of marks (whether it is bold and/or underlined etc.) for the text.")
  @JsonProperty("marks")
  public List<MarksEnum> getMarks() {
    return marks;
  }
  public void setMarks(List<MarksEnum> marks) {
    this.marks = marks;
  }


  /**
   * The URL of the page OR an email OR the reference to the knowledge article that the hyperlink goes to. Possible URL value types are https://<url link> | mailto:<email> | grn:knowledge:::documentVariation/<knowledgeBaseId>/<documentId>/<variationId> | grn:knowledge:::document/<knowledgeBaseId>/<documentId> | grn:knowledge:::category/<knowledgeBaseId>/<categoryId> | grn:knowledge:::label/<knowledgeBaseId>/<labelId>
   **/
  public DocumentText hyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the page OR an email OR the reference to the knowledge article that the hyperlink goes to. Possible URL value types are https://<url link> | mailto:<email> | grn:knowledge:::documentVariation/<knowledgeBaseId>/<documentId>/<variationId> | grn:knowledge:::document/<knowledgeBaseId>/<documentId> | grn:knowledge:::category/<knowledgeBaseId>/<categoryId> | grn:knowledge:::label/<knowledgeBaseId>/<labelId>")
  @JsonProperty("hyperlink")
  public String getHyperlink() {
    return hyperlink;
  }
  public void setHyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
  }


  /**
   * The properties for the text.
   **/
  public DocumentText properties(DocumentTextProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The properties for the text.")
  @JsonProperty("properties")
  public DocumentTextProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentTextProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentText documentText = (DocumentText) o;

    return Objects.equals(this.text, documentText.text) &&
            Objects.equals(this.marks, documentText.marks) &&
            Objects.equals(this.hyperlink, documentText.hyperlink) &&
            Objects.equals(this.properties, documentText.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, marks, hyperlink, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentText {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

