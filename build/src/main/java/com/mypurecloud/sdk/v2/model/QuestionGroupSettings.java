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
  
  private String questionGroupContextId = null;
  private List<QuestionSettings> questionSettings = null;

  public QuestionGroupSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      questionSettings = new ArrayList<QuestionSettings>();
    }
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

    return Objects.equals(this.questionGroupContextId, questionGroupSettings.questionGroupContextId) &&
            Objects.equals(this.questionSettings, questionGroupSettings.questionSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupContextId, questionSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionGroupSettings {\n");
    
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

