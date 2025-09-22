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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationResponseSuggestionsTopicSuggestedCannedResponse
 */

public class ConversationResponseSuggestionsTopicSuggestedCannedResponse  implements Serializable {
  
  private String responseId = null;
  private String libraryId = null;

  public ConversationResponseSuggestionsTopicSuggestedCannedResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationResponseSuggestionsTopicSuggestedCannedResponse responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("responseId")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }


  /**
   **/
  public ConversationResponseSuggestionsTopicSuggestedCannedResponse libraryId(String libraryId) {
    this.libraryId = libraryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("libraryId")
  public String getLibraryId() {
    return libraryId;
  }
  public void setLibraryId(String libraryId) {
    this.libraryId = libraryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationResponseSuggestionsTopicSuggestedCannedResponse conversationResponseSuggestionsTopicSuggestedCannedResponse = (ConversationResponseSuggestionsTopicSuggestedCannedResponse) o;

    return Objects.equals(this.responseId, conversationResponseSuggestionsTopicSuggestedCannedResponse.responseId) &&
            Objects.equals(this.libraryId, conversationResponseSuggestionsTopicSuggestedCannedResponse.libraryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseId, libraryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationResponseSuggestionsTopicSuggestedCannedResponse {\n");
    
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    libraryId: ").append(toIndentedString(libraryId)).append("\n");
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

