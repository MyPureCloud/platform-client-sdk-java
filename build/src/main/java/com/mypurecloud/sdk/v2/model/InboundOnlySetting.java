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
 * InboundOnlySetting
 */

public class InboundOnlySetting  implements Serializable {
  

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
   * Gets or Sets inbound
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

  public InboundOnlySetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public InboundOnlySetting inbound(InboundEnum inbound) {
    this.inbound = inbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inbound")
  public InboundEnum getInbound() {
    return inbound;
  }
  public void setInbound(InboundEnum inbound) {
    this.inbound = inbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundOnlySetting inboundOnlySetting = (InboundOnlySetting) o;

    return Objects.equals(this.inbound, inboundOnlySetting.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundOnlySetting {\n");
    
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
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

