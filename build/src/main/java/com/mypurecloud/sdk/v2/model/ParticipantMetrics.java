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
 * ParticipantMetrics
 */

public class ParticipantMetrics  implements Serializable {
  
  private Double agentDurationPercentage = null;
  private Double customerDurationPercentage = null;
  private Double silenceDurationPercentage = null;
  private Double ivrDurationPercentage = null;
  private Double acdDurationPercentage = null;
  private Double overtalkDurationPercentage = null;
  private Double otherDurationPercentage = null;
  private Integer overtalkCount = null;

  
  /**
   * Percentage of Agent duration in the conversation
   **/
  public ParticipantMetrics agentDurationPercentage(Double agentDurationPercentage) {
    this.agentDurationPercentage = agentDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of Agent duration in the conversation")
  @JsonProperty("agentDurationPercentage")
  public Double getAgentDurationPercentage() {
    return agentDurationPercentage;
  }
  public void setAgentDurationPercentage(Double agentDurationPercentage) {
    this.agentDurationPercentage = agentDurationPercentage;
  }

  
  /**
   * Percentage of Customer duration in the conversation
   **/
  public ParticipantMetrics customerDurationPercentage(Double customerDurationPercentage) {
    this.customerDurationPercentage = customerDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of Customer duration in the conversation")
  @JsonProperty("customerDurationPercentage")
  public Double getCustomerDurationPercentage() {
    return customerDurationPercentage;
  }
  public void setCustomerDurationPercentage(Double customerDurationPercentage) {
    this.customerDurationPercentage = customerDurationPercentage;
  }

  
  /**
   * Percentage of Silence duration in the conversation
   **/
  public ParticipantMetrics silenceDurationPercentage(Double silenceDurationPercentage) {
    this.silenceDurationPercentage = silenceDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of Silence duration in the conversation")
  @JsonProperty("silenceDurationPercentage")
  public Double getSilenceDurationPercentage() {
    return silenceDurationPercentage;
  }
  public void setSilenceDurationPercentage(Double silenceDurationPercentage) {
    this.silenceDurationPercentage = silenceDurationPercentage;
  }

  
  /**
   * Percentage of IVR duration in the conversation
   **/
  public ParticipantMetrics ivrDurationPercentage(Double ivrDurationPercentage) {
    this.ivrDurationPercentage = ivrDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of IVR duration in the conversation")
  @JsonProperty("ivrDurationPercentage")
  public Double getIvrDurationPercentage() {
    return ivrDurationPercentage;
  }
  public void setIvrDurationPercentage(Double ivrDurationPercentage) {
    this.ivrDurationPercentage = ivrDurationPercentage;
  }

  
  /**
   * Percentage of ACD duration in the conversation
   **/
  public ParticipantMetrics acdDurationPercentage(Double acdDurationPercentage) {
    this.acdDurationPercentage = acdDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of ACD duration in the conversation")
  @JsonProperty("acdDurationPercentage")
  public Double getAcdDurationPercentage() {
    return acdDurationPercentage;
  }
  public void setAcdDurationPercentage(Double acdDurationPercentage) {
    this.acdDurationPercentage = acdDurationPercentage;
  }

  
  /**
   * Percentage of Overtalk duration in the conversation
   **/
  public ParticipantMetrics overtalkDurationPercentage(Double overtalkDurationPercentage) {
    this.overtalkDurationPercentage = overtalkDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of Overtalk duration in the conversation")
  @JsonProperty("overtalkDurationPercentage")
  public Double getOvertalkDurationPercentage() {
    return overtalkDurationPercentage;
  }
  public void setOvertalkDurationPercentage(Double overtalkDurationPercentage) {
    this.overtalkDurationPercentage = overtalkDurationPercentage;
  }

  
  /**
   * Percentage of Other events duration in the conversation
   **/
  public ParticipantMetrics otherDurationPercentage(Double otherDurationPercentage) {
    this.otherDurationPercentage = otherDurationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of Other events duration in the conversation")
  @JsonProperty("otherDurationPercentage")
  public Double getOtherDurationPercentage() {
    return otherDurationPercentage;
  }
  public void setOtherDurationPercentage(Double otherDurationPercentage) {
    this.otherDurationPercentage = otherDurationPercentage;
  }

  
  /**
   * Number of Overtalks in the conversation
   **/
  public ParticipantMetrics overtalkCount(Integer overtalkCount) {
    this.overtalkCount = overtalkCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of Overtalks in the conversation")
  @JsonProperty("overtalkCount")
  public Integer getOvertalkCount() {
    return overtalkCount;
  }
  public void setOvertalkCount(Integer overtalkCount) {
    this.overtalkCount = overtalkCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantMetrics participantMetrics = (ParticipantMetrics) o;
    return Objects.equals(this.agentDurationPercentage, participantMetrics.agentDurationPercentage) &&
        Objects.equals(this.customerDurationPercentage, participantMetrics.customerDurationPercentage) &&
        Objects.equals(this.silenceDurationPercentage, participantMetrics.silenceDurationPercentage) &&
        Objects.equals(this.ivrDurationPercentage, participantMetrics.ivrDurationPercentage) &&
        Objects.equals(this.acdDurationPercentage, participantMetrics.acdDurationPercentage) &&
        Objects.equals(this.overtalkDurationPercentage, participantMetrics.overtalkDurationPercentage) &&
        Objects.equals(this.otherDurationPercentage, participantMetrics.otherDurationPercentage) &&
        Objects.equals(this.overtalkCount, participantMetrics.overtalkCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentDurationPercentage, customerDurationPercentage, silenceDurationPercentage, ivrDurationPercentage, acdDurationPercentage, overtalkDurationPercentage, otherDurationPercentage, overtalkCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantMetrics {\n");
    
    sb.append("    agentDurationPercentage: ").append(toIndentedString(agentDurationPercentage)).append("\n");
    sb.append("    customerDurationPercentage: ").append(toIndentedString(customerDurationPercentage)).append("\n");
    sb.append("    silenceDurationPercentage: ").append(toIndentedString(silenceDurationPercentage)).append("\n");
    sb.append("    ivrDurationPercentage: ").append(toIndentedString(ivrDurationPercentage)).append("\n");
    sb.append("    acdDurationPercentage: ").append(toIndentedString(acdDurationPercentage)).append("\n");
    sb.append("    overtalkDurationPercentage: ").append(toIndentedString(overtalkDurationPercentage)).append("\n");
    sb.append("    otherDurationPercentage: ").append(toIndentedString(otherDurationPercentage)).append("\n");
    sb.append("    overtalkCount: ").append(toIndentedString(overtalkCount)).append("\n");
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

