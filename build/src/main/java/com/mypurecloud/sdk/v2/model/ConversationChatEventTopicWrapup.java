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
  private List<String> tags = new ArrayList<String>();
  private Integer durationSeconds = null;
  private Date endTime = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public ConversationChatEventTopicWrapup code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  public ConversationChatEventTopicWrapup notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   **/
  public ConversationChatEventTopicWrapup tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   **/
  public ConversationChatEventTopicWrapup durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  
  /**
   **/
  public ConversationChatEventTopicWrapup endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   **/
  public ConversationChatEventTopicWrapup additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
        Objects.equals(this.endTime, conversationChatEventTopicWrapup.endTime) &&
        Objects.equals(this.additionalProperties, conversationChatEventTopicWrapup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, notes, tags, durationSeconds, endTime, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

