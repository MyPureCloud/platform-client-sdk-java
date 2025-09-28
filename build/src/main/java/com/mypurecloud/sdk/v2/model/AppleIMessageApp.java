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
 * AppleIMessageApp
 */

public class AppleIMessageApp  implements Serializable {
  
  private String applicationName = null;
  private String applicationId = null;
  private String bundleId = null;

  public AppleIMessageApp() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Application Name.
   **/
  public AppleIMessageApp applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Application Name.")
  @JsonProperty("applicationName")
  public String getApplicationName() {
    return applicationName;
  }
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  /**
   * Application ID.
   **/
  public AppleIMessageApp applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Application ID.")
  @JsonProperty("applicationId")
  public String getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  /**
   * Bundle ID.
   **/
  public AppleIMessageApp bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bundle ID.")
  @JsonProperty("bundleId")
  public String getBundleId() {
    return bundleId;
  }
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleIMessageApp appleIMessageApp = (AppleIMessageApp) o;

    return Objects.equals(this.applicationName, appleIMessageApp.applicationName) &&
            Objects.equals(this.applicationId, appleIMessageApp.applicationId) &&
            Objects.equals(this.bundleId, appleIMessageApp.bundleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, applicationId, bundleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleIMessageApp {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

