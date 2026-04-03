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
import com.mypurecloud.sdk.v2.model.ListWrapperRequiredDateRange;
import com.mypurecloud.sdk.v2.model.ValueWrapperDate;
import com.mypurecloud.sdk.v2.model.ValueWrapperShiftTradeTargetRequestItem;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * UpdateShiftTradeJobRequest
 */

public class UpdateShiftTradeJobRequest  implements Serializable {
  
  private LocalDate weekDate = null;
  private ValueWrapperShiftTradeTargetRequestItem target = null;
  private ValueWrapperDate expirationDate = null;
  private ListWrapperRequiredDateRange acceptableIntervals = null;
  private WfmVersionedEntityMetadata metadata = null;

  public UpdateShiftTradeJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The start week date of this shift in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UpdateShiftTradeJobRequest weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start week date of this shift in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * Target of the shift trade, if applicable
   **/
  public UpdateShiftTradeJobRequest target(ValueWrapperShiftTradeTargetRequestItem target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Target of the shift trade, if applicable")
  @JsonProperty("target")
  public ValueWrapperShiftTradeTargetRequestItem getTarget() {
    return target;
  }
  public void setTarget(ValueWrapperShiftTradeTargetRequestItem target) {
    this.target = target;
  }


  /**
   * When this shift trade will expire. Date time is represented as an ISO-8601 string
   **/
  public UpdateShiftTradeJobRequest expirationDate(ValueWrapperDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When this shift trade will expire. Date time is represented as an ISO-8601 string")
  @JsonProperty("expirationDate")
  public ValueWrapperDate getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(ValueWrapperDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * Time frames when the initiating user is willing to accept a shift in exchange. Setting the enclosed list to empty will make this a one sided trade request.
   **/
  public UpdateShiftTradeJobRequest acceptableIntervals(ListWrapperRequiredDateRange acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time frames when the initiating user is willing to accept a shift in exchange. Setting the enclosed list to empty will make this a one sided trade request.")
  @JsonProperty("acceptableIntervals")
  public ListWrapperRequiredDateRange getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(ListWrapperRequiredDateRange acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  /**
   * Version metadata for the shift trade
   **/
  public UpdateShiftTradeJobRequest metadata(WfmVersionedEntityMetadata metadata) {
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
    UpdateShiftTradeJobRequest updateShiftTradeJobRequest = (UpdateShiftTradeJobRequest) o;

    return Objects.equals(this.weekDate, updateShiftTradeJobRequest.weekDate) &&
            Objects.equals(this.target, updateShiftTradeJobRequest.target) &&
            Objects.equals(this.expirationDate, updateShiftTradeJobRequest.expirationDate) &&
            Objects.equals(this.acceptableIntervals, updateShiftTradeJobRequest.acceptableIntervals) &&
            Objects.equals(this.metadata, updateShiftTradeJobRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, target, expirationDate, acceptableIntervals, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShiftTradeJobRequest {\n");
    
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
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

