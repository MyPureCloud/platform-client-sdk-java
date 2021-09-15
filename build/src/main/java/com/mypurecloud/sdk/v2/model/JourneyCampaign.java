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
 * JourneyCampaign
 */

public class JourneyCampaign  implements Serializable {
  
  private String content = null;
  private String medium = null;
  private String name = null;
  private String source = null;
  private String term = null;
  private String clickId = null;
  private String network = null;

  
  /**
   * Differentiate ads or links that point to the same URL (e.g. textlink).
   **/
  public JourneyCampaign content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Differentiate ads or links that point to the same URL (e.g. textlink).")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * Identify a medium such as email or cost-per-click (e.g. CPC).
   **/
  public JourneyCampaign medium(String medium) {
    this.medium = medium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identify a medium such as email or cost-per-click (e.g. CPC).")
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }
  public void setMedium(String medium) {
    this.medium = medium;
  }

  
  /**
   * Identify a specific product promotion or strategic campaign (e.g. 320banner).
   **/
  public JourneyCampaign name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identify a specific product promotion or strategic campaign (e.g. 320banner).")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Identify a search engine, newsletter name, or other source (e.g. Google).
   **/
  public JourneyCampaign source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identify a search engine, newsletter name, or other source (e.g. Google).")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Note the keywords for this ad (e.g. running+shoes).
   **/
  public JourneyCampaign term(String term) {
    this.term = term;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Note the keywords for this ad (e.g. running+shoes).")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }

  
  /**
   * The click ID (unique number that is generated when a potential customer clicks on an affiliate link).
   **/
  public JourneyCampaign clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The click ID (unique number that is generated when a potential customer clicks on an affiliate link).")
  @JsonProperty("clickId")
  public String getClickId() {
    return clickId;
  }
  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  
  /**
   * The ad network to which the click ID belongs.
   **/
  public JourneyCampaign network(String network) {
    this.network = network;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ad network to which the click ID belongs.")
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
    JourneyCampaign journeyCampaign = (JourneyCampaign) o;
    return Objects.equals(this.content, journeyCampaign.content) &&
        Objects.equals(this.medium, journeyCampaign.medium) &&
        Objects.equals(this.name, journeyCampaign.name) &&
        Objects.equals(this.source, journeyCampaign.source) &&
        Objects.equals(this.term, journeyCampaign.term) &&
        Objects.equals(this.clickId, journeyCampaign.clickId) &&
        Objects.equals(this.network, journeyCampaign.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, medium, name, source, term, clickId, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyCampaign {\n");
    
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

