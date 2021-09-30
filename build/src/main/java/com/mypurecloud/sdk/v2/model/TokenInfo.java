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
import com.mypurecloud.sdk.v2.model.NamedEntity;
import com.mypurecloud.sdk.v2.model.OrgOAuthClient;
import com.mypurecloud.sdk.v2.model.TokenInfoClonedUser;
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
  private TokenInfoClonedUser clonedUser = null;
  private OrgOAuthClient oAuthClient = null;

  
  @ApiModelProperty(example = "null", value = "The current organization")
  @JsonProperty("organization")
  public NamedEntity getOrganization() {
    return organization;
  }

  
  @ApiModelProperty(example = "null", value = "The token's home organization")
  @JsonProperty("homeOrganization")
  public NamedEntity getHomeOrganization() {
    return homeOrganization;
  }

  
  @ApiModelProperty(example = "null", value = "The list of scopes authorized for the OAuth client")
  @JsonProperty("authorizedScope")
  public List<String> getAuthorizedScope() {
    return authorizedScope;
  }

  
  @ApiModelProperty(example = "null", value = "Only present when a user is a clone of trustee user in the trustor org.")
  @JsonProperty("clonedUser")
  public TokenInfoClonedUser getClonedUser() {
    return clonedUser;
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
        Objects.equals(this.clonedUser, tokenInfo.clonedUser) &&
        Objects.equals(this.oAuthClient, tokenInfo.oAuthClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, homeOrganization, authorizedScope, clonedUser, oAuthClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenInfo {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    homeOrganization: ").append(toIndentedString(homeOrganization)).append("\n");
    sb.append("    authorizedScope: ").append(toIndentedString(authorizedScope)).append("\n");
    sb.append("    clonedUser: ").append(toIndentedString(clonedUser)).append("\n");
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

