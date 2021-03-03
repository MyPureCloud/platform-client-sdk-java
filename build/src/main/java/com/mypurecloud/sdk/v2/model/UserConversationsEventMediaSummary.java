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
import com.mypurecloud.sdk.v2.model.UserConversationsEventMediaSummaryDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserConversationsEventMediaSummary
 */

public class UserConversationsEventMediaSummary  implements Serializable {
  
  private UserConversationsEventMediaSummaryDetail contactCenter = null;
  private UserConversationsEventMediaSummaryDetail enterprise = null;

  
  /**
   **/
  public UserConversationsEventMediaSummary contactCenter(UserConversationsEventMediaSummaryDetail contactCenter) {
    this.contactCenter = contactCenter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactCenter")
  public UserConversationsEventMediaSummaryDetail getContactCenter() {
    return contactCenter;
  }
  public void setContactCenter(UserConversationsEventMediaSummaryDetail contactCenter) {
    this.contactCenter = contactCenter;
  }

  
  /**
   **/
  public UserConversationsEventMediaSummary enterprise(UserConversationsEventMediaSummaryDetail enterprise) {
    this.enterprise = enterprise;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enterprise")
  public UserConversationsEventMediaSummaryDetail getEnterprise() {
    return enterprise;
  }
  public void setEnterprise(UserConversationsEventMediaSummaryDetail enterprise) {
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
    UserConversationsEventMediaSummary userConversationsEventMediaSummary = (UserConversationsEventMediaSummary) o;
    return Objects.equals(this.contactCenter, userConversationsEventMediaSummary.contactCenter) &&
        Objects.equals(this.enterprise, userConversationsEventMediaSummary.enterprise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCenter, enterprise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationsEventMediaSummary {\n");
    
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

