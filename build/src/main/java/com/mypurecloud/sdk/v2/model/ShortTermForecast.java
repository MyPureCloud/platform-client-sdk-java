package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ForecastGenerationResult;
import com.mypurecloud.sdk.v2.model.ListWrapperForecastSourceDayPointer;
import com.mypurecloud.sdk.v2.model.ListWrapperWfmForecastModification;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Short Term Forecast
 */
@ApiModel(description = "Short Term Forecast")

public class ShortTermForecast  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private String weekDate = null;
  private String description = null;

  /**
   * The method used to create this forecast
   */
  public enum CreationMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMPORT("Import"),
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
  private WfmVersionedEntityMetadata metadata = null;
  private ListWrapperForecastSourceDayPointer sourceData = null;
  private Date referenceStartDate = null;
  private ListWrapperWfmForecastModification modifications = null;
  private ForecastGenerationResult generationResults = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * The weekDate of the short term forecast in yyyy-MM-dd format
   **/
  public ShortTermForecast weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekDate of the short term forecast in yyyy-MM-dd format")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The description of the short term forecast
   **/
  public ShortTermForecast description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the short term forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  @ApiModelProperty(example = "null", value = "The method used to create this forecast")
  @JsonProperty("creationMethod")
  public CreationMethodEnum getCreationMethod() {
    return creationMethod;
  }

  
  /**
   * Metadata for this forecast
   **/
  public ShortTermForecast metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata for this forecast")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * The source data references and metadata for this forecast
   **/
  public ShortTermForecast sourceData(ListWrapperForecastSourceDayPointer sourceData) {
    this.sourceData = sourceData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source data references and metadata for this forecast")
  @JsonProperty("sourceData")
  public ListWrapperForecastSourceDayPointer getSourceData() {
    return sourceData;
  }
  public void setSourceData(ListWrapperForecastSourceDayPointer sourceData) {
    this.sourceData = sourceData;
  }

  
  @ApiModelProperty(example = "null", value = "ISO-8601 date that serves as the reference date for interval-based modifications")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }

  
  /**
   * The modifications that have been applied to this forecast
   **/
  public ShortTermForecast modifications(ListWrapperWfmForecastModification modifications) {
    this.modifications = modifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The modifications that have been applied to this forecast")
  @JsonProperty("modifications")
  public ListWrapperWfmForecastModification getModifications() {
    return modifications;
  }
  public void setModifications(ListWrapperWfmForecastModification modifications) {
    this.modifications = modifications;
  }

  
  /**
   * Forecast generation results, if applicable
   **/
  public ShortTermForecast generationResults(ForecastGenerationResult generationResults) {
    this.generationResults = generationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast generation results, if applicable")
  @JsonProperty("generationResults")
  public ForecastGenerationResult getGenerationResults() {
    return generationResults;
  }
  public void setGenerationResults(ForecastGenerationResult generationResults) {
    this.generationResults = generationResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortTermForecast shortTermForecast = (ShortTermForecast) o;
    return Objects.equals(this.id, shortTermForecast.id) &&
        Objects.equals(this.selfUri, shortTermForecast.selfUri) &&
        Objects.equals(this.weekDate, shortTermForecast.weekDate) &&
        Objects.equals(this.description, shortTermForecast.description) &&
        Objects.equals(this.creationMethod, shortTermForecast.creationMethod) &&
        Objects.equals(this.metadata, shortTermForecast.metadata) &&
        Objects.equals(this.sourceData, shortTermForecast.sourceData) &&
        Objects.equals(this.referenceStartDate, shortTermForecast.referenceStartDate) &&
        Objects.equals(this.modifications, shortTermForecast.modifications) &&
        Objects.equals(this.generationResults, shortTermForecast.generationResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, weekDate, description, creationMethod, metadata, sourceData, referenceStartDate, modifications, generationResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortTermForecast {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationMethod: ").append(toIndentedString(creationMethod)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
    sb.append("    modifications: ").append(toIndentedString(modifications)).append("\n");
    sb.append("    generationResults: ").append(toIndentedString(generationResults)).append("\n");
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

