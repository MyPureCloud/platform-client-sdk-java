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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EmailThreadingSettings
 */

public class EmailThreadingSettings  implements Serializable {
  
  private Boolean startNewConversationOnSubjectChange = null;
  private Long timeoutInMinutes = null;

  
  /**
   * This setting controls whether a new conversation is started if the subject of an inbound email is different from the subject of the current conversation. RE: and FWD: prefixes in any language are ignored.
   **/
  public EmailThreadingSettings startNewConversationOnSubjectChange(Boolean startNewConversationOnSubjectChange) {
    this.startNewConversationOnSubjectChange = startNewConversationOnSubjectChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This setting controls whether a new conversation is started if the subject of an inbound email is different from the subject of the current conversation. RE: and FWD: prefixes in any language are ignored.")
  @JsonProperty("startNewConversationOnSubjectChange")
  public Boolean getStartNewConversationOnSubjectChange() {
    return startNewConversationOnSubjectChange;
  }
  public void setStartNewConversationOnSubjectChange(Boolean startNewConversationOnSubjectChange) {
    this.startNewConversationOnSubjectChange = startNewConversationOnSubjectChange;
  }


  /**
   * In minutes, how long an email conversation should keep being threaded after being disconnected.
   **/
  public EmailThreadingSettings timeoutInMinutes(Long timeoutInMinutes) {
    this.timeoutInMinutes = timeoutInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "In minutes, how long an email conversation should keep being threaded after being disconnected.")
  @JsonProperty("timeoutInMinutes")
  public Long getTimeoutInMinutes() {
    return timeoutInMinutes;
  }
  public void setTimeoutInMinutes(Long timeoutInMinutes) {
    this.timeoutInMinutes = timeoutInMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailThreadingSettings emailThreadingSettings = (EmailThreadingSettings) o;

    return Objects.equals(this.startNewConversationOnSubjectChange, emailThreadingSettings.startNewConversationOnSubjectChange) &&
            Objects.equals(this.timeoutInMinutes, emailThreadingSettings.timeoutInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startNewConversationOnSubjectChange, timeoutInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailThreadingSettings {\n");
    
    sb.append("    startNewConversationOnSubjectChange: ").append(toIndentedString(startNewConversationOnSubjectChange)).append("\n");
    sb.append("    timeoutInMinutes: ").append(toIndentedString(timeoutInMinutes)).append("\n");
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

