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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuSchedulerSettingsResponse
 */

public class BuSchedulerSettingsResponse  implements Serializable {
  
  private Boolean consistentServiceLevelSmoothing = null;
  private WfmVersionedEntityMetadata metadata = null;

  public BuSchedulerSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuSchedulerSettingsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Indicates whether to provide consistent service level smoothing in schedule generation for this business unit
   **/
  public BuSchedulerSettingsResponse consistentServiceLevelSmoothing(Boolean consistentServiceLevelSmoothing) {
    this.consistentServiceLevelSmoothing = consistentServiceLevelSmoothing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether to provide consistent service level smoothing in schedule generation for this business unit")
  @JsonProperty("consistentServiceLevelSmoothing")
  public Boolean getConsistentServiceLevelSmoothing() {
    return consistentServiceLevelSmoothing;
  }
  public void setConsistentServiceLevelSmoothing(Boolean consistentServiceLevelSmoothing) {
    this.consistentServiceLevelSmoothing = consistentServiceLevelSmoothing;
  }


  /**
   * Version metadata for this business unit's scheduler settings
   **/
  public BuSchedulerSettingsResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this business unit's scheduler settings")
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
    BuSchedulerSettingsResponse buSchedulerSettingsResponse = (BuSchedulerSettingsResponse) o;

    return Objects.equals(this.consistentServiceLevelSmoothing, buSchedulerSettingsResponse.consistentServiceLevelSmoothing) &&
            Objects.equals(this.metadata, buSchedulerSettingsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistentServiceLevelSmoothing, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuSchedulerSettingsResponse {\n");
    
    sb.append("    consistentServiceLevelSmoothing: ").append(toIndentedString(consistentServiceLevelSmoothing)).append("\n");
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

