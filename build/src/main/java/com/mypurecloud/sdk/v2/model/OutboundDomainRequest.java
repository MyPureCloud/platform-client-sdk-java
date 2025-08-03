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
 * OutboundDomainRequest
 */

public class OutboundDomainRequest  implements Serializable {
  
  private String id = null;

  private static class SenderTypeEnumDeserializer extends StdDeserializer<SenderTypeEnum> {
    public SenderTypeEnumDeserializer() {
      super(SenderTypeEnumDeserializer.class);
    }

    @Override
    public SenderTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SenderTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Sender Type
   */
 @JsonDeserialize(using = SenderTypeEnumDeserializer.class)
  public enum SenderTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    EMAILDOMAIN("EmailDomain"),
    MOCKEMAILDOMAIN("MockEmailDomain"),
    EMAILSMTPDOMAIN("EmailSmtpDomain");

    private String value;

    SenderTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SenderTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SenderTypeEnum value : SenderTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SenderTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SenderTypeEnum senderType = null;
  private String name = null;

  public OutboundDomainRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique Id of the domain such as: example.com
   **/
  public OutboundDomainRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id of the domain such as: example.com")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Sender Type
   **/
  public OutboundDomainRequest senderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sender Type")
  @JsonProperty("senderType")
  public SenderTypeEnum getSenderType() {
    return senderType;
  }
  public void setSenderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
  }


  /**
   * The domain such as: example.com
   **/
  public OutboundDomainRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The domain such as: example.com")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundDomainRequest outboundDomainRequest = (OutboundDomainRequest) o;

    return Objects.equals(this.id, outboundDomainRequest.id) &&
            Objects.equals(this.senderType, outboundDomainRequest.senderType) &&
            Objects.equals(this.name, outboundDomainRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, senderType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundDomainRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

