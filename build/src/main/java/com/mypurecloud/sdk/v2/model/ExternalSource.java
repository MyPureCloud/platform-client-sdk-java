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
import com.mypurecloud.sdk.v2.model.LinkConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExternalSource
 */

public class ExternalSource  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean active = null;
  private LinkConfiguration linkConfiguration = null;
  private String selfUri = null;

  public ExternalSource() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ExternalSource id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the external source.
   **/
  public ExternalSource name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the external source.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public ExternalSource active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   **/
  public ExternalSource linkConfiguration(LinkConfiguration linkConfiguration) {
    this.linkConfiguration = linkConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linkConfiguration")
  public LinkConfiguration getLinkConfiguration() {
    return linkConfiguration;
  }
  public void setLinkConfiguration(LinkConfiguration linkConfiguration) {
    this.linkConfiguration = linkConfiguration;
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
    ExternalSource externalSource = (ExternalSource) o;

    return Objects.equals(this.id, externalSource.id) &&
            Objects.equals(this.name, externalSource.name) &&
            Objects.equals(this.active, externalSource.active) &&
            Objects.equals(this.linkConfiguration, externalSource.linkConfiguration) &&
            Objects.equals(this.selfUri, externalSource.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, linkConfiguration, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    linkConfiguration: ").append(toIndentedString(linkConfiguration)).append("\n");
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

