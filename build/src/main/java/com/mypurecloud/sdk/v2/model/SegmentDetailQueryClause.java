package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.SegmentDetailQueryPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SegmentDetailQueryClause
 */

public class SegmentDetailQueryClause  implements Serializable {
  

  /**
   * Boolean operation to apply to the provided predicates
   */
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
  private List<SegmentDetailQueryPredicate> predicates = new ArrayList<SegmentDetailQueryPredicate>();

  
  /**
   * Boolean operation to apply to the provided predicates
   **/
  public SegmentDetailQueryClause type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean operation to apply to the provided predicates")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Like a three-word sentence: (attribute-name) (operator) (target-value).
   **/
  public SegmentDetailQueryClause predicates(List<SegmentDetailQueryPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Like a three-word sentence: (attribute-name) (operator) (target-value).")
  @JsonProperty("predicates")
  public List<SegmentDetailQueryPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<SegmentDetailQueryPredicate> predicates) {
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
    SegmentDetailQueryClause segmentDetailQueryClause = (SegmentDetailQueryClause) o;
    return Objects.equals(this.type, segmentDetailQueryClause.type) &&
        Objects.equals(this.predicates, segmentDetailQueryClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDetailQueryClause {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

