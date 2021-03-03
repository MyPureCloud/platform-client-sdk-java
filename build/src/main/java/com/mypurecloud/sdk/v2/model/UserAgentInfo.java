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
 * UserAgentInfo
 */

public class UserAgentInfo  implements Serializable {
  
  private String firmwareVersion = null;
  private String manufacturer = null;
  private String model = null;

  
  /**
   * The firmware version of the phone.
   **/
  public UserAgentInfo firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The firmware version of the phone.")
  @JsonProperty("firmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   * The manufacturer of the phone.
   **/
  public UserAgentInfo manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The manufacturer of the phone.")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The model of the phone.
   **/
  public UserAgentInfo model(String model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The model of the phone.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAgentInfo userAgentInfo = (UserAgentInfo) o;
    return Objects.equals(this.firmwareVersion, userAgentInfo.firmwareVersion) &&
        Objects.equals(this.manufacturer, userAgentInfo.manufacturer) &&
        Objects.equals(this.model, userAgentInfo.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmwareVersion, manufacturer, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgentInfo {\n");
    
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

