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
 * V2MobiusRulesTopicAlertNotificationRecipient
 */

public class V2MobiusRulesTopicAlertNotificationRecipient  implements Serializable {
  
  private String userId = null;
  private String displayName = null;
  private String contactAddress = null;

  
  /**
   **/
  public V2MobiusRulesTopicAlertNotificationRecipient userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public V2MobiusRulesTopicAlertNotificationRecipient displayName(String displayName) {
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
  public V2MobiusRulesTopicAlertNotificationRecipient contactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactAddress")
  public String getContactAddress() {
    return contactAddress;
  }
  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusRulesTopicAlertNotificationRecipient v2MobiusRulesTopicAlertNotificationRecipient = (V2MobiusRulesTopicAlertNotificationRecipient) o;

    return Objects.equals(this.userId, v2MobiusRulesTopicAlertNotificationRecipient.userId) &&
            Objects.equals(this.displayName, v2MobiusRulesTopicAlertNotificationRecipient.displayName) &&
            Objects.equals(this.contactAddress, v2MobiusRulesTopicAlertNotificationRecipient.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, displayName, contactAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicAlertNotificationRecipient {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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

