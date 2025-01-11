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
import com.mypurecloud.sdk.v2.model.AggregateHistoricalAvailability;
import com.mypurecloud.sdk.v2.model.SessionInfo;
import com.mypurecloud.sdk.v2.model.Snapshots;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SessionMetaDataResult
 */

public class SessionMetaDataResult  implements Serializable {
  
  private SessionInfo sessionInfo = null;
  private List<Snapshots> snapshots = new ArrayList<Snapshots>();
  private Date dateForecastStart = null;
  private Date dateHistoricalStart = null;
  private AggregateHistoricalAvailability aggregateOfferedHistoricalAvailability = null;
  private AggregateHistoricalAvailability aggregateAverageHandleTimeHistoricalAvailability = null;

  
  /**
   * Information about the continuous forecast session
   **/
  public SessionMetaDataResult sessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the continuous forecast session")
  @JsonProperty("sessionInfo")
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }
  public void setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
  }


  /**
   * Captured snapshots
   **/
  public SessionMetaDataResult snapshots(List<Snapshots> snapshots) {
    this.snapshots = snapshots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Captured snapshots")
  @JsonProperty("snapshots")
  public List<Snapshots> getSnapshots() {
    return snapshots;
  }
  public void setSnapshots(List<Snapshots> snapshots) {
    this.snapshots = snapshots;
  }


  /**
   * Start date of the forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SessionMetaDataResult dateForecastStart(Date dateForecastStart) {
    this.dateForecastStart = dateForecastStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date of the forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateForecastStart")
  public Date getDateForecastStart() {
    return dateForecastStart;
  }
  public void setDateForecastStart(Date dateForecastStart) {
    this.dateForecastStart = dateForecastStart;
  }


  /**
   * Start date of the oldest available historical week. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SessionMetaDataResult dateHistoricalStart(Date dateHistoricalStart) {
    this.dateHistoricalStart = dateHistoricalStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date of the oldest available historical week. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateHistoricalStart")
  public Date getDateHistoricalStart() {
    return dateHistoricalStart;
  }
  public void setDateHistoricalStart(Date dateHistoricalStart) {
    this.dateHistoricalStart = dateHistoricalStart;
  }


  /**
   * Total historical availability for offered metric across all planning groups
   **/
  public SessionMetaDataResult aggregateOfferedHistoricalAvailability(AggregateHistoricalAvailability aggregateOfferedHistoricalAvailability) {
    this.aggregateOfferedHistoricalAvailability = aggregateOfferedHistoricalAvailability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total historical availability for offered metric across all planning groups")
  @JsonProperty("aggregateOfferedHistoricalAvailability")
  public AggregateHistoricalAvailability getAggregateOfferedHistoricalAvailability() {
    return aggregateOfferedHistoricalAvailability;
  }
  public void setAggregateOfferedHistoricalAvailability(AggregateHistoricalAvailability aggregateOfferedHistoricalAvailability) {
    this.aggregateOfferedHistoricalAvailability = aggregateOfferedHistoricalAvailability;
  }


  /**
   * Total historical availability for average handle time metric across all planning groups
   **/
  public SessionMetaDataResult aggregateAverageHandleTimeHistoricalAvailability(AggregateHistoricalAvailability aggregateAverageHandleTimeHistoricalAvailability) {
    this.aggregateAverageHandleTimeHistoricalAvailability = aggregateAverageHandleTimeHistoricalAvailability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total historical availability for average handle time metric across all planning groups")
  @JsonProperty("aggregateAverageHandleTimeHistoricalAvailability")
  public AggregateHistoricalAvailability getAggregateAverageHandleTimeHistoricalAvailability() {
    return aggregateAverageHandleTimeHistoricalAvailability;
  }
  public void setAggregateAverageHandleTimeHistoricalAvailability(AggregateHistoricalAvailability aggregateAverageHandleTimeHistoricalAvailability) {
    this.aggregateAverageHandleTimeHistoricalAvailability = aggregateAverageHandleTimeHistoricalAvailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionMetaDataResult sessionMetaDataResult = (SessionMetaDataResult) o;

    return Objects.equals(this.sessionInfo, sessionMetaDataResult.sessionInfo) &&
            Objects.equals(this.snapshots, sessionMetaDataResult.snapshots) &&
            Objects.equals(this.dateForecastStart, sessionMetaDataResult.dateForecastStart) &&
            Objects.equals(this.dateHistoricalStart, sessionMetaDataResult.dateHistoricalStart) &&
            Objects.equals(this.aggregateOfferedHistoricalAvailability, sessionMetaDataResult.aggregateOfferedHistoricalAvailability) &&
            Objects.equals(this.aggregateAverageHandleTimeHistoricalAvailability, sessionMetaDataResult.aggregateAverageHandleTimeHistoricalAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionInfo, snapshots, dateForecastStart, dateHistoricalStart, aggregateOfferedHistoricalAvailability, aggregateAverageHandleTimeHistoricalAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionMetaDataResult {\n");
    
    sb.append("    sessionInfo: ").append(toIndentedString(sessionInfo)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    dateForecastStart: ").append(toIndentedString(dateForecastStart)).append("\n");
    sb.append("    dateHistoricalStart: ").append(toIndentedString(dateHistoricalStart)).append("\n");
    sb.append("    aggregateOfferedHistoricalAvailability: ").append(toIndentedString(aggregateOfferedHistoricalAvailability)).append("\n");
    sb.append("    aggregateAverageHandleTimeHistoricalAvailability: ").append(toIndentedString(aggregateAverageHandleTimeHistoricalAvailability)).append("\n");
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

