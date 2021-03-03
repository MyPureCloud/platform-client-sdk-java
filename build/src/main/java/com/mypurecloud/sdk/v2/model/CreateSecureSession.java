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
 * CreateSecureSession
 */

public class CreateSecureSession  implements Serializable {
  
  private String sourceParticipantId = null;
  private String flowId = null;
  private String userData = null;
  private Boolean disconnect = null;

  
  /**
   * requesting participant
   **/
  public CreateSecureSession sourceParticipantId(String sourceParticipantId) {
    this.sourceParticipantId = sourceParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "requesting participant")
  @JsonProperty("sourceParticipantId")
  public String getSourceParticipantId() {
    return sourceParticipantId;
  }
  public void setSourceParticipantId(String sourceParticipantId) {
    this.sourceParticipantId = sourceParticipantId;
  }

  
  /**
   * the flow id to execute in the secure session
   **/
  public CreateSecureSession flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the flow id to execute in the secure session")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  
  /**
   * user data for the secure session
   **/
  public CreateSecureSession userData(String userData) {
    this.userData = userData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "user data for the secure session")
  @JsonProperty("userData")
  public String getUserData() {
    return userData;
  }
  public void setUserData(String userData) {
    this.userData = userData;
  }

  
  /**
   * if true, disconnect the agent after creating the session
   **/
  public CreateSecureSession disconnect(Boolean disconnect) {
    this.disconnect = disconnect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "if true, disconnect the agent after creating the session")
  @JsonProperty("disconnect")
  public Boolean getDisconnect() {
    return disconnect;
  }
  public void setDisconnect(Boolean disconnect) {
    this.disconnect = disconnect;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSecureSession createSecureSession = (CreateSecureSession) o;
    return Objects.equals(this.sourceParticipantId, createSecureSession.sourceParticipantId) &&
        Objects.equals(this.flowId, createSecureSession.flowId) &&
        Objects.equals(this.userData, createSecureSession.userData) &&
        Objects.equals(this.disconnect, createSecureSession.disconnect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceParticipantId, flowId, userData, disconnect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSecureSession {\n");
    
    sb.append("    sourceParticipantId: ").append(toIndentedString(sourceParticipantId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    disconnect: ").append(toIndentedString(disconnect)).append("\n");
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

