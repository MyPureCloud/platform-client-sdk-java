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
import com.mypurecloud.sdk.v2.model.AdminAgentScheduleBidBiddingPreference;
import com.mypurecloud.sdk.v2.model.ScheduleBidGroupReference;
import com.mypurecloud.sdk.v2.model.ScheduleBidReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdminAgentScheduleSetPreferences
 */

public class AdminAgentScheduleSetPreferences  implements Serializable {
  
  private String id = null;
  private ScheduleBidReference bid = null;
  private ScheduleBidGroupReference bidGroup = null;
  private List<AdminAgentScheduleBidBiddingPreference> agentsScheduleBidPreferences = null;
  private String selfUri = null;

  public AdminAgentScheduleSetPreferences() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentsScheduleBidPreferences = new ArrayList<AdminAgentScheduleBidBiddingPreference>();
    }
  }

  public AdminAgentScheduleSetPreferences(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentsScheduleBidPreferences = new ArrayList<AdminAgentScheduleBidBiddingPreference>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public AdminAgentScheduleSetPreferences id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The schedule bid
   **/
  public AdminAgentScheduleSetPreferences bid(ScheduleBidReference bid) {
    this.bid = bid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule bid")
  @JsonProperty("bid")
  public ScheduleBidReference getBid() {
    return bid;
  }
  public void setBid(ScheduleBidReference bid) {
    this.bid = bid;
  }


  /**
   * The schedule bid group
   **/
  public AdminAgentScheduleSetPreferences bidGroup(ScheduleBidGroupReference bidGroup) {
    this.bidGroup = bidGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule bid group")
  @JsonProperty("bidGroup")
  public ScheduleBidGroupReference getBidGroup() {
    return bidGroup;
  }
  public void setBidGroup(ScheduleBidGroupReference bidGroup) {
    this.bidGroup = bidGroup;
  }


  /**
   * The agents' schedule bidding preferences
   **/
  public AdminAgentScheduleSetPreferences agentsScheduleBidPreferences(List<AdminAgentScheduleBidBiddingPreference> agentsScheduleBidPreferences) {
    this.agentsScheduleBidPreferences = agentsScheduleBidPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agents' schedule bidding preferences")
  @JsonProperty("agentsScheduleBidPreferences")
  public List<AdminAgentScheduleBidBiddingPreference> getAgentsScheduleBidPreferences() {
    return agentsScheduleBidPreferences;
  }
  public void setAgentsScheduleBidPreferences(List<AdminAgentScheduleBidBiddingPreference> agentsScheduleBidPreferences) {
    this.agentsScheduleBidPreferences = agentsScheduleBidPreferences;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminAgentScheduleSetPreferences adminAgentScheduleSetPreferences = (AdminAgentScheduleSetPreferences) o;

    return Objects.equals(this.id, adminAgentScheduleSetPreferences.id) &&
            Objects.equals(this.bid, adminAgentScheduleSetPreferences.bid) &&
            Objects.equals(this.bidGroup, adminAgentScheduleSetPreferences.bidGroup) &&
            Objects.equals(this.agentsScheduleBidPreferences, adminAgentScheduleSetPreferences.agentsScheduleBidPreferences) &&
            Objects.equals(this.selfUri, adminAgentScheduleSetPreferences.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bid, bidGroup, agentsScheduleBidPreferences, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminAgentScheduleSetPreferences {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidGroup: ").append(toIndentedString(bidGroup)).append("\n");
    sb.append("    agentsScheduleBidPreferences: ").append(toIndentedString(agentsScheduleBidPreferences)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

