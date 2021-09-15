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
import com.mypurecloud.sdk.v2.model.OutcomeEventScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutcomeScoresResult
 */

public class OutcomeScoresResult  implements Serializable {
  
  private List<OutcomeEventScore> outcomeScores = new ArrayList<OutcomeEventScore>();
  private Date modifiedDate = null;

  
  /**
   * List of scored outcomes in the session.
   **/
  public OutcomeScoresResult outcomeScores(List<OutcomeEventScore> outcomeScores) {
    this.outcomeScores = outcomeScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of scored outcomes in the session.")
  @JsonProperty("outcomeScores")
  public List<OutcomeEventScore> getOutcomeScores() {
    return outcomeScores;
  }
  public void setOutcomeScores(List<OutcomeEventScore> outcomeScores) {
    this.outcomeScores = outcomeScores;
  }

  
  @ApiModelProperty(example = "null", value = "Timestamp indicating the last time that the event was scored. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeScoresResult outcomeScoresResult = (OutcomeScoresResult) o;
    return Objects.equals(this.outcomeScores, outcomeScoresResult.outcomeScores) &&
        Objects.equals(this.modifiedDate, outcomeScoresResult.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeScores, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeScoresResult {\n");
    
    sb.append("    outcomeScores: ").append(toIndentedString(outcomeScores)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

