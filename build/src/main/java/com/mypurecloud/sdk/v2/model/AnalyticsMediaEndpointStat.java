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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsMediaEndpointStat
 */

public class AnalyticsMediaEndpointStat  implements Serializable {
  
  private List<String> codecs = new ArrayList<String>();
  private Long discardedPackets = null;
  private Long duplicatePackets = null;
  private Date eventTime = null;
  private Long invalidPackets = null;
  private Long maxLatencyMs = null;
  private Double minMos = null;
  private Double minRFactor = null;
  private Long overrunPackets = null;
  private Long receivedPackets = null;
  private Long underrunPackets = null;

  
  /**
   * The MIME type(s) of the audio encodings used by the audio streams belonging to this endpoint
   **/
  public AnalyticsMediaEndpointStat codecs(List<String> codecs) {
    this.codecs = codecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The MIME type(s) of the audio encodings used by the audio streams belonging to this endpoint")
  @JsonProperty("codecs")
  public List<String> getCodecs() {
    return codecs;
  }
  public void setCodecs(List<String> codecs) {
    this.codecs = codecs;
  }

  
  /**
   * The total number of packets received too late or too early, jitter queue overrun or underrun, for all audio streams belonging to this endpoint
   **/
  public AnalyticsMediaEndpointStat discardedPackets(Long discardedPackets) {
    this.discardedPackets = discardedPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of packets received too late or too early, jitter queue overrun or underrun, for all audio streams belonging to this endpoint")
  @JsonProperty("discardedPackets")
  public Long getDiscardedPackets() {
    return discardedPackets;
  }
  public void setDiscardedPackets(Long discardedPackets) {
    this.discardedPackets = discardedPackets;
  }

  
  /**
   * The total number of packets received with the same sequence number as another one recently received (window of 64 packets), for all audio streams belonging to this endpoint
   **/
  public AnalyticsMediaEndpointStat duplicatePackets(Long duplicatePackets) {
    this.duplicatePackets = duplicatePackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of packets received with the same sequence number as another one recently received (window of 64 packets), for all audio streams belonging to this endpoint")
  @JsonProperty("duplicatePackets")
  public Long getDuplicatePackets() {
    return duplicatePackets;
  }
  public void setDuplicatePackets(Long duplicatePackets) {
    this.duplicatePackets = duplicatePackets;
  }

  
  /**
   * Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsMediaEndpointStat eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   * The total number of malformed or not RTP packets, unknown payload type, or discarded probation packets for all audio streams belonging to this endpoint
   **/
  public AnalyticsMediaEndpointStat invalidPackets(Long invalidPackets) {
    this.invalidPackets = invalidPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of malformed or not RTP packets, unknown payload type, or discarded probation packets for all audio streams belonging to this endpoint")
  @JsonProperty("invalidPackets")
  public Long getInvalidPackets() {
    return invalidPackets;
  }
  public void setInvalidPackets(Long invalidPackets) {
    this.invalidPackets = invalidPackets;
  }

  
  /**
   * The maximum latency experienced by any audio stream belonging to this endpoint, in milliseconds
   **/
  public AnalyticsMediaEndpointStat maxLatencyMs(Long maxLatencyMs) {
    this.maxLatencyMs = maxLatencyMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum latency experienced by any audio stream belonging to this endpoint, in milliseconds")
  @JsonProperty("maxLatencyMs")
  public Long getMaxLatencyMs() {
    return maxLatencyMs;
  }
  public void setMaxLatencyMs(Long maxLatencyMs) {
    this.maxLatencyMs = maxLatencyMs;
  }

  
  /**
   * The lowest estimated average MOS among all the audio streams belonging to this endpoint
   **/
  public AnalyticsMediaEndpointStat minMos(Double minMos) {
    this.minMos = minMos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lowest estimated average MOS among all the audio streams belonging to this endpoint")
  @JsonProperty("minMos")
  public Double getMinMos() {
    return minMos;
  }
  public void setMinMos(Double minMos) {
    this.minMos = minMos;
  }

  
  /**
   * The lowest R-factor value among all of the audio streams belonging to this endpoint
   **/
  public AnalyticsMediaEndpointStat minRFactor(Double minRFactor) {
    this.minRFactor = minRFactor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lowest R-factor value among all of the audio streams belonging to this endpoint")
  @JsonProperty("minRFactor")
  public Double getMinRFactor() {
    return minRFactor;
  }
  public void setMinRFactor(Double minRFactor) {
    this.minRFactor = minRFactor;
  }

  
  /**
   * The total number of packets for which there was no room in the jitter queue when it was received, for all audio streams belonging to this endpoint (also counted in discarded)
   **/
  public AnalyticsMediaEndpointStat overrunPackets(Long overrunPackets) {
    this.overrunPackets = overrunPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of packets for which there was no room in the jitter queue when it was received, for all audio streams belonging to this endpoint (also counted in discarded)")
  @JsonProperty("overrunPackets")
  public Long getOverrunPackets() {
    return overrunPackets;
  }
  public void setOverrunPackets(Long overrunPackets) {
    this.overrunPackets = overrunPackets;
  }

  
  /**
   * The total number of packets received for all audio streams belonging to this endpoint (includes invalid, duplicate, and discarded packets)
   **/
  public AnalyticsMediaEndpointStat receivedPackets(Long receivedPackets) {
    this.receivedPackets = receivedPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of packets received for all audio streams belonging to this endpoint (includes invalid, duplicate, and discarded packets)")
  @JsonProperty("receivedPackets")
  public Long getReceivedPackets() {
    return receivedPackets;
  }
  public void setReceivedPackets(Long receivedPackets) {
    this.receivedPackets = receivedPackets;
  }

  
  /**
   * The total number of packets received after their timestamp/seqnum has been played out, for all audio streams belonging to this endpoint (also counted in discarded)
   **/
  public AnalyticsMediaEndpointStat underrunPackets(Long underrunPackets) {
    this.underrunPackets = underrunPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of packets received after their timestamp/seqnum has been played out, for all audio streams belonging to this endpoint (also counted in discarded)")
  @JsonProperty("underrunPackets")
  public Long getUnderrunPackets() {
    return underrunPackets;
  }
  public void setUnderrunPackets(Long underrunPackets) {
    this.underrunPackets = underrunPackets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsMediaEndpointStat analyticsMediaEndpointStat = (AnalyticsMediaEndpointStat) o;
    return Objects.equals(this.codecs, analyticsMediaEndpointStat.codecs) &&
        Objects.equals(this.discardedPackets, analyticsMediaEndpointStat.discardedPackets) &&
        Objects.equals(this.duplicatePackets, analyticsMediaEndpointStat.duplicatePackets) &&
        Objects.equals(this.eventTime, analyticsMediaEndpointStat.eventTime) &&
        Objects.equals(this.invalidPackets, analyticsMediaEndpointStat.invalidPackets) &&
        Objects.equals(this.maxLatencyMs, analyticsMediaEndpointStat.maxLatencyMs) &&
        Objects.equals(this.minMos, analyticsMediaEndpointStat.minMos) &&
        Objects.equals(this.minRFactor, analyticsMediaEndpointStat.minRFactor) &&
        Objects.equals(this.overrunPackets, analyticsMediaEndpointStat.overrunPackets) &&
        Objects.equals(this.receivedPackets, analyticsMediaEndpointStat.receivedPackets) &&
        Objects.equals(this.underrunPackets, analyticsMediaEndpointStat.underrunPackets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codecs, discardedPackets, duplicatePackets, eventTime, invalidPackets, maxLatencyMs, minMos, minRFactor, overrunPackets, receivedPackets, underrunPackets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMediaEndpointStat {\n");
    
    sb.append("    codecs: ").append(toIndentedString(codecs)).append("\n");
    sb.append("    discardedPackets: ").append(toIndentedString(discardedPackets)).append("\n");
    sb.append("    duplicatePackets: ").append(toIndentedString(duplicatePackets)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    invalidPackets: ").append(toIndentedString(invalidPackets)).append("\n");
    sb.append("    maxLatencyMs: ").append(toIndentedString(maxLatencyMs)).append("\n");
    sb.append("    minMos: ").append(toIndentedString(minMos)).append("\n");
    sb.append("    minRFactor: ").append(toIndentedString(minRFactor)).append("\n");
    sb.append("    overrunPackets: ").append(toIndentedString(overrunPackets)).append("\n");
    sb.append("    receivedPackets: ").append(toIndentedString(receivedPackets)).append("\n");
    sb.append("    underrunPackets: ").append(toIndentedString(underrunPackets)).append("\n");
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

