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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EdgeInterface
 */

public class EdgeInterface  implements Serializable {
  
  private String type = null;
  private String ipAddress = null;
  private String name = null;
  private String macAddress = null;
  private String ifName = null;
  private List<DomainEntityRef> endpoints = new ArrayList<DomainEntityRef>();

  private static class LineTypesEnumDeserializer extends StdDeserializer<LineTypesEnum> {
    public LineTypesEnumDeserializer() {
      super(LineTypesEnumDeserializer.class);
    }

    @Override
    public LineTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LineTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets lineTypes
   */
 @JsonDeserialize(using = LineTypesEnumDeserializer.class)
  public enum LineTypesEnum {
    TIE("TIE"),
    NETWORK("NETWORK"),
    TRUNK("TRUNK"),
    STATION("STATION");

    private String value;

    LineTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LineTypesEnum fromString(String key) {
      if (key == null) return null;

      for (LineTypesEnum value : LineTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LineTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<LineTypesEnum> lineTypes = new ArrayList<LineTypesEnum>();
  private String addressFamilyId = null;

  
  /**
   **/
  public EdgeInterface type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public EdgeInterface ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   **/
  public EdgeInterface name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public EdgeInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("macAddress")
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  
  /**
   **/
  public EdgeInterface ifName(String ifName) {
    this.ifName = ifName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifName")
  public String getIfName() {
    return ifName;
  }
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  
  /**
   **/
  public EdgeInterface endpoints(List<DomainEntityRef> endpoints) {
    this.endpoints = endpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endpoints")
  public List<DomainEntityRef> getEndpoints() {
    return endpoints;
  }
  public void setEndpoints(List<DomainEntityRef> endpoints) {
    this.endpoints = endpoints;
  }

  
  /**
   **/
  public EdgeInterface lineTypes(List<LineTypesEnum> lineTypes) {
    this.lineTypes = lineTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineTypes")
  public List<LineTypesEnum> getLineTypes() {
    return lineTypes;
  }
  public void setLineTypes(List<LineTypesEnum> lineTypes) {
    this.lineTypes = lineTypes;
  }

  
  /**
   **/
  public EdgeInterface addressFamilyId(String addressFamilyId) {
    this.addressFamilyId = addressFamilyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressFamilyId")
  public String getAddressFamilyId() {
    return addressFamilyId;
  }
  public void setAddressFamilyId(String addressFamilyId) {
    this.addressFamilyId = addressFamilyId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeInterface edgeInterface = (EdgeInterface) o;
    return Objects.equals(this.type, edgeInterface.type) &&
        Objects.equals(this.ipAddress, edgeInterface.ipAddress) &&
        Objects.equals(this.name, edgeInterface.name) &&
        Objects.equals(this.macAddress, edgeInterface.macAddress) &&
        Objects.equals(this.ifName, edgeInterface.ifName) &&
        Objects.equals(this.endpoints, edgeInterface.endpoints) &&
        Objects.equals(this.lineTypes, edgeInterface.lineTypes) &&
        Objects.equals(this.addressFamilyId, edgeInterface.addressFamilyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ipAddress, name, macAddress, ifName, endpoints, lineTypes, addressFamilyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeInterface {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    lineTypes: ").append(toIndentedString(lineTypes)).append("\n");
    sb.append("    addressFamilyId: ").append(toIndentedString(addressFamilyId)).append("\n");
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

