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
import com.mypurecloud.sdk.v2.model.ScimEmail;
import com.mypurecloud.sdk.v2.model.ScimPhoneNumber;
import com.mypurecloud.sdk.v2.model.ScimUserExtensions;
import com.mypurecloud.sdk.v2.model.ScimUserRole;
import com.mypurecloud.sdk.v2.model.ScimV2EnterpriseUser;
import com.mypurecloud.sdk.v2.model.ScimV2GroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines the creation of a SCIM user.
 */
@ApiModel(description = "Defines the creation of a SCIM user.")

public class ScimV2CreateUser  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private Boolean active = null;
  private String userName = null;
  private String displayName = null;
  private String password = null;
  private String title = null;
  private List<ScimPhoneNumber> phoneNumbers = new ArrayList<ScimPhoneNumber>();
  private List<ScimEmail> emails = new ArrayList<ScimEmail>();
  private String externalId = null;
  private List<ScimV2GroupReference> groups = new ArrayList<ScimV2GroupReference>();
  private List<ScimUserRole> roles = new ArrayList<ScimUserRole>();
  private ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User = null;
  private ScimUserExtensions urnietfparamsscimschemasextensiongenesyspurecloud20User = null;

  
  @ApiModelProperty(example = "null", value = "The list of supported schemas.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  
  /**
   * Indicates whether the user's administrative status is active.
   **/
  public ScimV2CreateUser active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the user's administrative status is active.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * The user's Genesys Cloud email address. Must be unique.
   **/
  public ScimV2CreateUser userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user's Genesys Cloud email address. Must be unique.")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * The display name of the user.
   **/
  public ScimV2CreateUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name of the user.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The new password for the Genesys Cloud user. Does not return an existing password. When creating a user, if a password is not supplied, then a password will be randomly generated that is 40 characters in length and contains five characters from each of the password policy groups.
   **/
  public ScimV2CreateUser password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new password for the Genesys Cloud user. Does not return an existing password. When creating a user, if a password is not supplied, then a password will be randomly generated that is 40 characters in length and contains five characters from each of the password policy groups.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The user's title.
   **/
  public ScimV2CreateUser title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The list of the user's phone numbers.
   **/
  public ScimV2CreateUser phoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the user's phone numbers.")
  @JsonProperty("phoneNumbers")
  public List<ScimPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   * The list of the user's email addresses.
   **/
  public ScimV2CreateUser emails(List<ScimEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the user's email addresses.")
  @JsonProperty("emails")
  public List<ScimEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<ScimEmail> emails) {
    this.emails = emails;
  }

  
  /**
   * The external ID of the user. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\".
   **/
  public ScimV2CreateUser externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external ID of the user. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\".")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   * The list of groups that the user is a member of.
   **/
  public ScimV2CreateUser groups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of groups that the user is a member of.")
  @JsonProperty("groups")
  public List<ScimV2GroupReference> getGroups() {
    return groups;
  }
  public void setGroups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
  }

  
  /**
   * The list of roles assigned to the user.
   **/
  public ScimV2CreateUser roles(List<ScimUserRole> roles) {
    this.roles = roles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of roles assigned to the user.")
  @JsonProperty("roles")
  public List<ScimUserRole> getRoles() {
    return roles;
  }
  public void setRoles(List<ScimUserRole> roles) {
    this.roles = roles;
  }

  
  /**
   * The URI of the schema for the enterprise user.
   **/
  public ScimV2CreateUser urnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the schema for the enterprise user.")
  @JsonProperty("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
  public ScimV2EnterpriseUser getUrnietfparamsscimschemasextensionenterprise20User() {
    return urnietfparamsscimschemasextensionenterprise20User;
  }
  public void setUrnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
  }

  
  /**
   * The URI of the schema for the Genesys Cloud user.
   **/
  public ScimV2CreateUser urnietfparamsscimschemasextensiongenesyspurecloud20User(ScimUserExtensions urnietfparamsscimschemasextensiongenesyspurecloud20User) {
    this.urnietfparamsscimschemasextensiongenesyspurecloud20User = urnietfparamsscimschemasextensiongenesyspurecloud20User;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the schema for the Genesys Cloud user.")
  @JsonProperty("urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User")
  public ScimUserExtensions getUrnietfparamsscimschemasextensiongenesyspurecloud20User() {
    return urnietfparamsscimschemasextensiongenesyspurecloud20User;
  }
  public void setUrnietfparamsscimschemasextensiongenesyspurecloud20User(ScimUserExtensions urnietfparamsscimschemasextensiongenesyspurecloud20User) {
    this.urnietfparamsscimschemasextensiongenesyspurecloud20User = urnietfparamsscimschemasextensiongenesyspurecloud20User;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2CreateUser scimV2CreateUser = (ScimV2CreateUser) o;
    return Objects.equals(this.schemas, scimV2CreateUser.schemas) &&
        Objects.equals(this.active, scimV2CreateUser.active) &&
        Objects.equals(this.userName, scimV2CreateUser.userName) &&
        Objects.equals(this.displayName, scimV2CreateUser.displayName) &&
        Objects.equals(this.password, scimV2CreateUser.password) &&
        Objects.equals(this.title, scimV2CreateUser.title) &&
        Objects.equals(this.phoneNumbers, scimV2CreateUser.phoneNumbers) &&
        Objects.equals(this.emails, scimV2CreateUser.emails) &&
        Objects.equals(this.externalId, scimV2CreateUser.externalId) &&
        Objects.equals(this.groups, scimV2CreateUser.groups) &&
        Objects.equals(this.roles, scimV2CreateUser.roles) &&
        Objects.equals(this.urnietfparamsscimschemasextensionenterprise20User, scimV2CreateUser.urnietfparamsscimschemasextensionenterprise20User) &&
        Objects.equals(this.urnietfparamsscimschemasextensiongenesyspurecloud20User, scimV2CreateUser.urnietfparamsscimschemasextensiongenesyspurecloud20User);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, active, userName, displayName, password, title, phoneNumbers, emails, externalId, groups, roles, urnietfparamsscimschemasextensionenterprise20User, urnietfparamsscimschemasextensiongenesyspurecloud20User);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2CreateUser {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    urnietfparamsscimschemasextensionenterprise20User: ").append(toIndentedString(urnietfparamsscimschemasextensionenterprise20User)).append("\n");
    sb.append("    urnietfparamsscimschemasextensiongenesyspurecloud20User: ").append(toIndentedString(urnietfparamsscimschemasextensiongenesyspurecloud20User)).append("\n");
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

