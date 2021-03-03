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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SecureSession
 */

public class SecureSession  implements Serializable {
  
  private String id = null;
  private DomainEntityRef flow = null;
  private String userData = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current state of a secure session
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String sourceParticipantId = null;
  private Boolean disconnect = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The flow to execute securely
   **/
  public SecureSession flow(DomainEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow to execute securely")
  @JsonProperty("flow")
  public DomainEntityRef getFlow() {
    return flow;
  }
  public void setFlow(DomainEntityRef flow) {
    this.flow = flow;
  }

  
  /**
   * Customer-provided data
   **/
  public SecureSession userData(String userData) {
    this.userData = userData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer-provided data")
  @JsonProperty("userData")
  public String getUserData() {
    return userData;
  }
  public void setUserData(String userData) {
    this.userData = userData;
  }

  
  /**
   * The current state of a secure session
   **/
  public SecureSession state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current state of a secure session")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Unique identifier for the participant initiating the secure session.
   **/
  public SecureSession sourceParticipantId(String sourceParticipantId) {
    this.sourceParticipantId = sourceParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the participant initiating the secure session.")
  @JsonProperty("sourceParticipantId")
  public String getSourceParticipantId() {
    return sourceParticipantId;
  }
  public void setSourceParticipantId(String sourceParticipantId) {
    this.sourceParticipantId = sourceParticipantId;
  }

  
  /**
   * If true, disconnect the agent after creating the session
   **/
  public SecureSession disconnect(Boolean disconnect) {
    this.disconnect = disconnect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, disconnect the agent after creating the session")
  @JsonProperty("disconnect")
  public Boolean getDisconnect() {
    return disconnect;
  }
  public void setDisconnect(Boolean disconnect) {
    this.disconnect = disconnect;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureSession secureSession = (SecureSession) o;
    return Objects.equals(this.id, secureSession.id) &&
        Objects.equals(this.flow, secureSession.flow) &&
        Objects.equals(this.userData, secureSession.userData) &&
        Objects.equals(this.state, secureSession.state) &&
        Objects.equals(this.sourceParticipantId, secureSession.sourceParticipantId) &&
        Objects.equals(this.disconnect, secureSession.disconnect) &&
        Objects.equals(this.selfUri, secureSession.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flow, userData, state, sourceParticipantId, disconnect, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sourceParticipantId: ").append(toIndentedString(sourceParticipantId)).append("\n");
    sb.append("    disconnect: ").append(toIndentedString(disconnect)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

