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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicCallMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicCallConversation
 */

public class QueueConversationCallEventTopicCallConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<QueueConversationCallEventTopicCallMediaParticipant> participants = new ArrayList<QueueConversationCallEventTopicCallMediaParticipant>();
  private List<String> otherMediaUris = new ArrayList<String>();

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
  public QueueConversationCallEventTopicCallConversation maxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxParticipants")
  public Integer getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Integer maxParticipants) {
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
        Objects.equals(this.recordingState, queueConversationCallEventTopicCallConversation.recordingState) &&
        Objects.equals(this.maxParticipants, queueConversationCallEventTopicCallConversation.maxParticipants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, recordingState, maxParticipants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicCallConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
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

