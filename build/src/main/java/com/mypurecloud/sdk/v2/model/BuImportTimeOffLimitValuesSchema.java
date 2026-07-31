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
import com.mypurecloud.sdk.v2.model.BuImportTimeOffLimitValue;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuImportTimeOffLimitValuesSchema
 */

public class BuImportTimeOffLimitValuesSchema  implements Serializable {
  
  private List<BuImportTimeOffLimitValue> limitValues = null;
  private WfmVersionedEntityMetadata metadata = null;

  public BuImportTimeOffLimitValuesSchema() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      limitValues = new ArrayList<BuImportTimeOffLimitValue>();
    }
  }

  public BuImportTimeOffLimitValuesSchema(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      limitValues = new ArrayList<BuImportTimeOffLimitValue>();
    }
  }

  
  /**
   * Time-off limit values to import. The list is collection of date and time interval for which allocated limit in minutes is imported.For a time-off limit with daily granularity, the only time interval that should be set for a given date is '00:00'For a time-off limit with fifteen minutes granularity, minimum of one time interval must be specified
   **/
  public BuImportTimeOffLimitValuesSchema limitValues(List<BuImportTimeOffLimitValue> limitValues) {
    this.limitValues = limitValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time-off limit values to import. The list is collection of date and time interval for which allocated limit in minutes is imported.For a time-off limit with daily granularity, the only time interval that should be set for a given date is '00:00'For a time-off limit with fifteen minutes granularity, minimum of one time interval must be specified")
  @JsonProperty("limitValues")
  public List<BuImportTimeOffLimitValue> getLimitValues() {
    return limitValues;
  }
  public void setLimitValues(List<BuImportTimeOffLimitValue> limitValues) {
    this.limitValues = limitValues;
  }


  /**
   * Version metadata for the time-off limit
   **/
  public BuImportTimeOffLimitValuesSchema metadata(WfmVersionedEntityMetadata metadata) {
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
    BuImportTimeOffLimitValuesSchema buImportTimeOffLimitValuesSchema = (BuImportTimeOffLimitValuesSchema) o;

    return Objects.equals(this.limitValues, buImportTimeOffLimitValuesSchema.limitValues) &&
            Objects.equals(this.metadata, buImportTimeOffLimitValuesSchema.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitValues, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuImportTimeOffLimitValuesSchema {\n");
    
    sb.append("    limitValues: ").append(toIndentedString(limitValues)).append("\n");
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

