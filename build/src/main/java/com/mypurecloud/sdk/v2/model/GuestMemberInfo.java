package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
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
        Objects.equals(this.avatarImageUrl, guestMemberInfo.avatarImageUrl) &&
        Objects.equals(this.customFields, guestMemberInfo.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, avatarImageUrl, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestMemberInfo {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

