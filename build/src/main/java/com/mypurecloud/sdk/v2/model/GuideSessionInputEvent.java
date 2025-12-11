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
import com.mypurecloud.sdk.v2.model.GuideSessionTurnInvocationData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GuideSessionInputEvent
 */

public class GuideSessionInputEvent  implements Serializable {
  

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
   * The type of input event.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USERINPUT("UserInput"),
    RETURNCONTROL("ReturnControl"),
    NOOP("NoOp");

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
  private String text = null;

  private static class ModeEnumDeserializer extends StdDeserializer<ModeEnum> {
    public ModeEnumDeserializer() {
      super(ModeEnumDeserializer.class);
    }

    @Override
    public ModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The input mode for this event.
   */
 @JsonDeserialize(using = ModeEnumDeserializer.class)
  public enum ModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("Text");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ModeEnum fromString(String key) {
      if (key == null) return null;

      for (ModeEnum value : ModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ModeEnum mode = null;
  private String invocationId = null;
  private List<GuideSessionTurnInvocationData> invocations = null;

  public GuideSessionInputEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      invocations = new ArrayList<GuideSessionTurnInvocationData>();
    }
  }

  
  /**
   * The type of input event.
   **/
  public GuideSessionInputEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of input event.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The text content of the input event.
   **/
  public GuideSessionInputEvent text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text content of the input event.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The input mode for this event.
   **/
  public GuideSessionInputEvent mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input mode for this event.")
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  /**
   * The invocation ID of the input event.
   **/
  public GuideSessionInputEvent invocationId(String invocationId) {
    this.invocationId = invocationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The invocation ID of the input event.")
  @JsonProperty("invocationId")
  public String getInvocationId() {
    return invocationId;
  }
  public void setInvocationId(String invocationId) {
    this.invocationId = invocationId;
  }


  /**
   * The invocation data of the input event.
   **/
  public GuideSessionInputEvent invocations(List<GuideSessionTurnInvocationData> invocations) {
    this.invocations = invocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The invocation data of the input event.")
  @JsonProperty("invocations")
  public List<GuideSessionTurnInvocationData> getInvocations() {
    return invocations;
  }
  public void setInvocations(List<GuideSessionTurnInvocationData> invocations) {
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
    GuideSessionInputEvent guideSessionInputEvent = (GuideSessionInputEvent) o;

    return Objects.equals(this.type, guideSessionInputEvent.type) &&
            Objects.equals(this.text, guideSessionInputEvent.text) &&
            Objects.equals(this.mode, guideSessionInputEvent.mode) &&
            Objects.equals(this.invocationId, guideSessionInputEvent.invocationId) &&
            Objects.equals(this.invocations, guideSessionInputEvent.invocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, mode, invocationId, invocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionInputEvent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

