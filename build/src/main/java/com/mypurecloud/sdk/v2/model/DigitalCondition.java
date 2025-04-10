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
import com.mypurecloud.sdk.v2.model.ContactAddressConditionSettings;
import com.mypurecloud.sdk.v2.model.ContactAddressTypeConditionSettings;
import com.mypurecloud.sdk.v2.model.ContactColumnConditionSettings;
import com.mypurecloud.sdk.v2.model.DataActionConditionSettings;
import com.mypurecloud.sdk.v2.model.LastAttemptByColumnConditionSettings;
import com.mypurecloud.sdk.v2.model.LastAttemptOverallConditionSettings;
import com.mypurecloud.sdk.v2.model.LastResultByColumnConditionSettings;
import com.mypurecloud.sdk.v2.model.LastResultOverallConditionSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DigitalCondition
 */

public class DigitalCondition  implements Serializable {
  
  private Boolean inverted = null;
  private ContactColumnConditionSettings contactColumnConditionSettings = null;
  private ContactAddressConditionSettings contactAddressConditionSettings = null;
  private ContactAddressTypeConditionSettings contactAddressTypeConditionSettings = null;
  private LastAttemptByColumnConditionSettings lastAttemptByColumnConditionSettings = null;
  private LastAttemptOverallConditionSettings lastAttemptOverallConditionSettings = null;
  private LastResultByColumnConditionSettings lastResultByColumnConditionSettings = null;
  private LastResultOverallConditionSettings lastResultOverallConditionSettings = null;
  private DataActionConditionSettings dataActionConditionSettings = null;

  public DigitalCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * If true, inverts the result of evaluating this condition. Default is false.
   **/
  public DigitalCondition inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, inverts the result of evaluating this condition. Default is false.")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }


  /**
   * The settings for a 'contact list column' condition.
   **/
  public DigitalCondition contactColumnConditionSettings(ContactColumnConditionSettings contactColumnConditionSettings) {
    this.contactColumnConditionSettings = contactColumnConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'contact list column' condition.")
  @JsonProperty("contactColumnConditionSettings")
  public ContactColumnConditionSettings getContactColumnConditionSettings() {
    return contactColumnConditionSettings;
  }
  public void setContactColumnConditionSettings(ContactColumnConditionSettings contactColumnConditionSettings) {
    this.contactColumnConditionSettings = contactColumnConditionSettings;
  }


  /**
   * The settings for a 'contact address' condition.
   **/
  public DigitalCondition contactAddressConditionSettings(ContactAddressConditionSettings contactAddressConditionSettings) {
    this.contactAddressConditionSettings = contactAddressConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'contact address' condition.")
  @JsonProperty("contactAddressConditionSettings")
  public ContactAddressConditionSettings getContactAddressConditionSettings() {
    return contactAddressConditionSettings;
  }
  public void setContactAddressConditionSettings(ContactAddressConditionSettings contactAddressConditionSettings) {
    this.contactAddressConditionSettings = contactAddressConditionSettings;
  }


  /**
   * The settings for a 'contact address type' condition.
   **/
  public DigitalCondition contactAddressTypeConditionSettings(ContactAddressTypeConditionSettings contactAddressTypeConditionSettings) {
    this.contactAddressTypeConditionSettings = contactAddressTypeConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'contact address type' condition.")
  @JsonProperty("contactAddressTypeConditionSettings")
  public ContactAddressTypeConditionSettings getContactAddressTypeConditionSettings() {
    return contactAddressTypeConditionSettings;
  }
  public void setContactAddressTypeConditionSettings(ContactAddressTypeConditionSettings contactAddressTypeConditionSettings) {
    this.contactAddressTypeConditionSettings = contactAddressTypeConditionSettings;
  }


  /**
   * The settings for a 'last attempt by column' condition.
   **/
  public DigitalCondition lastAttemptByColumnConditionSettings(LastAttemptByColumnConditionSettings lastAttemptByColumnConditionSettings) {
    this.lastAttemptByColumnConditionSettings = lastAttemptByColumnConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'last attempt by column' condition.")
  @JsonProperty("lastAttemptByColumnConditionSettings")
  public LastAttemptByColumnConditionSettings getLastAttemptByColumnConditionSettings() {
    return lastAttemptByColumnConditionSettings;
  }
  public void setLastAttemptByColumnConditionSettings(LastAttemptByColumnConditionSettings lastAttemptByColumnConditionSettings) {
    this.lastAttemptByColumnConditionSettings = lastAttemptByColumnConditionSettings;
  }


  /**
   * The settings for a 'last attempt overall' condition.
   **/
  public DigitalCondition lastAttemptOverallConditionSettings(LastAttemptOverallConditionSettings lastAttemptOverallConditionSettings) {
    this.lastAttemptOverallConditionSettings = lastAttemptOverallConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'last attempt overall' condition.")
  @JsonProperty("lastAttemptOverallConditionSettings")
  public LastAttemptOverallConditionSettings getLastAttemptOverallConditionSettings() {
    return lastAttemptOverallConditionSettings;
  }
  public void setLastAttemptOverallConditionSettings(LastAttemptOverallConditionSettings lastAttemptOverallConditionSettings) {
    this.lastAttemptOverallConditionSettings = lastAttemptOverallConditionSettings;
  }


  /**
   * The settings for a 'last result by column' condition.
   **/
  public DigitalCondition lastResultByColumnConditionSettings(LastResultByColumnConditionSettings lastResultByColumnConditionSettings) {
    this.lastResultByColumnConditionSettings = lastResultByColumnConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'last result by column' condition.")
  @JsonProperty("lastResultByColumnConditionSettings")
  public LastResultByColumnConditionSettings getLastResultByColumnConditionSettings() {
    return lastResultByColumnConditionSettings;
  }
  public void setLastResultByColumnConditionSettings(LastResultByColumnConditionSettings lastResultByColumnConditionSettings) {
    this.lastResultByColumnConditionSettings = lastResultByColumnConditionSettings;
  }


  /**
   * The settings for a 'last result overall' condition.
   **/
  public DigitalCondition lastResultOverallConditionSettings(LastResultOverallConditionSettings lastResultOverallConditionSettings) {
    this.lastResultOverallConditionSettings = lastResultOverallConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'last result overall' condition.")
  @JsonProperty("lastResultOverallConditionSettings")
  public LastResultOverallConditionSettings getLastResultOverallConditionSettings() {
    return lastResultOverallConditionSettings;
  }
  public void setLastResultOverallConditionSettings(LastResultOverallConditionSettings lastResultOverallConditionSettings) {
    this.lastResultOverallConditionSettings = lastResultOverallConditionSettings;
  }


  /**
   * The settings for a 'data action' condition.
   **/
  public DigitalCondition dataActionConditionSettings(DataActionConditionSettings dataActionConditionSettings) {
    this.dataActionConditionSettings = dataActionConditionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'data action' condition.")
  @JsonProperty("dataActionConditionSettings")
  public DataActionConditionSettings getDataActionConditionSettings() {
    return dataActionConditionSettings;
  }
  public void setDataActionConditionSettings(DataActionConditionSettings dataActionConditionSettings) {
    this.dataActionConditionSettings = dataActionConditionSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalCondition digitalCondition = (DigitalCondition) o;

    return Objects.equals(this.inverted, digitalCondition.inverted) &&
            Objects.equals(this.contactColumnConditionSettings, digitalCondition.contactColumnConditionSettings) &&
            Objects.equals(this.contactAddressConditionSettings, digitalCondition.contactAddressConditionSettings) &&
            Objects.equals(this.contactAddressTypeConditionSettings, digitalCondition.contactAddressTypeConditionSettings) &&
            Objects.equals(this.lastAttemptByColumnConditionSettings, digitalCondition.lastAttemptByColumnConditionSettings) &&
            Objects.equals(this.lastAttemptOverallConditionSettings, digitalCondition.lastAttemptOverallConditionSettings) &&
            Objects.equals(this.lastResultByColumnConditionSettings, digitalCondition.lastResultByColumnConditionSettings) &&
            Objects.equals(this.lastResultOverallConditionSettings, digitalCondition.lastResultOverallConditionSettings) &&
            Objects.equals(this.dataActionConditionSettings, digitalCondition.dataActionConditionSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inverted, contactColumnConditionSettings, contactAddressConditionSettings, contactAddressTypeConditionSettings, lastAttemptByColumnConditionSettings, lastAttemptOverallConditionSettings, lastResultByColumnConditionSettings, lastResultOverallConditionSettings, dataActionConditionSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalCondition {\n");
    
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    contactColumnConditionSettings: ").append(toIndentedString(contactColumnConditionSettings)).append("\n");
    sb.append("    contactAddressConditionSettings: ").append(toIndentedString(contactAddressConditionSettings)).append("\n");
    sb.append("    contactAddressTypeConditionSettings: ").append(toIndentedString(contactAddressTypeConditionSettings)).append("\n");
    sb.append("    lastAttemptByColumnConditionSettings: ").append(toIndentedString(lastAttemptByColumnConditionSettings)).append("\n");
    sb.append("    lastAttemptOverallConditionSettings: ").append(toIndentedString(lastAttemptOverallConditionSettings)).append("\n");
    sb.append("    lastResultByColumnConditionSettings: ").append(toIndentedString(lastResultByColumnConditionSettings)).append("\n");
    sb.append("    lastResultOverallConditionSettings: ").append(toIndentedString(lastResultOverallConditionSettings)).append("\n");
    sb.append("    dataActionConditionSettings: ").append(toIndentedString(dataActionConditionSettings)).append("\n");
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

