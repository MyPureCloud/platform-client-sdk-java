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
import com.mypurecloud.sdk.v2.model.ConditionalGroupActivationSimpleMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConditionalGroupActivationCondition
 */

public class ConditionalGroupActivationCondition  implements Serializable {
  
  private ConditionalGroupActivationSimpleMetric simpleMetric = null;

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
   * The operator used to compare the actual value against the threshold value
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUALTO("GreaterThanOrEqualTo"),
    LESSTHAN("LessThan"),
    LESSTHANOREQUALTO("LessThanOrEqualTo");

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
  private Double value = null;

  public ConditionalGroupActivationCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Instructs this condition to evaluate a simple queue-level metric
   **/
  public ConditionalGroupActivationCondition simpleMetric(ConditionalGroupActivationSimpleMetric simpleMetric) {
    this.simpleMetric = simpleMetric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Instructs this condition to evaluate a simple queue-level metric")
  @JsonProperty("simpleMetric")
  public ConditionalGroupActivationSimpleMetric getSimpleMetric() {
    return simpleMetric;
  }
  public void setSimpleMetric(ConditionalGroupActivationSimpleMetric simpleMetric) {
    this.simpleMetric = simpleMetric;
  }


  /**
   * The operator used to compare the actual value against the threshold value
   **/
  public ConditionalGroupActivationCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator used to compare the actual value against the threshold value")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The threshold value, beyond which a rule evaluates as true
   **/
  public ConditionalGroupActivationCondition value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The threshold value, beyond which a rule evaluates as true")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
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
    ConditionalGroupActivationCondition conditionalGroupActivationCondition = (ConditionalGroupActivationCondition) o;

    return Objects.equals(this.simpleMetric, conditionalGroupActivationCondition.simpleMetric) &&
            Objects.equals(this.operator, conditionalGroupActivationCondition.operator) &&
            Objects.equals(this.value, conditionalGroupActivationCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simpleMetric, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupActivationCondition {\n");
    
    sb.append("    simpleMetric: ").append(toIndentedString(simpleMetric)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

