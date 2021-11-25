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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Draft;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Miner
 */

public class Miner  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class LanguageEnumDeserializer extends StdDeserializer<LanguageEnum> {
    public LanguageEnumDeserializer() {
      super(LanguageEnumDeserializer.class);
    }

    @Override
    public LanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Language Localization code.
   */
 @JsonDeserialize(using = LanguageEnumDeserializer.class)
  public enum LanguageEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-us"),
    EN_GB("en-gb"),
    EN_AU("en-au"),
    EN_IN("en-in"),
    EN_ZA("en-za"),
    ES_US("es-us");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageEnum value : LanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageEnum language = null;
  private Date dateCreated = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of the miner.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOTSTARTED("NotStarted"),
    FETCHINGCONVERSATIONIDS("FetchingConversationIds"),
    CONVERSATIONIDSFETCHED("ConversationIdsFetched"),
    CONVERSATIONIDSFETCHERROR("ConversationIdsFetchError"),
    FETCHINGCONVERSATIONS("FetchingConversations"),
    CONVERSATIONSFETCHED("ConversationsFetched"),
    CONVERSATIONSFETCHERROR("ConversationsFetchError"),
    QUEUED("Queued"),
    QUEUINGERROR("QueuingError"),
    MININGSTARTED("MiningStarted"),
    MASKINGUTTERANCES("MaskingUtterances"),
    MASKINGERROR("MaskingError"),
    COMPUTINGANALYTICS("ComputingAnalytics"),
    COMPUTINGANALYTICSERROR("ComputingAnalyticsError"),
    MININGCOMPLETED("MiningCompleted"),
    MININGERROR("MiningError"),
    MODELVALIDATIONERROR("ModelValidationError"),
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private LocalDate conversationsDateRangeStart = null;
  private LocalDate conversationsDateRangeEnd = null;
  private Date dateCompleted = null;
  private String message = null;
  private Boolean conversationDataUploaded = null;

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
    CALL("Call");

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
  private List<String> queueIds = new ArrayList<String>();
  private Date dateTriggered = null;
  private Date dateModified = null;
  private Draft latestDraftVersion = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Chat Corpus Name.
   **/
  public Miner name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Chat Corpus Name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Language Localization code.
   **/
  public Miner language(LanguageEnum language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language Localization code.")
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  
  @ApiModelProperty(example = "2020-04-29T17:12:06.613", value = "Date when the miner was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Status of the miner.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "2019-06-20", value = "Date from which the conversations need to be taken for mining. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("conversationsDateRangeStart")
  public LocalDate getConversationsDateRangeStart() {
    return conversationsDateRangeStart;
  }

  
  @ApiModelProperty(example = "2019-12-20", value = "Date till which the conversations need to be taken for mining. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("conversationsDateRangeEnd")
  public LocalDate getConversationsDateRangeEnd() {
    return conversationsDateRangeEnd;
  }

  
  @ApiModelProperty(example = "2020-05-20T23:56:07.268", value = "Date when the mining process was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }

  
  @ApiModelProperty(example = "null", value = "Mining message if present.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  
  @ApiModelProperty(example = "null", value = "Flag to indicate whether data file to be mined was uploaded.")
  @JsonProperty("conversationDataUploaded")
  public Boolean getConversationDataUploaded() {
    return conversationDataUploaded;
  }

  
  @ApiModelProperty(example = "null", value = "Media type for filtering conversations.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  
  @ApiModelProperty(example = "null", value = "List of queue IDs for filtering conversations.")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }

  
  @ApiModelProperty(example = "2020-04-30T23:56:07.268", value = "Date when the miner started execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateTriggered")
  public Date getDateTriggered() {
    return dateTriggered;
  }

  
  @ApiModelProperty(example = "2020-04-30T23:56:07.268", value = "Date when the miner was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "Latest draft details of the miner.")
  @JsonProperty("latestDraftVersion")
  public Draft getLatestDraftVersion() {
    return latestDraftVersion;
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
    Miner miner = (Miner) o;
    return Objects.equals(this.id, miner.id) &&
        Objects.equals(this.name, miner.name) &&
        Objects.equals(this.language, miner.language) &&
        Objects.equals(this.dateCreated, miner.dateCreated) &&
        Objects.equals(this.status, miner.status) &&
        Objects.equals(this.conversationsDateRangeStart, miner.conversationsDateRangeStart) &&
        Objects.equals(this.conversationsDateRangeEnd, miner.conversationsDateRangeEnd) &&
        Objects.equals(this.dateCompleted, miner.dateCompleted) &&
        Objects.equals(this.message, miner.message) &&
        Objects.equals(this.conversationDataUploaded, miner.conversationDataUploaded) &&
        Objects.equals(this.mediaType, miner.mediaType) &&
        Objects.equals(this.queueIds, miner.queueIds) &&
        Objects.equals(this.dateTriggered, miner.dateTriggered) &&
        Objects.equals(this.dateModified, miner.dateModified) &&
        Objects.equals(this.latestDraftVersion, miner.latestDraftVersion) &&
        Objects.equals(this.selfUri, miner.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, dateCreated, status, conversationsDateRangeStart, conversationsDateRangeEnd, dateCompleted, message, conversationDataUploaded, mediaType, queueIds, dateTriggered, dateModified, latestDraftVersion, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Miner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    conversationsDateRangeStart: ").append(toIndentedString(conversationsDateRangeStart)).append("\n");
    sb.append("    conversationsDateRangeEnd: ").append(toIndentedString(conversationsDateRangeEnd)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    conversationDataUploaded: ").append(toIndentedString(conversationDataUploaded)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    dateTriggered: ").append(toIndentedString(dateTriggered)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    latestDraftVersion: ").append(toIndentedString(latestDraftVersion)).append("\n");
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

