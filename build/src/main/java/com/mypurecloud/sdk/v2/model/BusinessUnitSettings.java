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
import com.mypurecloud.sdk.v2.model.BuShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BusinessUnitSettings
 */

public class BusinessUnitSettings  implements Serializable {
  

  private static class StartDayOfWeekEnumDeserializer extends StdDeserializer<StartDayOfWeekEnum> {
    public StartDayOfWeekEnumDeserializer() {
      super(StartDayOfWeekEnumDeserializer.class);
    }

    @Override
    public StartDayOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StartDayOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The start day of week for this business unit
   */
 @JsonDeserialize(using = StartDayOfWeekEnumDeserializer.class)
  public enum StartDayOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    StartDayOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartDayOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (StartDayOfWeekEnum value : StartDayOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartDayOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartDayOfWeekEnum startDayOfWeek = null;
  private String timeZone = null;
  private BuShortTermForecastingSettings shortTermForecasting = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The start day of week for this business unit
   **/
  public BusinessUnitSettings startDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start day of week for this business unit")
  @JsonProperty("startDayOfWeek")
  public StartDayOfWeekEnum getStartDayOfWeek() {
    return startDayOfWeek;
  }
  public void setStartDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
  }

  
  /**
   * The time zone for this business unit, using the Olsen tz database format
   **/
  public BusinessUnitSettings timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time zone for this business unit, using the Olsen tz database format")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * Short term forecasting settings
   **/
  public BusinessUnitSettings shortTermForecasting(BuShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecasting settings")
  @JsonProperty("shortTermForecasting")
  public BuShortTermForecastingSettings getShortTermForecasting() {
    return shortTermForecasting;
  }
  public void setShortTermForecasting(BuShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
  }

  
  /**
   * Version metadata for this business unit
   **/
  public BusinessUnitSettings metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this business unit")
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
    BusinessUnitSettings businessUnitSettings = (BusinessUnitSettings) o;
    return Objects.equals(this.startDayOfWeek, businessUnitSettings.startDayOfWeek) &&
        Objects.equals(this.timeZone, businessUnitSettings.timeZone) &&
        Objects.equals(this.shortTermForecasting, businessUnitSettings.shortTermForecasting) &&
        Objects.equals(this.metadata, businessUnitSettings.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDayOfWeek, timeZone, shortTermForecasting, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessUnitSettings {\n");
    
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    shortTermForecasting: ").append(toIndentedString(shortTermForecasting)).append("\n");
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

