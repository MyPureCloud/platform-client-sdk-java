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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NTPSettings
 */

public class NTPSettings  implements Serializable {
  
  private List<String> servers = new ArrayList<String>();

  
  /**
   * List of NTP servers, in priority order
   **/
  public NTPSettings servers(List<String> servers) {
    this.servers = servers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of NTP servers, in priority order")
  @JsonProperty("servers")
  public List<String> getServers() {
    return servers;
  }
  public void setServers(List<String> servers) {
    this.servers = servers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NTPSettings nTPSettings = (NTPSettings) o;
    return Objects.equals(this.servers, nTPSettings.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NTPSettings {\n");
    
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

