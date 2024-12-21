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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentStateAgentQueryPredicate
 */

public class AgentStateAgentQueryPredicate  implements Serializable {
  

  private static class DimensionEnumDeserializer extends StdDeserializer<DimensionEnum> {
    public DimensionEnumDeserializer() {
      super(DimensionEnumDeserializer.class);
    }

    @Override
    public DimensionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DimensionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Left hand side for dimension predicates
   */
 @JsonDeserialize(using = DimensionEnumDeserializer.class)
  public enum DimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVEQUEUEID("activeQueueId"),
    ASSIGNEDSKILLID("assignedSkillId"),
    ASSIGNEDLANGUAGEID("assignedLanguageId"),
    DIVISIONID("divisionId"),
    USERID("userId"),
    MANAGERID("managerId");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DimensionEnum fromString(String key) {
      if (key == null) return null;

      for (DimensionEnum value : DimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DimensionEnum dimension = null;
  private String value = null;

  
  /**
   * Left hand side for dimension predicates
   **/
  public AgentStateAgentQueryPredicate dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Left hand side for dimension predicates")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }


  /**
   * Right hand side for dimension predicates
   **/
  public AgentStateAgentQueryPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Right hand side for dimension predicates")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
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
    AgentStateAgentQueryPredicate agentStateAgentQueryPredicate = (AgentStateAgentQueryPredicate) o;

    return Objects.equals(this.dimension, agentStateAgentQueryPredicate.dimension) &&
            Objects.equals(this.value, agentStateAgentQueryPredicate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateAgentQueryPredicate {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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

