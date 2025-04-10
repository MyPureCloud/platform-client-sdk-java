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
 * KnowledgeGroupStatistics
 */

public class KnowledgeGroupStatistics  implements Serializable {
  
  private Integer unlinkedPhraseCount = null;
  private Integer unlinkedPhraseHitCount = null;
  private Integer totalPhraseHitCount = null;

  public KnowledgeGroupStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Knowledge Group unique phrase count
   **/
  public KnowledgeGroupStatistics unlinkedPhraseCount(Integer unlinkedPhraseCount) {
    this.unlinkedPhraseCount = unlinkedPhraseCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge Group unique phrase count")
  @JsonProperty("unlinkedPhraseCount")
  public Integer getUnlinkedPhraseCount() {
    return unlinkedPhraseCount;
  }
  public void setUnlinkedPhraseCount(Integer unlinkedPhraseCount) {
    this.unlinkedPhraseCount = unlinkedPhraseCount;
  }


  /**
   * Knowledge Group unlinked phrases hit count
   **/
  public KnowledgeGroupStatistics unlinkedPhraseHitCount(Integer unlinkedPhraseHitCount) {
    this.unlinkedPhraseHitCount = unlinkedPhraseHitCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge Group unlinked phrases hit count")
  @JsonProperty("unlinkedPhraseHitCount")
  public Integer getUnlinkedPhraseHitCount() {
    return unlinkedPhraseHitCount;
  }
  public void setUnlinkedPhraseHitCount(Integer unlinkedPhraseHitCount) {
    this.unlinkedPhraseHitCount = unlinkedPhraseHitCount;
  }


  /**
   * Total number of phrase hit counts of an unanswered group
   **/
  public KnowledgeGroupStatistics totalPhraseHitCount(Integer totalPhraseHitCount) {
    this.totalPhraseHitCount = totalPhraseHitCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of phrase hit counts of an unanswered group")
  @JsonProperty("totalPhraseHitCount")
  public Integer getTotalPhraseHitCount() {
    return totalPhraseHitCount;
  }
  public void setTotalPhraseHitCount(Integer totalPhraseHitCount) {
    this.totalPhraseHitCount = totalPhraseHitCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGroupStatistics knowledgeGroupStatistics = (KnowledgeGroupStatistics) o;

    return Objects.equals(this.unlinkedPhraseCount, knowledgeGroupStatistics.unlinkedPhraseCount) &&
            Objects.equals(this.unlinkedPhraseHitCount, knowledgeGroupStatistics.unlinkedPhraseHitCount) &&
            Objects.equals(this.totalPhraseHitCount, knowledgeGroupStatistics.totalPhraseHitCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unlinkedPhraseCount, unlinkedPhraseHitCount, totalPhraseHitCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGroupStatistics {\n");
    
    sb.append("    unlinkedPhraseCount: ").append(toIndentedString(unlinkedPhraseCount)).append("\n");
    sb.append("    unlinkedPhraseHitCount: ").append(toIndentedString(unlinkedPhraseHitCount)).append("\n");
    sb.append("    totalPhraseHitCount: ").append(toIndentedString(totalPhraseHitCount)).append("\n");
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

