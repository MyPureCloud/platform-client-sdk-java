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
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceQueryResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceResultWrapper
 */

public class WfmHistoricalAdherenceResultWrapper  implements Serializable {
  
  private String entityId = null;
  private List<HistoricalAdherenceQueryResult> data = new ArrayList<HistoricalAdherenceQueryResult>();
  private Map<String, String> lookupIdToSecondaryPresenceId = null;

  
  /**
   * The operation ID of the historical adherence query
   **/
  public WfmHistoricalAdherenceResultWrapper entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operation ID of the historical adherence query")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  
  /**
   * The list of historical adherence query results
   **/
  public WfmHistoricalAdherenceResultWrapper data(List<HistoricalAdherenceQueryResult> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of historical adherence query results")
  @JsonProperty("data")
  public List<HistoricalAdherenceQueryResult> getData() {
    return data;
  }
  public void setData(List<HistoricalAdherenceQueryResult> data) {
    this.data = data;
  }

  
  /**
   * Map of secondary presence lookup ID to corresponding secondary presence ID
   **/
  public WfmHistoricalAdherenceResultWrapper lookupIdToSecondaryPresenceId(Map<String, String> lookupIdToSecondaryPresenceId) {
    this.lookupIdToSecondaryPresenceId = lookupIdToSecondaryPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of secondary presence lookup ID to corresponding secondary presence ID")
  @JsonProperty("lookupIdToSecondaryPresenceId")
  public Map<String, String> getLookupIdToSecondaryPresenceId() {
    return lookupIdToSecondaryPresenceId;
  }
  public void setLookupIdToSecondaryPresenceId(Map<String, String> lookupIdToSecondaryPresenceId) {
    this.lookupIdToSecondaryPresenceId = lookupIdToSecondaryPresenceId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceResultWrapper wfmHistoricalAdherenceResultWrapper = (WfmHistoricalAdherenceResultWrapper) o;
    return Objects.equals(this.entityId, wfmHistoricalAdherenceResultWrapper.entityId) &&
        Objects.equals(this.data, wfmHistoricalAdherenceResultWrapper.data) &&
        Objects.equals(this.lookupIdToSecondaryPresenceId, wfmHistoricalAdherenceResultWrapper.lookupIdToSecondaryPresenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, data, lookupIdToSecondaryPresenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceResultWrapper {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    lookupIdToSecondaryPresenceId: ").append(toIndentedString(lookupIdToSecondaryPresenceId)).append("\n");
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

