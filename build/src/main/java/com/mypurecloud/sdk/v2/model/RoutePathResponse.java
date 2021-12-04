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
import com.mypurecloud.sdk.v2.model.LanguageReference;
import com.mypurecloud.sdk.v2.model.QueueReference;
import com.mypurecloud.sdk.v2.model.RoutingSkillReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutePathResponse
 */

public class RoutePathResponse  implements Serializable {
  
  private QueueReference queue = null;

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
   * The media type of the given queue associated with the route path
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
  private LanguageReference language = null;
  private List<RoutingSkillReference> skills = new ArrayList<RoutingSkillReference>();

  
  /**
   * The ID of the queue associated with the route path
   **/
  public RoutePathResponse queue(QueueReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the queue associated with the route path")
  @JsonProperty("queue")
  public QueueReference getQueue() {
    return queue;
  }
  public void setQueue(QueueReference queue) {
    this.queue = queue;
  }

  
  /**
   * The media type of the given queue associated with the route path
   **/
  public RoutePathResponse mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type of the given queue associated with the route path")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * The ID of the language associated with the route path
   **/
  public RoutePathResponse language(LanguageReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the language associated with the route path")
  @JsonProperty("language")
  public LanguageReference getLanguage() {
    return language;
  }
  public void setLanguage(LanguageReference language) {
    this.language = language;
  }

  
  /**
   * The set of skills associated with the route path
   **/
  public RoutePathResponse skills(List<RoutingSkillReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of skills associated with the route path")
  @JsonProperty("skills")
  public List<RoutingSkillReference> getSkills() {
    return skills;
  }
  public void setSkills(List<RoutingSkillReference> skills) {
    this.skills = skills;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutePathResponse routePathResponse = (RoutePathResponse) o;
    return Objects.equals(this.queue, routePathResponse.queue) &&
        Objects.equals(this.mediaType, routePathResponse.mediaType) &&
        Objects.equals(this.language, routePathResponse.language) &&
        Objects.equals(this.skills, routePathResponse.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, mediaType, language, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutePathResponse {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

