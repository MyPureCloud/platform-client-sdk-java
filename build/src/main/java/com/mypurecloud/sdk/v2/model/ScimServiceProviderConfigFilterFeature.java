package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * \&quot;filter\&quot; configuration options.
 */
@ApiModel(description = "\"filter\" configuration options.")

public class ScimServiceProviderConfigFilterFeature  implements Serializable {
  
  private Boolean supported = null;
  private Integer maxResults = null;

  
  @ApiModelProperty(example = "null", value = "Indicates whether configuration options are supported.")
  @JsonProperty("supported")
  public Boolean getSupported() {
    return supported;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum number of results returned from a filtered query.")
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfigFilterFeature scimServiceProviderConfigFilterFeature = (ScimServiceProviderConfigFilterFeature) o;
    return Objects.equals(this.supported, scimServiceProviderConfigFilterFeature.supported) &&
        Objects.equals(this.maxResults, scimServiceProviderConfigFilterFeature.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfigFilterFeature {\n");
    
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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

