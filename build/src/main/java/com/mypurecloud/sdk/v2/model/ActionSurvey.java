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
import com.mypurecloud.sdk.v2.model.JourneySurveyQuestion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActionSurvey
 */

public class ActionSurvey  implements Serializable {
  
  private List<JourneySurveyQuestion> questions = new ArrayList<JourneySurveyQuestion>();

  
  /**
   * Questions shown to the user.
   **/
  public ActionSurvey questions(List<JourneySurveyQuestion> questions) {
    this.questions = questions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Questions shown to the user.")
  @JsonProperty("questions")
  public List<JourneySurveyQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<JourneySurveyQuestion> questions) {
    this.questions = questions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionSurvey actionSurvey = (ActionSurvey) o;
    return Objects.equals(this.questions, actionSurvey.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionSurvey {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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

