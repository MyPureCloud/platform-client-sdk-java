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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * GuestMemberInfo
 */

public class GuestMemberInfo  implements Serializable {
  
  private String displayName = null;
  private String firstName = null;
  private String lastName = null;
  private String email = null;
  private String phoneNumber = null;
  private String avatarImageUrl = null;
  private Map<String, String> customFields = null;

  
  /**
   * The display name to use for the guest member in the conversation.
   **/
  public GuestMemberInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name to use for the guest member in the conversation.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The first name to use for the guest member in the conversation.
   **/
  public GuestMemberInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first name to use for the guest member in the conversation.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * The last name to use for the guest member in the conversation.
   **/
  public GuestMemberInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last name to use for the guest member in the conversation.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The email address to use for the guest member in the conversation.
   **/
  public GuestMemberInfo email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address to use for the guest member in the conversation.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The phone number to use for the guest member in the conversation.
   **/
  public GuestMemberInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number to use for the guest member in the conversation.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * The URL to the avatar image to use for the guest member in the conversation, if any.
   **/
  public GuestMemberInfo avatarImageUrl(String avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL to the avatar image to use for the guest member in the conversation, if any.")
  @JsonProperty("avatarImageUrl")
  public String getAvatarImageUrl() {
    return avatarImageUrl;
  }
  public void setAvatarImageUrl(String avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
  }

  
  /**
   * Any custom fields of information, in key-value format, to attach to the guest member in the conversation.
   **/
  public GuestMemberInfo customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any custom fields of information, in key-value format, to attach to the guest member in the conversation.")
  @JsonProperty("customFields")
  public Map<String, String> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestMemberInfo guestMemberInfo = (GuestMemberInfo) o;
    return Objects.equals(this.displayName, guestMemberInfo.displayName) &&
        Objects.equals(this.firstName, guestMemberInfo.firstName) &&
        Objects.equals(this.lastName, guestMemberInfo.lastName) &&
        Objects.equals(this.email, guestMemberInfo.email) &&
        Objects.equals(this.phoneNumber, guestMemberInfo.phoneNumber) &&
        Objects.equals(this.avatarImageUrl, guestMemberInfo.avatarImageUrl) &&
        Objects.equals(this.customFields, guestMemberInfo.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, firstName, lastName, email, phoneNumber, avatarImageUrl, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestMemberInfo {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    avatarImageUrl: ").append(toIndentedString(avatarImageUrl)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

