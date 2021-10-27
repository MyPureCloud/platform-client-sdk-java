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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyWebActionEventsNotificationActionMapPageUrlCondition
 */

public class JourneyWebActionEventsNotificationActionMapPageUrlCondition  implements Serializable {
  
  private List<String> values = new ArrayList<String>();

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
   * Gets or Sets operator
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    EQUAL("equal"),
    NOTEQUAL("notEqual"),
    LIKE("like"),
    NOTLIKE("notLike"),
    GREATERTHAN("greaterThan"),
    GREATERTHANOREQUAL("greaterThanOrEqual"),
    LESSTHAN("lessThan"),
    LESSTHANOREQUAL("lessThanOrEqual"),
    STARTSWITH("startsWith"),
    ENDSWITH("endsWith"),
    CONTAINSANY("containsAny"),
    NOTCONTAINSANY("notContainsAny"),
    CONTAINSALL("containsAll"),
    NOTCONTAINSAL("notContainsAl");

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
   **/
  public JourneyWebActionEventsNotificationActionMapPageUrlCondition values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationActionMapPageUrlCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    JourneyWebActionEventsNotificationActionMapPageUrlCondition journeyWebActionEventsNotificationActionMapPageUrlCondition = (JourneyWebActionEventsNotificationActionMapPageUrlCondition) o;
    return Objects.equals(this.values, journeyWebActionEventsNotificationActionMapPageUrlCondition.values) &&
        Objects.equals(this.operator, journeyWebActionEventsNotificationActionMapPageUrlCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebActionEventsNotificationActionMapPageUrlCondition {\n");
    
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

