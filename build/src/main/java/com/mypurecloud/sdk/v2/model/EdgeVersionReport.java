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
import com.mypurecloud.sdk.v2.model.EdgeVersionInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeVersionReport
 */

public class EdgeVersionReport  implements Serializable {
  
  private EdgeVersionInformation oldestVersion = null;
  private EdgeVersionInformation newestVersion = null;

  public EdgeVersionReport() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public EdgeVersionReport oldestVersion(EdgeVersionInformation oldestVersion) {
    this.oldestVersion = oldestVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oldestVersion")
  public EdgeVersionInformation getOldestVersion() {
    return oldestVersion;
  }
  public void setOldestVersion(EdgeVersionInformation oldestVersion) {
    this.oldestVersion = oldestVersion;
  }


  /**
   **/
  public EdgeVersionReport newestVersion(EdgeVersionInformation newestVersion) {
    this.newestVersion = newestVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newestVersion")
  public EdgeVersionInformation getNewestVersion() {
    return newestVersion;
  }
  public void setNewestVersion(EdgeVersionInformation newestVersion) {
    this.newestVersion = newestVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeVersionReport edgeVersionReport = (EdgeVersionReport) o;

    return Objects.equals(this.oldestVersion, edgeVersionReport.oldestVersion) &&
            Objects.equals(this.newestVersion, edgeVersionReport.newestVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldestVersion, newestVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeVersionReport {\n");
    
    sb.append("    oldestVersion: ").append(toIndentedString(oldestVersion)).append("\n");
    sb.append("    newestVersion: ").append(toIndentedString(newestVersion)).append("\n");
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

