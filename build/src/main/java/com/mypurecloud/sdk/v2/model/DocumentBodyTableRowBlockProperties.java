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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyTableRowBlockProperties
 */

public class DocumentBodyTableRowBlockProperties  implements Serializable {
  

  private static class RowTypeEnumDeserializer extends StdDeserializer<RowTypeEnum> {
    public RowTypeEnumDeserializer() {
      super(RowTypeEnumDeserializer.class);
    }

    @Override
    public RowTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RowTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the table row.
   */
 @JsonDeserialize(using = RowTypeEnumDeserializer.class)
  public enum RowTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HEADER("Header"),
    FOOTER("Footer"),
    BODY("Body");

    private String value;

    RowTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RowTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RowTypeEnum value : RowTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RowTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RowTypeEnum rowType = null;

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
   * The alignment for the table row.
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
  private Float height = null;

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
   * The border style for the table row.
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

  public DocumentBodyTableRowBlockProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The type of the table row.
   **/
  public DocumentBodyTableRowBlockProperties rowType(RowTypeEnum rowType) {
    this.rowType = rowType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the table row.")
  @JsonProperty("rowType")
  public RowTypeEnum getRowType() {
    return rowType;
  }
  public void setRowType(RowTypeEnum rowType) {
    this.rowType = rowType;
  }


  /**
   * The alignment for the table row.
   **/
  public DocumentBodyTableRowBlockProperties alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The alignment for the table row.")
  @JsonProperty("alignment")
  public AlignmentEnum getAlignment() {
    return alignment;
  }
  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }


  /**
   * The height for the table row.
   **/
  public DocumentBodyTableRowBlockProperties height(Float height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The height for the table row.")
  @JsonProperty("height")
  public Float getHeight() {
    return height;
  }
  public void setHeight(Float height) {
    this.height = height;
  }


  /**
   * The border style for the table row.
   **/
  public DocumentBodyTableRowBlockProperties borderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border style for the table row.")
  @JsonProperty("borderStyle")
  public BorderStyleEnum getBorderStyle() {
    return borderStyle;
  }
  public void setBorderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
  }


  /**
   * The border color for the table row. For example black color - #000000
   **/
  public DocumentBodyTableRowBlockProperties borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border color for the table row. For example black color - #000000")
  @JsonProperty("borderColor")
  public String getBorderColor() {
    return borderColor;
  }
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  /**
   * The background color for the table row. For example black color - #000000
   **/
  public DocumentBodyTableRowBlockProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color for the table row. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyTableRowBlockProperties documentBodyTableRowBlockProperties = (DocumentBodyTableRowBlockProperties) o;

    return Objects.equals(this.rowType, documentBodyTableRowBlockProperties.rowType) &&
            Objects.equals(this.alignment, documentBodyTableRowBlockProperties.alignment) &&
            Objects.equals(this.height, documentBodyTableRowBlockProperties.height) &&
            Objects.equals(this.borderStyle, documentBodyTableRowBlockProperties.borderStyle) &&
            Objects.equals(this.borderColor, documentBodyTableRowBlockProperties.borderColor) &&
            Objects.equals(this.backgroundColor, documentBodyTableRowBlockProperties.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowType, alignment, height, borderStyle, borderColor, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTableRowBlockProperties {\n");
    
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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

