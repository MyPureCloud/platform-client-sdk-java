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
import java.util.Date;

import java.io.Serializable;
/**
 * Represents the details of a parsed certificate.
 */
@ApiModel(description = "Represents the details of a parsed certificate.")

public class CertificateDetails  implements Serializable {
  
  private String issuer = null;
  private String subject = null;
  private Date expirationDate = null;
  private Date issueDate = null;
  private Boolean expired = null;
  private Boolean valid = null;
  private Boolean signatureValid = null;

  
  /**
   * Information about the issuer of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.
   **/
  public CertificateDetails issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the issuer of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.")
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  
  /**
   * Information about the subject of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.
   **/
  public CertificateDetails subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the subject of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * The expiration date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CertificateDetails expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The expiration date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   * The issue date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CertificateDetails issueDate(Date issueDate) {
    this.issueDate = issueDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The issue date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("issueDate")
  public Date getIssueDate() {
    return issueDate;
  }
  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }

  
  /**
   * True if the certificate is expired, false otherwise.
   **/
  public CertificateDetails expired(Boolean expired) {
    this.expired = expired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the certificate is expired, false otherwise.")
  @JsonProperty("expired")
  public Boolean getExpired() {
    return expired;
  }
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  
  /**
   **/
  public CertificateDetails valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   **/
  public CertificateDetails signatureValid(Boolean signatureValid) {
    this.signatureValid = signatureValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signatureValid")
  public Boolean getSignatureValid() {
    return signatureValid;
  }
  public void setSignatureValid(Boolean signatureValid) {
    this.signatureValid = signatureValid;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateDetails certificateDetails = (CertificateDetails) o;
    return Objects.equals(this.issuer, certificateDetails.issuer) &&
        Objects.equals(this.subject, certificateDetails.subject) &&
        Objects.equals(this.expirationDate, certificateDetails.expirationDate) &&
        Objects.equals(this.issueDate, certificateDetails.issueDate) &&
        Objects.equals(this.expired, certificateDetails.expired) &&
        Objects.equals(this.valid, certificateDetails.valid) &&
        Objects.equals(this.signatureValid, certificateDetails.signatureValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, subject, expirationDate, issueDate, expired, valid, signatureValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateDetails {\n");
    
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    signatureValid: ").append(toIndentedString(signatureValid)).append("\n");
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

