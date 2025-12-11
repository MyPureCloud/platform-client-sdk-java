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
import com.mypurecloud.sdk.v2.model.GuideSessionTurnInvocationResponse;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnResponseData;
import com.mypurecloud.sdk.v2.model.GuideSessionVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Response for a guide session turn
 */
@ApiModel(description = "Response for a guide session turn")

public class GuideSessionTurnResponse  implements Serializable {
  
  private GuideSessionTurnResponseData response = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the turn.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED"),
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  private static class ResultEnumDeserializer extends StdDeserializer<ResultEnum> {
    public ResultEnumDeserializer() {
      super(ResultEnumDeserializer.class);
    }

    @Override
    public ResultEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResultEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The result of the turn.
   */
 @JsonDeserialize(using = ResultEnumDeserializer.class)
  public enum ResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESSFUL_COLLECTION("SUCCESSFUL_COLLECTION"),
    CONFIRMATION_REQUIRED("CONFIRMATION_REQUIRED"),
    ESCALATION_TRIGGERED("ESCALATION_TRIGGERED"),
    CLIENT_ACTION_REQUIRED("CLIENT_ACTION_REQUIRED"),
    NO_MATCH("NO_MATCH");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResultEnum fromString(String key) {
      if (key == null) return null;

      for (ResultEnum value : ResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResultEnum result = null;
  private List<GuideSessionVariable> outputVariables = null;
  private String invocationId = null;
  private List<GuideSessionTurnInvocationResponse> invocations = null;

  public GuideSessionTurnResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      outputVariables = new ArrayList<GuideSessionVariable>();
      invocations = new ArrayList<GuideSessionTurnInvocationResponse>();
    }
  }

  
  /**
   * The response content for this turn.
   **/
  public GuideSessionTurnResponse response(GuideSessionTurnResponseData response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The response content for this turn.")
  @JsonProperty("response")
  public GuideSessionTurnResponseData getResponse() {
    return response;
  }
  public void setResponse(GuideSessionTurnResponseData response) {
    this.response = response;
  }


  /**
   * The status of the turn.
   **/
  public GuideSessionTurnResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the turn.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The result of the turn.
   **/
  public GuideSessionTurnResponse result(ResultEnum result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the turn.")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  /**
   * The output variables for this turn.
   **/
  public GuideSessionTurnResponse outputVariables(List<GuideSessionVariable> outputVariables) {
    this.outputVariables = outputVariables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The output variables for this turn.")
  @JsonProperty("outputVariables")
  public List<GuideSessionVariable> getOutputVariables() {
    return outputVariables;
  }
  public void setOutputVariables(List<GuideSessionVariable> outputVariables) {
    this.outputVariables = outputVariables;
  }


  /**
   * Invocation ID for this turn.
   **/
  public GuideSessionTurnResponse invocationId(String invocationId) {
    this.invocationId = invocationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Invocation ID for this turn.")
  @JsonProperty("invocationId")
  public String getInvocationId() {
    return invocationId;
  }
  public void setInvocationId(String invocationId) {
    this.invocationId = invocationId;
  }


  /**
   * The invocations for this turn.
   **/
  public GuideSessionTurnResponse invocations(List<GuideSessionTurnInvocationResponse> invocations) {
    this.invocations = invocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The invocations for this turn.")
  @JsonProperty("invocations")
  public List<GuideSessionTurnInvocationResponse> getInvocations() {
    return invocations;
  }
  public void setInvocations(List<GuideSessionTurnInvocationResponse> invocations) {
    this.invocations = invocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionTurnResponse guideSessionTurnResponse = (GuideSessionTurnResponse) o;

    return Objects.equals(this.response, guideSessionTurnResponse.response) &&
            Objects.equals(this.status, guideSessionTurnResponse.status) &&
            Objects.equals(this.result, guideSessionTurnResponse.result) &&
            Objects.equals(this.outputVariables, guideSessionTurnResponse.outputVariables) &&
            Objects.equals(this.invocationId, guideSessionTurnResponse.invocationId) &&
            Objects.equals(this.invocations, guideSessionTurnResponse.invocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, status, result, outputVariables, invocationId, invocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionTurnResponse {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    outputVariables: ").append(toIndentedString(outputVariables)).append("\n");
    sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
    sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
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

