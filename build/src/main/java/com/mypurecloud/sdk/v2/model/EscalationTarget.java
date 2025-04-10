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
import com.mypurecloud.sdk.v2.model.OverrideEscalationTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EscalationTarget
 */

public class EscalationTarget  implements Serializable {
  

  private static class TargetTypeEnumDeserializer extends StdDeserializer<TargetTypeEnum> {
    public TargetTypeEnumDeserializer() {
      super(TargetTypeEnumDeserializer.class);
    }

    @Override
    public TargetTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TargetTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Defines the target that the message will be escalated to.
   */
 @JsonDeserialize(using = TargetTypeEnumDeserializer.class)
  public enum TargetTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATION("Conversation");

    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TargetTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TargetTypeEnum value : TargetTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TargetTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TargetTypeEnum targetType = null;

  private static class DestinationEnumDeserializer extends StdDeserializer<DestinationEnum> {
    public DestinationEnumDeserializer() {
      super(DestinationEnumDeserializer.class);
    }

    @Override
    public DestinationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DestinationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Defines the destination of the escalation.SourceIntegration means use the SocialMedia Source Integration as the destination.OverrideIntegration means the set integration will be used regardless of the source.
   */
 @JsonDeserialize(using = DestinationEnumDeserializer.class)
  public enum DestinationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SOURCEINTEGRATION("SourceIntegration"),
    OVERRIDEINTEGRATION("OverrideIntegration");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DestinationEnum fromString(String key) {
      if (key == null) return null;

      for (DestinationEnum value : DestinationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DestinationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DestinationEnum destination = null;
  private OverrideEscalationTarget override = null;

  public EscalationTarget() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Defines the target that the message will be escalated to.
   **/
  public EscalationTarget targetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines the target that the message will be escalated to.")
  @JsonProperty("targetType")
  public TargetTypeEnum getTargetType() {
    return targetType;
  }
  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }


  /**
   * Defines the destination of the escalation.SourceIntegration means use the SocialMedia Source Integration as the destination.OverrideIntegration means the set integration will be used regardless of the source.
   **/
  public EscalationTarget destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines the destination of the escalation.SourceIntegration means use the SocialMedia Source Integration as the destination.OverrideIntegration means the set integration will be used regardless of the source.")
  @JsonProperty("destination")
  public DestinationEnum getDestination() {
    return destination;
  }
  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }


  /**
   * Set the integration ID.Only valid when type is OverrideIntegration.
   **/
  public EscalationTarget override(OverrideEscalationTarget override) {
    this.override = override;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the integration ID.Only valid when type is OverrideIntegration.")
  @JsonProperty("override")
  public OverrideEscalationTarget getOverride() {
    return override;
  }
  public void setOverride(OverrideEscalationTarget override) {
    this.override = override;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationTarget escalationTarget = (EscalationTarget) o;

    return Objects.equals(this.targetType, escalationTarget.targetType) &&
            Objects.equals(this.destination, escalationTarget.destination) &&
            Objects.equals(this.override, escalationTarget.override);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetType, destination, override);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationTarget {\n");
    
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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

