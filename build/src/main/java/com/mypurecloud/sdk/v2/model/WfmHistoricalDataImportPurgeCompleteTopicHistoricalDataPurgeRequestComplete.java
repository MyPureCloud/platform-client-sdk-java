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
import com.mypurecloud.sdk.v2.model.WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity;
import com.mypurecloud.sdk.v2.model.WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete
 */

public class WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete  implements Serializable {
  
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
    UNKNOWN("Unknown"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

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
  private List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity> entities = new ArrayList<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity>();
  private List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity> disallowedEntities = new ArrayList<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity>();

  
  /**
   **/
  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete id(String id) {
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
  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete state(StateEnum state) {
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
  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete entities(List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity> entities) {
    this.entities = entities;
  }


  /**
   **/
  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete disallowedEntities(List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disallowedEntities")
  public List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity> getDisallowedEntities() {
    return disallowedEntities;
  }
  public void setDisallowedEntities(List<WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete = (WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete) o;

    return Objects.equals(this.id, wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete.id) &&
            Objects.equals(this.state, wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete.state) &&
            Objects.equals(this.entities, wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete.entities) &&
            Objects.equals(this.disallowedEntities, wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete.disallowedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, entities, disallowedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    disallowedEntities: ").append(toIndentedString(disallowedEntities)).append("\n");
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

