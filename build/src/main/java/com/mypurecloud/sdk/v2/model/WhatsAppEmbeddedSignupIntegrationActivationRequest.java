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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WhatsAppEmbeddedSignupIntegrationActivationRequest
 */

public class WhatsAppEmbeddedSignupIntegrationActivationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;
  private String pin = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "WhatsApp Integration name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  /**
   * Phone number to associate with the WhatsApp integration
   **/
  public WhatsAppEmbeddedSignupIntegrationActivationRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Phone number to associate with the WhatsApp integration")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * Specify the two-step verification PIN for that phone number
   **/
  public WhatsAppEmbeddedSignupIntegrationActivationRequest pin(String pin) {
    this.pin = pin;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specify the two-step verification PIN for that phone number")
  @JsonProperty("pin")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
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
    WhatsAppEmbeddedSignupIntegrationActivationRequest whatsAppEmbeddedSignupIntegrationActivationRequest = (WhatsAppEmbeddedSignupIntegrationActivationRequest) o;

    return Objects.equals(this.id, whatsAppEmbeddedSignupIntegrationActivationRequest.id) &&
            Objects.equals(this.name, whatsAppEmbeddedSignupIntegrationActivationRequest.name) &&
            Objects.equals(this.phoneNumber, whatsAppEmbeddedSignupIntegrationActivationRequest.phoneNumber) &&
            Objects.equals(this.pin, whatsAppEmbeddedSignupIntegrationActivationRequest.pin) &&
            Objects.equals(this.selfUri, whatsAppEmbeddedSignupIntegrationActivationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, pin, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppEmbeddedSignupIntegrationActivationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

