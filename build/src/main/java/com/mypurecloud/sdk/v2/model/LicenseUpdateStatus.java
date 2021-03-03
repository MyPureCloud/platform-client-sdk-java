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
 * LicenseUpdateStatus
 */

public class LicenseUpdateStatus  implements Serializable {
  
  private String userId = null;
  private String licenseId = null;
  private String result = null;

  
  /**
   **/
  public LicenseUpdateStatus userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public LicenseUpdateStatus licenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("licenseId")
  public String getLicenseId() {
    return licenseId;
  }
  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }

  
  /**
   **/
  public LicenseUpdateStatus result(String result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseUpdateStatus licenseUpdateStatus = (LicenseUpdateStatus) o;
    return Objects.equals(this.userId, licenseUpdateStatus.userId) &&
        Objects.equals(this.licenseId, licenseUpdateStatus.licenseId) &&
        Objects.equals(this.result, licenseUpdateStatus.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, licenseId, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseUpdateStatus {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

