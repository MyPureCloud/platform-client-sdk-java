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
import com.mypurecloud.sdk.v2.model.ObjectiveZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateObjective
 */

public class CreateObjective  implements Serializable {
  
  private String id = null;
  private String templateId = null;
  private List<ObjectiveZone> zones = null;
  private Boolean enabled = null;
  private List<String> topicIds = null;

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
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALLBACK("callback"),
    CHAT("chat"),
    COBROWSE("cobrowse"),
    EMAIL("email"),
    INTERNALMESSAGE("internalmessage"),
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
  private List<MediaTypesEnum> mediaTypes = null;
  private List<String> queueIds = null;

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
  private List<String> evaluationFormContextIds = null;

  private static class InitialDirectionEnumDeserializer extends StdDeserializer<InitialDirectionEnum> {
    public InitialDirectionEnumDeserializer() {
      super(InitialDirectionEnumDeserializer.class);
    }

    @Override
    public InitialDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InitialDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The initial direction to filter on
   */
 @JsonDeserialize(using = InitialDirectionEnumDeserializer.class)
  public enum InitialDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    InitialDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InitialDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (InitialDirectionEnum value : InitialDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InitialDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InitialDirectionEnum initialDirection = null;
  private LocalDate dateStart = null;

  public CreateObjective() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      zones = new ArrayList<ObjectiveZone>();
      topicIds = new ArrayList<String>();
      mediaTypes = new ArrayList<MediaTypesEnum>();
      queueIds = new ArrayList<String>();
      evaluationFormContextIds = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The id of this objective's base template
   **/
  public CreateObjective templateId(String templateId) {
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
  public CreateObjective zones(List<ObjectiveZone> zones) {
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
  public CreateObjective enabled(Boolean enabled) {
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
   * A list of topic ids for detected topic metrics
   **/
  public CreateObjective topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of topic ids for detected topic metrics")
  @JsonProperty("topicIds")
  public List<String> getTopicIds() {
    return topicIds;
  }
  public void setTopicIds(List<String> topicIds) {
    this.topicIds = topicIds;
  }


  /**
   * A list of media types for the metric
   **/
  public CreateObjective mediaTypes(List<MediaTypesEnum> mediaTypes) {
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
   * A list of queue ids for the metric
   **/
  public CreateObjective queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of queue ids for the metric")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  /**
   * A filter type for topic Ids. It's only used for objectives with topicIds. Default filter behavior is \"or\".
   **/
  public CreateObjective topicIdsFilterType(TopicIdsFilterTypeEnum topicIdsFilterType) {
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


  /**
   * The ids of associated evaluation form context, for Quality Evaluation Score metrics
   **/
  public CreateObjective evaluationFormContextIds(List<String> evaluationFormContextIds) {
    this.evaluationFormContextIds = evaluationFormContextIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ids of associated evaluation form context, for Quality Evaluation Score metrics")
  @JsonProperty("evaluationFormContextIds")
  public List<String> getEvaluationFormContextIds() {
    return evaluationFormContextIds;
  }
  public void setEvaluationFormContextIds(List<String> evaluationFormContextIds) {
    this.evaluationFormContextIds = evaluationFormContextIds;
  }


  /**
   * The initial direction to filter on
   **/
  public CreateObjective initialDirection(InitialDirectionEnum initialDirection) {
    this.initialDirection = initialDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The initial direction to filter on")
  @JsonProperty("initialDirection")
  public InitialDirectionEnum getInitialDirection() {
    return initialDirection;
  }
  public void setInitialDirection(InitialDirectionEnum initialDirection) {
    this.initialDirection = initialDirection;
  }


  /**
   * start date of the objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CreateObjective dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "start date of the objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateObjective createObjective = (CreateObjective) o;

    return Objects.equals(this.id, createObjective.id) &&
            Objects.equals(this.templateId, createObjective.templateId) &&
            Objects.equals(this.zones, createObjective.zones) &&
            Objects.equals(this.enabled, createObjective.enabled) &&
            Objects.equals(this.topicIds, createObjective.topicIds) &&
            Objects.equals(this.mediaTypes, createObjective.mediaTypes) &&
            Objects.equals(this.queueIds, createObjective.queueIds) &&
            Objects.equals(this.topicIdsFilterType, createObjective.topicIdsFilterType) &&
            Objects.equals(this.evaluationFormContextIds, createObjective.evaluationFormContextIds) &&
            Objects.equals(this.initialDirection, createObjective.initialDirection) &&
            Objects.equals(this.dateStart, createObjective.dateStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, zones, enabled, topicIds, mediaTypes, queueIds, topicIdsFilterType, evaluationFormContextIds, initialDirection, dateStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateObjective {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    topicIdsFilterType: ").append(toIndentedString(topicIdsFilterType)).append("\n");
    sb.append("    evaluationFormContextIds: ").append(toIndentedString(evaluationFormContextIds)).append("\n");
    sb.append("    initialDirection: ").append(toIndentedString(initialDirection)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
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

