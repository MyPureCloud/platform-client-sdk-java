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
import com.mypurecloud.sdk.v2.model.InboundOnlySetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * StorySetting
 */

public class StorySetting  implements Serializable {
  
  private InboundOnlySetting mention = null;
  private InboundOnlySetting reply = null;

  public StorySetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Setting relating to Story Mentions
   **/
  public StorySetting mention(InboundOnlySetting mention) {
    this.mention = mention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting relating to Story Mentions")
  @JsonProperty("mention")
  public InboundOnlySetting getMention() {
    return mention;
  }
  public void setMention(InboundOnlySetting mention) {
    this.mention = mention;
  }


  /**
   * Setting relating to Story Replies
   **/
  public StorySetting reply(InboundOnlySetting reply) {
    this.reply = reply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting relating to Story Replies")
  @JsonProperty("reply")
  public InboundOnlySetting getReply() {
    return reply;
  }
  public void setReply(InboundOnlySetting reply) {
    this.reply = reply;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorySetting storySetting = (StorySetting) o;

    return Objects.equals(this.mention, storySetting.mention) &&
            Objects.equals(this.reply, storySetting.reply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mention, reply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorySetting {\n");
    
    sb.append("    mention: ").append(toIndentedString(mention)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
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

