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
import com.mypurecloud.sdk.v2.model.Miner;
import com.mypurecloud.sdk.v2.model.Utterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MinerIntent
 */

public class MinerIntent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Miner miner = null;
  private List<Utterance> utterances = new ArrayList<Utterance>();
  private Double analyticVolumePercent = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Intent name.
   **/
  public MinerIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "pay bill.", value = "Intent name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The miner to which the intent belongs.
   **/
  public MinerIntent miner(Miner miner) {
    this.miner = miner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The miner to which the intent belongs.")
  @JsonProperty("miner")
  public Miner getMiner() {
    return miner;
  }
  public void setMiner(Miner miner) {
    this.miner = miner;
  }

  
  /**
   * The utterances that are extracted for an Intent.
   **/
  public MinerIntent utterances(List<Utterance> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The utterances that are extracted for an Intent.")
  @JsonProperty("utterances")
  public List<Utterance> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<Utterance> utterances) {
    this.utterances = utterances;
  }

  
  /**
   * Percentage of conversations belonging to the intent.
   **/
  public MinerIntent analyticVolumePercent(Double analyticVolumePercent) {
    this.analyticVolumePercent = analyticVolumePercent;
    return this;
  }
  
  @ApiModelProperty(example = "21.5", value = "Percentage of conversations belonging to the intent.")
  @JsonProperty("analyticVolumePercent")
  public Double getAnalyticVolumePercent() {
    return analyticVolumePercent;
  }
  public void setAnalyticVolumePercent(Double analyticVolumePercent) {
    this.analyticVolumePercent = analyticVolumePercent;
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
    MinerIntent minerIntent = (MinerIntent) o;
    return Objects.equals(this.id, minerIntent.id) &&
        Objects.equals(this.name, minerIntent.name) &&
        Objects.equals(this.miner, minerIntent.miner) &&
        Objects.equals(this.utterances, minerIntent.utterances) &&
        Objects.equals(this.analyticVolumePercent, minerIntent.analyticVolumePercent) &&
        Objects.equals(this.selfUri, minerIntent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, miner, utterances, analyticVolumePercent, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinerIntent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
    sb.append("    analyticVolumePercent: ").append(toIndentedString(analyticVolumePercent)).append("\n");
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

