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
 * MessagingCampaignDiagnostics
 */

public class MessagingCampaignDiagnostics  implements Serializable {
  
  private Integer timeZoneRescheduledContactsCount = null;
  private Integer filteredOutContactsCount = null;

  
  @ApiModelProperty(example = "null", value = "Current number of time zone rescheduled messages on the campaign")
  @JsonProperty("timeZoneRescheduledContactsCount")
  public Integer getTimeZoneRescheduledContactsCount() {
    return timeZoneRescheduledContactsCount;
  }


  @ApiModelProperty(example = "null", value = "Number of contacts that don't match filter. This is currently supported only for Campaigns with dynamic filter on.")
  @JsonProperty("filteredOutContactsCount")
  public Integer getFilteredOutContactsCount() {
    return filteredOutContactsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingCampaignDiagnostics messagingCampaignDiagnostics = (MessagingCampaignDiagnostics) o;

    return Objects.equals(this.timeZoneRescheduledContactsCount, messagingCampaignDiagnostics.timeZoneRescheduledContactsCount) &&
            Objects.equals(this.filteredOutContactsCount, messagingCampaignDiagnostics.filteredOutContactsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZoneRescheduledContactsCount, filteredOutContactsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingCampaignDiagnostics {\n");
    
    sb.append("    timeZoneRescheduledContactsCount: ").append(toIndentedString(timeZoneRescheduledContactsCount)).append("\n");
    sb.append("    filteredOutContactsCount: ").append(toIndentedString(filteredOutContactsCount)).append("\n");
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

