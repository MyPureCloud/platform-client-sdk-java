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

import java.io.Serializable;
/**
 * MessageStickerAttachment
 */

public class MessageStickerAttachment  implements Serializable {
  
  private String url = null;
  private String id = null;

  
  /**
   * The location of the media, useful for retrieving it
   **/
  public MessageStickerAttachment url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the media, useful for retrieving it")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * A globally unique identifier for the media object.
   **/
  public MessageStickerAttachment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the media object.")
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
    MessageStickerAttachment messageStickerAttachment = (MessageStickerAttachment) o;
    return Objects.equals(this.url, messageStickerAttachment.url) &&
        Objects.equals(this.id, messageStickerAttachment.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStickerAttachment {\n");
    
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

