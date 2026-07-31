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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentComfortStatementSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Runtime behavior settings for a virtual agent.
 */
@ApiModel(description = "Runtime behavior settings for a virtual agent.")

public class AgenticVirtualAgentVersionSettings  implements Serializable {
  
  private AgenticVirtualAgentComfortStatementSettings comfortStatement = null;

  public AgenticVirtualAgentVersionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentVersionSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Comfort statement settings for tool calls.
   **/
  public AgenticVirtualAgentVersionSettings comfortStatement(AgenticVirtualAgentComfortStatementSettings comfortStatement) {
    this.comfortStatement = comfortStatement;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comfort statement settings for tool calls.")
  @JsonProperty("comfortStatement")
  public AgenticVirtualAgentComfortStatementSettings getComfortStatement() {
    return comfortStatement;
  }
  public void setComfortStatement(AgenticVirtualAgentComfortStatementSettings comfortStatement) {
    this.comfortStatement = comfortStatement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentVersionSettings agenticVirtualAgentVersionSettings = (AgenticVirtualAgentVersionSettings) o;

    return Objects.equals(this.comfortStatement, agenticVirtualAgentVersionSettings.comfortStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comfortStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentVersionSettings {\n");
    
    sb.append("    comfortStatement: ").append(toIndentedString(comfortStatement)).append("\n");
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

