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
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicPhoneNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExternalContactsUnresolvedContactChangedTopicWhatsAppId
 */

public class ExternalContactsUnresolvedContactChangedTopicWhatsAppId  implements Serializable {
  
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber phoneNumber = null;
  private String displayName = null;

  public ExternalContactsUnresolvedContactChangedTopicWhatsAppId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicWhatsAppId phoneNumber(ExternalContactsUnresolvedContactChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumber")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(ExternalContactsUnresolvedContactChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicWhatsAppId displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsUnresolvedContactChangedTopicWhatsAppId externalContactsUnresolvedContactChangedTopicWhatsAppId = (ExternalContactsUnresolvedContactChangedTopicWhatsAppId) o;

    return Objects.equals(this.phoneNumber, externalContactsUnresolvedContactChangedTopicWhatsAppId.phoneNumber) &&
            Objects.equals(this.displayName, externalContactsUnresolvedContactChangedTopicWhatsAppId.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsUnresolvedContactChangedTopicWhatsAppId {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

