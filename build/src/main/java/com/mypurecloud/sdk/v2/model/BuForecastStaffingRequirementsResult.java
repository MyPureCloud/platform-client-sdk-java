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
import com.mypurecloud.sdk.v2.model.StaffingRequirementsPlanningGroupData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastStaffingRequirementsResult
 */

public class BuForecastStaffingRequirementsResult  implements Serializable {
  
  private Integer weekNumber = null;
  private String downloadUrl = null;
  private Date downloadUrlExpirationDate = null;
  private List<StaffingRequirementsPlanningGroupData> planningGroupStaffingRequirements = null;

  public BuForecastStaffingRequirementsResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroupStaffingRequirements = new ArrayList<StaffingRequirementsPlanningGroupData>();
    }
  }

  
  /**
   * The week number represented by this response
   **/
  public BuForecastStaffingRequirementsResult weekNumber(Integer weekNumber) {
    this.weekNumber = weekNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The week number represented by this response")
  @JsonProperty("weekNumber")
  public Integer getWeekNumber() {
    return weekNumber;
  }
  public void setWeekNumber(Integer weekNumber) {
    this.weekNumber = weekNumber;
  }


  /**
   * The url to get the requirements results for this week
   **/
  public BuForecastStaffingRequirementsResult downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The url to get the requirements results for this week")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * The expiration date of the download url, as an ISO-8601 string
   **/
  public BuForecastStaffingRequirementsResult downloadUrlExpirationDate(Date downloadUrlExpirationDate) {
    this.downloadUrlExpirationDate = downloadUrlExpirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The expiration date of the download url, as an ISO-8601 string")
  @JsonProperty("downloadUrlExpirationDate")
  public Date getDownloadUrlExpirationDate() {
    return downloadUrlExpirationDate;
  }
  public void setDownloadUrlExpirationDate(Date downloadUrlExpirationDate) {
    this.downloadUrlExpirationDate = downloadUrlExpirationDate;
  }


  /**
   * Results will always come via downloadUrl, however the schema is included for documentation
   **/
  public BuForecastStaffingRequirementsResult planningGroupStaffingRequirements(List<StaffingRequirementsPlanningGroupData> planningGroupStaffingRequirements) {
    this.planningGroupStaffingRequirements = planningGroupStaffingRequirements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Results will always come via downloadUrl, however the schema is included for documentation")
  @JsonProperty("planningGroupStaffingRequirements")
  public List<StaffingRequirementsPlanningGroupData> getPlanningGroupStaffingRequirements() {
    return planningGroupStaffingRequirements;
  }
  public void setPlanningGroupStaffingRequirements(List<StaffingRequirementsPlanningGroupData> planningGroupStaffingRequirements) {
    this.planningGroupStaffingRequirements = planningGroupStaffingRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuForecastStaffingRequirementsResult buForecastStaffingRequirementsResult = (BuForecastStaffingRequirementsResult) o;

    return Objects.equals(this.weekNumber, buForecastStaffingRequirementsResult.weekNumber) &&
            Objects.equals(this.downloadUrl, buForecastStaffingRequirementsResult.downloadUrl) &&
            Objects.equals(this.downloadUrlExpirationDate, buForecastStaffingRequirementsResult.downloadUrlExpirationDate) &&
            Objects.equals(this.planningGroupStaffingRequirements, buForecastStaffingRequirementsResult.planningGroupStaffingRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekNumber, downloadUrl, downloadUrlExpirationDate, planningGroupStaffingRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastStaffingRequirementsResult {\n");
    
    sb.append("    weekNumber: ").append(toIndentedString(weekNumber)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadUrlExpirationDate: ").append(toIndentedString(downloadUrlExpirationDate)).append("\n");
    sb.append("    planningGroupStaffingRequirements: ").append(toIndentedString(planningGroupStaffingRequirements)).append("\n");
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

