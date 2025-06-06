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
import com.mypurecloud.sdk.v2.model.PerformancePredictionCompleteEventTopicErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification
 */

public class PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification  implements Serializable {
  
  private String scheduleId = null;
  private String weekDate = null;
  private String downloadUrl = null;

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
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    CANCELED("Canceled"),
    ERROR("Error");

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
  private PerformancePredictionCompleteEventTopicErrorBody error = null;

  public PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleId")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }


  /**
   **/
  public PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }


  /**
   **/
  public PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   **/
  public PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification state(StateEnum state) {
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
  public PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification error(PerformancePredictionCompleteEventTopicErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public PerformancePredictionCompleteEventTopicErrorBody getError() {
    return error;
  }
  public void setError(PerformancePredictionCompleteEventTopicErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification performancePredictionCompleteEventTopicPerformancePredictionCalculationNotification = (PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification) o;

    return Objects.equals(this.scheduleId, performancePredictionCompleteEventTopicPerformancePredictionCalculationNotification.scheduleId) &&
            Objects.equals(this.weekDate, performancePredictionCompleteEventTopicPerformancePredictionCalculationNotification.weekDate) &&
            Objects.equals(this.downloadUrl, performancePredictionCompleteEventTopicPerformancePredictionCalculationNotification.downloadUrl) &&
            Objects.equals(this.state, performancePredictionCompleteEventTopicPerformancePredictionCalculationNotification.state) &&
            Objects.equals(this.error, performancePredictionCompleteEventTopicPerformancePredictionCalculationNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, weekDate, downloadUrl, state, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification {\n");
    
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

