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
import com.mypurecloud.sdk.v2.model.ActionSurvey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActionProperties
 */

public class ActionProperties  implements Serializable {
  
  private String webchatPrompt = null;
  private String webchatTitleText = null;
  private String webchatAcceptText = null;
  private String webchatDeclineText = null;
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
   * Title shown to the user, used for webchat type action.
   **/
  public ActionProperties webchatTitleText(String webchatTitleText) {
    this.webchatTitleText = webchatTitleText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title shown to the user, used for webchat type action.")
  @JsonProperty("webchatTitleText")
  public String getWebchatTitleText() {
    return webchatTitleText;
  }
  public void setWebchatTitleText(String webchatTitleText) {
    this.webchatTitleText = webchatTitleText;
  }

  
  /**
   * Accept button text shown to user, used for webchat type action.
   **/
  public ActionProperties webchatAcceptText(String webchatAcceptText) {
    this.webchatAcceptText = webchatAcceptText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Accept button text shown to user, used for webchat type action.")
  @JsonProperty("webchatAcceptText")
  public String getWebchatAcceptText() {
    return webchatAcceptText;
  }
  public void setWebchatAcceptText(String webchatAcceptText) {
    this.webchatAcceptText = webchatAcceptText;
  }

  
  /**
   * Decline button text shown to user, used for webchat type action.
   **/
  public ActionProperties webchatDeclineText(String webchatDeclineText) {
    this.webchatDeclineText = webchatDeclineText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Decline button text shown to user, used for webchat type action.")
  @JsonProperty("webchatDeclineText")
  public String getWebchatDeclineText() {
    return webchatDeclineText;
  }
  public void setWebchatDeclineText(String webchatDeclineText) {
    this.webchatDeclineText = webchatDeclineText;
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
        Objects.equals(this.webchatTitleText, actionProperties.webchatTitleText) &&
        Objects.equals(this.webchatAcceptText, actionProperties.webchatAcceptText) &&
        Objects.equals(this.webchatDeclineText, actionProperties.webchatDeclineText) &&
        Objects.equals(this.webchatSurvey, actionProperties.webchatSurvey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webchatPrompt, webchatTitleText, webchatAcceptText, webchatDeclineText, webchatSurvey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionProperties {\n");
    
    sb.append("    webchatPrompt: ").append(toIndentedString(webchatPrompt)).append("\n");
    sb.append("    webchatTitleText: ").append(toIndentedString(webchatTitleText)).append("\n");
    sb.append("    webchatAcceptText: ").append(toIndentedString(webchatAcceptText)).append("\n");
    sb.append("    webchatDeclineText: ").append(toIndentedString(webchatDeclineText)).append("\n");
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

