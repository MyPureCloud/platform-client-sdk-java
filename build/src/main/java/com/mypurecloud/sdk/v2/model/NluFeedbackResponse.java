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
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * NluFeedbackResponse
 */

public class NluFeedbackResponse  implements Serializable {
  
  private String id = null;
  private String text = null;
  private List<IntentFeedback> intents = new ArrayList<IntentFeedback>();
  private NluDomainVersion version = null;
  private Date dateCreated = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The feedback text.
   **/
  public NluFeedbackResponse text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The feedback text.")
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
  public NluFeedbackResponse intents(List<IntentFeedback> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detected intent of the utterance")
  @JsonProperty("intents")
  public List<IntentFeedback> getIntents() {
    return intents;
  }
  public void setIntents(List<IntentFeedback> intents) {
    this.intents = intents;
  }

  
  @ApiModelProperty(example = "null", value = "The domain version of the feedback.")
  @JsonProperty("version")
  public NluDomainVersion getVersion() {
    return version;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the feedback was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
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
    NluFeedbackResponse nluFeedbackResponse = (NluFeedbackResponse) o;
    return Objects.equals(this.id, nluFeedbackResponse.id) &&
        Objects.equals(this.text, nluFeedbackResponse.text) &&
        Objects.equals(this.intents, nluFeedbackResponse.intents) &&
        Objects.equals(this.version, nluFeedbackResponse.version) &&
        Objects.equals(this.dateCreated, nluFeedbackResponse.dateCreated) &&
        Objects.equals(this.selfUri, nluFeedbackResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, intents, version, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluFeedbackResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

