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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SegmentUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptUrls
 */

public class TranscriptUrls  implements Serializable {
  
  private AddressableEntityRef conversation = null;
  private String communicationId = null;
  private List<SegmentUrl> urls = null;

  public TranscriptUrls() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      urls = new ArrayList<SegmentUrl>();
    }
  }

  
  /**
   * The Conversation Reference
   **/
  public TranscriptUrls conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Conversation Reference")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The Communication ID
   **/
  public TranscriptUrls communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Communication ID")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * List of Transcript URLs
   **/
  public TranscriptUrls urls(List<SegmentUrl> urls) {
    this.urls = urls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Transcript URLs")
  @JsonProperty("urls")
  public List<SegmentUrl> getUrls() {
    return urls;
  }
  public void setUrls(List<SegmentUrl> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptUrls transcriptUrls = (TranscriptUrls) o;

    return Objects.equals(this.conversation, transcriptUrls.conversation) &&
            Objects.equals(this.communicationId, transcriptUrls.communicationId) &&
            Objects.equals(this.urls, transcriptUrls.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, communicationId, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptUrls {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

