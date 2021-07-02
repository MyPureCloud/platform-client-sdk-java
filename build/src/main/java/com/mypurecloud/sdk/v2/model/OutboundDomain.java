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
import com.mypurecloud.sdk.v2.model.EmailAddress;
import com.mypurecloud.sdk.v2.model.VerificationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundDomain
 */

public class OutboundDomain  implements Serializable {
  
  private String id = null;
  private String name = null;
  private VerificationResult cnameVerificationResult = null;
  private VerificationResult dkimVerificationResult = null;
  private EmailAddress fromEmail = null;
  private EmailAddress replyToEmail = null;
  private String selfUri = null;

  
  /**
   * Unique Id of the domain such as: example.com
   **/
  public OutboundDomain id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id of the domain such as: example.com")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public OutboundDomain name(String name) {
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
   * CNAME registration Status
   **/
  public OutboundDomain cnameVerificationResult(VerificationResult cnameVerificationResult) {
    this.cnameVerificationResult = cnameVerificationResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CNAME registration Status")
  @JsonProperty("cnameVerificationResult")
  public VerificationResult getCnameVerificationResult() {
    return cnameVerificationResult;
  }
  public void setCnameVerificationResult(VerificationResult cnameVerificationResult) {
    this.cnameVerificationResult = cnameVerificationResult;
  }

  
  /**
   * DKIM registration Status
   **/
  public OutboundDomain dkimVerificationResult(VerificationResult dkimVerificationResult) {
    this.dkimVerificationResult = dkimVerificationResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DKIM registration Status")
  @JsonProperty("dkimVerificationResult")
  public VerificationResult getDkimVerificationResult() {
    return dkimVerificationResult;
  }
  public void setDkimVerificationResult(VerificationResult dkimVerificationResult) {
    this.dkimVerificationResult = dkimVerificationResult;
  }

  
  /**
   * The email that is used to display sender informations
   **/
  public OutboundDomain fromEmail(EmailAddress fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email that is used to display sender informations")
  @JsonProperty("fromEmail")
  public EmailAddress getFromEmail() {
    return fromEmail;
  }
  public void setFromEmail(EmailAddress fromEmail) {
    this.fromEmail = fromEmail;
  }

  
  /**
   * The email that is used if replies are expected
   **/
  public OutboundDomain replyToEmail(EmailAddress replyToEmail) {
    this.replyToEmail = replyToEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email that is used if replies are expected")
  @JsonProperty("replyToEmail")
  public EmailAddress getReplyToEmail() {
    return replyToEmail;
  }
  public void setReplyToEmail(EmailAddress replyToEmail) {
    this.replyToEmail = replyToEmail;
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
    OutboundDomain outboundDomain = (OutboundDomain) o;
    return Objects.equals(this.id, outboundDomain.id) &&
        Objects.equals(this.name, outboundDomain.name) &&
        Objects.equals(this.cnameVerificationResult, outboundDomain.cnameVerificationResult) &&
        Objects.equals(this.dkimVerificationResult, outboundDomain.dkimVerificationResult) &&
        Objects.equals(this.fromEmail, outboundDomain.fromEmail) &&
        Objects.equals(this.replyToEmail, outboundDomain.replyToEmail) &&
        Objects.equals(this.selfUri, outboundDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cnameVerificationResult, dkimVerificationResult, fromEmail, replyToEmail, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cnameVerificationResult: ").append(toIndentedString(cnameVerificationResult)).append("\n");
    sb.append("    dkimVerificationResult: ").append(toIndentedString(dkimVerificationResult)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    replyToEmail: ").append(toIndentedString(replyToEmail)).append("\n");
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

