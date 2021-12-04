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
import com.mypurecloud.sdk.v2.model.SourcePlanningGroupRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutePathRequest
 */

public class RoutePathRequest  implements Serializable {
  
  private String queueId = null;

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
   * The media type of the given queue to associate with the route path
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    CHAT("Chat"),
    EMAIL("Email"),
    CALLBACK("Callback"),
    MESSAGE("Message");

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
  private String languageId = null;
  private List<String> skillIds = new ArrayList<String>();
  private SourcePlanningGroupRequest sourcePlanningGroup = null;

  
  /**
   * The ID of the queue to associate with the route path
   **/
  public RoutePathRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "f27450c9-c1a0-451a-804c-2579b268b273", required = true, value = "The ID of the queue to associate with the route path")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The media type of the given queue to associate with the route path
   **/
  public RoutePathRequest mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "Email", required = true, value = "The media type of the given queue to associate with the route path")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * The ID of the language to associate with the route path
   **/
  public RoutePathRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "e3d65f6a-c0d2-41da-8152-82d3f075d77c", value = "The ID of the language to associate with the route path")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  
  /**
   * The set of skill IDs to associate with the route path
   **/
  public RoutePathRequest skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "[\"33d29376-4267-4968-8042-dcabdf2c1d98\"]", value = "The set of skill IDs to associate with the route path")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * The planning group from which to take route paths. This property is only needed if a route path already exists in another planning group.Note that taking a route path from another planning group will modify the other planning group
   **/
  public RoutePathRequest sourcePlanningGroup(SourcePlanningGroupRequest sourcePlanningGroup) {
    this.sourcePlanningGroup = sourcePlanningGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The planning group from which to take route paths. This property is only needed if a route path already exists in another planning group.Note that taking a route path from another planning group will modify the other planning group")
  @JsonProperty("sourcePlanningGroup")
  public SourcePlanningGroupRequest getSourcePlanningGroup() {
    return sourcePlanningGroup;
  }
  public void setSourcePlanningGroup(SourcePlanningGroupRequest sourcePlanningGroup) {
    this.sourcePlanningGroup = sourcePlanningGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutePathRequest routePathRequest = (RoutePathRequest) o;
    return Objects.equals(this.queueId, routePathRequest.queueId) &&
        Objects.equals(this.mediaType, routePathRequest.mediaType) &&
        Objects.equals(this.languageId, routePathRequest.languageId) &&
        Objects.equals(this.skillIds, routePathRequest.skillIds) &&
        Objects.equals(this.sourcePlanningGroup, routePathRequest.sourcePlanningGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, mediaType, languageId, skillIds, sourcePlanningGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutePathRequest {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    sourcePlanningGroup: ").append(toIndentedString(sourcePlanningGroup)).append("\n");
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

