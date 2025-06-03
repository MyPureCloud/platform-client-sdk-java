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
import com.mypurecloud.sdk.v2.model.SummarySettingEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SummaryGenerationConfig
 */

public class SummaryGenerationConfig  implements Serializable {
  
  private Boolean enabled = null;
  private SummarySettingEntity summarySetting = null;

  public SummaryGenerationConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Copilot generated summary is enabled.
   **/
  public SummaryGenerationConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Copilot generated summary is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Configured summary setting object.
   **/
  public SummaryGenerationConfig summarySetting(SummarySettingEntity summarySetting) {
    this.summarySetting = summarySetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured summary setting object.")
  @JsonProperty("summarySetting")
  public SummarySettingEntity getSummarySetting() {
    return summarySetting;
  }
  public void setSummarySetting(SummarySettingEntity summarySetting) {
    this.summarySetting = summarySetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryGenerationConfig summaryGenerationConfig = (SummaryGenerationConfig) o;

    return Objects.equals(this.enabled, summaryGenerationConfig.enabled) &&
            Objects.equals(this.summarySetting, summaryGenerationConfig.summarySetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, summarySetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryGenerationConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    summarySetting: ").append(toIndentedString(summarySetting)).append("\n");
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

