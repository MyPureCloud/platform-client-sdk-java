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
import com.mypurecloud.sdk.v2.model.Referrer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WebEventResponseSession
 */

public class WebEventResponseSession  implements Serializable {
  
  private String id = null;
  private Integer durationInSeconds = null;
  private Integer eventCount = null;
  private Integer pageviewCount = null;
  private Referrer referrer = null;
  private String selfUri = null;
  private Date createdDate = null;

  public WebEventResponseSession() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Indicates how long the customer has been on the site within this session.
   **/
  public WebEventResponseSession durationInSeconds(Integer durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates how long the customer has been on the site within this session.")
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
  public WebEventResponseSession eventCount(Integer eventCount) {
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
   * The count of all pageviews performed during this session.
   **/
  public WebEventResponseSession pageviewCount(Integer pageviewCount) {
    this.pageviewCount = pageviewCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of all pageviews performed during this session.")
  @JsonProperty("pageviewCount")
  public Integer getPageviewCount() {
    return pageviewCount;
  }
  public void setPageviewCount(Integer pageviewCount) {
    this.pageviewCount = pageviewCount;
  }


  /**
   * The referrer of the first event in the web session.
   **/
  public WebEventResponseSession referrer(Referrer referrer) {
    this.referrer = referrer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The referrer of the first event in the web session.")
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
   * Date of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WebEventResponseSession createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    WebEventResponseSession webEventResponseSession = (WebEventResponseSession) o;

    return Objects.equals(this.id, webEventResponseSession.id) &&
            Objects.equals(this.durationInSeconds, webEventResponseSession.durationInSeconds) &&
            Objects.equals(this.eventCount, webEventResponseSession.eventCount) &&
            Objects.equals(this.pageviewCount, webEventResponseSession.pageviewCount) &&
            Objects.equals(this.referrer, webEventResponseSession.referrer) &&
            Objects.equals(this.selfUri, webEventResponseSession.selfUri) &&
            Objects.equals(this.createdDate, webEventResponseSession.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, durationInSeconds, eventCount, pageviewCount, referrer, selfUri, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebEventResponseSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    pageviewCount: ").append(toIndentedString(pageviewCount)).append("\n");
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

