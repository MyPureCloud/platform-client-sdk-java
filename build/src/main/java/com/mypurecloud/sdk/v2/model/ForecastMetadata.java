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
import java.util.Date;

import java.io.Serializable;
/**
 * ForecastMetadata
 */

public class ForecastMetadata  implements Serializable {
  
  private Date dateCreated = null;
  private String forecastId = null;
  private String intervalLengthInMinutes = null;

  private static class SourceEnumDeserializer extends StdDeserializer<SourceEnum> {
    public SourceEnumDeserializer() {
      super(SourceEnumDeserializer.class);
    }

    @Override
    public SourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Forecast source
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTOMATICBESTMETHOD("AutomaticBestMethod"),
    MAINFORECAST("MainForecast");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromString(String key) {
      if (key == null) return null;

      for (SourceEnum value : SourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceEnum source = null;
  private Date dateStart = null;
  private String timeZone = null;

  public ForecastMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Forecast creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ForecastMetadata dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Forecast ID
   **/
  public ForecastMetadata forecastId(String forecastId) {
    this.forecastId = forecastId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast ID")
  @JsonProperty("forecastId")
  public String getForecastId() {
    return forecastId;
  }
  public void setForecastId(String forecastId) {
    this.forecastId = forecastId;
  }


  /**
   * Interval length
   **/
  public ForecastMetadata intervalLengthInMinutes(String intervalLengthInMinutes) {
    this.intervalLengthInMinutes = intervalLengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interval length")
  @JsonProperty("intervalLengthInMinutes")
  public String getIntervalLengthInMinutes() {
    return intervalLengthInMinutes;
  }
  public void setIntervalLengthInMinutes(String intervalLengthInMinutes) {
    this.intervalLengthInMinutes = intervalLengthInMinutes;
  }


  /**
   * Forecast source
   **/
  public ForecastMetadata source(SourceEnum source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast source")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  /**
   * Forecast start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ForecastMetadata dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * Timezone of the business unit
   **/
  public ForecastMetadata timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timezone of the business unit")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastMetadata forecastMetadata = (ForecastMetadata) o;

    return Objects.equals(this.dateCreated, forecastMetadata.dateCreated) &&
            Objects.equals(this.forecastId, forecastMetadata.forecastId) &&
            Objects.equals(this.intervalLengthInMinutes, forecastMetadata.intervalLengthInMinutes) &&
            Objects.equals(this.source, forecastMetadata.source) &&
            Objects.equals(this.dateStart, forecastMetadata.dateStart) &&
            Objects.equals(this.timeZone, forecastMetadata.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, forecastId, intervalLengthInMinutes, source, dateStart, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastMetadata {\n");
    
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    forecastId: ").append(toIndentedString(forecastId)).append("\n");
    sb.append("    intervalLengthInMinutes: ").append(toIndentedString(intervalLengthInMinutes)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

