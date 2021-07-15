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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * NuanceMixDlgSettings
 */

public class NuanceMixDlgSettings  implements Serializable {
  
  private String channelId = null;
  private Map<String, Object> inputParameters = null;

  
  /**
   * The Nuance channel ID to use when launching the Nuance bot, which must one of the code names of the bot's registered input channels.
   **/
  public NuanceMixDlgSettings channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Nuance channel ID to use when launching the Nuance bot, which must one of the code names of the bot's registered input channels.")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  /**
   * Name/value pairs of input variables to be sent to the Nuance bot. The values must be in the appropriate format for the variable's type (see https://docs.mix.nuance.com/dialog-grpc/v1/#simple-variable-types for help)
   **/
  public NuanceMixDlgSettings inputParameters(Map<String, Object> inputParameters) {
    this.inputParameters = inputParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name/value pairs of input variables to be sent to the Nuance bot. The values must be in the appropriate format for the variable's type (see https://docs.mix.nuance.com/dialog-grpc/v1/#simple-variable-types for help)")
  @JsonProperty("inputParameters")
  public Map<String, Object> getInputParameters() {
    return inputParameters;
  }
  public void setInputParameters(Map<String, Object> inputParameters) {
    this.inputParameters = inputParameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceMixDlgSettings nuanceMixDlgSettings = (NuanceMixDlgSettings) o;
    return Objects.equals(this.channelId, nuanceMixDlgSettings.channelId) &&
        Objects.equals(this.inputParameters, nuanceMixDlgSettings.inputParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, inputParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceMixDlgSettings {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    inputParameters: ").append(toIndentedString(inputParameters)).append("\n");
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

