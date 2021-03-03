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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LicenseAssignmentRequest
 */

public class LicenseAssignmentRequest  implements Serializable {
  
  private String licenseId = null;
  private List<String> userIdsAdd = new ArrayList<String>();
  private List<String> userIdsRemove = new ArrayList<String>();

  
  /**
   * The id of the license to assign/unassign.
   **/
  public LicenseAssignmentRequest licenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the license to assign/unassign.")
  @JsonProperty("licenseId")
  public String getLicenseId() {
    return licenseId;
  }
  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }

  
  /**
   * The ids of users to assign this license to.
   **/
  public LicenseAssignmentRequest userIdsAdd(List<String> userIdsAdd) {
    this.userIdsAdd = userIdsAdd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of users to assign this license to.")
  @JsonProperty("userIdsAdd")
  public List<String> getUserIdsAdd() {
    return userIdsAdd;
  }
  public void setUserIdsAdd(List<String> userIdsAdd) {
    this.userIdsAdd = userIdsAdd;
  }

  
  /**
   * The ids of users to unassign this license from.
   **/
  public LicenseAssignmentRequest userIdsRemove(List<String> userIdsRemove) {
    this.userIdsRemove = userIdsRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of users to unassign this license from.")
  @JsonProperty("userIdsRemove")
  public List<String> getUserIdsRemove() {
    return userIdsRemove;
  }
  public void setUserIdsRemove(List<String> userIdsRemove) {
    this.userIdsRemove = userIdsRemove;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseAssignmentRequest licenseAssignmentRequest = (LicenseAssignmentRequest) o;
    return Objects.equals(this.licenseId, licenseAssignmentRequest.licenseId) &&
        Objects.equals(this.userIdsAdd, licenseAssignmentRequest.userIdsAdd) &&
        Objects.equals(this.userIdsRemove, licenseAssignmentRequest.userIdsRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseId, userIdsAdd, userIdsRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseAssignmentRequest {\n");
    
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    userIdsAdd: ").append(toIndentedString(userIdsAdd)).append("\n");
    sb.append("    userIdsRemove: ").append(toIndentedString(userIdsRemove)).append("\n");
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

