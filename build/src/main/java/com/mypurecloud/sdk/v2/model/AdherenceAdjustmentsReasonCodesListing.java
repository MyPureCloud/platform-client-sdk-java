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
import com.mypurecloud.sdk.v2.model.AdherenceAdjustmentsReasonCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdherenceAdjustmentsReasonCodesListing
 */

public class AdherenceAdjustmentsReasonCodesListing  implements Serializable {
  
  private List<AdherenceAdjustmentsReasonCode> entities = null;

  public AdherenceAdjustmentsReasonCodesListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<AdherenceAdjustmentsReasonCode>();
    }
  }

  public AdherenceAdjustmentsReasonCodesListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<AdherenceAdjustmentsReasonCode>();
    }
  }

  
  /**
   **/
  public AdherenceAdjustmentsReasonCodesListing entities(List<AdherenceAdjustmentsReasonCode> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<AdherenceAdjustmentsReasonCode> getEntities() {
    return entities;
  }
  public void setEntities(List<AdherenceAdjustmentsReasonCode> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdherenceAdjustmentsReasonCodesListing adherenceAdjustmentsReasonCodesListing = (AdherenceAdjustmentsReasonCodesListing) o;

    return Objects.equals(this.entities, adherenceAdjustmentsReasonCodesListing.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdherenceAdjustmentsReasonCodesListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

