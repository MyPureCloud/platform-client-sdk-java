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
 * Defines a request in the SCIM service provider&#39;s configuration.
 */
@ApiModel(description = "Defines a request in the SCIM service provider's configuration.")

public class ScimServiceProviderConfigSimpleFeature  implements Serializable {
  
  private Boolean supported = null;

  
  @ApiModelProperty(example = "null", value = "Indicates whether configuration options are supported.")
  @JsonProperty("supported")
  public Boolean getSupported() {
    return supported;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfigSimpleFeature scimServiceProviderConfigSimpleFeature = (ScimServiceProviderConfigSimpleFeature) o;
    return Objects.equals(this.supported, scimServiceProviderConfigSimpleFeature.supported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfigSimpleFeature {\n");
    
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
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

