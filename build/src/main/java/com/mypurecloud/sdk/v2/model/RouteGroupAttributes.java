package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
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
 * Attributes for the associated route group
 */
@ApiModel(description = "Attributes for the associated route group")

public class RouteGroupAttributes  implements Serializable {
  
  private QueueReference queue = null;

  /**
   * The media type to which the associated route group applies
   */
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
   * The queue to which the associated route group applies
   **/
  public RouteGroupAttributes queue(QueueReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The queue to which the associated route group applies")
  @JsonProperty("queue")
  public QueueReference getQueue() {
    return queue;
  }
  public void setQueue(QueueReference queue) {
    this.queue = queue;
  }

  
  /**
   * The media type to which the associated route group applies
   **/
  public RouteGroupAttributes mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The media type to which the associated route group applies")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * The language to which the associated route group applies
   **/
  public RouteGroupAttributes language(LanguageReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language to which the associated route group applies")
  @JsonProperty("language")
  public LanguageReference getLanguage() {
    return language;
  }
  public void setLanguage(LanguageReference language) {
    this.language = language;
  }

  
  /**
   * The skill set to which the associated route group applies
   **/
  public RouteGroupAttributes skills(List<RoutingSkillReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill set to which the associated route group applies")
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
    RouteGroupAttributes routeGroupAttributes = (RouteGroupAttributes) o;
    return Objects.equals(this.queue, routeGroupAttributes.queue) &&
        Objects.equals(this.mediaType, routeGroupAttributes.mediaType) &&
        Objects.equals(this.language, routeGroupAttributes.language) &&
        Objects.equals(this.skills, routeGroupAttributes.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, mediaType, language, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteGroupAttributes {\n");
    
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

