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
import com.mypurecloud.sdk.v2.model.TextBotErrorInputEvent;
import com.mypurecloud.sdk.v2.model.TextBotTurnReference;
import com.mypurecloud.sdk.v2.model.TextBotUserInputEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings for a turn request to a bot flow.
 */
@ApiModel(description = "Settings for a turn request to a bot flow.")

public class TextBotFlowTurnRequest  implements Serializable {
  
  private TextBotTurnReference previousTurn = null;

  private static class InputEventTypeEnumDeserializer extends StdDeserializer<InputEventTypeEnum> {
    public InputEventTypeEnumDeserializer() {
      super(InputEventTypeEnumDeserializer.class);
    }

    @Override
    public InputEventTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InputEventTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the type of input event being requested. If appropriate, fill out the matching user input object details on this request.
   */
 @JsonDeserialize(using = InputEventTypeEnumDeserializer.class)
  public enum InputEventTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOOP("NoOp"),
    USERINPUT("UserInput"),
    ERROR("Error"),
    NOMATCH("NoMatch"),
    NOINPUT("NoInput"),
    USERDISCONNECT("UserDisconnect");

    private String value;

    InputEventTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InputEventTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InputEventTypeEnum value : InputEventTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InputEventTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InputEventTypeEnum inputEventType = null;
  private TextBotUserInputEvent inputEventUserInput = null;
  private TextBotErrorInputEvent inputEventError = null;

  
  /**
   * The reference to a previous turn if appropriate, used to avoid race conditions.
   **/
  public TextBotFlowTurnRequest previousTurn(TextBotTurnReference previousTurn) {
    this.previousTurn = previousTurn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to a previous turn if appropriate, used to avoid race conditions.")
  @JsonProperty("previousTurn")
  public TextBotTurnReference getPreviousTurn() {
    return previousTurn;
  }
  public void setPreviousTurn(TextBotTurnReference previousTurn) {
    this.previousTurn = previousTurn;
  }

  
  /**
   * Indicates the type of input event being requested. If appropriate, fill out the matching user input object details on this request.
   **/
  public TextBotFlowTurnRequest inputEventType(InputEventTypeEnum inputEventType) {
    this.inputEventType = inputEventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the type of input event being requested. If appropriate, fill out the matching user input object details on this request.")
  @JsonProperty("inputEventType")
  public InputEventTypeEnum getInputEventType() {
    return inputEventType;
  }
  public void setInputEventType(InputEventTypeEnum inputEventType) {
    this.inputEventType = inputEventType;
  }

  
  /**
   * The data for the input event of this turn if it is a user input event. Only one inputEvent may be set.
   **/
  public TextBotFlowTurnRequest inputEventUserInput(TextBotUserInputEvent inputEventUserInput) {
    this.inputEventUserInput = inputEventUserInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data for the input event of this turn if it is a user input event. Only one inputEvent may be set.")
  @JsonProperty("inputEventUserInput")
  public TextBotUserInputEvent getInputEventUserInput() {
    return inputEventUserInput;
  }
  public void setInputEventUserInput(TextBotUserInputEvent inputEventUserInput) {
    this.inputEventUserInput = inputEventUserInput;
  }

  
  /**
   * The data for the input event of this turn if it is an error event. Only one inputEvent may be set.
   **/
  public TextBotFlowTurnRequest inputEventError(TextBotErrorInputEvent inputEventError) {
    this.inputEventError = inputEventError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data for the input event of this turn if it is an error event. Only one inputEvent may be set.")
  @JsonProperty("inputEventError")
  public TextBotErrorInputEvent getInputEventError() {
    return inputEventError;
  }
  public void setInputEventError(TextBotErrorInputEvent inputEventError) {
    this.inputEventError = inputEventError;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotFlowTurnRequest textBotFlowTurnRequest = (TextBotFlowTurnRequest) o;
    return Objects.equals(this.previousTurn, textBotFlowTurnRequest.previousTurn) &&
        Objects.equals(this.inputEventType, textBotFlowTurnRequest.inputEventType) &&
        Objects.equals(this.inputEventUserInput, textBotFlowTurnRequest.inputEventUserInput) &&
        Objects.equals(this.inputEventError, textBotFlowTurnRequest.inputEventError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousTurn, inputEventType, inputEventUserInput, inputEventError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotFlowTurnRequest {\n");
    
    sb.append("    previousTurn: ").append(toIndentedString(previousTurn)).append("\n");
    sb.append("    inputEventType: ").append(toIndentedString(inputEventType)).append("\n");
    sb.append("    inputEventUserInput: ").append(toIndentedString(inputEventUserInput)).append("\n");
    sb.append("    inputEventError: ").append(toIndentedString(inputEventError)).append("\n");
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

