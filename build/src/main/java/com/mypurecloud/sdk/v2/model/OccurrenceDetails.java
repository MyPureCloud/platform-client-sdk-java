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
import java.util.Date;

import java.io.Serializable;
/**
 * OccurrenceDetails
 */

public class OccurrenceDetails  implements Serializable {
  
  private Date dateOfNextOccurrence = null;
  private Integer numberOfOccurrences = null;

  public OccurrenceDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The date of the next start or end occurrence for the recurrence as an ISO-8601 string
   **/
  public OccurrenceDetails dateOfNextOccurrence(Date dateOfNextOccurrence) {
    this.dateOfNextOccurrence = dateOfNextOccurrence;
    return this;
  }
  
  @ApiModelProperty(example = "2023-12-21T16:30:25Z", value = "The date of the next start or end occurrence for the recurrence as an ISO-8601 string")
  @JsonProperty("dateOfNextOccurrence")
  public Date getDateOfNextOccurrence() {
    return dateOfNextOccurrence;
  }
  public void setDateOfNextOccurrence(Date dateOfNextOccurrence) {
    this.dateOfNextOccurrence = dateOfNextOccurrence;
  }


  /**
   * The number of start or end occurrences that have been processed for the recurrence.
   **/
  public OccurrenceDetails numberOfOccurrences(Integer numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of start or end occurrences that have been processed for the recurrence.")
  @JsonProperty("numberOfOccurrences")
  public Integer getNumberOfOccurrences() {
    return numberOfOccurrences;
  }
  public void setNumberOfOccurrences(Integer numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccurrenceDetails occurrenceDetails = (OccurrenceDetails) o;

    return Objects.equals(this.dateOfNextOccurrence, occurrenceDetails.dateOfNextOccurrence) &&
            Objects.equals(this.numberOfOccurrences, occurrenceDetails.numberOfOccurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfNextOccurrence, numberOfOccurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccurrenceDetails {\n");
    
    sb.append("    dateOfNextOccurrence: ").append(toIndentedString(dateOfNextOccurrence)).append("\n");
    sb.append("    numberOfOccurrences: ").append(toIndentedString(numberOfOccurrences)).append("\n");
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

