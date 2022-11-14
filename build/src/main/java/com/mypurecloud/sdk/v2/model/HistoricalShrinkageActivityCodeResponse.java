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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.HistoricalShrinkageAggregateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalShrinkageActivityCodeResponse
 */

public class HistoricalShrinkageActivityCodeResponse  implements Serializable {
  
  private String activityCodeId = null;
  private HistoricalShrinkageAggregateResponse shrinkageForActivityCode = null;

  
  /**
   * The ID of the activity code for which shrinkage data is provided
   **/
  public HistoricalShrinkageActivityCodeResponse activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code for which shrinkage data is provided")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * Aggregated shrinkage data for the activity code
   **/
  public HistoricalShrinkageActivityCodeResponse shrinkageForActivityCode(HistoricalShrinkageAggregateResponse shrinkageForActivityCode) {
    this.shrinkageForActivityCode = shrinkageForActivityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage data for the activity code")
  @JsonProperty("shrinkageForActivityCode")
  public HistoricalShrinkageAggregateResponse getShrinkageForActivityCode() {
    return shrinkageForActivityCode;
  }
  public void setShrinkageForActivityCode(HistoricalShrinkageAggregateResponse shrinkageForActivityCode) {
    this.shrinkageForActivityCode = shrinkageForActivityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalShrinkageActivityCodeResponse historicalShrinkageActivityCodeResponse = (HistoricalShrinkageActivityCodeResponse) o;

    return Objects.equals(this.activityCodeId, historicalShrinkageActivityCodeResponse.activityCodeId) &&
            Objects.equals(this.shrinkageForActivityCode, historicalShrinkageActivityCodeResponse.shrinkageForActivityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, shrinkageForActivityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalShrinkageActivityCodeResponse {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    shrinkageForActivityCode: ").append(toIndentedString(shrinkageForActivityCode)).append("\n");
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

