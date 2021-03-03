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

import java.io.Serializable;
/**
 * WhatsAppIntegrationRequest
 */

public class WhatsAppIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;
  private String wabaCertificate = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the WhatsApp Integration
   **/
  public WhatsAppIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the WhatsApp Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The phone number associated to the whatsApp integration
   **/
  public WhatsAppIntegrationRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phone number associated to the whatsApp integration")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * The waba(WhatsApp Business Manager) certificate associated to the WhatsApp integration phone number
   **/
  public WhatsAppIntegrationRequest wabaCertificate(String wabaCertificate) {
    this.wabaCertificate = wabaCertificate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The waba(WhatsApp Business Manager) certificate associated to the WhatsApp integration phone number")
  @JsonProperty("wabaCertificate")
  public String getWabaCertificate() {
    return wabaCertificate;
  }
  public void setWabaCertificate(String wabaCertificate) {
    this.wabaCertificate = wabaCertificate;
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
    WhatsAppIntegrationRequest whatsAppIntegrationRequest = (WhatsAppIntegrationRequest) o;
    return Objects.equals(this.id, whatsAppIntegrationRequest.id) &&
        Objects.equals(this.name, whatsAppIntegrationRequest.name) &&
        Objects.equals(this.phoneNumber, whatsAppIntegrationRequest.phoneNumber) &&
        Objects.equals(this.wabaCertificate, whatsAppIntegrationRequest.wabaCertificate) &&
        Objects.equals(this.selfUri, whatsAppIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, wabaCertificate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    wabaCertificate: ").append(toIndentedString(wabaCertificate)).append("\n");
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

