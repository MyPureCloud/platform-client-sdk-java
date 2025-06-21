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

import java.io.Serializable;
/**
 * MessagingConferWithUserRequest
 */

public class MessagingConferWithUserRequest  implements Serializable {
  
  private String targetUserId = null;

  public MessagingConferWithUserRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The user ID of the target.
   **/
  public MessagingConferWithUserRequest targetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user ID of the target.")
  @JsonProperty("targetUserId")
  public String getTargetUserId() {
    return targetUserId;
  }
  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingConferWithUserRequest messagingConferWithUserRequest = (MessagingConferWithUserRequest) o;

    return Objects.equals(this.targetUserId, messagingConferWithUserRequest.targetUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingConferWithUserRequest {\n");
    
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
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

