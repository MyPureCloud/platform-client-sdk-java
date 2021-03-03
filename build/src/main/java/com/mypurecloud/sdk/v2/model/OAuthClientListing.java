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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.RoleDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OAuthClientListing
 */

public class OAuthClientListing  implements Serializable {
  
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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the OAuth client.
   **/
  public OAuthClientListing name(String name) {
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
  public OAuthClientListing accessTokenValiditySeconds(Long accessTokenValiditySeconds) {
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
  public OAuthClientListing description(String description) {
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
  public OAuthClientListing registeredRedirectUri(List<String> registeredRedirectUri) {
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
  public OAuthClientListing secret(String secret) {
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
  public OAuthClientListing roleIds(List<String> roleIds) {
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
   * Date this client was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OAuthClientListing dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this client was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date this client was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OAuthClientListing dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this client was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  public OAuthClientListing createdBy(DomainEntityRef createdBy) {
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
  public OAuthClientListing modifiedBy(DomainEntityRef modifiedBy) {
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
   * The scope requested by this client. Scopes only apply to clients not using the client_credential grant
   **/
  public OAuthClientListing scope(List<String> scope) {
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
  public OAuthClientListing roleDivisions(List<RoleDivision> roleDivisions) {
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
  public OAuthClientListing state(StateEnum state) {
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
  public OAuthClientListing dateToDelete(Date dateToDelete) {
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
    OAuthClientListing oAuthClientListing = (OAuthClientListing) o;
    return Objects.equals(this.id, oAuthClientListing.id) &&
        Objects.equals(this.name, oAuthClientListing.name) &&
        Objects.equals(this.accessTokenValiditySeconds, oAuthClientListing.accessTokenValiditySeconds) &&
        Objects.equals(this.description, oAuthClientListing.description) &&
        Objects.equals(this.registeredRedirectUri, oAuthClientListing.registeredRedirectUri) &&
        Objects.equals(this.secret, oAuthClientListing.secret) &&
        Objects.equals(this.roleIds, oAuthClientListing.roleIds) &&
        Objects.equals(this.dateCreated, oAuthClientListing.dateCreated) &&
        Objects.equals(this.dateModified, oAuthClientListing.dateModified) &&
        Objects.equals(this.createdBy, oAuthClientListing.createdBy) &&
        Objects.equals(this.modifiedBy, oAuthClientListing.modifiedBy) &&
        Objects.equals(this.scope, oAuthClientListing.scope) &&
        Objects.equals(this.roleDivisions, oAuthClientListing.roleDivisions) &&
        Objects.equals(this.state, oAuthClientListing.state) &&
        Objects.equals(this.dateToDelete, oAuthClientListing.dateToDelete) &&
        Objects.equals(this.selfUri, oAuthClientListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accessTokenValiditySeconds, description, registeredRedirectUri, secret, roleIds, dateCreated, dateModified, createdBy, modifiedBy, scope, roleDivisions, state, dateToDelete, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientListing {\n");
    
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
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    roleDivisions: ").append(toIndentedString(roleDivisions)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateToDelete: ").append(toIndentedString(dateToDelete)).append("\n");
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

