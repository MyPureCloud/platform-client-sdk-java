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

import java.io.Serializable;
/**
 * WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference
 */

public class WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference  implements Serializable {
  
  private String id = null;
  private String weekDate = null;
  private String description = null;

  public WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference id(String id) {
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
  public WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }


  /**
   **/
  public WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference wfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference = (WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference) o;

    return Objects.equals(this.id, wfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference.id) &&
            Objects.equals(this.weekDate, wfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference.weekDate) &&
            Objects.equals(this.description, wfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastStaffingRequirementsGenerateCompleteTopicBuShortTermForecastReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

