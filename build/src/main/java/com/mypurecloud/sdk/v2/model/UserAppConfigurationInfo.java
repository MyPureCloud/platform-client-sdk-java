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
import com.mypurecloud.sdk.v2.model.EffectiveConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Configuration information for the integration
 */
@ApiModel(description = "Configuration information for the integration")

public class UserAppConfigurationInfo  implements Serializable {
  
  private IntegrationConfiguration current = null;
  private EffectiveConfiguration effective = null;

  
  @ApiModelProperty(example = "null", value = "The current, active configuration for the integration.")
  @JsonProperty("current")
  public IntegrationConfiguration getCurrent() {
    return current;
  }

  
  @ApiModelProperty(example = "null", value = "The effective configuration for the app, containing the integration specific configuration along with overrides specified in the integration type.")
  @JsonProperty("effective")
  public EffectiveConfiguration getEffective() {
    return effective;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAppConfigurationInfo userAppConfigurationInfo = (UserAppConfigurationInfo) o;
    return Objects.equals(this.current, userAppConfigurationInfo.current) &&
        Objects.equals(this.effective, userAppConfigurationInfo.effective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, effective);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAppConfigurationInfo {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
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

