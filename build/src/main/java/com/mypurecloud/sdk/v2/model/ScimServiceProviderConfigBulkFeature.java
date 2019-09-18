package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Bulk feature configuration
 */
@ApiModel(description = "Bulk feature configuration")

public class ScimServiceProviderConfigBulkFeature  implements Serializable {
  
  private Boolean supported = null;
  private Integer maxOperations = null;
  private Integer maxPayloadSize = null;

  
  @ApiModelProperty(example = "null", value = "Indicates if configuration options is supported.")
  @JsonProperty("supported")
  public Boolean getSupported() {
    return supported;
  }

  
  @ApiModelProperty(example = "null", value = "Maximum operations per bulk request.")
  @JsonProperty("maxOperations")
  public Integer getMaxOperations() {
    return maxOperations;
  }

  
  @ApiModelProperty(example = "null", value = "Maximum payload size.")
  @JsonProperty("maxPayloadSize")
  public Integer getMaxPayloadSize() {
    return maxPayloadSize;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfigBulkFeature scimServiceProviderConfigBulkFeature = (ScimServiceProviderConfigBulkFeature) o;
    return Objects.equals(this.supported, scimServiceProviderConfigBulkFeature.supported) &&
        Objects.equals(this.maxOperations, scimServiceProviderConfigBulkFeature.maxOperations) &&
        Objects.equals(this.maxPayloadSize, scimServiceProviderConfigBulkFeature.maxPayloadSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, maxOperations, maxPayloadSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfigBulkFeature {\n");
    
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    maxOperations: ").append(toIndentedString(maxOperations)).append("\n");
    sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
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

