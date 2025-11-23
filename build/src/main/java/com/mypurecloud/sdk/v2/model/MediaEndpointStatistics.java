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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.MediaIceStatistics;
import com.mypurecloud.sdk.v2.model.MediaRtpStatistics;
import com.mypurecloud.sdk.v2.model.MediaStatisticsClientInfo;
import com.mypurecloud.sdk.v2.model.MediaStatisticsTrunkInfo;
import com.mypurecloud.sdk.v2.model.NamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

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
  private Integer reconnectAttempts = null;

  private static class SourceTypeEnumDeserializer extends StdDeserializer<SourceTypeEnum> {
    public SourceTypeEnumDeserializer() {
      super(SourceTypeEnumDeserializer.class);
    }

    @Override
    public SourceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Source type of media endpoint
   */
 @JsonDeserialize(using = SourceTypeEnumDeserializer.class)
  public enum SourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLIENT("Client"),
    SERVER("Server");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SourceTypeEnum value : SourceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceTypeEnum sourceType = null;
  private MediaStatisticsClientInfo clientInfo = null;
  private Date dateCreated = null;
  private Date dateProcessed = null;

  public MediaEndpointStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
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
  public MediaEndpointStatistics reconnectAttempts(Integer reconnectAttempts) {
    this.reconnectAttempts = reconnectAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media reconnect attempt count")
  @JsonProperty("reconnectAttempts")
  public Integer getReconnectAttempts() {
    return reconnectAttempts;
  }
  public void setReconnectAttempts(Integer reconnectAttempts) {
    this.reconnectAttempts = reconnectAttempts;
  }


  /**
   * Source type of media endpoint
   **/
  public MediaEndpointStatistics sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source type of media endpoint")
  @JsonProperty("sourceType")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  /**
   * Client information associated with media endpoint
   **/
  public MediaEndpointStatistics clientInfo(MediaStatisticsClientInfo clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Client information associated with media endpoint")
  @JsonProperty("clientInfo")
  public MediaStatisticsClientInfo getClientInfo() {
    return clientInfo;
  }
  public void setClientInfo(MediaStatisticsClientInfo clientInfo) {
    this.clientInfo = clientInfo;
  }


  /**
   * Media endpoint statistics creation time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MediaEndpointStatistics dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media endpoint statistics creation time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Media endpoint statistics processed time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MediaEndpointStatistics dateProcessed(Date dateProcessed) {
    this.dateProcessed = dateProcessed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media endpoint statistics processed time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateProcessed")
  public Date getDateProcessed() {
    return dateProcessed;
  }
  public void setDateProcessed(Date dateProcessed) {
    this.dateProcessed = dateProcessed;
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
            Objects.equals(this.reconnectAttempts, mediaEndpointStatistics.reconnectAttempts) &&
            Objects.equals(this.sourceType, mediaEndpointStatistics.sourceType) &&
            Objects.equals(this.clientInfo, mediaEndpointStatistics.clientInfo) &&
            Objects.equals(this.dateCreated, mediaEndpointStatistics.dateCreated) &&
            Objects.equals(this.dateProcessed, mediaEndpointStatistics.dateProcessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trunk, station, user, ice, rtp, reconnectAttempts, sourceType, clientInfo, dateCreated, dateProcessed);
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
    sb.append("    reconnectAttempts: ").append(toIndentedString(reconnectAttempts)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateProcessed: ").append(toIndentedString(dateProcessed)).append("\n");
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

