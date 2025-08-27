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
import com.mypurecloud.sdk.v2.model.TopicCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdditionalMatchCriteria
 */

public class AdditionalMatchCriteria  implements Serializable {
  
  private List<TopicCriteria> topics = null;

  private static class MediaFilterEnumDeserializer extends StdDeserializer<MediaFilterEnum> {
    public MediaFilterEnumDeserializer() {
      super(MediaFilterEnumDeserializer.class);
    }

    @Override
    public MediaFilterEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaFilterEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Escalate message based on media presence. Not setting any value will escalate all types of msg.
   */
 @JsonDeserialize(using = MediaFilterEnumDeserializer.class)
  public enum MediaFilterEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WITHMEDIA("WithMedia"),
    WITHOUTMEDIA("WithoutMedia");

    private String value;

    MediaFilterEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaFilterEnum fromString(String key) {
      if (key == null) return null;

      for (MediaFilterEnum value : MediaFilterEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaFilterEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaFilterEnum mediaFilter = null;

  public AdditionalMatchCriteria() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      topics = new ArrayList<TopicCriteria>();
    }
  }

  
  /**
   * List of topics with specific data ingestion rules to filter messages for escalation.
   **/
  public AdditionalMatchCriteria topics(List<TopicCriteria> topics) {
    this.topics = topics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of topics with specific data ingestion rules to filter messages for escalation.")
  @JsonProperty("topics")
  public List<TopicCriteria> getTopics() {
    return topics;
  }
  public void setTopics(List<TopicCriteria> topics) {
    this.topics = topics;
  }


  /**
   * Escalate message based on media presence. Not setting any value will escalate all types of msg.
   **/
  public AdditionalMatchCriteria mediaFilter(MediaFilterEnum mediaFilter) {
    this.mediaFilter = mediaFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Escalate message based on media presence. Not setting any value will escalate all types of msg.")
  @JsonProperty("mediaFilter")
  public MediaFilterEnum getMediaFilter() {
    return mediaFilter;
  }
  public void setMediaFilter(MediaFilterEnum mediaFilter) {
    this.mediaFilter = mediaFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalMatchCriteria additionalMatchCriteria = (AdditionalMatchCriteria) o;

    return Objects.equals(this.topics, additionalMatchCriteria.topics) &&
            Objects.equals(this.mediaFilter, additionalMatchCriteria.mediaFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topics, mediaFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalMatchCriteria {\n");
    
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    mediaFilter: ").append(toIndentedString(mediaFilter)).append("\n");
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

