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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Salesforce
 */

public class Salesforce  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean disabled = null;
  private String issuerURI = null;
  private String ssoTargetURI = null;
  private String sloURI = null;
  private String sloBinding = null;
  private String relyingPartyIdentifier = null;
  private String certificate = null;
  private List<String> certificates = null;
  private String logoImageData = null;

  private static class NameIdentifierFormatEnumDeserializer extends StdDeserializer<NameIdentifierFormatEnum> {
    public NameIdentifierFormatEnumDeserializer() {
      super(NameIdentifierFormatEnumDeserializer.class);
    }

    @Override
    public NameIdentifierFormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameIdentifierFormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets nameIdentifierFormat
   */
 @JsonDeserialize(using = NameIdentifierFormatEnumDeserializer.class)
  public enum NameIdentifierFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_UNSPECIFIED("urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"),
    URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_EMAILADDRESS("urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress"),
    URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_X509SUBJECTNAME("urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName"),
    URN_OASIS_NAMES_TC_SAML_1_1_NAMEID_FORMAT_WINDOWSDOMAINQUALIFIEDNAME("urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName"),
    URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_KERBEROS("urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos"),
    URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_ENTITY("urn:oasis:names:tc:SAML:2.0:nameid-format:entity"),
    URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_PERSISTENT("urn:oasis:names:tc:SAML:2.0:nameid-format:persistent"),
    URN_OASIS_NAMES_TC_SAML_2_0_NAMEID_FORMAT_TRANSIENT("urn:oasis:names:tc:SAML:2.0:nameid-format:transient");

    private String value;

    NameIdentifierFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameIdentifierFormatEnum fromString(String key) {
      if (key == null) return null;

      for (NameIdentifierFormatEnum value : NameIdentifierFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameIdentifierFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameIdentifierFormatEnum nameIdentifierFormat = null;

  private static class SsoBindingEnumDeserializer extends StdDeserializer<SsoBindingEnum> {
    public SsoBindingEnumDeserializer() {
      super(SsoBindingEnumDeserializer.class);
    }

    @Override
    public SsoBindingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SsoBindingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets ssoBinding
   */
 @JsonDeserialize(using = SsoBindingEnumDeserializer.class)
  public enum SsoBindingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    URN_OASIS_NAMES_TC_SAML_2_0_BINDINGS_HTTP_POST("urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST"),
    URN_OASIS_NAMES_TC_SAML_2_0_BINDINGS_HTTP_REDIRECT("urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect");

    private String value;

    SsoBindingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SsoBindingEnum fromString(String key) {
      if (key == null) return null;

      for (SsoBindingEnum value : SsoBindingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SsoBindingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SsoBindingEnum ssoBinding = null;
  private Boolean signAuthnRequests = null;
  private String providerName = null;
  private Boolean displayOnLogin = null;
  private String metadataURL = null;
  private String selfUri = null;

  public Salesforce() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      certificates = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public Salesforce name(String name) {
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
   **/
  public Salesforce disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  /**
   **/
  public Salesforce issuerURI(String issuerURI) {
    this.issuerURI = issuerURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("issuerURI")
  public String getIssuerURI() {
    return issuerURI;
  }
  public void setIssuerURI(String issuerURI) {
    this.issuerURI = issuerURI;
  }


  /**
   **/
  public Salesforce ssoTargetURI(String ssoTargetURI) {
    this.ssoTargetURI = ssoTargetURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ssoTargetURI")
  public String getSsoTargetURI() {
    return ssoTargetURI;
  }
  public void setSsoTargetURI(String ssoTargetURI) {
    this.ssoTargetURI = ssoTargetURI;
  }


  /**
   **/
  public Salesforce sloURI(String sloURI) {
    this.sloURI = sloURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sloURI")
  public String getSloURI() {
    return sloURI;
  }
  public void setSloURI(String sloURI) {
    this.sloURI = sloURI;
  }


  /**
   **/
  public Salesforce sloBinding(String sloBinding) {
    this.sloBinding = sloBinding;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sloBinding")
  public String getSloBinding() {
    return sloBinding;
  }
  public void setSloBinding(String sloBinding) {
    this.sloBinding = sloBinding;
  }


  /**
   **/
  public Salesforce relyingPartyIdentifier(String relyingPartyIdentifier) {
    this.relyingPartyIdentifier = relyingPartyIdentifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relyingPartyIdentifier")
  public String getRelyingPartyIdentifier() {
    return relyingPartyIdentifier;
  }
  public void setRelyingPartyIdentifier(String relyingPartyIdentifier) {
    this.relyingPartyIdentifier = relyingPartyIdentifier;
  }


  /**
   **/
  public Salesforce certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  /**
   **/
  public Salesforce certificates(List<String> certificates) {
    this.certificates = certificates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("certificates")
  public List<String> getCertificates() {
    return certificates;
  }
  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }


  /**
   **/
  public Salesforce logoImageData(String logoImageData) {
    this.logoImageData = logoImageData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("logoImageData")
  public String getLogoImageData() {
    return logoImageData;
  }
  public void setLogoImageData(String logoImageData) {
    this.logoImageData = logoImageData;
  }


  /**
   **/
  public Salesforce nameIdentifierFormat(NameIdentifierFormatEnum nameIdentifierFormat) {
    this.nameIdentifierFormat = nameIdentifierFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nameIdentifierFormat")
  public NameIdentifierFormatEnum getNameIdentifierFormat() {
    return nameIdentifierFormat;
  }
  public void setNameIdentifierFormat(NameIdentifierFormatEnum nameIdentifierFormat) {
    this.nameIdentifierFormat = nameIdentifierFormat;
  }


  /**
   **/
  public Salesforce ssoBinding(SsoBindingEnum ssoBinding) {
    this.ssoBinding = ssoBinding;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ssoBinding")
  public SsoBindingEnum getSsoBinding() {
    return ssoBinding;
  }
  public void setSsoBinding(SsoBindingEnum ssoBinding) {
    this.ssoBinding = ssoBinding;
  }


  /**
   **/
  public Salesforce signAuthnRequests(Boolean signAuthnRequests) {
    this.signAuthnRequests = signAuthnRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signAuthnRequests")
  public Boolean getSignAuthnRequests() {
    return signAuthnRequests;
  }
  public void setSignAuthnRequests(Boolean signAuthnRequests) {
    this.signAuthnRequests = signAuthnRequests;
  }


  /**
   **/
  public Salesforce providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerName")
  public String getProviderName() {
    return providerName;
  }
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  /**
   **/
  public Salesforce displayOnLogin(Boolean displayOnLogin) {
    this.displayOnLogin = displayOnLogin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayOnLogin")
  public Boolean getDisplayOnLogin() {
    return displayOnLogin;
  }
  public void setDisplayOnLogin(Boolean displayOnLogin) {
    this.displayOnLogin = displayOnLogin;
  }


  /**
   **/
  public Salesforce metadataURL(String metadataURL) {
    this.metadataURL = metadataURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadataURL")
  public String getMetadataURL() {
    return metadataURL;
  }
  public void setMetadataURL(String metadataURL) {
    this.metadataURL = metadataURL;
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
    Salesforce salesforce = (Salesforce) o;

    return Objects.equals(this.id, salesforce.id) &&
            Objects.equals(this.name, salesforce.name) &&
            Objects.equals(this.disabled, salesforce.disabled) &&
            Objects.equals(this.issuerURI, salesforce.issuerURI) &&
            Objects.equals(this.ssoTargetURI, salesforce.ssoTargetURI) &&
            Objects.equals(this.sloURI, salesforce.sloURI) &&
            Objects.equals(this.sloBinding, salesforce.sloBinding) &&
            Objects.equals(this.relyingPartyIdentifier, salesforce.relyingPartyIdentifier) &&
            Objects.equals(this.certificate, salesforce.certificate) &&
            Objects.equals(this.certificates, salesforce.certificates) &&
            Objects.equals(this.logoImageData, salesforce.logoImageData) &&
            Objects.equals(this.nameIdentifierFormat, salesforce.nameIdentifierFormat) &&
            Objects.equals(this.ssoBinding, salesforce.ssoBinding) &&
            Objects.equals(this.signAuthnRequests, salesforce.signAuthnRequests) &&
            Objects.equals(this.providerName, salesforce.providerName) &&
            Objects.equals(this.displayOnLogin, salesforce.displayOnLogin) &&
            Objects.equals(this.metadataURL, salesforce.metadataURL) &&
            Objects.equals(this.selfUri, salesforce.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, disabled, issuerURI, ssoTargetURI, sloURI, sloBinding, relyingPartyIdentifier, certificate, certificates, logoImageData, nameIdentifierFormat, ssoBinding, signAuthnRequests, providerName, displayOnLogin, metadataURL, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Salesforce {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    issuerURI: ").append(toIndentedString(issuerURI)).append("\n");
    sb.append("    ssoTargetURI: ").append(toIndentedString(ssoTargetURI)).append("\n");
    sb.append("    sloURI: ").append(toIndentedString(sloURI)).append("\n");
    sb.append("    sloBinding: ").append(toIndentedString(sloBinding)).append("\n");
    sb.append("    relyingPartyIdentifier: ").append(toIndentedString(relyingPartyIdentifier)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    logoImageData: ").append(toIndentedString(logoImageData)).append("\n");
    sb.append("    nameIdentifierFormat: ").append(toIndentedString(nameIdentifierFormat)).append("\n");
    sb.append("    ssoBinding: ").append(toIndentedString(ssoBinding)).append("\n");
    sb.append("    signAuthnRequests: ").append(toIndentedString(signAuthnRequests)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    displayOnLogin: ").append(toIndentedString(displayOnLogin)).append("\n");
    sb.append("    metadataURL: ").append(toIndentedString(metadataURL)).append("\n");
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

