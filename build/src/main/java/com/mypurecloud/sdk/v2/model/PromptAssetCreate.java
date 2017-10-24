package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PromptAssetCreate
 */

public class PromptAssetCreate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String promptId = null;
  private String language = null;
  private String mediaUri = null;
  private String ttsString = null;
  private String uploadStatus = null;
  private String uploadUri = null;
  private Boolean languageDefault = null;
  private Map<String, List<String>> tags = null;
  private Double durationSeconds = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public PromptAssetCreate name(String name) {
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
   **/
  public PromptAssetCreate promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("promptId")
  public String getPromptId() {
    return promptId;
  }
  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }

  
  /**
   * The prompt language.
   **/
  public PromptAssetCreate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The prompt language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public PromptAssetCreate mediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaUri")
  public String getMediaUri() {
    return mediaUri;
  }
  public void setMediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
  }

  
  /**
   **/
  public PromptAssetCreate ttsString(String ttsString) {
    this.ttsString = ttsString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ttsString")
  public String getTtsString() {
    return ttsString;
  }
  public void setTtsString(String ttsString) {
    this.ttsString = ttsString;
  }

  
  /**
   **/
  public PromptAssetCreate uploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadStatus")
  public String getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  
  /**
   **/
  public PromptAssetCreate uploadUri(String uploadUri) {
    this.uploadUri = uploadUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadUri")
  public String getUploadUri() {
    return uploadUri;
  }
  public void setUploadUri(String uploadUri) {
    this.uploadUri = uploadUri;
  }

  
  /**
   **/
  public PromptAssetCreate languageDefault(Boolean languageDefault) {
    this.languageDefault = languageDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("languageDefault")
  public Boolean getLanguageDefault() {
    return languageDefault;
  }
  public void setLanguageDefault(Boolean languageDefault) {
    this.languageDefault = languageDefault;
  }

  
  /**
   **/
  public PromptAssetCreate tags(Map<String, List<String>> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public Map<String, List<String>> getTags() {
    return tags;
  }
  public void setTags(Map<String, List<String>> tags) {
    this.tags = tags;
  }

  
  /**
   **/
  public PromptAssetCreate durationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationSeconds")
  public Double getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
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
    PromptAssetCreate promptAssetCreate = (PromptAssetCreate) o;
    return Objects.equals(this.id, promptAssetCreate.id) &&
        Objects.equals(this.name, promptAssetCreate.name) &&
        Objects.equals(this.promptId, promptAssetCreate.promptId) &&
        Objects.equals(this.language, promptAssetCreate.language) &&
        Objects.equals(this.mediaUri, promptAssetCreate.mediaUri) &&
        Objects.equals(this.ttsString, promptAssetCreate.ttsString) &&
        Objects.equals(this.uploadStatus, promptAssetCreate.uploadStatus) &&
        Objects.equals(this.uploadUri, promptAssetCreate.uploadUri) &&
        Objects.equals(this.languageDefault, promptAssetCreate.languageDefault) &&
        Objects.equals(this.tags, promptAssetCreate.tags) &&
        Objects.equals(this.durationSeconds, promptAssetCreate.durationSeconds) &&
        Objects.equals(this.selfUri, promptAssetCreate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, promptId, language, mediaUri, ttsString, uploadStatus, uploadUri, languageDefault, tags, durationSeconds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptAssetCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    ttsString: ").append(toIndentedString(ttsString)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    uploadUri: ").append(toIndentedString(uploadUri)).append("\n");
    sb.append("    languageDefault: ").append(toIndentedString(languageDefault)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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

