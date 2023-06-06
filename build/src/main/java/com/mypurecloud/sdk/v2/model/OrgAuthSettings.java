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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PasswordRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OrgAuthSettings
 */

public class OrgAuthSettings  implements Serializable {
  
  private Boolean multifactorAuthenticationRequired = null;
  private Boolean domainAllowlistEnabled = null;
  private List<String> domainAllowlist = new ArrayList<String>();
  private List<String> ipAddressAllowlist = new ArrayList<String>();
  private PasswordRequirements passwordRequirements = null;

  
  /**
   * Indicates whether multi-factor authentication is required.
   **/
  public OrgAuthSettings multifactorAuthenticationRequired(Boolean multifactorAuthenticationRequired) {
    this.multifactorAuthenticationRequired = multifactorAuthenticationRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether multi-factor authentication is required.")
  @JsonProperty("multifactorAuthenticationRequired")
  public Boolean getMultifactorAuthenticationRequired() {
    return multifactorAuthenticationRequired;
  }
  public void setMultifactorAuthenticationRequired(Boolean multifactorAuthenticationRequired) {
    this.multifactorAuthenticationRequired = multifactorAuthenticationRequired;
  }


  /**
   * Indicates whether the domain allowlist is enabled.
   **/
  public OrgAuthSettings domainAllowlistEnabled(Boolean domainAllowlistEnabled) {
    this.domainAllowlistEnabled = domainAllowlistEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the domain allowlist is enabled.")
  @JsonProperty("domainAllowlistEnabled")
  public Boolean getDomainAllowlistEnabled() {
    return domainAllowlistEnabled;
  }
  public void setDomainAllowlistEnabled(Boolean domainAllowlistEnabled) {
    this.domainAllowlistEnabled = domainAllowlistEnabled;
  }


  /**
   * The list of domains that will be allowed to embed Genesys Cloud applications.
   **/
  public OrgAuthSettings domainAllowlist(List<String> domainAllowlist) {
    this.domainAllowlist = domainAllowlist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of domains that will be allowed to embed Genesys Cloud applications.")
  @JsonProperty("domainAllowlist")
  public List<String> getDomainAllowlist() {
    return domainAllowlist;
  }
  public void setDomainAllowlist(List<String> domainAllowlist) {
    this.domainAllowlist = domainAllowlist;
  }


  /**
   * The list of IP addresses that will be allowed to authenticate with Genesys Cloud.
   **/
  public OrgAuthSettings ipAddressAllowlist(List<String> ipAddressAllowlist) {
    this.ipAddressAllowlist = ipAddressAllowlist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of IP addresses that will be allowed to authenticate with Genesys Cloud.")
  @JsonProperty("ipAddressAllowlist")
  public List<String> getIpAddressAllowlist() {
    return ipAddressAllowlist;
  }
  public void setIpAddressAllowlist(List<String> ipAddressAllowlist) {
    this.ipAddressAllowlist = ipAddressAllowlist;
  }


  /**
   * The password requirements for the organization.
   **/
  public OrgAuthSettings passwordRequirements(PasswordRequirements passwordRequirements) {
    this.passwordRequirements = passwordRequirements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The password requirements for the organization.")
  @JsonProperty("passwordRequirements")
  public PasswordRequirements getPasswordRequirements() {
    return passwordRequirements;
  }
  public void setPasswordRequirements(PasswordRequirements passwordRequirements) {
    this.passwordRequirements = passwordRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgAuthSettings orgAuthSettings = (OrgAuthSettings) o;

    return Objects.equals(this.multifactorAuthenticationRequired, orgAuthSettings.multifactorAuthenticationRequired) &&
            Objects.equals(this.domainAllowlistEnabled, orgAuthSettings.domainAllowlistEnabled) &&
            Objects.equals(this.domainAllowlist, orgAuthSettings.domainAllowlist) &&
            Objects.equals(this.ipAddressAllowlist, orgAuthSettings.ipAddressAllowlist) &&
            Objects.equals(this.passwordRequirements, orgAuthSettings.passwordRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multifactorAuthenticationRequired, domainAllowlistEnabled, domainAllowlist, ipAddressAllowlist, passwordRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAuthSettings {\n");
    
    sb.append("    multifactorAuthenticationRequired: ").append(toIndentedString(multifactorAuthenticationRequired)).append("\n");
    sb.append("    domainAllowlistEnabled: ").append(toIndentedString(domainAllowlistEnabled)).append("\n");
    sb.append("    domainAllowlist: ").append(toIndentedString(domainAllowlist)).append("\n");
    sb.append("    ipAddressAllowlist: ").append(toIndentedString(ipAddressAllowlist)).append("\n");
    sb.append("    passwordRequirements: ").append(toIndentedString(passwordRequirements)).append("\n");
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

