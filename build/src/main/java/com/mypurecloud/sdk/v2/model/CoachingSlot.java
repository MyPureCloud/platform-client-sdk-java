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
import com.mypurecloud.sdk.v2.model.WfmScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CoachingSlot
 */

public class CoachingSlot  implements Serializable {
  
  private Date dateStart = null;
  private Integer lengthInMinutes = null;
  private Double staffingDifference = null;

  private static class DifferenceRatingEnumDeserializer extends StdDeserializer<DifferenceRatingEnum> {
    public DifferenceRatingEnumDeserializer() {
      super(DifferenceRatingEnumDeserializer.class);
    }

    @Override
    public DifferenceRatingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DifferenceRatingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Rating based on the staffing difference for scheduled slot
   */
 @JsonDeserialize(using = DifferenceRatingEnumDeserializer.class)
  public enum DifferenceRatingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    POOR("Poor"),
    NEUTRAL("Neutral"),
    GOOD("Good");

    private String value;

    DifferenceRatingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DifferenceRatingEnum fromString(String key) {
      if (key == null) return null;

      for (DifferenceRatingEnum value : DifferenceRatingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DifferenceRatingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DifferenceRatingEnum differenceRating = null;
  private WfmScheduleReference wfmSchedule = null;

  
  @ApiModelProperty(example = "null", value = "Start date and time of scheduled coaching appointment slot. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }

  
  @ApiModelProperty(example = "null", value = "Length of coaching appointment slot in minutes")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }

  
  @ApiModelProperty(example = "null", value = "Difference between scheduled and forecast headcount for this slot after scheduling the coaching appointment")
  @JsonProperty("staffingDifference")
  public Double getStaffingDifference() {
    return staffingDifference;
  }

  
  @ApiModelProperty(example = "null", value = "Rating based on the staffing difference for scheduled slot")
  @JsonProperty("differenceRating")
  public DifferenceRatingEnum getDifferenceRating() {
    return differenceRating;
  }

  
  @ApiModelProperty(example = "null", value = "Workforce Management schedule information associated with the slot")
  @JsonProperty("wfmSchedule")
  public WfmScheduleReference getWfmSchedule() {
    return wfmSchedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingSlot coachingSlot = (CoachingSlot) o;
    return Objects.equals(this.dateStart, coachingSlot.dateStart) &&
        Objects.equals(this.lengthInMinutes, coachingSlot.lengthInMinutes) &&
        Objects.equals(this.staffingDifference, coachingSlot.staffingDifference) &&
        Objects.equals(this.differenceRating, coachingSlot.differenceRating) &&
        Objects.equals(this.wfmSchedule, coachingSlot.wfmSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, lengthInMinutes, staffingDifference, differenceRating, wfmSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingSlot {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    staffingDifference: ").append(toIndentedString(staffingDifference)).append("\n");
    sb.append("    differenceRating: ").append(toIndentedString(differenceRating)).append("\n");
    sb.append("    wfmSchedule: ").append(toIndentedString(wfmSchedule)).append("\n");
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

