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
 * AnalyticsProperty
 */

public class AnalyticsProperty  implements Serializable {
  
  private String property = null;

  private static class PropertyTypeEnumDeserializer extends StdDeserializer<PropertyTypeEnum> {
    public PropertyTypeEnumDeserializer() {
      super(PropertyTypeEnumDeserializer.class);
    }

    @Override
    public PropertyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PropertyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match
   */
 @JsonDeserialize(using = PropertyTypeEnumDeserializer.class)
  public enum PropertyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOOL("bool"),
    INTEGER("integer"),
    REAL("real"),
    DATE("date"),
    STRING("string"),
    UUID("uuid");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PropertyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PropertyTypeEnum value : PropertyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PropertyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PropertyTypeEnum propertyType = null;
  private String value = null;

  
  /**
   * User-defined rather than intrinsic system-observed values. These are tagged onto segments by other components within PureCloud or by API users directly.  This is the name of the user-defined property.
   **/
  public AnalyticsProperty property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User-defined rather than intrinsic system-observed values. These are tagged onto segments by other components within PureCloud or by API users directly.  This is the name of the user-defined property.")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  
  /**
   * Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match
   **/
  public AnalyticsProperty propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match")
  @JsonProperty("propertyType")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  
  /**
   * What property value to match against
   **/
  public AnalyticsProperty value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "What property value to match against")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsProperty analyticsProperty = (AnalyticsProperty) o;
    return Objects.equals(this.property, analyticsProperty.property) &&
        Objects.equals(this.propertyType, analyticsProperty.propertyType) &&
        Objects.equals(this.value, analyticsProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, propertyType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsProperty {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

