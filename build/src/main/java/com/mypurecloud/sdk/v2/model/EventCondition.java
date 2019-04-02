package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EventCondition
 */

public class EventCondition  implements Serializable {
  
  private String key = null;
  private List<String> values = new ArrayList<String>();

  /**
   * The comparison operator.
   */
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUAL("equal"),
    NOTEQUAL("notEqual"),
    LIKE("like"),
    NOTLIKE("notLike"),
    GREATERTHAN("greaterThan"),
    GREATERTHANOREQUAL("greaterThanOrEqual"),
    LESSTHAN("lessThan"),
    LESSTHANOREQUAL("lessThanOrEqual");

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

  
  /**
   * The event key.
   **/
  public EventCondition key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event key.")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The event values.
   **/
  public EventCondition values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event values.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   * The comparison operator.
   **/
  public EventCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparison operator.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCondition eventCondition = (EventCondition) o;
    return Objects.equals(this.key, eventCondition.key) &&
        Objects.equals(this.values, eventCondition.values) &&
        Objects.equals(this.operator, eventCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCondition {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

