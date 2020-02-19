package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Abbreviated information for a short term forecast to be returned in a list
 */
@ApiModel(description = "Abbreviated information for a short term forecast to be returned in a list")

public class ShortTermForecastListItemResponse  implements Serializable {
  
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
  public ShortTermForecastListItemResponse weekDate(String weekDate) {
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
  public ShortTermForecastListItemResponse description(String description) {
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
  public ShortTermForecastListItemResponse metadata(WfmVersionedEntityMetadata metadata) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortTermForecastListItemResponse shortTermForecastListItemResponse = (ShortTermForecastListItemResponse) o;
    return Objects.equals(this.id, shortTermForecastListItemResponse.id) &&
        Objects.equals(this.selfUri, shortTermForecastListItemResponse.selfUri) &&
        Objects.equals(this.weekDate, shortTermForecastListItemResponse.weekDate) &&
        Objects.equals(this.description, shortTermForecastListItemResponse.description) &&
        Objects.equals(this.creationMethod, shortTermForecastListItemResponse.creationMethod) &&
        Objects.equals(this.metadata, shortTermForecastListItemResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, weekDate, description, creationMethod, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortTermForecastListItemResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationMethod: ").append(toIndentedString(creationMethod)).append("\n");
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

