package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmTimeOffRequestUpdateMuTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate
 */

public class WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate  implements Serializable {
  
  private String id = null;
  private String muId = null;
  private WfmTimeOffRequestUpdateMuTopicUserReference user = null;
  private Boolean isFullDayRequest = null;
  private Boolean markedAsRead = null;
  private String activityCodeId = null;
  private Boolean paid = null;

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
   * Gets or Sets status
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

  private static class SubstatusEnumDeserializer extends StdDeserializer<SubstatusEnum> {
    public SubstatusEnumDeserializer() {
      super(SubstatusEnumDeserializer.class);
    }

    @Override
    public SubstatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubstatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets substatus
   */
 @JsonDeserialize(using = SubstatusEnumDeserializer.class)
  public enum SubstatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADVANCETIMEELAPSED("AdvanceTimeElapsed"),
    AUTOAPPROVED("AutoApproved"),
    BLOCKEDDATE("BlockedDate"),
    INSUFFICIENTBALANCE("InsufficientBalance"),
    INVALIDDAILYDURATION("InvalidDailyDuration"),
    MANUALAPPROVAL("ManualApproval"),
    OUTSIDESHIFT("OutsideShift"),
    OVERLAPSRESTRICTEDACTIVITYCODE("OverlapsRestrictedActivityCode"),
    REMOVEDFROMWAITLIST("RemovedFromWaitlist"),
    REVIEWDATE("ReviewDate"),
    WAITLISTED("Waitlisted");

    private String value;

    SubstatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubstatusEnum fromString(String key) {
      if (key == null) return null;

      for (SubstatusEnum value : SubstatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubstatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubstatusEnum substatus = null;
  private List<String> partialDayStartDateTimes = null;
  private List<String> fullDayManagementUnitDates = null;
  private List<Long> fullDayEarliestStartOffsetMinutes = null;
  private List<Long> fullDayLatestEndOffsetMinutes = null;
  private Long dailyDurationMinutes = null;
  private List<Long> durationMinutes = null;
  private List<Long> payableMinutes = null;
  private String notes = null;
  private String reviewedDate = null;
  private String reviewedBy = null;
  private String submittedDate = null;
  private String submittedBy = null;
  private String modifiedDate = null;
  private String modifiedBy = null;

  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      partialDayStartDateTimes = new ArrayList<String>();
      fullDayManagementUnitDates = new ArrayList<String>();
      fullDayEarliestStartOffsetMinutes = new ArrayList<Long>();
      fullDayLatestEndOffsetMinutes = new ArrayList<Long>();
      durationMinutes = new ArrayList<Long>();
      payableMinutes = new ArrayList<Long>();
    }
  }

  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      partialDayStartDateTimes = new ArrayList<String>();
      fullDayManagementUnitDates = new ArrayList<String>();
      fullDayEarliestStartOffsetMinutes = new ArrayList<Long>();
      fullDayLatestEndOffsetMinutes = new ArrayList<Long>();
      durationMinutes = new ArrayList<Long>();
      payableMinutes = new ArrayList<Long>();
    }
  }

  
  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate id(String id) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate muId(String muId) {
    this.muId = muId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("muId")
  public String getMuId() {
    return muId;
  }
  public void setMuId(String muId) {
    this.muId = muId;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate user(WfmTimeOffRequestUpdateMuTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmTimeOffRequestUpdateMuTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmTimeOffRequestUpdateMuTopicUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate isFullDayRequest(Boolean isFullDayRequest) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate markedAsRead(Boolean markedAsRead) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate activityCodeId(String activityCodeId) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate paid(Boolean paid) {
    this.paid = paid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate status(StatusEnum status) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate substatus(SubstatusEnum substatus) {
    this.substatus = substatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("substatus")
  public SubstatusEnum getSubstatus() {
    return substatus;
  }
  public void setSubstatus(SubstatusEnum substatus) {
    this.substatus = substatus;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate partialDayStartDateTimes(List<String> partialDayStartDateTimes) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate fullDayEarliestStartOffsetMinutes(List<Long> fullDayEarliestStartOffsetMinutes) {
    this.fullDayEarliestStartOffsetMinutes = fullDayEarliestStartOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDayEarliestStartOffsetMinutes")
  public List<Long> getFullDayEarliestStartOffsetMinutes() {
    return fullDayEarliestStartOffsetMinutes;
  }
  public void setFullDayEarliestStartOffsetMinutes(List<Long> fullDayEarliestStartOffsetMinutes) {
    this.fullDayEarliestStartOffsetMinutes = fullDayEarliestStartOffsetMinutes;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate fullDayLatestEndOffsetMinutes(List<Long> fullDayLatestEndOffsetMinutes) {
    this.fullDayLatestEndOffsetMinutes = fullDayLatestEndOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDayLatestEndOffsetMinutes")
  public List<Long> getFullDayLatestEndOffsetMinutes() {
    return fullDayLatestEndOffsetMinutes;
  }
  public void setFullDayLatestEndOffsetMinutes(List<Long> fullDayLatestEndOffsetMinutes) {
    this.fullDayLatestEndOffsetMinutes = fullDayLatestEndOffsetMinutes;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate dailyDurationMinutes(Long dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dailyDurationMinutes")
  public Long getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Long dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate durationMinutes(List<Long> durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMinutes")
  public List<Long> getDurationMinutes() {
    return durationMinutes;
  }
  public void setDurationMinutes(List<Long> durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate payableMinutes(List<Long> payableMinutes) {
    this.payableMinutes = payableMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("payableMinutes")
  public List<Long> getPayableMinutes() {
    return payableMinutes;
  }
  public void setPayableMinutes(List<Long> payableMinutes) {
    this.payableMinutes = payableMinutes;
  }


  /**
   **/
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate notes(String notes) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate reviewedDate(String reviewedDate) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate reviewedBy(String reviewedBy) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate submittedDate(String submittedDate) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate submittedBy(String submittedBy) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate modifiedDate(String modifiedDate) {
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
  public WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate modifiedBy(String modifiedBy) {
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
    WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate = (WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate) o;

    return Objects.equals(this.id, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.id) &&
            Objects.equals(this.muId, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.muId) &&
            Objects.equals(this.user, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.user) &&
            Objects.equals(this.isFullDayRequest, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.isFullDayRequest) &&
            Objects.equals(this.markedAsRead, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.markedAsRead) &&
            Objects.equals(this.activityCodeId, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.activityCodeId) &&
            Objects.equals(this.paid, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.paid) &&
            Objects.equals(this.status, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.status) &&
            Objects.equals(this.substatus, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.substatus) &&
            Objects.equals(this.partialDayStartDateTimes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.partialDayStartDateTimes) &&
            Objects.equals(this.fullDayManagementUnitDates, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.fullDayManagementUnitDates) &&
            Objects.equals(this.fullDayEarliestStartOffsetMinutes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.fullDayEarliestStartOffsetMinutes) &&
            Objects.equals(this.fullDayLatestEndOffsetMinutes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.fullDayLatestEndOffsetMinutes) &&
            Objects.equals(this.dailyDurationMinutes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.dailyDurationMinutes) &&
            Objects.equals(this.durationMinutes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.durationMinutes) &&
            Objects.equals(this.payableMinutes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.payableMinutes) &&
            Objects.equals(this.notes, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.notes) &&
            Objects.equals(this.reviewedDate, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.reviewedDate) &&
            Objects.equals(this.reviewedBy, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.reviewedBy) &&
            Objects.equals(this.submittedDate, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.submittedDate) &&
            Objects.equals(this.submittedBy, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.submittedBy) &&
            Objects.equals(this.modifiedDate, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.modifiedDate) &&
            Objects.equals(this.modifiedBy, wfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, muId, user, isFullDayRequest, markedAsRead, activityCodeId, paid, status, substatus, partialDayStartDateTimes, fullDayManagementUnitDates, fullDayEarliestStartOffsetMinutes, fullDayLatestEndOffsetMinutes, dailyDurationMinutes, durationMinutes, payableMinutes, notes, reviewedDate, reviewedBy, submittedDate, submittedBy, modifiedDate, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmTimeOffRequestUpdateMuTopicTimeOffRequestUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    muId: ").append(toIndentedString(muId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isFullDayRequest: ").append(toIndentedString(isFullDayRequest)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
    sb.append("    fullDayEarliestStartOffsetMinutes: ").append(toIndentedString(fullDayEarliestStartOffsetMinutes)).append("\n");
    sb.append("    fullDayLatestEndOffsetMinutes: ").append(toIndentedString(fullDayLatestEndOffsetMinutes)).append("\n");
    sb.append("    dailyDurationMinutes: ").append(toIndentedString(dailyDurationMinutes)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    payableMinutes: ").append(toIndentedString(payableMinutes)).append("\n");
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

