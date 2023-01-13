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
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceBulkQuery
 */

public class WfmHistoricalAdherenceBulkQuery  implements Serializable {
  
  private List<WfmHistoricalAdherenceBulkItem> items = new ArrayList<WfmHistoricalAdherenceBulkItem>();
  private String timeZone = null;

  
  /**
   * The historical adherence items to query
   **/
  public WfmHistoricalAdherenceBulkQuery items(List<WfmHistoricalAdherenceBulkItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The historical adherence items to query")
  @JsonProperty("items")
  public List<WfmHistoricalAdherenceBulkItem> getItems() {
    return items;
  }
  public void setItems(List<WfmHistoricalAdherenceBulkItem> items) {
    this.items = items;
  }


  /**
   * The time zone, in olson format, to use in defining days when computing adherence. The results will be returned as UTC timestamps regardless of the time zone input.
   **/
  public WfmHistoricalAdherenceBulkQuery timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time zone, in olson format, to use in defining days when computing adherence. The results will be returned as UTC timestamps regardless of the time zone input.")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceBulkQuery wfmHistoricalAdherenceBulkQuery = (WfmHistoricalAdherenceBulkQuery) o;

    return Objects.equals(this.items, wfmHistoricalAdherenceBulkQuery.items) &&
            Objects.equals(this.timeZone, wfmHistoricalAdherenceBulkQuery.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkQuery {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

