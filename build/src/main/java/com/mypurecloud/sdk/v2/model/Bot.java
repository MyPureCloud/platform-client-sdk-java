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
import com.mypurecloud.sdk.v2.model.BotVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A bot instance
 */
@ApiModel(description = "A bot instance")

public class Bot  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String provider = null;
  private List<BotVersion> versions = null;
  private String botCompositeTag = null;
  private String selfUri = null;

  public Bot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      versions = new ArrayList<BotVersion>();
    }
  }

  
  /**
   * This is a string type that should denote a unique ID of the bot for calling purposes by the Genesys service (EG a UUID).
   **/
  public Bot id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a string type that should denote a unique ID of the bot for calling purposes by the Genesys service (EG a UUID).")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * This is the name that will be displayed to the user in Architect.
   **/
  public Bot name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the name that will be displayed to the user in Architect.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * An optional description of the bot.
   **/
  public Bot description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional description of the bot.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The provider of the bot.
   **/
  public Bot provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The provider of the bot.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }


  /**
   * This bots version.
   **/
  public Bot versions(List<BotVersion> versions) {
    this.versions = versions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This bots version.")
  @JsonProperty("versions")
  public List<BotVersion> getVersions() {
    return versions;
  }
  public void setVersions(List<BotVersion> versions) {
    this.versions = versions;
  }


  /**
   * A system-generated string that contains metadata about this bot.
   **/
  public Bot botCompositeTag(String botCompositeTag) {
    this.botCompositeTag = botCompositeTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A system-generated string that contains metadata about this bot.")
  @JsonProperty("botCompositeTag")
  public String getBotCompositeTag() {
    return botCompositeTag;
  }
  public void setBotCompositeTag(String botCompositeTag) {
    this.botCompositeTag = botCompositeTag;
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
    Bot bot = (Bot) o;

    return Objects.equals(this.id, bot.id) &&
            Objects.equals(this.name, bot.name) &&
            Objects.equals(this.description, bot.description) &&
            Objects.equals(this.provider, bot.provider) &&
            Objects.equals(this.versions, bot.versions) &&
            Objects.equals(this.botCompositeTag, bot.botCompositeTag) &&
            Objects.equals(this.selfUri, bot.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, provider, versions, botCompositeTag, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    botCompositeTag: ").append(toIndentedString(botCompositeTag)).append("\n");
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

