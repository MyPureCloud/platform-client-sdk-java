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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * HistoricalImportDeleteFilesJobRequest
 */

public class HistoricalImportDeleteFilesJobRequest  implements Serializable {
  
  private List<String> requestIds = null;

  public HistoricalImportDeleteFilesJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requestIds = new ArrayList<String>();
    }
  }

  
  /**
   * List of requestIds to be deleted. Max number of RequestIds should be 100
   **/
  public HistoricalImportDeleteFilesJobRequest requestIds(List<String> requestIds) {
    this.requestIds = requestIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of requestIds to be deleted. Max number of RequestIds should be 100")
  @JsonProperty("requestIds")
  public List<String> getRequestIds() {
    return requestIds;
  }
  public void setRequestIds(List<String> requestIds) {
    this.requestIds = requestIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalImportDeleteFilesJobRequest historicalImportDeleteFilesJobRequest = (HistoricalImportDeleteFilesJobRequest) o;

    return Objects.equals(this.requestIds, historicalImportDeleteFilesJobRequest.requestIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalImportDeleteFilesJobRequest {\n");
    
    sb.append("    requestIds: ").append(toIndentedString(requestIds)).append("\n");
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

