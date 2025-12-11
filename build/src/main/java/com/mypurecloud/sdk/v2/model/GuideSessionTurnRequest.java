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
import com.mypurecloud.sdk.v2.model.GuideSessionInputEvent;
import com.mypurecloud.sdk.v2.model.GuideSessionVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Request for a guide session turn
 */
@ApiModel(description = "Request for a guide session turn")

public class GuideSessionTurnRequest  implements Serializable {
  
  private GuideSessionInputEvent inputEvent = null;
  private String languageCode = null;
  private String version = null;
  private List<GuideSessionVariable> inputVariables = null;

  public GuideSessionTurnRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inputVariables = new ArrayList<GuideSessionVariable>();
    }
  }

  
  /**
   * The input event for this turn.
   **/
  public GuideSessionTurnRequest inputEvent(GuideSessionInputEvent inputEvent) {
    this.inputEvent = inputEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input event for this turn.")
  @JsonProperty("inputEvent")
  public GuideSessionInputEvent getInputEvent() {
    return inputEvent;
  }
  public void setInputEvent(GuideSessionInputEvent inputEvent) {
    this.inputEvent = inputEvent;
  }


  /**
   * The language code for this turn.
   **/
  public GuideSessionTurnRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The language code for this turn.")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  /**
   * The version for this turn.
   **/
  public GuideSessionTurnRequest version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version for this turn.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * The input variables for this turn.
   **/
  public GuideSessionTurnRequest inputVariables(List<GuideSessionVariable> inputVariables) {
    this.inputVariables = inputVariables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input variables for this turn.")
  @JsonProperty("inputVariables")
  public List<GuideSessionVariable> getInputVariables() {
    return inputVariables;
  }
  public void setInputVariables(List<GuideSessionVariable> inputVariables) {
    this.inputVariables = inputVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionTurnRequest guideSessionTurnRequest = (GuideSessionTurnRequest) o;

    return Objects.equals(this.inputEvent, guideSessionTurnRequest.inputEvent) &&
            Objects.equals(this.languageCode, guideSessionTurnRequest.languageCode) &&
            Objects.equals(this.version, guideSessionTurnRequest.version) &&
            Objects.equals(this.inputVariables, guideSessionTurnRequest.inputVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputEvent, languageCode, version, inputVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionTurnRequest {\n");
    
    sb.append("    inputEvent: ").append(toIndentedString(inputEvent)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    inputVariables: ").append(toIndentedString(inputVariables)).append("\n");
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

