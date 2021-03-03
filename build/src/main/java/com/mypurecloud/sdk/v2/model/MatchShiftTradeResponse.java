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
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchViolation;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MatchShiftTradeResponse
 */

public class MatchShiftTradeResponse  implements Serializable {
  
  private ShiftTradeResponse trade = null;
  private List<ShiftTradeMatchViolation> violations = new ArrayList<ShiftTradeMatchViolation>();
  private List<ShiftTradeMatchViolation> adminReviewViolations = new ArrayList<ShiftTradeMatchViolation>();

  
  /**
   * The associated shift trade
   **/
  public MatchShiftTradeResponse trade(ShiftTradeResponse trade) {
    this.trade = trade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The associated shift trade")
  @JsonProperty("trade")
  public ShiftTradeResponse getTrade() {
    return trade;
  }
  public void setTrade(ShiftTradeResponse trade) {
    this.trade = trade;
  }

  
  /**
   * Constraint violations which disallow this shift trade
   **/
  public MatchShiftTradeResponse violations(List<ShiftTradeMatchViolation> violations) {
    this.violations = violations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Constraint violations which disallow this shift trade")
  @JsonProperty("violations")
  public List<ShiftTradeMatchViolation> getViolations() {
    return violations;
  }
  public void setViolations(List<ShiftTradeMatchViolation> violations) {
    this.violations = violations;
  }

  
  /**
   * Constraint violations for this shift trade which require shift trade administrator review
   **/
  public MatchShiftTradeResponse adminReviewViolations(List<ShiftTradeMatchViolation> adminReviewViolations) {
    this.adminReviewViolations = adminReviewViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Constraint violations for this shift trade which require shift trade administrator review")
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
    MatchShiftTradeResponse matchShiftTradeResponse = (MatchShiftTradeResponse) o;
    return Objects.equals(this.trade, matchShiftTradeResponse.trade) &&
        Objects.equals(this.violations, matchShiftTradeResponse.violations) &&
        Objects.equals(this.adminReviewViolations, matchShiftTradeResponse.adminReviewViolations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, violations, adminReviewViolations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchShiftTradeResponse {\n");
    
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
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

