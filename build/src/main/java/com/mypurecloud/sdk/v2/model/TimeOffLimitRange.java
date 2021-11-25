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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A single range filled with time off limit interval values
 */
@ApiModel(description = "A single range filled with time off limit interval values")

public class TimeOffLimitRange  implements Serializable {
  
  private LocalDate startDate = null;

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Granularity choice for the time off limit
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;
  private List<Integer> limitMinutesPerInterval = new ArrayList<Integer>();

  
  /**
   * Start date of the range. The end date is determined by 'granularity' and the size of 'limitMinutesPerInterval'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public TimeOffLimitRange startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of the range. The end date is determined by 'granularity' and the size of 'limitMinutesPerInterval'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Granularity choice for the time off limit
   **/
  public TimeOffLimitRange granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Granularity choice for the time off limit")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  
  /**
   * The list of time off limit values in minutes per granularity interval. If 'null' is specified, then interval specific value is cleared. Such interval will have 'defaultLimitMinutes' value
   **/
  public TimeOffLimitRange limitMinutesPerInterval(List<Integer> limitMinutesPerInterval) {
    this.limitMinutesPerInterval = limitMinutesPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of time off limit values in minutes per granularity interval. If 'null' is specified, then interval specific value is cleared. Such interval will have 'defaultLimitMinutes' value")
  @JsonProperty("limitMinutesPerInterval")
  public List<Integer> getLimitMinutesPerInterval() {
    return limitMinutesPerInterval;
  }
  public void setLimitMinutesPerInterval(List<Integer> limitMinutesPerInterval) {
    this.limitMinutesPerInterval = limitMinutesPerInterval;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffLimitRange timeOffLimitRange = (TimeOffLimitRange) o;
    return Objects.equals(this.startDate, timeOffLimitRange.startDate) &&
        Objects.equals(this.granularity, timeOffLimitRange.granularity) &&
        Objects.equals(this.limitMinutesPerInterval, timeOffLimitRange.limitMinutesPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, granularity, limitMinutesPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffLimitRange {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    limitMinutesPerInterval: ").append(toIndentedString(limitMinutesPerInterval)).append("\n");
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

