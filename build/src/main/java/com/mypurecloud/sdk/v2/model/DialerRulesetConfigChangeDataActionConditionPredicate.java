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
 * DialerRulesetConfigChangeDataActionConditionPredicate
 */

public class DialerRulesetConfigChangeDataActionConditionPredicate  implements Serializable {
  
  private String outputField = null;

  private static class OutputOperatorEnumDeserializer extends StdDeserializer<OutputOperatorEnum> {
    public OutputOperatorEnumDeserializer() {
      super(OutputOperatorEnumDeserializer.class);
    }

    @Override
    public OutputOperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OutputOperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets outputOperator
   */
 @JsonDeserialize(using = OutputOperatorEnumDeserializer.class)
  public enum OutputOperatorEnum {
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
    AFTER("AFTER");

    private String value;

    OutputOperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OutputOperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OutputOperatorEnum value : OutputOperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OutputOperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OutputOperatorEnum outputOperator = null;
  private String comparisonValue = null;
  private Boolean outputFieldMissingResolution = null;
  private Boolean inverted = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerRulesetConfigChangeDataActionConditionPredicate outputField(String outputField) {
    this.outputField = outputField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outputField")
  public String getOutputField() {
    return outputField;
  }
  public void setOutputField(String outputField) {
    this.outputField = outputField;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeDataActionConditionPredicate outputOperator(OutputOperatorEnum outputOperator) {
    this.outputOperator = outputOperator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outputOperator")
  public OutputOperatorEnum getOutputOperator() {
    return outputOperator;
  }
  public void setOutputOperator(OutputOperatorEnum outputOperator) {
    this.outputOperator = outputOperator;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeDataActionConditionPredicate comparisonValue(String comparisonValue) {
    this.comparisonValue = comparisonValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comparisonValue")
  public String getComparisonValue() {
    return comparisonValue;
  }
  public void setComparisonValue(String comparisonValue) {
    this.comparisonValue = comparisonValue;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeDataActionConditionPredicate outputFieldMissingResolution(Boolean outputFieldMissingResolution) {
    this.outputFieldMissingResolution = outputFieldMissingResolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outputFieldMissingResolution")
  public Boolean getOutputFieldMissingResolution() {
    return outputFieldMissingResolution;
  }
  public void setOutputFieldMissingResolution(Boolean outputFieldMissingResolution) {
    this.outputFieldMissingResolution = outputFieldMissingResolution;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeDataActionConditionPredicate inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeDataActionConditionPredicate additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerRulesetConfigChangeDataActionConditionPredicate dialerRulesetConfigChangeDataActionConditionPredicate = (DialerRulesetConfigChangeDataActionConditionPredicate) o;
    return Objects.equals(this.outputField, dialerRulesetConfigChangeDataActionConditionPredicate.outputField) &&
        Objects.equals(this.outputOperator, dialerRulesetConfigChangeDataActionConditionPredicate.outputOperator) &&
        Objects.equals(this.comparisonValue, dialerRulesetConfigChangeDataActionConditionPredicate.comparisonValue) &&
        Objects.equals(this.outputFieldMissingResolution, dialerRulesetConfigChangeDataActionConditionPredicate.outputFieldMissingResolution) &&
        Objects.equals(this.inverted, dialerRulesetConfigChangeDataActionConditionPredicate.inverted) &&
        Objects.equals(this.additionalProperties, dialerRulesetConfigChangeDataActionConditionPredicate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputField, outputOperator, comparisonValue, outputFieldMissingResolution, inverted, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeDataActionConditionPredicate {\n");
    
    sb.append("    outputField: ").append(toIndentedString(outputField)).append("\n");
    sb.append("    outputOperator: ").append(toIndentedString(outputOperator)).append("\n");
    sb.append("    comparisonValue: ").append(toIndentedString(comparisonValue)).append("\n");
    sb.append("    outputFieldMissingResolution: ").append(toIndentedString(outputFieldMissingResolution)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

