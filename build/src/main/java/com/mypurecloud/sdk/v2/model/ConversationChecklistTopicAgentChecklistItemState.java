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
 * ConversationChecklistTopicAgentChecklistItemState
 */

public class ConversationChecklistTopicAgentChecklistItemState  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  private static class StateFromModelEnumDeserializer extends StdDeserializer<StateFromModelEnum> {
    public StateFromModelEnumDeserializer() {
      super(StateFromModelEnumDeserializer.class);
    }

    @Override
    public StateFromModelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateFromModelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets stateFromModel
   */
 @JsonDeserialize(using = StateFromModelEnumDeserializer.class)
  public enum StateFromModelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    TICKED("Ticked"),
    UNTICKED("Unticked");

    private String value;

    StateFromModelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateFromModelEnum fromString(String key) {
      if (key == null) return null;

      for (StateFromModelEnum value : StateFromModelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateFromModelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateFromModelEnum stateFromModel = null;

  private static class StateFromAgentEnumDeserializer extends StdDeserializer<StateFromAgentEnum> {
    public StateFromAgentEnumDeserializer() {
      super(StateFromAgentEnumDeserializer.class);
    }

    @Override
    public StateFromAgentEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateFromAgentEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets stateFromAgent
   */
 @JsonDeserialize(using = StateFromAgentEnumDeserializer.class)
  public enum StateFromAgentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    TICKED("Ticked"),
    UNTICKED("Unticked");

    private String value;

    StateFromAgentEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateFromAgentEnum fromString(String key) {
      if (key == null) return null;

      for (StateFromAgentEnum value : StateFromAgentEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateFromAgentEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateFromAgentEnum stateFromAgent = null;
  private Date dateLastModifiedByModel = null;
  private Date dateLastModifiedByAgent = null;
  private Boolean automatedCheckEnabled = null;
  private Boolean important = null;
  private Boolean lastModifiedInAcw = null;

  public ConversationChecklistTopicAgentChecklistItemState() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState id(String id) {
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
  public ConversationChecklistTopicAgentChecklistItemState name(String name) {
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
  public ConversationChecklistTopicAgentChecklistItemState description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState stateFromModel(StateFromModelEnum stateFromModel) {
    this.stateFromModel = stateFromModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stateFromModel")
  public StateFromModelEnum getStateFromModel() {
    return stateFromModel;
  }
  public void setStateFromModel(StateFromModelEnum stateFromModel) {
    this.stateFromModel = stateFromModel;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState stateFromAgent(StateFromAgentEnum stateFromAgent) {
    this.stateFromAgent = stateFromAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stateFromAgent")
  public StateFromAgentEnum getStateFromAgent() {
    return stateFromAgent;
  }
  public void setStateFromAgent(StateFromAgentEnum stateFromAgent) {
    this.stateFromAgent = stateFromAgent;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState dateLastModifiedByModel(Date dateLastModifiedByModel) {
    this.dateLastModifiedByModel = dateLastModifiedByModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateLastModifiedByModel")
  public Date getDateLastModifiedByModel() {
    return dateLastModifiedByModel;
  }
  public void setDateLastModifiedByModel(Date dateLastModifiedByModel) {
    this.dateLastModifiedByModel = dateLastModifiedByModel;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState dateLastModifiedByAgent(Date dateLastModifiedByAgent) {
    this.dateLastModifiedByAgent = dateLastModifiedByAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateLastModifiedByAgent")
  public Date getDateLastModifiedByAgent() {
    return dateLastModifiedByAgent;
  }
  public void setDateLastModifiedByAgent(Date dateLastModifiedByAgent) {
    this.dateLastModifiedByAgent = dateLastModifiedByAgent;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState automatedCheckEnabled(Boolean automatedCheckEnabled) {
    this.automatedCheckEnabled = automatedCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("automatedCheckEnabled")
  public Boolean getAutomatedCheckEnabled() {
    return automatedCheckEnabled;
  }
  public void setAutomatedCheckEnabled(Boolean automatedCheckEnabled) {
    this.automatedCheckEnabled = automatedCheckEnabled;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState important(Boolean important) {
    this.important = important;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("important")
  public Boolean getImportant() {
    return important;
  }
  public void setImportant(Boolean important) {
    this.important = important;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistItemState lastModifiedInAcw(Boolean lastModifiedInAcw) {
    this.lastModifiedInAcw = lastModifiedInAcw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastModifiedInAcw")
  public Boolean getLastModifiedInAcw() {
    return lastModifiedInAcw;
  }
  public void setLastModifiedInAcw(Boolean lastModifiedInAcw) {
    this.lastModifiedInAcw = lastModifiedInAcw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationChecklistTopicAgentChecklistItemState conversationChecklistTopicAgentChecklistItemState = (ConversationChecklistTopicAgentChecklistItemState) o;

    return Objects.equals(this.id, conversationChecklistTopicAgentChecklistItemState.id) &&
            Objects.equals(this.name, conversationChecklistTopicAgentChecklistItemState.name) &&
            Objects.equals(this.description, conversationChecklistTopicAgentChecklistItemState.description) &&
            Objects.equals(this.stateFromModel, conversationChecklistTopicAgentChecklistItemState.stateFromModel) &&
            Objects.equals(this.stateFromAgent, conversationChecklistTopicAgentChecklistItemState.stateFromAgent) &&
            Objects.equals(this.dateLastModifiedByModel, conversationChecklistTopicAgentChecklistItemState.dateLastModifiedByModel) &&
            Objects.equals(this.dateLastModifiedByAgent, conversationChecklistTopicAgentChecklistItemState.dateLastModifiedByAgent) &&
            Objects.equals(this.automatedCheckEnabled, conversationChecklistTopicAgentChecklistItemState.automatedCheckEnabled) &&
            Objects.equals(this.important, conversationChecklistTopicAgentChecklistItemState.important) &&
            Objects.equals(this.lastModifiedInAcw, conversationChecklistTopicAgentChecklistItemState.lastModifiedInAcw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, stateFromModel, stateFromAgent, dateLastModifiedByModel, dateLastModifiedByAgent, automatedCheckEnabled, important, lastModifiedInAcw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChecklistTopicAgentChecklistItemState {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    stateFromModel: ").append(toIndentedString(stateFromModel)).append("\n");
    sb.append("    stateFromAgent: ").append(toIndentedString(stateFromAgent)).append("\n");
    sb.append("    dateLastModifiedByModel: ").append(toIndentedString(dateLastModifiedByModel)).append("\n");
    sb.append("    dateLastModifiedByAgent: ").append(toIndentedString(dateLastModifiedByAgent)).append("\n");
    sb.append("    automatedCheckEnabled: ").append(toIndentedString(automatedCheckEnabled)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
    sb.append("    lastModifiedInAcw: ").append(toIndentedString(lastModifiedInAcw)).append("\n");
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

