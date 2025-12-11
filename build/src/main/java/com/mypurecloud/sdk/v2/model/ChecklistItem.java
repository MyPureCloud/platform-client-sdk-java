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
 * ChecklistItem
 */

public class ChecklistItem  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean automatedCheckEnabled = null;
  private Boolean important = null;

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
   * Checklist state as evaluated by the model.
   */
 @JsonDeserialize(using = StateFromModelEnumDeserializer.class)
  public enum StateFromModelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
   * Checklist state as evaluated by the agent.
   */
 @JsonDeserialize(using = StateFromAgentEnumDeserializer.class)
  public enum StateFromAgentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private Boolean lastModifiedInAcw = null;
  private String selfUri = null;

  public ChecklistItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of the checklist item.
   **/
  public ChecklistItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the checklist item.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of the checklist item.
   **/
  public ChecklistItem name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the checklist item.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description of the checklist item.
   **/
  public ChecklistItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the checklist item.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Flag to indicate whether automated check is enabled for this checklist item.
   **/
  public ChecklistItem automatedCheckEnabled(Boolean automatedCheckEnabled) {
    this.automatedCheckEnabled = automatedCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to indicate whether automated check is enabled for this checklist item.")
  @JsonProperty("automatedCheckEnabled")
  public Boolean getAutomatedCheckEnabled() {
    return automatedCheckEnabled;
  }
  public void setAutomatedCheckEnabled(Boolean automatedCheckEnabled) {
    this.automatedCheckEnabled = automatedCheckEnabled;
  }


  /**
   * Flag to indicate whether this checklist item is marked as important.
   **/
  public ChecklistItem important(Boolean important) {
    this.important = important;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to indicate whether this checklist item is marked as important.")
  @JsonProperty("important")
  public Boolean getImportant() {
    return important;
  }
  public void setImportant(Boolean important) {
    this.important = important;
  }


  /**
   * Checklist state as evaluated by the model.
   **/
  public ChecklistItem stateFromModel(StateFromModelEnum stateFromModel) {
    this.stateFromModel = stateFromModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Checklist state as evaluated by the model.")
  @JsonProperty("stateFromModel")
  public StateFromModelEnum getStateFromModel() {
    return stateFromModel;
  }
  public void setStateFromModel(StateFromModelEnum stateFromModel) {
    this.stateFromModel = stateFromModel;
  }


  /**
   * Checklist state as evaluated by the agent.
   **/
  public ChecklistItem stateFromAgent(StateFromAgentEnum stateFromAgent) {
    this.stateFromAgent = stateFromAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Checklist state as evaluated by the agent.")
  @JsonProperty("stateFromAgent")
  public StateFromAgentEnum getStateFromAgent() {
    return stateFromAgent;
  }
  public void setStateFromAgent(StateFromAgentEnum stateFromAgent) {
    this.stateFromAgent = stateFromAgent;
  }


  /**
   * Date when the checklist item was last modified by the model. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChecklistItem dateLastModifiedByModel(Date dateLastModifiedByModel) {
    this.dateLastModifiedByModel = dateLastModifiedByModel;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist item was last modified by the model. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastModifiedByModel")
  public Date getDateLastModifiedByModel() {
    return dateLastModifiedByModel;
  }
  public void setDateLastModifiedByModel(Date dateLastModifiedByModel) {
    this.dateLastModifiedByModel = dateLastModifiedByModel;
  }


  /**
   * Date when the checklist item was last modified by the agent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChecklistItem dateLastModifiedByAgent(Date dateLastModifiedByAgent) {
    this.dateLastModifiedByAgent = dateLastModifiedByAgent;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist item was last modified by the agent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastModifiedByAgent")
  public Date getDateLastModifiedByAgent() {
    return dateLastModifiedByAgent;
  }
  public void setDateLastModifiedByAgent(Date dateLastModifiedByAgent) {
    this.dateLastModifiedByAgent = dateLastModifiedByAgent;
  }


  /**
   * Flag to indicate whether this checklist item was modified in ACW.
   **/
  public ChecklistItem lastModifiedInAcw(Boolean lastModifiedInAcw) {
    this.lastModifiedInAcw = lastModifiedInAcw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to indicate whether this checklist item was modified in ACW.")
  @JsonProperty("lastModifiedInAcw")
  public Boolean getLastModifiedInAcw() {
    return lastModifiedInAcw;
  }
  public void setLastModifiedInAcw(Boolean lastModifiedInAcw) {
    this.lastModifiedInAcw = lastModifiedInAcw;
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
    ChecklistItem checklistItem = (ChecklistItem) o;

    return Objects.equals(this.id, checklistItem.id) &&
            Objects.equals(this.name, checklistItem.name) &&
            Objects.equals(this.description, checklistItem.description) &&
            Objects.equals(this.automatedCheckEnabled, checklistItem.automatedCheckEnabled) &&
            Objects.equals(this.important, checklistItem.important) &&
            Objects.equals(this.stateFromModel, checklistItem.stateFromModel) &&
            Objects.equals(this.stateFromAgent, checklistItem.stateFromAgent) &&
            Objects.equals(this.dateLastModifiedByModel, checklistItem.dateLastModifiedByModel) &&
            Objects.equals(this.dateLastModifiedByAgent, checklistItem.dateLastModifiedByAgent) &&
            Objects.equals(this.lastModifiedInAcw, checklistItem.lastModifiedInAcw) &&
            Objects.equals(this.selfUri, checklistItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, automatedCheckEnabled, important, stateFromModel, stateFromAgent, dateLastModifiedByModel, dateLastModifiedByAgent, lastModifiedInAcw, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    automatedCheckEnabled: ").append(toIndentedString(automatedCheckEnabled)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
    sb.append("    stateFromModel: ").append(toIndentedString(stateFromModel)).append("\n");
    sb.append("    stateFromAgent: ").append(toIndentedString(stateFromAgent)).append("\n");
    sb.append("    dateLastModifiedByModel: ").append(toIndentedString(dateLastModifiedByModel)).append("\n");
    sb.append("    dateLastModifiedByAgent: ").append(toIndentedString(dateLastModifiedByAgent)).append("\n");
    sb.append("    lastModifiedInAcw: ").append(toIndentedString(lastModifiedInAcw)).append("\n");
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

