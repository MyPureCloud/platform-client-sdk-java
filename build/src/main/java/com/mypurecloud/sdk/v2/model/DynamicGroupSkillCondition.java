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
import com.mypurecloud.sdk.v2.model.DynamicGroupLanguageSkillCondition;
import com.mypurecloud.sdk.v2.model.DynamicGroupRoutingSkillCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DynamicGroupSkillCondition
 */

public class DynamicGroupSkillCondition  implements Serializable {
  
  private List<DynamicGroupRoutingSkillCondition> routingSkillConditions = null;
  private List<DynamicGroupLanguageSkillCondition> languageSkillConditions = null;

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
   * Operator that will be applied to the conditions
   */
 @JsonDeserialize(using = OperationEnumDeserializer.class)
  public enum OperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And"),
    NOT("Not"),
    OR("Or");

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

  public DynamicGroupSkillCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      routingSkillConditions = new ArrayList<DynamicGroupRoutingSkillCondition>();
      languageSkillConditions = new ArrayList<DynamicGroupLanguageSkillCondition>();
    }
  }

  
  /**
   * Routing skill conditions that will be used for building the query
   **/
  public DynamicGroupSkillCondition routingSkillConditions(List<DynamicGroupRoutingSkillCondition> routingSkillConditions) {
    this.routingSkillConditions = routingSkillConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Routing skill conditions that will be used for building the query")
  @JsonProperty("routingSkillConditions")
  public List<DynamicGroupRoutingSkillCondition> getRoutingSkillConditions() {
    return routingSkillConditions;
  }
  public void setRoutingSkillConditions(List<DynamicGroupRoutingSkillCondition> routingSkillConditions) {
    this.routingSkillConditions = routingSkillConditions;
  }


  /**
   * Routing skill conditions that will be used for building the query
   **/
  public DynamicGroupSkillCondition languageSkillConditions(List<DynamicGroupLanguageSkillCondition> languageSkillConditions) {
    this.languageSkillConditions = languageSkillConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Routing skill conditions that will be used for building the query")
  @JsonProperty("languageSkillConditions")
  public List<DynamicGroupLanguageSkillCondition> getLanguageSkillConditions() {
    return languageSkillConditions;
  }
  public void setLanguageSkillConditions(List<DynamicGroupLanguageSkillCondition> languageSkillConditions) {
    this.languageSkillConditions = languageSkillConditions;
  }


  /**
   * Operator that will be applied to the conditions
   **/
  public DynamicGroupSkillCondition operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operator that will be applied to the conditions")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicGroupSkillCondition dynamicGroupSkillCondition = (DynamicGroupSkillCondition) o;

    return Objects.equals(this.routingSkillConditions, dynamicGroupSkillCondition.routingSkillConditions) &&
            Objects.equals(this.languageSkillConditions, dynamicGroupSkillCondition.languageSkillConditions) &&
            Objects.equals(this.operation, dynamicGroupSkillCondition.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingSkillConditions, languageSkillConditions, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicGroupSkillCondition {\n");
    
    sb.append("    routingSkillConditions: ").append(toIndentedString(routingSkillConditions)).append("\n");
    sb.append("    languageSkillConditions: ").append(toIndentedString(languageSkillConditions)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

