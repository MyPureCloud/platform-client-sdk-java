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
import com.mypurecloud.sdk.v2.model.ForecastMetadata;
import com.mypurecloud.sdk.v2.model.PlanningGroupRequirementOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * LongTermRequirements
 */

public class LongTermRequirements  implements Serializable {
  
  private ForecastMetadata forecastMetadata = null;
  private Date dateGenerationStarted = null;
  private List<PlanningGroupRequirementOutput> requirementResults = null;

  public LongTermRequirements() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requirementResults = new ArrayList<PlanningGroupRequirementOutput>();
    }
  }

  
  /**
   * Forecast metadata
   **/
  public LongTermRequirements forecastMetadata(ForecastMetadata forecastMetadata) {
    this.forecastMetadata = forecastMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast metadata")
  @JsonProperty("forecastMetadata")
  public ForecastMetadata getForecastMetadata() {
    return forecastMetadata;
  }
  public void setForecastMetadata(ForecastMetadata forecastMetadata) {
    this.forecastMetadata = forecastMetadata;
  }


  /**
   * Date the generation of the requirements started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LongTermRequirements dateGenerationStarted(Date dateGenerationStarted) {
    this.dateGenerationStarted = dateGenerationStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date the generation of the requirements started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateGenerationStarted")
  public Date getDateGenerationStarted() {
    return dateGenerationStarted;
  }
  public void setDateGenerationStarted(Date dateGenerationStarted) {
    this.dateGenerationStarted = dateGenerationStarted;
  }


  /**
   * List of planning group outputs
   **/
  public LongTermRequirements requirementResults(List<PlanningGroupRequirementOutput> requirementResults) {
    this.requirementResults = requirementResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of planning group outputs")
  @JsonProperty("requirementResults")
  public List<PlanningGroupRequirementOutput> getRequirementResults() {
    return requirementResults;
  }
  public void setRequirementResults(List<PlanningGroupRequirementOutput> requirementResults) {
    this.requirementResults = requirementResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTermRequirements longTermRequirements = (LongTermRequirements) o;

    return Objects.equals(this.forecastMetadata, longTermRequirements.forecastMetadata) &&
            Objects.equals(this.dateGenerationStarted, longTermRequirements.dateGenerationStarted) &&
            Objects.equals(this.requirementResults, longTermRequirements.requirementResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forecastMetadata, dateGenerationStarted, requirementResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermRequirements {\n");
    
    sb.append("    forecastMetadata: ").append(toIndentedString(forecastMetadata)).append("\n");
    sb.append("    dateGenerationStarted: ").append(toIndentedString(dateGenerationStarted)).append("\n");
    sb.append("    requirementResults: ").append(toIndentedString(requirementResults)).append("\n");
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

