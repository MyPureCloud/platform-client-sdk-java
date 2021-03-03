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
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScorableSurvey
 */

public class ScorableSurvey  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SurveyForm surveyForm = null;

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
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    SENT("Sent"),
    INPROGRESS("InProgress"),
    FINISHED("Finished"),
    OPTOUT("OptOut"),
    ERROR("Error"),
    EXPIRED("Expired");

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
  private SurveyScoringSet answers = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ScorableSurvey name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Survey form used for this survey.
   **/
  public ScorableSurvey surveyForm(SurveyForm surveyForm) {
    this.surveyForm = surveyForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Survey form used for this survey.")
  @JsonProperty("surveyForm")
  public SurveyForm getSurveyForm() {
    return surveyForm;
  }
  public void setSurveyForm(SurveyForm surveyForm) {
    this.surveyForm = surveyForm;
  }

  
  /**
   **/
  public ScorableSurvey status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public ScorableSurvey answers(SurveyScoringSet answers) {
    this.answers = answers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answers")
  public SurveyScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(SurveyScoringSet answers) {
    this.answers = answers;
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
    ScorableSurvey scorableSurvey = (ScorableSurvey) o;
    return Objects.equals(this.id, scorableSurvey.id) &&
        Objects.equals(this.name, scorableSurvey.name) &&
        Objects.equals(this.surveyForm, scorableSurvey.surveyForm) &&
        Objects.equals(this.status, scorableSurvey.status) &&
        Objects.equals(this.answers, scorableSurvey.answers) &&
        Objects.equals(this.selfUri, scorableSurvey.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surveyForm, status, answers, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorableSurvey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surveyForm: ").append(toIndentedString(surveyForm)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

