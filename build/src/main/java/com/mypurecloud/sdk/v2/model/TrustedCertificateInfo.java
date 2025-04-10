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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrustedCertificateInfo
 */

public class TrustedCertificateInfo  implements Serializable {
  
  private String description = null;
  private String serialNumber = null;
  private String signature = null;

  public TrustedCertificateInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The description of the certificate
   **/
  public TrustedCertificateInfo description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the certificate")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The serial number of the certificate
   **/
  public TrustedCertificateInfo serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The serial number of the certificate")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  /**
   * The signature of the certificate
   **/
  public TrustedCertificateInfo signature(String signature) {
    this.signature = signature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The signature of the certificate")
  @JsonProperty("signature")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedCertificateInfo trustedCertificateInfo = (TrustedCertificateInfo) o;

    return Objects.equals(this.description, trustedCertificateInfo.description) &&
            Objects.equals(this.serialNumber, trustedCertificateInfo.serialNumber) &&
            Objects.equals(this.signature, trustedCertificateInfo.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, serialNumber, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedCertificateInfo {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

