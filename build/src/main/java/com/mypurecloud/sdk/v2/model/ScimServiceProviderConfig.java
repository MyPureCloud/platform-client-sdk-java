package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfigAuthenticationScheme;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfigBulkFeature;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfigFilterFeature;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfigSimpleFeature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SCIM Provider Config for PureCloud.
 */
@ApiModel(description = "SCIM Provider Config for PureCloud.")

public class ScimServiceProviderConfig  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private String documentationUri = null;
  private ScimServiceProviderConfigSimpleFeature patch = null;
  private ScimServiceProviderConfigFilterFeature filter = null;
  private ScimServiceProviderConfigSimpleFeature etag = null;
  private ScimServiceProviderConfigSimpleFeature sort = null;
  private ScimServiceProviderConfigBulkFeature bulk = null;
  private ScimServiceProviderConfigSimpleFeature changePassword = null;
  private List<ScimServiceProviderConfigAuthenticationScheme> authenticationSchemes = new ArrayList<ScimServiceProviderConfigAuthenticationScheme>();
  private ScimMetadata meta = null;

  
  /**
   * The list of supported schemas.
   **/
  public ScimServiceProviderConfig schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported schemas.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  @ApiModelProperty(example = "null", value = "The HTTP-addressable URL that points to the service provider's documentation.")
  @JsonProperty("documentationUri")
  public String getDocumentationUri() {
    return documentationUri;
  }

  
  /**
   * The \"patch\" configuration options.
   **/
  public ScimServiceProviderConfig patch(ScimServiceProviderConfigSimpleFeature patch) {
    this.patch = patch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The \"patch\" configuration options.")
  @JsonProperty("patch")
  public ScimServiceProviderConfigSimpleFeature getPatch() {
    return patch;
  }
  public void setPatch(ScimServiceProviderConfigSimpleFeature patch) {
    this.patch = patch;
  }

  
  /**
   * The \"filter\" configuration options.
   **/
  public ScimServiceProviderConfig filter(ScimServiceProviderConfigFilterFeature filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The \"filter\" configuration options.")
  @JsonProperty("filter")
  public ScimServiceProviderConfigFilterFeature getFilter() {
    return filter;
  }
  public void setFilter(ScimServiceProviderConfigFilterFeature filter) {
    this.filter = filter;
  }

  
  /**
   * The \"etag\" configuration options.
   **/
  public ScimServiceProviderConfig etag(ScimServiceProviderConfigSimpleFeature etag) {
    this.etag = etag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The \"etag\" configuration options.")
  @JsonProperty("etag")
  public ScimServiceProviderConfigSimpleFeature getEtag() {
    return etag;
  }
  public void setEtag(ScimServiceProviderConfigSimpleFeature etag) {
    this.etag = etag;
  }

  
  /**
   * The \"sort\" configuration options.
   **/
  public ScimServiceProviderConfig sort(ScimServiceProviderConfigSimpleFeature sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The \"sort\" configuration options.")
  @JsonProperty("sort")
  public ScimServiceProviderConfigSimpleFeature getSort() {
    return sort;
  }
  public void setSort(ScimServiceProviderConfigSimpleFeature sort) {
    this.sort = sort;
  }

  
  /**
   * The \"bulk\" configuration options.
   **/
  public ScimServiceProviderConfig bulk(ScimServiceProviderConfigBulkFeature bulk) {
    this.bulk = bulk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The \"bulk\" configuration options.")
  @JsonProperty("bulk")
  public ScimServiceProviderConfigBulkFeature getBulk() {
    return bulk;
  }
  public void setBulk(ScimServiceProviderConfigBulkFeature bulk) {
    this.bulk = bulk;
  }

  
  /**
   * The \"changePassword\" configuration options.
   **/
  public ScimServiceProviderConfig changePassword(ScimServiceProviderConfigSimpleFeature changePassword) {
    this.changePassword = changePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The \"changePassword\" configuration options.")
  @JsonProperty("changePassword")
  public ScimServiceProviderConfigSimpleFeature getChangePassword() {
    return changePassword;
  }
  public void setChangePassword(ScimServiceProviderConfigSimpleFeature changePassword) {
    this.changePassword = changePassword;
  }

  
  /**
   * The list of supported authentication schemes.
   **/
  public ScimServiceProviderConfig authenticationSchemes(List<ScimServiceProviderConfigAuthenticationScheme> authenticationSchemes) {
    this.authenticationSchemes = authenticationSchemes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported authentication schemes.")
  @JsonProperty("authenticationSchemes")
  public List<ScimServiceProviderConfigAuthenticationScheme> getAuthenticationSchemes() {
    return authenticationSchemes;
  }
  public void setAuthenticationSchemes(List<ScimServiceProviderConfigAuthenticationScheme> authenticationSchemes) {
    this.authenticationSchemes = authenticationSchemes;
  }

  
  /**
   * Resource SCIM meta
   **/
  public ScimServiceProviderConfig meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resource SCIM meta")
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
    return Objects.equals(this.schemas, scimServiceProviderConfig.schemas) &&
        Objects.equals(this.documentationUri, scimServiceProviderConfig.documentationUri) &&
        Objects.equals(this.patch, scimServiceProviderConfig.patch) &&
        Objects.equals(this.filter, scimServiceProviderConfig.filter) &&
        Objects.equals(this.etag, scimServiceProviderConfig.etag) &&
        Objects.equals(this.sort, scimServiceProviderConfig.sort) &&
        Objects.equals(this.bulk, scimServiceProviderConfig.bulk) &&
        Objects.equals(this.changePassword, scimServiceProviderConfig.changePassword) &&
        Objects.equals(this.authenticationSchemes, scimServiceProviderConfig.authenticationSchemes) &&
        Objects.equals(this.meta, scimServiceProviderConfig.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, documentationUri, patch, filter, etag, sort, bulk, changePassword, authenticationSchemes, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfig {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    bulk: ").append(toIndentedString(bulk)).append("\n");
    sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
    sb.append("    authenticationSchemes: ").append(toIndentedString(authenticationSchemes)).append("\n");
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

