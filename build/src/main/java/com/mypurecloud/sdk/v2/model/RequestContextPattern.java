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
import com.mypurecloud.sdk.v2.model.RequestEntityTypeCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RequestContextPattern
 */

public class RequestContextPattern  implements Serializable {
  
  private List<RequestEntityTypeCriteria> criteria = null;

  public RequestContextPattern() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      criteria = new ArrayList<RequestEntityTypeCriteria>();
    }
  }

  
  /**
   * A list of one or more criteria to satisfy.
   **/
  public RequestContextPattern criteria(List<RequestEntityTypeCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of one or more criteria to satisfy.")
  @JsonProperty("criteria")
  public List<RequestEntityTypeCriteria> getCriteria() {
    return criteria;
  }
  public void setCriteria(List<RequestEntityTypeCriteria> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestContextPattern requestContextPattern = (RequestContextPattern) o;

    return Objects.equals(this.criteria, requestContextPattern.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContextPattern {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

