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
import com.mypurecloud.sdk.v2.model.BuScheduleReferenceForMuRoute;
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
 * ShiftTradeResponse
 */

public class ShiftTradeResponse  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;
  private BuScheduleReferenceForMuRoute schedule = null;

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
   * The state of this shift trade
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNMATCHED("Unmatched"),
    MATCHED("Matched"),
    APPROVED("Approved"),
    DENIED("Denied"),
    EXPIRED("Expired"),
    CANCELED("Canceled");

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
  private UserReference initiatingUser = null;
  private String initiatingShiftId = null;
  private Date initiatingShiftStart = null;
  private Date initiatingShiftEnd = null;
  private UserReference receivingUser = null;
  private String receivingShiftId = null;
  private Date receivingShiftStart = null;
  private Date receivingShiftEnd = null;
  private Date expiration = null;
  private Boolean oneSided = null;
  private List<String> acceptableIntervals = new ArrayList<String>();
  private UserReference reviewedBy = null;
  private Date reviewedDate = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The ID of this shift trade
   **/
  public ShiftTradeResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of this shift trade")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The start week date of the associated schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ShiftTradeResponse weekDate(LocalDate weekDate) {
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
   * A reference to the associated schedule
   **/
  public ShiftTradeResponse schedule(BuScheduleReferenceForMuRoute schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the associated schedule")
  @JsonProperty("schedule")
  public BuScheduleReferenceForMuRoute getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReferenceForMuRoute schedule) {
    this.schedule = schedule;
  }

  
  /**
   * The state of this shift trade
   **/
  public ShiftTradeResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of this shift trade")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The user who initiated this trade
   **/
  public ShiftTradeResponse initiatingUser(UserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who initiated this trade")
  @JsonProperty("initiatingUser")
  public UserReference getInitiatingUser() {
    return initiatingUser;
  }
  public void setInitiatingUser(UserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
  }

  
  /**
   * The ID of the shift offered for trade by the initiating user
   **/
  public ShiftTradeResponse initiatingShiftId(String initiatingShiftId) {
    this.initiatingShiftId = initiatingShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the shift offered for trade by the initiating user")
  @JsonProperty("initiatingShiftId")
  public String getInitiatingShiftId() {
    return initiatingShiftId;
  }
  public void setInitiatingShiftId(String initiatingShiftId) {
    this.initiatingShiftId = initiatingShiftId;
  }

  
  /**
   * The start date/time of the shift being offered for trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeResponse initiatingShiftStart(Date initiatingShiftStart) {
    this.initiatingShiftStart = initiatingShiftStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date/time of the shift being offered for trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("initiatingShiftStart")
  public Date getInitiatingShiftStart() {
    return initiatingShiftStart;
  }
  public void setInitiatingShiftStart(Date initiatingShiftStart) {
    this.initiatingShiftStart = initiatingShiftStart;
  }

  
  /**
   * The end date/time of the shift being offered for trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeResponse initiatingShiftEnd(Date initiatingShiftEnd) {
    this.initiatingShiftEnd = initiatingShiftEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date/time of the shift being offered for trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("initiatingShiftEnd")
  public Date getInitiatingShiftEnd() {
    return initiatingShiftEnd;
  }
  public void setInitiatingShiftEnd(Date initiatingShiftEnd) {
    this.initiatingShiftEnd = initiatingShiftEnd;
  }

  
  /**
   * The user matching the trade, or if the state is not Matched, the user to whom the trade request was sent
   **/
  public ShiftTradeResponse receivingUser(UserReference receivingUser) {
    this.receivingUser = receivingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user matching the trade, or if the state is not Matched, the user to whom the trade request was sent")
  @JsonProperty("receivingUser")
  public UserReference getReceivingUser() {
    return receivingUser;
  }
  public void setReceivingUser(UserReference receivingUser) {
    this.receivingUser = receivingUser;
  }

  
  /**
   * The ID of the shift being exchanged for the initiating shift, null if the receiving user is picking up a shift
   **/
  public ShiftTradeResponse receivingShiftId(String receivingShiftId) {
    this.receivingShiftId = receivingShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the shift being exchanged for the initiating shift, null if the receiving user is picking up a shift")
  @JsonProperty("receivingShiftId")
  public String getReceivingShiftId() {
    return receivingShiftId;
  }
  public void setReceivingShiftId(String receivingShiftId) {
    this.receivingShiftId = receivingShiftId;
  }

  
  /**
   * The start date/time of the receiving shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeResponse receivingShiftStart(Date receivingShiftStart) {
    this.receivingShiftStart = receivingShiftStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date/time of the receiving shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("receivingShiftStart")
  public Date getReceivingShiftStart() {
    return receivingShiftStart;
  }
  public void setReceivingShiftStart(Date receivingShiftStart) {
    this.receivingShiftStart = receivingShiftStart;
  }

  
  /**
   * The end date/time of the receiving shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeResponse receivingShiftEnd(Date receivingShiftEnd) {
    this.receivingShiftEnd = receivingShiftEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date/time of the receiving shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("receivingShiftEnd")
  public Date getReceivingShiftEnd() {
    return receivingShiftEnd;
  }
  public void setReceivingShiftEnd(Date receivingShiftEnd) {
    this.receivingShiftEnd = receivingShiftEnd;
  }

  
  /**
   * When this shift trade offer will expire if not matched or approved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeResponse expiration(Date expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When this shift trade offer will expire if not matched or approved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   * Whether this is a one-sided shift trade (e.g. the initiating user is not asking for a shift in return)
   **/
  public ShiftTradeResponse oneSided(Boolean oneSided) {
    this.oneSided = oneSided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is a one-sided shift trade (e.g. the initiating user is not asking for a shift in return)")
  @JsonProperty("oneSided")
  public Boolean getOneSided() {
    return oneSided;
  }
  public void setOneSided(Boolean oneSided) {
    this.oneSided = oneSided;
  }

  
  /**
   **/
  public ShiftTradeResponse acceptableIntervals(List<String> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptableIntervals")
  public List<String> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<String> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }

  
  /**
   * The user who reviewed this shift trade
   **/
  public ShiftTradeResponse reviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who reviewed this shift trade")
  @JsonProperty("reviewedBy")
  public UserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  
  /**
   * The timestamp when this shift trade was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeResponse reviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this shift trade was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("reviewedDate")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  
  /**
   * Version data for this trade
   **/
  public ShiftTradeResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version data for this trade")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeResponse shiftTradeResponse = (ShiftTradeResponse) o;
    return Objects.equals(this.id, shiftTradeResponse.id) &&
        Objects.equals(this.weekDate, shiftTradeResponse.weekDate) &&
        Objects.equals(this.schedule, shiftTradeResponse.schedule) &&
        Objects.equals(this.state, shiftTradeResponse.state) &&
        Objects.equals(this.initiatingUser, shiftTradeResponse.initiatingUser) &&
        Objects.equals(this.initiatingShiftId, shiftTradeResponse.initiatingShiftId) &&
        Objects.equals(this.initiatingShiftStart, shiftTradeResponse.initiatingShiftStart) &&
        Objects.equals(this.initiatingShiftEnd, shiftTradeResponse.initiatingShiftEnd) &&
        Objects.equals(this.receivingUser, shiftTradeResponse.receivingUser) &&
        Objects.equals(this.receivingShiftId, shiftTradeResponse.receivingShiftId) &&
        Objects.equals(this.receivingShiftStart, shiftTradeResponse.receivingShiftStart) &&
        Objects.equals(this.receivingShiftEnd, shiftTradeResponse.receivingShiftEnd) &&
        Objects.equals(this.expiration, shiftTradeResponse.expiration) &&
        Objects.equals(this.oneSided, shiftTradeResponse.oneSided) &&
        Objects.equals(this.acceptableIntervals, shiftTradeResponse.acceptableIntervals) &&
        Objects.equals(this.reviewedBy, shiftTradeResponse.reviewedBy) &&
        Objects.equals(this.reviewedDate, shiftTradeResponse.reviewedDate) &&
        Objects.equals(this.metadata, shiftTradeResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, schedule, state, initiatingUser, initiatingShiftId, initiatingShiftStart, initiatingShiftEnd, receivingUser, receivingShiftId, receivingShiftStart, receivingShiftEnd, expiration, oneSided, acceptableIntervals, reviewedBy, reviewedDate, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initiatingUser: ").append(toIndentedString(initiatingUser)).append("\n");
    sb.append("    initiatingShiftId: ").append(toIndentedString(initiatingShiftId)).append("\n");
    sb.append("    initiatingShiftStart: ").append(toIndentedString(initiatingShiftStart)).append("\n");
    sb.append("    initiatingShiftEnd: ").append(toIndentedString(initiatingShiftEnd)).append("\n");
    sb.append("    receivingUser: ").append(toIndentedString(receivingUser)).append("\n");
    sb.append("    receivingShiftId: ").append(toIndentedString(receivingShiftId)).append("\n");
    sb.append("    receivingShiftStart: ").append(toIndentedString(receivingShiftStart)).append("\n");
    sb.append("    receivingShiftEnd: ").append(toIndentedString(receivingShiftEnd)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    oneSided: ").append(toIndentedString(oneSided)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

