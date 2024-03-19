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
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitRange;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuSetTimeOffLimitValuesRequest
 */

public class BuSetTimeOffLimitValuesRequest  implements Serializable {
  
  private List<BuTimeOffLimitRange> values = new ArrayList<BuTimeOffLimitRange>();
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   **/
  public BuSetTimeOffLimitValuesRequest values(List<BuTimeOffLimitRange> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<BuTimeOffLimitRange> getValues() {
    return values;
  }
  public void setValues(List<BuTimeOffLimitRange> values) {
    this.values = values;
  }


  /**
   * Version metadata for the time-off limit
   **/
  public BuSetTimeOffLimitValuesRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the time-off limit")
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
    BuSetTimeOffLimitValuesRequest buSetTimeOffLimitValuesRequest = (BuSetTimeOffLimitValuesRequest) o;

    return Objects.equals(this.values, buSetTimeOffLimitValuesRequest.values) &&
            Objects.equals(this.metadata, buSetTimeOffLimitValuesRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuSetTimeOffLimitValuesRequest {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

