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
import com.mypurecloud.sdk.v2.model.SocialMediaDetailMessageContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SocialMediaDetailDataContainer
 */

public class SocialMediaDetailDataContainer  implements Serializable {
  
  private String interval = null;
  private List<SocialMediaDetailMessageContainer> messages = null;

  public SocialMediaDetailDataContainer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      messages = new ArrayList<SocialMediaDetailMessageContainer>();
    }
  }

  
  /**
   **/
  public SocialMediaDetailDataContainer interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   **/
  public SocialMediaDetailDataContainer messages(List<SocialMediaDetailMessageContainer> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<SocialMediaDetailMessageContainer> getMessages() {
    return messages;
  }
  public void setMessages(List<SocialMediaDetailMessageContainer> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialMediaDetailDataContainer socialMediaDetailDataContainer = (SocialMediaDetailDataContainer) o;

    return Objects.equals(this.interval, socialMediaDetailDataContainer.interval) &&
            Objects.equals(this.messages, socialMediaDetailDataContainer.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialMediaDetailDataContainer {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

