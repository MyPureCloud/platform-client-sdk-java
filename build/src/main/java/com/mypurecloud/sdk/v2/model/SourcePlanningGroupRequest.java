package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SourcePlanningGroupRequest
 */

public class SourcePlanningGroupRequest  implements Serializable {
  
  private String id = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The ID of the planning group
   **/
  public SourcePlanningGroupRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Version metadata for the planning group
   **/
  public SourcePlanningGroupRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the planning group")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourcePlanningGroupRequest sourcePlanningGroupRequest = (SourcePlanningGroupRequest) o;
    return Objects.equals(this.id, sourcePlanningGroupRequest.id) &&
        Objects.equals(this.metadata, sourcePlanningGroupRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourcePlanningGroupRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

