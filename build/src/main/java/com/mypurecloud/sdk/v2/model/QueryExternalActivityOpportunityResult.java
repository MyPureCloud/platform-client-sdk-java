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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueryExternalActivityOpportunityResult
 */

public class QueryExternalActivityOpportunityResult  implements Serializable {
  
  private String id = null;
  private String opportunityName = null;

  public QueryExternalActivityOpportunityResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryExternalActivityOpportunityResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the opportunity associated with this external activity
   **/
  public QueryExternalActivityOpportunityResult opportunityName(String opportunityName) {
    this.opportunityName = opportunityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the opportunity associated with this external activity")
  @JsonProperty("opportunityName")
  public String getOpportunityName() {
    return opportunityName;
  }
  public void setOpportunityName(String opportunityName) {
    this.opportunityName = opportunityName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryExternalActivityOpportunityResult queryExternalActivityOpportunityResult = (QueryExternalActivityOpportunityResult) o;

    return Objects.equals(this.id, queryExternalActivityOpportunityResult.id) &&
            Objects.equals(this.opportunityName, queryExternalActivityOpportunityResult.opportunityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, opportunityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryExternalActivityOpportunityResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    opportunityName: ").append(toIndentedString(opportunityName)).append("\n");
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

