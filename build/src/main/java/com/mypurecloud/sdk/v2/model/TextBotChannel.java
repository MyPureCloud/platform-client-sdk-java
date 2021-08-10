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
import com.mypurecloud.sdk.v2.model.TextBotUserAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Channel information relevant to a bot flow.
 */
@ApiModel(description = "Channel information relevant to a bot flow.")

public class TextBotChannel  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The name of the channel.
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHAT("Chat"),
    CALL("Call"),
    MESSAGING("Messaging");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;

  private static class InputModesEnumDeserializer extends StdDeserializer<InputModesEnum> {
    public InputModesEnumDeserializer() {
      super(InputModesEnumDeserializer.class);
    }

    @Override
    public InputModesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InputModesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets inputModes
   */
 @JsonDeserialize(using = InputModesEnumDeserializer.class)
  public enum InputModesEnum {
    TEXT("Text");

    private String value;

    InputModesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InputModesEnum fromString(String key) {
      if (key == null) return null;

      for (InputModesEnum value : InputModesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InputModesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<InputModesEnum> inputModes = new ArrayList<InputModesEnum>();

  private static class OutputModesEnumDeserializer extends StdDeserializer<OutputModesEnum> {
    public OutputModesEnumDeserializer() {
      super(OutputModesEnumDeserializer.class);
    }

    @Override
    public OutputModesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OutputModesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets outputModes
   */
 @JsonDeserialize(using = OutputModesEnumDeserializer.class)
  public enum OutputModesEnum {
    TEXT("Text");

    private String value;

    OutputModesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OutputModesEnum fromString(String key) {
      if (key == null) return null;

      for (OutputModesEnum value : OutputModesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OutputModesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<OutputModesEnum> outputModes = new ArrayList<OutputModesEnum>();
  private TextBotUserAgent userAgent = null;

  
  /**
   * The name of the channel.
   **/
  public TextBotChannel name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the channel.")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  
  /**
   * The input modes for the channel.
   **/
  public TextBotChannel inputModes(List<InputModesEnum> inputModes) {
    this.inputModes = inputModes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input modes for the channel.")
  @JsonProperty("inputModes")
  public List<InputModesEnum> getInputModes() {
    return inputModes;
  }
  public void setInputModes(List<InputModesEnum> inputModes) {
    this.inputModes = inputModes;
  }

  
  /**
   * The output modes for the channel.
   **/
  public TextBotChannel outputModes(List<OutputModesEnum> outputModes) {
    this.outputModes = outputModes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The output modes for the channel.")
  @JsonProperty("outputModes")
  public List<OutputModesEnum> getOutputModes() {
    return outputModes;
  }
  public void setOutputModes(List<OutputModesEnum> outputModes) {
    this.outputModes = outputModes;
  }

  
  /**
   * Information about the end user agent calling the bot flow.
   **/
  public TextBotChannel userAgent(TextBotUserAgent userAgent) {
    this.userAgent = userAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the end user agent calling the bot flow.")
  @JsonProperty("userAgent")
  public TextBotUserAgent getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(TextBotUserAgent userAgent) {
    this.userAgent = userAgent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotChannel textBotChannel = (TextBotChannel) o;
    return Objects.equals(this.name, textBotChannel.name) &&
        Objects.equals(this.inputModes, textBotChannel.inputModes) &&
        Objects.equals(this.outputModes, textBotChannel.outputModes) &&
        Objects.equals(this.userAgent, textBotChannel.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inputModes, outputModes, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotChannel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputModes: ").append(toIndentedString(inputModes)).append("\n");
    sb.append("    outputModes: ").append(toIndentedString(outputModes)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

