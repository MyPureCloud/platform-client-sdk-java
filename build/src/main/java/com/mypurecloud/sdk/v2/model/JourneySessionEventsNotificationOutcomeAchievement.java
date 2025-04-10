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
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationOutcome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneySessionEventsNotificationOutcomeAchievement
 */

public class JourneySessionEventsNotificationOutcomeAchievement  implements Serializable {
  
  private JourneySessionEventsNotificationOutcome outcome = null;
  private Date achievedDate = null;

  public JourneySessionEventsNotificationOutcomeAchievement() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneySessionEventsNotificationOutcomeAchievement outcome(JourneySessionEventsNotificationOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcome")
  public JourneySessionEventsNotificationOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(JourneySessionEventsNotificationOutcome outcome) {
    this.outcome = outcome;
  }


  /**
   **/
  public JourneySessionEventsNotificationOutcomeAchievement achievedDate(Date achievedDate) {
    this.achievedDate = achievedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    JourneySessionEventsNotificationOutcomeAchievement journeySessionEventsNotificationOutcomeAchievement = (JourneySessionEventsNotificationOutcomeAchievement) o;

    return Objects.equals(this.outcome, journeySessionEventsNotificationOutcomeAchievement.outcome) &&
            Objects.equals(this.achievedDate, journeySessionEventsNotificationOutcomeAchievement.achievedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, achievedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationOutcomeAchievement {\n");
    
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

