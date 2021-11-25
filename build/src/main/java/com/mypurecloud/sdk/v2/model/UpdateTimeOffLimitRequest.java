package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Contains time off limit object property values to be updated.
 */
@ApiModel(description = "Contains time off limit object property values to be updated.")

public class UpdateTimeOffLimitRequest  implements Serializable {
  
  private Integer defaultLimitMinutes = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The default time off limit value in minutes per granularity
   **/
  public UpdateTimeOffLimitRequest defaultLimitMinutes(Integer defaultLimitMinutes) {
    this.defaultLimitMinutes = defaultLimitMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default time off limit value in minutes per granularity")
  @JsonProperty("defaultLimitMinutes")
  public Integer getDefaultLimitMinutes() {
    return defaultLimitMinutes;
  }
  public void setDefaultLimitMinutes(Integer defaultLimitMinutes) {
    this.defaultLimitMinutes = defaultLimitMinutes;
  }

  
  /**
   * Version metadata for the time off limit
   **/
  public UpdateTimeOffLimitRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the time off limit")
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
    UpdateTimeOffLimitRequest updateTimeOffLimitRequest = (UpdateTimeOffLimitRequest) o;
    return Objects.equals(this.defaultLimitMinutes, updateTimeOffLimitRequest.defaultLimitMinutes) &&
        Objects.equals(this.metadata, updateTimeOffLimitRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLimitMinutes, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeOffLimitRequest {\n");
    
    sb.append("    defaultLimitMinutes: ").append(toIndentedString(defaultLimitMinutes)).append("\n");
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

