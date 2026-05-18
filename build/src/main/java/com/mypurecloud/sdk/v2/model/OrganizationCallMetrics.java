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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OrganizationCallMetrics
 */

public class OrganizationCallMetrics  implements Serializable {
  
  private Double usage = null;
  private Double autoScalingTriggerPercentage = null;

  private static class CpuIntensityEnumDeserializer extends StdDeserializer<CpuIntensityEnum> {
    public CpuIntensityEnumDeserializer() {
      super(CpuIntensityEnumDeserializer.class);
    }

    @Override
    public CpuIntensityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CpuIntensityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current compute intensity of the organization's call capacity.
   */
 @JsonDeserialize(using = CpuIntensityEnumDeserializer.class)
  public enum CpuIntensityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High"),
    UNKNOWN("Unknown");

    private String value;

    CpuIntensityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CpuIntensityEnum fromString(String key) {
      if (key == null) return null;

      for (CpuIntensityEnum value : CpuIntensityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CpuIntensityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CpuIntensityEnum cpuIntensity = null;

  private static class MemoryIntensityEnumDeserializer extends StdDeserializer<MemoryIntensityEnum> {
    public MemoryIntensityEnumDeserializer() {
      super(MemoryIntensityEnumDeserializer.class);
    }

    @Override
    public MemoryIntensityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MemoryIntensityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current memory intensity of the organization's call capacity.
   */
 @JsonDeserialize(using = MemoryIntensityEnumDeserializer.class)
  public enum MemoryIntensityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High"),
    UNKNOWN("Unknown");

    private String value;

    MemoryIntensityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MemoryIntensityEnum fromString(String key) {
      if (key == null) return null;

      for (MemoryIntensityEnum value : MemoryIntensityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MemoryIntensityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MemoryIntensityEnum memoryIntensity = null;
  private Integer concurrentCallCount = null;
  private Integer concurrentCallSessionCount = null;
  private Integer maxCallCapacity = null;
  private Integer maxCallSessionCapacity = null;

  private static class AutoScaleInProgressEnumDeserializer extends StdDeserializer<AutoScaleInProgressEnum> {
    public AutoScaleInProgressEnumDeserializer() {
      super(AutoScaleInProgressEnumDeserializer.class);
    }

    @Override
    public AutoScaleInProgressEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AutoScaleInProgressEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The autoscaling status of the organization's call capacity.
   */
 @JsonDeserialize(using = AutoScaleInProgressEnumDeserializer.class)
  public enum AutoScaleInProgressEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UP("Up"),
    DOWN("Down"),
    NONE("None"),
    UNKNOWN("Unknown");

    private String value;

    AutoScaleInProgressEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AutoScaleInProgressEnum fromString(String key) {
      if (key == null) return null;

      for (AutoScaleInProgressEnum value : AutoScaleInProgressEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AutoScaleInProgressEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AutoScaleInProgressEnum autoScaleInProgress = null;

  public OrganizationCallMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OrganizationCallMetrics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The current usage percentage of the organization's call capacity.
   **/
  public OrganizationCallMetrics usage(Double usage) {
    this.usage = usage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current usage percentage of the organization's call capacity.")
  @JsonProperty("usage")
  public Double getUsage() {
    return usage;
  }
  public void setUsage(Double usage) {
    this.usage = usage;
  }


  /**
   * The autoscaling trigger percentage of the organization's call capacity.
   **/
  public OrganizationCallMetrics autoScalingTriggerPercentage(Double autoScalingTriggerPercentage) {
    this.autoScalingTriggerPercentage = autoScalingTriggerPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The autoscaling trigger percentage of the organization's call capacity.")
  @JsonProperty("autoScalingTriggerPercentage")
  public Double getAutoScalingTriggerPercentage() {
    return autoScalingTriggerPercentage;
  }
  public void setAutoScalingTriggerPercentage(Double autoScalingTriggerPercentage) {
    this.autoScalingTriggerPercentage = autoScalingTriggerPercentage;
  }


  /**
   * The current compute intensity of the organization's call capacity.
   **/
  public OrganizationCallMetrics cpuIntensity(CpuIntensityEnum cpuIntensity) {
    this.cpuIntensity = cpuIntensity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current compute intensity of the organization's call capacity.")
  @JsonProperty("cpuIntensity")
  public CpuIntensityEnum getCpuIntensity() {
    return cpuIntensity;
  }
  public void setCpuIntensity(CpuIntensityEnum cpuIntensity) {
    this.cpuIntensity = cpuIntensity;
  }


  /**
   * The current memory intensity of the organization's call capacity.
   **/
  public OrganizationCallMetrics memoryIntensity(MemoryIntensityEnum memoryIntensity) {
    this.memoryIntensity = memoryIntensity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current memory intensity of the organization's call capacity.")
  @JsonProperty("memoryIntensity")
  public MemoryIntensityEnum getMemoryIntensity() {
    return memoryIntensity;
  }
  public void setMemoryIntensity(MemoryIntensityEnum memoryIntensity) {
    this.memoryIntensity = memoryIntensity;
  }


  /**
   * The current number of concurrent calls in the organization.
   **/
  public OrganizationCallMetrics concurrentCallCount(Integer concurrentCallCount) {
    this.concurrentCallCount = concurrentCallCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current number of concurrent calls in the organization.")
  @JsonProperty("concurrentCallCount")
  public Integer getConcurrentCallCount() {
    return concurrentCallCount;
  }
  public void setConcurrentCallCount(Integer concurrentCallCount) {
    this.concurrentCallCount = concurrentCallCount;
  }


  /**
   * The current number of concurrent call sessions in the organization.
   **/
  public OrganizationCallMetrics concurrentCallSessionCount(Integer concurrentCallSessionCount) {
    this.concurrentCallSessionCount = concurrentCallSessionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current number of concurrent call sessions in the organization.")
  @JsonProperty("concurrentCallSessionCount")
  public Integer getConcurrentCallSessionCount() {
    return concurrentCallSessionCount;
  }
  public void setConcurrentCallSessionCount(Integer concurrentCallSessionCount) {
    this.concurrentCallSessionCount = concurrentCallSessionCount;
  }


  /**
   * The maximum number of concurrent calls allowed in the organization.
   **/
  public OrganizationCallMetrics maxCallCapacity(Integer maxCallCapacity) {
    this.maxCallCapacity = maxCallCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of concurrent calls allowed in the organization.")
  @JsonProperty("maxCallCapacity")
  public Integer getMaxCallCapacity() {
    return maxCallCapacity;
  }
  public void setMaxCallCapacity(Integer maxCallCapacity) {
    this.maxCallCapacity = maxCallCapacity;
  }


  /**
   * The maximum number of concurrent call sessions allowed in the organization.
   **/
  public OrganizationCallMetrics maxCallSessionCapacity(Integer maxCallSessionCapacity) {
    this.maxCallSessionCapacity = maxCallSessionCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of concurrent call sessions allowed in the organization.")
  @JsonProperty("maxCallSessionCapacity")
  public Integer getMaxCallSessionCapacity() {
    return maxCallSessionCapacity;
  }
  public void setMaxCallSessionCapacity(Integer maxCallSessionCapacity) {
    this.maxCallSessionCapacity = maxCallSessionCapacity;
  }


  /**
   * The autoscaling status of the organization's call capacity.
   **/
  public OrganizationCallMetrics autoScaleInProgress(AutoScaleInProgressEnum autoScaleInProgress) {
    this.autoScaleInProgress = autoScaleInProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The autoscaling status of the organization's call capacity.")
  @JsonProperty("autoScaleInProgress")
  public AutoScaleInProgressEnum getAutoScaleInProgress() {
    return autoScaleInProgress;
  }
  public void setAutoScaleInProgress(AutoScaleInProgressEnum autoScaleInProgress) {
    this.autoScaleInProgress = autoScaleInProgress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCallMetrics organizationCallMetrics = (OrganizationCallMetrics) o;

    return Objects.equals(this.usage, organizationCallMetrics.usage) &&
            Objects.equals(this.autoScalingTriggerPercentage, organizationCallMetrics.autoScalingTriggerPercentage) &&
            Objects.equals(this.cpuIntensity, organizationCallMetrics.cpuIntensity) &&
            Objects.equals(this.memoryIntensity, organizationCallMetrics.memoryIntensity) &&
            Objects.equals(this.concurrentCallCount, organizationCallMetrics.concurrentCallCount) &&
            Objects.equals(this.concurrentCallSessionCount, organizationCallMetrics.concurrentCallSessionCount) &&
            Objects.equals(this.maxCallCapacity, organizationCallMetrics.maxCallCapacity) &&
            Objects.equals(this.maxCallSessionCapacity, organizationCallMetrics.maxCallSessionCapacity) &&
            Objects.equals(this.autoScaleInProgress, organizationCallMetrics.autoScaleInProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage, autoScalingTriggerPercentage, cpuIntensity, memoryIntensity, concurrentCallCount, concurrentCallSessionCount, maxCallCapacity, maxCallSessionCapacity, autoScaleInProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCallMetrics {\n");
    
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    autoScalingTriggerPercentage: ").append(toIndentedString(autoScalingTriggerPercentage)).append("\n");
    sb.append("    cpuIntensity: ").append(toIndentedString(cpuIntensity)).append("\n");
    sb.append("    memoryIntensity: ").append(toIndentedString(memoryIntensity)).append("\n");
    sb.append("    concurrentCallCount: ").append(toIndentedString(concurrentCallCount)).append("\n");
    sb.append("    concurrentCallSessionCount: ").append(toIndentedString(concurrentCallSessionCount)).append("\n");
    sb.append("    maxCallCapacity: ").append(toIndentedString(maxCallCapacity)).append("\n");
    sb.append("    maxCallSessionCapacity: ").append(toIndentedString(maxCallSessionCapacity)).append("\n");
    sb.append("    autoScaleInProgress: ").append(toIndentedString(autoScaleInProgress)).append("\n");
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

