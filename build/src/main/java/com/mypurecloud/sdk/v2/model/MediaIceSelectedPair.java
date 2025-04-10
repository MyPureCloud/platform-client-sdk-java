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
import com.mypurecloud.sdk.v2.model.MediaIceSelectedCandidate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MediaIceSelectedPair
 */

public class MediaIceSelectedPair  implements Serializable {
  
  private MediaIceSelectedCandidate client = null;
  private MediaIceSelectedCandidate server = null;
  private Long candidatePairSelectedMilliseconds = null;

  public MediaIceSelectedPair() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The remote candidate that was chosen
   **/
  public MediaIceSelectedPair client(MediaIceSelectedCandidate client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The remote candidate that was chosen")
  @JsonProperty("client")
  public MediaIceSelectedCandidate getClient() {
    return client;
  }
  public void setClient(MediaIceSelectedCandidate client) {
    this.client = client;
  }


  /**
   * The local candidate that was chosen
   **/
  public MediaIceSelectedPair server(MediaIceSelectedCandidate server) {
    this.server = server;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The local candidate that was chosen")
  @JsonProperty("server")
  public MediaIceSelectedCandidate getServer() {
    return server;
  }
  public void setServer(MediaIceSelectedCandidate server) {
    this.server = server;
  }


  /**
   * Relative milliseconds since creation of endpoint when this ICE candidate pair has been selected
   **/
  public MediaIceSelectedPair candidatePairSelectedMilliseconds(Long candidatePairSelectedMilliseconds) {
    this.candidatePairSelectedMilliseconds = candidatePairSelectedMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Relative milliseconds since creation of endpoint when this ICE candidate pair has been selected")
  @JsonProperty("candidatePairSelectedMilliseconds")
  public Long getCandidatePairSelectedMilliseconds() {
    return candidatePairSelectedMilliseconds;
  }
  public void setCandidatePairSelectedMilliseconds(Long candidatePairSelectedMilliseconds) {
    this.candidatePairSelectedMilliseconds = candidatePairSelectedMilliseconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaIceSelectedPair mediaIceSelectedPair = (MediaIceSelectedPair) o;

    return Objects.equals(this.client, mediaIceSelectedPair.client) &&
            Objects.equals(this.server, mediaIceSelectedPair.server) &&
            Objects.equals(this.candidatePairSelectedMilliseconds, mediaIceSelectedPair.candidatePairSelectedMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, server, candidatePairSelectedMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaIceSelectedPair {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    candidatePairSelectedMilliseconds: ").append(toIndentedString(candidatePairSelectedMilliseconds)).append("\n");
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

