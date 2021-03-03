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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EventCondition
 */

public class EventCondition  implements Serializable {
  
  private String key = null;
  private List<String> values = new ArrayList<String>();

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The comparison operator.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONTAINSALL("containsAll"),
    CONTAINSANY("containsAny"),
    NOTCONTAINSALL("notContainsAll"),
    NOTCONTAINSANY("notContainsAny"),
    EQUAL("equal"),
    NOTEQUAL("notEqual"),
    GREATERTHAN("greaterThan"),
    GREATERTHANOREQUAL("greaterThanOrEqual"),
    LESSTHAN("lessThan"),
    LESSTHANOREQUAL("lessThanOrEqual"),
    STARTSWITH("startsWith"),
    ENDSWITH("endsWith");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;

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
   * The stream type for which this condition can be satisfied.
   */
 @JsonDeserialize(using = StreamTypeEnumDeserializer.class)
  public enum StreamTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WEB("Web"),
    CUSTOM("Custom"),
    CONVERSATION("Conversation");

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
   * The event key.
   **/
  public EventCondition key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event key.")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The event values.
   **/
  public EventCondition values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event values.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   * The comparison operator.
   **/
  public EventCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparison operator.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * The stream type for which this condition can be satisfied.
   **/
  public EventCondition streamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The stream type for which this condition can be satisfied.")
  @JsonProperty("streamType")
  public StreamTypeEnum getStreamType() {
    return streamType;
  }
  public void setStreamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
  }

  
  /**
   * The session type for which this condition can be satisfied.
   **/
  public EventCondition sessionType(String sessionType) {
    this.sessionType = sessionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The session type for which this condition can be satisfied.")
  @JsonProperty("sessionType")
  public String getSessionType() {
    return sessionType;
  }
  public void setSessionType(String sessionType) {
    this.sessionType = sessionType;
  }

  
  /**
   * The name of the event for which this condition can be satisfied.
   **/
  public EventCondition eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the event for which this condition can be satisfied.")
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
    EventCondition eventCondition = (EventCondition) o;
    return Objects.equals(this.key, eventCondition.key) &&
        Objects.equals(this.values, eventCondition.values) &&
        Objects.equals(this.operator, eventCondition.operator) &&
        Objects.equals(this.streamType, eventCondition.streamType) &&
        Objects.equals(this.sessionType, eventCondition.sessionType) &&
        Objects.equals(this.eventName, eventCondition.eventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values, operator, streamType, sessionType, eventName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCondition {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

