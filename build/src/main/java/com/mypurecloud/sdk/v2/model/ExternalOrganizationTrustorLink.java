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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ExternalOrganizationTrustorLink
 */

public class ExternalOrganizationTrustorLink  implements Serializable {
  
  private String externalOrganizationId = null;
  private String trustorOrgId = null;
  private Date dateCreated = null;
  private String externalOrganizationUri = null;

  
  /**
   * The id of a PureCloud External Organization entity in the External Contacts system that will be used to represent the trustor org
   **/
  public ExternalOrganizationTrustorLink externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of a PureCloud External Organization entity in the External Contacts system that will be used to represent the trustor org")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }

  
  /**
   * The id of a PureCloud organization that has granted trust to this PureCloud organization
   **/
  public ExternalOrganizationTrustorLink trustorOrgId(String trustorOrgId) {
    this.trustorOrgId = trustorOrgId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of a PureCloud organization that has granted trust to this PureCloud organization")
  @JsonProperty("trustorOrgId")
  public String getTrustorOrgId() {
    return trustorOrgId;
  }
  public void setTrustorOrgId(String trustorOrgId) {
    this.trustorOrgId = trustorOrgId;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalOrganizationTrustorLink dateCreated(Date dateCreated) {
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

  
  @ApiModelProperty(example = "null", value = "The URI for the External Organization that is linked to the trustor org")
  @JsonProperty("externalOrganizationUri")
  public String getExternalOrganizationUri() {
    return externalOrganizationUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalOrganizationTrustorLink externalOrganizationTrustorLink = (ExternalOrganizationTrustorLink) o;
    return Objects.equals(this.externalOrganizationId, externalOrganizationTrustorLink.externalOrganizationId) &&
        Objects.equals(this.trustorOrgId, externalOrganizationTrustorLink.trustorOrgId) &&
        Objects.equals(this.dateCreated, externalOrganizationTrustorLink.dateCreated) &&
        Objects.equals(this.externalOrganizationUri, externalOrganizationTrustorLink.externalOrganizationUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalOrganizationId, trustorOrgId, dateCreated, externalOrganizationUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationTrustorLink {\n");
    
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    trustorOrgId: ").append(toIndentedString(trustorOrgId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    externalOrganizationUri: ").append(toIndentedString(externalOrganizationUri)).append("\n");
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

