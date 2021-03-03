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
 * PhoneChangeTopicUserAgentInfo
 */

public class PhoneChangeTopicUserAgentInfo  implements Serializable {
  
  private String firmwareVersion = null;
  private String manufacturer = null;
  private String model = null;

  
  /**
   **/
  public PhoneChangeTopicUserAgentInfo firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   **/
  public PhoneChangeTopicUserAgentInfo manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   **/
  public PhoneChangeTopicUserAgentInfo model(String model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    PhoneChangeTopicUserAgentInfo phoneChangeTopicUserAgentInfo = (PhoneChangeTopicUserAgentInfo) o;
    return Objects.equals(this.firmwareVersion, phoneChangeTopicUserAgentInfo.firmwareVersion) &&
        Objects.equals(this.manufacturer, phoneChangeTopicUserAgentInfo.manufacturer) &&
        Objects.equals(this.model, phoneChangeTopicUserAgentInfo.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmwareVersion, manufacturer, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicUserAgentInfo {\n");
    
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

