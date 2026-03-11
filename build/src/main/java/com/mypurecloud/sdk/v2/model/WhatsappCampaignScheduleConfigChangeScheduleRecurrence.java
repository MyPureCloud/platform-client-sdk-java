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
import com.mypurecloud.sdk.v2.model.WhatsappCampaignScheduleConfigChangeAlteration;
import com.mypurecloud.sdk.v2.model.WhatsappCampaignScheduleConfigChangeRecurrencePattern;
import com.mypurecloud.sdk.v2.model.WhatsappCampaignScheduleConfigChangeRecurrenceRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WhatsappCampaignScheduleConfigChangeScheduleRecurrence
 */

public class WhatsappCampaignScheduleConfigChangeScheduleRecurrence  implements Serializable {
  
  private String id = null;
  private String start = null;
  private String end = null;
  private String timeZone = null;
  private WhatsappCampaignScheduleConfigChangeRecurrenceRange range = null;
  private WhatsappCampaignScheduleConfigChangeRecurrencePattern pattern = null;
  private List<WhatsappCampaignScheduleConfigChangeAlteration> alterations = null;
  private Map<String, Object> additionalProperties = null;
  private Map<String, Object> getAdditionalProperties = null;

  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      alterations = new ArrayList<WhatsappCampaignScheduleConfigChangeAlteration>();
    }
  }

  
  /**
   * the recurrence id
   **/
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence id(String id) {
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
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence start(String start) {
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
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence end(String end) {
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
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence timeZone(String timeZone) {
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
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence range(WhatsappCampaignScheduleConfigChangeRecurrenceRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("range")
  public WhatsappCampaignScheduleConfigChangeRecurrenceRange getRange() {
    return range;
  }
  public void setRange(WhatsappCampaignScheduleConfigChangeRecurrenceRange range) {
    this.range = range;
  }


  /**
   **/
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence pattern(WhatsappCampaignScheduleConfigChangeRecurrencePattern pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pattern")
  public WhatsappCampaignScheduleConfigChangeRecurrencePattern getPattern() {
    return pattern;
  }
  public void setPattern(WhatsappCampaignScheduleConfigChangeRecurrencePattern pattern) {
    this.pattern = pattern;
  }


  /**
   * modifications to the original recurrence schedule
   **/
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence alterations(List<WhatsappCampaignScheduleConfigChangeAlteration> alterations) {
    this.alterations = alterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "modifications to the original recurrence schedule")
  @JsonProperty("alterations")
  public List<WhatsappCampaignScheduleConfigChangeAlteration> getAlterations() {
    return alterations;
  }
  public void setAlterations(List<WhatsappCampaignScheduleConfigChangeAlteration> alterations) {
    this.alterations = alterations;
  }


  /**
   **/
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence additionalProperties(Map<String, Object> additionalProperties) {
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
  public WhatsappCampaignScheduleConfigChangeScheduleRecurrence getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
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
    WhatsappCampaignScheduleConfigChangeScheduleRecurrence whatsappCampaignScheduleConfigChangeScheduleRecurrence = (WhatsappCampaignScheduleConfigChangeScheduleRecurrence) o;

    return Objects.equals(this.id, whatsappCampaignScheduleConfigChangeScheduleRecurrence.id) &&
            Objects.equals(this.start, whatsappCampaignScheduleConfigChangeScheduleRecurrence.start) &&
            Objects.equals(this.end, whatsappCampaignScheduleConfigChangeScheduleRecurrence.end) &&
            Objects.equals(this.timeZone, whatsappCampaignScheduleConfigChangeScheduleRecurrence.timeZone) &&
            Objects.equals(this.range, whatsappCampaignScheduleConfigChangeScheduleRecurrence.range) &&
            Objects.equals(this.pattern, whatsappCampaignScheduleConfigChangeScheduleRecurrence.pattern) &&
            Objects.equals(this.alterations, whatsappCampaignScheduleConfigChangeScheduleRecurrence.alterations) &&
            Objects.equals(this.additionalProperties, whatsappCampaignScheduleConfigChangeScheduleRecurrence.additionalProperties) &&
            Objects.equals(this.getAdditionalProperties, whatsappCampaignScheduleConfigChangeScheduleRecurrence.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end, timeZone, range, pattern, alterations, additionalProperties, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappCampaignScheduleConfigChangeScheduleRecurrence {\n");
    
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

