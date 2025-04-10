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
 * OperandPosition
 */

public class OperandPosition  implements Serializable {
  
  private Integer startingPositionValue = null;

  private static class StartingPositionDirectionEnumDeserializer extends StdDeserializer<StartingPositionDirectionEnum> {
    public StartingPositionDirectionEnumDeserializer() {
      super(StartingPositionDirectionEnumDeserializer.class);
    }

    @Override
    public StartingPositionDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StartingPositionDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Dictates starting position directionality
   */
 @JsonDeserialize(using = StartingPositionDirectionEnumDeserializer.class)
  public enum StartingPositionDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FROMSTART("FromStart"),
    FROMEND("FromEnd");

    private String value;

    StartingPositionDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartingPositionDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (StartingPositionDirectionEnum value : StartingPositionDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartingPositionDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartingPositionDirectionEnum startingPositionDirection = null;
  private Integer endingPositionValue = null;

  private static class EndingPositionDirectionEnumDeserializer extends StdDeserializer<EndingPositionDirectionEnum> {
    public EndingPositionDirectionEnumDeserializer() {
      super(EndingPositionDirectionEnumDeserializer.class);
    }

    @Override
    public EndingPositionDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EndingPositionDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Dictates ending position directionality
   */
 @JsonDeserialize(using = EndingPositionDirectionEnumDeserializer.class)
  public enum EndingPositionDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FROMSTART("FromStart"),
    FROMEND("FromEnd");

    private String value;

    EndingPositionDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EndingPositionDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (EndingPositionDirectionEnum value : EndingPositionDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EndingPositionDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EndingPositionDirectionEnum endingPositionDirection = null;

  public OperandPosition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Defines starting point of a position range - number of seconds or words from the start or from the end of the interaction
   **/
  public OperandPosition startingPositionValue(Integer startingPositionValue) {
    this.startingPositionValue = startingPositionValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines starting point of a position range - number of seconds or words from the start or from the end of the interaction")
  @JsonProperty("startingPositionValue")
  public Integer getStartingPositionValue() {
    return startingPositionValue;
  }
  public void setStartingPositionValue(Integer startingPositionValue) {
    this.startingPositionValue = startingPositionValue;
  }


  /**
   * Dictates starting position directionality
   **/
  public OperandPosition startingPositionDirection(StartingPositionDirectionEnum startingPositionDirection) {
    this.startingPositionDirection = startingPositionDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dictates starting position directionality")
  @JsonProperty("startingPositionDirection")
  public StartingPositionDirectionEnum getStartingPositionDirection() {
    return startingPositionDirection;
  }
  public void setStartingPositionDirection(StartingPositionDirectionEnum startingPositionDirection) {
    this.startingPositionDirection = startingPositionDirection;
  }


  /**
   * Defines ending point of a position range - number of seconds or words from the start or from the end of the interaction
   **/
  public OperandPosition endingPositionValue(Integer endingPositionValue) {
    this.endingPositionValue = endingPositionValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines ending point of a position range - number of seconds or words from the start or from the end of the interaction")
  @JsonProperty("endingPositionValue")
  public Integer getEndingPositionValue() {
    return endingPositionValue;
  }
  public void setEndingPositionValue(Integer endingPositionValue) {
    this.endingPositionValue = endingPositionValue;
  }


  /**
   * Dictates ending position directionality
   **/
  public OperandPosition endingPositionDirection(EndingPositionDirectionEnum endingPositionDirection) {
    this.endingPositionDirection = endingPositionDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dictates ending position directionality")
  @JsonProperty("endingPositionDirection")
  public EndingPositionDirectionEnum getEndingPositionDirection() {
    return endingPositionDirection;
  }
  public void setEndingPositionDirection(EndingPositionDirectionEnum endingPositionDirection) {
    this.endingPositionDirection = endingPositionDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperandPosition operandPosition = (OperandPosition) o;

    return Objects.equals(this.startingPositionValue, operandPosition.startingPositionValue) &&
            Objects.equals(this.startingPositionDirection, operandPosition.startingPositionDirection) &&
            Objects.equals(this.endingPositionValue, operandPosition.endingPositionValue) &&
            Objects.equals(this.endingPositionDirection, operandPosition.endingPositionDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startingPositionValue, startingPositionDirection, endingPositionValue, endingPositionDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperandPosition {\n");
    
    sb.append("    startingPositionValue: ").append(toIndentedString(startingPositionValue)).append("\n");
    sb.append("    startingPositionDirection: ").append(toIndentedString(startingPositionDirection)).append("\n");
    sb.append("    endingPositionValue: ").append(toIndentedString(endingPositionValue)).append("\n");
    sb.append("    endingPositionDirection: ").append(toIndentedString(endingPositionDirection)).append("\n");
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

