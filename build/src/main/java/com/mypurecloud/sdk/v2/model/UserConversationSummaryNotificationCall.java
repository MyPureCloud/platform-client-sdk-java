package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserConversationSummaryNotificationCallContactCenter;
import com.mypurecloud.sdk.v2.model.UserConversationSummaryNotificationMediaSummaryDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserConversationSummaryNotificationCall
 */

public class UserConversationSummaryNotificationCall  implements Serializable {
  
  private UserConversationSummaryNotificationCallContactCenter contactCenter = null;
  private UserConversationSummaryNotificationMediaSummaryDetail enterprise = null;

  
  /**
   **/
  public UserConversationSummaryNotificationCall contactCenter(UserConversationSummaryNotificationCallContactCenter contactCenter) {
    this.contactCenter = contactCenter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactCenter")
  public UserConversationSummaryNotificationCallContactCenter getContactCenter() {
    return contactCenter;
  }
  public void setContactCenter(UserConversationSummaryNotificationCallContactCenter contactCenter) {
    this.contactCenter = contactCenter;
  }

  
  /**
   **/
  public UserConversationSummaryNotificationCall enterprise(UserConversationSummaryNotificationMediaSummaryDetail enterprise) {
    this.enterprise = enterprise;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enterprise")
  public UserConversationSummaryNotificationMediaSummaryDetail getEnterprise() {
    return enterprise;
  }
  public void setEnterprise(UserConversationSummaryNotificationMediaSummaryDetail enterprise) {
    this.enterprise = enterprise;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationSummaryNotificationCall userConversationSummaryNotificationCall = (UserConversationSummaryNotificationCall) o;
    return Objects.equals(this.contactCenter, userConversationSummaryNotificationCall.contactCenter) &&
        Objects.equals(this.enterprise, userConversationSummaryNotificationCall.enterprise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCenter, enterprise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummaryNotificationCall {\n");
    
    sb.append("    contactCenter: ").append(toIndentedString(contactCenter)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
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

