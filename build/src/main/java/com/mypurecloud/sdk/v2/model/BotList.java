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
import com.mypurecloud.sdk.v2.model.BotConnectorBot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A list of BotConnectorBots
 */
@ApiModel(description = "A list of BotConnectorBots")

public class BotList  implements Serializable {
  
  private List<BotConnectorBot> chatBots = new ArrayList<BotConnectorBot>();

  
  /**
   * A list of botConnector Bots. Max 50
   **/
  public BotList chatBots(List<BotConnectorBot> chatBots) {
    this.chatBots = chatBots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of botConnector Bots. Max 50")
  @JsonProperty("chatBots")
  public List<BotConnectorBot> getChatBots() {
    return chatBots;
  }
  public void setChatBots(List<BotConnectorBot> chatBots) {
    this.chatBots = chatBots;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotList botList = (BotList) o;
    return Objects.equals(this.chatBots, botList.chatBots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatBots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotList {\n");
    
    sb.append("    chatBots: ").append(toIndentedString(chatBots)).append("\n");
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

