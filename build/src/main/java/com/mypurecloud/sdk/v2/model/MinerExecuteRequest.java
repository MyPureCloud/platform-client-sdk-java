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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MinerExecuteRequest
 */

public class MinerExecuteRequest  implements Serializable {
  
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;
  private String uploadKey = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Media type for filtering conversations.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHAT("Chat"),
    CALL("Call"),
    MESSAGE("Message"),
    EMAIL("Email");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;

  private static class ParticipantTypeEnumDeserializer extends StdDeserializer<ParticipantTypeEnum> {
    public ParticipantTypeEnumDeserializer() {
      super(ParticipantTypeEnumDeserializer.class);
    }

    @Override
    public ParticipantTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParticipantTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the participant, either agent, customer or both.
   */
 @JsonDeserialize(using = ParticipantTypeEnumDeserializer.class)
  public enum ParticipantTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOMER("Customer"),
    AGENT("Agent"),
    BOTH("Both");

    private String value;

    ParticipantTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantTypeEnum value : ParticipantTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ParticipantTypeEnum participantType = null;
  private List<String> queueIds = null;

  public MinerExecuteRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      queueIds = new ArrayList<String>();
    }
  }

  
  /**
   * Start date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public MinerExecuteRequest dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "Wed Apr 01 02:00:00 CEST 2020", value = "Start date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * End date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public MinerExecuteRequest dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "Wed Apr 01 02:00:00 CEST 2020", value = "End date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Location of input conversations.
   **/
  public MinerExecuteRequest uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "intent-miner/raw-utterances/imports/org_id/request_id.mine_id.json", value = "Location of input conversations.")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * Media type for filtering conversations.
   **/
  public MinerExecuteRequest mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media type for filtering conversations.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Type of the participant, either agent, customer or both.
   **/
  public MinerExecuteRequest participantType(ParticipantTypeEnum participantType) {
    this.participantType = participantType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the participant, either agent, customer or both.")
  @JsonProperty("participantType")
  public ParticipantTypeEnum getParticipantType() {
    return participantType;
  }
  public void setParticipantType(ParticipantTypeEnum participantType) {
    this.participantType = participantType;
  }


  /**
   * List of queue IDs for filtering conversations.
   **/
  public MinerExecuteRequest queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "[ &quot;7fe8a4ce-7435-4c78-a83f-47c3943e53eb&quot;, &quot;18c744bf-34d5-452a-b6d6-9af95628aa50&quot;]", value = "List of queue IDs for filtering conversations.")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinerExecuteRequest minerExecuteRequest = (MinerExecuteRequest) o;

    return Objects.equals(this.dateStart, minerExecuteRequest.dateStart) &&
            Objects.equals(this.dateEnd, minerExecuteRequest.dateEnd) &&
            Objects.equals(this.uploadKey, minerExecuteRequest.uploadKey) &&
            Objects.equals(this.mediaType, minerExecuteRequest.mediaType) &&
            Objects.equals(this.participantType, minerExecuteRequest.participantType) &&
            Objects.equals(this.queueIds, minerExecuteRequest.queueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, dateEnd, uploadKey, mediaType, participantType, queueIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinerExecuteRequest {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
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

