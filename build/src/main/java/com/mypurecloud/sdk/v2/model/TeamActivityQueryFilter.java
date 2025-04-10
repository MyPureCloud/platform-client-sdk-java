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
import com.mypurecloud.sdk.v2.model.TeamActivityQueryClause;
import com.mypurecloud.sdk.v2.model.TeamActivityQueryPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TeamActivityQueryFilter
 */

public class TeamActivityQueryFilter  implements Serializable {
  

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
  private List<TeamActivityQueryClause> clauses = null;
  private List<TeamActivityQueryPredicate> predicates = null;

  public TeamActivityQueryFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      clauses = new ArrayList<TeamActivityQueryClause>();
      predicates = new ArrayList<TeamActivityQueryPredicate>();
    }
  }

  
  /**
   * Boolean operation to apply to the provided predicates and clauses
   **/
  public TeamActivityQueryFilter type(TypeEnum type) {
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
  public TeamActivityQueryFilter clauses(List<TeamActivityQueryClause> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean 'and/or' logic with up to two-levels of nesting")
  @JsonProperty("clauses")
  public List<TeamActivityQueryClause> getClauses() {
    return clauses;
  }
  public void setClauses(List<TeamActivityQueryClause> clauses) {
    this.clauses = clauses;
  }


  /**
   * Like a three-word sentence: (attribute-name) (operator) (target-value).
   **/
  public TeamActivityQueryFilter predicates(List<TeamActivityQueryPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Like a three-word sentence: (attribute-name) (operator) (target-value).")
  @JsonProperty("predicates")
  public List<TeamActivityQueryPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<TeamActivityQueryPredicate> predicates) {
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
    TeamActivityQueryFilter teamActivityQueryFilter = (TeamActivityQueryFilter) o;

    return Objects.equals(this.type, teamActivityQueryFilter.type) &&
            Objects.equals(this.clauses, teamActivityQueryFilter.clauses) &&
            Objects.equals(this.predicates, teamActivityQueryFilter.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, clauses, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamActivityQueryFilter {\n");
    
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

