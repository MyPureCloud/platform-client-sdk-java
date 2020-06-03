package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * NluDomain
 */

public class NluDomain  implements Serializable {
  
  private String id = null;
  private String name = null;
  private NluDomainVersion draftVersion = null;
  private NluDomainVersion lastPublishedVersion = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the NLU domain.
   **/
  public NluDomain name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the NLU domain.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The draft version of that NLU domain.
   **/
  public NluDomain draftVersion(NluDomainVersion draftVersion) {
    this.draftVersion = draftVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The draft version of that NLU domain.")
  @JsonProperty("draftVersion")
  public NluDomainVersion getDraftVersion() {
    return draftVersion;
  }
  public void setDraftVersion(NluDomainVersion draftVersion) {
    this.draftVersion = draftVersion;
  }

  
  /**
   * The last published version of that NLU domain.
   **/
  public NluDomain lastPublishedVersion(NluDomainVersion lastPublishedVersion) {
    this.lastPublishedVersion = lastPublishedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last published version of that NLU domain.")
  @JsonProperty("lastPublishedVersion")
  public NluDomainVersion getLastPublishedVersion() {
    return lastPublishedVersion;
  }
  public void setLastPublishedVersion(NluDomainVersion lastPublishedVersion) {
    this.lastPublishedVersion = lastPublishedVersion;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the NLU domain was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the NLU domain was updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    NluDomain nluDomain = (NluDomain) o;
    return Objects.equals(this.id, nluDomain.id) &&
        Objects.equals(this.name, nluDomain.name) &&
        Objects.equals(this.draftVersion, nluDomain.draftVersion) &&
        Objects.equals(this.lastPublishedVersion, nluDomain.lastPublishedVersion) &&
        Objects.equals(this.dateCreated, nluDomain.dateCreated) &&
        Objects.equals(this.dateModified, nluDomain.dateModified) &&
        Objects.equals(this.selfUri, nluDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, draftVersion, lastPublishedVersion, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    draftVersion: ").append(toIndentedString(draftVersion)).append("\n");
    sb.append("    lastPublishedVersion: ").append(toIndentedString(lastPublishedVersion)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

