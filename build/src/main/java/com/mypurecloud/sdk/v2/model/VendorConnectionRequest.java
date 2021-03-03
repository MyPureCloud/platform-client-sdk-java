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

import java.io.Serializable;
/**
 * VendorConnectionRequest
 */

public class VendorConnectionRequest  implements Serializable {
  
  private String publisher = null;
  private String type = null;
  private String name = null;

  
  /**
   * Publisher of the integration or connector who registered the new connection. Typically, inin.
   **/
  public VendorConnectionRequest publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Publisher of the integration or connector who registered the new connection. Typically, inin.")
  @JsonProperty("publisher")
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  
  /**
   * Integration or connector type that registered the new connection. Example, wfm-rta-integration
   **/
  public VendorConnectionRequest type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Integration or connector type that registered the new connection. Example, wfm-rta-integration")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Name of the integration or connector instance that registered the new connection. Example, my-wfm
   **/
  public VendorConnectionRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the integration or connector instance that registered the new connection. Example, my-wfm")
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
    VendorConnectionRequest vendorConnectionRequest = (VendorConnectionRequest) o;
    return Objects.equals(this.publisher, vendorConnectionRequest.publisher) &&
        Objects.equals(this.type, vendorConnectionRequest.type) &&
        Objects.equals(this.name, vendorConnectionRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publisher, type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorConnectionRequest {\n");
    
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

