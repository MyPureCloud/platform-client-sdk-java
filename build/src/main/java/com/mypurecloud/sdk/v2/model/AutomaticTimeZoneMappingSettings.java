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
import com.mypurecloud.sdk.v2.model.CallableWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AutomaticTimeZoneMappingSettings
 */

public class AutomaticTimeZoneMappingSettings  implements Serializable {
  
  private List<CallableWindow> callableWindows = new ArrayList<CallableWindow>();
  private List<String> supportedCountries = new ArrayList<String>();

  
  /**
   * The time intervals to use for automatic time zone mapping.
   **/
  public AutomaticTimeZoneMappingSettings callableWindows(List<CallableWindow> callableWindows) {
    this.callableWindows = callableWindows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time intervals to use for automatic time zone mapping.")
  @JsonProperty("callableWindows")
  public List<CallableWindow> getCallableWindows() {
    return callableWindows;
  }
  public void setCallableWindows(List<CallableWindow> callableWindows) {
    this.callableWindows = callableWindows;
  }

  
  /**
   * The countries that are supported for automatic time zone mapping.
   **/
  public AutomaticTimeZoneMappingSettings supportedCountries(List<String> supportedCountries) {
    this.supportedCountries = supportedCountries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The countries that are supported for automatic time zone mapping.")
  @JsonProperty("supportedCountries")
  public List<String> getSupportedCountries() {
    return supportedCountries;
  }
  public void setSupportedCountries(List<String> supportedCountries) {
    this.supportedCountries = supportedCountries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomaticTimeZoneMappingSettings automaticTimeZoneMappingSettings = (AutomaticTimeZoneMappingSettings) o;
    return Objects.equals(this.callableWindows, automaticTimeZoneMappingSettings.callableWindows) &&
        Objects.equals(this.supportedCountries, automaticTimeZoneMappingSettings.supportedCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callableWindows, supportedCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticTimeZoneMappingSettings {\n");
    
    sb.append("    callableWindows: ").append(toIndentedString(callableWindows)).append("\n");
    sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
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

