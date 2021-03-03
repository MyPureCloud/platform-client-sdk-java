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
 * DialerContactlistfilterConfigChangeRange
 */

public class DialerContactlistfilterConfigChangeRange  implements Serializable {
  
  private String min = null;
  private String max = null;
  private Boolean minInclusive = null;
  private Boolean maxInclusive = null;
  private List<String> inSet = new ArrayList<String>();
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerContactlistfilterConfigChangeRange min(String min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("min")
  public String getMin() {
    return min;
  }
  public void setMin(String min) {
    this.min = min;
  }

  
  /**
   **/
  public DialerContactlistfilterConfigChangeRange max(String max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("max")
  public String getMax() {
    return max;
  }
  public void setMax(String max) {
    this.max = max;
  }

  
  /**
   **/
  public DialerContactlistfilterConfigChangeRange minInclusive(Boolean minInclusive) {
    this.minInclusive = minInclusive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minInclusive")
  public Boolean getMinInclusive() {
    return minInclusive;
  }
  public void setMinInclusive(Boolean minInclusive) {
    this.minInclusive = minInclusive;
  }

  
  /**
   **/
  public DialerContactlistfilterConfigChangeRange maxInclusive(Boolean maxInclusive) {
    this.maxInclusive = maxInclusive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxInclusive")
  public Boolean getMaxInclusive() {
    return maxInclusive;
  }
  public void setMaxInclusive(Boolean maxInclusive) {
    this.maxInclusive = maxInclusive;
  }

  
  /**
   **/
  public DialerContactlistfilterConfigChangeRange inSet(List<String> inSet) {
    this.inSet = inSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inSet")
  public List<String> getInSet() {
    return inSet;
  }
  public void setInSet(List<String> inSet) {
    this.inSet = inSet;
  }

  
  /**
   **/
  public DialerContactlistfilterConfigChangeRange additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerContactlistfilterConfigChangeRange dialerContactlistfilterConfigChangeRange = (DialerContactlistfilterConfigChangeRange) o;
    return Objects.equals(this.min, dialerContactlistfilterConfigChangeRange.min) &&
        Objects.equals(this.max, dialerContactlistfilterConfigChangeRange.max) &&
        Objects.equals(this.minInclusive, dialerContactlistfilterConfigChangeRange.minInclusive) &&
        Objects.equals(this.maxInclusive, dialerContactlistfilterConfigChangeRange.maxInclusive) &&
        Objects.equals(this.inSet, dialerContactlistfilterConfigChangeRange.inSet) &&
        Objects.equals(this.additionalProperties, dialerContactlistfilterConfigChangeRange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, minInclusive, maxInclusive, inSet, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistfilterConfigChangeRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    minInclusive: ").append(toIndentedString(minInclusive)).append("\n");
    sb.append("    maxInclusive: ").append(toIndentedString(maxInclusive)).append("\n");
    sb.append("    inSet: ").append(toIndentedString(inSet)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

