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
import com.mypurecloud.sdk.v2.model.CertificateDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents the parsed certificate information.
 */
@ApiModel(description = "Represents the parsed certificate information.")

public class ParsedCertificate  implements Serializable {
  
  private List<CertificateDetails> certificateDetails = new ArrayList<CertificateDetails>();

  
  /**
   * The details of the certificates that were parsed correctly.
   **/
  public ParsedCertificate certificateDetails(List<CertificateDetails> certificateDetails) {
    this.certificateDetails = certificateDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The details of the certificates that were parsed correctly.")
  @JsonProperty("certificateDetails")
  public List<CertificateDetails> getCertificateDetails() {
    return certificateDetails;
  }
  public void setCertificateDetails(List<CertificateDetails> certificateDetails) {
    this.certificateDetails = certificateDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedCertificate parsedCertificate = (ParsedCertificate) o;
    return Objects.equals(this.certificateDetails, parsedCertificate.certificateDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedCertificate {\n");
    
    sb.append("    certificateDetails: ").append(toIndentedString(certificateDetails)).append("\n");
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

