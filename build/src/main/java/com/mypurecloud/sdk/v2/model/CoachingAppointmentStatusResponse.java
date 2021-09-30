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
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CoachingAppointmentStatusResponse
 */

public class CoachingAppointmentStatusResponse  implements Serializable {
  
  private CoachingAppointmentReference appointment = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the coaching appointment
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    INVALIDSCHEDULE("InvalidSchedule");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  
  @ApiModelProperty(example = "null", value = "The coaching appointment this status belongs to")
  @JsonProperty("appointment")
  public CoachingAppointmentReference getAppointment() {
    return appointment;
  }

  
  @ApiModelProperty(example = "null", value = "User who updated the status")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The status of the coaching appointment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingAppointmentStatusResponse coachingAppointmentStatusResponse = (CoachingAppointmentStatusResponse) o;
    return Objects.equals(this.appointment, coachingAppointmentStatusResponse.appointment) &&
        Objects.equals(this.createdBy, coachingAppointmentStatusResponse.createdBy) &&
        Objects.equals(this.dateCreated, coachingAppointmentStatusResponse.dateCreated) &&
        Objects.equals(this.status, coachingAppointmentStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointment, createdBy, dateCreated, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingAppointmentStatusResponse {\n");
    
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

