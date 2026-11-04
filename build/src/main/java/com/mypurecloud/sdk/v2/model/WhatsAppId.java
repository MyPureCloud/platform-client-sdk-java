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
import com.mypurecloud.sdk.v2.model.PhoneNumber;
import com.mypurecloud.sdk.v2.model.WhatsAppBusinessScopedId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * User information for a WhatsApp account
 */
@ApiModel(description = "User information for a WhatsApp account")

public class WhatsAppId  implements Serializable {
  
  private PhoneNumber phoneNumber = null;
  private String displayName = null;
  private String username = null;
  private List<WhatsAppBusinessScopedId> whatsAppBusinessScopedIds = null;

  public WhatsAppId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      whatsAppBusinessScopedIds = new ArrayList<WhatsAppBusinessScopedId>();
    }
  }

  public WhatsAppId(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      whatsAppBusinessScopedIds = new ArrayList<WhatsAppBusinessScopedId>();
    }
  }

  
  /**
   * The phone number associated with this WhatsApp account. Requires 'E164 without a leading plus' phone number.
   **/
  public WhatsAppId phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phone number associated with this WhatsApp account. Requires 'E164 without a leading plus' phone number.")
  @JsonProperty("phoneNumber")
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * The displayName of this person's account in WhatsApp. Max: 100 characters.
   **/
  public WhatsAppId displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The displayName of this person's account in WhatsApp. Max: 100 characters.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * The username of the account.
   **/
  public WhatsAppId username(String username) {
    this.username = username;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The username of the account.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * The set of Whatsapp Business Scoped Ids that this contact is associated with.
   **/
  public WhatsAppId whatsAppBusinessScopedIds(List<WhatsAppBusinessScopedId> whatsAppBusinessScopedIds) {
    this.whatsAppBusinessScopedIds = whatsAppBusinessScopedIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of Whatsapp Business Scoped Ids that this contact is associated with.")
  @JsonProperty("whatsAppBusinessScopedIds")
  public List<WhatsAppBusinessScopedId> getWhatsAppBusinessScopedIds() {
    return whatsAppBusinessScopedIds;
  }
  public void setWhatsAppBusinessScopedIds(List<WhatsAppBusinessScopedId> whatsAppBusinessScopedIds) {
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
    WhatsAppId whatsAppId = (WhatsAppId) o;

    return Objects.equals(this.phoneNumber, whatsAppId.phoneNumber) &&
            Objects.equals(this.displayName, whatsAppId.displayName) &&
            Objects.equals(this.username, whatsAppId.username) &&
            Objects.equals(this.whatsAppBusinessScopedIds, whatsAppId.whatsAppBusinessScopedIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, displayName, username, whatsAppBusinessScopedIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppId {\n");
    
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

