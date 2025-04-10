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
 * WhatsAppAvailablePhoneNumberDetails
 */

public class WhatsAppAvailablePhoneNumberDetails  implements Serializable {
  
  private String name = null;
  private String phoneNumber = null;
  private String status = null;

  public WhatsAppAvailablePhoneNumberDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The verified name associated with this phone number.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  @ApiModelProperty(example = "null", value = "The display name associated with this phone number. It's typically the E.164 representation of the number.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }


  @ApiModelProperty(example = "null", required = true, value = "The status of this phone number.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppAvailablePhoneNumberDetails whatsAppAvailablePhoneNumberDetails = (WhatsAppAvailablePhoneNumberDetails) o;

    return Objects.equals(this.name, whatsAppAvailablePhoneNumberDetails.name) &&
            Objects.equals(this.phoneNumber, whatsAppAvailablePhoneNumberDetails.phoneNumber) &&
            Objects.equals(this.status, whatsAppAvailablePhoneNumberDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumber, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppAvailablePhoneNumberDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

