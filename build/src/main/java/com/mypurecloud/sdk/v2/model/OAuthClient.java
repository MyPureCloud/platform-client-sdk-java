package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.RoleDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OAuthClient
 */

public class OAuthClient  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Long accessTokenValiditySeconds = null;
  private String description = null;
  private List<String> registeredRedirectUri = new ArrayList<String>();
  private String secret = null;
  private List<String> roleIds = new ArrayList<String>();
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;

  /**
   * The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. 
   */
  public enum AuthorizedGrantTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CODE("CODE"),
    TOKEN("TOKEN"),
    SAML2BEARER("SAML2BEARER"),
    PASSWORD("PASSWORD"),
    CLIENT_CREDENTIALS("CLIENT_CREDENTIALS");

    private String value;

    AuthorizedGrantTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AuthorizedGrantTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AuthorizedGrantTypeEnum value : AuthorizedGrantTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AuthorizedGrantTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AuthorizedGrantTypeEnum authorizedGrantType = null;
  private List<String> scope = new ArrayList<String>();
  private List<RoleDivision> roleDivisions = new ArrayList<RoleDivision>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the OAuth client.
   **/
  public OAuthClient name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the OAuth client.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The number of seconds, between 5mins and 48hrs, until tokens created with this client expire. If this field is omitted, a default of 24 hours will be applied.
   **/
  public OAuthClient accessTokenValiditySeconds(Long accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds, between 5mins and 48hrs, until tokens created with this client expire. If this field is omitted, a default of 24 hours will be applied.")
  @JsonProperty("accessTokenValiditySeconds")
  public Long getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }
  public void setAccessTokenValiditySeconds(Long accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  
  /**
   **/
  public OAuthClient description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * List of allowed callbacks for this client. For example: https://myap.example.com/auth/callback
   **/
  public OAuthClient registeredRedirectUri(List<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of allowed callbacks for this client. For example: https://myap.example.com/auth/callback")
  @JsonProperty("registeredRedirectUri")
  public List<String> getRegisteredRedirectUri() {
    return registeredRedirectUri;
  }
  public void setRegisteredRedirectUri(List<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
  }

  
  /**
   * System created secret assigned to this client. Secrets are required for code authorization and client credential grants.
   **/
  public OAuthClient secret(String secret) {
    this.secret = secret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "System created secret assigned to this client. Secrets are required for code authorization and client credential grants.")
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  
  /**
   * Deprecated. Use roleDivisions instead.
   **/
  public OAuthClient roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deprecated. Use roleDivisions instead.")
  @JsonProperty("roleIds")
  public List<String> getRoleIds() {
    return roleIds;
  }
  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  
  /**
   * Date this client was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public OAuthClient dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this client was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date this client was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public OAuthClient dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this client was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * User that created this client
   **/
  public OAuthClient createdBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that created this client")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User that last modified this client
   **/
  public OAuthClient modifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that last modified this client")
  @JsonProperty("modifiedBy")
  public DomainEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. 
   **/
  public OAuthClient authorizedGrantType(AuthorizedGrantTypeEnum authorizedGrantType) {
    this.authorizedGrantType = authorizedGrantType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. ")
  @JsonProperty("authorizedGrantType")
  public AuthorizedGrantTypeEnum getAuthorizedGrantType() {
    return authorizedGrantType;
  }
  public void setAuthorizedGrantType(AuthorizedGrantTypeEnum authorizedGrantType) {
    this.authorizedGrantType = authorizedGrantType;
  }

  
  /**
   * The scope requested by this client. Scopes only apply to clients not using the client_credential grant
   **/
  public OAuthClient scope(List<String> scope) {
    this.scope = scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The scope requested by this client. Scopes only apply to clients not using the client_credential grant")
  @JsonProperty("scope")
  public List<String> getScope() {
    return scope;
  }
  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  
  /**
   * Set of roles and their corresponding divisions associated with this client. Roles and divisions only apply to clients using the client_credential grant
   **/
  public OAuthClient roleDivisions(List<RoleDivision> roleDivisions) {
    this.roleDivisions = roleDivisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of roles and their corresponding divisions associated with this client. Roles and divisions only apply to clients using the client_credential grant")
  @JsonProperty("roleDivisions")
  public List<RoleDivision> getRoleDivisions() {
    return roleDivisions;
  }
  public void setRoleDivisions(List<RoleDivision> roleDivisions) {
    this.roleDivisions = roleDivisions;
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
    OAuthClient oAuthClient = (OAuthClient) o;
    return Objects.equals(this.id, oAuthClient.id) &&
        Objects.equals(this.name, oAuthClient.name) &&
        Objects.equals(this.accessTokenValiditySeconds, oAuthClient.accessTokenValiditySeconds) &&
        Objects.equals(this.description, oAuthClient.description) &&
        Objects.equals(this.registeredRedirectUri, oAuthClient.registeredRedirectUri) &&
        Objects.equals(this.secret, oAuthClient.secret) &&
        Objects.equals(this.roleIds, oAuthClient.roleIds) &&
        Objects.equals(this.dateCreated, oAuthClient.dateCreated) &&
        Objects.equals(this.dateModified, oAuthClient.dateModified) &&
        Objects.equals(this.createdBy, oAuthClient.createdBy) &&
        Objects.equals(this.modifiedBy, oAuthClient.modifiedBy) &&
        Objects.equals(this.authorizedGrantType, oAuthClient.authorizedGrantType) &&
        Objects.equals(this.scope, oAuthClient.scope) &&
        Objects.equals(this.roleDivisions, oAuthClient.roleDivisions) &&
        Objects.equals(this.selfUri, oAuthClient.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accessTokenValiditySeconds, description, registeredRedirectUri, secret, roleIds, dateCreated, dateModified, createdBy, modifiedBy, authorizedGrantType, scope, roleDivisions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    registeredRedirectUri: ").append(toIndentedString(registeredRedirectUri)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    authorizedGrantType: ").append(toIndentedString(authorizedGrantType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    roleDivisions: ").append(toIndentedString(roleDivisions)).append("\n");
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

