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

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationMktCampaign
 */

public class JourneyAppEventsNotificationMktCampaign  implements Serializable {
  
  private String content = null;
  private String medium = null;
  private String name = null;
  private String source = null;
  private String term = null;
  private String clickId = null;
  private String network = null;

  public JourneyAppEventsNotificationMktCampaign() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyAppEventsNotificationMktCampaign content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  /**
   **/
  public JourneyAppEventsNotificationMktCampaign medium(String medium) {
    this.medium = medium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }
  public void setMedium(String medium) {
    this.medium = medium;
  }


  /**
   **/
  public JourneyAppEventsNotificationMktCampaign name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public JourneyAppEventsNotificationMktCampaign source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public JourneyAppEventsNotificationMktCampaign term(String term) {
    this.term = term;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }


  /**
   **/
  public JourneyAppEventsNotificationMktCampaign clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clickId")
  public String getClickId() {
    return clickId;
  }
  public void setClickId(String clickId) {
    this.clickId = clickId;
  }


  /**
   **/
  public JourneyAppEventsNotificationMktCampaign network(String network) {
    this.network = network;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("network")
  public String getNetwork() {
    return network;
  }
  public void setNetwork(String network) {
    this.network = network;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyAppEventsNotificationMktCampaign journeyAppEventsNotificationMktCampaign = (JourneyAppEventsNotificationMktCampaign) o;

    return Objects.equals(this.content, journeyAppEventsNotificationMktCampaign.content) &&
            Objects.equals(this.medium, journeyAppEventsNotificationMktCampaign.medium) &&
            Objects.equals(this.name, journeyAppEventsNotificationMktCampaign.name) &&
            Objects.equals(this.source, journeyAppEventsNotificationMktCampaign.source) &&
            Objects.equals(this.term, journeyAppEventsNotificationMktCampaign.term) &&
            Objects.equals(this.clickId, journeyAppEventsNotificationMktCampaign.clickId) &&
            Objects.equals(this.network, journeyAppEventsNotificationMktCampaign.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, medium, name, source, term, clickId, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationMktCampaign {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    clickId: ").append(toIndentedString(clickId)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

