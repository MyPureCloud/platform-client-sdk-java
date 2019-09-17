package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TranscriptProperty
 */

public class TranscriptProperty  implements Serializable {
  
  private String url = null;
  private AddressableEntityRef conversation = null;
  private String communicationId = null;

  
  /**
   * The pre-signed S3 URL of the transcript
   **/
  public TranscriptProperty url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pre-signed S3 URL of the transcript")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The conversation reference
   **/
  public TranscriptProperty conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation reference")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }

  
  /**
   * The communication ID
   **/
  public TranscriptProperty communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The communication ID")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptProperty transcriptProperty = (TranscriptProperty) o;
    return Objects.equals(this.url, transcriptProperty.url) &&
        Objects.equals(this.conversation, transcriptProperty.conversation) &&
        Objects.equals(this.communicationId, transcriptProperty.communicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, conversation, communicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptProperty {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
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

