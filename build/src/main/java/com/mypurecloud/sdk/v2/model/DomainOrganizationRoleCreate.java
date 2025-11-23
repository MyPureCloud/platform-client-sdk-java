package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DomainPermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DomainOrganizationRoleCreate
 */

public class DomainOrganizationRoleCreate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String defaultRoleId = null;
  private List<String> permissions = null;
  private List<String> unusedPermissions = null;
  private List<DomainPermissionPolicy> permissionPolicies = null;
  private Integer userCount = null;
  private Boolean roleNeedsUpdate = null;
  private String baseLicense = null;
  private List<String> addonLicenses = null;
  private Date dateLicenseLastUpdated = null;
  private Boolean _default = null;
  private Boolean base = null;
  private String selfUri = null;

  public DomainOrganizationRoleCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      permissions = new ArrayList<String>();
      unusedPermissions = new ArrayList<String>();
      permissionPolicies = new ArrayList<DomainPermissionPolicy>();
      addonLicenses = new ArrayList<String>();
    }
  }

  
  /**
   * role id
   **/
  public DomainOrganizationRoleCreate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "role id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The role name
   **/
  public DomainOrganizationRoleCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The role name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public DomainOrganizationRoleCreate description(String description) {
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
   **/
  public DomainOrganizationRoleCreate defaultRoleId(String defaultRoleId) {
    this.defaultRoleId = defaultRoleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultRoleId")
  public String getDefaultRoleId() {
    return defaultRoleId;
  }
  public void setDefaultRoleId(String defaultRoleId) {
    this.defaultRoleId = defaultRoleId;
  }


  /**
   **/
  public DomainOrganizationRoleCreate permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @ApiModelProperty(example = "null", value = "A collection of the permissions the role is not using")
  @JsonProperty("unusedPermissions")
  public List<String> getUnusedPermissions() {
    return unusedPermissions;
  }


  /**
   **/
  public DomainOrganizationRoleCreate permissionPolicies(List<DomainPermissionPolicy> permissionPolicies) {
    this.permissionPolicies = permissionPolicies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissionPolicies")
  public List<DomainPermissionPolicy> getPermissionPolicies() {
    return permissionPolicies;
  }
  public void setPermissionPolicies(List<DomainPermissionPolicy> permissionPolicies) {
    this.permissionPolicies = permissionPolicies;
  }


  /**
   **/
  public DomainOrganizationRoleCreate userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userCount")
  public Integer getUserCount() {
    return userCount;
  }
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  /**
   * Optional unless patch operation.
   **/
  public DomainOrganizationRoleCreate roleNeedsUpdate(Boolean roleNeedsUpdate) {
    this.roleNeedsUpdate = roleNeedsUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unless patch operation.")
  @JsonProperty("roleNeedsUpdate")
  public Boolean getRoleNeedsUpdate() {
    return roleNeedsUpdate;
  }
  public void setRoleNeedsUpdate(Boolean roleNeedsUpdate) {
    this.roleNeedsUpdate = roleNeedsUpdate;
  }


  /**
   **/
  public DomainOrganizationRoleCreate baseLicense(String baseLicense) {
    this.baseLicense = baseLicense;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseLicense")
  public String getBaseLicense() {
    return baseLicense;
  }
  public void setBaseLicense(String baseLicense) {
    this.baseLicense = baseLicense;
  }


  /**
   **/
  public DomainOrganizationRoleCreate addonLicenses(List<String> addonLicenses) {
    this.addonLicenses = addonLicenses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addonLicenses")
  public List<String> getAddonLicenses() {
    return addonLicenses;
  }
  public void setAddonLicenses(List<String> addonLicenses) {
    this.addonLicenses = addonLicenses;
  }


  @ApiModelProperty(example = "null", value = "The time that this role licenses were most recently updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLicenseLastUpdated")
  public Date getDateLicenseLastUpdated() {
    return dateLicenseLastUpdated;
  }


  /**
   **/
  public DomainOrganizationRoleCreate _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  /**
   **/
  public DomainOrganizationRoleCreate base(Boolean base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("base")
  public Boolean getBase() {
    return base;
  }
  public void setBase(Boolean base) {
    this.base = base;
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
    DomainOrganizationRoleCreate domainOrganizationRoleCreate = (DomainOrganizationRoleCreate) o;

    return Objects.equals(this.id, domainOrganizationRoleCreate.id) &&
            Objects.equals(this.name, domainOrganizationRoleCreate.name) &&
            Objects.equals(this.description, domainOrganizationRoleCreate.description) &&
            Objects.equals(this.defaultRoleId, domainOrganizationRoleCreate.defaultRoleId) &&
            Objects.equals(this.permissions, domainOrganizationRoleCreate.permissions) &&
            Objects.equals(this.unusedPermissions, domainOrganizationRoleCreate.unusedPermissions) &&
            Objects.equals(this.permissionPolicies, domainOrganizationRoleCreate.permissionPolicies) &&
            Objects.equals(this.userCount, domainOrganizationRoleCreate.userCount) &&
            Objects.equals(this.roleNeedsUpdate, domainOrganizationRoleCreate.roleNeedsUpdate) &&
            Objects.equals(this.baseLicense, domainOrganizationRoleCreate.baseLicense) &&
            Objects.equals(this.addonLicenses, domainOrganizationRoleCreate.addonLicenses) &&
            Objects.equals(this.dateLicenseLastUpdated, domainOrganizationRoleCreate.dateLicenseLastUpdated) &&
            Objects.equals(this._default, domainOrganizationRoleCreate._default) &&
            Objects.equals(this.base, domainOrganizationRoleCreate.base) &&
            Objects.equals(this.selfUri, domainOrganizationRoleCreate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultRoleId, permissions, unusedPermissions, permissionPolicies, userCount, roleNeedsUpdate, baseLicense, addonLicenses, dateLicenseLastUpdated, _default, base, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainOrganizationRoleCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultRoleId: ").append(toIndentedString(defaultRoleId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    unusedPermissions: ").append(toIndentedString(unusedPermissions)).append("\n");
    sb.append("    permissionPolicies: ").append(toIndentedString(permissionPolicies)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    roleNeedsUpdate: ").append(toIndentedString(roleNeedsUpdate)).append("\n");
    sb.append("    baseLicense: ").append(toIndentedString(baseLicense)).append("\n");
    sb.append("    addonLicenses: ").append(toIndentedString(addonLicenses)).append("\n");
    sb.append("    dateLicenseLastUpdated: ").append(toIndentedString(dateLicenseLastUpdated)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
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

