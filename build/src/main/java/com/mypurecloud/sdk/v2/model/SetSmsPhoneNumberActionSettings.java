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
 * SetSmsPhoneNumberActionSettings
 */

public class SetSmsPhoneNumberActionSettings  implements Serializable {
  
  private String senderSmsPhoneNumber = null;

  public SetSmsPhoneNumberActionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The string address for the sms phone number.
   **/
  public SetSmsPhoneNumberActionSettings senderSmsPhoneNumber(String senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The string address for the sms phone number.")
  @JsonProperty("senderSmsPhoneNumber")
  public String getSenderSmsPhoneNumber() {
    return senderSmsPhoneNumber;
  }
  public void setSenderSmsPhoneNumber(String senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSmsPhoneNumberActionSettings setSmsPhoneNumberActionSettings = (SetSmsPhoneNumberActionSettings) o;

    return Objects.equals(this.senderSmsPhoneNumber, setSmsPhoneNumberActionSettings.senderSmsPhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderSmsPhoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSmsPhoneNumberActionSettings {\n");
    
    sb.append("    senderSmsPhoneNumber: ").append(toIndentedString(senderSmsPhoneNumber)).append("\n");
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

