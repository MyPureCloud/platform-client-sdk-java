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
import com.mypurecloud.sdk.v2.model.WfmServiceGoalImpactSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ServiceGoalTemplateImpactOverride
 */

public class ServiceGoalTemplateImpactOverride  implements Serializable {
  
  private Boolean enabled = null;
  private WfmServiceGoalImpactSettings impact = null;

  public ServiceGoalTemplateImpactOverride() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether service goal overrides are enabled for this service goal template
   **/
  public ServiceGoalTemplateImpactOverride enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether service goal overrides are enabled for this service goal template")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Settings controlling max percent increase and decrease of service goals for this service goal template
   **/
  public ServiceGoalTemplateImpactOverride impact(WfmServiceGoalImpactSettings impact) {
    this.impact = impact;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings controlling max percent increase and decrease of service goals for this service goal template")
  @JsonProperty("impact")
  public WfmServiceGoalImpactSettings getImpact() {
    return impact;
  }
  public void setImpact(WfmServiceGoalImpactSettings impact) {
    this.impact = impact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceGoalTemplateImpactOverride serviceGoalTemplateImpactOverride = (ServiceGoalTemplateImpactOverride) o;

    return Objects.equals(this.enabled, serviceGoalTemplateImpactOverride.enabled) &&
            Objects.equals(this.impact, serviceGoalTemplateImpactOverride.impact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, impact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGoalTemplateImpactOverride {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
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

