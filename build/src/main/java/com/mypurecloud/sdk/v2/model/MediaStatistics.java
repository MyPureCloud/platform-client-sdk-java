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
import com.mypurecloud.sdk.v2.model.MediaEndpointStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * MediaStatistics
 */

public class MediaStatistics  implements Serializable {
  
  private String communicationId = null;
  private Date dateStart = null;
  private Long creationMilliseconds = null;
  private String preferredRegion = null;
  private String effectiveRegion = null;
  private List<MediaEndpointStatistics> mediaStatistics = null;

  public MediaStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaStatistics = new ArrayList<MediaEndpointStatistics>();
    }
  }

  
  /**
   **/
  public MediaStatistics communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MediaStatistics dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * Relative milliseconds to create media session
   **/
  public MediaStatistics creationMilliseconds(Long creationMilliseconds) {
    this.creationMilliseconds = creationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Relative milliseconds to create media session")
  @JsonProperty("creationMilliseconds")
  public Long getCreationMilliseconds() {
    return creationMilliseconds;
  }
  public void setCreationMilliseconds(Long creationMilliseconds) {
    this.creationMilliseconds = creationMilliseconds;
  }


  /**
   * Preferred media region
   **/
  public MediaStatistics preferredRegion(String preferredRegion) {
    this.preferredRegion = preferredRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Preferred media region")
  @JsonProperty("preferredRegion")
  public String getPreferredRegion() {
    return preferredRegion;
  }
  public void setPreferredRegion(String preferredRegion) {
    this.preferredRegion = preferredRegion;
  }


  /**
   * Actual media region
   **/
  public MediaStatistics effectiveRegion(String effectiveRegion) {
    this.effectiveRegion = effectiveRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual media region")
  @JsonProperty("effectiveRegion")
  public String getEffectiveRegion() {
    return effectiveRegion;
  }
  public void setEffectiveRegion(String effectiveRegion) {
    this.effectiveRegion = effectiveRegion;
  }


  /**
   * Media statistics for each media endpoint
   **/
  public MediaStatistics mediaStatistics(List<MediaEndpointStatistics> mediaStatistics) {
    this.mediaStatistics = mediaStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media statistics for each media endpoint")
  @JsonProperty("mediaStatistics")
  public List<MediaEndpointStatistics> getMediaStatistics() {
    return mediaStatistics;
  }
  public void setMediaStatistics(List<MediaEndpointStatistics> mediaStatistics) {
    this.mediaStatistics = mediaStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStatistics mediaStatistics = (MediaStatistics) o;

    return Objects.equals(this.communicationId, mediaStatistics.communicationId) &&
            Objects.equals(this.dateStart, mediaStatistics.dateStart) &&
            Objects.equals(this.creationMilliseconds, mediaStatistics.creationMilliseconds) &&
            Objects.equals(this.preferredRegion, mediaStatistics.preferredRegion) &&
            Objects.equals(this.effectiveRegion, mediaStatistics.effectiveRegion) &&
            Objects.equals(this.mediaStatistics, mediaStatistics.mediaStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationId, dateStart, creationMilliseconds, preferredRegion, effectiveRegion, mediaStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStatistics {\n");
    
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    creationMilliseconds: ").append(toIndentedString(creationMilliseconds)).append("\n");
    sb.append("    preferredRegion: ").append(toIndentedString(preferredRegion)).append("\n");
    sb.append("    effectiveRegion: ").append(toIndentedString(effectiveRegion)).append("\n");
    sb.append("    mediaStatistics: ").append(toIndentedString(mediaStatistics)).append("\n");
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

