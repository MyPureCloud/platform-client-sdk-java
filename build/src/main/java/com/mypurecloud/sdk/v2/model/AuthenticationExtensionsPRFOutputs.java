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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AuthenticationExtensionsPRFOutputs
 */

public class AuthenticationExtensionsPRFOutputs  implements Serializable {
  
  private Boolean enabled = null;
  private Map<String, String> results = null;

  public AuthenticationExtensionsPRFOutputs() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AuthenticationExtensionsPRFOutputs(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether the PRF extension was enabled for this ceremony.
   **/
  public AuthenticationExtensionsPRFOutputs enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the PRF extension was enabled for this ceremony.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * PRF evaluation results keyed by input name (values are base64url-encoded octets).
   **/
  public AuthenticationExtensionsPRFOutputs results(Map<String, String> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "PRF evaluation results keyed by input name (values are base64url-encoded octets).")
  @JsonProperty("results")
  public Map<String, String> getResults() {
    return results;
  }
  public void setResults(Map<String, String> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationExtensionsPRFOutputs authenticationExtensionsPRFOutputs = (AuthenticationExtensionsPRFOutputs) o;

    return Objects.equals(this.enabled, authenticationExtensionsPRFOutputs.enabled) &&
            Objects.equals(this.results, authenticationExtensionsPRFOutputs.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationExtensionsPRFOutputs {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

