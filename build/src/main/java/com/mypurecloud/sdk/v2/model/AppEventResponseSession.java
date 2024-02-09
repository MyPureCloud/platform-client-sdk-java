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
import com.mypurecloud.sdk.v2.model.Referrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AppEventResponseSession
 */

public class AppEventResponseSession  implements Serializable {
  
  private String id = null;
  private Integer durationInSeconds = null;
  private Integer eventCount = null;
  private Integer screenviewCount = null;
  private Referrer referrer = null;
  private String selfUri = null;
  private Date createdDate = null;

  
  /**
   * ID of the app session.
   **/
  public AppEventResponseSession id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the app session.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Indicates how long the customer has been in the app within this session.
   **/
  public AppEventResponseSession durationInSeconds(Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates how long the customer has been in the app within this session.")
  @JsonProperty("durationInSeconds")
  public Integer getDurationInSeconds() {
    return durationInSeconds;
  }
  public void setDurationInSeconds(Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }


  /**
   * The count of all events recorded during this session.
   **/
  public AppEventResponseSession eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of all events recorded during this session.")
  @JsonProperty("eventCount")
  public Integer getEventCount() {
    return eventCount;
  }
  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }


  /**
   * The count of all screen views recorded during this session.
   **/
  public AppEventResponseSession screenviewCount(Integer screenviewCount) {
    this.screenviewCount = screenviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of all screen views recorded during this session.")
  @JsonProperty("screenviewCount")
  public Integer getScreenviewCount() {
    return screenviewCount;
  }
  public void setScreenviewCount(Integer screenviewCount) {
    this.screenviewCount = screenviewCount;
  }


  /**
   * The referrer of the first event in the app session.
   **/
  public AppEventResponseSession referrer(Referrer referrer) {
    this.referrer = referrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The referrer of the first event in the app session.")
  @JsonProperty("referrer")
  public Referrer getReferrer() {
    return referrer;
  }
  public void setReferrer(Referrer referrer) {
    this.referrer = referrer;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * UTC timestamp of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AppEventResponseSession createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UTC timestamp of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEventResponseSession appEventResponseSession = (AppEventResponseSession) o;

    return Objects.equals(this.id, appEventResponseSession.id) &&
            Objects.equals(this.durationInSeconds, appEventResponseSession.durationInSeconds) &&
            Objects.equals(this.eventCount, appEventResponseSession.eventCount) &&
            Objects.equals(this.screenviewCount, appEventResponseSession.screenviewCount) &&
            Objects.equals(this.referrer, appEventResponseSession.referrer) &&
            Objects.equals(this.selfUri, appEventResponseSession.selfUri) &&
            Objects.equals(this.createdDate, appEventResponseSession.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, durationInSeconds, eventCount, screenviewCount, referrer, selfUri, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventResponseSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    screenviewCount: ").append(toIndentedString(screenviewCount)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

