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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BotSearchResponse
 */

public class BotSearchResponse  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class BotTypeEnumDeserializer extends StdDeserializer<BotTypeEnum> {
    public BotTypeEnumDeserializer() {
      super(BotTypeEnumDeserializer.class);
    }

    @Override
    public BotTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The provider of the bot
   */
 @JsonDeserialize(using = BotTypeEnumDeserializer.class)
  public enum BotTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENESYSBOTCONNECTOR("GenesysBotConnector"),
    GENESYSDIALOGENGINE("GenesysDialogEngine"),
    AMAZONLEX("AmazonLex"),
    GOOGLEDIALOGFLOWES("GoogleDialogFlowES"),
    GOOGLEDIALOGFLOWCX("GoogleDialogFlowCX"),
    NUANCEDLG("NuanceDlg"),
    GENESYSBOTFLOW("GenesysBotFlow"),
    GENESYSDIGITALBOTFLOW("GenesysDigitalBotFlow"),
    GENESYSVOICESURVEYFLOW("GenesysVoiceSurveyFlow"),
    GENESYSDIGITALBOTCONNECTOR("GenesysDigitalBotConnector");

    private String value;

    BotTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotTypeEnum fromString(String key) {
      if (key == null) return null;

      for (BotTypeEnum value : BotTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BotTypeEnum botType = null;
  private String description = null;
  private Boolean virtualAgentEnabled = null;
  private String selfUri = null;

  public BotSearchResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id of the bot
   **/
  public BotSearchResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the bot")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the bot
   **/
  public BotSearchResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the bot")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The provider of the bot
   **/
  public BotSearchResponse botType(BotTypeEnum botType) {
    this.botType = botType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The provider of the bot")
  @JsonProperty("botType")
  public BotTypeEnum getBotType() {
    return botType;
  }
  public void setBotType(BotTypeEnum botType) {
    this.botType = botType;
  }


  /**
   * The description of the bot
   **/
  public BotSearchResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the bot")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Whether the bot is a virtual agent or not
   **/
  public BotSearchResponse virtualAgentEnabled(Boolean virtualAgentEnabled) {
    this.virtualAgentEnabled = virtualAgentEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the bot is a virtual agent or not")
  @JsonProperty("virtualAgentEnabled")
  public Boolean getVirtualAgentEnabled() {
    return virtualAgentEnabled;
  }
  public void setVirtualAgentEnabled(Boolean virtualAgentEnabled) {
    this.virtualAgentEnabled = virtualAgentEnabled;
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
    BotSearchResponse botSearchResponse = (BotSearchResponse) o;

    return Objects.equals(this.id, botSearchResponse.id) &&
            Objects.equals(this.name, botSearchResponse.name) &&
            Objects.equals(this.botType, botSearchResponse.botType) &&
            Objects.equals(this.description, botSearchResponse.description) &&
            Objects.equals(this.virtualAgentEnabled, botSearchResponse.virtualAgentEnabled) &&
            Objects.equals(this.selfUri, botSearchResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, botType, description, virtualAgentEnabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotSearchResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    virtualAgentEnabled: ").append(toIndentedString(virtualAgentEnabled)).append("\n");
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

