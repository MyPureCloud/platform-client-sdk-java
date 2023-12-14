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
import com.mypurecloud.sdk.v2.model.MediaIceStatistics;
import com.mypurecloud.sdk.v2.model.MediaRtpStatistics;
import com.mypurecloud.sdk.v2.model.MediaStatisticsTrunkInfo;
import com.mypurecloud.sdk.v2.model.NamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MediaEndpointStatistics
 */

public class MediaEndpointStatistics  implements Serializable {
  
  private MediaStatisticsTrunkInfo trunk = null;
  private NamedEntity station = null;
  private NamedEntity user = null;
  private MediaIceStatistics ice = null;
  private MediaRtpStatistics rtp = null;
  private Integer reconnectAttemptCount = null;

  
  /**
   * Trunk information utilized when creating the media endpoint
   **/
  public MediaEndpointStatistics trunk(MediaStatisticsTrunkInfo trunk) {
    this.trunk = trunk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trunk information utilized when creating the media endpoint")
  @JsonProperty("trunk")
  public MediaStatisticsTrunkInfo getTrunk() {
    return trunk;
  }
  public void setTrunk(MediaStatisticsTrunkInfo trunk) {
    this.trunk = trunk;
  }


  /**
   * Station information associated with media endpoint
   **/
  public MediaEndpointStatistics station(NamedEntity station) {
    this.station = station;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Station information associated with media endpoint")
  @JsonProperty("station")
  public NamedEntity getStation() {
    return station;
  }
  public void setStation(NamedEntity station) {
    this.station = station;
  }


  /**
   * User information associated media endpoint
   **/
  public MediaEndpointStatistics user(NamedEntity user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User information associated media endpoint")
  @JsonProperty("user")
  public NamedEntity getUser() {
    return user;
  }
  public void setUser(NamedEntity user) {
    this.user = user;
  }


  /**
   * The ICE protocol statistics and details. Reference: https://www.rfc-editor.org/rfc/rfc5245
   **/
  public MediaEndpointStatistics ice(MediaIceStatistics ice) {
    this.ice = ice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ICE protocol statistics and details. Reference: https://www.rfc-editor.org/rfc/rfc5245")
  @JsonProperty("ice")
  public MediaIceStatistics getIce() {
    return ice;
  }
  public void setIce(MediaIceStatistics ice) {
    this.ice = ice;
  }


  /**
   * Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550
   **/
  public MediaEndpointStatistics rtp(MediaRtpStatistics rtp) {
    this.rtp = rtp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550")
  @JsonProperty("rtp")
  public MediaRtpStatistics getRtp() {
    return rtp;
  }
  public void setRtp(MediaRtpStatistics rtp) {
    this.rtp = rtp;
  }


  /**
   * Media reconnect attempt count
   **/
  public MediaEndpointStatistics reconnectAttemptCount(Integer reconnectAttemptCount) {
    this.reconnectAttemptCount = reconnectAttemptCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media reconnect attempt count")
  @JsonProperty("reconnectAttemptCount")
  public Integer getReconnectAttemptCount() {
    return reconnectAttemptCount;
  }
  public void setReconnectAttemptCount(Integer reconnectAttemptCount) {
    this.reconnectAttemptCount = reconnectAttemptCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEndpointStatistics mediaEndpointStatistics = (MediaEndpointStatistics) o;

    return Objects.equals(this.trunk, mediaEndpointStatistics.trunk) &&
            Objects.equals(this.station, mediaEndpointStatistics.station) &&
            Objects.equals(this.user, mediaEndpointStatistics.user) &&
            Objects.equals(this.ice, mediaEndpointStatistics.ice) &&
            Objects.equals(this.rtp, mediaEndpointStatistics.rtp) &&
            Objects.equals(this.reconnectAttemptCount, mediaEndpointStatistics.reconnectAttemptCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trunk, station, user, ice, rtp, reconnectAttemptCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEndpointStatistics {\n");
    
    sb.append("    trunk: ").append(toIndentedString(trunk)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ice: ").append(toIndentedString(ice)).append("\n");
    sb.append("    rtp: ").append(toIndentedString(rtp)).append("\n");
    sb.append("    reconnectAttemptCount: ").append(toIndentedString(reconnectAttemptCount)).append("\n");
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

