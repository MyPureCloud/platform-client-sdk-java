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
import com.mypurecloud.sdk.v2.model.BotConnectorBotVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A botConnector Bot Instance
 */
@ApiModel(description = "A botConnector Bot Instance")

public class BotConnectorBot  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<BotConnectorBotVersion> versions = new ArrayList<BotConnectorBotVersion>();
  private String botCompositeTag = null;
  private String selfUri = null;

  
  /**
   * The Botconnector Bot Id - this is configurable by the user when put
   **/
  public BotConnectorBot id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Botconnector Bot Id - this is configurable by the user when put")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public BotConnectorBot name(String name) {
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
   * An optional description of the bot.  This can be up to 256 characters long and must be comprised of displayable characters without leading or trailing whitespace
   **/
  public BotConnectorBot description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional description of the bot.  This can be up to 256 characters long and must be comprised of displayable characters without leading or trailing whitespace")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * This bots versions, limit of 50 per bot
   **/
  public BotConnectorBot versions(List<BotConnectorBotVersion> versions) {
    this.versions = versions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bots versions, limit of 50 per bot")
  @JsonProperty("versions")
  public List<BotConnectorBotVersion> getVersions() {
    return versions;
  }
  public void setVersions(List<BotConnectorBotVersion> versions) {
    this.versions = versions;
  }

  
  @ApiModelProperty(example = "null", value = "A system-generated string that contains metadata about this bot.")
  @JsonProperty("botCompositeTag")
  public String getBotCompositeTag() {
    return botCompositeTag;
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
    BotConnectorBot botConnectorBot = (BotConnectorBot) o;
    return Objects.equals(this.id, botConnectorBot.id) &&
        Objects.equals(this.name, botConnectorBot.name) &&
        Objects.equals(this.description, botConnectorBot.description) &&
        Objects.equals(this.versions, botConnectorBot.versions) &&
        Objects.equals(this.botCompositeTag, botConnectorBot.botCompositeTag) &&
        Objects.equals(this.selfUri, botConnectorBot.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, versions, botCompositeTag, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotConnectorBot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

