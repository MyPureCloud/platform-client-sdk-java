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
import com.mypurecloud.sdk.v2.model.QuestionSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QuestionGroupSettings
 */

public class QuestionGroupSettings  implements Serializable {
  
  private Integer questionGroupIndex = null;
  private String questionGroupContextId = null;
  private List<QuestionSettings> questionSettings = new ArrayList<QuestionSettings>();

  
  /**
   * This field represents the location of the Question Group in the form. Note: Indexes are zero-based
   **/
  public QuestionGroupSettings questionGroupIndex(Integer questionGroupIndex) {
    this.questionGroupIndex = questionGroupIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field represents the location of the Question Group in the form. Note: Indexes are zero-based")
  @JsonProperty("questionGroupIndex")
  public Integer getQuestionGroupIndex() {
    return questionGroupIndex;
  }
  public void setQuestionGroupIndex(Integer questionGroupIndex) {
    this.questionGroupIndex = questionGroupIndex;
  }


  /**
   * The context id of the question group in the form.
   **/
  public QuestionGroupSettings questionGroupContextId(String questionGroupContextId) {
    this.questionGroupContextId = questionGroupContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context id of the question group in the form.")
  @JsonProperty("questionGroupContextId")
  public String getQuestionGroupContextId() {
    return questionGroupContextId;
  }
  public void setQuestionGroupContextId(String questionGroupContextId) {
    this.questionGroupContextId = questionGroupContextId;
  }


  /**
   **/
  public QuestionGroupSettings questionSettings(List<QuestionSettings> questionSettings) {
    this.questionSettings = questionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionSettings")
  public List<QuestionSettings> getQuestionSettings() {
    return questionSettings;
  }
  public void setQuestionSettings(List<QuestionSettings> questionSettings) {
    this.questionSettings = questionSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionGroupSettings questionGroupSettings = (QuestionGroupSettings) o;

    return Objects.equals(this.questionGroupIndex, questionGroupSettings.questionGroupIndex) &&
            Objects.equals(this.questionGroupContextId, questionGroupSettings.questionGroupContextId) &&
            Objects.equals(this.questionSettings, questionGroupSettings.questionSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupIndex, questionGroupContextId, questionSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionGroupSettings {\n");
    
    sb.append("    questionGroupIndex: ").append(toIndentedString(questionGroupIndex)).append("\n");
    sb.append("    questionGroupContextId: ").append(toIndentedString(questionGroupContextId)).append("\n");
    sb.append("    questionSettings: ").append(toIndentedString(questionSettings)).append("\n");
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

