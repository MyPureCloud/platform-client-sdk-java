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
import com.mypurecloud.sdk.v2.model.AiScoringSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QuestionSettings
 */

public class QuestionSettings  implements Serializable {
  
  private String questionContextId = null;
  private AiScoringSetting settings = null;

  
  /**
   * The context id of the question in the group
   **/
  public QuestionSettings questionContextId(String questionContextId) {
    this.questionContextId = questionContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context id of the question in the group")
  @JsonProperty("questionContextId")
  public String getQuestionContextId() {
    return questionContextId;
  }
  public void setQuestionContextId(String questionContextId) {
    this.questionContextId = questionContextId;
  }


  /**
   **/
  public QuestionSettings settings(AiScoringSetting settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("settings")
  public AiScoringSetting getSettings() {
    return settings;
  }
  public void setSettings(AiScoringSetting settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionSettings questionSettings = (QuestionSettings) o;

    return Objects.equals(this.questionContextId, questionSettings.questionContextId) &&
            Objects.equals(this.settings, questionSettings.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionContextId, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionSettings {\n");
    
    sb.append("    questionContextId: ").append(toIndentedString(questionContextId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

