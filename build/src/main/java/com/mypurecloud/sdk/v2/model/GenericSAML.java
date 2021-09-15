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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GenericSAML
 */

public class GenericSAML  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean disabled = null;
  private String issuerURI = null;
  private String ssoTargetURI = null;
  private String sloURI = null;
  private String sloBinding = null;
  private String relyingPartyIdentifier = null;
  private String certificate = null;
  private List<String> certificates = new ArrayList<String>();
  private String logoImageData = null;
  private Boolean endpointCompression = null;

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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public GenericSAML name(String name) {
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
  public GenericSAML disabled(Boolean disabled) {
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
  public GenericSAML issuerURI(String issuerURI) {
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
  public GenericSAML ssoTargetURI(String ssoTargetURI) {
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
  public GenericSAML sloURI(String sloURI) {
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
  public GenericSAML sloBinding(String sloBinding) {
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
  public GenericSAML relyingPartyIdentifier(String relyingPartyIdentifier) {
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
  public GenericSAML certificate(String certificate) {
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
  public GenericSAML certificates(List<String> certificates) {
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
  public GenericSAML logoImageData(String logoImageData) {
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
  public GenericSAML endpointCompression(Boolean endpointCompression) {
    this.endpointCompression = endpointCompression;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endpointCompression")
  public Boolean getEndpointCompression() {
    return endpointCompression;
  }
  public void setEndpointCompression(Boolean endpointCompression) {
    this.endpointCompression = endpointCompression;
  }

  
  /**
   **/
  public GenericSAML nameIdentifierFormat(NameIdentifierFormatEnum nameIdentifierFormat) {
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
    GenericSAML genericSAML = (GenericSAML) o;
    return Objects.equals(this.id, genericSAML.id) &&
        Objects.equals(this.name, genericSAML.name) &&
        Objects.equals(this.disabled, genericSAML.disabled) &&
        Objects.equals(this.issuerURI, genericSAML.issuerURI) &&
        Objects.equals(this.ssoTargetURI, genericSAML.ssoTargetURI) &&
        Objects.equals(this.sloURI, genericSAML.sloURI) &&
        Objects.equals(this.sloBinding, genericSAML.sloBinding) &&
        Objects.equals(this.relyingPartyIdentifier, genericSAML.relyingPartyIdentifier) &&
        Objects.equals(this.certificate, genericSAML.certificate) &&
        Objects.equals(this.certificates, genericSAML.certificates) &&
        Objects.equals(this.logoImageData, genericSAML.logoImageData) &&
        Objects.equals(this.endpointCompression, genericSAML.endpointCompression) &&
        Objects.equals(this.nameIdentifierFormat, genericSAML.nameIdentifierFormat) &&
        Objects.equals(this.selfUri, genericSAML.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, disabled, issuerURI, ssoTargetURI, sloURI, sloBinding, relyingPartyIdentifier, certificate, certificates, logoImageData, endpointCompression, nameIdentifierFormat, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericSAML {\n");
    
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
    sb.append("    endpointCompression: ").append(toIndentedString(endpointCompression)).append("\n");
    sb.append("    nameIdentifierFormat: ").append(toIndentedString(nameIdentifierFormat)).append("\n");
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

