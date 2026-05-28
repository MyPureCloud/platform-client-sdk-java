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
 * OpportunityEnrollmentCounts
 */

public class OpportunityEnrollmentCounts  implements Serializable {
  
  private Integer pending = null;
  private Integer approved = null;
  private Integer denied = null;
  private Integer withdrawn = null;

  public OpportunityEnrollmentCounts() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OpportunityEnrollmentCounts(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The number of pending enrollments for this opportunity
   **/
  public OpportunityEnrollmentCounts pending(Integer pending) {
    this.pending = pending;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pending enrollments for this opportunity")
  @JsonProperty("pending")
  public Integer getPending() {
    return pending;
  }
  public void setPending(Integer pending) {
    this.pending = pending;
  }


  /**
   * The number of approved enrollments for this opportunity
   **/
  public OpportunityEnrollmentCounts approved(Integer approved) {
    this.approved = approved;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of approved enrollments for this opportunity")
  @JsonProperty("approved")
  public Integer getApproved() {
    return approved;
  }
  public void setApproved(Integer approved) {
    this.approved = approved;
  }


  /**
   * The number of denied enrollments for this opportunity
   **/
  public OpportunityEnrollmentCounts denied(Integer denied) {
    this.denied = denied;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of denied enrollments for this opportunity")
  @JsonProperty("denied")
  public Integer getDenied() {
    return denied;
  }
  public void setDenied(Integer denied) {
    this.denied = denied;
  }


  /**
   * The number of withdrawn enrollments for this opportunity
   **/
  public OpportunityEnrollmentCounts withdrawn(Integer withdrawn) {
    this.withdrawn = withdrawn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of withdrawn enrollments for this opportunity")
  @JsonProperty("withdrawn")
  public Integer getWithdrawn() {
    return withdrawn;
  }
  public void setWithdrawn(Integer withdrawn) {
    this.withdrawn = withdrawn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpportunityEnrollmentCounts opportunityEnrollmentCounts = (OpportunityEnrollmentCounts) o;

    return Objects.equals(this.pending, opportunityEnrollmentCounts.pending) &&
            Objects.equals(this.approved, opportunityEnrollmentCounts.approved) &&
            Objects.equals(this.denied, opportunityEnrollmentCounts.denied) &&
            Objects.equals(this.withdrawn, opportunityEnrollmentCounts.withdrawn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pending, approved, denied, withdrawn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityEnrollmentCounts {\n");
    
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    denied: ").append(toIndentedString(denied)).append("\n");
    sb.append("    withdrawn: ").append(toIndentedString(withdrawn)).append("\n");
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

