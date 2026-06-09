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
 * ScheduleVisibilitySettingsRequest
 */

public class ScheduleVisibilitySettingsRequest  implements Serializable {
  
  private Boolean enabled = null;
  private Integer futureWeeks = null;

  public ScheduleVisibilitySettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleVisibilitySettingsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether schedule visibility controls are enabled for this management unit
   **/
  public ScheduleVisibilitySettingsRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether schedule visibility controls are enabled for this management unit")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The number of weeks into the future that agents can see schedules in this management unit. 0 means current week
   **/
  public ScheduleVisibilitySettingsRequest futureWeeks(Integer futureWeeks) {
    this.futureWeeks = futureWeeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks into the future that agents can see schedules in this management unit. 0 means current week")
  @JsonProperty("futureWeeks")
  public Integer getFutureWeeks() {
    return futureWeeks;
  }
  public void setFutureWeeks(Integer futureWeeks) {
    this.futureWeeks = futureWeeks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleVisibilitySettingsRequest scheduleVisibilitySettingsRequest = (ScheduleVisibilitySettingsRequest) o;

    return Objects.equals(this.enabled, scheduleVisibilitySettingsRequest.enabled) &&
            Objects.equals(this.futureWeeks, scheduleVisibilitySettingsRequest.futureWeeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, futureWeeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleVisibilitySettingsRequest {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    futureWeeks: ").append(toIndentedString(futureWeeks)).append("\n");
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

