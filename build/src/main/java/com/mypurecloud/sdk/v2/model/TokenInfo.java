package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Entity;
import com.mypurecloud.sdk.v2.model.OrgOAuthClient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TokenInfo
 */

public class TokenInfo  implements Serializable {
  
  private Entity organization = null;
  private Entity homeOrganization = null;
  private OrgOAuthClient oAuthClient = null;

  
  /**
   * The current organization
   **/
  public TokenInfo organization(Entity organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current organization")
  @JsonProperty("organization")
  public Entity getOrganization() {
    return organization;
  }
  public void setOrganization(Entity organization) {
    this.organization = organization;
  }


  /**
   * The token's home organization
   **/
  public TokenInfo homeOrganization(Entity homeOrganization) {
    this.homeOrganization = homeOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The token's home organization")
  @JsonProperty("homeOrganization")
  public Entity getHomeOrganization() {
    return homeOrganization;
  }
  public void setHomeOrganization(Entity homeOrganization) {
    this.homeOrganization = homeOrganization;
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
        Objects.equals(this.oAuthClient, tokenInfo.oAuthClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, homeOrganization, oAuthClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenInfo {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    homeOrganization: ").append(toIndentedString(homeOrganization)).append("\n");
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

