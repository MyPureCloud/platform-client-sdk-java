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
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeConditionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemOnAttributeChangeMatch
 */

public class WorkitemOnAttributeChangeMatch  implements Serializable {
  

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
   * How the results of the groups are combined. The conditions within each group are combined separately, by that group's own operator.
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
  private List<WorkitemOnAttributeChangeConditionGroup> groups = null;

  public WorkitemOnAttributeChangeMatch() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      groups = new ArrayList<WorkitemOnAttributeChangeConditionGroup>();
    }
  }

  public WorkitemOnAttributeChangeMatch(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      groups = new ArrayList<WorkitemOnAttributeChangeConditionGroup>();
    }
  }

  
  /**
   * How the results of the groups are combined. The conditions within each group are combined separately, by that group's own operator.
   **/
  public WorkitemOnAttributeChangeMatch operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How the results of the groups are combined. The conditions within each group are combined separately, by that group's own operator.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The groups to evaluate. Between 1 and 5 groups are permitted.
   **/
  public WorkitemOnAttributeChangeMatch groups(List<WorkitemOnAttributeChangeConditionGroup> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The groups to evaluate. Between 1 and 5 groups are permitted.")
  @JsonProperty("groups")
  public List<WorkitemOnAttributeChangeConditionGroup> getGroups() {
    return groups;
  }
  public void setGroups(List<WorkitemOnAttributeChangeConditionGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemOnAttributeChangeMatch workitemOnAttributeChangeMatch = (WorkitemOnAttributeChangeMatch) o;

    return Objects.equals(this.operator, workitemOnAttributeChangeMatch.operator) &&
            Objects.equals(this.groups, workitemOnAttributeChangeMatch.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOnAttributeChangeMatch {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

