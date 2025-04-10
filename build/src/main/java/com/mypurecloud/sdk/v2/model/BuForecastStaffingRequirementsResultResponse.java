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
import com.mypurecloud.sdk.v2.model.BuForecastStaffingRequirementsResult;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastStaffingRequirementsResultResponse
 */

public class BuForecastStaffingRequirementsResultResponse  implements Serializable {
  
  private String businessUnitId = null;
  private BuShortTermForecastReference forecast = null;
  private Date referenceStartDate = null;
  private Integer weekCount = null;
  private Integer intervalLengthMinutes = null;

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
   * The state of the staffing requirements generation
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
  private List<BuForecastStaffingRequirementsResult> results = null;

  public BuForecastStaffingRequirementsResultResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<BuForecastStaffingRequirementsResult>();
    }
  }

  
  /**
   * The ID of the business unit to which the forecast staffing requirements belongs
   **/
  public BuForecastStaffingRequirementsResultResponse businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the business unit to which the forecast staffing requirements belongs")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   * The forecast reference
   **/
  public BuForecastStaffingRequirementsResultResponse forecast(BuShortTermForecastReference forecast) {
    this.forecast = forecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The forecast reference")
  @JsonProperty("forecast")
  public BuShortTermForecastReference getForecast() {
    return forecast;
  }
  public void setForecast(BuShortTermForecastReference forecast) {
    this.forecast = forecast;
  }


  /**
   * The reference start date for interval-based data for this forecast as an ISO-8601 string
   **/
  public BuForecastStaffingRequirementsResultResponse referenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference start date for interval-based data for this forecast as an ISO-8601 string")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }


  /**
   * The number of weeks in this forecast
   **/
  public BuForecastStaffingRequirementsResultResponse weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks in this forecast")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }


  /**
   * The period/interval in minutes for which to aggregate the data
   **/
  public BuForecastStaffingRequirementsResultResponse intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The period/interval in minutes for which to aggregate the data")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }


  /**
   * The state of the staffing requirements generation
   **/
  public BuForecastStaffingRequirementsResultResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the staffing requirements generation")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The forecast staffing requirement results, Will be populated when state == 'Complete'
   **/
  public BuForecastStaffingRequirementsResultResponse results(List<BuForecastStaffingRequirementsResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecast staffing requirement results, Will be populated when state == 'Complete'")
  @JsonProperty("results")
  public List<BuForecastStaffingRequirementsResult> getResults() {
    return results;
  }
  public void setResults(List<BuForecastStaffingRequirementsResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuForecastStaffingRequirementsResultResponse buForecastStaffingRequirementsResultResponse = (BuForecastStaffingRequirementsResultResponse) o;

    return Objects.equals(this.businessUnitId, buForecastStaffingRequirementsResultResponse.businessUnitId) &&
            Objects.equals(this.forecast, buForecastStaffingRequirementsResultResponse.forecast) &&
            Objects.equals(this.referenceStartDate, buForecastStaffingRequirementsResultResponse.referenceStartDate) &&
            Objects.equals(this.weekCount, buForecastStaffingRequirementsResultResponse.weekCount) &&
            Objects.equals(this.intervalLengthMinutes, buForecastStaffingRequirementsResultResponse.intervalLengthMinutes) &&
            Objects.equals(this.state, buForecastStaffingRequirementsResultResponse.state) &&
            Objects.equals(this.results, buForecastStaffingRequirementsResultResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitId, forecast, referenceStartDate, weekCount, intervalLengthMinutes, state, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastStaffingRequirementsResultResponse {\n");
    
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

