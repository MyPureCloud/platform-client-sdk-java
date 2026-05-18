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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.PlanningGroupMinimumsResponse;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MinimumStaffingResponse
 */

public class MinimumStaffingResponse  implements Serializable {
  
  private Boolean enabled = null;
  private Double minimumValue = null;
  private List<PlanningGroupMinimumsResponse> planningGroupOverrides = null;

  private static class ApplicableIntervalsEnumDeserializer extends StdDeserializer<ApplicableIntervalsEnum> {
    public ApplicableIntervalsEnumDeserializer() {
      super(ApplicableIntervalsEnumDeserializer.class);
    }

    @Override
    public ApplicableIntervalsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ApplicableIntervalsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The intervals to which the minimum staff values will apply
   */
 @JsonDeserialize(using = ApplicableIntervalsEnumDeserializer.class)
  public enum ApplicableIntervalsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLINTERVALS("AllIntervals"),
    VOLUMEONLYINTERVALS("VolumeOnlyIntervals");

    private String value;

    ApplicableIntervalsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ApplicableIntervalsEnum fromString(String key) {
      if (key == null) return null;

      for (ApplicableIntervalsEnum value : ApplicableIntervalsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ApplicableIntervalsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ApplicableIntervalsEnum applicableIntervals = null;
  private WfmVersionedEntityMetadata metadata = null;

  public MinimumStaffingResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroupOverrides = new ArrayList<PlanningGroupMinimumsResponse>();
    }
  }

  public MinimumStaffingResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      planningGroupOverrides = new ArrayList<PlanningGroupMinimumsResponse>();
    }
  }

  
  /**
   * Whether the setting is turned on or off
   **/
  public MinimumStaffingResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the setting is turned on or off")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Default minimum staff value to be applied to all planning groups
   **/
  public MinimumStaffingResponse minimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default minimum staff value to be applied to all planning groups")
  @JsonProperty("minimumValue")
  public Double getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
  }


  /**
   * List of planning groups with their minimum staff value overrides and the days to which the overrides apply
   **/
  public MinimumStaffingResponse planningGroupOverrides(List<PlanningGroupMinimumsResponse> planningGroupOverrides) {
    this.planningGroupOverrides = planningGroupOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of planning groups with their minimum staff value overrides and the days to which the overrides apply")
  @JsonProperty("planningGroupOverrides")
  public List<PlanningGroupMinimumsResponse> getPlanningGroupOverrides() {
    return planningGroupOverrides;
  }
  public void setPlanningGroupOverrides(List<PlanningGroupMinimumsResponse> planningGroupOverrides) {
    this.planningGroupOverrides = planningGroupOverrides;
  }


  /**
   * The intervals to which the minimum staff values will apply
   **/
  public MinimumStaffingResponse applicableIntervals(ApplicableIntervalsEnum applicableIntervals) {
    this.applicableIntervals = applicableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intervals to which the minimum staff values will apply")
  @JsonProperty("applicableIntervals")
  public ApplicableIntervalsEnum getApplicableIntervals() {
    return applicableIntervals;
  }
  public void setApplicableIntervals(ApplicableIntervalsEnum applicableIntervals) {
    this.applicableIntervals = applicableIntervals;
  }


  /**
   * Metadata for the business unit's minimum staffing settings
   **/
  public MinimumStaffingResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata for the business unit's minimum staffing settings")
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
    MinimumStaffingResponse minimumStaffingResponse = (MinimumStaffingResponse) o;

    return Objects.equals(this.enabled, minimumStaffingResponse.enabled) &&
            Objects.equals(this.minimumValue, minimumStaffingResponse.minimumValue) &&
            Objects.equals(this.planningGroupOverrides, minimumStaffingResponse.planningGroupOverrides) &&
            Objects.equals(this.applicableIntervals, minimumStaffingResponse.applicableIntervals) &&
            Objects.equals(this.metadata, minimumStaffingResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minimumValue, planningGroupOverrides, applicableIntervals, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimumStaffingResponse {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    planningGroupOverrides: ").append(toIndentedString(planningGroupOverrides)).append("\n");
    sb.append("    applicableIntervals: ").append(toIndentedString(applicableIntervals)).append("\n");
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

