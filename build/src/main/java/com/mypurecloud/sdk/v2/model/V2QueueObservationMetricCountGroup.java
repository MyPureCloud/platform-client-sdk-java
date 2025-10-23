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
import com.mypurecloud.sdk.v2.model.V2QueueObservationMetricCountData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2QueueObservationMetricCountGroup
 */

public class V2QueueObservationMetricCountGroup  implements Serializable {
  
  private String mediaType = null;
  private List<V2QueueObservationMetricCountData> data = null;

  public V2QueueObservationMetricCountGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      data = new ArrayList<V2QueueObservationMetricCountData>();
    }
  }

  
  /**
   * MediaType for this set of observations
   **/
  public V2QueueObservationMetricCountGroup mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "MediaType for this set of observations")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Observation metric data
   **/
  public V2QueueObservationMetricCountGroup data(List<V2QueueObservationMetricCountData> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Observation metric data")
  @JsonProperty("data")
  public List<V2QueueObservationMetricCountData> getData() {
    return data;
  }
  public void setData(List<V2QueueObservationMetricCountData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2QueueObservationMetricCountGroup v2QueueObservationMetricCountGroup = (V2QueueObservationMetricCountGroup) o;

    return Objects.equals(this.mediaType, v2QueueObservationMetricCountGroup.mediaType) &&
            Objects.equals(this.data, v2QueueObservationMetricCountGroup.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationMetricCountGroup {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

