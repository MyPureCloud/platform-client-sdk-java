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
 * MediaRtpStatistics
 */

public class MediaRtpStatistics  implements Serializable {
  
  private Integer packetsReceived = null;
  private Integer packetsSent = null;
  private Integer rtpEventsReceived = null;
  private Integer rtpEventsSent = null;
  private Double estimatedAverageMos = null;
  private Double averageJitter = null;

  public MediaRtpStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Number of packets received, including all invalid, duplicate, and discarded packets
   **/
  public MediaRtpStatistics packetsReceived(Integer packetsReceived) {
    this.packetsReceived = packetsReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of packets received, including all invalid, duplicate, and discarded packets")
  @JsonProperty("packetsReceived")
  public Integer getPacketsReceived() {
    return packetsReceived;
  }
  public void setPacketsReceived(Integer packetsReceived) {
    this.packetsReceived = packetsReceived;
  }


  /**
   * Number of packets sent
   **/
  public MediaRtpStatistics packetsSent(Integer packetsSent) {
    this.packetsSent = packetsSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of packets sent")
  @JsonProperty("packetsSent")
  public Integer getPacketsSent() {
    return packetsSent;
  }
  public void setPacketsSent(Integer packetsSent) {
    this.packetsSent = packetsSent;
  }


  /**
   * Number of RFC#2833 packets received
   **/
  public MediaRtpStatistics rtpEventsReceived(Integer rtpEventsReceived) {
    this.rtpEventsReceived = rtpEventsReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of RFC#2833 packets received")
  @JsonProperty("rtpEventsReceived")
  public Integer getRtpEventsReceived() {
    return rtpEventsReceived;
  }
  public void setRtpEventsReceived(Integer rtpEventsReceived) {
    this.rtpEventsReceived = rtpEventsReceived;
  }


  /**
   * Number of RFC#2833 packets sent
   **/
  public MediaRtpStatistics rtpEventsSent(Integer rtpEventsSent) {
    this.rtpEventsSent = rtpEventsSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of RFC#2833 packets sent")
  @JsonProperty("rtpEventsSent")
  public Integer getRtpEventsSent() {
    return rtpEventsSent;
  }
  public void setRtpEventsSent(Integer rtpEventsSent) {
    this.rtpEventsSent = rtpEventsSent;
  }


  /**
   * The estimated average MOS score
   **/
  public MediaRtpStatistics estimatedAverageMos(Double estimatedAverageMos) {
    this.estimatedAverageMos = estimatedAverageMos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The estimated average MOS score")
  @JsonProperty("estimatedAverageMos")
  public Double getEstimatedAverageMos() {
    return estimatedAverageMos;
  }
  public void setEstimatedAverageMos(Double estimatedAverageMos) {
    this.estimatedAverageMos = estimatedAverageMos;
  }


  /**
   * The average jitter
   **/
  public MediaRtpStatistics averageJitter(Double averageJitter) {
    this.averageJitter = averageJitter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average jitter")
  @JsonProperty("averageJitter")
  public Double getAverageJitter() {
    return averageJitter;
  }
  public void setAverageJitter(Double averageJitter) {
    this.averageJitter = averageJitter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaRtpStatistics mediaRtpStatistics = (MediaRtpStatistics) o;

    return Objects.equals(this.packetsReceived, mediaRtpStatistics.packetsReceived) &&
            Objects.equals(this.packetsSent, mediaRtpStatistics.packetsSent) &&
            Objects.equals(this.rtpEventsReceived, mediaRtpStatistics.rtpEventsReceived) &&
            Objects.equals(this.rtpEventsSent, mediaRtpStatistics.rtpEventsSent) &&
            Objects.equals(this.estimatedAverageMos, mediaRtpStatistics.estimatedAverageMos) &&
            Objects.equals(this.averageJitter, mediaRtpStatistics.averageJitter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packetsReceived, packetsSent, rtpEventsReceived, rtpEventsSent, estimatedAverageMos, averageJitter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaRtpStatistics {\n");
    
    sb.append("    packetsReceived: ").append(toIndentedString(packetsReceived)).append("\n");
    sb.append("    packetsSent: ").append(toIndentedString(packetsSent)).append("\n");
    sb.append("    rtpEventsReceived: ").append(toIndentedString(rtpEventsReceived)).append("\n");
    sb.append("    rtpEventsSent: ").append(toIndentedString(rtpEventsSent)).append("\n");
    sb.append("    estimatedAverageMos: ").append(toIndentedString(estimatedAverageMos)).append("\n");
    sb.append("    averageJitter: ").append(toIndentedString(averageJitter)).append("\n");
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

