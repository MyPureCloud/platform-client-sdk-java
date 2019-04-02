package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ActionSurvey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActionProperties
 */

public class ActionProperties  implements Serializable {
  
  private String webchatPrompt = null;
  private ActionSurvey webchatSurvey = null;

  
  /**
   * Prompt message shown to user, used for webchat type action.
   **/
  public ActionProperties webchatPrompt(String webchatPrompt) {
    this.webchatPrompt = webchatPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prompt message shown to user, used for webchat type action.")
  @JsonProperty("webchatPrompt")
  public String getWebchatPrompt() {
    return webchatPrompt;
  }
  public void setWebchatPrompt(String webchatPrompt) {
    this.webchatPrompt = webchatPrompt;
  }

  
  /**
   * Survey provided to the user, used for webchat type action.
   **/
  public ActionProperties webchatSurvey(ActionSurvey webchatSurvey) {
    this.webchatSurvey = webchatSurvey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Survey provided to the user, used for webchat type action.")
  @JsonProperty("webchatSurvey")
  public ActionSurvey getWebchatSurvey() {
    return webchatSurvey;
  }
  public void setWebchatSurvey(ActionSurvey webchatSurvey) {
    this.webchatSurvey = webchatSurvey;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionProperties actionProperties = (ActionProperties) o;
    return Objects.equals(this.webchatPrompt, actionProperties.webchatPrompt) &&
        Objects.equals(this.webchatSurvey, actionProperties.webchatSurvey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webchatPrompt, webchatSurvey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionProperties {\n");
    
    sb.append("    webchatPrompt: ").append(toIndentedString(webchatPrompt)).append("\n");
    sb.append("    webchatSurvey: ").append(toIndentedString(webchatSurvey)).append("\n");
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

