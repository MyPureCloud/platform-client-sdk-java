package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GenericSAML
 */

public class GenericSAML  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String logoImageData = null;
  private String relyingPartyIdentifier = null;
  private Boolean endpointCompression = null;
  private String certificate = null;
  private String issuerURI = null;
  private String ssoTargetURI = null;
  private Boolean disabled = null;
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
        Objects.equals(this.logoImageData, genericSAML.logoImageData) &&
        Objects.equals(this.relyingPartyIdentifier, genericSAML.relyingPartyIdentifier) &&
        Objects.equals(this.endpointCompression, genericSAML.endpointCompression) &&
        Objects.equals(this.certificate, genericSAML.certificate) &&
        Objects.equals(this.issuerURI, genericSAML.issuerURI) &&
        Objects.equals(this.ssoTargetURI, genericSAML.ssoTargetURI) &&
        Objects.equals(this.disabled, genericSAML.disabled) &&
        Objects.equals(this.selfUri, genericSAML.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logoImageData, relyingPartyIdentifier, endpointCompression, certificate, issuerURI, ssoTargetURI, disabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericSAML {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logoImageData: ").append(toIndentedString(logoImageData)).append("\n");
    sb.append("    relyingPartyIdentifier: ").append(toIndentedString(relyingPartyIdentifier)).append("\n");
    sb.append("    endpointCompression: ").append(toIndentedString(endpointCompression)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    issuerURI: ").append(toIndentedString(issuerURI)).append("\n");
    sb.append("    ssoTargetURI: ").append(toIndentedString(ssoTargetURI)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

