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
import com.mypurecloud.sdk.v2.model.DialerOutboundSettingsConfigChangeCallableWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The settings for automatic time zone mapping
 */
@ApiModel(description = "The settings for automatic time zone mapping")

public class DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings  implements Serializable {
  
  private List<DialerOutboundSettingsConfigChangeCallableWindow> callableWindows = null;

  public DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      callableWindows = new ArrayList<DialerOutboundSettingsConfigChangeCallableWindow>();
    }
  }

  
  /**
   * The time intervals to use for automatic time zone mapping
   **/
  public DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings callableWindows(List<DialerOutboundSettingsConfigChangeCallableWindow> callableWindows) {
    this.callableWindows = callableWindows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time intervals to use for automatic time zone mapping")
  @JsonProperty("callableWindows")
  public List<DialerOutboundSettingsConfigChangeCallableWindow> getCallableWindows() {
    return callableWindows;
  }
  public void setCallableWindows(List<DialerOutboundSettingsConfigChangeCallableWindow> callableWindows) {
    this.callableWindows = callableWindows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings dialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings = (DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings) o;

    return Objects.equals(this.callableWindows, dialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings.callableWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callableWindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings {\n");
    
    sb.append("    callableWindows: ").append(toIndentedString(callableWindows)).append("\n");
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

