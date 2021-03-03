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
 * MediaUtilization
 */

public class MediaUtilization  implements Serializable {
  
  private Integer maximumCapacity = null;
  private List<String> interruptableMediaTypes = new ArrayList<String>();
  private Boolean includeNonAcd = null;

  
  /**
   * Defines the maximum number of conversations of this type that an agent can handle at one time.
   **/
  public MediaUtilization maximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the maximum number of conversations of this type that an agent can handle at one time.")
  @JsonProperty("maximumCapacity")
  public Integer getMaximumCapacity() {
    return maximumCapacity;
  }
  public void setMaximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }

  
  /**
   * Defines the list of other media types that can interrupt a conversation of this media type.  Values include call, chat, email, callback, and message.
   **/
  public MediaUtilization interruptableMediaTypes(List<String> interruptableMediaTypes) {
    this.interruptableMediaTypes = interruptableMediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the list of other media types that can interrupt a conversation of this media type.  Values include call, chat, email, callback, and message.")
  @JsonProperty("interruptableMediaTypes")
  public List<String> getInterruptableMediaTypes() {
    return interruptableMediaTypes;
  }
  public void setInterruptableMediaTypes(List<String> interruptableMediaTypes) {
    this.interruptableMediaTypes = interruptableMediaTypes;
  }

  
  /**
   * If true, then track non-ACD conversations against utilization
   **/
  public MediaUtilization includeNonAcd(Boolean includeNonAcd) {
    this.includeNonAcd = includeNonAcd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, then track non-ACD conversations against utilization")
  @JsonProperty("includeNonAcd")
  public Boolean getIncludeNonAcd() {
    return includeNonAcd;
  }
  public void setIncludeNonAcd(Boolean includeNonAcd) {
    this.includeNonAcd = includeNonAcd;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUtilization mediaUtilization = (MediaUtilization) o;
    return Objects.equals(this.maximumCapacity, mediaUtilization.maximumCapacity) &&
        Objects.equals(this.interruptableMediaTypes, mediaUtilization.interruptableMediaTypes) &&
        Objects.equals(this.includeNonAcd, mediaUtilization.includeNonAcd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumCapacity, interruptableMediaTypes, includeNonAcd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUtilization {\n");
    
    sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
    sb.append("    interruptableMediaTypes: ").append(toIndentedString(interruptableMediaTypes)).append("\n");
    sb.append("    includeNonAcd: ").append(toIndentedString(includeNonAcd)).append("\n");
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

