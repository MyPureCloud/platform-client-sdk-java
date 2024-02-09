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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.RequestCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RequestJourneyPattern
 */

public class RequestJourneyPattern  implements Serializable {
  
  private List<RequestCriteria> criteria = new ArrayList<RequestCriteria>();
  private Integer count = null;

  private static class StreamTypeEnumDeserializer extends StdDeserializer<StreamTypeEnum> {
    public StreamTypeEnumDeserializer() {
      super(StreamTypeEnumDeserializer.class);
    }

    @Override
    public StreamTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StreamTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The stream type for which this pattern can be matched on.
   */
 @JsonDeserialize(using = StreamTypeEnumDeserializer.class)
  public enum StreamTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WEB("Web"),
    CUSTOM("Custom"),
    CONVERSATION("Conversation"),
    APP("App");

    private String value;

    StreamTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StreamTypeEnum fromString(String key) {
      if (key == null) return null;

      for (StreamTypeEnum value : StreamTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StreamTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StreamTypeEnum streamType = null;
  private String sessionType = null;
  private String eventName = null;

  
  /**
   * A list of one or more criteria to satisfy.
   **/
  public RequestJourneyPattern criteria(List<RequestCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of one or more criteria to satisfy.")
  @JsonProperty("criteria")
  public List<RequestCriteria> getCriteria() {
    return criteria;
  }
  public void setCriteria(List<RequestCriteria> criteria) {
    this.criteria = criteria;
  }


  /**
   * The number of times the pattern must match.
   **/
  public RequestJourneyPattern count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the pattern must match.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * The stream type for which this pattern can be matched on.
   **/
  public RequestJourneyPattern streamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The stream type for which this pattern can be matched on.")
  @JsonProperty("streamType")
  public StreamTypeEnum getStreamType() {
    return streamType;
  }
  public void setStreamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
  }


  /**
   * The session type for which this pattern can be matched on.
   **/
  public RequestJourneyPattern sessionType(String sessionType) {
    this.sessionType = sessionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The session type for which this pattern can be matched on.")
  @JsonProperty("sessionType")
  public String getSessionType() {
    return sessionType;
  }
  public void setSessionType(String sessionType) {
    this.sessionType = sessionType;
  }


  /**
   * The name of the event for which this pattern can be matched on.
   **/
  public RequestJourneyPattern eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the event for which this pattern can be matched on.")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestJourneyPattern requestJourneyPattern = (RequestJourneyPattern) o;

    return Objects.equals(this.criteria, requestJourneyPattern.criteria) &&
            Objects.equals(this.count, requestJourneyPattern.count) &&
            Objects.equals(this.streamType, requestJourneyPattern.streamType) &&
            Objects.equals(this.sessionType, requestJourneyPattern.sessionType) &&
            Objects.equals(this.eventName, requestJourneyPattern.eventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, count, streamType, sessionType, eventName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestJourneyPattern {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
    sb.append("    sessionType: ").append(toIndentedString(sessionType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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

