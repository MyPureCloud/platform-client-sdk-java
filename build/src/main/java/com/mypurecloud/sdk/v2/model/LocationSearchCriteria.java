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
import com.mypurecloud.sdk.v2.model.LocationSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LocationSearchCriteria
 */

public class LocationSearchCriteria  implements Serializable {
  
  private String endValue = null;
  private List<String> values = new ArrayList<String>();
  private String startValue = null;
  private List<String> fields = new ArrayList<String>();
  private String value = null;

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to apply this search criteria against other criteria
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    OR("OR"),
    NOT("NOT");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private List<LocationSearchCriteria> group = new ArrayList<LocationSearchCriteria>();
  private String dateFormat = null;

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
   * Search Type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXACT("EXACT"),
    STARTS_WITH("STARTS_WITH"),
    CONTAINS("CONTAINS"),
    REGEX("REGEX"),
    TERM("TERM"),
    TERMS("TERMS"),
    REQUIRED_FIELDS("REQUIRED_FIELDS"),
    MATCH_ALL("MATCH_ALL");

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

  
  /**
   * The end value of the range. This field is used for range search types.
   **/
  public LocationSearchCriteria endValue(String endValue) {
    this.endValue = endValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end value of the range. This field is used for range search types.")
  @JsonProperty("endValue")
  public String getEndValue() {
    return endValue;
  }
  public void setEndValue(String endValue) {
    this.endValue = endValue;
  }

  
  /**
   * A list of values for the search to match against
   **/
  public LocationSearchCriteria values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of values for the search to match against")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   * The start value of the range. This field is used for range search types.
   **/
  public LocationSearchCriteria startValue(String startValue) {
    this.startValue = startValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start value of the range. This field is used for range search types.")
  @JsonProperty("startValue")
  public String getStartValue() {
    return startValue;
  }
  public void setStartValue(String startValue) {
    this.startValue = startValue;
  }

  
  /**
   * Field names to search against
   **/
  public LocationSearchCriteria fields(List<String> fields) {
    this.fields = fields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field names to search against")
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }
  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  
  /**
   * A value for the search to match against
   **/
  public LocationSearchCriteria value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value for the search to match against")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * How to apply this search criteria against other criteria
   **/
  public LocationSearchCriteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to apply this search criteria against other criteria")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * Groups multiple conditions
   **/
  public LocationSearchCriteria group(List<LocationSearchCriteria> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Groups multiple conditions")
  @JsonProperty("group")
  public List<LocationSearchCriteria> getGroup() {
    return group;
  }
  public void setGroup(List<LocationSearchCriteria> group) {
    this.group = group;
  }

  
  /**
   * Set date format for criteria values when using date range search type.  Supports Java date format syntax, example yyyy-MM-dd'T'HH:mm:ss.SSSX.
   **/
  public LocationSearchCriteria dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set date format for criteria values when using date range search type.  Supports Java date format syntax, example yyyy-MM-dd'T'HH:mm:ss.SSSX.")
  @JsonProperty("dateFormat")
  public String getDateFormat() {
    return dateFormat;
  }
  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  
  /**
   * Search Type
   **/
  public LocationSearchCriteria type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search Type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationSearchCriteria locationSearchCriteria = (LocationSearchCriteria) o;
    return Objects.equals(this.endValue, locationSearchCriteria.endValue) &&
        Objects.equals(this.values, locationSearchCriteria.values) &&
        Objects.equals(this.startValue, locationSearchCriteria.startValue) &&
        Objects.equals(this.fields, locationSearchCriteria.fields) &&
        Objects.equals(this.value, locationSearchCriteria.value) &&
        Objects.equals(this.operator, locationSearchCriteria.operator) &&
        Objects.equals(this.group, locationSearchCriteria.group) &&
        Objects.equals(this.dateFormat, locationSearchCriteria.dateFormat) &&
        Objects.equals(this.type, locationSearchCriteria.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endValue, values, startValue, fields, value, operator, group, dateFormat, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationSearchCriteria {\n");
    
    sb.append("    endValue: ").append(toIndentedString(endValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    startValue: ").append(toIndentedString(startValue)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

