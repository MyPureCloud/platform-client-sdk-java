package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicLocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicBuScheduleReference
 */

public class WfmBuIntradayDataUpdateTopicBuScheduleReference  implements Serializable {
  
  private String id = null;
  private WfmBuIntradayDataUpdateTopicLocalDate weekDate = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuScheduleReference id(String id) {
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
  public WfmBuIntradayDataUpdateTopicBuScheduleReference weekDate(WfmBuIntradayDataUpdateTopicLocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public WfmBuIntradayDataUpdateTopicLocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(WfmBuIntradayDataUpdateTopicLocalDate weekDate) {
    this.weekDate = weekDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuIntradayDataUpdateTopicBuScheduleReference wfmBuIntradayDataUpdateTopicBuScheduleReference = (WfmBuIntradayDataUpdateTopicBuScheduleReference) o;
    return Objects.equals(this.id, wfmBuIntradayDataUpdateTopicBuScheduleReference.id) &&
        Objects.equals(this.weekDate, wfmBuIntradayDataUpdateTopicBuScheduleReference.weekDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuScheduleReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
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

