package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LanguageReference;
import com.mypurecloud.sdk.v2.model.QueueReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmForecastModificationAttributes
 */

public class WfmForecastModificationAttributes  implements Serializable {
  
  private List<QueueReference> queues = new ArrayList<QueueReference>();

  /**
   * Gets or Sets mediaTypes
   */
  public enum MediaTypesEnum {
    VOICE("Voice"),
    CHAT("Chat"),
    EMAIL("Email"),
    CALLBACK("Callback"),
    MESSAGE("Message");

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
  private List<LanguageReference> languages = new ArrayList<LanguageReference>();
  private List<List<RoutingSkillReference>> skillSets = new ArrayList<List<RoutingSkillReference>>();

  
  /**
   * The queues to which to apply a modification
   **/
  public WfmForecastModificationAttributes queues(List<QueueReference> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queues to which to apply a modification")
  @JsonProperty("queues")
  public List<QueueReference> getQueues() {
    return queues;
  }
  public void setQueues(List<QueueReference> queues) {
    this.queues = queues;
  }

  
  /**
   * The media types to which to apply a modification
   **/
  public WfmForecastModificationAttributes mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media types to which to apply a modification")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   * The languages to which to apply a modification
   **/
  public WfmForecastModificationAttributes languages(List<LanguageReference> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The languages to which to apply a modification")
  @JsonProperty("languages")
  public List<LanguageReference> getLanguages() {
    return languages;
  }
  public void setLanguages(List<LanguageReference> languages) {
    this.languages = languages;
  }

  
  /**
   * The skill sets to which to apply a modification
   **/
  public WfmForecastModificationAttributes skillSets(List<List<RoutingSkillReference>> skillSets) {
    this.skillSets = skillSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill sets to which to apply a modification")
  @JsonProperty("skillSets")
  public List<List<RoutingSkillReference>> getSkillSets() {
    return skillSets;
  }
  public void setSkillSets(List<List<RoutingSkillReference>> skillSets) {
    this.skillSets = skillSets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmForecastModificationAttributes wfmForecastModificationAttributes = (WfmForecastModificationAttributes) o;
    return Objects.equals(this.queues, wfmForecastModificationAttributes.queues) &&
        Objects.equals(this.mediaTypes, wfmForecastModificationAttributes.mediaTypes) &&
        Objects.equals(this.languages, wfmForecastModificationAttributes.languages) &&
        Objects.equals(this.skillSets, wfmForecastModificationAttributes.skillSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queues, mediaTypes, languages, skillSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmForecastModificationAttributes {\n");
    
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    skillSets: ").append(toIndentedString(skillSets)).append("\n");
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

