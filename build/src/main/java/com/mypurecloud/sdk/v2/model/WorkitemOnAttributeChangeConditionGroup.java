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
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemOnAttributeChangeConditionGroup
 */

public class WorkitemOnAttributeChangeConditionGroup  implements Serializable {
  

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
   * How the conditions in this group are combined.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And"),
    OR("Or");

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
  private List<WorkitemOnAttributeChangeCondition> conditions = null;

  public WorkitemOnAttributeChangeConditionGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditions = new ArrayList<WorkitemOnAttributeChangeCondition>();
    }
  }

  public WorkitemOnAttributeChangeConditionGroup(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      conditions = new ArrayList<WorkitemOnAttributeChangeCondition>();
    }
  }

  
  /**
   * How the conditions in this group are combined.
   **/
  public WorkitemOnAttributeChangeConditionGroup operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How the conditions in this group are combined.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The conditions to evaluate. Between 1 and 5 conditions are permitted per group.
   **/
  public WorkitemOnAttributeChangeConditionGroup conditions(List<WorkitemOnAttributeChangeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conditions to evaluate. Between 1 and 5 conditions are permitted per group.")
  @JsonProperty("conditions")
  public List<WorkitemOnAttributeChangeCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<WorkitemOnAttributeChangeCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemOnAttributeChangeConditionGroup workitemOnAttributeChangeConditionGroup = (WorkitemOnAttributeChangeConditionGroup) o;

    return Objects.equals(this.operator, workitemOnAttributeChangeConditionGroup.operator) &&
            Objects.equals(this.conditions, workitemOnAttributeChangeConditionGroup.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOnAttributeChangeConditionGroup {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

