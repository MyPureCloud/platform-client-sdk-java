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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ObjectiveZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DefaultObjective
 */

public class DefaultObjective  implements Serializable {
  
  private String id = null;
  private String templateId = null;
  private List<ObjectiveZone> zones = new ArrayList<ObjectiveZone>();
  private Boolean enabled = null;

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    CALLBACK("callback"),
    CHAT("chat"),
    COBROWSE("cobrowse"),
    EMAIL("email"),
    MESSAGE("message"),
    SCREENSHARE("screenshare"),
    UNKNOWN("unknown"),
    VIDEO("video"),
    VOICE("voice");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private List<AddressableEntityRef> queues = new ArrayList<AddressableEntityRef>();
  private List<AddressableEntityRef> topics = new ArrayList<AddressableEntityRef>();

  private static class TopicIdsFilterTypeEnumDeserializer extends StdDeserializer<TopicIdsFilterTypeEnum> {
    public TopicIdsFilterTypeEnumDeserializer() {
      super(TopicIdsFilterTypeEnumDeserializer.class);
    }

    @Override
    public TopicIdsFilterTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TopicIdsFilterTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * A filter type for topic Ids. It's only used for objectives with topicIds. Default filter behavior is \"or\".
   */
 @JsonDeserialize(using = TopicIdsFilterTypeEnumDeserializer.class)
  public enum TopicIdsFilterTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("and"),
    OR("or");

    private String value;

    TopicIdsFilterTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TopicIdsFilterTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TopicIdsFilterTypeEnum value : TopicIdsFilterTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TopicIdsFilterTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TopicIdsFilterTypeEnum topicIdsFilterType = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The id of this objective's base template
   **/
  public DefaultObjective templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of this objective's base template")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * Objective zone specifies min,max points and values for the associated metric
   **/
  public DefaultObjective zones(List<ObjectiveZone> zones) {
    this.zones = zones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Objective zone specifies min,max points and values for the associated metric")
  @JsonProperty("zones")
  public List<ObjectiveZone> getZones() {
    return zones;
  }
  public void setZones(List<ObjectiveZone> zones) {
    this.zones = zones;
  }

  
  /**
   * A flag for whether this objective is enabled for the related metric
   **/
  public DefaultObjective enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A flag for whether this objective is enabled for the related metric")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * A list of media types for the metric
   **/
  public DefaultObjective mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of media types for the metric")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   * A list of queues for the metric
   **/
  public DefaultObjective queues(List<AddressableEntityRef> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of queues for the metric")
  @JsonProperty("queues")
  public List<AddressableEntityRef> getQueues() {
    return queues;
  }
  public void setQueues(List<AddressableEntityRef> queues) {
    this.queues = queues;
  }

  
  /**
   * A list of topic ids for detected topic metrics
   **/
  public DefaultObjective topics(List<AddressableEntityRef> topics) {
    this.topics = topics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of topic ids for detected topic metrics")
  @JsonProperty("topics")
  public List<AddressableEntityRef> getTopics() {
    return topics;
  }
  public void setTopics(List<AddressableEntityRef> topics) {
    this.topics = topics;
  }

  
  /**
   * A filter type for topic Ids. It's only used for objectives with topicIds. Default filter behavior is \"or\".
   **/
  public DefaultObjective topicIdsFilterType(TopicIdsFilterTypeEnum topicIdsFilterType) {
    this.topicIdsFilterType = topicIdsFilterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A filter type for topic Ids. It's only used for objectives with topicIds. Default filter behavior is \"or\".")
  @JsonProperty("topicIdsFilterType")
  public TopicIdsFilterTypeEnum getTopicIdsFilterType() {
    return topicIdsFilterType;
  }
  public void setTopicIdsFilterType(TopicIdsFilterTypeEnum topicIdsFilterType) {
    this.topicIdsFilterType = topicIdsFilterType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultObjective defaultObjective = (DefaultObjective) o;
    return Objects.equals(this.id, defaultObjective.id) &&
        Objects.equals(this.templateId, defaultObjective.templateId) &&
        Objects.equals(this.zones, defaultObjective.zones) &&
        Objects.equals(this.enabled, defaultObjective.enabled) &&
        Objects.equals(this.mediaTypes, defaultObjective.mediaTypes) &&
        Objects.equals(this.queues, defaultObjective.queues) &&
        Objects.equals(this.topics, defaultObjective.topics) &&
        Objects.equals(this.topicIdsFilterType, defaultObjective.topicIdsFilterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, zones, enabled, mediaTypes, queues, topics, topicIdsFilterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultObjective {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    topicIdsFilterType: ").append(toIndentedString(topicIdsFilterType)).append("\n");
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

