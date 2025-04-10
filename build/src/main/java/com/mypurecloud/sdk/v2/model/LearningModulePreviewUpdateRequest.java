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
import com.mypurecloud.sdk.v2.model.AssessmentForm;
import com.mypurecloud.sdk.v2.model.LearningAssessment;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateRequestCurrentStep;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module preview update request
 */
@ApiModel(description = "Learning module preview update request")

public class LearningModulePreviewUpdateRequest  implements Serializable {
  

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
   * The assignment State
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
  private LearningModulePreviewUpdateRequestCurrentStep currentStep = null;
  private List<LearningModulePreviewUpdateStep> steps = null;
  private LearningAssessment assessment = null;
  private AssessmentForm assessmentForm = null;

  public LearningModulePreviewUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      steps = new ArrayList<LearningModulePreviewUpdateStep>();
    }
  }

  
  /**
   * The assignment State
   **/
  public LearningModulePreviewUpdateRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignment State")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The assignment current step
   **/
  public LearningModulePreviewUpdateRequest currentStep(LearningModulePreviewUpdateRequestCurrentStep currentStep) {
    this.currentStep = currentStep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignment current step")
  @JsonProperty("currentStep")
  public LearningModulePreviewUpdateRequestCurrentStep getCurrentStep() {
    return currentStep;
  }
  public void setCurrentStep(LearningModulePreviewUpdateRequestCurrentStep currentStep) {
    this.currentStep = currentStep;
  }


  /**
   * The assignment Steps
   **/
  public LearningModulePreviewUpdateRequest steps(List<LearningModulePreviewUpdateStep> steps) {
    this.steps = steps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignment Steps")
  @JsonProperty("steps")
  public List<LearningModulePreviewUpdateStep> getSteps() {
    return steps;
  }
  public void setSteps(List<LearningModulePreviewUpdateStep> steps) {
    this.steps = steps;
  }


  /**
   * The assessment for learning module
   **/
  public LearningModulePreviewUpdateRequest assessment(LearningAssessment assessment) {
    this.assessment = assessment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assessment for learning module")
  @JsonProperty("assessment")
  public LearningAssessment getAssessment() {
    return assessment;
  }
  public void setAssessment(LearningAssessment assessment) {
    this.assessment = assessment;
  }


  /**
   * The assessment form for learning module
   **/
  public LearningModulePreviewUpdateRequest assessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assessment form for learning module")
  @JsonProperty("assessmentForm")
  public AssessmentForm getAssessmentForm() {
    return assessmentForm;
  }
  public void setAssessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewUpdateRequest learningModulePreviewUpdateRequest = (LearningModulePreviewUpdateRequest) o;

    return Objects.equals(this.state, learningModulePreviewUpdateRequest.state) &&
            Objects.equals(this.currentStep, learningModulePreviewUpdateRequest.currentStep) &&
            Objects.equals(this.steps, learningModulePreviewUpdateRequest.steps) &&
            Objects.equals(this.assessment, learningModulePreviewUpdateRequest.assessment) &&
            Objects.equals(this.assessmentForm, learningModulePreviewUpdateRequest.assessmentForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, currentStep, steps, assessment, assessmentForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateRequest {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    currentStep: ").append(toIndentedString(currentStep)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
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

