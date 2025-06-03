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
  private List<ShiftTradeMatchViolation> violations = null;
  private List<ShiftTradeMatchViolation> adminReviewViolations = null;

  private static class UnevaluatedRulesEnumDeserializer extends StdDeserializer<UnevaluatedRulesEnum> {
    public UnevaluatedRulesEnumDeserializer() {
      super(UnevaluatedRulesEnumDeserializer.class);
    }

    @Override
    public UnevaluatedRulesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnevaluatedRulesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets unevaluatedRules
   */
 @JsonDeserialize(using = UnevaluatedRulesEnumDeserializer.class)
  public enum UnevaluatedRulesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PLANNINGPERIODMINPAIDTIME("PlanningPeriodMinPaidTime"),
    PLANNINGPERIODMAXPAIDTIME("PlanningPeriodMaxPaidTime"),
    MINIMUMTIMEBETWEENSHIFTS("MinimumTimeBetweenShifts");

    private String value;

    UnevaluatedRulesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnevaluatedRulesEnum fromString(String key) {
      if (key == null) return null;

      for (UnevaluatedRulesEnum value : UnevaluatedRulesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnevaluatedRulesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<UnevaluatedRulesEnum> unevaluatedRules = null;

  public ShiftTradeMatchReviewResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      violations = new ArrayList<ShiftTradeMatchViolation>();
      adminReviewViolations = new ArrayList<ShiftTradeMatchViolation>();
      unevaluatedRules = new ArrayList<UnevaluatedRulesEnum>();
    }
  }

  
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


  /**
   * Unevaluated rules for this shift trade which require shift trade administrator review
   **/
  public ShiftTradeMatchReviewResponse unevaluatedRules(List<UnevaluatedRulesEnum> unevaluatedRules) {
    this.unevaluatedRules = unevaluatedRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unevaluated rules for this shift trade which require shift trade administrator review")
  @JsonProperty("unevaluatedRules")
  public List<UnevaluatedRulesEnum> getUnevaluatedRules() {
    return unevaluatedRules;
  }
  public void setUnevaluatedRules(List<UnevaluatedRulesEnum> unevaluatedRules) {
    this.unevaluatedRules = unevaluatedRules;
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
            Objects.equals(this.adminReviewViolations, shiftTradeMatchReviewResponse.adminReviewViolations) &&
            Objects.equals(this.unevaluatedRules, shiftTradeMatchReviewResponse.unevaluatedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatingUser, receivingUser, violations, adminReviewViolations, unevaluatedRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeMatchReviewResponse {\n");
    
    sb.append("    initiatingUser: ").append(toIndentedString(initiatingUser)).append("\n");
    sb.append("    receivingUser: ").append(toIndentedString(receivingUser)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    adminReviewViolations: ").append(toIndentedString(adminReviewViolations)).append("\n");
    sb.append("    unevaluatedRules: ").append(toIndentedString(unevaluatedRules)).append("\n");
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

