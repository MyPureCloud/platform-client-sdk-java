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
 * Fields identifying the destination of a given conversation command.
 */
@ApiModel(description = "Fields identifying the destination of a given conversation command.")

public class QueueConversationSocialExpressionEventTopicTransferDestination  implements Serializable {
  
  private String userId = null;
  private String address = null;

  public QueueConversationSocialExpressionEventTopicTransferDestination() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id of the user if the command destination is a user.
   **/
  public QueueConversationSocialExpressionEventTopicTransferDestination userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the user if the command destination is a user.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The destination address if the command destination is an endpoint.
   **/
  public QueueConversationSocialExpressionEventTopicTransferDestination address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The destination address if the command destination is an endpoint.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicTransferDestination queueConversationSocialExpressionEventTopicTransferDestination = (QueueConversationSocialExpressionEventTopicTransferDestination) o;

    return Objects.equals(this.userId, queueConversationSocialExpressionEventTopicTransferDestination.userId) &&
            Objects.equals(this.address, queueConversationSocialExpressionEventTopicTransferDestination.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicTransferDestination {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

