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
import com.mypurecloud.sdk.v2.model.AgentWorkPlans;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * MuAgentsWorkPlansResult
 */

public class MuAgentsWorkPlansResult  implements Serializable {
  
  private List<AgentWorkPlans> entities = null;
  private LocalDate referenceStartWeekDate = null;
  private Map<String, WorkPlanReference> workPlanLookup = null;

  public MuAgentsWorkPlansResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<AgentWorkPlans>();
    }
  }

  
  /**
   **/
  public MuAgentsWorkPlansResult entities(List<AgentWorkPlans> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<AgentWorkPlans> getEntities() {
    return entities;
  }
  public void setEntities(List<AgentWorkPlans> entities) {
    this.entities = entities;
  }


  /**
   * The reference date in yyyy-MM-dd format rolled back to nearest BU start day of week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public MuAgentsWorkPlansResult referenceStartWeekDate(LocalDate referenceStartWeekDate) {
    this.referenceStartWeekDate = referenceStartWeekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference date in yyyy-MM-dd format rolled back to nearest BU start day of week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("referenceStartWeekDate")
  public LocalDate getReferenceStartWeekDate() {
    return referenceStartWeekDate;
  }
  public void setReferenceStartWeekDate(LocalDate referenceStartWeekDate) {
    this.referenceStartWeekDate = referenceStartWeekDate;
  }


  /**
   * Map containing lookup values for agent work plans. The integer keys serves as lookup keys for effective work plan from workPlanLookupKeysPerWeek property
   **/
  public MuAgentsWorkPlansResult workPlanLookup(Map<String, WorkPlanReference> workPlanLookup) {
    this.workPlanLookup = workPlanLookup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Map containing lookup values for agent work plans. The integer keys serves as lookup keys for effective work plan from workPlanLookupKeysPerWeek property")
  @JsonProperty("workPlanLookup")
  public Map<String, WorkPlanReference> getWorkPlanLookup() {
    return workPlanLookup;
  }
  public void setWorkPlanLookup(Map<String, WorkPlanReference> workPlanLookup) {
    this.workPlanLookup = workPlanLookup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuAgentsWorkPlansResult muAgentsWorkPlansResult = (MuAgentsWorkPlansResult) o;

    return Objects.equals(this.entities, muAgentsWorkPlansResult.entities) &&
            Objects.equals(this.referenceStartWeekDate, muAgentsWorkPlansResult.referenceStartWeekDate) &&
            Objects.equals(this.workPlanLookup, muAgentsWorkPlansResult.workPlanLookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, referenceStartWeekDate, workPlanLookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuAgentsWorkPlansResult {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    referenceStartWeekDate: ").append(toIndentedString(referenceStartWeekDate)).append("\n");
    sb.append("    workPlanLookup: ").append(toIndentedString(workPlanLookup)).append("\n");
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

