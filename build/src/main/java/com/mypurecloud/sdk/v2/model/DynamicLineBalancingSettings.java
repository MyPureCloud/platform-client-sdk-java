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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DynamicLineBalancingSettings
 */

public class DynamicLineBalancingSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Integer relativeWeight = null;

  public DynamicLineBalancingSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates that this campaign is subject of dynamic line balancing
   **/
  public DynamicLineBalancingSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this campaign is subject of dynamic line balancing")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Relative weight of this campaign in dynamic line balancing
   **/
  public DynamicLineBalancingSettings relativeWeight(Integer relativeWeight) {
    this.relativeWeight = relativeWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Relative weight of this campaign in dynamic line balancing")
  @JsonProperty("relativeWeight")
  public Integer getRelativeWeight() {
    return relativeWeight;
  }
  public void setRelativeWeight(Integer relativeWeight) {
    this.relativeWeight = relativeWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicLineBalancingSettings dynamicLineBalancingSettings = (DynamicLineBalancingSettings) o;

    return Objects.equals(this.enabled, dynamicLineBalancingSettings.enabled) &&
            Objects.equals(this.relativeWeight, dynamicLineBalancingSettings.relativeWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, relativeWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicLineBalancingSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    relativeWeight: ").append(toIndentedString(relativeWeight)).append("\n");
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

