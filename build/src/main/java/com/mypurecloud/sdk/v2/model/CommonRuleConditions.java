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
import com.mypurecloud.sdk.v2.model.CommonRulePredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CommonRuleConditions
 */

public class CommonRuleConditions  implements Serializable {
  
  private List<CommonRuleConditions> clauses = new ArrayList<CommonRuleConditions>();
  private List<CommonRulePredicate> predicates = new ArrayList<CommonRulePredicate>();

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * the logic operator performed.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And"),
    OR("Or"),
    NOT("Not");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String id = null;

  
  /**
   * The list of predicates groups to be evaluated
   **/
  public CommonRuleConditions clauses(List<CommonRuleConditions> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of predicates groups to be evaluated")
  @JsonProperty("clauses")
  public List<CommonRuleConditions> getClauses() {
    return clauses;
  }
  public void setClauses(List<CommonRuleConditions> clauses) {
    this.clauses = clauses;
  }


  /**
   * The list of rule metric predicates to be evaluated.
   **/
  public CommonRuleConditions predicates(List<CommonRulePredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of rule metric predicates to be evaluated.")
  @JsonProperty("predicates")
  public List<CommonRulePredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<CommonRulePredicate> predicates) {
    this.predicates = predicates;
  }


  /**
   * the logic operator performed.
   **/
  public CommonRuleConditions type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the logic operator performed.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The id.
   **/
  public CommonRuleConditions id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonRuleConditions commonRuleConditions = (CommonRuleConditions) o;

    return Objects.equals(this.clauses, commonRuleConditions.clauses) &&
            Objects.equals(this.predicates, commonRuleConditions.predicates) &&
            Objects.equals(this.type, commonRuleConditions.type) &&
            Objects.equals(this.id, commonRuleConditions.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, predicates, type, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonRuleConditions {\n");
    
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

