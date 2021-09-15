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
import com.mypurecloud.sdk.v2.model.AchievedOutcome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutcomeAchievement
 */

public class OutcomeAchievement  implements Serializable {
  
  private AchievedOutcome outcome = null;
  private Date achievedDate = null;

  
  /**
   * The outcome that was achieved.
   **/
  public OutcomeAchievement outcome(AchievedOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outcome that was achieved.")
  @JsonProperty("outcome")
  public AchievedOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(AchievedOutcome outcome) {
    this.outcome = outcome;
  }

  
  /**
   * Timestamp indicating when the outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OutcomeAchievement achievedDate(Date achievedDate) {
    this.achievedDate = achievedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("achievedDate")
  public Date getAchievedDate() {
    return achievedDate;
  }
  public void setAchievedDate(Date achievedDate) {
    this.achievedDate = achievedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeAchievement outcomeAchievement = (OutcomeAchievement) o;
    return Objects.equals(this.outcome, outcomeAchievement.outcome) &&
        Objects.equals(this.achievedDate, outcomeAchievement.achievedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, achievedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAchievement {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    achievedDate: ").append(toIndentedString(achievedDate)).append("\n");
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

