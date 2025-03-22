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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundOnlySetting
 */

public class OutboundOnlySetting  implements Serializable {
  

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

  
  /**
   * Status for the Outbound Direction
   **/
  public OutboundOnlySetting outbound(OutboundEnum outbound) {
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
    OutboundOnlySetting outboundOnlySetting = (OutboundOnlySetting) o;

    return Objects.equals(this.outbound, outboundOnlySetting.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundOnlySetting {\n");
    
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

