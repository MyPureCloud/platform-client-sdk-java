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
import com.mypurecloud.sdk.v2.model.OccurrenceDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NextOccurrenceDetails
 */

public class NextOccurrenceDetails  implements Serializable {
  
  private OccurrenceDetails startOccurrenceDetails = null;
  private OccurrenceDetails endOccurrenceDetails = null;

  public NextOccurrenceDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The details for the next start occurrence for the recurrence.
   **/
  public NextOccurrenceDetails startOccurrenceDetails(OccurrenceDetails startOccurrenceDetails) {
    this.startOccurrenceDetails = startOccurrenceDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The details for the next start occurrence for the recurrence.")
  @JsonProperty("startOccurrenceDetails")
  public OccurrenceDetails getStartOccurrenceDetails() {
    return startOccurrenceDetails;
  }
  public void setStartOccurrenceDetails(OccurrenceDetails startOccurrenceDetails) {
    this.startOccurrenceDetails = startOccurrenceDetails;
  }


  /**
   * The details for the next end occurrence for the recurrence.
   **/
  public NextOccurrenceDetails endOccurrenceDetails(OccurrenceDetails endOccurrenceDetails) {
    this.endOccurrenceDetails = endOccurrenceDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The details for the next end occurrence for the recurrence.")
  @JsonProperty("endOccurrenceDetails")
  public OccurrenceDetails getEndOccurrenceDetails() {
    return endOccurrenceDetails;
  }
  public void setEndOccurrenceDetails(OccurrenceDetails endOccurrenceDetails) {
    this.endOccurrenceDetails = endOccurrenceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextOccurrenceDetails nextOccurrenceDetails = (NextOccurrenceDetails) o;

    return Objects.equals(this.startOccurrenceDetails, nextOccurrenceDetails.startOccurrenceDetails) &&
            Objects.equals(this.endOccurrenceDetails, nextOccurrenceDetails.endOccurrenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startOccurrenceDetails, endOccurrenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextOccurrenceDetails {\n");
    
    sb.append("    startOccurrenceDetails: ").append(toIndentedString(startOccurrenceDetails)).append("\n");
    sb.append("    endOccurrenceDetails: ").append(toIndentedString(endOccurrenceDetails)).append("\n");
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

