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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateConferenceRequest
 */

public class UpdateConferenceRequest  implements Serializable {
  
  private List<String> conversationIds = null;

  public UpdateConferenceRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversationIds = new ArrayList<String>();
    }
  }

  
  /**
   * A list of conversations to merge into this conversation to create a conference.
   **/
  public UpdateConferenceRequest conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of conversations to merge into this conversation to create a conference.")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConferenceRequest updateConferenceRequest = (UpdateConferenceRequest) o;

    return Objects.equals(this.conversationIds, updateConferenceRequest.conversationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConferenceRequest {\n");
    
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
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

