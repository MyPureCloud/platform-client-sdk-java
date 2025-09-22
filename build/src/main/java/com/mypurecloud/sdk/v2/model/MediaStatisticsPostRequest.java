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
import com.mypurecloud.sdk.v2.model.MediaRtpStatistics;
import com.mypurecloud.sdk.v2.model.MediaStatisticsClientInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MediaStatisticsPostRequest
 */

public class MediaStatisticsPostRequest  implements Serializable {
  

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
    CLIENT("Client");

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
  private MediaRtpStatistics rtp = null;
  private Integer reconnectAttempts = null;
  private Date dateCreated = null;

  public MediaStatisticsPostRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Source type of media endpoint
   **/
  public MediaStatisticsPostRequest sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source type of media endpoint")
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
  public MediaStatisticsPostRequest clientInfo(MediaStatisticsClientInfo clientInfo) {
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
   * Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550
   **/
  public MediaStatisticsPostRequest rtp(MediaRtpStatistics rtp) {
    this.rtp = rtp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550")
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
  public MediaStatisticsPostRequest reconnectAttempts(Integer reconnectAttempts) {
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
   * Media endpoint statistics creation time. Format: yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MediaStatisticsPostRequest dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Media endpoint statistics creation time. Format: yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStatisticsPostRequest mediaStatisticsPostRequest = (MediaStatisticsPostRequest) o;

    return Objects.equals(this.sourceType, mediaStatisticsPostRequest.sourceType) &&
            Objects.equals(this.clientInfo, mediaStatisticsPostRequest.clientInfo) &&
            Objects.equals(this.rtp, mediaStatisticsPostRequest.rtp) &&
            Objects.equals(this.reconnectAttempts, mediaStatisticsPostRequest.reconnectAttempts) &&
            Objects.equals(this.dateCreated, mediaStatisticsPostRequest.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, clientInfo, rtp, reconnectAttempts, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStatisticsPostRequest {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    rtp: ").append(toIndentedString(rtp)).append("\n");
    sb.append("    reconnectAttempts: ").append(toIndentedString(reconnectAttempts)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

