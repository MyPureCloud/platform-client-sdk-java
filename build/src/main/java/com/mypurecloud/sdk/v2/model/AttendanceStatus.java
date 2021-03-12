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

import java.io.Serializable;
/**
 * AttendanceStatus
 */

public class AttendanceStatus  implements Serializable {
  
  private LocalDate dateWorkday = null;

  private static class AttendanceStatusTypeEnumDeserializer extends StdDeserializer<AttendanceStatusTypeEnum> {
    public AttendanceStatusTypeEnumDeserializer() {
      super(AttendanceStatusTypeEnumDeserializer.class);
    }

    @Override
    public AttendanceStatusTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AttendanceStatusTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * the attendance status
   */
 @JsonDeserialize(using = AttendanceStatusTypeEnumDeserializer.class)
  public enum AttendanceStatusTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HASDATA("HasData"),
    SCHEDULED("Scheduled"),
    ABSENT("Absent"),
    PRESENT("Present"),
    NOSCHEDULE("NoSchedule");

    private String value;

    AttendanceStatusTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AttendanceStatusTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AttendanceStatusTypeEnum value : AttendanceStatusTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AttendanceStatusTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AttendanceStatusTypeEnum attendanceStatusType = null;

  
  @ApiModelProperty(example = "null", value = "the workday date of this attendance status. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "the attendance status")
  @JsonProperty("attendanceStatusType")
  public AttendanceStatusTypeEnum getAttendanceStatusType() {
    return attendanceStatusType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttendanceStatus attendanceStatus = (AttendanceStatus) o;
    return Objects.equals(this.dateWorkday, attendanceStatus.dateWorkday) &&
        Objects.equals(this.attendanceStatusType, attendanceStatus.attendanceStatusType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWorkday, attendanceStatusType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceStatus {\n");
    
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
    sb.append("    attendanceStatusType: ").append(toIndentedString(attendanceStatusType)).append("\n");
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

