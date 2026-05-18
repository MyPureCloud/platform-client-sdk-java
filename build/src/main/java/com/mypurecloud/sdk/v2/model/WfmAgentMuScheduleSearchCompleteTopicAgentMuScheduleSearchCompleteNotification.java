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
import com.mypurecloud.sdk.v2.model.WfmAgentMuScheduleSearchCompleteTopicErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification
 */

public class WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification  implements Serializable {
  
  private String operationId = null;

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
   * Gets or Sets status
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
  private String downloadUrl = null;
  private WfmAgentMuScheduleSearchCompleteTopicErrorBody error = null;

  public WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification operationId(String operationId) {
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
  public WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   **/
  public WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification error(WfmAgentMuScheduleSearchCompleteTopicErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmAgentMuScheduleSearchCompleteTopicErrorBody getError() {
    return error;
  }
  public void setError(WfmAgentMuScheduleSearchCompleteTopicErrorBody error) {
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
    WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification wfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification = (WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification) o;

    return Objects.equals(this.operationId, wfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification.operationId) &&
            Objects.equals(this.status, wfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification.status) &&
            Objects.equals(this.downloadUrl, wfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification.downloadUrl) &&
            Objects.equals(this.error, wfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, status, downloadUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentMuScheduleSearchCompleteTopicAgentMuScheduleSearchCompleteNotification {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

