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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingTurnGuardrailEvent
 */

public class ReportingTurnGuardrailEvent  implements Serializable {
  

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
   * The type of guardrail violation
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOM("Custom"),
    JAILBREAK("Jailbreak"),
    HARMFUL("Harmful"),
    INAPPROPRIATE("Inappropriate"),
    UNKNOWN("Unknown");

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
  private String instruction = null;
  private Integer violationsThreshold = null;
  private Integer violationsTriggered = null;

  public ReportingTurnGuardrailEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ReportingTurnGuardrailEvent(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The type of guardrail violation
   **/
  public ReportingTurnGuardrailEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of guardrail violation")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The attached instruction to the guardrail
   **/
  public ReportingTurnGuardrailEvent instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attached instruction to the guardrail")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  /**
   * The number of violations allowed before an exit occurs.
   **/
  public ReportingTurnGuardrailEvent violationsThreshold(Integer violationsThreshold) {
    this.violationsThreshold = violationsThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of violations allowed before an exit occurs.")
  @JsonProperty("violationsThreshold")
  public Integer getViolationsThreshold() {
    return violationsThreshold;
  }
  public void setViolationsThreshold(Integer violationsThreshold) {
    this.violationsThreshold = violationsThreshold;
  }


  /**
   * The current amount of violations that have been triggered in the current action.
   **/
  public ReportingTurnGuardrailEvent violationsTriggered(Integer violationsTriggered) {
    this.violationsTriggered = violationsTriggered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current amount of violations that have been triggered in the current action.")
  @JsonProperty("violationsTriggered")
  public Integer getViolationsTriggered() {
    return violationsTriggered;
  }
  public void setViolationsTriggered(Integer violationsTriggered) {
    this.violationsTriggered = violationsTriggered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnGuardrailEvent reportingTurnGuardrailEvent = (ReportingTurnGuardrailEvent) o;

    return Objects.equals(this.type, reportingTurnGuardrailEvent.type) &&
            Objects.equals(this.instruction, reportingTurnGuardrailEvent.instruction) &&
            Objects.equals(this.violationsThreshold, reportingTurnGuardrailEvent.violationsThreshold) &&
            Objects.equals(this.violationsTriggered, reportingTurnGuardrailEvent.violationsTriggered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, instruction, violationsThreshold, violationsTriggered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnGuardrailEvent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    violationsThreshold: ").append(toIndentedString(violationsThreshold)).append("\n");
    sb.append("    violationsTriggered: ").append(toIndentedString(violationsTriggered)).append("\n");
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

