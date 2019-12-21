package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicBuScheduleRun;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * WfmBuScheduleRunTopicBuSchedulingRunProgressNotification
 */

public class WfmBuScheduleRunTopicBuSchedulingRunProgressNotification  implements Serializable {
  
  private String operationId = null;

  /**
   * Gets or Sets state
   */
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
  private BigDecimal percentComplete = null;
  private Boolean intradayRescheduling = null;
  private WfmBuScheduleRunTopicBuScheduleRun run = null;

  
  /**
   **/
  public WfmBuScheduleRunTopicBuSchedulingRunProgressNotification operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuSchedulingRunProgressNotification state(StateEnum state) {
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
  public WfmBuScheduleRunTopicBuSchedulingRunProgressNotification percentComplete(BigDecimal percentComplete) {
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
  public WfmBuScheduleRunTopicBuSchedulingRunProgressNotification intradayRescheduling(Boolean intradayRescheduling) {
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
  public WfmBuScheduleRunTopicBuSchedulingRunProgressNotification run(WfmBuScheduleRunTopicBuScheduleRun run) {
    this.run = run;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("run")
  public WfmBuScheduleRunTopicBuScheduleRun getRun() {
    return run;
  }
  public void setRun(WfmBuScheduleRunTopicBuScheduleRun run) {
    this.run = run;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleRunTopicBuSchedulingRunProgressNotification wfmBuScheduleRunTopicBuSchedulingRunProgressNotification = (WfmBuScheduleRunTopicBuSchedulingRunProgressNotification) o;
    return Objects.equals(this.operationId, wfmBuScheduleRunTopicBuSchedulingRunProgressNotification.operationId) &&
        Objects.equals(this.state, wfmBuScheduleRunTopicBuSchedulingRunProgressNotification.state) &&
        Objects.equals(this.percentComplete, wfmBuScheduleRunTopicBuSchedulingRunProgressNotification.percentComplete) &&
        Objects.equals(this.intradayRescheduling, wfmBuScheduleRunTopicBuSchedulingRunProgressNotification.intradayRescheduling) &&
        Objects.equals(this.run, wfmBuScheduleRunTopicBuSchedulingRunProgressNotification.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, state, percentComplete, intradayRescheduling, run);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleRunTopicBuSchedulingRunProgressNotification {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    intradayRescheduling: ").append(toIndentedString(intradayRescheduling)).append("\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
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

