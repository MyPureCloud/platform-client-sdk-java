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
import com.mypurecloud.sdk.v2.model.V2MobiusRulesTopicConditionRulePredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2MobiusRulesTopicCondition
 */

public class V2MobiusRulesTopicCondition  implements Serializable {
  
  private String id = null;
  private List<V2MobiusRulesTopicCondition> clauses = null;
  private List<V2MobiusRulesTopicConditionRulePredicate> predicates = null;

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And"),
    OR("Or"),
    NOT("Not"),
    UNKNOWN("Unknown");

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

  public V2MobiusRulesTopicCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      clauses = new ArrayList<V2MobiusRulesTopicCondition>();
      predicates = new ArrayList<V2MobiusRulesTopicConditionRulePredicate>();
    }
  }

  
  /**
   **/
  public V2MobiusRulesTopicCondition id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public V2MobiusRulesTopicCondition clauses(List<V2MobiusRulesTopicCondition> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clauses")
  public List<V2MobiusRulesTopicCondition> getClauses() {
    return clauses;
  }
  public void setClauses(List<V2MobiusRulesTopicCondition> clauses) {
    this.clauses = clauses;
  }


  /**
   **/
  public V2MobiusRulesTopicCondition predicates(List<V2MobiusRulesTopicConditionRulePredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("predicates")
  public List<V2MobiusRulesTopicConditionRulePredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<V2MobiusRulesTopicConditionRulePredicate> predicates) {
    this.predicates = predicates;
  }


  /**
   **/
  public V2MobiusRulesTopicCondition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusRulesTopicCondition v2MobiusRulesTopicCondition = (V2MobiusRulesTopicCondition) o;

    return Objects.equals(this.id, v2MobiusRulesTopicCondition.id) &&
            Objects.equals(this.clauses, v2MobiusRulesTopicCondition.clauses) &&
            Objects.equals(this.predicates, v2MobiusRulesTopicCondition.predicates) &&
            Objects.equals(this.type, v2MobiusRulesTopicCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clauses, predicates, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicCondition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

