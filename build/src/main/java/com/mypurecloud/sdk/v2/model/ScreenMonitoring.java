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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Segment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ScreenMonitoring
 */

public class ScreenMonitoring  implements Serializable {
  
  private String id = null;

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
   * The initial connection state of this communication.
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
   * The connection state of this communication.
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
  private List<Segment> segments = null;

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
  private String provider = null;
  private AddressableEntityRef targetUser = null;
  private AddressableEntityRef screenMonitoring = null;

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
  private Date connectedTime = null;
  private Date disconnectedTime = null;

  public ScreenMonitoring() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      segments = new ArrayList<Segment>();
    }
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public ScreenMonitoring id(String id) {
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
   * The initial connection state of this communication.
   **/
  public ScreenMonitoring initialState(InitialStateEnum initialState) {
    this.initialState = initialState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The initial connection state of this communication.")
  @JsonProperty("initialState")
  public InitialStateEnum getInitialState() {
    return initialState;
  }
  public void setInitialState(InitialStateEnum initialState) {
    this.initialState = initialState;
  }


  /**
   * The connection state of this communication.
   **/
  public ScreenMonitoring state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The connection state of this communication.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The time line of the participant's Screen Monitoring media, divided into activity segments.
   **/
  public ScreenMonitoring segments(List<Segment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time line of the participant's Screen Monitoring media, divided into activity segments.")
  @JsonProperty("segments")
  public List<Segment> getSegments() {
    return segments;
  }
  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }


  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public ScreenMonitoring disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The source provider of Screen Monitoring media.
   **/
  public ScreenMonitoring provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of Screen Monitoring media.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }


  /**
   * The user participant who is being screen monitored.
   **/
  public ScreenMonitoring targetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user participant who is being screen monitored.")
  @JsonProperty("targetUser")
  public AddressableEntityRef getTargetUser() {
    return targetUser;
  }
  public void setTargetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
  }


  /**
   * Screen Monitoring identifier unique to the sourceUserId-targetUserId pair.
   **/
  public ScreenMonitoring screenMonitoring(AddressableEntityRef screenMonitoring) {
    this.screenMonitoring = screenMonitoring;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Screen Monitoring identifier unique to the sourceUserId-targetUserId pair.")
  @JsonProperty("screenMonitoring")
  public AddressableEntityRef getScreenMonitoring() {
    return screenMonitoring;
  }
  public void setScreenMonitoring(AddressableEntityRef screenMonitoring) {
    this.screenMonitoring = screenMonitoring;
  }


  /**
   * The screen monitoring type.
   **/
  public ScreenMonitoring monitoringType(MonitoringTypeEnum monitoringType) {
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
  public ScreenMonitoring count(Long count) {
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


  /**
   * The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScreenMonitoring connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }


  /**
   * The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScreenMonitoring disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("disconnectedTime")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenMonitoring screenMonitoring = (ScreenMonitoring) o;

    return Objects.equals(this.id, screenMonitoring.id) &&
            Objects.equals(this.initialState, screenMonitoring.initialState) &&
            Objects.equals(this.state, screenMonitoring.state) &&
            Objects.equals(this.segments, screenMonitoring.segments) &&
            Objects.equals(this.disconnectType, screenMonitoring.disconnectType) &&
            Objects.equals(this.provider, screenMonitoring.provider) &&
            Objects.equals(this.targetUser, screenMonitoring.targetUser) &&
            Objects.equals(this.screenMonitoring, screenMonitoring.screenMonitoring) &&
            Objects.equals(this.monitoringType, screenMonitoring.monitoringType) &&
            Objects.equals(this.count, screenMonitoring.count) &&
            Objects.equals(this.connectedTime, screenMonitoring.connectedTime) &&
            Objects.equals(this.disconnectedTime, screenMonitoring.disconnectedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initialState, state, segments, disconnectType, provider, targetUser, screenMonitoring, monitoringType, count, connectedTime, disconnectedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenMonitoring {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
    sb.append("    screenMonitoring: ").append(toIndentedString(screenMonitoring)).append("\n");
    sb.append("    monitoringType: ").append(toIndentedString(monitoringType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
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

