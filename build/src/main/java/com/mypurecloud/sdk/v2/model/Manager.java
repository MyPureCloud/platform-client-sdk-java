package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Photo;
import com.mypurecloud.sdk.v2.model.ScimEmail;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import com.mypurecloud.sdk.v2.model.ScimPhoneNumber;
import com.mypurecloud.sdk.v2.model.ScimV2EnterpriseUser;
import com.mypurecloud.sdk.v2.model.ScimV2GroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents a SCIM V2 Enterprise Manager
 */
@ApiModel(description = "Represents a SCIM V2 Enterprise Manager")

public class Manager  implements Serializable {
  
  private String displayName = null;
  private Boolean active = null;
  private String userName = null;
  private String password = null;
  private String title = null;
  private List<ScimPhoneNumber> phoneNumbers = new ArrayList<ScimPhoneNumber>();
  private List<ScimEmail> emails = new ArrayList<ScimEmail>();
  private List<Photo> photos = new ArrayList<Photo>();
  private List<ScimV2GroupReference> groups = new ArrayList<ScimV2GroupReference>();
  private ScimMetadata meta = null;
  private ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User = null;
  private String value = null;
  private String ref = null;

  
  /**
   * Display Name
   **/
  public Manager displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display Name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * Active flag
   **/
  public Manager active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active flag")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * User Name (Must be Unique) maps to PureCloud e-mail address
   **/
  public Manager userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Name (Must be Unique) maps to PureCloud e-mail address")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * Password (updateOnly)
   **/
  public Manager password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password (updateOnly)")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Title
   **/
  public Manager title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Phone numbers
   **/
  public Manager phoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone numbers")
  @JsonProperty("phoneNumbers")
  public List<ScimPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   * Emails
   **/
  public Manager emails(List<ScimEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Emails")
  @JsonProperty("emails")
  public List<ScimEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<ScimEmail> emails) {
    this.emails = emails;
  }

  
  /**
   * Photos
   **/
  public Manager photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Photos")
  @JsonProperty("photos")
  public List<Photo> getPhotos() {
    return photos;
  }
  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  
  /**
   * Group References
   **/
  public Manager groups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group References")
  @JsonProperty("groups")
  public List<ScimV2GroupReference> getGroups() {
    return groups;
  }
  public void setGroups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
  }

  
  /**
   **/
  public Manager meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  
  /**
   **/
  public Manager urnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
  public ScimV2EnterpriseUser getUrnietfparamsscimschemasextensionenterprise20User() {
    return urnietfparamsscimschemasextensionenterprise20User;
  }
  public void setUrnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
  }

  
  /**
   * Identifier of the Manager
   **/
  public Manager value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the Manager")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  @ApiModelProperty(example = "null", value = "Ref to entity")
  @JsonProperty("$ref")
  public String getRef() {
    return ref;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager manager = (Manager) o;
    return Objects.equals(this.displayName, manager.displayName) &&
        Objects.equals(this.active, manager.active) &&
        Objects.equals(this.userName, manager.userName) &&
        Objects.equals(this.password, manager.password) &&
        Objects.equals(this.title, manager.title) &&
        Objects.equals(this.phoneNumbers, manager.phoneNumbers) &&
        Objects.equals(this.emails, manager.emails) &&
        Objects.equals(this.photos, manager.photos) &&
        Objects.equals(this.groups, manager.groups) &&
        Objects.equals(this.meta, manager.meta) &&
        Objects.equals(this.urnietfparamsscimschemasextensionenterprise20User, manager.urnietfparamsscimschemasextensionenterprise20User) &&
        Objects.equals(this.value, manager.value) &&
        Objects.equals(this.ref, manager.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, active, userName, password, title, phoneNumbers, emails, photos, groups, meta, urnietfparamsscimschemasextensionenterprise20User, value, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    urnietfparamsscimschemasextensionenterprise20User: ").append(toIndentedString(urnietfparamsscimschemasextensionenterprise20User)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

