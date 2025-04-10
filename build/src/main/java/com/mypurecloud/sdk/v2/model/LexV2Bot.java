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
 * LexV2Bot
 */

public class LexV2Bot  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String botId = null;
  private String region = null;
  private String description = null;
  private String selfUri = null;

  public LexV2Bot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public LexV2Bot name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Lex V2 bot Id
   **/
  public LexV2Bot botId(String botId) {
    this.botId = botId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lex V2 bot Id")
  @JsonProperty("botId")
  public String getBotId() {
    return botId;
  }
  public void setBotId(String botId) {
    this.botId = botId;
  }


  /**
   * A region of the Lex V2 bot
   **/
  public LexV2Bot region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A region of the Lex V2 bot")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * A description of the Lex V2 bot
   **/
  public LexV2Bot description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the Lex V2 bot")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexV2Bot lexV2Bot = (LexV2Bot) o;

    return Objects.equals(this.id, lexV2Bot.id) &&
            Objects.equals(this.name, lexV2Bot.name) &&
            Objects.equals(this.botId, lexV2Bot.botId) &&
            Objects.equals(this.region, lexV2Bot.region) &&
            Objects.equals(this.description, lexV2Bot.description) &&
            Objects.equals(this.selfUri, lexV2Bot.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, botId, region, description, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexV2Bot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

