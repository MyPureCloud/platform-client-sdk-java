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

import java.io.Serializable;
/**
 * LicenseOrgToggle
 */

public class LicenseOrgToggle  implements Serializable {
  
  private String featureName = null;
  private Boolean enabled = null;

  
  /**
   **/
  public LicenseOrgToggle featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("featureName")
  public String getFeatureName() {
    return featureName;
  }
  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  
  /**
   **/
  public LicenseOrgToggle enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseOrgToggle licenseOrgToggle = (LicenseOrgToggle) o;
    return Objects.equals(this.featureName, licenseOrgToggle.featureName) &&
        Objects.equals(this.enabled, licenseOrgToggle.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseOrgToggle {\n");
    
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

