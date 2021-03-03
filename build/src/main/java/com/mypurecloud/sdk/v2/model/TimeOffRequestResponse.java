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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffRequestResponse
 */

public class TimeOffRequestResponse  implements Serializable {
  
  private String id = null;
  private UserReference user = null;
  private Boolean isFullDayRequest = null;
  private Boolean markedAsRead = null;
  private String activityCodeId = null;

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
  private List<String> fullDayManagementUnitDates = new ArrayList<String>();
  private Integer dailyDurationMinutes = null;
  private String notes = null;
  private UserReference submittedBy = null;
  private Date submittedDate = null;
  private UserReference reviewedBy = null;
  private Date reviewedDate = null;
  private UserReference modifiedBy = null;
  private Date modifiedDate = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The user associated with this time off request
   **/
  public TimeOffRequestResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user associated with this time off request")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * Whether this is a full day request (false means partial day)
   **/
  public TimeOffRequestResponse isFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is a full day request (false means partial day)")
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
  public TimeOffRequestResponse markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this request has been marked as read by the agent")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  
  /**
   * The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category
   **/
  public TimeOffRequestResponse activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * The status of this time off request
   **/
  public TimeOffRequestResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of this time off request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * A set of start date-times in ISO-8601 format for partial day requests.  Will be not empty if isFullDayRequest == false
   **/
  public TimeOffRequestResponse partialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of start date-times in ISO-8601 format for partial day requests.  Will be not empty if isFullDayRequest == false")
  @JsonProperty("partialDayStartDateTimes")
  public List<Date> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }

  
  /**
   * A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.  Will be not empty if isFullDayRequest == true
   **/
  public TimeOffRequestResponse fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.  Will be not empty if isFullDayRequest == true")
  @JsonProperty("fullDayManagementUnitDates")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }

  
  /**
   * The daily duration of this time off request in minutes
   **/
  public TimeOffRequestResponse dailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The daily duration of this time off request in minutes")
  @JsonProperty("dailyDurationMinutes")
  public Integer getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }

  
  /**
   * Notes about the time off request
   **/
  public TimeOffRequestResponse notes(String notes) {
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
   * The user who submitted this time off request
   **/
  public TimeOffRequestResponse submittedBy(UserReference submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who submitted this time off request")
  @JsonProperty("submittedBy")
  public UserReference getSubmittedBy() {
    return submittedBy;
  }
  public void setSubmittedBy(UserReference submittedBy) {
    this.submittedBy = submittedBy;
  }

  
  /**
   * The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TimeOffRequestResponse submittedDate(Date submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("submittedDate")
  public Date getSubmittedDate() {
    return submittedDate;
  }
  public void setSubmittedDate(Date submittedDate) {
    this.submittedDate = submittedDate;
  }

  
  /**
   * The user who reviewed this time off request
   **/
  public TimeOffRequestResponse reviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who reviewed this time off request")
  @JsonProperty("reviewedBy")
  public UserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  
  /**
   * The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TimeOffRequestResponse reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  
  /**
   * The user who last modified this TimeOffRequestResponse
   **/
  public TimeOffRequestResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who last modified this TimeOffRequestResponse")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * The timestamp when this request was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TimeOffRequestResponse modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this request was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * The version metadata of the time off request
   **/
  public TimeOffRequestResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version metadata of the time off request")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestResponse timeOffRequestResponse = (TimeOffRequestResponse) o;
    return Objects.equals(this.id, timeOffRequestResponse.id) &&
        Objects.equals(this.user, timeOffRequestResponse.user) &&
        Objects.equals(this.isFullDayRequest, timeOffRequestResponse.isFullDayRequest) &&
        Objects.equals(this.markedAsRead, timeOffRequestResponse.markedAsRead) &&
        Objects.equals(this.activityCodeId, timeOffRequestResponse.activityCodeId) &&
        Objects.equals(this.status, timeOffRequestResponse.status) &&
        Objects.equals(this.partialDayStartDateTimes, timeOffRequestResponse.partialDayStartDateTimes) &&
        Objects.equals(this.fullDayManagementUnitDates, timeOffRequestResponse.fullDayManagementUnitDates) &&
        Objects.equals(this.dailyDurationMinutes, timeOffRequestResponse.dailyDurationMinutes) &&
        Objects.equals(this.notes, timeOffRequestResponse.notes) &&
        Objects.equals(this.submittedBy, timeOffRequestResponse.submittedBy) &&
        Objects.equals(this.submittedDate, timeOffRequestResponse.submittedDate) &&
        Objects.equals(this.reviewedBy, timeOffRequestResponse.reviewedBy) &&
        Objects.equals(this.reviewedDate, timeOffRequestResponse.reviewedDate) &&
        Objects.equals(this.modifiedBy, timeOffRequestResponse.modifiedBy) &&
        Objects.equals(this.modifiedDate, timeOffRequestResponse.modifiedDate) &&
        Objects.equals(this.metadata, timeOffRequestResponse.metadata) &&
        Objects.equals(this.selfUri, timeOffRequestResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, isFullDayRequest, markedAsRead, activityCodeId, status, partialDayStartDateTimes, fullDayManagementUnitDates, dailyDurationMinutes, notes, submittedBy, submittedDate, reviewedBy, reviewedDate, modifiedBy, modifiedDate, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestResponse {\n");
    
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
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

