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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BuConvertTimeOffLimitGranularityJobProgress
 */

public class BuConvertTimeOffLimitGranularityJobProgress  implements Serializable {
  
  private LocalDate dateEarliestComplete = null;
  private LocalDate dateLatestComplete = null;
  private Integer numberOfDaysComplete = null;
  private Integer percentageComplete = null;

  public BuConvertTimeOffLimitGranularityJobProgress() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuConvertTimeOffLimitGranularityJobProgress(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Earliest date completed for time-off limit granularity conversion. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuConvertTimeOffLimitGranularityJobProgress dateEarliestComplete(LocalDate dateEarliestComplete) {
    this.dateEarliestComplete = dateEarliestComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Earliest date completed for time-off limit granularity conversion. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEarliestComplete")
  public LocalDate getDateEarliestComplete() {
    return dateEarliestComplete;
  }
  public void setDateEarliestComplete(LocalDate dateEarliestComplete) {
    this.dateEarliestComplete = dateEarliestComplete;
  }


  /**
   * Latest date completed for time-off limit granularity conversion. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuConvertTimeOffLimitGranularityJobProgress dateLatestComplete(LocalDate dateLatestComplete) {
    this.dateLatestComplete = dateLatestComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest date completed for time-off limit granularity conversion. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateLatestComplete")
  public LocalDate getDateLatestComplete() {
    return dateLatestComplete;
  }
  public void setDateLatestComplete(LocalDate dateLatestComplete) {
    this.dateLatestComplete = dateLatestComplete;
  }


  /**
   * Number of days completed for time-off limit granularity conversion
   **/
  public BuConvertTimeOffLimitGranularityJobProgress numberOfDaysComplete(Integer numberOfDaysComplete) {
    this.numberOfDaysComplete = numberOfDaysComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of days completed for time-off limit granularity conversion")
  @JsonProperty("numberOfDaysComplete")
  public Integer getNumberOfDaysComplete() {
    return numberOfDaysComplete;
  }
  public void setNumberOfDaysComplete(Integer numberOfDaysComplete) {
    this.numberOfDaysComplete = numberOfDaysComplete;
  }


  /**
   * Percentage completed for time-off limit granularity conversion
   **/
  public BuConvertTimeOffLimitGranularityJobProgress percentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage completed for time-off limit granularity conversion")
  @JsonProperty("percentageComplete")
  public Integer getPercentageComplete() {
    return percentageComplete;
  }
  public void setPercentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuConvertTimeOffLimitGranularityJobProgress buConvertTimeOffLimitGranularityJobProgress = (BuConvertTimeOffLimitGranularityJobProgress) o;

    return Objects.equals(this.dateEarliestComplete, buConvertTimeOffLimitGranularityJobProgress.dateEarliestComplete) &&
            Objects.equals(this.dateLatestComplete, buConvertTimeOffLimitGranularityJobProgress.dateLatestComplete) &&
            Objects.equals(this.numberOfDaysComplete, buConvertTimeOffLimitGranularityJobProgress.numberOfDaysComplete) &&
            Objects.equals(this.percentageComplete, buConvertTimeOffLimitGranularityJobProgress.percentageComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateEarliestComplete, dateLatestComplete, numberOfDaysComplete, percentageComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuConvertTimeOffLimitGranularityJobProgress {\n");
    
    sb.append("    dateEarliestComplete: ").append(toIndentedString(dateEarliestComplete)).append("\n");
    sb.append("    dateLatestComplete: ").append(toIndentedString(dateLatestComplete)).append("\n");
    sb.append("    numberOfDaysComplete: ").append(toIndentedString(numberOfDaysComplete)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
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

