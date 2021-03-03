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
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import com.mypurecloud.sdk.v2.model.ReschedulingOptionsRunResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * BuScheduleRun
 */

public class BuScheduleRun  implements Serializable {
  
  private String id = null;
  private String schedulerRunId = null;
  private Boolean intradayRescheduling = null;

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
   * The state of the generation run
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("None"),
    QUEUED("Queued"),
    SCHEDULING("Scheduling"),
    CANCELED("Canceled"),
    FAILED("Failed"),
    COMPLETE("Complete");

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
  private Integer weekCount = null;
  private Double percentComplete = null;
  private LocalDate targetWeek = null;
  private BuScheduleReference schedule = null;
  private String scheduleDescription = null;
  private Date schedulingStartTime = null;
  private UserReference schedulingStartedBy = null;
  private UserReference schedulingCanceledBy = null;
  private Date schedulingCompletedTime = null;
  private Integer messageCount = null;
  private ReschedulingOptionsRunResponse reschedulingOptions = null;
  private Date reschedulingResultExpiration = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The scheduler run ID.  Reference this value for support
   **/
  public BuScheduleRun schedulerRunId(String schedulerRunId) {
    this.schedulerRunId = schedulerRunId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The scheduler run ID.  Reference this value for support")
  @JsonProperty("schedulerRunId")
  public String getSchedulerRunId() {
    return schedulerRunId;
  }
  public void setSchedulerRunId(String schedulerRunId) {
    this.schedulerRunId = schedulerRunId;
  }

  
  /**
   * Whether this is an intraday rescheduling run
   **/
  public BuScheduleRun intradayRescheduling(Boolean intradayRescheduling) {
    this.intradayRescheduling = intradayRescheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is an intraday rescheduling run")
  @JsonProperty("intradayRescheduling")
  public Boolean getIntradayRescheduling() {
    return intradayRescheduling;
  }
  public void setIntradayRescheduling(Boolean intradayRescheduling) {
    this.intradayRescheduling = intradayRescheduling;
  }

  
  /**
   * The state of the generation run
   **/
  public BuScheduleRun state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the generation run")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The number of weeks spanned by the schedule
   **/
  public BuScheduleRun weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks spanned by the schedule")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   * Percent completion of the schedule run
   **/
  public BuScheduleRun percentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent completion of the schedule run")
  @JsonProperty("percentComplete")
  public Double getPercentComplete() {
    return percentComplete;
  }
  public void setPercentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
  }

  
  /**
   * The start date of the target week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuScheduleRun targetWeek(LocalDate targetWeek) {
    this.targetWeek = targetWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date of the target week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("targetWeek")
  public LocalDate getTargetWeek() {
    return targetWeek;
  }
  public void setTargetWeek(LocalDate targetWeek) {
    this.targetWeek = targetWeek;
  }

  
  /**
   * The generated schedule.  Null unless the schedule run is complete
   **/
  public BuScheduleRun schedule(BuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generated schedule.  Null unless the schedule run is complete")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReference schedule) {
    this.schedule = schedule;
  }

  
  /**
   * The description of the generated schedule
   **/
  public BuScheduleRun scheduleDescription(String scheduleDescription) {
    this.scheduleDescription = scheduleDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the generated schedule")
  @JsonProperty("scheduleDescription")
  public String getScheduleDescription() {
    return scheduleDescription;
  }
  public void setScheduleDescription(String scheduleDescription) {
    this.scheduleDescription = scheduleDescription;
  }

  
  /**
   * When the schedule generation run started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuScheduleRun schedulingStartTime(Date schedulingStartTime) {
    this.schedulingStartTime = schedulingStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the schedule generation run started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("schedulingStartTime")
  public Date getSchedulingStartTime() {
    return schedulingStartTime;
  }
  public void setSchedulingStartTime(Date schedulingStartTime) {
    this.schedulingStartTime = schedulingStartTime;
  }

  
  /**
   * The user who started the scheduling run
   **/
  public BuScheduleRun schedulingStartedBy(UserReference schedulingStartedBy) {
    this.schedulingStartedBy = schedulingStartedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who started the scheduling run")
  @JsonProperty("schedulingStartedBy")
  public UserReference getSchedulingStartedBy() {
    return schedulingStartedBy;
  }
  public void setSchedulingStartedBy(UserReference schedulingStartedBy) {
    this.schedulingStartedBy = schedulingStartedBy;
  }

  
  /**
   * The user who canceled the scheduling run, if applicable
   **/
  public BuScheduleRun schedulingCanceledBy(UserReference schedulingCanceledBy) {
    this.schedulingCanceledBy = schedulingCanceledBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who canceled the scheduling run, if applicable")
  @JsonProperty("schedulingCanceledBy")
  public UserReference getSchedulingCanceledBy() {
    return schedulingCanceledBy;
  }
  public void setSchedulingCanceledBy(UserReference schedulingCanceledBy) {
    this.schedulingCanceledBy = schedulingCanceledBy;
  }

  
  /**
   * When the scheduling run was completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuScheduleRun schedulingCompletedTime(Date schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the scheduling run was completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("schedulingCompletedTime")
  public Date getSchedulingCompletedTime() {
    return schedulingCompletedTime;
  }
  public void setSchedulingCompletedTime(Date schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
  }

  
  /**
   * The number of schedule generation messages for this schedule generation run
   **/
  public BuScheduleRun messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of schedule generation messages for this schedule generation run")
  @JsonProperty("messageCount")
  public Integer getMessageCount() {
    return messageCount;
  }
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  
  /**
   * Rescheduling options for this run.  Null unless intradayRescheduling is true
   **/
  public BuScheduleRun reschedulingOptions(ReschedulingOptionsRunResponse reschedulingOptions) {
    this.reschedulingOptions = reschedulingOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rescheduling options for this run.  Null unless intradayRescheduling is true")
  @JsonProperty("reschedulingOptions")
  public ReschedulingOptionsRunResponse getReschedulingOptions() {
    return reschedulingOptions;
  }
  public void setReschedulingOptions(ReschedulingOptionsRunResponse reschedulingOptions) {
    this.reschedulingOptions = reschedulingOptions;
  }

  
  /**
   * When the reschedule result will expire.  Null unless intradayRescheduling is true. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuScheduleRun reschedulingResultExpiration(Date reschedulingResultExpiration) {
    this.reschedulingResultExpiration = reschedulingResultExpiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the reschedule result will expire.  Null unless intradayRescheduling is true. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("reschedulingResultExpiration")
  public Date getReschedulingResultExpiration() {
    return reschedulingResultExpiration;
  }
  public void setReschedulingResultExpiration(Date reschedulingResultExpiration) {
    this.reschedulingResultExpiration = reschedulingResultExpiration;
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
    BuScheduleRun buScheduleRun = (BuScheduleRun) o;
    return Objects.equals(this.id, buScheduleRun.id) &&
        Objects.equals(this.schedulerRunId, buScheduleRun.schedulerRunId) &&
        Objects.equals(this.intradayRescheduling, buScheduleRun.intradayRescheduling) &&
        Objects.equals(this.state, buScheduleRun.state) &&
        Objects.equals(this.weekCount, buScheduleRun.weekCount) &&
        Objects.equals(this.percentComplete, buScheduleRun.percentComplete) &&
        Objects.equals(this.targetWeek, buScheduleRun.targetWeek) &&
        Objects.equals(this.schedule, buScheduleRun.schedule) &&
        Objects.equals(this.scheduleDescription, buScheduleRun.scheduleDescription) &&
        Objects.equals(this.schedulingStartTime, buScheduleRun.schedulingStartTime) &&
        Objects.equals(this.schedulingStartedBy, buScheduleRun.schedulingStartedBy) &&
        Objects.equals(this.schedulingCanceledBy, buScheduleRun.schedulingCanceledBy) &&
        Objects.equals(this.schedulingCompletedTime, buScheduleRun.schedulingCompletedTime) &&
        Objects.equals(this.messageCount, buScheduleRun.messageCount) &&
        Objects.equals(this.reschedulingOptions, buScheduleRun.reschedulingOptions) &&
        Objects.equals(this.reschedulingResultExpiration, buScheduleRun.reschedulingResultExpiration) &&
        Objects.equals(this.selfUri, buScheduleRun.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schedulerRunId, intradayRescheduling, state, weekCount, percentComplete, targetWeek, schedule, scheduleDescription, schedulingStartTime, schedulingStartedBy, schedulingCanceledBy, schedulingCompletedTime, messageCount, reschedulingOptions, reschedulingResultExpiration, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuScheduleRun {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schedulerRunId: ").append(toIndentedString(schedulerRunId)).append("\n");
    sb.append("    intradayRescheduling: ").append(toIndentedString(intradayRescheduling)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    targetWeek: ").append(toIndentedString(targetWeek)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduleDescription: ").append(toIndentedString(scheduleDescription)).append("\n");
    sb.append("    schedulingStartTime: ").append(toIndentedString(schedulingStartTime)).append("\n");
    sb.append("    schedulingStartedBy: ").append(toIndentedString(schedulingStartedBy)).append("\n");
    sb.append("    schedulingCanceledBy: ").append(toIndentedString(schedulingCanceledBy)).append("\n");
    sb.append("    schedulingCompletedTime: ").append(toIndentedString(schedulingCompletedTime)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    reschedulingOptions: ").append(toIndentedString(reschedulingOptions)).append("\n");
    sb.append("    reschedulingResultExpiration: ").append(toIndentedString(reschedulingResultExpiration)).append("\n");
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

