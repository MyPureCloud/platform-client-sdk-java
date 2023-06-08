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
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OrganizationPresenceDefinitionEntityListing
 */

public class OrganizationPresenceDefinitionEntityListing  implements Serializable {
  
  private Long total = null;
  private List<OrganizationPresenceDefinition> entities = new ArrayList<OrganizationPresenceDefinition>();
  private String selfUri = null;

  
  /**
   **/
  public OrganizationPresenceDefinitionEntityListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   **/
  public OrganizationPresenceDefinitionEntityListing entities(List<OrganizationPresenceDefinition> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<OrganizationPresenceDefinition> getEntities() {
    return entities;
  }
  public void setEntities(List<OrganizationPresenceDefinition> entities) {
    this.entities = entities;
  }


  /**
   **/
  public OrganizationPresenceDefinitionEntityListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPresenceDefinitionEntityListing organizationPresenceDefinitionEntityListing = (OrganizationPresenceDefinitionEntityListing) o;

    return Objects.equals(this.total, organizationPresenceDefinitionEntityListing.total) &&
            Objects.equals(this.entities, organizationPresenceDefinitionEntityListing.entities) &&
            Objects.equals(this.selfUri, organizationPresenceDefinitionEntityListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPresenceDefinitionEntityListing {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

