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
import com.mypurecloud.sdk.v2.model.CallMediaParticipant;
import com.mypurecloud.sdk.v2.model.ConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.TransferResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CallConversation
 */

public class CallConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<CallMediaParticipant> participants = null;
  private List<String> otherMediaUris = null;
  private List<TransferResponse> recentTransfers = null;
  private String utilizationLabelId = null;
  private List<ConversationDivisionMembership> divisions = null;

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
   * Gets or Sets recordingState
   */
 @JsonDeserialize(using = RecordingStateEnumDeserializer.class)
  public enum RecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("none"),
    ACTIVE("active"),
    PAUSED("paused");

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
  private Integer maxParticipants = null;
  private Boolean securePause = null;
  private String selfUri = null;

  public CallConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<CallMediaParticipant>();
      otherMediaUris = new ArrayList<String>();
      recentTransfers = new ArrayList<TransferResponse>();
      divisions = new ArrayList<ConversationDivisionMembership>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CallConversation name(String name) {
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
   * The list of participants involved in the conversation.
   **/
  public CallConversation participants(List<CallMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of participants involved in the conversation.")
  @JsonProperty("participants")
  public List<CallMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<CallMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   * The list of other media channels involved in the conversation.
   **/
  public CallConversation otherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of other media channels involved in the conversation.")
  @JsonProperty("otherMediaUris")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }


  /**
   * The list of the most recent 20 transfer commands applied to this conversation.
   **/
  public CallConversation recentTransfers(List<TransferResponse> recentTransfers) {
    this.recentTransfers = recentTransfers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the most recent 20 transfer commands applied to this conversation.")
  @JsonProperty("recentTransfers")
  public List<TransferResponse> getRecentTransfers() {
    return recentTransfers;
  }
  public void setRecentTransfers(List<TransferResponse> recentTransfers) {
    this.recentTransfers = recentTransfers;
  }


  /**
   * An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level
   **/
  public CallConversation utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  /**
   * Identifiers of divisions associated with this conversation.
   **/
  public CallConversation divisions(List<ConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifiers of divisions associated with this conversation.")
  @JsonProperty("divisions")
  public List<ConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<ConversationDivisionMembership> divisions) {
    this.divisions = divisions;
  }


  /**
   **/
  public CallConversation recordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordingState")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }


  /**
   * If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference.
   **/
  public CallConversation maxParticipants(Integer maxParticipants) {
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
   * True when the recording of this conversation is in secure pause status.
   **/
  public CallConversation securePause(Boolean securePause) {
    this.securePause = securePause;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True when the recording of this conversation is in secure pause status.")
  @JsonProperty("securePause")
  public Boolean getSecurePause() {
    return securePause;
  }
  public void setSecurePause(Boolean securePause) {
    this.securePause = securePause;
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
    CallConversation callConversation = (CallConversation) o;

    return Objects.equals(this.id, callConversation.id) &&
            Objects.equals(this.name, callConversation.name) &&
            Objects.equals(this.participants, callConversation.participants) &&
            Objects.equals(this.otherMediaUris, callConversation.otherMediaUris) &&
            Objects.equals(this.recentTransfers, callConversation.recentTransfers) &&
            Objects.equals(this.utilizationLabelId, callConversation.utilizationLabelId) &&
            Objects.equals(this.divisions, callConversation.divisions) &&
            Objects.equals(this.recordingState, callConversation.recordingState) &&
            Objects.equals(this.maxParticipants, callConversation.maxParticipants) &&
            Objects.equals(this.securePause, callConversation.securePause) &&
            Objects.equals(this.selfUri, callConversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, recentTransfers, utilizationLabelId, divisions, recordingState, maxParticipants, securePause, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    recentTransfers: ").append(toIndentedString(recentTransfers)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    securePause: ").append(toIndentedString(securePause)).append("\n");
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

