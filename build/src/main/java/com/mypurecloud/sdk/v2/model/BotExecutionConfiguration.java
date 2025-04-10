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
import com.mypurecloud.sdk.v2.model.NuanceBotCredentials;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Model for setting the launch configuration for a Nuance bot available to Genesys Cloud
 */
@ApiModel(description = "Model for setting the launch configuration for a Nuance bot available to Genesys Cloud")

public class BotExecutionConfiguration  implements Serializable {
  
  private String botId = null;
  private String executionHost = null;
  private NuanceBotCredentials botCredentials = null;

  public BotExecutionConfiguration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Nuance bot ID
   **/
  public BotExecutionConfiguration botId(String botId) {
    this.botId = botId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Nuance bot ID")
  @JsonProperty("botId")
  public String getBotId() {
    return botId;
  }
  public void setBotId(String botId) {
    this.botId = botId;
  }


  /**
   * The hostname to use when contacting Nuance to execute this bot
   **/
  public BotExecutionConfiguration executionHost(String executionHost) {
    this.executionHost = executionHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hostname to use when contacting Nuance to execute this bot")
  @JsonProperty("executionHost")
  public String getExecutionHost() {
    return executionHost;
  }
  public void setExecutionHost(String executionHost) {
    this.executionHost = executionHost;
  }


  /**
   * The bot's launch credentials
   **/
  public BotExecutionConfiguration botCredentials(NuanceBotCredentials botCredentials) {
    this.botCredentials = botCredentials;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bot's launch credentials")
  @JsonProperty("botCredentials")
  public NuanceBotCredentials getBotCredentials() {
    return botCredentials;
  }
  public void setBotCredentials(NuanceBotCredentials botCredentials) {
    this.botCredentials = botCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotExecutionConfiguration botExecutionConfiguration = (BotExecutionConfiguration) o;

    return Objects.equals(this.botId, botExecutionConfiguration.botId) &&
            Objects.equals(this.executionHost, botExecutionConfiguration.executionHost) &&
            Objects.equals(this.botCredentials, botExecutionConfiguration.botCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, executionHost, botCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotExecutionConfiguration {\n");
    
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    executionHost: ").append(toIndentedString(executionHost)).append("\n");
    sb.append("    botCredentials: ").append(toIndentedString(botCredentials)).append("\n");
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

