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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicCallMediaParticipant;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicConversationDivisionMembership;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicCallConversation
 */

public class QueueConversationCallEventTopicCallConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<QueueConversationCallEventTopicCallMediaParticipant> participants = null;
  private List<String> otherMediaUris = null;
  private String address = null;
  private String utilizationLabelId = null;
  private Date inactivityTimeout = null;
  private List<QueueConversationCallEventTopicConversationDivisionMembership> divisions = null;

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
  private Boolean securePause = null;
  private Long maxParticipants = null;

  public QueueConversationCallEventTopicCallConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<QueueConversationCallEventTopicCallMediaParticipant>();
      otherMediaUris = new ArrayList<String>();
      divisions = new ArrayList<QueueConversationCallEventTopicConversationDivisionMembership>();
    }
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallConversation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation name(String name) {
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
   **/
  public QueueConversationCallEventTopicCallConversation participants(List<QueueConversationCallEventTopicCallMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<QueueConversationCallEventTopicCallMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<QueueConversationCallEventTopicCallMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation otherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherMediaUris")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation inactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inactivityTimeout")
  public Date getInactivityTimeout() {
    return inactivityTimeout;
  }
  public void setInactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation divisions(List<QueueConversationCallEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisions")
  public List<QueueConversationCallEventTopicConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<QueueConversationCallEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation recordingState(RecordingStateEnum recordingState) {
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
   **/
  public QueueConversationCallEventTopicCallConversation securePause(Boolean securePause) {
    this.securePause = securePause;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("securePause")
  public Boolean getSecurePause() {
    return securePause;
  }
  public void setSecurePause(Boolean securePause) {
    this.securePause = securePause;
  }


  /**
   **/
  public QueueConversationCallEventTopicCallConversation maxParticipants(Long maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxParticipants")
  public Long getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Long maxParticipants) {
    this.maxParticipants = maxParticipants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallEventTopicCallConversation queueConversationCallEventTopicCallConversation = (QueueConversationCallEventTopicCallConversation) o;

    return Objects.equals(this.id, queueConversationCallEventTopicCallConversation.id) &&
            Objects.equals(this.name, queueConversationCallEventTopicCallConversation.name) &&
            Objects.equals(this.participants, queueConversationCallEventTopicCallConversation.participants) &&
            Objects.equals(this.otherMediaUris, queueConversationCallEventTopicCallConversation.otherMediaUris) &&
            Objects.equals(this.address, queueConversationCallEventTopicCallConversation.address) &&
            Objects.equals(this.utilizationLabelId, queueConversationCallEventTopicCallConversation.utilizationLabelId) &&
            Objects.equals(this.inactivityTimeout, queueConversationCallEventTopicCallConversation.inactivityTimeout) &&
            Objects.equals(this.divisions, queueConversationCallEventTopicCallConversation.divisions) &&
            Objects.equals(this.recordingState, queueConversationCallEventTopicCallConversation.recordingState) &&
            Objects.equals(this.securePause, queueConversationCallEventTopicCallConversation.securePause) &&
            Objects.equals(this.maxParticipants, queueConversationCallEventTopicCallConversation.maxParticipants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, address, utilizationLabelId, inactivityTimeout, divisions, recordingState, securePause, maxParticipants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicCallConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
    sb.append("    inactivityTimeout: ").append(toIndentedString(inactivityTimeout)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    securePause: ").append(toIndentedString(securePause)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
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

