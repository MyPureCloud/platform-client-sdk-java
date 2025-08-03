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
import com.mypurecloud.sdk.v2.model.CapacityPlanMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * CapacityPlanListItem
 */

public class CapacityPlanListItem  implements Serializable {
  
  private String id = null;
  private String name = null;
  private LocalDate startBusinessUnitDate = null;
  private LocalDate endBusinessUnitDate = null;
  private CapacityPlanMetadata metadata = null;
  private String selfUri = null;

  public CapacityPlanListItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CapacityPlanListItem name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanListItem startBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startBusinessUnitDate")
  public LocalDate getStartBusinessUnitDate() {
    return startBusinessUnitDate;
  }
  public void setStartBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
  }


  /**
   * The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanListItem endBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endBusinessUnitDate")
  public LocalDate getEndBusinessUnitDate() {
    return endBusinessUnitDate;
  }
  public void setEndBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
  }


  /**
   * The metadata of this capacity plan
   **/
  public CapacityPlanListItem metadata(CapacityPlanMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata of this capacity plan")
  @JsonProperty("metadata")
  public CapacityPlanMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(CapacityPlanMetadata metadata) {
    this.metadata = metadata;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanListItem capacityPlanListItem = (CapacityPlanListItem) o;

    return Objects.equals(this.id, capacityPlanListItem.id) &&
            Objects.equals(this.name, capacityPlanListItem.name) &&
            Objects.equals(this.startBusinessUnitDate, capacityPlanListItem.startBusinessUnitDate) &&
            Objects.equals(this.endBusinessUnitDate, capacityPlanListItem.endBusinessUnitDate) &&
            Objects.equals(this.metadata, capacityPlanListItem.metadata) &&
            Objects.equals(this.selfUri, capacityPlanListItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startBusinessUnitDate, endBusinessUnitDate, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startBusinessUnitDate: ").append(toIndentedString(startBusinessUnitDate)).append("\n");
    sb.append("    endBusinessUnitDate: ").append(toIndentedString(endBusinessUnitDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

