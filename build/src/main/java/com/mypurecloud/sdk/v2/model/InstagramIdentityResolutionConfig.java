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
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InstagramIdentityResolutionConfig
 */

public class InstagramIdentityResolutionConfig  implements Serializable {
  
  private String id = null;
  private WritableStarrableDivision division = null;
  private Boolean resolveIdentities = null;
  private String selfUri = null;

  public InstagramIdentityResolutionConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The division to use when performing identity resolution.
   **/
  public InstagramIdentityResolutionConfig division(WritableStarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to use when performing identity resolution.")
  @JsonProperty("division")
  public WritableStarrableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableStarrableDivision division) {
    this.division = division;
  }


  /**
   * Whether the channel should resolve identities
   **/
  public InstagramIdentityResolutionConfig resolveIdentities(Boolean resolveIdentities) {
    this.resolveIdentities = resolveIdentities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the channel should resolve identities")
  @JsonProperty("resolveIdentities")
  public Boolean getResolveIdentities() {
    return resolveIdentities;
  }
  public void setResolveIdentities(Boolean resolveIdentities) {
    this.resolveIdentities = resolveIdentities;
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
    InstagramIdentityResolutionConfig instagramIdentityResolutionConfig = (InstagramIdentityResolutionConfig) o;

    return Objects.equals(this.id, instagramIdentityResolutionConfig.id) &&
            Objects.equals(this.division, instagramIdentityResolutionConfig.division) &&
            Objects.equals(this.resolveIdentities, instagramIdentityResolutionConfig.resolveIdentities) &&
            Objects.equals(this.selfUri, instagramIdentityResolutionConfig.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, resolveIdentities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstagramIdentityResolutionConfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    resolveIdentities: ").append(toIndentedString(resolveIdentities)).append("\n");
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

