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
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicBuIntradayResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicBuIntradayNotification
 */

public class WfmBuIntradayDataUpdateTopicBuIntradayNotification  implements Serializable {
  
  private String operationId = null;
  private WfmBuIntradayDataUpdateTopicBuIntradayResult result = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayNotification operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayNotification result(WfmBuIntradayDataUpdateTopicBuIntradayResult result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("result")
  public WfmBuIntradayDataUpdateTopicBuIntradayResult getResult() {
    return result;
  }
  public void setResult(WfmBuIntradayDataUpdateTopicBuIntradayResult result) {
    this.result = result;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuIntradayDataUpdateTopicBuIntradayNotification wfmBuIntradayDataUpdateTopicBuIntradayNotification = (WfmBuIntradayDataUpdateTopicBuIntradayNotification) o;
    return Objects.equals(this.operationId, wfmBuIntradayDataUpdateTopicBuIntradayNotification.operationId) &&
        Objects.equals(this.result, wfmBuIntradayDataUpdateTopicBuIntradayNotification.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuIntradayNotification {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

