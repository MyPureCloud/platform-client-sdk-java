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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TranscriptionTopicTranscriptionRequestStatus
 */

public class TranscriptionTopicTranscriptionRequestStatus  implements Serializable {
  
  private Integer offsetMs = null;

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
    UNKNOWN("UNKNOWN"),
    SESSION_ONGOING("SESSION_ONGOING"),
    SESSION_ENDED("SESSION_ENDED");

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

  
  /**
   **/
  public TranscriptionTopicTranscriptionRequestStatus offsetMs(Integer offsetMs) {
    this.offsetMs = offsetMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offsetMs")
  public Integer getOffsetMs() {
    return offsetMs;
  }
  public void setOffsetMs(Integer offsetMs) {
    this.offsetMs = offsetMs;
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptionRequestStatus status(StatusEnum status) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionTopicTranscriptionRequestStatus transcriptionTopicTranscriptionRequestStatus = (TranscriptionTopicTranscriptionRequestStatus) o;
    return Objects.equals(this.offsetMs, transcriptionTopicTranscriptionRequestStatus.offsetMs) &&
        Objects.equals(this.status, transcriptionTopicTranscriptionRequestStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetMs, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionTopicTranscriptionRequestStatus {\n");
    
    sb.append("    offsetMs: ").append(toIndentedString(offsetMs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

