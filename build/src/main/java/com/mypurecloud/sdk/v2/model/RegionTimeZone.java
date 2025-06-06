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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RegionTimeZone
 */

public class RegionTimeZone  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Long offset = null;
  private String canonicalId = null;
  private String selfUri = null;

  public RegionTimeZone() {
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
  public RegionTimeZone name(String name) {
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
   **/
  public RegionTimeZone offset(Long offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offset")
  public Long getOffset() {
    return offset;
  }
  public void setOffset(Long offset) {
    this.offset = offset;
  }


  /**
   * Canonical identifier for this time zone, if applicable
   **/
  public RegionTimeZone canonicalId(String canonicalId) {
    this.canonicalId = canonicalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Canonical identifier for this time zone, if applicable")
  @JsonProperty("canonicalId")
  public String getCanonicalId() {
    return canonicalId;
  }
  public void setCanonicalId(String canonicalId) {
    this.canonicalId = canonicalId;
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
    RegionTimeZone regionTimeZone = (RegionTimeZone) o;

    return Objects.equals(this.id, regionTimeZone.id) &&
            Objects.equals(this.name, regionTimeZone.name) &&
            Objects.equals(this.offset, regionTimeZone.offset) &&
            Objects.equals(this.canonicalId, regionTimeZone.canonicalId) &&
            Objects.equals(this.selfUri, regionTimeZone.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, offset, canonicalId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionTimeZone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    canonicalId: ").append(toIndentedString(canonicalId)).append("\n");
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

