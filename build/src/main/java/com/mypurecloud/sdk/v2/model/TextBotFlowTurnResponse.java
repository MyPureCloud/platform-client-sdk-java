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
import com.mypurecloud.sdk.v2.model.TextBotDisconnectAction;
import com.mypurecloud.sdk.v2.model.TextBotExitAction;
import com.mypurecloud.sdk.v2.model.TextBotOutputPrompts;
import com.mypurecloud.sdk.v2.model.TextBotTurnReference;
import com.mypurecloud.sdk.v2.model.TextBotWaitForInputAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Information related to a success bot flow turn request.
 */
@ApiModel(description = "Information related to a success bot flow turn request.")

public class TextBotFlowTurnResponse  implements Serializable {
  
  private String id = null;
  private TextBotTurnReference previousTurn = null;
  private TextBotOutputPrompts prompts = null;

  private static class NextActionTypeEnumDeserializer extends StdDeserializer<NextActionTypeEnum> {
    public NextActionTypeEnumDeserializer() {
      super(NextActionTypeEnumDeserializer.class);
    }

    @Override
    public NextActionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NextActionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the suggested next action. If appropriate, the matching output event object includes additional information.
   */
 @JsonDeserialize(using = NextActionTypeEnumDeserializer.class)
  public enum NextActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOOP("NoOp"),
    DISCONNECT("Disconnect"),
    WAITFORINPUT("WaitForInput"),
    EXIT("Exit");

    private String value;

    NextActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NextActionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (NextActionTypeEnum value : NextActionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NextActionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NextActionTypeEnum nextActionType = null;
  private TextBotDisconnectAction nextActionDisconnect = null;
  private TextBotWaitForInputAction nextActionWaitForInput = null;
  private TextBotExitAction nextActionExit = null;

  
  /**
   * The ID of the bot flow turn. If additional turns are needed, supply this ID as the previous turn in your next turn request.
   **/
  public TextBotFlowTurnResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the bot flow turn. If additional turns are needed, supply this ID as the previous turn in your next turn request.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The reference to a previous turn, if applicable.
   **/
  public TextBotFlowTurnResponse previousTurn(TextBotTurnReference previousTurn) {
    this.previousTurn = previousTurn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to a previous turn, if applicable.")
  @JsonProperty("previousTurn")
  public TextBotTurnReference getPreviousTurn() {
    return previousTurn;
  }
  public void setPreviousTurn(TextBotTurnReference previousTurn) {
    this.previousTurn = previousTurn;
  }

  
  /**
   * The output prompts for this turn.
   **/
  public TextBotFlowTurnResponse prompts(TextBotOutputPrompts prompts) {
    this.prompts = prompts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The output prompts for this turn.")
  @JsonProperty("prompts")
  public TextBotOutputPrompts getPrompts() {
    return prompts;
  }
  public void setPrompts(TextBotOutputPrompts prompts) {
    this.prompts = prompts;
  }

  
  /**
   * Indicates the suggested next action. If appropriate, the matching output event object includes additional information.
   **/
  public TextBotFlowTurnResponse nextActionType(NextActionTypeEnum nextActionType) {
    this.nextActionType = nextActionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the suggested next action. If appropriate, the matching output event object includes additional information.")
  @JsonProperty("nextActionType")
  public NextActionTypeEnum getNextActionType() {
    return nextActionType;
  }
  public void setNextActionType(NextActionTypeEnum nextActionType) {
    this.nextActionType = nextActionType;
  }

  
  /**
   * The next action directive for this turn if it is a Disconnect type.
   **/
  public TextBotFlowTurnResponse nextActionDisconnect(TextBotDisconnectAction nextActionDisconnect) {
    this.nextActionDisconnect = nextActionDisconnect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The next action directive for this turn if it is a Disconnect type.")
  @JsonProperty("nextActionDisconnect")
  public TextBotDisconnectAction getNextActionDisconnect() {
    return nextActionDisconnect;
  }
  public void setNextActionDisconnect(TextBotDisconnectAction nextActionDisconnect) {
    this.nextActionDisconnect = nextActionDisconnect;
  }

  
  /**
   * The next action directive for this turn if it is a WaitForInput type.
   **/
  public TextBotFlowTurnResponse nextActionWaitForInput(TextBotWaitForInputAction nextActionWaitForInput) {
    this.nextActionWaitForInput = nextActionWaitForInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The next action directive for this turn if it is a WaitForInput type.")
  @JsonProperty("nextActionWaitForInput")
  public TextBotWaitForInputAction getNextActionWaitForInput() {
    return nextActionWaitForInput;
  }
  public void setNextActionWaitForInput(TextBotWaitForInputAction nextActionWaitForInput) {
    this.nextActionWaitForInput = nextActionWaitForInput;
  }

  
  /**
   * The next action directive for this turn if it is an Exit type.
   **/
  public TextBotFlowTurnResponse nextActionExit(TextBotExitAction nextActionExit) {
    this.nextActionExit = nextActionExit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The next action directive for this turn if it is an Exit type.")
  @JsonProperty("nextActionExit")
  public TextBotExitAction getNextActionExit() {
    return nextActionExit;
  }
  public void setNextActionExit(TextBotExitAction nextActionExit) {
    this.nextActionExit = nextActionExit;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotFlowTurnResponse textBotFlowTurnResponse = (TextBotFlowTurnResponse) o;
    return Objects.equals(this.id, textBotFlowTurnResponse.id) &&
        Objects.equals(this.previousTurn, textBotFlowTurnResponse.previousTurn) &&
        Objects.equals(this.prompts, textBotFlowTurnResponse.prompts) &&
        Objects.equals(this.nextActionType, textBotFlowTurnResponse.nextActionType) &&
        Objects.equals(this.nextActionDisconnect, textBotFlowTurnResponse.nextActionDisconnect) &&
        Objects.equals(this.nextActionWaitForInput, textBotFlowTurnResponse.nextActionWaitForInput) &&
        Objects.equals(this.nextActionExit, textBotFlowTurnResponse.nextActionExit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, previousTurn, prompts, nextActionType, nextActionDisconnect, nextActionWaitForInput, nextActionExit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotFlowTurnResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousTurn: ").append(toIndentedString(previousTurn)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
    sb.append("    nextActionType: ").append(toIndentedString(nextActionType)).append("\n");
    sb.append("    nextActionDisconnect: ").append(toIndentedString(nextActionDisconnect)).append("\n");
    sb.append("    nextActionWaitForInput: ").append(toIndentedString(nextActionWaitForInput)).append("\n");
    sb.append("    nextActionExit: ").append(toIndentedString(nextActionExit)).append("\n");
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

