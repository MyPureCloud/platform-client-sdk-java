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
 * A version summary for a botConnector bot.
 */
@ApiModel(description = "A version summary for a botConnector bot.")

public class BotVersionSummary  implements Serializable {
  
  private String name = null;
  private String id = null;
  private String description = null;
  private String botCompositeTag = null;
  private String version = null;

  
  /**
   * The name of the bot.
   **/
  public BotVersionSummary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the bot.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The id of the bot.
   **/
  public BotVersionSummary id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the bot.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * An optional description of the bot.
   **/
  public BotVersionSummary description(String description) {
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

  
  @ApiModelProperty(example = "null", value = "A system-generated string that contains metadata about this bot.")
  @JsonProperty("botCompositeTag")
  public String getBotCompositeTag() {
    return botCompositeTag;
  }

  
  /**
   * The name of the version.
   **/
  public BotVersionSummary version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the version.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotVersionSummary botVersionSummary = (BotVersionSummary) o;
    return Objects.equals(this.name, botVersionSummary.name) &&
        Objects.equals(this.id, botVersionSummary.id) &&
        Objects.equals(this.description, botVersionSummary.description) &&
        Objects.equals(this.botCompositeTag, botVersionSummary.botCompositeTag) &&
        Objects.equals(this.version, botVersionSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, description, botCompositeTag, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotVersionSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    botCompositeTag: ").append(toIndentedString(botCompositeTag)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

