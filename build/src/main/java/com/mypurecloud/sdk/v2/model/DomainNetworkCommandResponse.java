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
import com.mypurecloud.sdk.v2.model.ErrorDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DomainNetworkCommandResponse
 */

public class DomainNetworkCommandResponse  implements Serializable {
  
  private String correlationId = null;
  private String commandName = null;
  private Boolean acknowledged = null;
  private ErrorDetails errorInfo = null;

  
  /**
   **/
  public DomainNetworkCommandResponse correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  
  /**
   **/
  public DomainNetworkCommandResponse commandName(String commandName) {
    this.commandName = commandName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commandName")
  public String getCommandName() {
    return commandName;
  }
  public void setCommandName(String commandName) {
    this.commandName = commandName;
  }

  
  /**
   **/
  public DomainNetworkCommandResponse acknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acknowledged")
  public Boolean getAcknowledged() {
    return acknowledged;
  }
  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }

  
  /**
   **/
  public DomainNetworkCommandResponse errorInfo(ErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainNetworkCommandResponse domainNetworkCommandResponse = (DomainNetworkCommandResponse) o;
    return Objects.equals(this.correlationId, domainNetworkCommandResponse.correlationId) &&
        Objects.equals(this.commandName, domainNetworkCommandResponse.commandName) &&
        Objects.equals(this.acknowledged, domainNetworkCommandResponse.acknowledged) &&
        Objects.equals(this.errorInfo, domainNetworkCommandResponse.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, commandName, acknowledged, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainNetworkCommandResponse {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

