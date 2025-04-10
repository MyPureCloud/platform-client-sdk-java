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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.LexV2Bot;
import com.mypurecloud.sdk.v2.model.LexV2Intent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LexV2BotAlias
 */

public class LexV2BotAlias  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String region = null;
  private String aliasId = null;
  private LexV2Bot bot = null;
  private String botVersion = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the Lex V2 bot alias
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATING("Creating"),
    AVAILABLE("Available"),
    DELETING("Deleting"),
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String language = null;
  private List<LexV2Intent> intents = null;
  private String selfUri = null;

  public LexV2BotAlias() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intents = new ArrayList<LexV2Intent>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public LexV2BotAlias name(String name) {
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
   * The Lex V2 bot region
   **/
  public LexV2BotAlias region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Lex V2 bot region")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * The Lex V2 bot alias Id
   **/
  public LexV2BotAlias aliasId(String aliasId) {
    this.aliasId = aliasId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Lex V2 bot alias Id")
  @JsonProperty("aliasId")
  public String getAliasId() {
    return aliasId;
  }
  public void setAliasId(String aliasId) {
    this.aliasId = aliasId;
  }


  /**
   * The Lex V2 bot this is an alias for
   **/
  public LexV2BotAlias bot(LexV2Bot bot) {
    this.bot = bot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Lex V2 bot this is an alias for")
  @JsonProperty("bot")
  public LexV2Bot getBot() {
    return bot;
  }
  public void setBot(LexV2Bot bot) {
    this.bot = bot;
  }


  /**
   * The version of the Lex V2 bot this alias points at
   **/
  public LexV2BotAlias botVersion(String botVersion) {
    this.botVersion = botVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the Lex V2 bot this alias points at")
  @JsonProperty("botVersion")
  public String getBotVersion() {
    return botVersion;
  }
  public void setBotVersion(String botVersion) {
    this.botVersion = botVersion;
  }


  /**
   * The status of the Lex V2 bot alias
   **/
  public LexV2BotAlias status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Lex V2 bot alias")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The target language of the Lex V2 bot
   **/
  public LexV2BotAlias language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target language of the Lex V2 bot")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * An array of Intents associated with this bot alias
   **/
  public LexV2BotAlias intents(List<LexV2Intent> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of Intents associated with this bot alias")
  @JsonProperty("intents")
  public List<LexV2Intent> getIntents() {
    return intents;
  }
  public void setIntents(List<LexV2Intent> intents) {
    this.intents = intents;
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
    LexV2BotAlias lexV2BotAlias = (LexV2BotAlias) o;

    return Objects.equals(this.id, lexV2BotAlias.id) &&
            Objects.equals(this.name, lexV2BotAlias.name) &&
            Objects.equals(this.region, lexV2BotAlias.region) &&
            Objects.equals(this.aliasId, lexV2BotAlias.aliasId) &&
            Objects.equals(this.bot, lexV2BotAlias.bot) &&
            Objects.equals(this.botVersion, lexV2BotAlias.botVersion) &&
            Objects.equals(this.status, lexV2BotAlias.status) &&
            Objects.equals(this.language, lexV2BotAlias.language) &&
            Objects.equals(this.intents, lexV2BotAlias.intents) &&
            Objects.equals(this.selfUri, lexV2BotAlias.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, region, aliasId, bot, botVersion, status, language, intents, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexV2BotAlias {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    aliasId: ").append(toIndentedString(aliasId)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

