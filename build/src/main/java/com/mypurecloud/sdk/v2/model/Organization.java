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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Organization
 */

public class Organization  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String defaultLanguage = null;
  private String defaultCountryCode = null;
  private String thirdPartyOrgName = null;
  private String thirdPartyURI = null;
  private String domain = null;
  private Integer version = null;

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
   * The current state. Examples are active, inactive, deleted.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

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
  private String defaultSiteId = null;
  private String supportURI = null;
  private Boolean voicemailEnabled = null;

  private static class ProductPlatformEnumDeserializer extends StdDeserializer<ProductPlatformEnum> {
    public ProductPlatformEnumDeserializer() {
      super(ProductPlatformEnumDeserializer.class);
    }

    @Override
    public ProductPlatformEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ProductPlatformEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Organizations Originating Platform.
   */
 @JsonDeserialize(using = ProductPlatformEnumDeserializer.class)
  public enum ProductPlatformEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENESYSCLOUD("GenesysCloud"),
    PURECLOUD("PureCloud"),
    PUREENGAGE("PureEngage"),
    PUREENGAGECLOUD("PureEngageCloud"),
    PURECONNECT("PureConnect"),
    PURECONNECTCLOUD("PureConnectCloud"),
    UNKNOWN("Unknown");

    private String value;

    ProductPlatformEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ProductPlatformEnum fromString(String key) {
      if (key == null) return null;

      for (ProductPlatformEnum value : ProductPlatformEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ProductPlatformEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ProductPlatformEnum productPlatform = null;
  private String selfUri = null;
  private Map<String, Boolean> features = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Organization name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The default language for this organization. Example: 'en'
   **/
  public Organization defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default language for this organization. Example: 'en'")
  @JsonProperty("defaultLanguage")
  public String getDefaultLanguage() {
    return defaultLanguage;
  }
  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  
  /**
   * The default country code for this organization. Example: 'US'
   **/
  public Organization defaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default country code for this organization. Example: 'US'")
  @JsonProperty("defaultCountryCode")
  public String getDefaultCountryCode() {
    return defaultCountryCode;
  }
  public void setDefaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
  }

  
  @ApiModelProperty(example = "null", value = "The short name for the organization. This field is globally unique and cannot be changed.")
  @JsonProperty("thirdPartyOrgName")
  public String getThirdPartyOrgName() {
    return thirdPartyOrgName;
  }

  
  /**
   **/
  public Organization thirdPartyURI(String thirdPartyURI) {
    this.thirdPartyURI = thirdPartyURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyURI")
  public String getThirdPartyURI() {
    return thirdPartyURI;
  }
  public void setThirdPartyURI(String thirdPartyURI) {
    this.thirdPartyURI = thirdPartyURI;
  }

  
  /**
   **/
  public Organization domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * The current version of the organization.
   **/
  public Organization version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current version of the organization.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The current state. Examples are active, inactive, deleted.
   **/
  public Organization state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current state. Examples are active, inactive, deleted.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public Organization defaultSiteId(String defaultSiteId) {
    this.defaultSiteId = defaultSiteId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultSiteId")
  public String getDefaultSiteId() {
    return defaultSiteId;
  }
  public void setDefaultSiteId(String defaultSiteId) {
    this.defaultSiteId = defaultSiteId;
  }

  
  /**
   * Email address where support tickets are sent to.
   **/
  public Organization supportURI(String supportURI) {
    this.supportURI = supportURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email address where support tickets are sent to.")
  @JsonProperty("supportURI")
  public String getSupportURI() {
    return supportURI;
  }
  public void setSupportURI(String supportURI) {
    this.supportURI = supportURI;
  }

  
  /**
   **/
  public Organization voicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voicemailEnabled")
  public Boolean getVoicemailEnabled() {
    return voicemailEnabled;
  }
  public void setVoicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
  }

  
  @ApiModelProperty(example = "null", value = "Organizations Originating Platform.")
  @JsonProperty("productPlatform")
  public ProductPlatformEnum getProductPlatform() {
    return productPlatform;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "The state of features available for the organization.")
  @JsonProperty("features")
  public Map<String, Boolean> getFeatures() {
    return features;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.defaultLanguage, organization.defaultLanguage) &&
        Objects.equals(this.defaultCountryCode, organization.defaultCountryCode) &&
        Objects.equals(this.thirdPartyOrgName, organization.thirdPartyOrgName) &&
        Objects.equals(this.thirdPartyURI, organization.thirdPartyURI) &&
        Objects.equals(this.domain, organization.domain) &&
        Objects.equals(this.version, organization.version) &&
        Objects.equals(this.state, organization.state) &&
        Objects.equals(this.defaultSiteId, organization.defaultSiteId) &&
        Objects.equals(this.supportURI, organization.supportURI) &&
        Objects.equals(this.voicemailEnabled, organization.voicemailEnabled) &&
        Objects.equals(this.productPlatform, organization.productPlatform) &&
        Objects.equals(this.selfUri, organization.selfUri) &&
        Objects.equals(this.features, organization.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, defaultLanguage, defaultCountryCode, thirdPartyOrgName, thirdPartyURI, domain, version, state, defaultSiteId, supportURI, voicemailEnabled, productPlatform, selfUri, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    defaultCountryCode: ").append(toIndentedString(defaultCountryCode)).append("\n");
    sb.append("    thirdPartyOrgName: ").append(toIndentedString(thirdPartyOrgName)).append("\n");
    sb.append("    thirdPartyURI: ").append(toIndentedString(thirdPartyURI)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    defaultSiteId: ").append(toIndentedString(defaultSiteId)).append("\n");
    sb.append("    supportURI: ").append(toIndentedString(supportURI)).append("\n");
    sb.append("    voicemailEnabled: ").append(toIndentedString(voicemailEnabled)).append("\n");
    sb.append("    productPlatform: ").append(toIndentedString(productPlatform)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

