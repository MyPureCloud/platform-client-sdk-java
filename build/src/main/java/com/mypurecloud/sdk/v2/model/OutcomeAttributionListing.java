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
import com.mypurecloud.sdk.v2.model.OutcomeAttributionRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OutcomeAttributionListing
 */

public class OutcomeAttributionListing  implements Serializable {
  
  private List<OutcomeAttributionRequest> entities = null;
  private Integer percentFailedThreshold = null;

  public OutcomeAttributionListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<OutcomeAttributionRequest>();
    }
  }

  
  /**
   **/
  public OutcomeAttributionListing entities(List<OutcomeAttributionRequest> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("entities")
  public List<OutcomeAttributionRequest> getEntities() {
    return entities;
  }
  public void setEntities(List<OutcomeAttributionRequest> entities) {
    this.entities = entities;
  }


  /**
   * Optional percent failed threshold for validation errors; if reached will halt the job. Default is 5 percent, allowed values 0 to 100.
   **/
  public OutcomeAttributionListing percentFailedThreshold(Integer percentFailedThreshold) {
    this.percentFailedThreshold = percentFailedThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional percent failed threshold for validation errors; if reached will halt the job. Default is 5 percent, allowed values 0 to 100.")
  @JsonProperty("percentFailedThreshold")
  public Integer getPercentFailedThreshold() {
    return percentFailedThreshold;
  }
  public void setPercentFailedThreshold(Integer percentFailedThreshold) {
    this.percentFailedThreshold = percentFailedThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeAttributionListing outcomeAttributionListing = (OutcomeAttributionListing) o;

    return Objects.equals(this.entities, outcomeAttributionListing.entities) &&
            Objects.equals(this.percentFailedThreshold, outcomeAttributionListing.percentFailedThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, percentFailedThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAttributionListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    percentFailedThreshold: ").append(toIndentedString(percentFailedThreshold)).append("\n");
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

