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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ReportingTurnAction;
import com.mypurecloud.sdk.v2.model.ReportingTurnFlow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingTurnBotFlowInvocationEvent
 */

public class ReportingTurnBotFlowInvocationEvent  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Represents the type of invocation event which occurred.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("Call"),
    RETURNTO("ReturnTo"),
    RETURNFROM("ReturnFrom"),
    INITIALINVOKE("InitialInvoke");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private ReportingTurnAction action = null;
  private ReportingTurnFlow flow = null;

  public ReportingTurnBotFlowInvocationEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Represents the type of invocation event which occurred.
   **/
  public ReportingTurnBotFlowInvocationEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the type of invocation event which occurred.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The action in which the event occurred.
   **/
  public ReportingTurnBotFlowInvocationEvent action(ReportingTurnAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action in which the event occurred.")
  @JsonProperty("action")
  public ReportingTurnAction getAction() {
    return action;
  }
  public void setAction(ReportingTurnAction action) {
    this.action = action;
  }


  /**
   * The details relating to the invoking or invoked flow.
   **/
  public ReportingTurnBotFlowInvocationEvent flow(ReportingTurnFlow flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The details relating to the invoking or invoked flow.")
  @JsonProperty("flow")
  public ReportingTurnFlow getFlow() {
    return flow;
  }
  public void setFlow(ReportingTurnFlow flow) {
    this.flow = flow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnBotFlowInvocationEvent reportingTurnBotFlowInvocationEvent = (ReportingTurnBotFlowInvocationEvent) o;

    return Objects.equals(this.type, reportingTurnBotFlowInvocationEvent.type) &&
            Objects.equals(this.action, reportingTurnBotFlowInvocationEvent.action) &&
            Objects.equals(this.flow, reportingTurnBotFlowInvocationEvent.flow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, flow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnBotFlowInvocationEvent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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

