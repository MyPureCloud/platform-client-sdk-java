package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffRequest
 */

public class TimeOffRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User user = null;
  private Boolean isFullDayRequest = null;
  private Boolean markedAsRead = null;
  private String activityCodeId = null;

  /**
   * The administrative status of this TimeOffRequest
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
  private List<Date> partialDayStartDateTimes = new ArrayList<Date>();
  private Integer dailyDurationMinutes = null;
  private String notes = null;
  private User submittedBy = null;
  private Date submittedDate = null;
  private User reviewedBy = null;
  private Date reviewedDate = null;
  private User modifiedBy = null;
  private Date modifiedDate = null;
  private String selfUri = null;
  private List<String> fullDayManagementUnitDates = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public TimeOffRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The user associated with this TimeOffRequest
   **/
  public TimeOffRequest user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user associated with this TimeOffRequest")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * Whether this is a full day request (false means partial day)
   **/
  public TimeOffRequest isFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this is a full day request (false means partial day)")
  @JsonProperty("isFullDayRequest")
  public Boolean getIsFullDayRequest() {
    return isFullDayRequest;
  }
  public void setIsFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
  }

  
  /**
   * Whether this request has been marked as read by the agent
   **/
  public TimeOffRequest markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this request has been marked as read by the agent")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  
  /**
   * The ID of the activity code associated with this TimeOffRequest
   **/
  public TimeOffRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code associated with this TimeOffRequest")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * The administrative status of this TimeOffRequest
   **/
  public TimeOffRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The administrative status of this TimeOffRequest")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The start date-times for partial day requests.  Required if isFullDayRequest == false
   **/
  public TimeOffRequest partialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date-times for partial day requests.  Required if isFullDayRequest == false")
  @JsonProperty("partialDayStartDateTimes")
  public List<Date> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }

  
  /**
   * The daily duration of this TimeOffRequest in minutes
   **/
  public TimeOffRequest dailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The daily duration of this TimeOffRequest in minutes")
  @JsonProperty("dailyDurationMinutes")
  public Integer getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }

  
  /**
   * The notes as input by the one who entered the TimeOffRequest
   **/
  public TimeOffRequest notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The notes as input by the one who entered the TimeOffRequest")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * The user who submitted this TimeOffRequest
   **/
  public TimeOffRequest submittedBy(User submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who submitted this TimeOffRequest")
  @JsonProperty("submittedBy")
  public User getSubmittedBy() {
    return submittedBy;
  }
  public void setSubmittedBy(User submittedBy) {
    this.submittedBy = submittedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("submittedDate")
  public Date getSubmittedDate() {
    return submittedDate;
  }

  
  /**
   * The user who reviewed this TimeOffRequest
   **/
  public TimeOffRequest reviewedBy(User reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who reviewed this TimeOffRequest")
  @JsonProperty("reviewedBy")
  public User getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(User reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }

  
  /**
   * The user who last modified this TimeOffRequest
   **/
  public TimeOffRequest modifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who last modified this TimeOffRequest")
  @JsonProperty("modifiedBy")
  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The timestamp when this request was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * ISO-8601 date only with no timezones.  Should be interpreted in the Management Unit's configured time zone.  Required if isFullDayRequest == true
   **/
  public TimeOffRequest fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO-8601 date only with no timezones.  Should be interpreted in the Management Unit's configured time zone.  Required if isFullDayRequest == true")
  @JsonProperty("fullDayManagementUnitDates")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequest timeOffRequest = (TimeOffRequest) o;
    return Objects.equals(this.id, timeOffRequest.id) &&
        Objects.equals(this.name, timeOffRequest.name) &&
        Objects.equals(this.user, timeOffRequest.user) &&
        Objects.equals(this.isFullDayRequest, timeOffRequest.isFullDayRequest) &&
        Objects.equals(this.markedAsRead, timeOffRequest.markedAsRead) &&
        Objects.equals(this.activityCodeId, timeOffRequest.activityCodeId) &&
        Objects.equals(this.status, timeOffRequest.status) &&
        Objects.equals(this.partialDayStartDateTimes, timeOffRequest.partialDayStartDateTimes) &&
        Objects.equals(this.dailyDurationMinutes, timeOffRequest.dailyDurationMinutes) &&
        Objects.equals(this.notes, timeOffRequest.notes) &&
        Objects.equals(this.submittedBy, timeOffRequest.submittedBy) &&
        Objects.equals(this.submittedDate, timeOffRequest.submittedDate) &&
        Objects.equals(this.reviewedBy, timeOffRequest.reviewedBy) &&
        Objects.equals(this.reviewedDate, timeOffRequest.reviewedDate) &&
        Objects.equals(this.modifiedBy, timeOffRequest.modifiedBy) &&
        Objects.equals(this.modifiedDate, timeOffRequest.modifiedDate) &&
        Objects.equals(this.selfUri, timeOffRequest.selfUri) &&
        Objects.equals(this.fullDayManagementUnitDates, timeOffRequest.fullDayManagementUnitDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, isFullDayRequest, markedAsRead, activityCodeId, status, partialDayStartDateTimes, dailyDurationMinutes, notes, submittedBy, submittedDate, reviewedBy, reviewedDate, modifiedBy, modifiedDate, selfUri, fullDayManagementUnitDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isFullDayRequest: ").append(toIndentedString(isFullDayRequest)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    dailyDurationMinutes: ").append(toIndentedString(dailyDurationMinutes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
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

