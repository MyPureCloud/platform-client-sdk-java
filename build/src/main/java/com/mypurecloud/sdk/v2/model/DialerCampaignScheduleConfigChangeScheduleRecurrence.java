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
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeAlteration;
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeRecurrencePattern;
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeRecurrenceRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCampaignScheduleConfigChangeScheduleRecurrence
 */

public class DialerCampaignScheduleConfigChangeScheduleRecurrence  implements Serializable {
  
  private String id = null;
  private String start = null;
  private String end = null;
  private String timeZone = null;
  private DialerCampaignScheduleConfigChangeRecurrenceRange range = null;
  private DialerCampaignScheduleConfigChangeRecurrencePattern pattern = null;
  private List<DialerCampaignScheduleConfigChangeAlteration> alterations = null;
  private Map<String, Object> additionalProperties = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerCampaignScheduleConfigChangeScheduleRecurrence() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      alterations = new ArrayList<DialerCampaignScheduleConfigChangeAlteration>();
    }
  }

  
  /**
   * the recurrence id
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the recurrence id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * scheduled start time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence start(String start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "scheduled start time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("start")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }


  /**
   * scheduled end time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "scheduled end time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * the timezone the recurrence will use
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the timezone the recurrence will use")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence range(DialerCampaignScheduleConfigChangeRecurrenceRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("range")
  public DialerCampaignScheduleConfigChangeRecurrenceRange getRange() {
    return range;
  }
  public void setRange(DialerCampaignScheduleConfigChangeRecurrenceRange range) {
    this.range = range;
  }


  /**
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence pattern(DialerCampaignScheduleConfigChangeRecurrencePattern pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pattern")
  public DialerCampaignScheduleConfigChangeRecurrencePattern getPattern() {
    return pattern;
  }
  public void setPattern(DialerCampaignScheduleConfigChangeRecurrencePattern pattern) {
    this.pattern = pattern;
  }


  /**
   * modifications to the original recurrence schedule
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence alterations(List<DialerCampaignScheduleConfigChangeAlteration> alterations) {
    this.alterations = alterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "modifications to the original recurrence schedule")
  @JsonProperty("alterations")
  public List<DialerCampaignScheduleConfigChangeAlteration> getAlterations() {
    return alterations;
  }
  public void setAlterations(List<DialerCampaignScheduleConfigChangeAlteration> alterations) {
    this.alterations = alterations;
  }


  /**
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   **/
  public DialerCampaignScheduleConfigChangeScheduleRecurrence getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignScheduleConfigChangeScheduleRecurrence dialerCampaignScheduleConfigChangeScheduleRecurrence = (DialerCampaignScheduleConfigChangeScheduleRecurrence) o;

    return Objects.equals(this.id, dialerCampaignScheduleConfigChangeScheduleRecurrence.id) &&
            Objects.equals(this.start, dialerCampaignScheduleConfigChangeScheduleRecurrence.start) &&
            Objects.equals(this.end, dialerCampaignScheduleConfigChangeScheduleRecurrence.end) &&
            Objects.equals(this.timeZone, dialerCampaignScheduleConfigChangeScheduleRecurrence.timeZone) &&
            Objects.equals(this.range, dialerCampaignScheduleConfigChangeScheduleRecurrence.range) &&
            Objects.equals(this.pattern, dialerCampaignScheduleConfigChangeScheduleRecurrence.pattern) &&
            Objects.equals(this.alterations, dialerCampaignScheduleConfigChangeScheduleRecurrence.alterations) &&
            Objects.equals(this.additionalProperties, dialerCampaignScheduleConfigChangeScheduleRecurrence.additionalProperties) &&
            Objects.equals(this.getAdditionalProperties, dialerCampaignScheduleConfigChangeScheduleRecurrence.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end, timeZone, range, pattern, alterations, additionalProperties, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignScheduleConfigChangeScheduleRecurrence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

