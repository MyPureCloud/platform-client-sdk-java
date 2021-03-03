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
 * GenesysBotConnector
 */

public class GenesysBotConnector  implements Serializable {
  
  private Map<String, String> queryParameters = null;

  
  /**
   * User defined name/value parameters passed to the BotConnector bot.
   **/
  public GenesysBotConnector queryParameters(Map<String, String> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User defined name/value parameters passed to the BotConnector bot.")
  @JsonProperty("queryParameters")
  public Map<String, String> getQueryParameters() {
    return queryParameters;
  }
  public void setQueryParameters(Map<String, String> queryParameters) {
    this.queryParameters = queryParameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenesysBotConnector genesysBotConnector = (GenesysBotConnector) o;
    return Objects.equals(this.queryParameters, genesysBotConnector.queryParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenesysBotConnector {\n");
    
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
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

