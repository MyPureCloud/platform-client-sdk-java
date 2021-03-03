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
import com.mypurecloud.sdk.v2.model.ResolutionDetailQueryClause;
import com.mypurecloud.sdk.v2.model.ResolutionDetailQueryPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ResolutionDetailQueryFilter
 */

public class ResolutionDetailQueryFilter  implements Serializable {
  

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
   * Boolean operation to apply to the provided predicates and clauses
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("and"),
    OR("or");

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
  private List<ResolutionDetailQueryClause> clauses = new ArrayList<ResolutionDetailQueryClause>();
  private List<ResolutionDetailQueryPredicate> predicates = new ArrayList<ResolutionDetailQueryPredicate>();

  
  /**
   * Boolean operation to apply to the provided predicates and clauses
   **/
  public ResolutionDetailQueryFilter type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean operation to apply to the provided predicates and clauses")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Boolean 'and/or' logic with up to two-levels of nesting
   **/
  public ResolutionDetailQueryFilter clauses(List<ResolutionDetailQueryClause> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean 'and/or' logic with up to two-levels of nesting")
  @JsonProperty("clauses")
  public List<ResolutionDetailQueryClause> getClauses() {
    return clauses;
  }
  public void setClauses(List<ResolutionDetailQueryClause> clauses) {
    this.clauses = clauses;
  }

  
  /**
   * Like a three-word sentence: (attribute-name) (operator) (target-value).
   **/
  public ResolutionDetailQueryFilter predicates(List<ResolutionDetailQueryPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Like a three-word sentence: (attribute-name) (operator) (target-value).")
  @JsonProperty("predicates")
  public List<ResolutionDetailQueryPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<ResolutionDetailQueryPredicate> predicates) {
    this.predicates = predicates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolutionDetailQueryFilter resolutionDetailQueryFilter = (ResolutionDetailQueryFilter) o;
    return Objects.equals(this.type, resolutionDetailQueryFilter.type) &&
        Objects.equals(this.clauses, resolutionDetailQueryFilter.clauses) &&
        Objects.equals(this.predicates, resolutionDetailQueryFilter.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, clauses, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolutionDetailQueryFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

