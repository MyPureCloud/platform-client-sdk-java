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
import com.mypurecloud.sdk.v2.model.TimeAndDateSubConditionRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TimeAndDateSubCondition
 */

public class TimeAndDateSubCondition  implements Serializable {
  

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
   * The type of time/date sub-condition.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TIMEOFDAY("timeOfDay"),
    DAYOFWEEK("dayOfWeek"),
    DAYOFMONTH("dayOfMonth"),
    SPECIFICDATE("specificDate");

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
   * The operator to use for comparison.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("EQUALS"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
    CONTAINS("CONTAINS"),
    BEGINS_WITH("BEGINS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    BEFORE("BEFORE"),
    AFTER("AFTER"),
    IN("IN"),
    BETWEEN("BETWEEN");

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
  private Boolean inverted = null;
  private Boolean includeYear = null;
  private String thresholdValue = null;
  private TimeAndDateSubConditionRange range = null;

  public TimeAndDateSubCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The type of time/date sub-condition.
   **/
  public TimeAndDateSubCondition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of time/date sub-condition.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The operator to use for comparison.
   **/
  public TimeAndDateSubCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator to use for comparison.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * If true, inverts the result of evaluating this sub-condition. Default is false.
   **/
  public TimeAndDateSubCondition inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, inverts the result of evaluating this sub-condition. Default is false.")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }


  /**
   * If true, includes year in date comparison for specificDate type. When false, only month and day are compared. Default is true. Only applicable for specificDate type.
   **/
  public TimeAndDateSubCondition includeYear(Boolean includeYear) {
    this.includeYear = includeYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, includes year in date comparison for specificDate type. When false, only month and day are compared. Default is true. Only applicable for specificDate type.")
  @JsonProperty("includeYear")
  public Boolean getIncludeYear() {
    return includeYear;
  }
  public void setIncludeYear(Boolean includeYear) {
    this.includeYear = includeYear;
  }


  /**
   * Threshold value for BEFORE or AFTER operators. Format depends on type: timeOfDay: HH:mm, dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31 and/ or LAST_DAY, ODD_DAY, EVEN_DAY, specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false). For single-value comparison, use a list with one element.
   **/
  public TimeAndDateSubCondition thresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Threshold value for BEFORE or AFTER operators. Format depends on type: timeOfDay: HH:mm, dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31 and/ or LAST_DAY, ODD_DAY, EVEN_DAY, specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false). For single-value comparison, use a list with one element.")
  @JsonProperty("thresholdValue")
  public String getThresholdValue() {
    return thresholdValue;
  }
  public void setThresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
  }


  /**
   * A range of values for BETWEEN and IN operators. Format follows the same rules as 'thresholdValue'.
   **/
  public TimeAndDateSubCondition range(TimeAndDateSubConditionRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A range of values for BETWEEN and IN operators. Format follows the same rules as 'thresholdValue'.")
  @JsonProperty("range")
  public TimeAndDateSubConditionRange getRange() {
    return range;
  }
  public void setRange(TimeAndDateSubConditionRange range) {
    this.range = range;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeAndDateSubCondition timeAndDateSubCondition = (TimeAndDateSubCondition) o;

    return Objects.equals(this.type, timeAndDateSubCondition.type) &&
            Objects.equals(this.operator, timeAndDateSubCondition.operator) &&
            Objects.equals(this.inverted, timeAndDateSubCondition.inverted) &&
            Objects.equals(this.includeYear, timeAndDateSubCondition.includeYear) &&
            Objects.equals(this.thresholdValue, timeAndDateSubCondition.thresholdValue) &&
            Objects.equals(this.range, timeAndDateSubCondition.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator, inverted, includeYear, thresholdValue, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeAndDateSubCondition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    includeYear: ").append(toIndentedString(includeYear)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

