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
import com.mypurecloud.sdk.v2.model.Endpoint;
import com.mypurecloud.sdk.v2.model.Recording;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OrphanRecording
 */

public class OrphanRecording  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date createdTime = null;
  private Date recoveredTime = null;

  private static class ProviderTypeEnumDeserializer extends StdDeserializer<ProviderTypeEnum> {
    public ProviderTypeEnumDeserializer() {
      super(ProviderTypeEnumDeserializer.class);
    }

    @Override
    public ProviderTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ProviderTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets providerType
   */
 @JsonDeserialize(using = ProviderTypeEnumDeserializer.class)
  public enum ProviderTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EDGE("EDGE"),
    CHAT("CHAT"),
    EMAIL("EMAIL"),
    SCREEN_RECORDING("SCREEN_RECORDING"),
    PUREENGAGE("PUREENGAGE"),
    PURECONNECT("PURECONNECT");

    private String value;

    ProviderTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ProviderTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ProviderTypeEnum value : ProviderTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ProviderTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ProviderTypeEnum providerType = null;
  private Long mediaSizeBytes = null;

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
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("CALL"),
    CHAT("CHAT"),
    EMAIL("EMAIL"),
    SCREEN("SCREEN");

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

  private static class MediaSubtypeEnumDeserializer extends StdDeserializer<MediaSubtypeEnum> {
    public MediaSubtypeEnumDeserializer() {
      super(MediaSubtypeEnumDeserializer.class);
    }

    @Override
    public MediaSubtypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaSubtypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaSubtype
   */
 @JsonDeserialize(using = MediaSubtypeEnumDeserializer.class)
  public enum MediaSubtypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TRUNK("Trunk"),
    STATION("Station"),
    CONSULT("Consult"),
    SCREEN("Screen");

    private String value;

    MediaSubtypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaSubtypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaSubtypeEnum value : MediaSubtypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaSubtypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaSubtypeEnum mediaSubtype = null;
  private String mediaSubject = null;

  private static class FileStateEnumDeserializer extends StdDeserializer<FileStateEnum> {
    public FileStateEnumDeserializer() {
      super(FileStateEnumDeserializer.class);
    }

    @Override
    public FileStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FileStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets fileState
   */
 @JsonDeserialize(using = FileStateEnumDeserializer.class)
  public enum FileStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ARCHIVED("ARCHIVED"),
    AVAILABLE("AVAILABLE"),
    DELETED("DELETED"),
    RESTORED("RESTORED"),
    RESTORING("RESTORING"),
    UPLOADING("UPLOADING");

    private String value;

    FileStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FileStateEnum fromString(String key) {
      if (key == null) return null;

      for (FileStateEnum value : FileStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FileStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FileStateEnum fileState = null;
  private Endpoint providerEndpoint = null;
  private Recording recording = null;

  private static class OrphanStatusEnumDeserializer extends StdDeserializer<OrphanStatusEnum> {
    public OrphanStatusEnumDeserializer() {
      super(OrphanStatusEnumDeserializer.class);
    }

    @Override
    public OrphanStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OrphanStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the orphaned recording's conversation.
   */
 @JsonDeserialize(using = OrphanStatusEnumDeserializer.class)
  public enum OrphanStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NO_CONVERSATION("NO_CONVERSATION"),
    UNKNOWN_CONVERSATION("UNKNOWN_CONVERSATION"),
    CONVERSATION_NOT_COMPLETE("CONVERSATION_NOT_COMPLETE"),
    CONVERSATION_NOT_EVALUATED("CONVERSATION_NOT_EVALUATED"),
    EVALUATED("EVALUATED");

    private String value;

    OrphanStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OrphanStatusEnum fromString(String key) {
      if (key == null) return null;

      for (OrphanStatusEnum value : OrphanStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OrphanStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OrphanStatusEnum orphanStatus = null;
  private String sourceOrphaningId = null;

  private static class RegionEnumDeserializer extends StdDeserializer<RegionEnum> {
    public RegionEnumDeserializer() {
      super(RegionEnumDeserializer.class);
    }

    @Override
    public RegionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RegionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets region
   */
 @JsonDeserialize(using = RegionEnumDeserializer.class)
  public enum RegionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AF_SOUTH_1("af-south-1"),
    AP_EAST_1("ap-east-1"),
    AP_NORTHEAST_1("ap-northeast-1"),
    AP_NORTHEAST_2("ap-northeast-2"),
    AP_NORTHEAST_3("ap-northeast-3"),
    AP_SOUTH_1("ap-south-1"),
    AP_SOUTHEAST_1("ap-southeast-1"),
    AP_SOUTHEAST_2("ap-southeast-2"),
    AP_SOUTHEAST_3("ap-southeast-3"),
    CA_CENTRAL_1("ca-central-1"),
    EU_CENTRAL_1("eu-central-1"),
    EU_CENTRAL_2("eu-central-2"),
    EU_WEST_1("eu-west-1"),
    EU_WEST_2("eu-west-2"),
    EU_WEST_3("eu-west-3"),
    ME_CENTRAL_1("me-central-1"),
    SA_EAST_1("sa-east-1"),
    US_EAST_1("us-east-1"),
    US_WEST_2("us-west-2");

    private String value;

    RegionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RegionEnum fromString(String key) {
      if (key == null) return null;

      for (RegionEnum value : RegionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RegionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RegionEnum region = null;
  private String selfUri = null;

  public OrphanRecording() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public OrphanRecording name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OrphanRecording createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdTime")
  public Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OrphanRecording recoveredTime(Date recoveredTime) {
    this.recoveredTime = recoveredTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("recoveredTime")
  public Date getRecoveredTime() {
    return recoveredTime;
  }
  public void setRecoveredTime(Date recoveredTime) {
    this.recoveredTime = recoveredTime;
  }


  /**
   **/
  public OrphanRecording providerType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerType")
  public ProviderTypeEnum getProviderType() {
    return providerType;
  }
  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }


  /**
   **/
  public OrphanRecording mediaSizeBytes(Long mediaSizeBytes) {
    this.mediaSizeBytes = mediaSizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaSizeBytes")
  public Long getMediaSizeBytes() {
    return mediaSizeBytes;
  }
  public void setMediaSizeBytes(Long mediaSizeBytes) {
    this.mediaSizeBytes = mediaSizeBytes;
  }


  /**
   **/
  public OrphanRecording mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public OrphanRecording mediaSubtype(MediaSubtypeEnum mediaSubtype) {
    this.mediaSubtype = mediaSubtype;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaSubtype")
  public MediaSubtypeEnum getMediaSubtype() {
    return mediaSubtype;
  }
  public void setMediaSubtype(MediaSubtypeEnum mediaSubtype) {
    this.mediaSubtype = mediaSubtype;
  }


  /**
   **/
  public OrphanRecording mediaSubject(String mediaSubject) {
    this.mediaSubject = mediaSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaSubject")
  public String getMediaSubject() {
    return mediaSubject;
  }
  public void setMediaSubject(String mediaSubject) {
    this.mediaSubject = mediaSubject;
  }


  /**
   **/
  public OrphanRecording fileState(FileStateEnum fileState) {
    this.fileState = fileState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileState")
  public FileStateEnum getFileState() {
    return fileState;
  }
  public void setFileState(FileStateEnum fileState) {
    this.fileState = fileState;
  }


  /**
   **/
  public OrphanRecording providerEndpoint(Endpoint providerEndpoint) {
    this.providerEndpoint = providerEndpoint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerEndpoint")
  public Endpoint getProviderEndpoint() {
    return providerEndpoint;
  }
  public void setProviderEndpoint(Endpoint providerEndpoint) {
    this.providerEndpoint = providerEndpoint;
  }


  /**
   **/
  public OrphanRecording recording(Recording recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recording")
  public Recording getRecording() {
    return recording;
  }
  public void setRecording(Recording recording) {
    this.recording = recording;
  }


  /**
   * The status of the orphaned recording's conversation.
   **/
  public OrphanRecording orphanStatus(OrphanStatusEnum orphanStatus) {
    this.orphanStatus = orphanStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the orphaned recording's conversation.")
  @JsonProperty("orphanStatus")
  public OrphanStatusEnum getOrphanStatus() {
    return orphanStatus;
  }
  public void setOrphanStatus(OrphanStatusEnum orphanStatus) {
    this.orphanStatus = orphanStatus;
  }


  /**
   * An identifier used during recovery operations by the supplying hybrid platform to track back and determine which interaction this recording is associated with
   **/
  public OrphanRecording sourceOrphaningId(String sourceOrphaningId) {
    this.sourceOrphaningId = sourceOrphaningId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An identifier used during recovery operations by the supplying hybrid platform to track back and determine which interaction this recording is associated with")
  @JsonProperty("sourceOrphaningId")
  public String getSourceOrphaningId() {
    return sourceOrphaningId;
  }
  public void setSourceOrphaningId(String sourceOrphaningId) {
    this.sourceOrphaningId = sourceOrphaningId;
  }


  /**
   **/
  public OrphanRecording region(RegionEnum region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("region")
  public RegionEnum getRegion() {
    return region;
  }
  public void setRegion(RegionEnum region) {
    this.region = region;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrphanRecording orphanRecording = (OrphanRecording) o;

    return Objects.equals(this.id, orphanRecording.id) &&
            Objects.equals(this.name, orphanRecording.name) &&
            Objects.equals(this.createdTime, orphanRecording.createdTime) &&
            Objects.equals(this.recoveredTime, orphanRecording.recoveredTime) &&
            Objects.equals(this.providerType, orphanRecording.providerType) &&
            Objects.equals(this.mediaSizeBytes, orphanRecording.mediaSizeBytes) &&
            Objects.equals(this.mediaType, orphanRecording.mediaType) &&
            Objects.equals(this.mediaSubtype, orphanRecording.mediaSubtype) &&
            Objects.equals(this.mediaSubject, orphanRecording.mediaSubject) &&
            Objects.equals(this.fileState, orphanRecording.fileState) &&
            Objects.equals(this.providerEndpoint, orphanRecording.providerEndpoint) &&
            Objects.equals(this.recording, orphanRecording.recording) &&
            Objects.equals(this.orphanStatus, orphanRecording.orphanStatus) &&
            Objects.equals(this.sourceOrphaningId, orphanRecording.sourceOrphaningId) &&
            Objects.equals(this.region, orphanRecording.region) &&
            Objects.equals(this.selfUri, orphanRecording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdTime, recoveredTime, providerType, mediaSizeBytes, mediaType, mediaSubtype, mediaSubject, fileState, providerEndpoint, recording, orphanStatus, sourceOrphaningId, region, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrphanRecording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    recoveredTime: ").append(toIndentedString(recoveredTime)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    mediaSizeBytes: ").append(toIndentedString(mediaSizeBytes)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mediaSubtype: ").append(toIndentedString(mediaSubtype)).append("\n");
    sb.append("    mediaSubject: ").append(toIndentedString(mediaSubject)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    providerEndpoint: ").append(toIndentedString(providerEndpoint)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    orphanStatus: ").append(toIndentedString(orphanStatus)).append("\n");
    sb.append("    sourceOrphaningId: ").append(toIndentedString(sourceOrphaningId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

