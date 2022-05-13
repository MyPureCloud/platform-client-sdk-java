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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialerCampaignScheduleConfigChangeScheduleInterval
 */

public class DialerCampaignScheduleConfigChangeScheduleInterval  implements Serializable {
  
  private String start = null;
  private String end = null;

  
  /**
   * scheduled start time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public DialerCampaignScheduleConfigChangeScheduleInterval start(String start) {
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
  public DialerCampaignScheduleConfigChangeScheduleInterval end(String end) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignScheduleConfigChangeScheduleInterval dialerCampaignScheduleConfigChangeScheduleInterval = (DialerCampaignScheduleConfigChangeScheduleInterval) o;

    return Objects.equals(this.start, dialerCampaignScheduleConfigChangeScheduleInterval.start) &&
            Objects.equals(this.end, dialerCampaignScheduleConfigChangeScheduleInterval.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignScheduleConfigChangeScheduleInterval {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

