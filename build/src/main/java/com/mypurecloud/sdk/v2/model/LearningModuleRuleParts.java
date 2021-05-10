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
 * LearningModuleRuleParts
 */

public class LearningModuleRuleParts  implements Serializable {
  

  private static class OperationEnumDeserializer extends StdDeserializer<OperationEnum> {
    public OperationEnumDeserializer() {
      super(OperationEnumDeserializer.class);
    }

    @Override
    public OperationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The learning module rule operation
   */
 @JsonDeserialize(using = OperationEnumDeserializer.class)
  public enum OperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCLUDE("Include"),
    EXCLUDE("Exclude");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperationEnum fromString(String key) {
      if (key == null) return null;

      for (OperationEnum value : OperationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperationEnum operation = null;

  private static class SelectorEnumDeserializer extends StdDeserializer<SelectorEnum> {
    public SelectorEnumDeserializer() {
      super(SelectorEnumDeserializer.class);
    }

    @Override
    public SelectorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SelectorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The learning module rule selector
   */
 @JsonDeserialize(using = SelectorEnumDeserializer.class)
  public enum SelectorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACDSKILLS("AcdSkills"),
    AGENTNAME("AgentName"),
    DIVISION("Division"),
    GROUP("Group"),
    LOCATION("Location"),
    QUEUE("Queue"),
    ROLE("Role"),
    TEAM("Team");

    private String value;

    SelectorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SelectorEnum fromString(String key) {
      if (key == null) return null;

      for (SelectorEnum value : SelectorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SelectorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SelectorEnum selector = null;
  private List<String> value = new ArrayList<String>();
  private Integer order = null;

  
  /**
   * The learning module rule operation
   **/
  public LearningModuleRuleParts operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The learning module rule operation")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  
  /**
   * The learning module rule selector
   **/
  public LearningModuleRuleParts selector(SelectorEnum selector) {
    this.selector = selector;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The learning module rule selector")
  @JsonProperty("selector")
  public SelectorEnum getSelector() {
    return selector;
  }
  public void setSelector(SelectorEnum selector) {
    this.selector = selector;
  }

  
  /**
   * The value of rules
   **/
  public LearningModuleRuleParts value(List<String> value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of rules")
  @JsonProperty("value")
  public List<String> getValue() {
    return value;
  }
  public void setValue(List<String> value) {
    this.value = value;
  }

  
  /**
   * The order of rules in learning module rule
   **/
  public LearningModuleRuleParts order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The order of rules in learning module rule")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleRuleParts learningModuleRuleParts = (LearningModuleRuleParts) o;
    return Objects.equals(this.operation, learningModuleRuleParts.operation) &&
        Objects.equals(this.selector, learningModuleRuleParts.selector) &&
        Objects.equals(this.value, learningModuleRuleParts.value) &&
        Objects.equals(this.order, learningModuleRuleParts.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, selector, value, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleRuleParts {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

