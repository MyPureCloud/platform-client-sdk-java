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
import com.mypurecloud.sdk.v2.model.SuggestSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SuggestSearchCriteria
 */

public class SuggestSearchCriteria  implements Serializable {
  
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
  private List<SuggestSearchCriteria> group = new ArrayList<SuggestSearchCriteria>();
  private String dateFormat = null;

  
  /**
   * The end value of the range. This field is used for range search types.
   **/
  public SuggestSearchCriteria endValue(String endValue) {
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
  public SuggestSearchCriteria values(List<String> values) {
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
  public SuggestSearchCriteria startValue(String startValue) {
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
  public SuggestSearchCriteria fields(List<String> fields) {
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
  public SuggestSearchCriteria value(String value) {
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
  public SuggestSearchCriteria operator(OperatorEnum operator) {
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
  public SuggestSearchCriteria group(List<SuggestSearchCriteria> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Groups multiple conditions")
  @JsonProperty("group")
  public List<SuggestSearchCriteria> getGroup() {
    return group;
  }
  public void setGroup(List<SuggestSearchCriteria> group) {
    this.group = group;
  }

  
  /**
   * Set date format for criteria values when using date range search type.  Supports Java date format syntax, example yyyy-MM-dd'T'HH:mm:ss.SSSX.
   **/
  public SuggestSearchCriteria dateFormat(String dateFormat) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestSearchCriteria suggestSearchCriteria = (SuggestSearchCriteria) o;
    return Objects.equals(this.endValue, suggestSearchCriteria.endValue) &&
        Objects.equals(this.values, suggestSearchCriteria.values) &&
        Objects.equals(this.startValue, suggestSearchCriteria.startValue) &&
        Objects.equals(this.fields, suggestSearchCriteria.fields) &&
        Objects.equals(this.value, suggestSearchCriteria.value) &&
        Objects.equals(this.operator, suggestSearchCriteria.operator) &&
        Objects.equals(this.group, suggestSearchCriteria.group) &&
        Objects.equals(this.dateFormat, suggestSearchCriteria.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endValue, values, startValue, fields, value, operator, group, dateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestSearchCriteria {\n");
    
    sb.append("    endValue: ").append(toIndentedString(endValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    startValue: ").append(toIndentedString(startValue)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
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

