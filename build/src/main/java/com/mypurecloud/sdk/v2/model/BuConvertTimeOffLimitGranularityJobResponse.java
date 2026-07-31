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
import com.mypurecloud.sdk.v2.model.BuConvertTimeOffLimitGranularityJobProgress;
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitReference;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuConvertTimeOffLimitGranularityJobResponse
 */

public class BuConvertTimeOffLimitGranularityJobResponse  implements Serializable {
  
  private String id = null;
  private BuTimeOffLimitReference timeOffLimit = null;

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
   * The status of the job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    ERROR("Error"),
    PROCESSING("Processing");

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
  private BuConvertTimeOffLimitGranularityJobProgress progress = null;
  private ErrorBody error = null;
  private String selfUri = null;

  public BuConvertTimeOffLimitGranularityJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuConvertTimeOffLimitGranularityJobResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public BuConvertTimeOffLimitGranularityJobResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The time-off limit associated with this job
   **/
  public BuConvertTimeOffLimitGranularityJobResponse timeOffLimit(BuTimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time-off limit associated with this job")
  @JsonProperty("timeOffLimit")
  public BuTimeOffLimitReference getTimeOffLimit() {
    return timeOffLimit;
  }
  public void setTimeOffLimit(BuTimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
  }


  /**
   * The status of the job
   **/
  public BuConvertTimeOffLimitGranularityJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Progress of time-off limit granularity conversion
   **/
  public BuConvertTimeOffLimitGranularityJobResponse progress(BuConvertTimeOffLimitGranularityJobProgress progress) {
    this.progress = progress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Progress of time-off limit granularity conversion")
  @JsonProperty("progress")
  public BuConvertTimeOffLimitGranularityJobProgress getProgress() {
    return progress;
  }
  public void setProgress(BuConvertTimeOffLimitGranularityJobProgress progress) {
    this.progress = progress;
  }


  /**
   * Error information. Set only when status is Error
   **/
  public BuConvertTimeOffLimitGranularityJobResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error information. Set only when status is Error")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuConvertTimeOffLimitGranularityJobResponse buConvertTimeOffLimitGranularityJobResponse = (BuConvertTimeOffLimitGranularityJobResponse) o;

    return Objects.equals(this.id, buConvertTimeOffLimitGranularityJobResponse.id) &&
            Objects.equals(this.timeOffLimit, buConvertTimeOffLimitGranularityJobResponse.timeOffLimit) &&
            Objects.equals(this.status, buConvertTimeOffLimitGranularityJobResponse.status) &&
            Objects.equals(this.progress, buConvertTimeOffLimitGranularityJobResponse.progress) &&
            Objects.equals(this.error, buConvertTimeOffLimitGranularityJobResponse.error) &&
            Objects.equals(this.selfUri, buConvertTimeOffLimitGranularityJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeOffLimit, status, progress, error, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuConvertTimeOffLimitGranularityJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeOffLimit: ").append(toIndentedString(timeOffLimit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

