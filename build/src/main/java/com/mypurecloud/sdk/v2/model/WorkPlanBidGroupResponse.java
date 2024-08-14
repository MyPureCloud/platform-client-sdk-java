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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WorkPlanBidGroup;
import com.mypurecloud.sdk.v2.model.WorkPlanBidMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkPlanBidGroupResponse
 */

public class WorkPlanBidGroupResponse  implements Serializable {
  
  private String id = null;
  private WorkPlanBidGroup workPlanBidGroup = null;
  private WorkPlanBidMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The work plan bid group
   **/
  public WorkPlanBidGroupResponse workPlanBidGroup(WorkPlanBidGroup workPlanBidGroup) {
    this.workPlanBidGroup = workPlanBidGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan bid group")
  @JsonProperty("workPlanBidGroup")
  public WorkPlanBidGroup getWorkPlanBidGroup() {
    return workPlanBidGroup;
  }
  public void setWorkPlanBidGroup(WorkPlanBidGroup workPlanBidGroup) {
    this.workPlanBidGroup = workPlanBidGroup;
  }


  /**
   * The meta data of the bid group
   **/
  public WorkPlanBidGroupResponse metadata(WorkPlanBidMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The meta data of the bid group")
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
    WorkPlanBidGroupResponse workPlanBidGroupResponse = (WorkPlanBidGroupResponse) o;

    return Objects.equals(this.id, workPlanBidGroupResponse.id) &&
            Objects.equals(this.workPlanBidGroup, workPlanBidGroupResponse.workPlanBidGroup) &&
            Objects.equals(this.metadata, workPlanBidGroupResponse.metadata) &&
            Objects.equals(this.selfUri, workPlanBidGroupResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workPlanBidGroup, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidGroupResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workPlanBidGroup: ").append(toIndentedString(workPlanBidGroup)).append("\n");
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

