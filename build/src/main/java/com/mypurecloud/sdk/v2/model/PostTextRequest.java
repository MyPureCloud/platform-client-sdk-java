package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AmazonLexRequest;
import com.mypurecloud.sdk.v2.model.GoogleDialogflowCustomSettings;
import com.mypurecloud.sdk.v2.model.PostTextMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PostTextRequest
 */

public class PostTextRequest  implements Serializable {
  
  private String botId = null;
  private String botAlias = null;
  private String integrationId = null;
  private String botSessionId = null;
  private PostTextMessage postTextMessage = null;
  private String languageCode = null;
  private Integer botSessionTimeoutMinutes = null;

  /**
   * Gets or Sets botChannels
   */
  public enum BotChannelsEnum {
    CALL("Call"),
    CALLBACK("Callback"),
    MESSAGING("Messaging"),
    WEBCHAT("Webchat");

    private String value;

    BotChannelsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotChannelsEnum fromString(String key) {
      if (key == null) return null;

      for (BotChannelsEnum value : BotChannelsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotChannelsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotChannelsEnum> botChannels = new ArrayList<BotChannelsEnum>();
  private String botCorrelationId = null;
  private AmazonLexRequest amazonLexRequest = null;
  private GoogleDialogflowCustomSettings googleDialogflow = null;

  
  /**
   * ID of the bot to send the text to.
   **/
  public PostTextRequest botId(String botId) {
    this.botId = botId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the bot to send the text to.")
  @JsonProperty("botId")
  public String getBotId() {
    return botId;
  }
  public void setBotId(String botId) {
    this.botId = botId;
  }

  
  /**
   * Alias/Version of the bot
   **/
  public PostTextRequest botAlias(String botAlias) {
    this.botAlias = botAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias/Version of the bot")
  @JsonProperty("botAlias")
  public String getBotAlias() {
    return botAlias;
  }
  public void setBotAlias(String botAlias) {
    this.botAlias = botAlias;
  }

  
  /**
   * the integration service id for the bot's credentials
   **/
  public PostTextRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the integration service id for the bot's credentials")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  
  /**
   * GUID for this bot's session
   **/
  public PostTextRequest botSessionId(String botSessionId) {
    this.botSessionId = botSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "GUID for this bot's session")
  @JsonProperty("botSessionId")
  public String getBotSessionId() {
    return botSessionId;
  }
  public void setBotSessionId(String botSessionId) {
    this.botSessionId = botSessionId;
  }

  
  /**
   * Message to send to the bot
   **/
  public PostTextRequest postTextMessage(PostTextMessage postTextMessage) {
    this.postTextMessage = postTextMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message to send to the bot")
  @JsonProperty("postTextMessage")
  public PostTextMessage getPostTextMessage() {
    return postTextMessage;
  }
  public void setPostTextMessage(PostTextMessage postTextMessage) {
    this.postTextMessage = postTextMessage;
  }

  
  /**
   * The launguage code the bot will run under
   **/
  public PostTextRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The launguage code the bot will run under")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   * Override timeout for the bot session. This should be greater than 10 minutes.
   **/
  public PostTextRequest botSessionTimeoutMinutes(Integer botSessionTimeoutMinutes) {
    this.botSessionTimeoutMinutes = botSessionTimeoutMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Override timeout for the bot session. This should be greater than 10 minutes.")
  @JsonProperty("botSessionTimeoutMinutes")
  public Integer getBotSessionTimeoutMinutes() {
    return botSessionTimeoutMinutes;
  }
  public void setBotSessionTimeoutMinutes(Integer botSessionTimeoutMinutes) {
    this.botSessionTimeoutMinutes = botSessionTimeoutMinutes;
  }

  
  /**
   * The channels this bot is utilizing
   **/
  public PostTextRequest botChannels(List<BotChannelsEnum> botChannels) {
    this.botChannels = botChannels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The channels this bot is utilizing")
  @JsonProperty("botChannels")
  public List<BotChannelsEnum> getBotChannels() {
    return botChannels;
  }
  public void setBotChannels(List<BotChannelsEnum> botChannels) {
    this.botChannels = botChannels;
  }

  
  /**
   * Id for tracking the activity - this will be returned in the response
   **/
  public PostTextRequest botCorrelationId(String botCorrelationId) {
    this.botCorrelationId = botCorrelationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id for tracking the activity - this will be returned in the response")
  @JsonProperty("botCorrelationId")
  public String getBotCorrelationId() {
    return botCorrelationId;
  }
  public void setBotCorrelationId(String botCorrelationId) {
    this.botCorrelationId = botCorrelationId;
  }

  
  /**
   **/
  public PostTextRequest amazonLexRequest(AmazonLexRequest amazonLexRequest) {
    this.amazonLexRequest = amazonLexRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("amazonLexRequest")
  public AmazonLexRequest getAmazonLexRequest() {
    return amazonLexRequest;
  }
  public void setAmazonLexRequest(AmazonLexRequest amazonLexRequest) {
    this.amazonLexRequest = amazonLexRequest;
  }

  
  /**
   **/
  public PostTextRequest googleDialogflow(GoogleDialogflowCustomSettings googleDialogflow) {
    this.googleDialogflow = googleDialogflow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("googleDialogflow")
  public GoogleDialogflowCustomSettings getGoogleDialogflow() {
    return googleDialogflow;
  }
  public void setGoogleDialogflow(GoogleDialogflowCustomSettings googleDialogflow) {
    this.googleDialogflow = googleDialogflow;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTextRequest postTextRequest = (PostTextRequest) o;
    return Objects.equals(this.botId, postTextRequest.botId) &&
        Objects.equals(this.botAlias, postTextRequest.botAlias) &&
        Objects.equals(this.integrationId, postTextRequest.integrationId) &&
        Objects.equals(this.botSessionId, postTextRequest.botSessionId) &&
        Objects.equals(this.postTextMessage, postTextRequest.postTextMessage) &&
        Objects.equals(this.languageCode, postTextRequest.languageCode) &&
        Objects.equals(this.botSessionTimeoutMinutes, postTextRequest.botSessionTimeoutMinutes) &&
        Objects.equals(this.botChannels, postTextRequest.botChannels) &&
        Objects.equals(this.botCorrelationId, postTextRequest.botCorrelationId) &&
        Objects.equals(this.amazonLexRequest, postTextRequest.amazonLexRequest) &&
        Objects.equals(this.googleDialogflow, postTextRequest.googleDialogflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, botAlias, integrationId, botSessionId, postTextMessage, languageCode, botSessionTimeoutMinutes, botChannels, botCorrelationId, amazonLexRequest, googleDialogflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTextRequest {\n");
    
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botAlias: ").append(toIndentedString(botAlias)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    botSessionId: ").append(toIndentedString(botSessionId)).append("\n");
    sb.append("    postTextMessage: ").append(toIndentedString(postTextMessage)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    botSessionTimeoutMinutes: ").append(toIndentedString(botSessionTimeoutMinutes)).append("\n");
    sb.append("    botChannels: ").append(toIndentedString(botChannels)).append("\n");
    sb.append("    botCorrelationId: ").append(toIndentedString(botCorrelationId)).append("\n");
    sb.append("    amazonLexRequest: ").append(toIndentedString(amazonLexRequest)).append("\n");
    sb.append("    googleDialogflow: ").append(toIndentedString(googleDialogflow)).append("\n");
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

