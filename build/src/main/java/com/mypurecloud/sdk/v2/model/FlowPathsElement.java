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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.FlowPathsFlowDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowPathsElement
 */

public class FlowPathsElement  implements Serializable {
  
  private String parentId = null;

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
   * Type of the element.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ABANDONED("Abandoned"),
    AGENTESCALATION("AgentEscalation"),
    DISCONNECT("Disconnect"),
    ERROR("Error"),
    EXIT("Exit"),
    MILESTONE("Milestone"),
    OUTCOME("Outcome"),
    RECOGNITIONFAILURE("RecognitionFailure"),
    ROOT("Root"),
    TRANSFERRETURNTOAGENT("TransferReturnToAgent"),
    TRANSFERTOACD("TransferToAcd"),
    TRANSFERTOACDVOICEMAIL("TransferToAcdVoicemail"),
    TRANSFERTOFLOW("TransferToFlow"),
    TRANSFERTOGROUP("TransferToGroup"),
    TRANSFERTOGROUPVOICEMAIL("TransferToGroupVoicemail"),
    TRANSFERTONUMBER("TransferToNumber"),
    TRANSFERTOSECUREFLOW("TransferToSecureFlow"),
    TRANSFERTOUNKNOWN("TransferToUnknown"),
    TRANSFERTOUSER("TransferToUser"),
    TRANSFERTOUSERVOICEMAIL("TransferToUserVoicemail");

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
  private Integer count = null;
  private List<FlowPathsFlowDetails> flows = new ArrayList<FlowPathsFlowDetails>();

  private static class FlowOutcomeValueEnumDeserializer extends StdDeserializer<FlowOutcomeValueEnum> {
    public FlowOutcomeValueEnumDeserializer() {
      super(FlowOutcomeValueEnumDeserializer.class);
    }

    @Override
    public FlowOutcomeValueEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowOutcomeValueEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The value of the flow outcome, if the element type is Outcome.
   */
 @JsonDeserialize(using = FlowOutcomeValueEnumDeserializer.class)
  public enum FlowOutcomeValueEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAILURE("FAILURE"),
    SUCCESS("SUCCESS"),
    UNKNOWN("UNKNOWN");

    private String value;

    FlowOutcomeValueEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowOutcomeValueEnum fromString(String key) {
      if (key == null) return null;

      for (FlowOutcomeValueEnum value : FlowOutcomeValueEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowOutcomeValueEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlowOutcomeValueEnum flowOutcomeValue = null;
  private AddressableEntityRef flowMilestone = null;
  private AddressableEntityRef flowOutcome = null;

  
  /**
   * Unique identifier of the parent element. Will be null for the root element.
   **/
  public FlowPathsElement parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the parent element. Will be null for the root element.")
  @JsonProperty("parentId")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  /**
   * Type of the element.
   **/
  public FlowPathsElement type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the element.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Count of all journeys that include this element.
   **/
  public FlowPathsElement count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Count of all journeys that include this element.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * Details of flows involved in journeys that include this element.
   **/
  public FlowPathsElement flows(List<FlowPathsFlowDetails> flows) {
    this.flows = flows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Details of flows involved in journeys that include this element.")
  @JsonProperty("flows")
  public List<FlowPathsFlowDetails> getFlows() {
    return flows;
  }
  public void setFlows(List<FlowPathsFlowDetails> flows) {
    this.flows = flows;
  }


  /**
   * The value of the flow outcome, if the element type is Outcome.
   **/
  public FlowPathsElement flowOutcomeValue(FlowOutcomeValueEnum flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the flow outcome, if the element type is Outcome.")
  @JsonProperty("flowOutcomeValue")
  public FlowOutcomeValueEnum getFlowOutcomeValue() {
    return flowOutcomeValue;
  }
  public void setFlowOutcomeValue(FlowOutcomeValueEnum flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
  }


  @ApiModelProperty(example = "null", value = "The flow milestone, set if the element type is Milestone.")
  @JsonProperty("flowMilestone")
  public AddressableEntityRef getFlowMilestone() {
    return flowMilestone;
  }


  @ApiModelProperty(example = "null", value = "The flow outcome, set if the element type is Outcome or Milestone.")
  @JsonProperty("flowOutcome")
  public AddressableEntityRef getFlowOutcome() {
    return flowOutcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowPathsElement flowPathsElement = (FlowPathsElement) o;

    return Objects.equals(this.parentId, flowPathsElement.parentId) &&
            Objects.equals(this.type, flowPathsElement.type) &&
            Objects.equals(this.count, flowPathsElement.count) &&
            Objects.equals(this.flows, flowPathsElement.flows) &&
            Objects.equals(this.flowOutcomeValue, flowPathsElement.flowOutcomeValue) &&
            Objects.equals(this.flowMilestone, flowPathsElement.flowMilestone) &&
            Objects.equals(this.flowOutcome, flowPathsElement.flowOutcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, type, count, flows, flowOutcomeValue, flowMilestone, flowOutcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowPathsElement {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
    sb.append("    flowOutcomeValue: ").append(toIndentedString(flowOutcomeValue)).append("\n");
    sb.append("    flowMilestone: ").append(toIndentedString(flowMilestone)).append("\n");
    sb.append("    flowOutcome: ").append(toIndentedString(flowOutcome)).append("\n");
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

