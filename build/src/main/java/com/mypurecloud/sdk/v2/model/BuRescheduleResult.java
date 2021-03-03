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
import com.mypurecloud.sdk.v2.model.BuHeadcountForecast;
import com.mypurecloud.sdk.v2.model.BuRescheduleAgentScheduleResult;
import com.mypurecloud.sdk.v2.model.ScheduleGenerationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuRescheduleResult
 */

public class BuRescheduleResult  implements Serializable {
  
  private ScheduleGenerationResult generationResults = null;
  private String generationResultsDownloadUrl = null;
  private BuHeadcountForecast headcountForecast = null;
  private String headcountForecastDownloadUrl = null;
  private List<BuRescheduleAgentScheduleResult> agentSchedules = new ArrayList<BuRescheduleAgentScheduleResult>();

  
  /**
   * The generation results.  Note the result will always be delivered via the downloadUrl; however the schema is included for documentation
   **/
  public BuRescheduleResult generationResults(ScheduleGenerationResult generationResults) {
    this.generationResults = generationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generation results.  Note the result will always be delivered via the downloadUrl; however the schema is included for documentation")
  @JsonProperty("generationResults")
  public ScheduleGenerationResult getGenerationResults() {
    return generationResults;
  }
  public void setGenerationResults(ScheduleGenerationResult generationResults) {
    this.generationResults = generationResults;
  }

  
  /**
   * The download URL from which to fetch the generation results for the rescheduling run
   **/
  public BuRescheduleResult generationResultsDownloadUrl(String generationResultsDownloadUrl) {
    this.generationResultsDownloadUrl = generationResultsDownloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The download URL from which to fetch the generation results for the rescheduling run")
  @JsonProperty("generationResultsDownloadUrl")
  public String getGenerationResultsDownloadUrl() {
    return generationResultsDownloadUrl;
  }
  public void setGenerationResultsDownloadUrl(String generationResultsDownloadUrl) {
    this.generationResultsDownloadUrl = generationResultsDownloadUrl;
  }

  
  /**
   * The headcount forecast.  Note the result will always be delivered via the downloadUrl; however the schema is included for documentation
   **/
  public BuRescheduleResult headcountForecast(BuHeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The headcount forecast.  Note the result will always be delivered via the downloadUrl; however the schema is included for documentation")
  @JsonProperty("headcountForecast")
  public BuHeadcountForecast getHeadcountForecast() {
    return headcountForecast;
  }
  public void setHeadcountForecast(BuHeadcountForecast headcountForecast) {
    this.headcountForecast = headcountForecast;
  }

  
  /**
   * The download URL from which to fetch the headcount forecast for the rescheduling run
   **/
  public BuRescheduleResult headcountForecastDownloadUrl(String headcountForecastDownloadUrl) {
    this.headcountForecastDownloadUrl = headcountForecastDownloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The download URL from which to fetch the headcount forecast for the rescheduling run")
  @JsonProperty("headcountForecastDownloadUrl")
  public String getHeadcountForecastDownloadUrl() {
    return headcountForecastDownloadUrl;
  }
  public void setHeadcountForecastDownloadUrl(String headcountForecastDownloadUrl) {
    this.headcountForecastDownloadUrl = headcountForecastDownloadUrl;
  }

  
  /**
   * List of download links for agent schedules produced by the rescheduling run
   **/
  public BuRescheduleResult agentSchedules(List<BuRescheduleAgentScheduleResult> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of download links for agent schedules produced by the rescheduling run")
  @JsonProperty("agentSchedules")
  public List<BuRescheduleAgentScheduleResult> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuRescheduleAgentScheduleResult> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuRescheduleResult buRescheduleResult = (BuRescheduleResult) o;
    return Objects.equals(this.generationResults, buRescheduleResult.generationResults) &&
        Objects.equals(this.generationResultsDownloadUrl, buRescheduleResult.generationResultsDownloadUrl) &&
        Objects.equals(this.headcountForecast, buRescheduleResult.headcountForecast) &&
        Objects.equals(this.headcountForecastDownloadUrl, buRescheduleResult.headcountForecastDownloadUrl) &&
        Objects.equals(this.agentSchedules, buRescheduleResult.agentSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generationResults, generationResultsDownloadUrl, headcountForecast, headcountForecastDownloadUrl, agentSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuRescheduleResult {\n");
    
    sb.append("    generationResults: ").append(toIndentedString(generationResults)).append("\n");
    sb.append("    generationResultsDownloadUrl: ").append(toIndentedString(generationResultsDownloadUrl)).append("\n");
    sb.append("    headcountForecast: ").append(toIndentedString(headcountForecast)).append("\n");
    sb.append("    headcountForecastDownloadUrl: ").append(toIndentedString(headcountForecastDownloadUrl)).append("\n");
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
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

