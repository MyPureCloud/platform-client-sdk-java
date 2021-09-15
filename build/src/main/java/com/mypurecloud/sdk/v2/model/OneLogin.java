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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OneLogin
 */

public class OneLogin  implements Serializable {
  
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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public OneLogin name(String name) {
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
  public OneLogin disabled(Boolean disabled) {
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
  public OneLogin issuerURI(String issuerURI) {
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
  public OneLogin ssoTargetURI(String ssoTargetURI) {
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
  public OneLogin sloURI(String sloURI) {
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
  public OneLogin sloBinding(String sloBinding) {
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
  public OneLogin relyingPartyIdentifier(String relyingPartyIdentifier) {
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
  public OneLogin certificate(String certificate) {
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
  public OneLogin certificates(List<String> certificates) {
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
    OneLogin oneLogin = (OneLogin) o;
    return Objects.equals(this.id, oneLogin.id) &&
        Objects.equals(this.name, oneLogin.name) &&
        Objects.equals(this.disabled, oneLogin.disabled) &&
        Objects.equals(this.issuerURI, oneLogin.issuerURI) &&
        Objects.equals(this.ssoTargetURI, oneLogin.ssoTargetURI) &&
        Objects.equals(this.sloURI, oneLogin.sloURI) &&
        Objects.equals(this.sloBinding, oneLogin.sloBinding) &&
        Objects.equals(this.relyingPartyIdentifier, oneLogin.relyingPartyIdentifier) &&
        Objects.equals(this.certificate, oneLogin.certificate) &&
        Objects.equals(this.certificates, oneLogin.certificates) &&
        Objects.equals(this.selfUri, oneLogin.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, disabled, issuerURI, ssoTargetURI, sloURI, sloBinding, relyingPartyIdentifier, certificate, certificates, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneLogin {\n");
    
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

