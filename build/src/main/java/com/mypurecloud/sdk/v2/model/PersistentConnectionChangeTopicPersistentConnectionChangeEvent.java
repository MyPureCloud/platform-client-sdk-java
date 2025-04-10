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
import com.mypurecloud.sdk.v2.model.PersistentConnectionChangeTopicErrorInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * PersistentConnectionChangeTopicPersistentConnectionChangeEvent
 */

public class PersistentConnectionChangeTopicPersistentConnectionChangeEvent  implements Serializable {
  
  private PersistentConnectionChangeTopicErrorInfo errorInfo = null;
  private String stationId = null;
  private String userId = null;

  private static class PersistentStateEnumDeserializer extends StdDeserializer<PersistentStateEnum> {
    public PersistentStateEnumDeserializer() {
      super(PersistentStateEnumDeserializer.class);
    }

    @Override
    public PersistentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PersistentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets persistentState
   */
 @JsonDeserialize(using = PersistentStateEnumDeserializer.class)
  public enum PersistentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    PERSISTED("PERSISTED"),
    ACTIVE_CALL("ACTIVE_CALL"),
    DISCONNECTED("DISCONNECTED"),
    FAILED("FAILED");

    private String value;

    PersistentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PersistentStateEnum fromString(String key) {
      if (key == null) return null;

      for (PersistentStateEnum value : PersistentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PersistentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PersistentStateEnum persistentState = null;
  private Date eventTime = null;

  public PersistentConnectionChangeTopicPersistentConnectionChangeEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public PersistentConnectionChangeTopicPersistentConnectionChangeEvent errorInfo(PersistentConnectionChangeTopicErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public PersistentConnectionChangeTopicErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(PersistentConnectionChangeTopicErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   **/
  public PersistentConnectionChangeTopicPersistentConnectionChangeEvent stationId(String stationId) {
    this.stationId = stationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stationId")
  public String getStationId() {
    return stationId;
  }
  public void setStationId(String stationId) {
    this.stationId = stationId;
  }


  /**
   **/
  public PersistentConnectionChangeTopicPersistentConnectionChangeEvent userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public PersistentConnectionChangeTopicPersistentConnectionChangeEvent persistentState(PersistentStateEnum persistentState) {
    this.persistentState = persistentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("persistentState")
  public PersistentStateEnum getPersistentState() {
    return persistentState;
  }
  public void setPersistentState(PersistentStateEnum persistentState) {
    this.persistentState = persistentState;
  }


  /**
   **/
  public PersistentConnectionChangeTopicPersistentConnectionChangeEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistentConnectionChangeTopicPersistentConnectionChangeEvent persistentConnectionChangeTopicPersistentConnectionChangeEvent = (PersistentConnectionChangeTopicPersistentConnectionChangeEvent) o;

    return Objects.equals(this.errorInfo, persistentConnectionChangeTopicPersistentConnectionChangeEvent.errorInfo) &&
            Objects.equals(this.stationId, persistentConnectionChangeTopicPersistentConnectionChangeEvent.stationId) &&
            Objects.equals(this.userId, persistentConnectionChangeTopicPersistentConnectionChangeEvent.userId) &&
            Objects.equals(this.persistentState, persistentConnectionChangeTopicPersistentConnectionChangeEvent.persistentState) &&
            Objects.equals(this.eventTime, persistentConnectionChangeTopicPersistentConnectionChangeEvent.eventTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorInfo, stationId, userId, persistentState, eventTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentConnectionChangeTopicPersistentConnectionChangeEvent {\n");
    
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    persistentState: ").append(toIndentedString(persistentState)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
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

