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
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationEventTopicScreenMonitoring
 */

public class ConversationEventTopicScreenMonitoring  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("none"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  private static class InitialStateEnumDeserializer extends StdDeserializer<InitialStateEnum> {
    public InitialStateEnumDeserializer() {
      super(InitialStateEnumDeserializer.class);
    }

    @Override
    public InitialStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InitialStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets initialState
   */
 @JsonDeserialize(using = InitialStateEnumDeserializer.class)
  public enum InitialStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("none"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected");

    private String value;

    InitialStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InitialStateEnum fromString(String key) {
      if (key == null) return null;

      for (InitialStateEnum value : InitialStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InitialStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InitialStateEnum initialState = null;
  private String provider = null;

  private static class DisconnectTypeEnumDeserializer extends StdDeserializer<DisconnectTypeEnum> {
    public DisconnectTypeEnumDeserializer() {
      super(DisconnectTypeEnumDeserializer.class);
    }

    @Override
    public DisconnectTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DisconnectTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SYSTEM("system");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private String targetUserId = null;
  private String screenMonitoringId = null;

  private static class MonitoringTypeEnumDeserializer extends StdDeserializer<MonitoringTypeEnum> {
    public MonitoringTypeEnumDeserializer() {
      super(MonitoringTypeEnumDeserializer.class);
    }

    @Override
    public MonitoringTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MonitoringTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The screen monitoring type.
   */
 @JsonDeserialize(using = MonitoringTypeEnumDeserializer.class)
  public enum MonitoringTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    AGENTLEVEL("AgentLevel"),
    CONVERSATIONLEVEL("ConversationLevel");

    private String value;

    MonitoringTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MonitoringTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MonitoringTypeEnum value : MonitoringTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MonitoringTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MonitoringTypeEnum monitoringType = null;
  private Long count = null;

  public ConversationEventTopicScreenMonitoring() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public ConversationEventTopicScreenMonitoring id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this communication.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ConversationEventTopicScreenMonitoring state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public ConversationEventTopicScreenMonitoring initialState(InitialStateEnum initialState) {
    this.initialState = initialState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initialState")
  public InitialStateEnum getInitialState() {
    return initialState;
  }
  public void setInitialState(InitialStateEnum initialState) {
    this.initialState = initialState;
  }


  /**
   * The source provider.
   **/
  public ConversationEventTopicScreenMonitoring provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }


  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public ConversationEventTopicScreenMonitoring disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }


  /**
   * The timestamp when this communication was connected in the cloud clock.
   **/
  public ConversationEventTopicScreenMonitoring connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication was connected in the cloud clock.")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }


  /**
   * The timestamp when this communication disconnected from the conversation in the provider clock.
   **/
  public ConversationEventTopicScreenMonitoring disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication disconnected from the conversation in the provider clock.")
  @JsonProperty("disconnectedTime")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }


  /**
   * The user ID for the participant who is being screen monitored.
   **/
  public ConversationEventTopicScreenMonitoring targetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID for the participant who is being screen monitored.")
  @JsonProperty("targetUserId")
  public String getTargetUserId() {
    return targetUserId;
  }
  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  /**
   * Screen Monitoring identifier unique to the sourceUserId-targetUserId pair.
   **/
  public ConversationEventTopicScreenMonitoring screenMonitoringId(String screenMonitoringId) {
    this.screenMonitoringId = screenMonitoringId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Screen Monitoring identifier unique to the sourceUserId-targetUserId pair.")
  @JsonProperty("screenMonitoringId")
  public String getScreenMonitoringId() {
    return screenMonitoringId;
  }
  public void setScreenMonitoringId(String screenMonitoringId) {
    this.screenMonitoringId = screenMonitoringId;
  }


  /**
   * The screen monitoring type.
   **/
  public ConversationEventTopicScreenMonitoring monitoringType(MonitoringTypeEnum monitoringType) {
    this.monitoringType = monitoringType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The screen monitoring type.")
  @JsonProperty("monitoringType")
  public MonitoringTypeEnum getMonitoringType() {
    return monitoringType;
  }
  public void setMonitoringType(MonitoringTypeEnum monitoringType) {
    this.monitoringType = monitoringType;
  }


  /**
   * Number of Screen Monitoring sessions the targetUserId is involved in.
   **/
  public ConversationEventTopicScreenMonitoring count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of Screen Monitoring sessions the targetUserId is involved in.")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventTopicScreenMonitoring conversationEventTopicScreenMonitoring = (ConversationEventTopicScreenMonitoring) o;

    return Objects.equals(this.id, conversationEventTopicScreenMonitoring.id) &&
            Objects.equals(this.state, conversationEventTopicScreenMonitoring.state) &&
            Objects.equals(this.initialState, conversationEventTopicScreenMonitoring.initialState) &&
            Objects.equals(this.provider, conversationEventTopicScreenMonitoring.provider) &&
            Objects.equals(this.disconnectType, conversationEventTopicScreenMonitoring.disconnectType) &&
            Objects.equals(this.connectedTime, conversationEventTopicScreenMonitoring.connectedTime) &&
            Objects.equals(this.disconnectedTime, conversationEventTopicScreenMonitoring.disconnectedTime) &&
            Objects.equals(this.targetUserId, conversationEventTopicScreenMonitoring.targetUserId) &&
            Objects.equals(this.screenMonitoringId, conversationEventTopicScreenMonitoring.screenMonitoringId) &&
            Objects.equals(this.monitoringType, conversationEventTopicScreenMonitoring.monitoringType) &&
            Objects.equals(this.count, conversationEventTopicScreenMonitoring.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, initialState, provider, disconnectType, connectedTime, disconnectedTime, targetUserId, screenMonitoringId, monitoringType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicScreenMonitoring {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
    sb.append("    screenMonitoringId: ").append(toIndentedString(screenMonitoringId)).append("\n");
    sb.append("    monitoringType: ").append(toIndentedString(monitoringType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

