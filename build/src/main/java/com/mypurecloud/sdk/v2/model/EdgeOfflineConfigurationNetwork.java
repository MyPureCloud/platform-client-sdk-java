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
import com.mypurecloud.sdk.v2.model.EdgeOfflineConfigurationInterface;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeOfflineConfigurationNetwork
 */

public class EdgeOfflineConfigurationNetwork  implements Serializable {
  
  private EdgeOfflineConfigurationInterface wan = null;

  public EdgeOfflineConfigurationNetwork() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public EdgeOfflineConfigurationNetwork(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Settings for the Edge WAN interface.
   **/
  public EdgeOfflineConfigurationNetwork wan(EdgeOfflineConfigurationInterface wan) {
    this.wan = wan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for the Edge WAN interface.")
  @JsonProperty("wan")
  public EdgeOfflineConfigurationInterface getWan() {
    return wan;
  }
  public void setWan(EdgeOfflineConfigurationInterface wan) {
    this.wan = wan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeOfflineConfigurationNetwork edgeOfflineConfigurationNetwork = (EdgeOfflineConfigurationNetwork) o;

    return Objects.equals(this.wan, edgeOfflineConfigurationNetwork.wan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeOfflineConfigurationNetwork {\n");
    
    sb.append("    wan: ").append(toIndentedString(wan)).append("\n");
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

