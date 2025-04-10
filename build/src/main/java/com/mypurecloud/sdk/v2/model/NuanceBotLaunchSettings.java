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
import com.mypurecloud.sdk.v2.model.BotExecutionConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Model for setting the launch configuration for Nuance bots available to Genesys Cloud
 */
@ApiModel(description = "Model for setting the launch configuration for Nuance bots available to Genesys Cloud")

public class NuanceBotLaunchSettings  implements Serializable {
  
  private List<BotExecutionConfiguration> botExecutionConfigurations = null;

  public NuanceBotLaunchSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      botExecutionConfigurations = new ArrayList<BotExecutionConfiguration>();
    }
  }

  
  /**
   * The list of Nuance bots that are configured as available to the Genesys Cloud system
   **/
  public NuanceBotLaunchSettings botExecutionConfigurations(List<BotExecutionConfiguration> botExecutionConfigurations) {
    this.botExecutionConfigurations = botExecutionConfigurations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of Nuance bots that are configured as available to the Genesys Cloud system")
  @JsonProperty("botExecutionConfigurations")
  public List<BotExecutionConfiguration> getBotExecutionConfigurations() {
    return botExecutionConfigurations;
  }
  public void setBotExecutionConfigurations(List<BotExecutionConfiguration> botExecutionConfigurations) {
    this.botExecutionConfigurations = botExecutionConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceBotLaunchSettings nuanceBotLaunchSettings = (NuanceBotLaunchSettings) o;

    return Objects.equals(this.botExecutionConfigurations, nuanceBotLaunchSettings.botExecutionConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botExecutionConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceBotLaunchSettings {\n");
    
    sb.append("    botExecutionConfigurations: ").append(toIndentedString(botExecutionConfigurations)).append("\n");
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

