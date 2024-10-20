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
import com.mypurecloud.sdk.v2.model.Copilot;
import com.mypurecloud.sdk.v2.model.GoogleDialogflowConfig;
import com.mypurecloud.sdk.v2.model.KnowledgeSuggestionConfig;
import com.mypurecloud.sdk.v2.model.TranscriptionConfig;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Assistant
 */

public class Assistant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private UserReference createdBy = null;
  private UserReference modifiedBy = null;
  private GoogleDialogflowConfig googleDialogflowConfig = null;
  private TranscriptionConfig transcriptionConfig = null;
  private KnowledgeSuggestionConfig knowledgeSuggestionConfig = null;

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
   * State of the assistant.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    INACTIVE("Inactive");

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
  private Copilot copilot = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the assistant that will assist the agent.
   **/
  public Assistant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the assistant that will assist the agent.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "Date when the assistant was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when the assistant was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The user who created the assistant.")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The user who last modified the assistant.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  /**
   * (Deprecated: use the 'knowledgeSuggestionConfig' for genesys knowledge suggestions) Configuration of Dialogflow used to assist the agent with transcriptions and knowledge suggestions.
   **/
  public Assistant googleDialogflowConfig(GoogleDialogflowConfig googleDialogflowConfig) {
    this.googleDialogflowConfig = googleDialogflowConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Deprecated: use the 'knowledgeSuggestionConfig' for genesys knowledge suggestions) Configuration of Dialogflow used to assist the agent with transcriptions and knowledge suggestions.")
  @JsonProperty("googleDialogflowConfig")
  public GoogleDialogflowConfig getGoogleDialogflowConfig() {
    return googleDialogflowConfig;
  }
  public void setGoogleDialogflowConfig(GoogleDialogflowConfig googleDialogflowConfig) {
    this.googleDialogflowConfig = googleDialogflowConfig;
  }


  /**
   * Configuration for speech transcription used to assist the agent.
   **/
  public Assistant transcriptionConfig(TranscriptionConfig transcriptionConfig) {
    this.transcriptionConfig = transcriptionConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configuration for speech transcription used to assist the agent.")
  @JsonProperty("transcriptionConfig")
  public TranscriptionConfig getTranscriptionConfig() {
    return transcriptionConfig;
  }
  public void setTranscriptionConfig(TranscriptionConfig transcriptionConfig) {
    this.transcriptionConfig = transcriptionConfig;
  }


  /**
   * Configuration that defines how to produce knowledge suggestions.
   **/
  public Assistant knowledgeSuggestionConfig(KnowledgeSuggestionConfig knowledgeSuggestionConfig) {
    this.knowledgeSuggestionConfig = knowledgeSuggestionConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configuration that defines how to produce knowledge suggestions.")
  @JsonProperty("knowledgeSuggestionConfig")
  public KnowledgeSuggestionConfig getKnowledgeSuggestionConfig() {
    return knowledgeSuggestionConfig;
  }
  public void setKnowledgeSuggestionConfig(KnowledgeSuggestionConfig knowledgeSuggestionConfig) {
    this.knowledgeSuggestionConfig = knowledgeSuggestionConfig;
  }


  @ApiModelProperty(example = "null", value = "State of the assistant.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }


  @ApiModelProperty(example = "null", value = "Agent copilot configuration.")
  @JsonProperty("copilot")
  public Copilot getCopilot() {
    return copilot;
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
    Assistant assistant = (Assistant) o;

    return Objects.equals(this.id, assistant.id) &&
            Objects.equals(this.name, assistant.name) &&
            Objects.equals(this.dateCreated, assistant.dateCreated) &&
            Objects.equals(this.dateModified, assistant.dateModified) &&
            Objects.equals(this.createdBy, assistant.createdBy) &&
            Objects.equals(this.modifiedBy, assistant.modifiedBy) &&
            Objects.equals(this.googleDialogflowConfig, assistant.googleDialogflowConfig) &&
            Objects.equals(this.transcriptionConfig, assistant.transcriptionConfig) &&
            Objects.equals(this.knowledgeSuggestionConfig, assistant.knowledgeSuggestionConfig) &&
            Objects.equals(this.state, assistant.state) &&
            Objects.equals(this.copilot, assistant.copilot) &&
            Objects.equals(this.selfUri, assistant.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, createdBy, modifiedBy, googleDialogflowConfig, transcriptionConfig, knowledgeSuggestionConfig, state, copilot, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assistant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    googleDialogflowConfig: ").append(toIndentedString(googleDialogflowConfig)).append("\n");
    sb.append("    transcriptionConfig: ").append(toIndentedString(transcriptionConfig)).append("\n");
    sb.append("    knowledgeSuggestionConfig: ").append(toIndentedString(knowledgeSuggestionConfig)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    copilot: ").append(toIndentedString(copilot)).append("\n");
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

