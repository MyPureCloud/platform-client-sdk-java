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
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastImportCompleteTopicBuForecastModification;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast
 */

public class WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast  implements Serializable {
  
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
  private List<WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer> sourceDays = new ArrayList<WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer>();
  private List<WfmBuShortTermForecastImportCompleteTopicBuForecastModification> modifications = new ArrayList<WfmBuShortTermForecastImportCompleteTopicBuForecastModification>();
  private String timeZone = null;
  private Integer planningGroupsVersion = null;
  private Integer weekCount = null;
  private WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata metadata = null;
  private Boolean canUseForScheduling = null;

  
  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast id(String id) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast weekDate(String weekDate) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast creationMethod(CreationMethodEnum creationMethod) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast description(String description) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast legacy(Boolean legacy) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast referenceStartDate(Date referenceStartDate) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast sourceDays(List<WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceDays")
  public List<WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer> getSourceDays() {
    return sourceDays;
  }
  public void setSourceDays(List<WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
  }

  
  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast modifications(List<WfmBuShortTermForecastImportCompleteTopicBuForecastModification> modifications) {
    this.modifications = modifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifications")
  public List<WfmBuShortTermForecastImportCompleteTopicBuForecastModification> getModifications() {
    return modifications;
  }
  public void setModifications(List<WfmBuShortTermForecastImportCompleteTopicBuForecastModification> modifications) {
    this.modifications = modifications;
  }

  
  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast timeZone(String timeZone) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast planningGroupsVersion(Integer planningGroupsVersion) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast weekCount(Integer weekCount) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast metadata(WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast canUseForScheduling(Boolean canUseForScheduling) {
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
    WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast = (WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast) o;
    return Objects.equals(this.id, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.id) &&
        Objects.equals(this.weekDate, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.weekDate) &&
        Objects.equals(this.creationMethod, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.creationMethod) &&
        Objects.equals(this.description, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.description) &&
        Objects.equals(this.legacy, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.legacy) &&
        Objects.equals(this.referenceStartDate, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.referenceStartDate) &&
        Objects.equals(this.sourceDays, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.sourceDays) &&
        Objects.equals(this.modifications, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.modifications) &&
        Objects.equals(this.timeZone, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.timeZone) &&
        Objects.equals(this.planningGroupsVersion, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.planningGroupsVersion) &&
        Objects.equals(this.weekCount, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.weekCount) &&
        Objects.equals(this.metadata, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.metadata) &&
        Objects.equals(this.canUseForScheduling, wfmBuShortTermForecastImportCompleteTopicBuShortTermForecast.canUseForScheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, creationMethod, description, legacy, referenceStartDate, sourceDays, modifications, timeZone, planningGroupsVersion, weekCount, metadata, canUseForScheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast {\n");
    
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

