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
import com.mypurecloud.sdk.v2.model.ListWrapperPlanningGroupMinimumsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MinimumStaffingRequest
 */

public class MinimumStaffingRequest  implements Serializable {
  
  private Boolean enabled = null;
  private Double minimumValue = null;
  private ListWrapperPlanningGroupMinimumsRequest planningGroupOverrides = null;

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

  public MinimumStaffingRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public MinimumStaffingRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether the setting is turned on or off
   **/
  public MinimumStaffingRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the setting is turned on or off")
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
  public MinimumStaffingRequest minimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default minimum staff value to be applied to all planning groups")
  @JsonProperty("minimumValue")
  public Double getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
  }


  /**
   * List of planning groups with their minimum staff value overrides and the days to which the overrides apply. Setting the enclosed list to empty will clear out all existing overrides
   **/
  public MinimumStaffingRequest planningGroupOverrides(ListWrapperPlanningGroupMinimumsRequest planningGroupOverrides) {
    this.planningGroupOverrides = planningGroupOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of planning groups with their minimum staff value overrides and the days to which the overrides apply. Setting the enclosed list to empty will clear out all existing overrides")
  @JsonProperty("planningGroupOverrides")
  public ListWrapperPlanningGroupMinimumsRequest getPlanningGroupOverrides() {
    return planningGroupOverrides;
  }
  public void setPlanningGroupOverrides(ListWrapperPlanningGroupMinimumsRequest planningGroupOverrides) {
    this.planningGroupOverrides = planningGroupOverrides;
  }


  /**
   * The intervals to which the minimum staff values will apply
   **/
  public MinimumStaffingRequest applicableIntervals(ApplicableIntervalsEnum applicableIntervals) {
    this.applicableIntervals = applicableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intervals to which the minimum staff values will apply")
  @JsonProperty("applicableIntervals")
  public ApplicableIntervalsEnum getApplicableIntervals() {
    return applicableIntervals;
  }
  public void setApplicableIntervals(ApplicableIntervalsEnum applicableIntervals) {
    this.applicableIntervals = applicableIntervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimumStaffingRequest minimumStaffingRequest = (MinimumStaffingRequest) o;

    return Objects.equals(this.enabled, minimumStaffingRequest.enabled) &&
            Objects.equals(this.minimumValue, minimumStaffingRequest.minimumValue) &&
            Objects.equals(this.planningGroupOverrides, minimumStaffingRequest.planningGroupOverrides) &&
            Objects.equals(this.applicableIntervals, minimumStaffingRequest.applicableIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minimumValue, planningGroupOverrides, applicableIntervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimumStaffingRequest {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    planningGroupOverrides: ").append(toIndentedString(planningGroupOverrides)).append("\n");
    sb.append("    applicableIntervals: ").append(toIndentedString(applicableIntervals)).append("\n");
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

