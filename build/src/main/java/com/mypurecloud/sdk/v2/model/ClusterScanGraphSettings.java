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

import java.io.Serializable;
/**
 * ClusterScanGraphSettings
 */

public class ClusterScanGraphSettings  implements Serializable {
  
  private Boolean automaticMergingEnabled = null;

  public ClusterScanGraphSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ClusterScanGraphSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether to enable automatic merging of discovered clusters
   **/
  public ClusterScanGraphSettings automaticMergingEnabled(Boolean automaticMergingEnabled) {
    this.automaticMergingEnabled = automaticMergingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enable automatic merging of discovered clusters")
  @JsonProperty("automaticMergingEnabled")
  public Boolean getAutomaticMergingEnabled() {
    return automaticMergingEnabled;
  }
  public void setAutomaticMergingEnabled(Boolean automaticMergingEnabled) {
    this.automaticMergingEnabled = automaticMergingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterScanGraphSettings clusterScanGraphSettings = (ClusterScanGraphSettings) o;

    return Objects.equals(this.automaticMergingEnabled, clusterScanGraphSettings.automaticMergingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticMergingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterScanGraphSettings {\n");
    
    sb.append("    automaticMergingEnabled: ").append(toIndentedString(automaticMergingEnabled)).append("\n");
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

