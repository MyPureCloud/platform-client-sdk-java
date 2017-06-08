package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.IntradayQueue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A list of IntradayQueue objects
 */
@ApiModel(description = "A list of IntradayQueue objects")

public class WfmIntradayQueueListing  implements Serializable {
  
  private List<IntradayQueue> entities = new ArrayList<IntradayQueue>();

  /**
   * Gets or Sets noDataReason
   */
  public enum NoDataReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOWEEKDATA("NoWeekData"),
    NOPUBLISHEDSCHEDULE("NoPublishedSchedule"),
    NOSOURCEFORECAST("NoSourceForecast");

    private String value;

    NoDataReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NoDataReasonEnum fromString(String key) {
      if (key == null) return null;

      for (NoDataReasonEnum value : NoDataReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NoDataReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NoDataReasonEnum noDataReason = null;

  
  /**
   **/
  public WfmIntradayQueueListing entities(List<IntradayQueue> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<IntradayQueue> getEntities() {
    return entities;
  }
  public void setEntities(List<IntradayQueue> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public WfmIntradayQueueListing noDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noDataReason")
  public NoDataReasonEnum getNoDataReason() {
    return noDataReason;
  }
  public void setNoDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmIntradayQueueListing wfmIntradayQueueListing = (WfmIntradayQueueListing) o;
    return Objects.equals(this.entities, wfmIntradayQueueListing.entities) &&
        Objects.equals(this.noDataReason, wfmIntradayQueueListing.noDataReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, noDataReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayQueueListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    noDataReason: ").append(toIndentedString(noDataReason)).append("\n");
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

