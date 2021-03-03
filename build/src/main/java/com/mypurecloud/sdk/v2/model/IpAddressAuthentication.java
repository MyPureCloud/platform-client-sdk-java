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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IpAddressAuthentication
 */

public class IpAddressAuthentication  implements Serializable {
  
  private List<String> networkWhitelist = new ArrayList<String>();

  
  /**
   **/
  public IpAddressAuthentication networkWhitelist(List<String> networkWhitelist) {
    this.networkWhitelist = networkWhitelist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("networkWhitelist")
  public List<String> getNetworkWhitelist() {
    return networkWhitelist;
  }
  public void setNetworkWhitelist(List<String> networkWhitelist) {
    this.networkWhitelist = networkWhitelist;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressAuthentication ipAddressAuthentication = (IpAddressAuthentication) o;
    return Objects.equals(this.networkWhitelist, ipAddressAuthentication.networkWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressAuthentication {\n");
    
    sb.append("    networkWhitelist: ").append(toIndentedString(networkWhitelist)).append("\n");
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

