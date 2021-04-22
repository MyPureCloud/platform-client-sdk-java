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
import com.mypurecloud.sdk.v2.model.ConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.Participant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Conversation
 */

public class Conversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String externalTag = null;
  private Date startTime = null;
  private Date endTime = null;
  private String address = null;
  private List<Participant> participants = new ArrayList<Participant>();
  private List<String> conversationIds = new ArrayList<String>();
  private Integer maxParticipants = null;

  private static class RecordingStateEnumDeserializer extends StdDeserializer<RecordingStateEnum> {
    public RecordingStateEnumDeserializer() {
      super(RecordingStateEnumDeserializer.class);
    }

    @Override
    public RecordingStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RecordingStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording.
   */
 @JsonDeserialize(using = RecordingStateEnumDeserializer.class)
  public enum RecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    NONE("NONE");

    private String value;

    RecordingStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RecordingStateEnum fromString(String key) {
      if (key == null) return null;

      for (RecordingStateEnum value : RecordingStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RecordingStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RecordingStateEnum recordingState = null;

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
   * The conversation's state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("alerting"),
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    CONVERTING("converting"),
    UPLOADING("uploading"),
    TRANSMITTING("transmitting"),
    NONE("none");

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
  private List<ConversationDivisionMembership> divisions = new ArrayList<ConversationDivisionMembership>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Conversation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The external tag associated with the conversation.
   **/
  public Conversation externalTag(String externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external tag associated with the conversation.")
  @JsonProperty("externalTag")
  public String getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(String externalTag) {
    this.externalTag = externalTag;
  }

  
  /**
   * The time when the conversation started. This will be the time when the first participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Conversation startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time when the conversation started. This will be the time when the first participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The time when the conversation ended. This will be the time when the last participant left the conversation, or null when the conversation is still active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Conversation endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the conversation ended. This will be the time when the last participant left the conversation, or null when the conversation is still active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The address of the conversation as seen from an external participant. For phone calls this will be the DNIS for inbound calls and the ANI for outbound calls. For other media types this will be the address of the destination participant for inbound and the address of the initiating participant for outbound.
   **/
  public Conversation address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address of the conversation as seen from an external participant. For phone calls this will be the DNIS for inbound calls and the ANI for outbound calls. For other media types this will be the address of the destination participant for inbound and the address of the initiating participant for outbound.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * The list of all participants in the conversation.
   **/
  public Conversation participants(List<Participant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of all participants in the conversation.")
  @JsonProperty("participants")
  public List<Participant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<Participant> participants) {
    this.participants = participants;
  }

  
  /**
   * A list of conversations to merge into this conversation to create a conference. This field is null except when being used to create a conference.
   **/
  public Conversation conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of conversations to merge into this conversation to create a conference. This field is null except when being used to create a conference.")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }

  
  /**
   * If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference.
   **/
  public Conversation maxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference.")
  @JsonProperty("maxParticipants")
  public Integer getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
  }

  
  /**
   * On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording.
   **/
  public Conversation recordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording.")
  @JsonProperty("recordingState")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }

  
  /**
   * The conversation's state
   **/
  public Conversation state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation's state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Identifiers of divisions associated with this conversation
   **/
  public Conversation divisions(List<ConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifiers of divisions associated with this conversation")
  @JsonProperty("divisions")
  public List<ConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<ConversationDivisionMembership> divisions) {
    this.divisions = divisions;
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
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.name, conversation.name) &&
        Objects.equals(this.externalTag, conversation.externalTag) &&
        Objects.equals(this.startTime, conversation.startTime) &&
        Objects.equals(this.endTime, conversation.endTime) &&
        Objects.equals(this.address, conversation.address) &&
        Objects.equals(this.participants, conversation.participants) &&
        Objects.equals(this.conversationIds, conversation.conversationIds) &&
        Objects.equals(this.maxParticipants, conversation.maxParticipants) &&
        Objects.equals(this.recordingState, conversation.recordingState) &&
        Objects.equals(this.state, conversation.state) &&
        Objects.equals(this.divisions, conversation.divisions) &&
        Objects.equals(this.selfUri, conversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, externalTag, startTime, endTime, address, participants, conversationIds, maxParticipants, recordingState, state, divisions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
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

