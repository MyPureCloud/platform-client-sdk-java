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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LearningAssignmentExternalUpdate
 */

public class LearningAssignmentExternalUpdate  implements Serializable {
  

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
   * The Learning Assignment state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSIGNED("Assigned"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    DELETED("Deleted"),
    NOTCOMPLETED("NotCompleted"),
    INVALIDSCHEDULE("InvalidSchedule");

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
  private Float percentageScore = null;
  private Boolean isPassed = null;

  public LearningAssignmentExternalUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Learning Assignment state
   **/
  public LearningAssignmentExternalUpdate state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Learning Assignment state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The score
   **/
  public LearningAssignmentExternalUpdate percentageScore(Float percentageScore) {
    this.percentageScore = percentageScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The score")
  @JsonProperty("percentageScore")
  public Float getPercentageScore() {
    return percentageScore;
  }
  public void setPercentageScore(Float percentageScore) {
    this.percentageScore = percentageScore;
  }


  /**
   * Was the assignment marked as passed
   **/
  public LearningAssignmentExternalUpdate isPassed(Boolean isPassed) {
    this.isPassed = isPassed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Was the assignment marked as passed")
  @JsonProperty("isPassed")
  public Boolean getIsPassed() {
    return isPassed;
  }
  public void setIsPassed(Boolean isPassed) {
    this.isPassed = isPassed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentExternalUpdate learningAssignmentExternalUpdate = (LearningAssignmentExternalUpdate) o;

    return Objects.equals(this.state, learningAssignmentExternalUpdate.state) &&
            Objects.equals(this.percentageScore, learningAssignmentExternalUpdate.percentageScore) &&
            Objects.equals(this.isPassed, learningAssignmentExternalUpdate.isPassed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, percentageScore, isPassed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentExternalUpdate {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    isPassed: ").append(toIndentedString(isPassed)).append("\n");
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

