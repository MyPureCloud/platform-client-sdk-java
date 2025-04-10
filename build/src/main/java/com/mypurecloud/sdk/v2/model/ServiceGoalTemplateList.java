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
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ServiceGoalTemplateList
 */

public class ServiceGoalTemplateList  implements Serializable {
  
  private List<ServiceGoalTemplate> entities = null;
  private WfmVersionedEntityMetadata metadata = null;

  public ServiceGoalTemplateList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ServiceGoalTemplate>();
    }
  }

  
  /**
   **/
  public ServiceGoalTemplateList entities(List<ServiceGoalTemplate> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ServiceGoalTemplate> getEntities() {
    return entities;
  }
  public void setEntities(List<ServiceGoalTemplate> entities) {
    this.entities = entities;
  }


  /**
   * Version metadata for the service goal templates
   **/
  public ServiceGoalTemplateList metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for the service goal templates")
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
    ServiceGoalTemplateList serviceGoalTemplateList = (ServiceGoalTemplateList) o;

    return Objects.equals(this.entities, serviceGoalTemplateList.entities) &&
            Objects.equals(this.metadata, serviceGoalTemplateList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGoalTemplateList {\n");
    
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

