package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffRequestUpdateNotification
 */

public class TimeOffRequestUpdateNotification  implements Serializable {
  
  private String id = null;
  private DocumentDataV2NotificationWorkspace user = null;
  private Boolean isFullDayRequest = null;
  private Boolean markedAsRead = null;
  private String activityCodeId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    DENIED("DENIED"),
    CANCELED("CANCELED");

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
  private List<String> partialDayStartDateTimes = new ArrayList<String>();
  private List<String> fullDayManagementUnitDates = new ArrayList<String>();
  private Integer dailyDurationMinutes = null;
  private String notes = null;
  private String reviewedDate = null;
  private String reviewedBy = null;
  private String submittedDate = null;
  private String submittedBy = null;
  private String modifiedDate = null;
  private String modifiedBy = null;

  
  /**
   **/
  public TimeOffRequestUpdateNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification user(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationWorkspace getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification isFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFullDayRequest")
  public Boolean getIsFullDayRequest() {
    return isFullDayRequest;
  }
  public void setIsFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification partialDayStartDateTimes(List<String> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("partialDayStartDateTimes")
  public List<String> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<String> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDayManagementUnitDates")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification dailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dailyDurationMinutes")
  public Integer getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification reviewedDate(String reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedDate")
  public String getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(String reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification reviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewedBy")
  public String getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification submittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("submittedDate")
  public String getSubmittedDate() {
    return submittedDate;
  }
  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification submittedBy(String submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("submittedBy")
  public String getSubmittedBy() {
    return submittedBy;
  }
  public void setSubmittedBy(String submittedBy) {
    this.submittedBy = submittedBy;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDate")
  public String getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   **/
  public TimeOffRequestUpdateNotification modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestUpdateNotification timeOffRequestUpdateNotification = (TimeOffRequestUpdateNotification) o;
    return Objects.equals(this.id, timeOffRequestUpdateNotification.id) &&
        Objects.equals(this.user, timeOffRequestUpdateNotification.user) &&
        Objects.equals(this.isFullDayRequest, timeOffRequestUpdateNotification.isFullDayRequest) &&
        Objects.equals(this.markedAsRead, timeOffRequestUpdateNotification.markedAsRead) &&
        Objects.equals(this.activityCodeId, timeOffRequestUpdateNotification.activityCodeId) &&
        Objects.equals(this.status, timeOffRequestUpdateNotification.status) &&
        Objects.equals(this.partialDayStartDateTimes, timeOffRequestUpdateNotification.partialDayStartDateTimes) &&
        Objects.equals(this.fullDayManagementUnitDates, timeOffRequestUpdateNotification.fullDayManagementUnitDates) &&
        Objects.equals(this.dailyDurationMinutes, timeOffRequestUpdateNotification.dailyDurationMinutes) &&
        Objects.equals(this.notes, timeOffRequestUpdateNotification.notes) &&
        Objects.equals(this.reviewedDate, timeOffRequestUpdateNotification.reviewedDate) &&
        Objects.equals(this.reviewedBy, timeOffRequestUpdateNotification.reviewedBy) &&
        Objects.equals(this.submittedDate, timeOffRequestUpdateNotification.submittedDate) &&
        Objects.equals(this.submittedBy, timeOffRequestUpdateNotification.submittedBy) &&
        Objects.equals(this.modifiedDate, timeOffRequestUpdateNotification.modifiedDate) &&
        Objects.equals(this.modifiedBy, timeOffRequestUpdateNotification.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, isFullDayRequest, markedAsRead, activityCodeId, status, partialDayStartDateTimes, fullDayManagementUnitDates, dailyDurationMinutes, notes, reviewedDate, reviewedBy, submittedDate, submittedBy, modifiedDate, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestUpdateNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isFullDayRequest: ").append(toIndentedString(isFullDayRequest)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
    sb.append("    dailyDurationMinutes: ").append(toIndentedString(dailyDurationMinutes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

