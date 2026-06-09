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
 * OrganizationLinkApprovalRequest
 */

public class OrganizationLinkApprovalRequest  implements Serializable {
  
  private Boolean approval = null;

  public OrganizationLinkApprovalRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OrganizationLinkApprovalRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Value for approving or rejecting an organization link, true is approved, false is rejected
   **/
  public OrganizationLinkApprovalRequest approval(Boolean approval) {
    this.approval = approval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value for approving or rejecting an organization link, true is approved, false is rejected")
  @JsonProperty("approval")
  public Boolean getApproval() {
    return approval;
  }
  public void setApproval(Boolean approval) {
    this.approval = approval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationLinkApprovalRequest organizationLinkApprovalRequest = (OrganizationLinkApprovalRequest) o;

    return Objects.equals(this.approval, organizationLinkApprovalRequest.approval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationLinkApprovalRequest {\n");
    
    sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
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

