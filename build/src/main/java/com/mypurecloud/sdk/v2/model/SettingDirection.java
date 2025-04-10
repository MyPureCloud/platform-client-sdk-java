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
 * SettingDirection
 */

public class SettingDirection  implements Serializable {
  

  private static class InboundEnumDeserializer extends StdDeserializer<InboundEnum> {
    public InboundEnumDeserializer() {
      super(InboundEnumDeserializer.class);
    }

    @Override
    public InboundEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InboundEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status for the Inbound Direction
   */
 @JsonDeserialize(using = InboundEnumDeserializer.class)
  public enum InboundEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("Enabled"),
    DISABLED("Disabled");

    private String value;

    InboundEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InboundEnum fromString(String key) {
      if (key == null) return null;

      for (InboundEnum value : InboundEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InboundEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InboundEnum inbound = null;

  private static class OutboundEnumDeserializer extends StdDeserializer<OutboundEnum> {
    public OutboundEnumDeserializer() {
      super(OutboundEnumDeserializer.class);
    }

    @Override
    public OutboundEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OutboundEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status for the Outbound Direction
   */
 @JsonDeserialize(using = OutboundEnumDeserializer.class)
  public enum OutboundEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("Enabled"),
    DISABLED("Disabled");

    private String value;

    OutboundEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OutboundEnum fromString(String key) {
      if (key == null) return null;

      for (OutboundEnum value : OutboundEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OutboundEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OutboundEnum outbound = null;

  public SettingDirection() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Status for the Inbound Direction
   **/
  public SettingDirection inbound(InboundEnum inbound) {
    this.inbound = inbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status for the Inbound Direction")
  @JsonProperty("inbound")
  public InboundEnum getInbound() {
    return inbound;
  }
  public void setInbound(InboundEnum inbound) {
    this.inbound = inbound;
  }


  /**
   * Status for the Outbound Direction
   **/
  public SettingDirection outbound(OutboundEnum outbound) {
    this.outbound = outbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status for the Outbound Direction")
  @JsonProperty("outbound")
  public OutboundEnum getOutbound() {
    return outbound;
  }
  public void setOutbound(OutboundEnum outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingDirection settingDirection = (SettingDirection) o;

    return Objects.equals(this.inbound, settingDirection.inbound) &&
            Objects.equals(this.outbound, settingDirection.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbound, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingDirection {\n");
    
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

