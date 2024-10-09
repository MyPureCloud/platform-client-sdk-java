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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ConversationSessionSummary;
import com.mypurecloud.sdk.v2.model.ConversationSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines the summaries of a conversation.
 */
@ApiModel(description = "Defines the summaries of a conversation.")

public class ConversationSummariesGetResponse  implements Serializable {
  
  private AddressableEntityRef conversation = null;
  private ConversationSummary summary = null;
  private List<ConversationSessionSummary> sessionSummaries = new ArrayList<ConversationSessionSummary>();

  
  /**
   * The conversation object.
   **/
  public ConversationSummariesGetResponse conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation object.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The summary of the conversation.
   **/
  public ConversationSummariesGetResponse summary(ConversationSummary summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The summary of the conversation.")
  @JsonProperty("summary")
  public ConversationSummary getSummary() {
    return summary;
  }
  public void setSummary(ConversationSummary summary) {
    this.summary = summary;
  }


  /**
   * All the summaries of the session.
   **/
  public ConversationSummariesGetResponse sessionSummaries(List<ConversationSessionSummary> sessionSummaries) {
    this.sessionSummaries = sessionSummaries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "All the summaries of the session.")
  @JsonProperty("sessionSummaries")
  public List<ConversationSessionSummary> getSessionSummaries() {
    return sessionSummaries;
  }
  public void setSessionSummaries(List<ConversationSessionSummary> sessionSummaries) {
    this.sessionSummaries = sessionSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummariesGetResponse conversationSummariesGetResponse = (ConversationSummariesGetResponse) o;

    return Objects.equals(this.conversation, conversationSummariesGetResponse.conversation) &&
            Objects.equals(this.summary, conversationSummariesGetResponse.summary) &&
            Objects.equals(this.sessionSummaries, conversationSummariesGetResponse.sessionSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, summary, sessionSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummariesGetResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    sessionSummaries: ").append(toIndentedString(sessionSummaries)).append("\n");
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

