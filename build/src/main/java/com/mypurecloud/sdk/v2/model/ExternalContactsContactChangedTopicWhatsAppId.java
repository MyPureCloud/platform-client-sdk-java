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
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicPhoneNumber;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicWhatsAppBusinessScopedId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalContactsContactChangedTopicWhatsAppId
 */

public class ExternalContactsContactChangedTopicWhatsAppId  implements Serializable {
  
  private ExternalContactsContactChangedTopicPhoneNumber phoneNumber = null;
  private String displayName = null;
  private String username = null;
  private List<ExternalContactsContactChangedTopicWhatsAppBusinessScopedId> whatsAppBusinessScopedIds = null;

  public ExternalContactsContactChangedTopicWhatsAppId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      whatsAppBusinessScopedIds = new ArrayList<ExternalContactsContactChangedTopicWhatsAppBusinessScopedId>();
    }
  }

  public ExternalContactsContactChangedTopicWhatsAppId(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      whatsAppBusinessScopedIds = new ArrayList<ExternalContactsContactChangedTopicWhatsAppBusinessScopedId>();
    }
  }

  
  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppId phoneNumber(ExternalContactsContactChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumber")
  public ExternalContactsContactChangedTopicPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(ExternalContactsContactChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppId displayName(String displayName) {
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


  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppId username(String username) {
    this.username = username;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppId whatsAppBusinessScopedIds(List<ExternalContactsContactChangedTopicWhatsAppBusinessScopedId> whatsAppBusinessScopedIds) {
    this.whatsAppBusinessScopedIds = whatsAppBusinessScopedIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppBusinessScopedIds")
  public List<ExternalContactsContactChangedTopicWhatsAppBusinessScopedId> getWhatsAppBusinessScopedIds() {
    return whatsAppBusinessScopedIds;
  }
  public void setWhatsAppBusinessScopedIds(List<ExternalContactsContactChangedTopicWhatsAppBusinessScopedId> whatsAppBusinessScopedIds) {
    this.whatsAppBusinessScopedIds = whatsAppBusinessScopedIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsContactChangedTopicWhatsAppId externalContactsContactChangedTopicWhatsAppId = (ExternalContactsContactChangedTopicWhatsAppId) o;

    return Objects.equals(this.phoneNumber, externalContactsContactChangedTopicWhatsAppId.phoneNumber) &&
            Objects.equals(this.displayName, externalContactsContactChangedTopicWhatsAppId.displayName) &&
            Objects.equals(this.username, externalContactsContactChangedTopicWhatsAppId.username) &&
            Objects.equals(this.whatsAppBusinessScopedIds, externalContactsContactChangedTopicWhatsAppId.whatsAppBusinessScopedIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, displayName, username, whatsAppBusinessScopedIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactChangedTopicWhatsAppId {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    whatsAppBusinessScopedIds: ").append(toIndentedString(whatsAppBusinessScopedIds)).append("\n");
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

