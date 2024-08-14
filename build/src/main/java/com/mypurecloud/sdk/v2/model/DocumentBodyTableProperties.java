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
import com.mypurecloud.sdk.v2.model.DocumentBodyTableCaptionBlock;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyTableProperties
 */

public class DocumentBodyTableProperties  implements Serializable {
  
  private Float width = null;
  private Float height = null;
  private Float cellSpacing = null;
  private Float cellPadding = null;
  private Float borderWidth = null;

  private static class AlignmentEnumDeserializer extends StdDeserializer<AlignmentEnum> {
    public AlignmentEnumDeserializer() {
      super(AlignmentEnumDeserializer.class);
    }

    @Override
    public AlignmentEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlignmentEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The alignment for the table.
   */
 @JsonDeserialize(using = AlignmentEnumDeserializer.class)
  public enum AlignmentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CENTER("Center"),
    LEFT("Left"),
    RIGHT("Right");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlignmentEnum fromString(String key) {
      if (key == null) return null;

      for (AlignmentEnum value : AlignmentEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlignmentEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AlignmentEnum alignment = null;

  private static class BorderStyleEnumDeserializer extends StdDeserializer<BorderStyleEnum> {
    public BorderStyleEnumDeserializer() {
      super(BorderStyleEnumDeserializer.class);
    }

    @Override
    public BorderStyleEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BorderStyleEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The border style for the table.
   */
 @JsonDeserialize(using = BorderStyleEnumDeserializer.class)
  public enum BorderStyleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SOLID("Solid"),
    DOTTED("Dotted"),
    DASHED("Dashed"),
    DOUBLE("Double"),
    GROOVE("Groove"),
    RIDGE("Ridge"),
    INSET("Inset"),
    OUTSET("Outset"),
    HIDDEN("Hidden"),
    NONE("None");

    private String value;

    BorderStyleEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BorderStyleEnum fromString(String key) {
      if (key == null) return null;

      for (BorderStyleEnum value : BorderStyleEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BorderStyleEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BorderStyleEnum borderStyle = null;
  private String borderColor = null;
  private String backgroundColor = null;
  private DocumentBodyTableCaptionBlock caption = null;

  
  /**
   * The width of the table converted to em unit.
   **/
  public DocumentBodyTableProperties width(Float width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The width of the table converted to em unit.")
  @JsonProperty("width")
  public Float getWidth() {
    return width;
  }
  public void setWidth(Float width) {
    this.width = width;
  }


  /**
   * The height for the table.
   **/
  public DocumentBodyTableProperties height(Float height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The height for the table.")
  @JsonProperty("height")
  public Float getHeight() {
    return height;
  }
  public void setHeight(Float height) {
    this.height = height;
  }


  /**
   * The cell spacing for the table. The valid values in 'em'.
   **/
  public DocumentBodyTableProperties cellSpacing(Float cellSpacing) {
    this.cellSpacing = cellSpacing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cell spacing for the table. The valid values in 'em'.")
  @JsonProperty("cellSpacing")
  public Float getCellSpacing() {
    return cellSpacing;
  }
  public void setCellSpacing(Float cellSpacing) {
    this.cellSpacing = cellSpacing;
  }


  /**
   * The cell padding for the table. The valid values in 'em'.
   **/
  public DocumentBodyTableProperties cellPadding(Float cellPadding) {
    this.cellPadding = cellPadding;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cell padding for the table. The valid values in 'em'.")
  @JsonProperty("cellPadding")
  public Float getCellPadding() {
    return cellPadding;
  }
  public void setCellPadding(Float cellPadding) {
    this.cellPadding = cellPadding;
  }


  /**
   * The border width for the table. The valid values in 'em'
   **/
  public DocumentBodyTableProperties borderWidth(Float borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border width for the table. The valid values in 'em'")
  @JsonProperty("borderWidth")
  public Float getBorderWidth() {
    return borderWidth;
  }
  public void setBorderWidth(Float borderWidth) {
    this.borderWidth = borderWidth;
  }


  /**
   * The alignment for the table.
   **/
  public DocumentBodyTableProperties alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The alignment for the table.")
  @JsonProperty("alignment")
  public AlignmentEnum getAlignment() {
    return alignment;
  }
  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }


  /**
   * The border style for the table.
   **/
  public DocumentBodyTableProperties borderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border style for the table.")
  @JsonProperty("borderStyle")
  public BorderStyleEnum getBorderStyle() {
    return borderStyle;
  }
  public void setBorderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
  }


  /**
   * The border color for the table. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyTableProperties borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border color for the table. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("borderColor")
  public String getBorderColor() {
    return borderColor;
  }
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  /**
   * The background color for the table. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyTableProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color for the table. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * The caption for the table. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyTableProperties caption(DocumentBodyTableCaptionBlock caption) {
    this.caption = caption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The caption for the table. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("caption")
  public DocumentBodyTableCaptionBlock getCaption() {
    return caption;
  }
  public void setCaption(DocumentBodyTableCaptionBlock caption) {
    this.caption = caption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyTableProperties documentBodyTableProperties = (DocumentBodyTableProperties) o;

    return Objects.equals(this.width, documentBodyTableProperties.width) &&
            Objects.equals(this.height, documentBodyTableProperties.height) &&
            Objects.equals(this.cellSpacing, documentBodyTableProperties.cellSpacing) &&
            Objects.equals(this.cellPadding, documentBodyTableProperties.cellPadding) &&
            Objects.equals(this.borderWidth, documentBodyTableProperties.borderWidth) &&
            Objects.equals(this.alignment, documentBodyTableProperties.alignment) &&
            Objects.equals(this.borderStyle, documentBodyTableProperties.borderStyle) &&
            Objects.equals(this.borderColor, documentBodyTableProperties.borderColor) &&
            Objects.equals(this.backgroundColor, documentBodyTableProperties.backgroundColor) &&
            Objects.equals(this.caption, documentBodyTableProperties.caption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, cellSpacing, cellPadding, borderWidth, alignment, borderStyle, borderColor, backgroundColor, caption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTableProperties {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    cellSpacing: ").append(toIndentedString(cellSpacing)).append("\n");
    sb.append("    cellPadding: ").append(toIndentedString(cellPadding)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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

