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
import com.mypurecloud.sdk.v2.model.ScheduleBidGroup;
import com.mypurecloud.sdk.v2.model.WorkPlanBidMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScheduleBidGroupResponse
 */

public class ScheduleBidGroupResponse  implements Serializable {
  
  private String id = null;
  private ScheduleBidGroup scheduleBidGroup = null;
  private WorkPlanBidMetadata metadata = null;
  private String selfUri = null;

  public ScheduleBidGroupResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleBidGroupResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ScheduleBidGroupResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The schedule bid group
   **/
  public ScheduleBidGroupResponse scheduleBidGroup(ScheduleBidGroup scheduleBidGroup) {
    this.scheduleBidGroup = scheduleBidGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule bid group")
  @JsonProperty("scheduleBidGroup")
  public ScheduleBidGroup getScheduleBidGroup() {
    return scheduleBidGroup;
  }
  public void setScheduleBidGroup(ScheduleBidGroup scheduleBidGroup) {
    this.scheduleBidGroup = scheduleBidGroup;
  }


  /**
   * The metadata of the bid group
   **/
  public ScheduleBidGroupResponse metadata(WorkPlanBidMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata of the bid group")
  @JsonProperty("metadata")
  public WorkPlanBidMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WorkPlanBidMetadata metadata) {
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
    ScheduleBidGroupResponse scheduleBidGroupResponse = (ScheduleBidGroupResponse) o;

    return Objects.equals(this.id, scheduleBidGroupResponse.id) &&
            Objects.equals(this.scheduleBidGroup, scheduleBidGroupResponse.scheduleBidGroup) &&
            Objects.equals(this.metadata, scheduleBidGroupResponse.metadata) &&
            Objects.equals(this.selfUri, scheduleBidGroupResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scheduleBidGroup, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidGroupResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scheduleBidGroup: ").append(toIndentedString(scheduleBidGroup)).append("\n");
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

