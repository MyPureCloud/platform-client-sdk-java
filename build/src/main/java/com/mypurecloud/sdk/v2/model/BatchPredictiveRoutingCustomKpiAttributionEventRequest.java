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
import com.mypurecloud.sdk.v2.model.PredictiveRoutingCustomKpiAttributionEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A maximum of 100 events are allowed per request
 */
@ApiModel(description = "A maximum of 100 events are allowed per request")

public class BatchPredictiveRoutingCustomKpiAttributionEventRequest  implements Serializable {
  
  private List<PredictiveRoutingCustomKpiAttributionEvent> customKpiAttributionEvents = null;

  public BatchPredictiveRoutingCustomKpiAttributionEventRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      customKpiAttributionEvents = new ArrayList<PredictiveRoutingCustomKpiAttributionEvent>();
    }
  }

  public BatchPredictiveRoutingCustomKpiAttributionEventRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      customKpiAttributionEvents = new ArrayList<PredictiveRoutingCustomKpiAttributionEvent>();
    }
  }

  
  /**
   * PredictiveRoutingCustomKpiAttributionEvent events for this batch
   **/
  public BatchPredictiveRoutingCustomKpiAttributionEventRequest customKpiAttributionEvents(List<PredictiveRoutingCustomKpiAttributionEvent> customKpiAttributionEvents) {
    this.customKpiAttributionEvents = customKpiAttributionEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "PredictiveRoutingCustomKpiAttributionEvent events for this batch")
  @JsonProperty("customKpiAttributionEvents")
  public List<PredictiveRoutingCustomKpiAttributionEvent> getCustomKpiAttributionEvents() {
    return customKpiAttributionEvents;
  }
  public void setCustomKpiAttributionEvents(List<PredictiveRoutingCustomKpiAttributionEvent> customKpiAttributionEvents) {
    this.customKpiAttributionEvents = customKpiAttributionEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchPredictiveRoutingCustomKpiAttributionEventRequest batchPredictiveRoutingCustomKpiAttributionEventRequest = (BatchPredictiveRoutingCustomKpiAttributionEventRequest) o;

    return Objects.equals(this.customKpiAttributionEvents, batchPredictiveRoutingCustomKpiAttributionEventRequest.customKpiAttributionEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customKpiAttributionEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchPredictiveRoutingCustomKpiAttributionEventRequest {\n");
    
    sb.append("    customKpiAttributionEvents: ").append(toIndentedString(customKpiAttributionEvents)).append("\n");
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

