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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.RoleDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OAuthClientRequest
 */

public class OAuthClientRequest  implements Serializable {
  
  private String name = null;
  private Long accessTokenValiditySeconds = null;
  private String description = null;
  private List<String> registeredRedirectUri = new ArrayList<String>();
  private List<String> roleIds = new ArrayList<String>();

  private static class AuthorizedGrantTypeEnumDeserializer extends StdDeserializer<AuthorizedGrantTypeEnum> {
    public AuthorizedGrantTypeEnumDeserializer() {
      super(AuthorizedGrantTypeEnumDeserializer.class);
    }

    @Override
    public AuthorizedGrantTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AuthorizedGrantTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. PKCE-Enabled Code Authorization grant type - Code grant type which requires PKCE challenge and verifier to create tokens. Used in public clients for increased security. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. 
   */
 @JsonDeserialize(using = AuthorizedGrantTypeEnumDeserializer.class)
  public enum AuthorizedGrantTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CODE("CODE"),
    TOKEN("TOKEN"),
    SAML2_BEARER("SAML2-BEARER"),
    PASSWORD("PASSWORD"),
    CLIENT_CREDENTIALS("CLIENT-CREDENTIALS");

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

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the OAuth client. Active: The OAuth client can be used to create access tokens. This is the default state. Disabled: Access tokens created by the client are invalid and new ones cannot be created. Inactive: Access tokens cannot be created with this OAuth client and it will be deleted.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    DISABLED("disabled"),
    INACTIVE("inactive");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Date dateToDelete = null;

  
  /**
   * The name of the OAuth client.
   **/
  public OAuthClientRequest name(String name) {
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
  public OAuthClientRequest accessTokenValiditySeconds(Long accessTokenValiditySeconds) {
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
  public OAuthClientRequest description(String description) {
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
  public OAuthClientRequest registeredRedirectUri(List<String> registeredRedirectUri) {
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
   * Deprecated. Use roleDivisions instead.
   **/
  public OAuthClientRequest roleIds(List<String> roleIds) {
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
   * The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. PKCE-Enabled Code Authorization grant type - Code grant type which requires PKCE challenge and verifier to create tokens. Used in public clients for increased security. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. 
   **/
  public OAuthClientRequest authorizedGrantType(AuthorizedGrantTypeEnum authorizedGrantType) {
    this.authorizedGrantType = authorizedGrantType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. PKCE-Enabled Code Authorization grant type - Code grant type which requires PKCE challenge and verifier to create tokens. Used in public clients for increased security. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. ")
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
  public OAuthClientRequest scope(List<String> scope) {
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
  public OAuthClientRequest roleDivisions(List<RoleDivision> roleDivisions) {
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

  
  /**
   * The state of the OAuth client. Active: The OAuth client can be used to create access tokens. This is the default state. Disabled: Access tokens created by the client are invalid and new ones cannot be created. Inactive: Access tokens cannot be created with this OAuth client and it will be deleted.
   **/
  public OAuthClientRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the OAuth client. Active: The OAuth client can be used to create access tokens. This is the default state. Disabled: Access tokens created by the client are invalid and new ones cannot be created. Inactive: Access tokens cannot be created with this OAuth client and it will be deleted.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The time at which this client will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OAuthClientRequest dateToDelete(Date dateToDelete) {
    this.dateToDelete = dateToDelete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time at which this client will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateToDelete")
  public Date getDateToDelete() {
    return dateToDelete;
  }
  public void setDateToDelete(Date dateToDelete) {
    this.dateToDelete = dateToDelete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClientRequest oAuthClientRequest = (OAuthClientRequest) o;
    return Objects.equals(this.name, oAuthClientRequest.name) &&
        Objects.equals(this.accessTokenValiditySeconds, oAuthClientRequest.accessTokenValiditySeconds) &&
        Objects.equals(this.description, oAuthClientRequest.description) &&
        Objects.equals(this.registeredRedirectUri, oAuthClientRequest.registeredRedirectUri) &&
        Objects.equals(this.roleIds, oAuthClientRequest.roleIds) &&
        Objects.equals(this.authorizedGrantType, oAuthClientRequest.authorizedGrantType) &&
        Objects.equals(this.scope, oAuthClientRequest.scope) &&
        Objects.equals(this.roleDivisions, oAuthClientRequest.roleDivisions) &&
        Objects.equals(this.state, oAuthClientRequest.state) &&
        Objects.equals(this.dateToDelete, oAuthClientRequest.dateToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accessTokenValiditySeconds, description, registeredRedirectUri, roleIds, authorizedGrantType, scope, roleDivisions, state, dateToDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    registeredRedirectUri: ").append(toIndentedString(registeredRedirectUri)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    authorizedGrantType: ").append(toIndentedString(authorizedGrantType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    roleDivisions: ").append(toIndentedString(roleDivisions)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateToDelete: ").append(toIndentedString(dateToDelete)).append("\n");
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

