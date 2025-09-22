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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationScriptSuggestionsTopicSuggestedScript
 */

public class ConversationScriptSuggestionsTopicSuggestedScript  implements Serializable {
  
  private String scriptId = null;
  private String pageId = null;
  private Map<String, String> data = null;

  public ConversationScriptSuggestionsTopicSuggestedScript() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedScript scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedScript pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageId")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }


  /**
   **/
  public ConversationScriptSuggestionsTopicSuggestedScript data(Map<String, String> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public Map<String, String> getData() {
    return data;
  }
  public void setData(Map<String, String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationScriptSuggestionsTopicSuggestedScript conversationScriptSuggestionsTopicSuggestedScript = (ConversationScriptSuggestionsTopicSuggestedScript) o;

    return Objects.equals(this.scriptId, conversationScriptSuggestionsTopicSuggestedScript.scriptId) &&
            Objects.equals(this.pageId, conversationScriptSuggestionsTopicSuggestedScript.pageId) &&
            Objects.equals(this.data, conversationScriptSuggestionsTopicSuggestedScript.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId, pageId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScriptSuggestionsTopicSuggestedScript {\n");
    
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

