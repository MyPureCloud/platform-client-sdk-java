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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ObjectiveZone
 */

public class ObjectiveZone  implements Serializable {
  
  private String label = null;

  private static class DirectionTypeEnumDeserializer extends StdDeserializer<DirectionTypeEnum> {
    public DirectionTypeEnumDeserializer() {
      super(DirectionTypeEnumDeserializer.class);
    }

    @Override
    public DirectionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * direction type
   */
 @JsonDeserialize(using = DirectionTypeEnumDeserializer.class)
  public enum DirectionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UP("Up"),
    DOWN("Down"),
    FLAT("Flat");

    private String value;

    DirectionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionTypeEnum value : DirectionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionTypeEnum directionType = null;

  private static class ZoneTypeEnumDeserializer extends StdDeserializer<ZoneTypeEnum> {
    public ZoneTypeEnumDeserializer() {
      super(ZoneTypeEnumDeserializer.class);
    }

    @Override
    public ZoneTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ZoneTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * zone type
   */
 @JsonDeserialize(using = ZoneTypeEnumDeserializer.class)
  public enum ZoneTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GOOD("Good"),
    TARGET("Target"),
    GREAT("Great"),
    OUT("Out");

    private String value;

    ZoneTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ZoneTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ZoneTypeEnum value : ZoneTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ZoneTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ZoneTypeEnum zoneType = null;
  private Integer upperLimitPoints = null;
  private Integer lowerLimitPoints = null;
  private Integer upperLimitValue = null;
  private Integer lowerLimitValue = null;

  
  /**
   * label
   **/
  public ObjectiveZone label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "label")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * direction type
   **/
  public ObjectiveZone directionType(DirectionTypeEnum directionType) {
    this.directionType = directionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "direction type")
  @JsonProperty("directionType")
  public DirectionTypeEnum getDirectionType() {
    return directionType;
  }
  public void setDirectionType(DirectionTypeEnum directionType) {
    this.directionType = directionType;
  }

  
  /**
   * zone type
   **/
  public ObjectiveZone zoneType(ZoneTypeEnum zoneType) {
    this.zoneType = zoneType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "zone type")
  @JsonProperty("zoneType")
  public ZoneTypeEnum getZoneType() {
    return zoneType;
  }
  public void setZoneType(ZoneTypeEnum zoneType) {
    this.zoneType = zoneType;
  }

  
  /**
   * upper limit points
   **/
  public ObjectiveZone upperLimitPoints(Integer upperLimitPoints) {
    this.upperLimitPoints = upperLimitPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "upper limit points")
  @JsonProperty("upperLimitPoints")
  public Integer getUpperLimitPoints() {
    return upperLimitPoints;
  }
  public void setUpperLimitPoints(Integer upperLimitPoints) {
    this.upperLimitPoints = upperLimitPoints;
  }

  
  /**
   * lower limit points
   **/
  public ObjectiveZone lowerLimitPoints(Integer lowerLimitPoints) {
    this.lowerLimitPoints = lowerLimitPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "lower limit points")
  @JsonProperty("lowerLimitPoints")
  public Integer getLowerLimitPoints() {
    return lowerLimitPoints;
  }
  public void setLowerLimitPoints(Integer lowerLimitPoints) {
    this.lowerLimitPoints = lowerLimitPoints;
  }

  
  /**
   * upper limit value
   **/
  public ObjectiveZone upperLimitValue(Integer upperLimitValue) {
    this.upperLimitValue = upperLimitValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "upper limit value")
  @JsonProperty("upperLimitValue")
  public Integer getUpperLimitValue() {
    return upperLimitValue;
  }
  public void setUpperLimitValue(Integer upperLimitValue) {
    this.upperLimitValue = upperLimitValue;
  }

  
  /**
   * lower limit value
   **/
  public ObjectiveZone lowerLimitValue(Integer lowerLimitValue) {
    this.lowerLimitValue = lowerLimitValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lower limit value")
  @JsonProperty("lowerLimitValue")
  public Integer getLowerLimitValue() {
    return lowerLimitValue;
  }
  public void setLowerLimitValue(Integer lowerLimitValue) {
    this.lowerLimitValue = lowerLimitValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectiveZone objectiveZone = (ObjectiveZone) o;
    return Objects.equals(this.label, objectiveZone.label) &&
        Objects.equals(this.directionType, objectiveZone.directionType) &&
        Objects.equals(this.zoneType, objectiveZone.zoneType) &&
        Objects.equals(this.upperLimitPoints, objectiveZone.upperLimitPoints) &&
        Objects.equals(this.lowerLimitPoints, objectiveZone.lowerLimitPoints) &&
        Objects.equals(this.upperLimitValue, objectiveZone.upperLimitValue) &&
        Objects.equals(this.lowerLimitValue, objectiveZone.lowerLimitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, directionType, zoneType, upperLimitPoints, lowerLimitPoints, upperLimitValue, lowerLimitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectiveZone {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    directionType: ").append(toIndentedString(directionType)).append("\n");
    sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
    sb.append("    upperLimitPoints: ").append(toIndentedString(upperLimitPoints)).append("\n");
    sb.append("    lowerLimitPoints: ").append(toIndentedString(lowerLimitPoints)).append("\n");
    sb.append("    upperLimitValue: ").append(toIndentedString(upperLimitValue)).append("\n");
    sb.append("    lowerLimitValue: ").append(toIndentedString(lowerLimitValue)).append("\n");
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

