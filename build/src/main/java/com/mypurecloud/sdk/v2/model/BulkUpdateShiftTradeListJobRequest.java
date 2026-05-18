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
import com.mypurecloud.sdk.v2.model.BulkUpdateShiftTradeStateRequestItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkUpdateShiftTradeListJobRequest
 */

public class BulkUpdateShiftTradeListJobRequest  implements Serializable {
  
  private List<String> managementUnitIds = null;
  private List<LocalDate> weekDates = null;
  private List<BulkUpdateShiftTradeStateRequestItem> entities = null;

  public BulkUpdateShiftTradeListJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnitIds = new ArrayList<String>();
      weekDates = new ArrayList<LocalDate>();
      entities = new ArrayList<BulkUpdateShiftTradeStateRequestItem>();
    }
  }

  public BulkUpdateShiftTradeListJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      managementUnitIds = new ArrayList<String>();
      weekDates = new ArrayList<LocalDate>();
      entities = new ArrayList<BulkUpdateShiftTradeStateRequestItem>();
    }
  }

  
  /**
   * The IDs of the management units from which to update shift trades
   **/
  public BulkUpdateShiftTradeListJobRequest managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the management units from which to update shift trades")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * The start week dates in which the shift trades being updated occur in the business unit time zone (yyyy-MM-dd format)
   **/
  public BulkUpdateShiftTradeListJobRequest weekDates(List<LocalDate> weekDates) {
    this.weekDates = weekDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start week dates in which the shift trades being updated occur in the business unit time zone (yyyy-MM-dd format)")
  @JsonProperty("weekDates")
  public List<LocalDate> getWeekDates() {
    return weekDates;
  }
  public void setWeekDates(List<LocalDate> weekDates) {
    this.weekDates = weekDates;
  }


  /**
   * The shift trades that are being updated
   **/
  public BulkUpdateShiftTradeListJobRequest entities(List<BulkUpdateShiftTradeStateRequestItem> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift trades that are being updated")
  @JsonProperty("entities")
  public List<BulkUpdateShiftTradeStateRequestItem> getEntities() {
    return entities;
  }
  public void setEntities(List<BulkUpdateShiftTradeStateRequestItem> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateShiftTradeListJobRequest bulkUpdateShiftTradeListJobRequest = (BulkUpdateShiftTradeListJobRequest) o;

    return Objects.equals(this.managementUnitIds, bulkUpdateShiftTradeListJobRequest.managementUnitIds) &&
            Objects.equals(this.weekDates, bulkUpdateShiftTradeListJobRequest.weekDates) &&
            Objects.equals(this.entities, bulkUpdateShiftTradeListJobRequest.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitIds, weekDates, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateShiftTradeListJobRequest {\n");
    
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    weekDates: ").append(toIndentedString(weekDates)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

