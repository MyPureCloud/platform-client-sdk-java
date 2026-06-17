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
import com.mypurecloud.sdk.v2.model.ScheduleBidGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleBidGroupSummaryList
 */

public class ScheduleBidGroupSummaryList  implements Serializable {
  
  private List<ScheduleBidGroupSummary> scheduleBidGroupSummaries = null;

  public ScheduleBidGroupSummaryList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      scheduleBidGroupSummaries = new ArrayList<ScheduleBidGroupSummary>();
    }
  }

  public ScheduleBidGroupSummaryList(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      scheduleBidGroupSummaries = new ArrayList<ScheduleBidGroupSummary>();
    }
  }

  
  /**
   * Schedule bid group summary
   **/
  public ScheduleBidGroupSummaryList scheduleBidGroupSummaries(List<ScheduleBidGroupSummary> scheduleBidGroupSummaries) {
    this.scheduleBidGroupSummaries = scheduleBidGroupSummaries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Schedule bid group summary")
  @JsonProperty("scheduleBidGroupSummaries")
  public List<ScheduleBidGroupSummary> getScheduleBidGroupSummaries() {
    return scheduleBidGroupSummaries;
  }
  public void setScheduleBidGroupSummaries(List<ScheduleBidGroupSummary> scheduleBidGroupSummaries) {
    this.scheduleBidGroupSummaries = scheduleBidGroupSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBidGroupSummaryList scheduleBidGroupSummaryList = (ScheduleBidGroupSummaryList) o;

    return Objects.equals(this.scheduleBidGroupSummaries, scheduleBidGroupSummaryList.scheduleBidGroupSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleBidGroupSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidGroupSummaryList {\n");
    
    sb.append("    scheduleBidGroupSummaries: ").append(toIndentedString(scheduleBidGroupSummaries)).append("\n");
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

