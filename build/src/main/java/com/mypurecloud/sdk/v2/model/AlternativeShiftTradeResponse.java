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
import com.mypurecloud.sdk.v2.model.AlternativeShiftAgentScheduledShift;
import com.mypurecloud.sdk.v2.model.AlternativeShiftScheduleLookup;
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AlternativeShiftTradeResponse
 */

public class AlternativeShiftTradeResponse  implements Serializable {
  
  private String id = null;
  private String shiftOfferJobId = null;
  private List<AlternativeShiftAgentScheduledShift> existingShifts = null;
  private List<AlternativeShiftAgentScheduledShift> offeredShifts = null;
  private AlternativeShiftScheduleLookup schedule = null;
  private ManagementUnitReference managementUnit = null;
  private UserReference user = null;
  private LocalDate weekDate = null;
  private Date expirationDate = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of this alternative shift trade
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CANCELED("Canceled"),
    DENIED("Denied"),
    EXPIRED("Expired"),
    SUBMITTED("Submitted"),
    APPROVED("Approved");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  private static class ProcessingStatusEnumDeserializer extends StdDeserializer<ProcessingStatusEnum> {
    public ProcessingStatusEnumDeserializer() {
      super(ProcessingStatusEnumDeserializer.class);
    }

    @Override
    public ProcessingStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ProcessingStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The processing status of this alternative shift trade
   */
 @JsonDeserialize(using = ProcessingStatusEnumDeserializer.class)
  public enum ProcessingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ERROR("Error"),
    WAITINGFORSCHEDULEUPDATE("WaitingForScheduleUpdate"),
    SCHEDULEUPDATING("ScheduleUpdating"),
    SCHEDULEUPDATED("ScheduleUpdated"),
    WAITINGFORREVIEW("WaitingForReview"),
    REVIEWING("Reviewing");

    private String value;

    ProcessingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ProcessingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ProcessingStatusEnum value : ProcessingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ProcessingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ProcessingStatusEnum processingStatus = null;
  private Date systemDateReviewed = null;
  private Date adminDateReviewed = null;
  private UserReference adminReviewedBy = null;

  private static class ViolationsEnumDeserializer extends StdDeserializer<ViolationsEnum> {
    public ViolationsEnumDeserializer() {
      super(ViolationsEnumDeserializer.class);
    }

    @Override
    public ViolationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ViolationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets violations
   */
 @JsonDeserialize(using = ViolationsEnumDeserializer.class)
  public enum ViolationsEnum {
    SERVICEGOALSNOTMET("ServiceGoalsNotMet");

    private String value;

    ViolationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ViolationsEnum fromString(String key) {
      if (key == null) return null;

      for (ViolationsEnum value : ViolationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ViolationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ViolationsEnum> violations = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  public AlternativeShiftTradeResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      existingShifts = new ArrayList<AlternativeShiftAgentScheduledShift>();
      offeredShifts = new ArrayList<AlternativeShiftAgentScheduledShift>();
      violations = new ArrayList<ViolationsEnum>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The job ID of the alternative shift offer listing, from which the trade was chosen
   **/
  public AlternativeShiftTradeResponse shiftOfferJobId(String shiftOfferJobId) {
    this.shiftOfferJobId = shiftOfferJobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The job ID of the alternative shift offer listing, from which the trade was chosen")
  @JsonProperty("shiftOfferJobId")
  public String getShiftOfferJobId() {
    return shiftOfferJobId;
  }
  public void setShiftOfferJobId(String shiftOfferJobId) {
    this.shiftOfferJobId = shiftOfferJobId;
  }


  /**
   * The existing shifts from the offer, may be empty
   **/
  public AlternativeShiftTradeResponse existingShifts(List<AlternativeShiftAgentScheduledShift> existingShifts) {
    this.existingShifts = existingShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The existing shifts from the offer, may be empty")
  @JsonProperty("existingShifts")
  public List<AlternativeShiftAgentScheduledShift> getExistingShifts() {
    return existingShifts;
  }
  public void setExistingShifts(List<AlternativeShiftAgentScheduledShift> existingShifts) {
    this.existingShifts = existingShifts;
  }


  /**
   * The offered shifts from the offer, may be empty
   **/
  public AlternativeShiftTradeResponse offeredShifts(List<AlternativeShiftAgentScheduledShift> offeredShifts) {
    this.offeredShifts = offeredShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The offered shifts from the offer, may be empty")
  @JsonProperty("offeredShifts")
  public List<AlternativeShiftAgentScheduledShift> getOfferedShifts() {
    return offeredShifts;
  }
  public void setOfferedShifts(List<AlternativeShiftAgentScheduledShift> offeredShifts) {
    this.offeredShifts = offeredShifts;
  }


  /**
   * The existing schedule information associated with the trade
   **/
  public AlternativeShiftTradeResponse schedule(AlternativeShiftScheduleLookup schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The existing schedule information associated with the trade")
  @JsonProperty("schedule")
  public AlternativeShiftScheduleLookup getSchedule() {
    return schedule;
  }
  public void setSchedule(AlternativeShiftScheduleLookup schedule) {
    this.schedule = schedule;
  }


  /**
   * The management unit of this alternative shift trade request
   **/
  public AlternativeShiftTradeResponse managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit of this alternative shift trade request")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The user who submitted the trade request
   **/
  public AlternativeShiftTradeResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who submitted the trade request")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The start week date of the associated schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AlternativeShiftTradeResponse weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start week date of the associated schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * The date when the trade will expire in ISO-8601 format. The trade cannot be approved after expiration
   **/
  public AlternativeShiftTradeResponse expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the trade will expire in ISO-8601 format. The trade cannot be approved after expiration")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * The state of this alternative shift trade
   **/
  public AlternativeShiftTradeResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of this alternative shift trade")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The processing status of this alternative shift trade
   **/
  public AlternativeShiftTradeResponse processingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The processing status of this alternative shift trade")
  @JsonProperty("processingStatus")
  public ProcessingStatusEnum getProcessingStatus() {
    return processingStatus;
  }
  public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
  }


  /**
   * The timestamp of when the trade request was reviewed by the system in ISO-8601 format
   **/
  public AlternativeShiftTradeResponse systemDateReviewed(Date systemDateReviewed) {
    this.systemDateReviewed = systemDateReviewed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the trade request was reviewed by the system in ISO-8601 format")
  @JsonProperty("systemDateReviewed")
  public Date getSystemDateReviewed() {
    return systemDateReviewed;
  }
  public void setSystemDateReviewed(Date systemDateReviewed) {
    this.systemDateReviewed = systemDateReviewed;
  }


  /**
   * The timestamp of when the trade request was reviewed by an admin in ISO-8601 format
   **/
  public AlternativeShiftTradeResponse adminDateReviewed(Date adminDateReviewed) {
    this.adminDateReviewed = adminDateReviewed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the trade request was reviewed by an admin in ISO-8601 format")
  @JsonProperty("adminDateReviewed")
  public Date getAdminDateReviewed() {
    return adminDateReviewed;
  }
  public void setAdminDateReviewed(Date adminDateReviewed) {
    this.adminDateReviewed = adminDateReviewed;
  }


  /**
   * The admin who reviewed this alternative shift trade after system denial
   **/
  public AlternativeShiftTradeResponse adminReviewedBy(UserReference adminReviewedBy) {
    this.adminReviewedBy = adminReviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The admin who reviewed this alternative shift trade after system denial")
  @JsonProperty("adminReviewedBy")
  public UserReference getAdminReviewedBy() {
    return adminReviewedBy;
  }
  public void setAdminReviewedBy(UserReference adminReviewedBy) {
    this.adminReviewedBy = adminReviewedBy;
  }


  /**
   * A list of trade match violations
   **/
  public AlternativeShiftTradeResponse violations(List<ViolationsEnum> violations) {
    this.violations = violations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of trade match violations")
  @JsonProperty("violations")
  public List<ViolationsEnum> getViolations() {
    return violations;
  }
  public void setViolations(List<ViolationsEnum> violations) {
    this.violations = violations;
  }


  /**
   * Version metadata for this alternative shift trade
   **/
  public AlternativeShiftTradeResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this alternative shift trade")
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
    AlternativeShiftTradeResponse alternativeShiftTradeResponse = (AlternativeShiftTradeResponse) o;

    return Objects.equals(this.id, alternativeShiftTradeResponse.id) &&
            Objects.equals(this.shiftOfferJobId, alternativeShiftTradeResponse.shiftOfferJobId) &&
            Objects.equals(this.existingShifts, alternativeShiftTradeResponse.existingShifts) &&
            Objects.equals(this.offeredShifts, alternativeShiftTradeResponse.offeredShifts) &&
            Objects.equals(this.schedule, alternativeShiftTradeResponse.schedule) &&
            Objects.equals(this.managementUnit, alternativeShiftTradeResponse.managementUnit) &&
            Objects.equals(this.user, alternativeShiftTradeResponse.user) &&
            Objects.equals(this.weekDate, alternativeShiftTradeResponse.weekDate) &&
            Objects.equals(this.expirationDate, alternativeShiftTradeResponse.expirationDate) &&
            Objects.equals(this.state, alternativeShiftTradeResponse.state) &&
            Objects.equals(this.processingStatus, alternativeShiftTradeResponse.processingStatus) &&
            Objects.equals(this.systemDateReviewed, alternativeShiftTradeResponse.systemDateReviewed) &&
            Objects.equals(this.adminDateReviewed, alternativeShiftTradeResponse.adminDateReviewed) &&
            Objects.equals(this.adminReviewedBy, alternativeShiftTradeResponse.adminReviewedBy) &&
            Objects.equals(this.violations, alternativeShiftTradeResponse.violations) &&
            Objects.equals(this.metadata, alternativeShiftTradeResponse.metadata) &&
            Objects.equals(this.selfUri, alternativeShiftTradeResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shiftOfferJobId, existingShifts, offeredShifts, schedule, managementUnit, user, weekDate, expirationDate, state, processingStatus, systemDateReviewed, adminDateReviewed, adminReviewedBy, violations, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftTradeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shiftOfferJobId: ").append(toIndentedString(shiftOfferJobId)).append("\n");
    sb.append("    existingShifts: ").append(toIndentedString(existingShifts)).append("\n");
    sb.append("    offeredShifts: ").append(toIndentedString(offeredShifts)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    systemDateReviewed: ").append(toIndentedString(systemDateReviewed)).append("\n");
    sb.append("    adminDateReviewed: ").append(toIndentedString(adminDateReviewed)).append("\n");
    sb.append("    adminReviewedBy: ").append(toIndentedString(adminReviewedBy)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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

