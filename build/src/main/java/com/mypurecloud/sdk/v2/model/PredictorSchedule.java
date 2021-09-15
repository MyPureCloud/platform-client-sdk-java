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
import java.util.Date;

import java.io.Serializable;
/**
 * PredictorSchedule
 */

public class PredictorSchedule  implements Serializable {
  

  private static class ScheduleTypeEnumDeserializer extends StdDeserializer<ScheduleTypeEnum> {
    public ScheduleTypeEnumDeserializer() {
      super(ScheduleTypeEnumDeserializer.class);
    }

    @Override
    public ScheduleTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScheduleTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The predictor schedule type.
   */
 @JsonDeserialize(using = ScheduleTypeEnumDeserializer.class)
  public enum ScheduleTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HOURONHOUROFF("HourOnHourOff"),
    ONGOINGVALUEMONITORING("OngoingValueMonitoring");

    private String value;

    ScheduleTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScheduleTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ScheduleTypeEnum value : ScheduleTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScheduleTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScheduleTypeEnum scheduleType = null;
  private Date dateStarted = null;

  
  /**
   * The predictor schedule type.
   **/
  public PredictorSchedule scheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The predictor schedule type.")
  @JsonProperty("scheduleType")
  public ScheduleTypeEnum getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
  }

  
  @ApiModelProperty(example = "null", value = "DateTime indicating when the predictor schedule was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictorSchedule predictorSchedule = (PredictorSchedule) o;
    return Objects.equals(this.scheduleType, predictorSchedule.scheduleType) &&
        Objects.equals(this.dateStarted, predictorSchedule.dateStarted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleType, dateStarted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictorSchedule {\n");
    
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
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

