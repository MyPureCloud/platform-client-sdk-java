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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentStructuredOutputConditionGroupAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgenticVirtualAgentStructuredOutputConditionGroup
 */

public class AgenticVirtualAgentStructuredOutputConditionGroup  implements Serializable {
  

  private static class GroupEnumDeserializer extends StdDeserializer<GroupEnum> {
    public GroupEnumDeserializer() {
      super(GroupEnumDeserializer.class);
    }

    @Override
    public GroupEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GroupEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Logical operator used to combine the rules in this group.
   */
 @JsonDeserialize(using = GroupEnumDeserializer.class)
  public enum GroupEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And"),
    OR("Or");

    private String value;

    GroupEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupEnum fromString(String key) {
      if (key == null) return null;

      for (GroupEnum value : GroupEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GroupEnum group = null;
  private List<Object> rules = null;

  public AgenticVirtualAgentStructuredOutputConditionGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rules = new ArrayList<Object>();
    }
  }

  public AgenticVirtualAgentStructuredOutputConditionGroup(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      rules = new ArrayList<Object>();
    }
  }

  
  /**
   * Logical operator used to combine the rules in this group.
   **/
  public AgenticVirtualAgentStructuredOutputConditionGroup group(GroupEnum group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Logical operator used to combine the rules in this group.")
  @JsonProperty("group")
  public GroupEnum getGroup() {
    return group;
  }
  public void setGroup(GroupEnum group) {
    this.group = group;
  }


  /**
   * Structured output rules or nested condition groups in this group.
   **/
  public AgenticVirtualAgentStructuredOutputConditionGroup rules(List<Object> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Structured output rules or nested condition groups in this group.")
  @JsonProperty("rules")
  public List<Object> getRules() {
    return rules;
  }
  public void setRules(List<Object> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentStructuredOutputConditionGroup agenticVirtualAgentStructuredOutputConditionGroup = (AgenticVirtualAgentStructuredOutputConditionGroup) o;

    return Objects.equals(this.group, agenticVirtualAgentStructuredOutputConditionGroup.group) &&
            Objects.equals(this.rules, agenticVirtualAgentStructuredOutputConditionGroup.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentStructuredOutputConditionGroup {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

