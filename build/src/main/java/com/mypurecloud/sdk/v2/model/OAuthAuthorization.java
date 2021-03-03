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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.OAuthClient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OAuthAuthorization
 */

public class OAuthAuthorization  implements Serializable {
  
  private OAuthClient client = null;
  private List<String> scope = new ArrayList<String>();
  private DomainEntityRef resourceOwner = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;
  private Boolean pending = null;
  private String selfUri = null;

  
  /**
   **/
  public OAuthAuthorization client(OAuthClient client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("client")
  public OAuthClient getClient() {
    return client;
  }
  public void setClient(OAuthClient client) {
    this.client = client;
  }

  
  /**
   **/
  public OAuthAuthorization scope(List<String> scope) {
    this.scope = scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scope")
  public List<String> getScope() {
    return scope;
  }
  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  
  /**
   **/
  public OAuthAuthorization resourceOwner(DomainEntityRef resourceOwner) {
    this.resourceOwner = resourceOwner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceOwner")
  public DomainEntityRef getResourceOwner() {
    return resourceOwner;
  }
  public void setResourceOwner(DomainEntityRef resourceOwner) {
    this.resourceOwner = resourceOwner;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OAuthAuthorization dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OAuthAuthorization dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public OAuthAuthorization createdBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public OAuthAuthorization modifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public DomainEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   **/
  public OAuthAuthorization pending(Boolean pending) {
    this.pending = pending;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pending")
  public Boolean getPending() {
    return pending;
  }
  public void setPending(Boolean pending) {
    this.pending = pending;
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
    OAuthAuthorization oAuthAuthorization = (OAuthAuthorization) o;
    return Objects.equals(this.client, oAuthAuthorization.client) &&
        Objects.equals(this.scope, oAuthAuthorization.scope) &&
        Objects.equals(this.resourceOwner, oAuthAuthorization.resourceOwner) &&
        Objects.equals(this.dateCreated, oAuthAuthorization.dateCreated) &&
        Objects.equals(this.dateModified, oAuthAuthorization.dateModified) &&
        Objects.equals(this.createdBy, oAuthAuthorization.createdBy) &&
        Objects.equals(this.modifiedBy, oAuthAuthorization.modifiedBy) &&
        Objects.equals(this.pending, oAuthAuthorization.pending) &&
        Objects.equals(this.selfUri, oAuthAuthorization.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, scope, resourceOwner, dateCreated, dateModified, createdBy, modifiedBy, pending, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthAuthorization {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    resourceOwner: ").append(toIndentedString(resourceOwner)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

