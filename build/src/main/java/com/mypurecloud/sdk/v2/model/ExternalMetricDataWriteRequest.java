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
import com.mypurecloud.sdk.v2.model.ExternalMetricDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalMetricDataWriteRequest
 */

public class ExternalMetricDataWriteRequest  implements Serializable {
  
  private List<ExternalMetricDataItem> items = null;

  public ExternalMetricDataWriteRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      items = new ArrayList<ExternalMetricDataItem>();
    }
  }

  
  /**
   * A list of external metric data items. A maximum of 100 items are allowed.
   **/
  public ExternalMetricDataWriteRequest items(List<ExternalMetricDataItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of external metric data items. A maximum of 100 items are allowed.")
  @JsonProperty("items")
  public List<ExternalMetricDataItem> getItems() {
    return items;
  }
  public void setItems(List<ExternalMetricDataItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalMetricDataWriteRequest externalMetricDataWriteRequest = (ExternalMetricDataWriteRequest) o;

    return Objects.equals(this.items, externalMetricDataWriteRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalMetricDataWriteRequest {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

