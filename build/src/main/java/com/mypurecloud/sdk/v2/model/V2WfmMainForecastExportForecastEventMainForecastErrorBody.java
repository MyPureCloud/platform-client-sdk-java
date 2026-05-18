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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V2WfmMainForecastExportForecastEventMainForecastErrorBody
 */

public class V2WfmMainForecastExportForecastEventMainForecastErrorBody  implements Serializable {
  
  private Long status = null;
  private String code = null;
  private String message = null;
  private Map<String, String> messageParams = null;

  public V2WfmMainForecastExportForecastEventMainForecastErrorBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2WfmMainForecastExportForecastEventMainForecastErrorBody(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2WfmMainForecastExportForecastEventMainForecastErrorBody status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }


  /**
   **/
  public V2WfmMainForecastExportForecastEventMainForecastErrorBody code(String code) {
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
  public V2WfmMainForecastExportForecastEventMainForecastErrorBody message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public V2WfmMainForecastExportForecastEventMainForecastErrorBody messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WfmMainForecastExportForecastEventMainForecastErrorBody v2WfmMainForecastExportForecastEventMainForecastErrorBody = (V2WfmMainForecastExportForecastEventMainForecastErrorBody) o;

    return Objects.equals(this.status, v2WfmMainForecastExportForecastEventMainForecastErrorBody.status) &&
            Objects.equals(this.code, v2WfmMainForecastExportForecastEventMainForecastErrorBody.code) &&
            Objects.equals(this.message, v2WfmMainForecastExportForecastEventMainForecastErrorBody.message) &&
            Objects.equals(this.messageParams, v2WfmMainForecastExportForecastEventMainForecastErrorBody.messageParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message, messageParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WfmMainForecastExportForecastEventMainForecastErrorBody {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
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

