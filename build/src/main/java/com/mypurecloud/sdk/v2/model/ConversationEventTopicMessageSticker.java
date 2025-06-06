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
 * ConversationEventTopicMessageSticker
 */

public class ConversationEventTopicMessageSticker  implements Serializable {
  
  private String url = null;
  private String id = null;

  public ConversationEventTopicMessageSticker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The location of the sticker, useful for retrieving it
   **/
  public ConversationEventTopicMessageSticker url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the sticker, useful for retrieving it")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * The unique id of the the sticker object.
   **/
  public ConversationEventTopicMessageSticker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique id of the the sticker object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventTopicMessageSticker conversationEventTopicMessageSticker = (ConversationEventTopicMessageSticker) o;

    return Objects.equals(this.url, conversationEventTopicMessageSticker.url) &&
            Objects.equals(this.id, conversationEventTopicMessageSticker.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicMessageSticker {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

