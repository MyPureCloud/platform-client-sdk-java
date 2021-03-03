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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.BuShortTermForecast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AsyncForecastOperationResult
 */

public class AsyncForecastOperationResult  implements Serializable {
  

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
  private BuShortTermForecast result = null;
  private Integer progress = null;

  
  /**
   * The status of the operation
   **/
  public AsyncForecastOperationResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the operation")
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
  public AsyncForecastOperationResult operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID for the operation")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  
  /**
   * The result of the operation.  Null unless status == Complete
   **/
  public AsyncForecastOperationResult result(BuShortTermForecast result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the operation.  Null unless status == Complete")
  @JsonProperty("result")
  public BuShortTermForecast getResult() {
    return result;
  }
  public void setResult(BuShortTermForecast result) {
    this.result = result;
  }

  
  /**
   * Percent progress for the operation
   **/
  public AsyncForecastOperationResult progress(Integer progress) {
    this.progress = progress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent progress for the operation")
  @JsonProperty("progress")
  public Integer getProgress() {
    return progress;
  }
  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncForecastOperationResult asyncForecastOperationResult = (AsyncForecastOperationResult) o;
    return Objects.equals(this.status, asyncForecastOperationResult.status) &&
        Objects.equals(this.operationId, asyncForecastOperationResult.operationId) &&
        Objects.equals(this.result, asyncForecastOperationResult.result) &&
        Objects.equals(this.progress, asyncForecastOperationResult.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, operationId, result, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncForecastOperationResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

