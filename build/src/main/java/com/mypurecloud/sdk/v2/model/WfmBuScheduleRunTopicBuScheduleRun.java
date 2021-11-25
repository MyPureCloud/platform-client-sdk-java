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
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicBuScheduleReference;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicSchedulerMessageSeverityCount;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuScheduleRunTopicBuScheduleRun
 */

public class WfmBuScheduleRunTopicBuScheduleRun  implements Serializable {
  
  private String id = null;
  private BigDecimal percentComplete = null;
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
   * Gets or Sets state
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
  private WfmBuScheduleRunTopicBuScheduleReference schedule = null;
  private WfmBuScheduleRunTopicUserReference schedulingCanceledBy = null;
  private String schedulingCompletedTime = null;
  private Integer messageCount = null;
  private List<WfmBuScheduleRunTopicSchedulerMessageSeverityCount> messageSeverityCounts = new ArrayList<WfmBuScheduleRunTopicSchedulerMessageSeverityCount>();

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun id(String id) {
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
  public WfmBuScheduleRunTopicBuScheduleRun percentComplete(BigDecimal percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentComplete")
  public BigDecimal getPercentComplete() {
    return percentComplete;
  }
  public void setPercentComplete(BigDecimal percentComplete) {
    this.percentComplete = percentComplete;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun intradayRescheduling(Boolean intradayRescheduling) {
    this.intradayRescheduling = intradayRescheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intradayRescheduling")
  public Boolean getIntradayRescheduling() {
    return intradayRescheduling;
  }
  public void setIntradayRescheduling(Boolean intradayRescheduling) {
    this.intradayRescheduling = intradayRescheduling;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun schedule(WfmBuScheduleRunTopicBuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedule")
  public WfmBuScheduleRunTopicBuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(WfmBuScheduleRunTopicBuScheduleReference schedule) {
    this.schedule = schedule;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun schedulingCanceledBy(WfmBuScheduleRunTopicUserReference schedulingCanceledBy) {
    this.schedulingCanceledBy = schedulingCanceledBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedulingCanceledBy")
  public WfmBuScheduleRunTopicUserReference getSchedulingCanceledBy() {
    return schedulingCanceledBy;
  }
  public void setSchedulingCanceledBy(WfmBuScheduleRunTopicUserReference schedulingCanceledBy) {
    this.schedulingCanceledBy = schedulingCanceledBy;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun schedulingCompletedTime(String schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedulingCompletedTime")
  public String getSchedulingCompletedTime() {
    return schedulingCompletedTime;
  }
  public void setSchedulingCompletedTime(String schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageCount")
  public Integer getMessageCount() {
    return messageCount;
  }
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun messageSeverityCounts(List<WfmBuScheduleRunTopicSchedulerMessageSeverityCount> messageSeverityCounts) {
    this.messageSeverityCounts = messageSeverityCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageSeverityCounts")
  public List<WfmBuScheduleRunTopicSchedulerMessageSeverityCount> getMessageSeverityCounts() {
    return messageSeverityCounts;
  }
  public void setMessageSeverityCounts(List<WfmBuScheduleRunTopicSchedulerMessageSeverityCount> messageSeverityCounts) {
    this.messageSeverityCounts = messageSeverityCounts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleRunTopicBuScheduleRun wfmBuScheduleRunTopicBuScheduleRun = (WfmBuScheduleRunTopicBuScheduleRun) o;
    return Objects.equals(this.id, wfmBuScheduleRunTopicBuScheduleRun.id) &&
        Objects.equals(this.percentComplete, wfmBuScheduleRunTopicBuScheduleRun.percentComplete) &&
        Objects.equals(this.intradayRescheduling, wfmBuScheduleRunTopicBuScheduleRun.intradayRescheduling) &&
        Objects.equals(this.state, wfmBuScheduleRunTopicBuScheduleRun.state) &&
        Objects.equals(this.weekCount, wfmBuScheduleRunTopicBuScheduleRun.weekCount) &&
        Objects.equals(this.schedule, wfmBuScheduleRunTopicBuScheduleRun.schedule) &&
        Objects.equals(this.schedulingCanceledBy, wfmBuScheduleRunTopicBuScheduleRun.schedulingCanceledBy) &&
        Objects.equals(this.schedulingCompletedTime, wfmBuScheduleRunTopicBuScheduleRun.schedulingCompletedTime) &&
        Objects.equals(this.messageCount, wfmBuScheduleRunTopicBuScheduleRun.messageCount) &&
        Objects.equals(this.messageSeverityCounts, wfmBuScheduleRunTopicBuScheduleRun.messageSeverityCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, percentComplete, intradayRescheduling, state, weekCount, schedule, schedulingCanceledBy, schedulingCompletedTime, messageCount, messageSeverityCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleRunTopicBuScheduleRun {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    intradayRescheduling: ").append(toIndentedString(intradayRescheduling)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    schedulingCanceledBy: ").append(toIndentedString(schedulingCanceledBy)).append("\n");
    sb.append("    schedulingCompletedTime: ").append(toIndentedString(schedulingCompletedTime)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    messageSeverityCounts: ").append(toIndentedString(messageSeverityCounts)).append("\n");
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

