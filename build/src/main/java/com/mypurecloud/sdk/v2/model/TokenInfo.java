package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.NamedEntity;
import com.mypurecloud.sdk.v2.model.OrgOAuthClient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TokenInfo
 */

public class TokenInfo  implements Serializable {
  
  private NamedEntity organization = null;
  private NamedEntity homeOrganization = null;
  private List<String> authorizedScope = new ArrayList<String>();
  private OrgOAuthClient oAuthClient = null;

  
  /**
   * The current organization
   **/
  public TokenInfo organization(NamedEntity organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current organization")
  @JsonProperty("organization")
  public NamedEntity getOrganization() {
    return organization;
  }
  public void setOrganization(NamedEntity organization) {
    this.organization = organization;
  }

  
  /**
   * The token's home organization
   **/
  public TokenInfo homeOrganization(NamedEntity homeOrganization) {
    this.homeOrganization = homeOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The token's home organization")
  @JsonProperty("homeOrganization")
  public NamedEntity getHomeOrganization() {
    return homeOrganization;
  }
  public void setHomeOrganization(NamedEntity homeOrganization) {
    this.homeOrganization = homeOrganization;
  }

  
  /**
   * The list of scopes authorized for the OAuth client
   **/
  public TokenInfo authorizedScope(List<String> authorizedScope) {
    this.authorizedScope = authorizedScope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of scopes authorized for the OAuth client")
  @JsonProperty("authorizedScope")
  public List<String> getAuthorizedScope() {
    return authorizedScope;
  }
  public void setAuthorizedScope(List<String> authorizedScope) {
    this.authorizedScope = authorizedScope;
  }

  
  /**
   **/
  public TokenInfo oAuthClient(OrgOAuthClient oAuthClient) {
    this.oAuthClient = oAuthClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("OAuthClient")
  public OrgOAuthClient getOAuthClient() {
    return oAuthClient;
  }
  public void setOAuthClient(OrgOAuthClient oAuthClient) {
    this.oAuthClient = oAuthClient;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenInfo tokenInfo = (TokenInfo) o;
    return Objects.equals(this.organization, tokenInfo.organization) &&
        Objects.equals(this.homeOrganization, tokenInfo.homeOrganization) &&
        Objects.equals(this.authorizedScope, tokenInfo.authorizedScope) &&
        Objects.equals(this.oAuthClient, tokenInfo.oAuthClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, homeOrganization, authorizedScope, oAuthClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenInfo {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    homeOrganization: ").append(toIndentedString(homeOrganization)).append("\n");
    sb.append("    authorizedScope: ").append(toIndentedString(authorizedScope)).append("\n");
    sb.append("    oAuthClient: ").append(toIndentedString(oAuthClient)).append("\n");
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

