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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Pointer to look up source data for a short term forecast
 */
@ApiModel(description = "Pointer to look up source data for a short term forecast")

public class ForecastSourceDayPointer  implements Serializable {
  

  private static class DayOfWeekEnumDeserializer extends StdDeserializer<DayOfWeekEnum> {
    public DayOfWeekEnumDeserializer() {
      super(DayOfWeekEnumDeserializer.class);
    }

    @Override
    public DayOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DayOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The forecast day of week for this source data
   */
 @JsonDeserialize(using = DayOfWeekEnumDeserializer.class)
  public enum DayOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    EIGHTHDAY("EighthDay");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DayOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (DayOfWeekEnum value : DayOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DayOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DayOfWeekEnum dayOfWeek = null;
  private Integer weight = null;
  private String date = null;
  private String fileName = null;
  private String dataKey = null;

  
  /**
   * The forecast day of week for this source data
   **/
  public ForecastSourceDayPointer dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecast day of week for this source data")
  @JsonProperty("dayOfWeek")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  
  /**
   * The relative weight to apply to this source data item for weighted averages
   **/
  public ForecastSourceDayPointer weight(Integer weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The relative weight to apply to this source data item for weighted averages")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   * The date this source data represents, in yyyy-MM-dd format
   **/
  public ForecastSourceDayPointer date(String date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date this source data represents, in yyyy-MM-dd format")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * The name of the source file this data came from if it originated from a data import
   **/
  public ForecastSourceDayPointer fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the source file this data came from if it originated from a data import")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   * The key to look up the forecast source data for this source day
   **/
  public ForecastSourceDayPointer dataKey(String dataKey) {
    this.dataKey = dataKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key to look up the forecast source data for this source day")
  @JsonProperty("dataKey")
  public String getDataKey() {
    return dataKey;
  }
  public void setDataKey(String dataKey) {
    this.dataKey = dataKey;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastSourceDayPointer forecastSourceDayPointer = (ForecastSourceDayPointer) o;
    return Objects.equals(this.dayOfWeek, forecastSourceDayPointer.dayOfWeek) &&
        Objects.equals(this.weight, forecastSourceDayPointer.weight) &&
        Objects.equals(this.date, forecastSourceDayPointer.date) &&
        Objects.equals(this.fileName, forecastSourceDayPointer.fileName) &&
        Objects.equals(this.dataKey, forecastSourceDayPointer.dataKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, weight, date, fileName, dataKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastSourceDayPointer {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
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

