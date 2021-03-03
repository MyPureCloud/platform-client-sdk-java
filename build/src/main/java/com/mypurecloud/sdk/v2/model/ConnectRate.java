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
 * ConnectRate
 */

public class ConnectRate  implements Serializable {
  
  private Long attempts = null;
  private Long connects = null;
  private Double connectRatio = null;

  
  @ApiModelProperty(example = "null", value = "Number of call attempts made")
  @JsonProperty("attempts")
  public Long getAttempts() {
    return attempts;
  }

  
  @ApiModelProperty(example = "null", value = "Number of calls with a live voice detected")
  @JsonProperty("connects")
  public Long getConnects() {
    return connects;
  }

  
  @ApiModelProperty(example = "null", value = "Ratio of connects to attempts")
  @JsonProperty("connectRatio")
  public Double getConnectRatio() {
    return connectRatio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectRate connectRate = (ConnectRate) o;
    return Objects.equals(this.attempts, connectRate.attempts) &&
        Objects.equals(this.connects, connectRate.connects) &&
        Objects.equals(this.connectRatio, connectRate.connectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, connects, connectRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectRate {\n");
    
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    connects: ").append(toIndentedString(connects)).append("\n");
    sb.append("    connectRatio: ").append(toIndentedString(connectRatio)).append("\n");
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

