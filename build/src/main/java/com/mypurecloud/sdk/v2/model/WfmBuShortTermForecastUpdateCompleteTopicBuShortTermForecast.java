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
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastUpdateCompleteTopicForecastSourceDayPointer;
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastUpdateCompleteTopicWfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast
 */

public class WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast  implements Serializable {
  
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
  private List<WfmBuShortTermForecastUpdateCompleteTopicForecastSourceDayPointer> sourceDays = null;
  private List<WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification> modifications = null;
  private String timeZone = null;
  private Long planningGroupsVersion = null;
  private Long weekCount = null;
  private WfmBuShortTermForecastUpdateCompleteTopicWfmVersionedEntityMetadata metadata = null;
  private Boolean canUseForScheduling = null;

  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sourceDays = new ArrayList<WfmBuShortTermForecastUpdateCompleteTopicForecastSourceDayPointer>();
      modifications = new ArrayList<WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification>();
    }
  }

  
  /**
   **/
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast id(String id) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast weekDate(String weekDate) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast creationMethod(CreationMethodEnum creationMethod) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast description(String description) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast legacy(Boolean legacy) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast referenceStartDate(Date referenceStartDate) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast sourceDays(List<WfmBuShortTermForecastUpdateCompleteTopicForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceDays")
  public List<WfmBuShortTermForecastUpdateCompleteTopicForecastSourceDayPointer> getSourceDays() {
    return sourceDays;
  }
  public void setSourceDays(List<WfmBuShortTermForecastUpdateCompleteTopicForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
  }


  /**
   **/
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast modifications(List<WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification> modifications) {
    this.modifications = modifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifications")
  public List<WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification> getModifications() {
    return modifications;
  }
  public void setModifications(List<WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification> modifications) {
    this.modifications = modifications;
  }


  /**
   **/
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast timeZone(String timeZone) {
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
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast planningGroupsVersion(Long planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planningGroupsVersion")
  public Long getPlanningGroupsVersion() {
    return planningGroupsVersion;
  }
  public void setPlanningGroupsVersion(Long planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
  }


  /**
   **/
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast weekCount(Long weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekCount")
  public Long getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Long weekCount) {
    this.weekCount = weekCount;
  }


  /**
   **/
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast metadata(WfmBuShortTermForecastUpdateCompleteTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public WfmBuShortTermForecastUpdateCompleteTopicWfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmBuShortTermForecastUpdateCompleteTopicWfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   **/
  public WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast canUseForScheduling(Boolean canUseForScheduling) {
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
    WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast = (WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast) o;

    return Objects.equals(this.id, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.id) &&
            Objects.equals(this.weekDate, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.weekDate) &&
            Objects.equals(this.creationMethod, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.creationMethod) &&
            Objects.equals(this.description, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.description) &&
            Objects.equals(this.legacy, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.legacy) &&
            Objects.equals(this.referenceStartDate, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.referenceStartDate) &&
            Objects.equals(this.sourceDays, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.sourceDays) &&
            Objects.equals(this.modifications, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.modifications) &&
            Objects.equals(this.timeZone, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.timeZone) &&
            Objects.equals(this.planningGroupsVersion, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.planningGroupsVersion) &&
            Objects.equals(this.weekCount, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.weekCount) &&
            Objects.equals(this.metadata, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.metadata) &&
            Objects.equals(this.canUseForScheduling, wfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast.canUseForScheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, creationMethod, description, legacy, referenceStartDate, sourceDays, modifications, timeZone, planningGroupsVersion, weekCount, metadata, canUseForScheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastUpdateCompleteTopicBuShortTermForecast {\n");
    
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

