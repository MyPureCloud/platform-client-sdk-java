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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AgentMuScheduleResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentMuQueryResponse
 */

public class AgentMuQueryResponse  implements Serializable {
  

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the operation
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    CANCELED("Canceled"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String operationId = null;
  private AgentMuScheduleResult result = null;
  private String downloadUrl = null;
  private ErrorBody error = null;

  public AgentMuQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The status of the operation
   **/
  public AgentMuQueryResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the operation")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The ID for the operation
   **/
  public AgentMuQueryResponse operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID for the operation")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  /**
   * The schema of the result of the operation. Null if downloadUrl is populated, but defines the schema of the data that will be returned from the downloadUrl
   **/
  public AgentMuQueryResponse result(AgentMuScheduleResult result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema of the result of the operation. Null if downloadUrl is populated, but defines the schema of the data that will be returned from the downloadUrl")
  @JsonProperty("result")
  public AgentMuScheduleResult getResult() {
    return result;
  }
  public void setResult(AgentMuScheduleResult result) {
    this.result = result;
  }


  /**
   * The URL from which to download the result. The result will follow the schema documented by the result field
   **/
  public AgentMuQueryResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL from which to download the result. The result will follow the schema documented by the result field")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Error details if status == 'Error'. Will always be null but the schema is documented in case of an error in an async notification
   **/
  public AgentMuQueryResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if status == 'Error'. Will always be null but the schema is documented in case of an error in an async notification")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMuQueryResponse agentMuQueryResponse = (AgentMuQueryResponse) o;

    return Objects.equals(this.status, agentMuQueryResponse.status) &&
            Objects.equals(this.operationId, agentMuQueryResponse.operationId) &&
            Objects.equals(this.result, agentMuQueryResponse.result) &&
            Objects.equals(this.downloadUrl, agentMuQueryResponse.downloadUrl) &&
            Objects.equals(this.error, agentMuQueryResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, operationId, result, downloadUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMuQueryResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

