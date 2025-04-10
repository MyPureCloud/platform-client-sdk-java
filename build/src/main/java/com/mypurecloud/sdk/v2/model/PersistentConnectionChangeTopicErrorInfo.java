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
import com.mypurecloud.sdk.v2.model.PersistentConnectionChangeTopicErrorInfoDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PersistentConnectionChangeTopicErrorInfo
 */

public class PersistentConnectionChangeTopicErrorInfo  implements Serializable {
  
  private String text = null;
  private String code = null;
  private String userMessage = null;
  private Map<String, String> userParams = null;
  private List<PersistentConnectionChangeTopicErrorInfoDetails> nestedErrorDetails = null;

  public PersistentConnectionChangeTopicErrorInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      nestedErrorDetails = new ArrayList<PersistentConnectionChangeTopicErrorInfoDetails>();
    }
  }

  
  /**
   **/
  public PersistentConnectionChangeTopicErrorInfo text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfo code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfo userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userMessage")
  public String getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfo userParams(Map<String, String> userParams) {
    this.userParams = userParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userParams")
  public Map<String, String> getUserParams() {
    return userParams;
  }
  public void setUserParams(Map<String, String> userParams) {
    this.userParams = userParams;
  }


  /**
   **/
  public PersistentConnectionChangeTopicErrorInfo nestedErrorDetails(List<PersistentConnectionChangeTopicErrorInfoDetails> nestedErrorDetails) {
    this.nestedErrorDetails = nestedErrorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nestedErrorDetails")
  public List<PersistentConnectionChangeTopicErrorInfoDetails> getNestedErrorDetails() {
    return nestedErrorDetails;
  }
  public void setNestedErrorDetails(List<PersistentConnectionChangeTopicErrorInfoDetails> nestedErrorDetails) {
    this.nestedErrorDetails = nestedErrorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistentConnectionChangeTopicErrorInfo persistentConnectionChangeTopicErrorInfo = (PersistentConnectionChangeTopicErrorInfo) o;

    return Objects.equals(this.text, persistentConnectionChangeTopicErrorInfo.text) &&
            Objects.equals(this.code, persistentConnectionChangeTopicErrorInfo.code) &&
            Objects.equals(this.userMessage, persistentConnectionChangeTopicErrorInfo.userMessage) &&
            Objects.equals(this.userParams, persistentConnectionChangeTopicErrorInfo.userParams) &&
            Objects.equals(this.nestedErrorDetails, persistentConnectionChangeTopicErrorInfo.nestedErrorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, code, userMessage, userParams, nestedErrorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentConnectionChangeTopicErrorInfo {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    userParams: ").append(toIndentedString(userParams)).append("\n");
    sb.append("    nestedErrorDetails: ").append(toIndentedString(nestedErrorDetails)).append("\n");
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

