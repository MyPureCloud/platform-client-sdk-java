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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PatchCallbackRequest
 */

public class PatchCallbackRequest  implements Serializable {
  
  private String conversationId = null;
  private String queueId = null;
  private String agentId = null;
  private Date callbackScheduledTime = null;
  private String countryCode = null;
  private List<String> callbackNumbers = null;
  private Boolean validateCallbackNumbers = null;

  public PatchCallbackRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      callbackNumbers = new ArrayList<String>();
    }
  }

  
  /**
   * The conversationId.
   **/
  public PatchCallbackRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conversationId.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The identifier of the queue to be used for the callback.
   **/
  public PatchCallbackRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the queue to be used for the callback.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The agentId.
   **/
  public PatchCallbackRequest agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agentId.")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The scheduled date-time for the callback. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchCallbackRequest callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "2015-01-02T16:59:59Z", value = "The scheduled date-time for the callback. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }


  /**
   * The countryCode
   **/
  public PatchCallbackRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The countryCode")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * The callbackNumbers
   **/
  public PatchCallbackRequest callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The callbackNumbers")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }


  /**
   * validateCallbackNumbers
   **/
  public PatchCallbackRequest validateCallbackNumbers(Boolean validateCallbackNumbers) {
    this.validateCallbackNumbers = validateCallbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "validateCallbackNumbers")
  @JsonProperty("validateCallbackNumbers")
  public Boolean getValidateCallbackNumbers() {
    return validateCallbackNumbers;
  }
  public void setValidateCallbackNumbers(Boolean validateCallbackNumbers) {
    this.validateCallbackNumbers = validateCallbackNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCallbackRequest patchCallbackRequest = (PatchCallbackRequest) o;

    return Objects.equals(this.conversationId, patchCallbackRequest.conversationId) &&
            Objects.equals(this.queueId, patchCallbackRequest.queueId) &&
            Objects.equals(this.agentId, patchCallbackRequest.agentId) &&
            Objects.equals(this.callbackScheduledTime, patchCallbackRequest.callbackScheduledTime) &&
            Objects.equals(this.countryCode, patchCallbackRequest.countryCode) &&
            Objects.equals(this.callbackNumbers, patchCallbackRequest.callbackNumbers) &&
            Objects.equals(this.validateCallbackNumbers, patchCallbackRequest.validateCallbackNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, queueId, agentId, callbackScheduledTime, countryCode, callbackNumbers, validateCallbackNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCallbackRequest {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    validateCallbackNumbers: ").append(toIndentedString(validateCallbackNumbers)).append("\n");
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

