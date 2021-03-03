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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.LexBot;
import com.mypurecloud.sdk.v2.model.LexIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LexBotAlias
 */

public class LexBotAlias  implements Serializable {
  
  private String id = null;
  private String name = null;
  private LexBot bot = null;
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
   * The status of the Lex bot alias
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BUILDING("BUILDING"),
    READY("READY"),
    FAILED("FAILED"),
    NOT_BUILT("NOT_BUILT");

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
  private String failureReason = null;

  private static class LanguageEnumDeserializer extends StdDeserializer<LanguageEnum> {
    public LanguageEnumDeserializer() {
      super(LanguageEnumDeserializer.class);
    }

    @Override
    public LanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The target language of the Lex bot
   */
 @JsonDeserialize(using = LanguageEnumDeserializer.class)
  public enum LanguageEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-US");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageEnum value : LanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageEnum language = null;
  private List<LexIntent> intents = new ArrayList<LexIntent>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public LexBotAlias name(String name) {
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
   * The Lex bot this is an alias for
   **/
  public LexBotAlias bot(LexBot bot) {
    this.bot = bot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Lex bot this is an alias for")
  @JsonProperty("bot")
  public LexBot getBot() {
    return bot;
  }
  public void setBot(LexBot bot) {
    this.bot = bot;
  }

  
  /**
   * The version of the Lex bot this alias points at
   **/
  public LexBotAlias botVersion(String botVersion) {
    this.botVersion = botVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the Lex bot this alias points at")
  @JsonProperty("botVersion")
  public String getBotVersion() {
    return botVersion;
  }
  public void setBotVersion(String botVersion) {
    this.botVersion = botVersion;
  }

  
  /**
   * The status of the Lex bot alias
   **/
  public LexBotAlias status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the Lex bot alias")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * If the status is FAILED, Amazon Lex explains why it failed to build the bot
   **/
  public LexBotAlias failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the status is FAILED, Amazon Lex explains why it failed to build the bot")
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  
  /**
   * The target language of the Lex bot
   **/
  public LexBotAlias language(LanguageEnum language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target language of the Lex bot")
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  
  /**
   * An array of Intents associated with this bot alias
   **/
  public LexBotAlias intents(List<LexIntent> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of Intents associated with this bot alias")
  @JsonProperty("intents")
  public List<LexIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<LexIntent> intents) {
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
    LexBotAlias lexBotAlias = (LexBotAlias) o;
    return Objects.equals(this.id, lexBotAlias.id) &&
        Objects.equals(this.name, lexBotAlias.name) &&
        Objects.equals(this.bot, lexBotAlias.bot) &&
        Objects.equals(this.botVersion, lexBotAlias.botVersion) &&
        Objects.equals(this.status, lexBotAlias.status) &&
        Objects.equals(this.failureReason, lexBotAlias.failureReason) &&
        Objects.equals(this.language, lexBotAlias.language) &&
        Objects.equals(this.intents, lexBotAlias.intents) &&
        Objects.equals(this.selfUri, lexBotAlias.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bot, botVersion, status, failureReason, language, intents, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexBotAlias {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

