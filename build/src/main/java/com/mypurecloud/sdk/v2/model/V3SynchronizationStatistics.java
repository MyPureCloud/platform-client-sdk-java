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

import java.io.Serializable;
/**
 * V3SynchronizationStatistics
 */

public class V3SynchronizationStatistics  implements Serializable {
  
  private Integer synchronizedItemCount = null;
  private Integer failedItemCount = null;

  public V3SynchronizationStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SynchronizationStatistics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The total number of items added, updated or removed in the synchronization.
   **/
  public V3SynchronizationStatistics synchronizedItemCount(Integer synchronizedItemCount) {
    this.synchronizedItemCount = synchronizedItemCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of items added, updated or removed in the synchronization.")
  @JsonProperty("synchronizedItemCount")
  public Integer getSynchronizedItemCount() {
    return synchronizedItemCount;
  }
  public void setSynchronizedItemCount(Integer synchronizedItemCount) {
    this.synchronizedItemCount = synchronizedItemCount;
  }


  /**
   * The number of source items that failed to synchronize.
   **/
  public V3SynchronizationStatistics failedItemCount(Integer failedItemCount) {
    this.failedItemCount = failedItemCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of source items that failed to synchronize.")
  @JsonProperty("failedItemCount")
  public Integer getFailedItemCount() {
    return failedItemCount;
  }
  public void setFailedItemCount(Integer failedItemCount) {
    this.failedItemCount = failedItemCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationStatistics v3SynchronizationStatistics = (V3SynchronizationStatistics) o;

    return Objects.equals(this.synchronizedItemCount, v3SynchronizationStatistics.synchronizedItemCount) &&
            Objects.equals(this.failedItemCount, v3SynchronizationStatistics.failedItemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(synchronizedItemCount, failedItemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationStatistics {\n");
    
    sb.append("    synchronizedItemCount: ").append(toIndentedString(synchronizedItemCount)).append("\n");
    sb.append("    failedItemCount: ").append(toIndentedString(failedItemCount)).append("\n");
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

