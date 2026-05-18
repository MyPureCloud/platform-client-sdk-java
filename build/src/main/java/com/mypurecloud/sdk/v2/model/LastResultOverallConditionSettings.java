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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LastResultOverallConditionSettings
 */

public class LastResultOverallConditionSettings  implements Serializable {
  
  private List<String> emailWrapupCodes = null;
  private List<String> smsWrapupCodes = null;
  private List<String> whatsAppWrapupCodes = null;

  public LastResultOverallConditionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      emailWrapupCodes = new ArrayList<String>();
      smsWrapupCodes = new ArrayList<String>();
      whatsAppWrapupCodes = new ArrayList<String>();
    }
  }

  public LastResultOverallConditionSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      emailWrapupCodes = new ArrayList<String>();
      smsWrapupCodes = new ArrayList<String>();
      whatsAppWrapupCodes = new ArrayList<String>();
    }
  }

  
  /**
   * A list of wrapup code identifiers to match for Email.
   **/
  public LastResultOverallConditionSettings emailWrapupCodes(List<String> emailWrapupCodes) {
    this.emailWrapupCodes = emailWrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of wrapup code identifiers to match for Email.")
  @JsonProperty("emailWrapupCodes")
  public List<String> getEmailWrapupCodes() {
    return emailWrapupCodes;
  }
  public void setEmailWrapupCodes(List<String> emailWrapupCodes) {
    this.emailWrapupCodes = emailWrapupCodes;
  }


  /**
   * A list of wrapup code identifiers to match for SMS.
   **/
  public LastResultOverallConditionSettings smsWrapupCodes(List<String> smsWrapupCodes) {
    this.smsWrapupCodes = smsWrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of wrapup code identifiers to match for SMS.")
  @JsonProperty("smsWrapupCodes")
  public List<String> getSmsWrapupCodes() {
    return smsWrapupCodes;
  }
  public void setSmsWrapupCodes(List<String> smsWrapupCodes) {
    this.smsWrapupCodes = smsWrapupCodes;
  }


  /**
   * A list of wrapup code identifiers to match for WhatsApp.
   **/
  public LastResultOverallConditionSettings whatsAppWrapupCodes(List<String> whatsAppWrapupCodes) {
    this.whatsAppWrapupCodes = whatsAppWrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of wrapup code identifiers to match for WhatsApp.")
  @JsonProperty("whatsAppWrapupCodes")
  public List<String> getWhatsAppWrapupCodes() {
    return whatsAppWrapupCodes;
  }
  public void setWhatsAppWrapupCodes(List<String> whatsAppWrapupCodes) {
    this.whatsAppWrapupCodes = whatsAppWrapupCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastResultOverallConditionSettings lastResultOverallConditionSettings = (LastResultOverallConditionSettings) o;

    return Objects.equals(this.emailWrapupCodes, lastResultOverallConditionSettings.emailWrapupCodes) &&
            Objects.equals(this.smsWrapupCodes, lastResultOverallConditionSettings.smsWrapupCodes) &&
            Objects.equals(this.whatsAppWrapupCodes, lastResultOverallConditionSettings.whatsAppWrapupCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailWrapupCodes, smsWrapupCodes, whatsAppWrapupCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastResultOverallConditionSettings {\n");
    
    sb.append("    emailWrapupCodes: ").append(toIndentedString(emailWrapupCodes)).append("\n");
    sb.append("    smsWrapupCodes: ").append(toIndentedString(smsWrapupCodes)).append("\n");
    sb.append("    whatsAppWrapupCodes: ").append(toIndentedString(whatsAppWrapupCodes)).append("\n");
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

