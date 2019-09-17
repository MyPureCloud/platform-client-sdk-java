package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsConversationAsyncQueryResponse
 */

public class AnalyticsConversationAsyncQueryResponse  implements Serializable {
  
  private List<AnalyticsConversation> conversations = new ArrayList<AnalyticsConversation>();
  private String cursor = null;

  
  /**
   **/
  public AnalyticsConversationAsyncQueryResponse conversations(List<AnalyticsConversation> conversations) {
    this.conversations = conversations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversations")
  public List<AnalyticsConversation> getConversations() {
    return conversations;
  }
  public void setConversations(List<AnalyticsConversation> conversations) {
    this.conversations = conversations;
  }

  
  /**
   * Optional cursor to indicate where to resume the results
   **/
  public AnalyticsConversationAsyncQueryResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional cursor to indicate where to resume the results")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversationAsyncQueryResponse analyticsConversationAsyncQueryResponse = (AnalyticsConversationAsyncQueryResponse) o;
    return Objects.equals(this.conversations, analyticsConversationAsyncQueryResponse.conversations) &&
        Objects.equals(this.cursor, analyticsConversationAsyncQueryResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversations, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationAsyncQueryResponse {\n");
    
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

