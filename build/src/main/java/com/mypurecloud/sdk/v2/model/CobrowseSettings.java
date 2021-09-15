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
 * Settings concerning cobrowse
 */
@ApiModel(description = "Settings concerning cobrowse")

public class CobrowseSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean allowAgentControl = null;
  private List<String> maskSelectors = new ArrayList<String>();

  
  /**
   * Whether or not cobrowse is enabled
   **/
  public CobrowseSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not cobrowse is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Whether the viewer should have option to request control
   **/
  public CobrowseSettings allowAgentControl(Boolean allowAgentControl) {
    this.allowAgentControl = allowAgentControl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the viewer should have option to request control")
  @JsonProperty("allowAgentControl")
  public Boolean getAllowAgentControl() {
    return allowAgentControl;
  }
  public void setAllowAgentControl(Boolean allowAgentControl) {
    this.allowAgentControl = allowAgentControl;
  }

  
  /**
   * Mask patterns that will apply to pages being shared
   **/
  public CobrowseSettings maskSelectors(List<String> maskSelectors) {
    this.maskSelectors = maskSelectors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mask patterns that will apply to pages being shared")
  @JsonProperty("maskSelectors")
  public List<String> getMaskSelectors() {
    return maskSelectors;
  }
  public void setMaskSelectors(List<String> maskSelectors) {
    this.maskSelectors = maskSelectors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobrowseSettings cobrowseSettings = (CobrowseSettings) o;
    return Objects.equals(this.enabled, cobrowseSettings.enabled) &&
        Objects.equals(this.allowAgentControl, cobrowseSettings.allowAgentControl) &&
        Objects.equals(this.maskSelectors, cobrowseSettings.maskSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, allowAgentControl, maskSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrowseSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    allowAgentControl: ").append(toIndentedString(allowAgentControl)).append("\n");
    sb.append("    maskSelectors: ").append(toIndentedString(maskSelectors)).append("\n");
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

