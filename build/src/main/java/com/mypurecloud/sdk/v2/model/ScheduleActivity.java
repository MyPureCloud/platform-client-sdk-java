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
 * ScheduleActivity
 */

public class ScheduleActivity  implements Serializable {
  
  private Date dateStart = null;
  private Integer lengthMinutes = null;
  private String description = null;
  private String activityCodeId = null;
  private Boolean paid = null;
  private String timeOffRequestId = null;
  private String externalActivityId = null;

  private static class ExternalActivityTypeEnumDeserializer extends StdDeserializer<ExternalActivityTypeEnum> {
    public ExternalActivityTypeEnumDeserializer() {
      super(ExternalActivityTypeEnumDeserializer.class);
    }

    @Override
    public ExternalActivityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExternalActivityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the external activity associated with this activity, if applicable
   */
 @JsonDeserialize(using = ExternalActivityTypeEnumDeserializer.class)
  public enum ExternalActivityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COACHING("Coaching");

    private String value;

    ExternalActivityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExternalActivityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExternalActivityTypeEnum value : ExternalActivityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExternalActivityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExternalActivityTypeEnum externalActivityType = null;

  
  /**
   * The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScheduleActivity dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * The length of this activity in minutes
   **/
  public ScheduleActivity lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of this activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }

  
  /**
   * The description of this activity
   **/
  public ScheduleActivity description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of this activity")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The ID of the activity code associated with this activity
   **/
  public ScheduleActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code associated with this activity")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * Whether this activity is paid
   **/
  public ScheduleActivity paid(Boolean paid) {
    this.paid = paid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity is paid")
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  
  /**
   * The ID of the time off request associated with this activity, if applicable
   **/
  public ScheduleActivity timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the time off request associated with this activity, if applicable")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }

  
  /**
   * The ID of the external activity associated with this activity, if applicable
   **/
  public ScheduleActivity externalActivityId(String externalActivityId) {
    this.externalActivityId = externalActivityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the external activity associated with this activity, if applicable")
  @JsonProperty("externalActivityId")
  public String getExternalActivityId() {
    return externalActivityId;
  }
  public void setExternalActivityId(String externalActivityId) {
    this.externalActivityId = externalActivityId;
  }

  
  /**
   * The type of the external activity associated with this activity, if applicable
   **/
  public ScheduleActivity externalActivityType(ExternalActivityTypeEnum externalActivityType) {
    this.externalActivityType = externalActivityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the external activity associated with this activity, if applicable")
  @JsonProperty("externalActivityType")
  public ExternalActivityTypeEnum getExternalActivityType() {
    return externalActivityType;
  }
  public void setExternalActivityType(ExternalActivityTypeEnum externalActivityType) {
    this.externalActivityType = externalActivityType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleActivity scheduleActivity = (ScheduleActivity) o;
    return Objects.equals(this.dateStart, scheduleActivity.dateStart) &&
        Objects.equals(this.lengthMinutes, scheduleActivity.lengthMinutes) &&
        Objects.equals(this.description, scheduleActivity.description) &&
        Objects.equals(this.activityCodeId, scheduleActivity.activityCodeId) &&
        Objects.equals(this.paid, scheduleActivity.paid) &&
        Objects.equals(this.timeOffRequestId, scheduleActivity.timeOffRequestId) &&
        Objects.equals(this.externalActivityId, scheduleActivity.externalActivityId) &&
        Objects.equals(this.externalActivityType, scheduleActivity.externalActivityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, lengthMinutes, description, activityCodeId, paid, timeOffRequestId, externalActivityId, externalActivityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleActivity {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    externalActivityId: ").append(toIndentedString(externalActivityId)).append("\n");
    sb.append("    externalActivityType: ").append(toIndentedString(externalActivityType)).append("\n");
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

