package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroup;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List of service goal groups
 */
@ApiModel(description = "List of service goal groups")

public class ServiceGoalGroupList  implements Serializable {
  
  private List<ServiceGoalGroup> entities = new ArrayList<ServiceGoalGroup>();
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   **/
  public ServiceGoalGroupList entities(List<ServiceGoalGroup> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ServiceGoalGroup> getEntities() {
    return entities;
  }
  public void setEntities(List<ServiceGoalGroup> entities) {
    this.entities = entities;
  }

  
  /**
   * Version metadata for the list of service goal groups for the associated management unit
   **/
  public ServiceGoalGroupList metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for the list of service goal groups for the associated management unit")
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
    ServiceGoalGroupList serviceGoalGroupList = (ServiceGoalGroupList) o;
    return Objects.equals(this.entities, serviceGoalGroupList.entities) &&
        Objects.equals(this.metadata, serviceGoalGroupList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGoalGroupList {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

