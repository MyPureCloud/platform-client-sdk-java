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
import com.mypurecloud.sdk.v2.model.IntentFeedback;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluFeedbackRequest
 */

public class NluFeedbackRequest  implements Serializable {
  
  private String text = null;
  private List<IntentFeedback> intents = new ArrayList<IntentFeedback>();
  private String versionId = null;

  
  /**
   * The feedback text.
   **/
  public NluFeedbackRequest text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The feedback text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Detected intent of the utterance
   **/
  public NluFeedbackRequest intents(List<IntentFeedback> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Detected intent of the utterance")
  @JsonProperty("intents")
  public List<IntentFeedback> getIntents() {
    return intents;
  }
  public void setIntents(List<IntentFeedback> intents) {
    this.intents = intents;
  }

  
  /**
   * The domain version ID of the feedback.
   **/
  public NluFeedbackRequest versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The domain version ID of the feedback.")
  @JsonProperty("versionId")
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluFeedbackRequest nluFeedbackRequest = (NluFeedbackRequest) o;
    return Objects.equals(this.text, nluFeedbackRequest.text) &&
        Objects.equals(this.intents, nluFeedbackRequest.intents) &&
        Objects.equals(this.versionId, nluFeedbackRequest.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, intents, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluFeedbackRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

