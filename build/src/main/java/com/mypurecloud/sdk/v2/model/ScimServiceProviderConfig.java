package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScimServiceProviderConfig
 */

public class ScimServiceProviderConfig  implements Serializable {
  
  private String documentationUri = null;
  private ScimMetadata meta = null;

  
  @ApiModelProperty(example = "null", value = "Documentation")
  @JsonProperty("documentationUri")
  public String getDocumentationUri() {
    return documentationUri;
  }

  
  /**
   * Configuration SCIM meta data
   **/
  public ScimServiceProviderConfig meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration SCIM meta data")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfig scimServiceProviderConfig = (ScimServiceProviderConfig) o;
    return Objects.equals(this.documentationUri, scimServiceProviderConfig.documentationUri) &&
        Objects.equals(this.meta, scimServiceProviderConfig.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentationUri, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfig {\n");
    
    sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

