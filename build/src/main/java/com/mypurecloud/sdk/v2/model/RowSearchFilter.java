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
import com.mypurecloud.sdk.v2.model.RowSearchPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RowSearchFilter
 */

public class RowSearchFilter  implements Serializable {
  
  private List<RowSearchPredicate> predicates = null;

  public RowSearchFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      predicates = new ArrayList<RowSearchPredicate>();
    }
  }

  
  /**
   * The predicates that each row matches in the search results must match
   **/
  public RowSearchFilter predicates(List<RowSearchPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The predicates that each row matches in the search results must match")
  @JsonProperty("predicates")
  public List<RowSearchPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<RowSearchPredicate> predicates) {
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
    RowSearchFilter rowSearchFilter = (RowSearchFilter) o;

    return Objects.equals(this.predicates, rowSearchFilter.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowSearchFilter {\n");
    
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

