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
import com.mypurecloud.sdk.v2.model.HistoricalDataDeleteEntity;
import com.mypurecloud.sdk.v2.model.HistoricalDataDisallowedDeleteEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * HistoricalImportDeleteFilesJobResponse
 */

public class HistoricalImportDeleteFilesJobResponse  implements Serializable {
  
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
   * Property denoting the state of the remove request
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private List<HistoricalDataDeleteEntity> entities = new ArrayList<HistoricalDataDeleteEntity>();
  private List<HistoricalDataDisallowedDeleteEntity> disallowedEntities = new ArrayList<HistoricalDataDisallowedDeleteEntity>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The Job Id Request")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Property denoting the state of the remove request
   **/
  public HistoricalImportDeleteFilesJobResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Property denoting the state of the remove request")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The request entities that got deleted
   **/
  public HistoricalImportDeleteFilesJobResponse entities(List<HistoricalDataDeleteEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The request entities that got deleted")
  @JsonProperty("entities")
  public List<HistoricalDataDeleteEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<HistoricalDataDeleteEntity> entities) {
    this.entities = entities;
  }


  /**
   * The request entities that were disallowed to be deleted
   **/
  public HistoricalImportDeleteFilesJobResponse disallowedEntities(List<HistoricalDataDisallowedDeleteEntity> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The request entities that were disallowed to be deleted")
  @JsonProperty("disallowedEntities")
  public List<HistoricalDataDisallowedDeleteEntity> getDisallowedEntities() {
    return disallowedEntities;
  }
  public void setDisallowedEntities(List<HistoricalDataDisallowedDeleteEntity> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
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
    HistoricalImportDeleteFilesJobResponse historicalImportDeleteFilesJobResponse = (HistoricalImportDeleteFilesJobResponse) o;

    return Objects.equals(this.id, historicalImportDeleteFilesJobResponse.id) &&
            Objects.equals(this.state, historicalImportDeleteFilesJobResponse.state) &&
            Objects.equals(this.entities, historicalImportDeleteFilesJobResponse.entities) &&
            Objects.equals(this.disallowedEntities, historicalImportDeleteFilesJobResponse.disallowedEntities) &&
            Objects.equals(this.selfUri, historicalImportDeleteFilesJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, entities, disallowedEntities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalImportDeleteFilesJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    disallowedEntities: ").append(toIndentedString(disallowedEntities)).append("\n");
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

