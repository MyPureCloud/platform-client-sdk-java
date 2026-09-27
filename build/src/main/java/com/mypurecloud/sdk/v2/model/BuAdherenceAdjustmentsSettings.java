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
 * BuAdherenceAdjustmentsSettings
 */

public class BuAdherenceAdjustmentsSettings  implements Serializable {
  
  private Integer submissionRangeConstraintDays = null;
  private WfmVersionedEntityMetadata metadata = null;

  public BuAdherenceAdjustmentsSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuAdherenceAdjustmentsSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The maximum number of days in the past that an adherence adjustment can be submitted
   **/
  public BuAdherenceAdjustmentsSettings submissionRangeConstraintDays(Integer submissionRangeConstraintDays) {
    this.submissionRangeConstraintDays = submissionRangeConstraintDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of days in the past that an adherence adjustment can be submitted")
  @JsonProperty("submissionRangeConstraintDays")
  public Integer getSubmissionRangeConstraintDays() {
    return submissionRangeConstraintDays;
  }
  public void setSubmissionRangeConstraintDays(Integer submissionRangeConstraintDays) {
    this.submissionRangeConstraintDays = submissionRangeConstraintDays;
  }


  /**
   * Version info metadata for these adherence adjustments settings
   **/
  public BuAdherenceAdjustmentsSettings metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version info metadata for these adherence adjustments settings")
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
    BuAdherenceAdjustmentsSettings buAdherenceAdjustmentsSettings = (BuAdherenceAdjustmentsSettings) o;

    return Objects.equals(this.submissionRangeConstraintDays, buAdherenceAdjustmentsSettings.submissionRangeConstraintDays) &&
            Objects.equals(this.metadata, buAdherenceAdjustmentsSettings.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionRangeConstraintDays, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAdherenceAdjustmentsSettings {\n");
    
    sb.append("    submissionRangeConstraintDays: ").append(toIndentedString(submissionRangeConstraintDays)).append("\n");
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

