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
import com.mypurecloud.sdk.v2.model.OrgUser;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.TrusteeAuthorization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Trustor
 */

public class Trustor  implements Serializable {
  
  private String id = null;
  private Boolean enabled = null;
  private Date dateCreated = null;
  private OrgUser createdBy = null;
  private Organization organization = null;
  private TrusteeAuthorization authorization = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "Organization Id for this trust.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * If disabled no trustee user will have access, even if they were previously added.
   **/
  public Trustor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If disabled no trustee user will have access, even if they were previously added.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "Date Trust was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "User that created trust.")
  @JsonProperty("createdBy")
  public OrgUser getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Organization associated with this trust.")
  @JsonProperty("organization")
  public Organization getOrganization() {
    return organization;
  }

  
  @ApiModelProperty(example = "null", value = "Authorization for the trustee user has in this trustor organization")
  @JsonProperty("authorization")
  public TrusteeAuthorization getAuthorization() {
    return authorization;
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
    Trustor trustor = (Trustor) o;
    return Objects.equals(this.id, trustor.id) &&
        Objects.equals(this.enabled, trustor.enabled) &&
        Objects.equals(this.dateCreated, trustor.dateCreated) &&
        Objects.equals(this.createdBy, trustor.createdBy) &&
        Objects.equals(this.organization, trustor.organization) &&
        Objects.equals(this.authorization, trustor.authorization) &&
        Objects.equals(this.selfUri, trustor.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, dateCreated, createdBy, organization, authorization, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trustor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

