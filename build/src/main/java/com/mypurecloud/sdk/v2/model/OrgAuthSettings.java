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
import com.fasterxml.jackson.annotation.JsonValue;
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
  private List<String> domainAllowlist = null;
  private List<String> ipAddressAllowlist = null;
  private PasswordRequirements passwordRequirements = null;
  private List<String> inactivityTimeoutExclusions = null;
  private Boolean universalLogout = null;

  private static class TokenStorageLocationEnumDeserializer extends StdDeserializer<TokenStorageLocationEnum> {
    public TokenStorageLocationEnumDeserializer() {
      super(TokenStorageLocationEnumDeserializer.class);
    }

    @Override
    public TokenStorageLocationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TokenStorageLocationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The browser storage location used for authentication tokens.
   */
 @JsonDeserialize(using = TokenStorageLocationEnumDeserializer.class)
  public enum TokenStorageLocationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PERSISTENT("persistent"),
    SESSION("session");

    private String value;

    TokenStorageLocationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TokenStorageLocationEnum fromString(String key) {
      if (key == null) return null;

      for (TokenStorageLocationEnum value : TokenStorageLocationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TokenStorageLocationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TokenStorageLocationEnum tokenStorageLocation = null;

  public OrgAuthSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      domainAllowlist = new ArrayList<String>();
      ipAddressAllowlist = new ArrayList<String>();
      inactivityTimeoutExclusions = new ArrayList<String>();
    }
  }

  public OrgAuthSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      domainAllowlist = new ArrayList<String>();
      ipAddressAllowlist = new ArrayList<String>();
      inactivityTimeoutExclusions = new ArrayList<String>();
    }
  }

  
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


  /**
   * The list of exempt apis from inactivity timeout.
   **/
  public OrgAuthSettings inactivityTimeoutExclusions(List<String> inactivityTimeoutExclusions) {
    this.inactivityTimeoutExclusions = inactivityTimeoutExclusions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of exempt apis from inactivity timeout.")
  @JsonProperty("inactivityTimeoutExclusions")
  public List<String> getInactivityTimeoutExclusions() {
    return inactivityTimeoutExclusions;
  }
  public void setInactivityTimeoutExclusions(List<String> inactivityTimeoutExclusions) {
    this.inactivityTimeoutExclusions = inactivityTimeoutExclusions;
  }


  /**
   * Indicates whether universal logout is enabled for the organization.
   **/
  public OrgAuthSettings universalLogout(Boolean universalLogout) {
    this.universalLogout = universalLogout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether universal logout is enabled for the organization.")
  @JsonProperty("universalLogout")
  public Boolean getUniversalLogout() {
    return universalLogout;
  }
  public void setUniversalLogout(Boolean universalLogout) {
    this.universalLogout = universalLogout;
  }


  /**
   * The browser storage location used for authentication tokens.
   **/
  public OrgAuthSettings tokenStorageLocation(TokenStorageLocationEnum tokenStorageLocation) {
    this.tokenStorageLocation = tokenStorageLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The browser storage location used for authentication tokens.")
  @JsonProperty("tokenStorageLocation")
  public TokenStorageLocationEnum getTokenStorageLocation() {
    return tokenStorageLocation;
  }
  public void setTokenStorageLocation(TokenStorageLocationEnum tokenStorageLocation) {
    this.tokenStorageLocation = tokenStorageLocation;
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
            Objects.equals(this.passwordRequirements, orgAuthSettings.passwordRequirements) &&
            Objects.equals(this.inactivityTimeoutExclusions, orgAuthSettings.inactivityTimeoutExclusions) &&
            Objects.equals(this.universalLogout, orgAuthSettings.universalLogout) &&
            Objects.equals(this.tokenStorageLocation, orgAuthSettings.tokenStorageLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multifactorAuthenticationRequired, domainAllowlistEnabled, domainAllowlist, ipAddressAllowlist, passwordRequirements, inactivityTimeoutExclusions, universalLogout, tokenStorageLocation);
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
    sb.append("    inactivityTimeoutExclusions: ").append(toIndentedString(inactivityTimeoutExclusions)).append("\n");
    sb.append("    universalLogout: ").append(toIndentedString(universalLogout)).append("\n");
    sb.append("    tokenStorageLocation: ").append(toIndentedString(tokenStorageLocation)).append("\n");
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

