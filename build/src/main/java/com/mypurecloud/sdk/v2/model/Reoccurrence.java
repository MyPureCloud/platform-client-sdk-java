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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Alteration;
import com.mypurecloud.sdk.v2.model.NextOccurrenceDetails;
import com.mypurecloud.sdk.v2.model.Pattern;
import com.mypurecloud.sdk.v2.model.Range;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Reoccurrence
 */

public class Reoccurrence  implements Serializable {
  
  private String id = null;
  private String start = null;
  private String end = null;
  private String timeZone = null;
  private Pattern pattern = null;
  private Range range = null;
  private List<Alteration> alterations = new ArrayList<Alteration>();
  private NextOccurrenceDetails nextOccurrenceDetails = null;

  
  /**
   **/
  public Reoccurrence id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The start date time of the initial occurrence as an ISO-8601 string in the format YYYY-MM-DDThh:mm:ss
   **/
  public Reoccurrence start(String start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "2023-11-21T16:30:25", required = true, value = "The start date time of the initial occurrence as an ISO-8601 string in the format YYYY-MM-DDThh:mm:ss")
  @JsonProperty("start")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }


  /**
   * The end date time of the initial occurrence as an ISO-8601 string in the format YYYY-MM-DDThh:mm:ss
   **/
  public Reoccurrence end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "2023-11-21T16:30:25", required = true, value = "The end date time of the initial occurrence as an ISO-8601 string in the format YYYY-MM-DDThh:mm:ss")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * The time zone of the schedule e.g.:  America/New_York
   **/
  public Reoccurrence timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time zone of the schedule e.g.:  America/New_York")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * The schedule pattern e.g.: Daily/Weekly
   **/
  public Reoccurrence pattern(Pattern pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule pattern e.g.: Daily/Weekly")
  @JsonProperty("pattern")
  public Pattern getPattern() {
    return pattern;
  }
  public void setPattern(Pattern pattern) {
    this.pattern = pattern;
  }


  /**
   * The schedule range e.g.: EndDate/NoEnd/Numbered
   **/
  public Reoccurrence range(Range range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule range e.g.: EndDate/NoEnd/Numbered")
  @JsonProperty("range")
  public Range getRange() {
    return range;
  }
  public void setRange(Range range) {
    this.range = range;
  }


  /**
   * Modifications to the original recurrence schedule (Exclusions/Inclusions)
   **/
  public Reoccurrence alterations(List<Alteration> alterations) {
    this.alterations = alterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modifications to the original recurrence schedule (Exclusions/Inclusions)")
  @JsonProperty("alterations")
  public List<Alteration> getAlterations() {
    return alterations;
  }
  public void setAlterations(List<Alteration> alterations) {
    this.alterations = alterations;
  }


  @ApiModelProperty(example = "null", value = "The next occurrence details for the next start and end occurrences for the recurrence")
  @JsonProperty("nextOccurrenceDetails")
  public NextOccurrenceDetails getNextOccurrenceDetails() {
    return nextOccurrenceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reoccurrence reoccurrence = (Reoccurrence) o;

    return Objects.equals(this.id, reoccurrence.id) &&
            Objects.equals(this.start, reoccurrence.start) &&
            Objects.equals(this.end, reoccurrence.end) &&
            Objects.equals(this.timeZone, reoccurrence.timeZone) &&
            Objects.equals(this.pattern, reoccurrence.pattern) &&
            Objects.equals(this.range, reoccurrence.range) &&
            Objects.equals(this.alterations, reoccurrence.alterations) &&
            Objects.equals(this.nextOccurrenceDetails, reoccurrence.nextOccurrenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end, timeZone, pattern, range, alterations, nextOccurrenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reoccurrence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
    sb.append("    nextOccurrenceDetails: ").append(toIndentedString(nextOccurrenceDetails)).append("\n");
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

