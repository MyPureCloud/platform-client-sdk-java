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
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsConversationWithoutAttributesMultiGetResponse
 */

public class AnalyticsConversationWithoutAttributesMultiGetResponse  implements Serializable {
  
  private List<AnalyticsConversationWithoutAttributes> conversations = null;

  public AnalyticsConversationWithoutAttributesMultiGetResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversations = new ArrayList<AnalyticsConversationWithoutAttributes>();
    }
  }

  
  /**
   **/
  public AnalyticsConversationWithoutAttributesMultiGetResponse conversations(List<AnalyticsConversationWithoutAttributes> conversations) {
    this.conversations = conversations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversations")
  public List<AnalyticsConversationWithoutAttributes> getConversations() {
    return conversations;
  }
  public void setConversations(List<AnalyticsConversationWithoutAttributes> conversations) {
    this.conversations = conversations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversationWithoutAttributesMultiGetResponse analyticsConversationWithoutAttributesMultiGetResponse = (AnalyticsConversationWithoutAttributesMultiGetResponse) o;

    return Objects.equals(this.conversations, analyticsConversationWithoutAttributesMultiGetResponse.conversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationWithoutAttributesMultiGetResponse {\n");
    
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
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

