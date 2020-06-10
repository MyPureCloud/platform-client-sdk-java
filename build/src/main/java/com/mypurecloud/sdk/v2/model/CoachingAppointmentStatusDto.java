package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CoachingAppointmentStatusDto
 */

public class CoachingAppointmentStatusDto  implements Serializable {
  
  private CoachingAppointmentReference appointment = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;

  /**
   * The status of the coaching appointment
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed");

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

  
  /**
   * The coaching appointment this status belongs to
   **/
  public CoachingAppointmentStatusDto appointment(CoachingAppointmentReference appointment) {
    this.appointment = appointment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The coaching appointment this status belongs to")
  @JsonProperty("appointment")
  public CoachingAppointmentReference getAppointment() {
    return appointment;
  }
  public void setAppointment(CoachingAppointmentReference appointment) {
    this.appointment = appointment;
  }

  
  /**
   * User who updated the status
   **/
  public CoachingAppointmentStatusDto createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User who updated the status")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * The status of the coaching appointment
   **/
  public CoachingAppointmentStatusDto status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the coaching appointment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingAppointmentStatusDto coachingAppointmentStatusDto = (CoachingAppointmentStatusDto) o;
    return Objects.equals(this.appointment, coachingAppointmentStatusDto.appointment) &&
        Objects.equals(this.createdBy, coachingAppointmentStatusDto.createdBy) &&
        Objects.equals(this.dateCreated, coachingAppointmentStatusDto.dateCreated) &&
        Objects.equals(this.status, coachingAppointmentStatusDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointment, createdBy, dateCreated, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingAppointmentStatusDto {\n");
    
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

