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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CreateAdminTimeOffRequest
 */

public class CreateAdminTimeOffRequest  implements Serializable {
  

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
   * The status of this time off request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    APPROVED("APPROVED");

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
  private List<UserReference> users = new ArrayList<UserReference>();
  private String activityCodeId = null;
  private String notes = null;
  private List<String> fullDayManagementUnitDates = new ArrayList<String>();
  private List<Date> partialDayStartDateTimes = new ArrayList<Date>();
  private Integer dailyDurationMinutes = null;

  
  /**
   * The status of this time off request
   **/
  public CreateAdminTimeOffRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of this time off request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * A set of IDs for users to associate with this time off request
   **/
  public CreateAdminTimeOffRequest users(List<UserReference> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A set of IDs for users to associate with this time off request")
  @JsonProperty("users")
  public List<UserReference> getUsers() {
    return users;
  }
  public void setUsers(List<UserReference> users) {
    this.users = users;
  }

  
  /**
   * The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category
   **/
  public CreateAdminTimeOffRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * Notes about the time off request
   **/
  public CreateAdminTimeOffRequest notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes about the time off request")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.
   **/
  public CreateAdminTimeOffRequest fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.")
  @JsonProperty("fullDayManagementUnitDates")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }

  
  /**
   * A set of start date-times in ISO-8601 format for partial day requests.
   **/
  public CreateAdminTimeOffRequest partialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of start date-times in ISO-8601 format for partial day requests.")
  @JsonProperty("partialDayStartDateTimes")
  public List<Date> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }

  
  /**
   * The daily duration of this time off request in minutes
   **/
  public CreateAdminTimeOffRequest dailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The daily duration of this time off request in minutes")
  @JsonProperty("dailyDurationMinutes")
  public Integer getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdminTimeOffRequest createAdminTimeOffRequest = (CreateAdminTimeOffRequest) o;
    return Objects.equals(this.status, createAdminTimeOffRequest.status) &&
        Objects.equals(this.users, createAdminTimeOffRequest.users) &&
        Objects.equals(this.activityCodeId, createAdminTimeOffRequest.activityCodeId) &&
        Objects.equals(this.notes, createAdminTimeOffRequest.notes) &&
        Objects.equals(this.fullDayManagementUnitDates, createAdminTimeOffRequest.fullDayManagementUnitDates) &&
        Objects.equals(this.partialDayStartDateTimes, createAdminTimeOffRequest.partialDayStartDateTimes) &&
        Objects.equals(this.dailyDurationMinutes, createAdminTimeOffRequest.dailyDurationMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, users, activityCodeId, notes, fullDayManagementUnitDates, partialDayStartDateTimes, dailyDurationMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdminTimeOffRequest {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    dailyDurationMinutes: ").append(toIndentedString(dailyDurationMinutes)).append("\n");
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

