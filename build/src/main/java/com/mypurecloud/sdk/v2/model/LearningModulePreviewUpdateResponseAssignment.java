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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateResponseCurrentStep;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module preview update response assignment
 */
@ApiModel(description = "Learning module preview update response assignment")

public class LearningModulePreviewUpdateResponseAssignment  implements Serializable {
  

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
  private Float completionPercentage = null;
  private Float assessmentPercentageScore = null;
  private Float assessmentCompletionPercentage = null;
  private Boolean isPassed = null;
  private LearningModulePreviewUpdateResponseCurrentStep currentStep = null;
  private List<LearningModulePreviewUpdateStep> steps = new ArrayList<LearningModulePreviewUpdateStep>();

  
  /**
   * The Learning Assignment state
   **/
  public LearningModulePreviewUpdateResponseAssignment state(StateEnum state) {
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


  @ApiModelProperty(example = "null", value = "The user's percentage score for this assignment")
  @JsonProperty("percentageScore")
  public Float getPercentageScore() {
    return percentageScore;
  }


  @ApiModelProperty(example = "null", value = "The overall completion percentage of assignment")
  @JsonProperty("completionPercentage")
  public Float getCompletionPercentage() {
    return completionPercentage;
  }


  @ApiModelProperty(example = "null", value = "The user's percentage score for this assignment's assessment")
  @JsonProperty("assessmentPercentageScore")
  public Float getAssessmentPercentageScore() {
    return assessmentPercentageScore;
  }


  @ApiModelProperty(example = "null", value = "The assessment completion percentage of assignment")
  @JsonProperty("assessmentCompletionPercentage")
  public Float getAssessmentCompletionPercentage() {
    return assessmentCompletionPercentage;
  }


  @ApiModelProperty(example = "null", value = "True if the assessment was passed")
  @JsonProperty("isPassed")
  public Boolean getIsPassed() {
    return isPassed;
  }


  @ApiModelProperty(example = "null", value = "The next assignment step")
  @JsonProperty("currentStep")
  public LearningModulePreviewUpdateResponseCurrentStep getCurrentStep() {
    return currentStep;
  }


  @ApiModelProperty(example = "null", value = "List of assignment steps")
  @JsonProperty("steps")
  public List<LearningModulePreviewUpdateStep> getSteps() {
    return steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewUpdateResponseAssignment learningModulePreviewUpdateResponseAssignment = (LearningModulePreviewUpdateResponseAssignment) o;

    return Objects.equals(this.state, learningModulePreviewUpdateResponseAssignment.state) &&
            Objects.equals(this.percentageScore, learningModulePreviewUpdateResponseAssignment.percentageScore) &&
            Objects.equals(this.completionPercentage, learningModulePreviewUpdateResponseAssignment.completionPercentage) &&
            Objects.equals(this.assessmentPercentageScore, learningModulePreviewUpdateResponseAssignment.assessmentPercentageScore) &&
            Objects.equals(this.assessmentCompletionPercentage, learningModulePreviewUpdateResponseAssignment.assessmentCompletionPercentage) &&
            Objects.equals(this.isPassed, learningModulePreviewUpdateResponseAssignment.isPassed) &&
            Objects.equals(this.currentStep, learningModulePreviewUpdateResponseAssignment.currentStep) &&
            Objects.equals(this.steps, learningModulePreviewUpdateResponseAssignment.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, percentageScore, completionPercentage, assessmentPercentageScore, assessmentCompletionPercentage, isPassed, currentStep, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateResponseAssignment {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    assessmentPercentageScore: ").append(toIndentedString(assessmentPercentageScore)).append("\n");
    sb.append("    assessmentCompletionPercentage: ").append(toIndentedString(assessmentCompletionPercentage)).append("\n");
    sb.append("    isPassed: ").append(toIndentedString(isPassed)).append("\n");
    sb.append("    currentStep: ").append(toIndentedString(currentStep)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

