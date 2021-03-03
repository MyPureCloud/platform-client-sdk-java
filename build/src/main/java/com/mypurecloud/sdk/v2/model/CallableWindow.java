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
import com.mypurecloud.sdk.v2.model.AtzmTimeSlot;
import com.mypurecloud.sdk.v2.model.AtzmTimeSlotWithTimeZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CallableWindow
 */

public class CallableWindow  implements Serializable {
  
  private AtzmTimeSlot mapped = null;
  private AtzmTimeSlotWithTimeZone unmapped = null;

  
  /**
   * The time interval to place outbound calls, for contacts that can be mapped to a time zone.
   **/
  public CallableWindow mapped(AtzmTimeSlot mapped) {
    this.mapped = mapped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time interval to place outbound calls, for contacts that can be mapped to a time zone.")
  @JsonProperty("mapped")
  public AtzmTimeSlot getMapped() {
    return mapped;
  }
  public void setMapped(AtzmTimeSlot mapped) {
    this.mapped = mapped;
  }

  
  /**
   * The time interval and time zone to place outbound calls, for contacts that cannot be mapped to a time zone.
   **/
  public CallableWindow unmapped(AtzmTimeSlotWithTimeZone unmapped) {
    this.unmapped = unmapped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time interval and time zone to place outbound calls, for contacts that cannot be mapped to a time zone.")
  @JsonProperty("unmapped")
  public AtzmTimeSlotWithTimeZone getUnmapped() {
    return unmapped;
  }
  public void setUnmapped(AtzmTimeSlotWithTimeZone unmapped) {
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
    CallableWindow callableWindow = (CallableWindow) o;
    return Objects.equals(this.mapped, callableWindow.mapped) &&
        Objects.equals(this.unmapped, callableWindow.unmapped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapped, unmapped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallableWindow {\n");
    
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

