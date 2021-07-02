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
import com.mypurecloud.sdk.v2.model.BuForecastGenerationResult;
import com.mypurecloud.sdk.v2.model.BuForecastModification;
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupsResponse;
import com.mypurecloud.sdk.v2.model.ForecastSourceDayPointer;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuShortTermForecast
 */

public class BuShortTermForecast  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;
  private Integer weekCount = null;

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
   * The method by which this forecast was created
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
  private WfmVersionedEntityMetadata metadata = null;
  private Boolean canUseForScheduling = null;
  private Date referenceStartDate = null;
  private List<ForecastSourceDayPointer> sourceDays = new ArrayList<ForecastSourceDayPointer>();
  private List<BuForecastModification> modifications = new ArrayList<BuForecastModification>();
  private BuForecastGenerationResult generationResults = null;
  private String timeZone = null;
  private Integer planningGroupsVersion = null;
  private ForecastPlanningGroupsResponse planningGroups = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The start week date of this forecast in yyyy-MM-dd.  Must fall on the start day of week for the associated business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuShortTermForecast weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start week date of this forecast in yyyy-MM-dd.  Must fall on the start day of week for the associated business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The number of weeks this forecast covers
   **/
  public BuShortTermForecast weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks this forecast covers")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   * The method by which this forecast was created
   **/
  public BuShortTermForecast creationMethod(CreationMethodEnum creationMethod) {
    this.creationMethod = creationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The method by which this forecast was created")
  @JsonProperty("creationMethod")
  public CreationMethodEnum getCreationMethod() {
    return creationMethod;
  }
  public void setCreationMethod(CreationMethodEnum creationMethod) {
    this.creationMethod = creationMethod;
  }

  
  /**
   * The description of this forecast
   **/
  public BuShortTermForecast description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of this forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  @ApiModelProperty(example = "null", value = "Whether this forecast contains modifications on legacy metrics")
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }

  
  /**
   * Metadata for this forecast
   **/
  public BuShortTermForecast metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for this forecast")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * Whether this forecast can be used for scheduling
   **/
  public BuShortTermForecast canUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this forecast can be used for scheduling")
  @JsonProperty("canUseForScheduling")
  public Boolean getCanUseForScheduling() {
    return canUseForScheduling;
  }
  public void setCanUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
  }

  
  /**
   * The reference start date for interval-based data for this forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuShortTermForecast referenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference start date for interval-based data for this forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }

  
  /**
   * The source day pointers for this forecast
   **/
  public BuShortTermForecast sourceDays(List<ForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source day pointers for this forecast")
  @JsonProperty("sourceDays")
  public List<ForecastSourceDayPointer> getSourceDays() {
    return sourceDays;
  }
  public void setSourceDays(List<ForecastSourceDayPointer> sourceDays) {
    this.sourceDays = sourceDays;
  }

  
  /**
   * Any manual modifications applied to this forecast
   **/
  public BuShortTermForecast modifications(List<BuForecastModification> modifications) {
    this.modifications = modifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any manual modifications applied to this forecast")
  @JsonProperty("modifications")
  public List<BuForecastModification> getModifications() {
    return modifications;
  }
  public void setModifications(List<BuForecastModification> modifications) {
    this.modifications = modifications;
  }

  
  /**
   * Generation result metadata
   **/
  public BuShortTermForecast generationResults(BuForecastGenerationResult generationResults) {
    this.generationResults = generationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generation result metadata")
  @JsonProperty("generationResults")
  public BuForecastGenerationResult getGenerationResults() {
    return generationResults;
  }
  public void setGenerationResults(BuForecastGenerationResult generationResults) {
    this.generationResults = generationResults;
  }

  
  /**
   * The time zone for this forecast
   **/
  public BuShortTermForecast timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone for this forecast")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The version of the planning groups that was used for this forecast
   **/
  public BuShortTermForecast planningGroupsVersion(Integer planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the planning groups that was used for this forecast")
  @JsonProperty("planningGroupsVersion")
  public Integer getPlanningGroupsVersion() {
    return planningGroupsVersion;
  }
  public void setPlanningGroupsVersion(Integer planningGroupsVersion) {
    this.planningGroupsVersion = planningGroupsVersion;
  }

  
  /**
   * A snapshot of the planning groups used for this forecast as of the version number indicated
   **/
  public BuShortTermForecast planningGroups(ForecastPlanningGroupsResponse planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A snapshot of the planning groups used for this forecast as of the version number indicated")
  @JsonProperty("planningGroups")
  public ForecastPlanningGroupsResponse getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(ForecastPlanningGroupsResponse planningGroups) {
    this.planningGroups = planningGroups;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuShortTermForecast buShortTermForecast = (BuShortTermForecast) o;
    return Objects.equals(this.id, buShortTermForecast.id) &&
        Objects.equals(this.weekDate, buShortTermForecast.weekDate) &&
        Objects.equals(this.weekCount, buShortTermForecast.weekCount) &&
        Objects.equals(this.creationMethod, buShortTermForecast.creationMethod) &&
        Objects.equals(this.description, buShortTermForecast.description) &&
        Objects.equals(this.legacy, buShortTermForecast.legacy) &&
        Objects.equals(this.metadata, buShortTermForecast.metadata) &&
        Objects.equals(this.canUseForScheduling, buShortTermForecast.canUseForScheduling) &&
        Objects.equals(this.referenceStartDate, buShortTermForecast.referenceStartDate) &&
        Objects.equals(this.sourceDays, buShortTermForecast.sourceDays) &&
        Objects.equals(this.modifications, buShortTermForecast.modifications) &&
        Objects.equals(this.generationResults, buShortTermForecast.generationResults) &&
        Objects.equals(this.timeZone, buShortTermForecast.timeZone) &&
        Objects.equals(this.planningGroupsVersion, buShortTermForecast.planningGroupsVersion) &&
        Objects.equals(this.planningGroups, buShortTermForecast.planningGroups) &&
        Objects.equals(this.selfUri, buShortTermForecast.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, weekCount, creationMethod, description, legacy, metadata, canUseForScheduling, referenceStartDate, sourceDays, modifications, generationResults, timeZone, planningGroupsVersion, planningGroups, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuShortTermForecast {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    creationMethod: ").append(toIndentedString(creationMethod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    canUseForScheduling: ").append(toIndentedString(canUseForScheduling)).append("\n");
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
    sb.append("    sourceDays: ").append(toIndentedString(sourceDays)).append("\n");
    sb.append("    modifications: ").append(toIndentedString(modifications)).append("\n");
    sb.append("    generationResults: ").append(toIndentedString(generationResults)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    planningGroupsVersion: ").append(toIndentedString(planningGroupsVersion)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

