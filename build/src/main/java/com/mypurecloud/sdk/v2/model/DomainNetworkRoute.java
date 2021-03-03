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
 * DomainNetworkRoute
 */

public class DomainNetworkRoute  implements Serializable {
  
  private String prefix = null;
  private String nexthop = null;
  private Boolean persistent = null;
  private Integer metric = null;

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
   * The address family for this route.
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
   * The IPv4 or IPv6 route prefix in CIDR notation.
   **/
  public DomainNetworkRoute prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IPv4 or IPv6 route prefix in CIDR notation.")
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  
  /**
   * The IPv4 or IPv6 nexthop IP address.
   **/
  public DomainNetworkRoute nexthop(String nexthop) {
    this.nexthop = nexthop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IPv4 or IPv6 nexthop IP address.")
  @JsonProperty("nexthop")
  public String getNexthop() {
    return nexthop;
  }
  public void setNexthop(String nexthop) {
    this.nexthop = nexthop;
  }

  
  /**
   * True if this route will persist on Edge restart.  Routes assigned by DHCP will be returned as false.
   **/
  public DomainNetworkRoute persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this route will persist on Edge restart.  Routes assigned by DHCP will be returned as false.")
  @JsonProperty("persistent")
  public Boolean getPersistent() {
    return persistent;
  }
  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  
  /**
   * The metric being used for route. Lower values will have a higher priority.
   **/
  public DomainNetworkRoute metric(Integer metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric being used for route. Lower values will have a higher priority.")
  @JsonProperty("metric")
  public Integer getMetric() {
    return metric;
  }
  public void setMetric(Integer metric) {
    this.metric = metric;
  }

  
  /**
   * The address family for this route.
   **/
  public DomainNetworkRoute family(FamilyEnum family) {
    this.family = family;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address family for this route.")
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
    DomainNetworkRoute domainNetworkRoute = (DomainNetworkRoute) o;
    return Objects.equals(this.prefix, domainNetworkRoute.prefix) &&
        Objects.equals(this.nexthop, domainNetworkRoute.nexthop) &&
        Objects.equals(this.persistent, domainNetworkRoute.persistent) &&
        Objects.equals(this.metric, domainNetworkRoute.metric) &&
        Objects.equals(this.family, domainNetworkRoute.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, nexthop, persistent, metric, family);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainNetworkRoute {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

