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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DomainNetworkAddress
 */

public class DomainNetworkAddress  implements Serializable {
  

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
   * The type of address.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IP("ip"),
    DNS("dns"),
    GATEWAY("gateway"),
    TDM("tdm");

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
  private String address = null;
  private Boolean persistent = null;

  private static class FamilyEnumDeserializer extends StdDeserializer<FamilyEnum> {
    public FamilyEnumDeserializer() {
      super(FamilyEnumDeserializer.class);
    }

    @Override
    public FamilyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FamilyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The address family for this address.
   */
 @JsonDeserialize(using = FamilyEnumDeserializer.class)
  public enum FamilyEnum {
    OUTDATEDSDKVERSION(-1),
    NUMBER_2(2),
    NUMBER_23(23);

    private Integer value;

    FamilyEnum(Integer value) {
      this.value = value;
    }

    @JsonCreator
    public static FamilyEnum fromString(String key) {
      if (key == null) return null;

      for (FamilyEnum value : FamilyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FamilyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FamilyEnum family = null;

  
  /**
   * The type of address.
   **/
  public DomainNetworkAddress type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of address.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * An IPv4 or IPv6 IP address. When specifying an address of type \"ip\", use CIDR format for the subnet mask.
   **/
  public DomainNetworkAddress address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An IPv4 or IPv6 IP address. When specifying an address of type \"ip\", use CIDR format for the subnet mask.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * True if this address will persist on Edge restart.  Addresses assigned by DHCP will be returned as false.
   **/
  public DomainNetworkAddress persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this address will persist on Edge restart.  Addresses assigned by DHCP will be returned as false.")
  @JsonProperty("persistent")
  public Boolean getPersistent() {
    return persistent;
  }
  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  
  /**
   * The address family for this address.
   **/
  public DomainNetworkAddress family(FamilyEnum family) {
    this.family = family;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address family for this address.")
  @JsonProperty("family")
  public FamilyEnum getFamily() {
    return family;
  }
  public void setFamily(FamilyEnum family) {
    this.family = family;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainNetworkAddress domainNetworkAddress = (DomainNetworkAddress) o;
    return Objects.equals(this.type, domainNetworkAddress.type) &&
        Objects.equals(this.address, domainNetworkAddress.address) &&
        Objects.equals(this.persistent, domainNetworkAddress.persistent) &&
        Objects.equals(this.family, domainNetworkAddress.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, persistent, family);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainNetworkAddress {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
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

