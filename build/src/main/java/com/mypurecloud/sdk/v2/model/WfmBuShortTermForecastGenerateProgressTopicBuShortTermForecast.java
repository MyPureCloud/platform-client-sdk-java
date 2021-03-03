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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastGenerateProgressTopicBuForecastModification;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast
 */

public class WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast  implements Serializable {
  
  private String id = null;
  private String weekDate = null;

  private static class CreationMethodEnumDeserializer extends StdDeserializer<CreationMethodEnum> {
    public CreationMethodEnumDeserializer() {
      super(CreationMethodEnumDeserializer.class);
    }

    @Override
    public CreationMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CreationMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets creationMethod
   */
 @JsonDeserialize(using = CreationMethodEnumDeserializer.class)
  public enum CreationMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMPORT("Import"),
    IMPORTEDHISTORICALWEIGHTEDAVERAGE("ImportedHistoricalWeightedAverage"),
    HISTORICALWEIGHTEDAVERAGE("HistoricalWeightedAverage"),
    ADVANCED("Advanced");

    private String value;

    CreationMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CreationMethodEnum fromString(String key) {
      if (key == null) return null;

      for (CreationMethodEnum value : CreationMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CreationMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CreationMethodEnum creationMethod = null;
  private String description = null;
  private Boolean legacy = null;
  private Date referenceStartDate = null;
  private List<WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer> sourceDays = new ArrayList<WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer>();
  private List<WfmBuShortTermForecastGenerateProgressTopicBuForecastModification> modifications = new ArrayList<WfmBuShortTermForecastGenerateProgressTopicBuForecastModification>();
  private String timeZone = null;
  private Integer planningGroupsVersion = null;
  private Integer weekCount = null;
  private WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata metadata = null;
  private Boolean canUseForScheduling = null;

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast creationMethod(CreationMethodEnum creationMethod) {
    this.creationMethod = creationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("creationMethod")
  public CreationMethodEnum getCreationMethod() {
    return creationMethod;
  }
  public void setCreationMethod(CreationMethodEnum creationMethod) {
    this.creationMethod = creationMethod;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast referenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast sourceDays(List<WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceDays")
  public List<WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer> getSourceDays() {
    return sourceDays;
  }
  public void setSourceDays(List<WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast modifications(List<WfmBuShortTermForecastGenerateProgressTopicBuForecastModification> modifications) {
    this.modifications = modifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifications")
  public List<WfmBuShortTermForecastGenerateProgressTopicBuForecastModification> getModifications() {
    return modifications;
  }
  public void setModifications(List<WfmBuShortTermForecastGenerateProgressTopicBuForecastModification> modifications) {
    this.modifications = modifications;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast planningGroupsVersion(Integer planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planningGroupsVersion")
  public Integer getPlanningGroupsVersion() {
    return planningGroupsVersion;
  }
  public void setPlanningGroupsVersion(Integer planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast metadata(WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast canUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("canUseForScheduling")
  public Boolean getCanUseForScheduling() {
    return canUseForScheduling;
  }
  public void setCanUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast = (WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast) o;
    return Objects.equals(this.id, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.id) &&
        Objects.equals(this.weekDate, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.weekDate) &&
        Objects.equals(this.creationMethod, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.creationMethod) &&
        Objects.equals(this.description, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.description) &&
        Objects.equals(this.legacy, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.legacy) &&
        Objects.equals(this.referenceStartDate, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.referenceStartDate) &&
        Objects.equals(this.sourceDays, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.sourceDays) &&
        Objects.equals(this.modifications, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.modifications) &&
        Objects.equals(this.timeZone, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.timeZone) &&
        Objects.equals(this.planningGroupsVersion, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.planningGroupsVersion) &&
        Objects.equals(this.weekCount, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.weekCount) &&
        Objects.equals(this.metadata, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.metadata) &&
        Objects.equals(this.canUseForScheduling, wfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast.canUseForScheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, creationMethod, description, legacy, referenceStartDate, sourceDays, modifications, timeZone, planningGroupsVersion, weekCount, metadata, canUseForScheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    creationMethod: ").append(toIndentedString(creationMethod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
    sb.append("    sourceDays: ").append(toIndentedString(sourceDays)).append("\n");
    sb.append("    modifications: ").append(toIndentedString(modifications)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    planningGroupsVersion: ").append(toIndentedString(planningGroupsVersion)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    canUseForScheduling: ").append(toIndentedString(canUseForScheduling)).append("\n");
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

