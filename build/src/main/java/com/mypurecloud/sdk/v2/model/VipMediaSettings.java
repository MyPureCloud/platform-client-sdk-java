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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VipMediaSettings
 */

public class VipMediaSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean skipOwnershipTime = null;

  
  /**
   * Toggle that enables VIP experience for this feature.
   **/
  public VipMediaSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Toggle that enables VIP experience for this feature.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Toggle that enables this media type to fallback immediately to the configured VIP Backup.
   **/
  public VipMediaSettings skipOwnershipTime(Boolean skipOwnershipTime) {
    this.skipOwnershipTime = skipOwnershipTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Toggle that enables this media type to fallback immediately to the configured VIP Backup.")
  @JsonProperty("skipOwnershipTime")
  public Boolean getSkipOwnershipTime() {
    return skipOwnershipTime;
  }
  public void setSkipOwnershipTime(Boolean skipOwnershipTime) {
    this.skipOwnershipTime = skipOwnershipTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipMediaSettings vipMediaSettings = (VipMediaSettings) o;

    return Objects.equals(this.enabled, vipMediaSettings.enabled) &&
            Objects.equals(this.skipOwnershipTime, vipMediaSettings.skipOwnershipTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, skipOwnershipTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipMediaSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    skipOwnershipTime: ").append(toIndentedString(skipOwnershipTime)).append("\n");
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

