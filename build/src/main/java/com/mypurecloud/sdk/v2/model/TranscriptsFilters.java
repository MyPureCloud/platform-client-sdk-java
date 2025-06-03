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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptsFilters
 */

public class TranscriptsFilters  implements Serializable {
  

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The media type of the transcripts, default value is all 
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("call"),
    MESSAGE("message"),
    EMAIL("email"),
    CHAT("chat"),
    CALLBACK("callback"),
    ALL("all");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private Long startTimeMs = null;
  private Long endTimeMs = null;
  private List<String> queues = null;
  private List<String> flows = null;

  public TranscriptsFilters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      queues = new ArrayList<String>();
      flows = new ArrayList<String>();
    }
  }

  
  /**
   * The media type of the transcripts, default value is all 
   **/
  public TranscriptsFilters mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type of the transcripts, default value is all ")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * start time to filter by, default value is 7 days into the past
   **/
  public TranscriptsFilters startTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "start time to filter by, default value is 7 days into the past")
  @JsonProperty("startTimeMs")
  public Long getStartTimeMs() {
    return startTimeMs;
  }
  public void setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }


  /**
   * end time to filter by, default value is current time
   **/
  public TranscriptsFilters endTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "end time to filter by, default value is current time")
  @JsonProperty("endTimeMs")
  public Long getEndTimeMs() {
    return endTimeMs;
  }
  public void setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
  }


  /**
   * list of queues ids to filter by
   **/
  public TranscriptsFilters queues(List<String> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "list of queues ids to filter by")
  @JsonProperty("queues")
  public List<String> getQueues() {
    return queues;
  }
  public void setQueues(List<String> queues) {
    this.queues = queues;
  }


  /**
   * list of flows ids to filter by
   **/
  public TranscriptsFilters flows(List<String> flows) {
    this.flows = flows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "list of flows ids to filter by")
  @JsonProperty("flows")
  public List<String> getFlows() {
    return flows;
  }
  public void setFlows(List<String> flows) {
    this.flows = flows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptsFilters transcriptsFilters = (TranscriptsFilters) o;

    return Objects.equals(this.mediaType, transcriptsFilters.mediaType) &&
            Objects.equals(this.startTimeMs, transcriptsFilters.startTimeMs) &&
            Objects.equals(this.endTimeMs, transcriptsFilters.endTimeMs) &&
            Objects.equals(this.queues, transcriptsFilters.queues) &&
            Objects.equals(this.flows, transcriptsFilters.flows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, startTimeMs, endTimeMs, queues, flows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptsFilters {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
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

