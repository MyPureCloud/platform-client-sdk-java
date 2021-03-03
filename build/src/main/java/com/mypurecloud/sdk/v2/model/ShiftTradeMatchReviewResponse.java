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
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchReviewUserResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchViolation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ShiftTradeMatchReviewResponse
 */

public class ShiftTradeMatchReviewResponse  implements Serializable {
  
  private ShiftTradeMatchReviewUserResponse initiatingUser = null;
  private ShiftTradeMatchReviewUserResponse receivingUser = null;
  private List<ShiftTradeMatchViolation> violations = new ArrayList<ShiftTradeMatchViolation>();
  private List<ShiftTradeMatchViolation> adminReviewViolations = new ArrayList<ShiftTradeMatchViolation>();

  
  /**
   * Details for the initiatingUser side of the shift trade
   **/
  public ShiftTradeMatchReviewResponse initiatingUser(ShiftTradeMatchReviewUserResponse initiatingUser) {
    this.initiatingUser = initiatingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details for the initiatingUser side of the shift trade")
  @JsonProperty("initiatingUser")
  public ShiftTradeMatchReviewUserResponse getInitiatingUser() {
    return initiatingUser;
  }
  public void setInitiatingUser(ShiftTradeMatchReviewUserResponse initiatingUser) {
    this.initiatingUser = initiatingUser;
  }

  
  /**
   * Details for the receivingUser side of the shift trade
   **/
  public ShiftTradeMatchReviewResponse receivingUser(ShiftTradeMatchReviewUserResponse receivingUser) {
    this.receivingUser = receivingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details for the receivingUser side of the shift trade")
  @JsonProperty("receivingUser")
  public ShiftTradeMatchReviewUserResponse getReceivingUser() {
    return receivingUser;
  }
  public void setReceivingUser(ShiftTradeMatchReviewUserResponse receivingUser) {
    this.receivingUser = receivingUser;
  }

  
  /**
   * Constraint violations introduced after being matched that would normally disallow a trade, but which can still be overridden by the shift trade administrator
   **/
  public ShiftTradeMatchReviewResponse violations(List<ShiftTradeMatchViolation> violations) {
    this.violations = violations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Constraint violations introduced after being matched that would normally disallow a trade, but which can still be overridden by the shift trade administrator")
  @JsonProperty("violations")
  public List<ShiftTradeMatchViolation> getViolations() {
    return violations;
  }
  public void setViolations(List<ShiftTradeMatchViolation> violations) {
    this.violations = violations;
  }

  
  /**
   * Constraint violations associated with this shift trade which require shift trade administrator review
   **/
  public ShiftTradeMatchReviewResponse adminReviewViolations(List<ShiftTradeMatchViolation> adminReviewViolations) {
    this.adminReviewViolations = adminReviewViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Constraint violations associated with this shift trade which require shift trade administrator review")
  @JsonProperty("adminReviewViolations")
  public List<ShiftTradeMatchViolation> getAdminReviewViolations() {
    return adminReviewViolations;
  }
  public void setAdminReviewViolations(List<ShiftTradeMatchViolation> adminReviewViolations) {
    this.adminReviewViolations = adminReviewViolations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeMatchReviewResponse shiftTradeMatchReviewResponse = (ShiftTradeMatchReviewResponse) o;
    return Objects.equals(this.initiatingUser, shiftTradeMatchReviewResponse.initiatingUser) &&
        Objects.equals(this.receivingUser, shiftTradeMatchReviewResponse.receivingUser) &&
        Objects.equals(this.violations, shiftTradeMatchReviewResponse.violations) &&
        Objects.equals(this.adminReviewViolations, shiftTradeMatchReviewResponse.adminReviewViolations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatingUser, receivingUser, violations, adminReviewViolations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeMatchReviewResponse {\n");
    
    sb.append("    initiatingUser: ").append(toIndentedString(initiatingUser)).append("\n");
    sb.append("    receivingUser: ").append(toIndentedString(receivingUser)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    adminReviewViolations: ").append(toIndentedString(adminReviewViolations)).append("\n");
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

