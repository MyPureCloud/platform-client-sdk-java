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
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationChatEventTopicWrapup
 */

public class ConversationChatEventTopicWrapup  implements Serializable {
  
  private String code = null;
  private String notes = null;
  private List<String> tags = null;
  private Long durationSeconds = null;
  private Date endTime = null;

  public ConversationChatEventTopicWrapup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      tags = new ArrayList<String>();
    }
  }

  
  /**
   * The user configured wrap up code name.
   **/
  public ConversationChatEventTopicWrapup code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user configured wrap up code name.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Text entered by the agent to describe the call or disposition.
   **/
  public ConversationChatEventTopicWrapup notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text entered by the agent to describe the call or disposition.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * List of tags selected by the agent to describe the call or disposition.
   **/
  public ConversationChatEventTopicWrapup tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of tags selected by the agent to describe the call or disposition.")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  /**
   * The length of time in seconds that the agent spent doing after call work., Note, the format of utc-millisec should be ignored, our code generator needs it to generate a Long for us internally
   **/
  public ConversationChatEventTopicWrapup durationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of time in seconds that the agent spent doing after call work., Note, the format of utc-millisec should be ignored, our code generator needs it to generate a Long for us internally")
  @JsonProperty("durationSeconds")
  public Long getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   * The timestamp when the wrapup was finished.
   **/
  public ConversationChatEventTopicWrapup endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when the wrapup was finished.")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationChatEventTopicWrapup conversationChatEventTopicWrapup = (ConversationChatEventTopicWrapup) o;

    return Objects.equals(this.code, conversationChatEventTopicWrapup.code) &&
            Objects.equals(this.notes, conversationChatEventTopicWrapup.notes) &&
            Objects.equals(this.tags, conversationChatEventTopicWrapup.tags) &&
            Objects.equals(this.durationSeconds, conversationChatEventTopicWrapup.durationSeconds) &&
            Objects.equals(this.endTime, conversationChatEventTopicWrapup.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, notes, tags, durationSeconds, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChatEventTopicWrapup {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

