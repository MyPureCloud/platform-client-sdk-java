package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PureEngage
 */

public class PureEngage  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean autoProvisionUsers = null;
  private String issuerURI = null;
  private String certificate = null;
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
  public PureEngage name(String name) {
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
  public PureEngage autoProvisionUsers(Boolean autoProvisionUsers) {
    this.autoProvisionUsers = autoProvisionUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autoProvisionUsers")
  public Boolean getAutoProvisionUsers() {
    return autoProvisionUsers;
  }
  public void setAutoProvisionUsers(Boolean autoProvisionUsers) {
    this.autoProvisionUsers = autoProvisionUsers;
  }

  
  /**
   **/
  public PureEngage issuerURI(String issuerURI) {
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
  public PureEngage certificate(String certificate) {
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
  public PureEngage ssoTargetURI(String ssoTargetURI) {
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
  public PureEngage disabled(Boolean disabled) {
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
    PureEngage pureEngage = (PureEngage) o;
    return Objects.equals(this.id, pureEngage.id) &&
        Objects.equals(this.name, pureEngage.name) &&
        Objects.equals(this.autoProvisionUsers, pureEngage.autoProvisionUsers) &&
        Objects.equals(this.issuerURI, pureEngage.issuerURI) &&
        Objects.equals(this.certificate, pureEngage.certificate) &&
        Objects.equals(this.ssoTargetURI, pureEngage.ssoTargetURI) &&
        Objects.equals(this.disabled, pureEngage.disabled) &&
        Objects.equals(this.selfUri, pureEngage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, autoProvisionUsers, issuerURI, certificate, ssoTargetURI, disabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PureEngage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autoProvisionUsers: ").append(toIndentedString(autoProvisionUsers)).append("\n");
    sb.append("    issuerURI: ").append(toIndentedString(issuerURI)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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

