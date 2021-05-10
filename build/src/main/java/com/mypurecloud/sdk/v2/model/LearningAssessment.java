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
import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * LearningAssessment
 */

public class LearningAssessment  implements Serializable {
  
  private String assessmentId = null;
  private String contextId = null;
  private String assessmentFormId = null;

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
   * Status of the assessment
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    INPROGRESS("InProgress"),
    FINISHED("Finished");

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
  private AssessmentScoringSet answers = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date dateSubmitted = null;

  
  @ApiModelProperty(example = "null", value = "The Id of the assessment")
  @JsonProperty("assessmentId")
  public String getAssessmentId() {
    return assessmentId;
  }

  
  @ApiModelProperty(example = "null", value = "The context Id of the related assessment form")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  
  @ApiModelProperty(example = "null", value = "The Id of the related assessment form")
  @JsonProperty("assessmentFormId")
  public String getAssessmentFormId() {
    return assessmentFormId;
  }

  
  @ApiModelProperty(example = "null", value = "Status of the assessment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  /**
   * Answers for the assessment
   **/
  public LearningAssessment answers(AssessmentScoringSet answers) {
    this.answers = answers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Answers for the assessment")
  @JsonProperty("answers")
  public AssessmentScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(AssessmentScoringSet answers) {
    this.answers = answers;
  }

  
  @ApiModelProperty(example = "null", value = "Date the assessment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Date the assessment was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "Date the assessment was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSubmitted")
  public Date getDateSubmitted() {
    return dateSubmitted;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssessment learningAssessment = (LearningAssessment) o;
    return Objects.equals(this.assessmentId, learningAssessment.assessmentId) &&
        Objects.equals(this.contextId, learningAssessment.contextId) &&
        Objects.equals(this.assessmentFormId, learningAssessment.assessmentFormId) &&
        Objects.equals(this.status, learningAssessment.status) &&
        Objects.equals(this.answers, learningAssessment.answers) &&
        Objects.equals(this.dateCreated, learningAssessment.dateCreated) &&
        Objects.equals(this.dateModified, learningAssessment.dateModified) &&
        Objects.equals(this.dateSubmitted, learningAssessment.dateSubmitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentId, contextId, assessmentFormId, status, answers, dateCreated, dateModified, dateSubmitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssessment {\n");
    
    sb.append("    assessmentId: ").append(toIndentedString(assessmentId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    assessmentFormId: ").append(toIndentedString(assessmentFormId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
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

