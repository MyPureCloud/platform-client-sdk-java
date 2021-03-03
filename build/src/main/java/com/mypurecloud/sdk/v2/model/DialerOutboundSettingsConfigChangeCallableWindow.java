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
import com.mypurecloud.sdk.v2.model.DialerOutboundSettingsConfigChangeAtzmTimeSlot;
import com.mypurecloud.sdk.v2.model.DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialerOutboundSettingsConfigChangeCallableWindow
 */

public class DialerOutboundSettingsConfigChangeCallableWindow  implements Serializable {
  
  private DialerOutboundSettingsConfigChangeAtzmTimeSlot mapped = null;
  private DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone unmapped = null;

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeCallableWindow mapped(DialerOutboundSettingsConfigChangeAtzmTimeSlot mapped) {
    this.mapped = mapped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mapped")
  public DialerOutboundSettingsConfigChangeAtzmTimeSlot getMapped() {
    return mapped;
  }
  public void setMapped(DialerOutboundSettingsConfigChangeAtzmTimeSlot mapped) {
    this.mapped = mapped;
  }

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeCallableWindow unmapped(DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone unmapped) {
    this.unmapped = unmapped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unmapped")
  public DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone getUnmapped() {
    return unmapped;
  }
  public void setUnmapped(DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone unmapped) {
    this.unmapped = unmapped;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerOutboundSettingsConfigChangeCallableWindow dialerOutboundSettingsConfigChangeCallableWindow = (DialerOutboundSettingsConfigChangeCallableWindow) o;
    return Objects.equals(this.mapped, dialerOutboundSettingsConfigChangeCallableWindow.mapped) &&
        Objects.equals(this.unmapped, dialerOutboundSettingsConfigChangeCallableWindow.unmapped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapped, unmapped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerOutboundSettingsConfigChangeCallableWindow {\n");
    
    sb.append("    mapped: ").append(toIndentedString(mapped)).append("\n");
    sb.append("    unmapped: ").append(toIndentedString(unmapped)).append("\n");
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

