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

import java.io.Serializable;
/**
 * TransferRequest
 */

public class TransferRequest  implements Serializable {
  
  private String userId = null;
  private String address = null;
  private String userName = null;
  private String queueId = null;
  private Boolean voicemail = null;

  
  /**
   * The user ID of the transfer target.
   **/
  public TransferRequest userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID of the transfer target.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The phone number or address of the transfer target.
   **/
  public TransferRequest address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number or address of the transfer target.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * The user name of the transfer target.
   **/
  public TransferRequest userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user name of the transfer target.")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * The queue ID of the transfer target.
   **/
  public TransferRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ID of the transfer target.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * If true, transfer to the voicemail inbox of the participant that is being replaced.
   **/
  public TransferRequest voicemail(Boolean voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, transfer to the voicemail inbox of the participant that is being replaced.")
  @JsonProperty("voicemail")
  public Boolean getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(Boolean voicemail) {
    this.voicemail = voicemail;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequest transferRequest = (TransferRequest) o;
    return Objects.equals(this.userId, transferRequest.userId) &&
        Objects.equals(this.address, transferRequest.address) &&
        Objects.equals(this.userName, transferRequest.userName) &&
        Objects.equals(this.queueId, transferRequest.queueId) &&
        Objects.equals(this.voicemail, transferRequest.voicemail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, address, userName, queueId, voicemail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
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

