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
import com.mypurecloud.sdk.v2.model.ReceivingScheduleLookup;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * MatchShiftTradeJobRequest
 */

public class MatchShiftTradeJobRequest  implements Serializable {
  
  private LocalDate weekDate = null;
  private ReceivingScheduleLookup receivingSchedule = null;
  private String receivingShiftId = null;
  private WfmVersionedEntityMetadata metadata = null;

  public MatchShiftTradeJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public MatchShiftTradeJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The start week date of the initiating shift in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public MatchShiftTradeJobRequest weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start week date of the initiating shift in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * Associated schedule information for the receiving user
   **/
  public MatchShiftTradeJobRequest receivingSchedule(ReceivingScheduleLookup receivingSchedule) {
    this.receivingSchedule = receivingSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Associated schedule information for the receiving user")
  @JsonProperty("receivingSchedule")
  public ReceivingScheduleLookup getReceivingSchedule() {
    return receivingSchedule;
  }
  public void setReceivingSchedule(ReceivingScheduleLookup receivingSchedule) {
    this.receivingSchedule = receivingSchedule;
  }


  /**
   * The ID of the shift the receiving user is giving up in trade, if applicable
   **/
  public MatchShiftTradeJobRequest receivingShiftId(String receivingShiftId) {
    this.receivingShiftId = receivingShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the shift the receiving user is giving up in trade, if applicable")
  @JsonProperty("receivingShiftId")
  public String getReceivingShiftId() {
    return receivingShiftId;
  }
  public void setReceivingShiftId(String receivingShiftId) {
    this.receivingShiftId = receivingShiftId;
  }


  /**
   * Version metadata for the shift trade
   **/
  public MatchShiftTradeJobRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the shift trade")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchShiftTradeJobRequest matchShiftTradeJobRequest = (MatchShiftTradeJobRequest) o;

    return Objects.equals(this.weekDate, matchShiftTradeJobRequest.weekDate) &&
            Objects.equals(this.receivingSchedule, matchShiftTradeJobRequest.receivingSchedule) &&
            Objects.equals(this.receivingShiftId, matchShiftTradeJobRequest.receivingShiftId) &&
            Objects.equals(this.metadata, matchShiftTradeJobRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, receivingSchedule, receivingShiftId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchShiftTradeJobRequest {\n");
    
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    receivingSchedule: ").append(toIndentedString(receivingSchedule)).append("\n");
    sb.append("    receivingShiftId: ").append(toIndentedString(receivingShiftId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

