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
import com.mypurecloud.sdk.v2.model.DocumentElementLength;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyTableCellBlockProperties
 */

public class DocumentBodyTableCellBlockProperties  implements Serializable {
  

  private static class CellTypeEnumDeserializer extends StdDeserializer<CellTypeEnum> {
    public CellTypeEnumDeserializer() {
      super(CellTypeEnumDeserializer.class);
    }

    @Override
    public CellTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CellTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the table cell.
   */
 @JsonDeserialize(using = CellTypeEnumDeserializer.class)
  public enum CellTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CELL("Cell"),
    HEADERCELL("HeaderCell");

    private String value;

    CellTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CellTypeEnum fromString(String key) {
      if (key == null) return null;

      for (CellTypeEnum value : CellTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CellTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CellTypeEnum cellType = null;
  private Float width = null;
  private DocumentElementLength widthWithUnit = null;
  private Float height = null;

  private static class HorizontalAlignEnumDeserializer extends StdDeserializer<HorizontalAlignEnum> {
    public HorizontalAlignEnumDeserializer() {
      super(HorizontalAlignEnumDeserializer.class);
    }

    @Override
    public HorizontalAlignEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return HorizontalAlignEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The horizontal alignment for the table cell.
   */
 @JsonDeserialize(using = HorizontalAlignEnumDeserializer.class)
  public enum HorizontalAlignEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CENTER("Center"),
    LEFT("Left"),
    RIGHT("Right");

    private String value;

    HorizontalAlignEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static HorizontalAlignEnum fromString(String key) {
      if (key == null) return null;

      for (HorizontalAlignEnum value : HorizontalAlignEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return HorizontalAlignEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private HorizontalAlignEnum horizontalAlign = null;

  private static class VerticalAlignEnumDeserializer extends StdDeserializer<VerticalAlignEnum> {
    public VerticalAlignEnumDeserializer() {
      super(VerticalAlignEnumDeserializer.class);
    }

    @Override
    public VerticalAlignEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VerticalAlignEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The vertical alignment for the table cell.
   */
 @JsonDeserialize(using = VerticalAlignEnumDeserializer.class)
  public enum VerticalAlignEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TOP("Top"),
    MIDDLE("Middle"),
    BOTTOM("Bottom");

    private String value;

    VerticalAlignEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VerticalAlignEnum fromString(String key) {
      if (key == null) return null;

      for (VerticalAlignEnum value : VerticalAlignEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VerticalAlignEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VerticalAlignEnum verticalAlign = null;
  private Float borderWidth = null;

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
   * The border style for the table cell.
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

  private static class ScopeEnumDeserializer extends StdDeserializer<ScopeEnum> {
    public ScopeEnumDeserializer() {
      super(ScopeEnumDeserializer.class);
    }

    @Override
    public ScopeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScopeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The scope for the table cell.
   */
 @JsonDeserialize(using = ScopeEnumDeserializer.class)
  public enum ScopeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ROW("Row"),
    COLUMN("Column"),
    ROWGROUP("RowGroup"),
    COLUMNGROUP("ColumnGroup"),
    NONE("None");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScopeEnum fromString(String key) {
      if (key == null) return null;

      for (ScopeEnum value : ScopeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScopeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScopeEnum scope = null;
  private Integer colSpan = null;
  private Integer rowSpan = null;

  
  /**
   * The type of the table cell.
   **/
  public DocumentBodyTableCellBlockProperties cellType(CellTypeEnum cellType) {
    this.cellType = cellType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the table cell.")
  @JsonProperty("cellType")
  public CellTypeEnum getCellType() {
    return cellType;
  }
  public void setCellType(CellTypeEnum cellType) {
    this.cellType = cellType;
  }


  /**
   * The width of the table cell converted to em unit.
   **/
  public DocumentBodyTableCellBlockProperties width(Float width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The width of the table cell converted to em unit.")
  @JsonProperty("width")
  public Float getWidth() {
    return width;
  }
  public void setWidth(Float width) {
    this.width = width;
  }


  /**
   * The width of the table cell in the specified unit.
   **/
  public DocumentBodyTableCellBlockProperties widthWithUnit(DocumentElementLength widthWithUnit) {
    this.widthWithUnit = widthWithUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The width of the table cell in the specified unit.")
  @JsonProperty("widthWithUnit")
  public DocumentElementLength getWidthWithUnit() {
    return widthWithUnit;
  }
  public void setWidthWithUnit(DocumentElementLength widthWithUnit) {
    this.widthWithUnit = widthWithUnit;
  }


  /**
   * The height for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties height(Float height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The height for the table cell.")
  @JsonProperty("height")
  public Float getHeight() {
    return height;
  }
  public void setHeight(Float height) {
    this.height = height;
  }


  /**
   * The horizontal alignment for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties horizontalAlign(HorizontalAlignEnum horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The horizontal alignment for the table cell.")
  @JsonProperty("horizontalAlign")
  public HorizontalAlignEnum getHorizontalAlign() {
    return horizontalAlign;
  }
  public void setHorizontalAlign(HorizontalAlignEnum horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
  }


  /**
   * The vertical alignment for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties verticalAlign(VerticalAlignEnum verticalAlign) {
    this.verticalAlign = verticalAlign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The vertical alignment for the table cell.")
  @JsonProperty("verticalAlign")
  public VerticalAlignEnum getVerticalAlign() {
    return verticalAlign;
  }
  public void setVerticalAlign(VerticalAlignEnum verticalAlign) {
    this.verticalAlign = verticalAlign;
  }


  /**
   * The border width for the table cell. The valid values in 'em'
   **/
  public DocumentBodyTableCellBlockProperties borderWidth(Float borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border width for the table cell. The valid values in 'em'")
  @JsonProperty("borderWidth")
  public Float getBorderWidth() {
    return borderWidth;
  }
  public void setBorderWidth(Float borderWidth) {
    this.borderWidth = borderWidth;
  }


  /**
   * The border style for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties borderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border style for the table cell.")
  @JsonProperty("borderStyle")
  public BorderStyleEnum getBorderStyle() {
    return borderStyle;
  }
  public void setBorderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
  }


  /**
   * The border color for the table cell. For example black color - #000000
   **/
  public DocumentBodyTableCellBlockProperties borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The border color for the table cell. For example black color - #000000")
  @JsonProperty("borderColor")
  public String getBorderColor() {
    return borderColor;
  }
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  /**
   * The background color for the table cell. For example black color - #000000
   **/
  public DocumentBodyTableCellBlockProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color for the table cell. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * The scope for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The scope for the table cell.")
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  /**
   * The colSpan for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties colSpan(Integer colSpan) {
    this.colSpan = colSpan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The colSpan for the table cell.")
  @JsonProperty("colSpan")
  public Integer getColSpan() {
    return colSpan;
  }
  public void setColSpan(Integer colSpan) {
    this.colSpan = colSpan;
  }


  /**
   * The rowSpan for the table cell.
   **/
  public DocumentBodyTableCellBlockProperties rowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rowSpan for the table cell.")
  @JsonProperty("rowSpan")
  public Integer getRowSpan() {
    return rowSpan;
  }
  public void setRowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyTableCellBlockProperties documentBodyTableCellBlockProperties = (DocumentBodyTableCellBlockProperties) o;

    return Objects.equals(this.cellType, documentBodyTableCellBlockProperties.cellType) &&
            Objects.equals(this.width, documentBodyTableCellBlockProperties.width) &&
            Objects.equals(this.widthWithUnit, documentBodyTableCellBlockProperties.widthWithUnit) &&
            Objects.equals(this.height, documentBodyTableCellBlockProperties.height) &&
            Objects.equals(this.horizontalAlign, documentBodyTableCellBlockProperties.horizontalAlign) &&
            Objects.equals(this.verticalAlign, documentBodyTableCellBlockProperties.verticalAlign) &&
            Objects.equals(this.borderWidth, documentBodyTableCellBlockProperties.borderWidth) &&
            Objects.equals(this.borderStyle, documentBodyTableCellBlockProperties.borderStyle) &&
            Objects.equals(this.borderColor, documentBodyTableCellBlockProperties.borderColor) &&
            Objects.equals(this.backgroundColor, documentBodyTableCellBlockProperties.backgroundColor) &&
            Objects.equals(this.scope, documentBodyTableCellBlockProperties.scope) &&
            Objects.equals(this.colSpan, documentBodyTableCellBlockProperties.colSpan) &&
            Objects.equals(this.rowSpan, documentBodyTableCellBlockProperties.rowSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellType, width, widthWithUnit, height, horizontalAlign, verticalAlign, borderWidth, borderStyle, borderColor, backgroundColor, scope, colSpan, rowSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTableCellBlockProperties {\n");
    
    sb.append("    cellType: ").append(toIndentedString(cellType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    widthWithUnit: ").append(toIndentedString(widthWithUnit)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    horizontalAlign: ").append(toIndentedString(horizontalAlign)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
    sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
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

