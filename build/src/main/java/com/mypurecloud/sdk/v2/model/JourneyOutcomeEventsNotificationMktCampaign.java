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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyOutcomeEventsNotificationMktCampaign
 */

public class JourneyOutcomeEventsNotificationMktCampaign  implements Serializable {
  
  private String content = null;
  private String medium = null;
  private String name = null;
  private String source = null;
  private String term = null;
  private String clickId = null;
  private String network = null;

  
  /**
   **/
  public JourneyOutcomeEventsNotificationMktCampaign content(String content) {
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
  public JourneyOutcomeEventsNotificationMktCampaign medium(String medium) {
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
  public JourneyOutcomeEventsNotificationMktCampaign name(String name) {
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
  public JourneyOutcomeEventsNotificationMktCampaign source(String source) {
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
  public JourneyOutcomeEventsNotificationMktCampaign term(String term) {
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
  public JourneyOutcomeEventsNotificationMktCampaign clickId(String clickId) {
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
  public JourneyOutcomeEventsNotificationMktCampaign network(String network) {
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
    JourneyOutcomeEventsNotificationMktCampaign journeyOutcomeEventsNotificationMktCampaign = (JourneyOutcomeEventsNotificationMktCampaign) o;
    return Objects.equals(this.content, journeyOutcomeEventsNotificationMktCampaign.content) &&
        Objects.equals(this.medium, journeyOutcomeEventsNotificationMktCampaign.medium) &&
        Objects.equals(this.name, journeyOutcomeEventsNotificationMktCampaign.name) &&
        Objects.equals(this.source, journeyOutcomeEventsNotificationMktCampaign.source) &&
        Objects.equals(this.term, journeyOutcomeEventsNotificationMktCampaign.term) &&
        Objects.equals(this.clickId, journeyOutcomeEventsNotificationMktCampaign.clickId) &&
        Objects.equals(this.network, journeyOutcomeEventsNotificationMktCampaign.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, medium, name, source, term, clickId, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationMktCampaign {\n");
    
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

