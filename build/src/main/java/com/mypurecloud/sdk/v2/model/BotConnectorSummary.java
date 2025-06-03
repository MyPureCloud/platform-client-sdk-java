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
import com.mypurecloud.sdk.v2.model.BotConnectorVersionSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A summary description for a bot
 */
@ApiModel(description = "A summary description for a bot")

public class BotConnectorSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String botCompositeTag = null;
  private List<BotConnectorVersionSummary> versions = null;

  public BotConnectorSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      versions = new ArrayList<BotConnectorVersionSummary>();
    }
  }

  
  /**
   * The id of the bot.
   **/
  public BotConnectorSummary id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the bot.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the bot.
   **/
  public BotConnectorSummary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the bot.")
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
  public BotConnectorSummary description(String description) {
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
   * A system-generated string that contains metadata about this bot.
   **/
  public BotConnectorSummary botCompositeTag(String botCompositeTag) {
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


  /**
   * This bots version.
   **/
  public BotConnectorSummary versions(List<BotConnectorVersionSummary> versions) {
    this.versions = versions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This bots version.")
  @JsonProperty("versions")
  public List<BotConnectorVersionSummary> getVersions() {
    return versions;
  }
  public void setVersions(List<BotConnectorVersionSummary> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotConnectorSummary botConnectorSummary = (BotConnectorSummary) o;

    return Objects.equals(this.id, botConnectorSummary.id) &&
            Objects.equals(this.name, botConnectorSummary.name) &&
            Objects.equals(this.description, botConnectorSummary.description) &&
            Objects.equals(this.botCompositeTag, botConnectorSummary.botCompositeTag) &&
            Objects.equals(this.versions, botConnectorSummary.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, botCompositeTag, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotConnectorSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    botCompositeTag: ").append(toIndentedString(botCompositeTag)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

