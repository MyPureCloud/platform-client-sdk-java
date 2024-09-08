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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TransferRequest
 */

public class TransferRequest  implements Serializable {
  

  private static class TransferTypeEnumDeserializer extends StdDeserializer<TransferTypeEnum> {
    public TransferTypeEnumDeserializer() {
      super(TransferTypeEnumDeserializer.class);
    }

    @Override
    public TransferTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransferTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended.
   */
 @JsonDeserialize(using = TransferTypeEnumDeserializer.class)
  public enum TransferTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTENDED("Attended"),
    UNATTENDED("Unattended");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransferTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TransferTypeEnum value : TransferTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransferTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransferTypeEnum transferType = null;
  private Boolean keepInternalMessageAlive = null;
  private String userId = null;
  private String address = null;
  private String userName = null;
  private String queueId = null;
  private Boolean voicemail = null;

  
  /**
   * The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended.
   **/
  public TransferRequest transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended.")
  @JsonProperty("transferType")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }
  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  /**
   * If true, the digital internal message will NOT be terminated.
   **/
  public TransferRequest keepInternalMessageAlive(Boolean keepInternalMessageAlive) {
    this.keepInternalMessageAlive = keepInternalMessageAlive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the digital internal message will NOT be terminated.")
  @JsonProperty("keepInternalMessageAlive")
  public Boolean getKeepInternalMessageAlive() {
    return keepInternalMessageAlive;
  }
  public void setKeepInternalMessageAlive(Boolean keepInternalMessageAlive) {
    this.keepInternalMessageAlive = keepInternalMessageAlive;
  }


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
   * The user ID or queue ID of the transfer target. Address like a phone number can not be used for callbacks, but they can be used for other forms of communication.
   **/
  public TransferRequest address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID or queue ID of the transfer target. Address like a phone number can not be used for callbacks, but they can be used for other forms of communication.")
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

    return Objects.equals(this.transferType, transferRequest.transferType) &&
            Objects.equals(this.keepInternalMessageAlive, transferRequest.keepInternalMessageAlive) &&
            Objects.equals(this.userId, transferRequest.userId) &&
            Objects.equals(this.address, transferRequest.address) &&
            Objects.equals(this.userName, transferRequest.userName) &&
            Objects.equals(this.queueId, transferRequest.queueId) &&
            Objects.equals(this.voicemail, transferRequest.voicemail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferType, keepInternalMessageAlive, userId, address, userName, queueId, voicemail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    keepInternalMessageAlive: ").append(toIndentedString(keepInternalMessageAlive)).append("\n");
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

