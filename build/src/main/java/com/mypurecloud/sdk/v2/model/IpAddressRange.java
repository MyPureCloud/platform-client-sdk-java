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
 * IpAddressRange
 */

public class IpAddressRange  implements Serializable {
  
  private String cidr = null;

  private static class ServiceEnumDeserializer extends StdDeserializer<ServiceEnum> {
    public ServiceEnumDeserializer() {
      super(ServiceEnumDeserializer.class);
    }

    @Override
    public ServiceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ServiceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets service
   */
 @JsonDeserialize(using = ServiceEnumDeserializer.class)
  public enum ServiceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    API("api"),
    DATA_ACTIONS("data-actions"),
    SMTP("smtp"),
    IMAP("imap"),
    GRAPHAPI("graphapi"),
    AUDIOHOOK("audiohook"),
    OPEN_MESSAGING("open-messaging"),
    TTS_CONNECTOR("tts-connector"),
    AUDIO_CONNECTOR("audio-connector"),
    BYOT_STT("byot-stt"),
    BOT_CONNECTOR("bot-connector");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ServiceEnum fromString(String key) {
      if (key == null) return null;

      for (ServiceEnum value : ServiceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ServiceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ServiceEnum service = null;
  private String region = null;

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The direction of traffic for the IP range from the perspective of Genesys Cloud (e.g. inbound to Genesys; outbound from Genesys)
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound"),
    BOTH("both");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

  public IpAddressRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public IpAddressRange cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cidr")
  public String getCidr() {
    return cidr;
  }
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  /**
   **/
  public IpAddressRange service(ServiceEnum service) {
    this.service = service;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("service")
  public ServiceEnum getService() {
    return service;
  }
  public void setService(ServiceEnum service) {
    this.service = service;
  }


  /**
   **/
  public IpAddressRange region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * The direction of traffic for the IP range from the perspective of Genesys Cloud (e.g. inbound to Genesys; outbound from Genesys)
   **/
  public IpAddressRange direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of traffic for the IP range from the perspective of Genesys Cloud (e.g. inbound to Genesys; outbound from Genesys)")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressRange ipAddressRange = (IpAddressRange) o;

    return Objects.equals(this.cidr, ipAddressRange.cidr) &&
            Objects.equals(this.service, ipAddressRange.service) &&
            Objects.equals(this.region, ipAddressRange.region) &&
            Objects.equals(this.direction, ipAddressRange.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, service, region, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressRange {\n");
    
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

