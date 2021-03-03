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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * SystemPromptAsset
 */

public class SystemPromptAsset  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String promptId = null;
  private String language = null;
  private Double durationSeconds = null;
  private String mediaUri = null;
  private String ttsString = null;
  private String text = null;
  private String uploadUri = null;

  private static class UploadStatusEnumDeserializer extends StdDeserializer<UploadStatusEnum> {
    public UploadStatusEnumDeserializer() {
      super(UploadStatusEnumDeserializer.class);
    }

    @Override
    public UploadStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UploadStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets uploadStatus
   */
 @JsonDeserialize(using = UploadStatusEnumDeserializer.class)
  public enum UploadStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("created"),
    UPLOADED("uploaded"),
    TRANSCODED("transcoded"),
    TRANSCODEFAILED("transcodeFailed");

    private String value;

    UploadStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadStatusEnum fromString(String key) {
      if (key == null) return null;

      for (UploadStatusEnum value : UploadStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadStatusEnum uploadStatus = null;
  private Boolean hasDefault = null;
  private Boolean languageDefault = null;
  private Map<String, List<String>> tags = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SystemPromptAsset name(String name) {
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
  public SystemPromptAsset promptId(String promptId) {
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
   * The asset resource language
   **/
  public SystemPromptAsset language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The asset resource language")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public SystemPromptAsset durationSeconds(Double durationSeconds) {
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

  
  /**
   **/
  public SystemPromptAsset mediaUri(String mediaUri) {
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
  public SystemPromptAsset ttsString(String ttsString) {
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
  public SystemPromptAsset text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public SystemPromptAsset uploadUri(String uploadUri) {
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
  public SystemPromptAsset uploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadStatus")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  
  /**
   **/
  public SystemPromptAsset hasDefault(Boolean hasDefault) {
    this.hasDefault = hasDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasDefault")
  public Boolean getHasDefault() {
    return hasDefault;
  }
  public void setHasDefault(Boolean hasDefault) {
    this.hasDefault = hasDefault;
  }

  
  /**
   **/
  public SystemPromptAsset languageDefault(Boolean languageDefault) {
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
  public SystemPromptAsset tags(Map<String, List<String>> tags) {
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
    SystemPromptAsset systemPromptAsset = (SystemPromptAsset) o;
    return Objects.equals(this.id, systemPromptAsset.id) &&
        Objects.equals(this.name, systemPromptAsset.name) &&
        Objects.equals(this.promptId, systemPromptAsset.promptId) &&
        Objects.equals(this.language, systemPromptAsset.language) &&
        Objects.equals(this.durationSeconds, systemPromptAsset.durationSeconds) &&
        Objects.equals(this.mediaUri, systemPromptAsset.mediaUri) &&
        Objects.equals(this.ttsString, systemPromptAsset.ttsString) &&
        Objects.equals(this.text, systemPromptAsset.text) &&
        Objects.equals(this.uploadUri, systemPromptAsset.uploadUri) &&
        Objects.equals(this.uploadStatus, systemPromptAsset.uploadStatus) &&
        Objects.equals(this.hasDefault, systemPromptAsset.hasDefault) &&
        Objects.equals(this.languageDefault, systemPromptAsset.languageDefault) &&
        Objects.equals(this.tags, systemPromptAsset.tags) &&
        Objects.equals(this.selfUri, systemPromptAsset.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, promptId, language, durationSeconds, mediaUri, ttsString, text, uploadUri, uploadStatus, hasDefault, languageDefault, tags, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemPromptAsset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    ttsString: ").append(toIndentedString(ttsString)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uploadUri: ").append(toIndentedString(uploadUri)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    hasDefault: ").append(toIndentedString(hasDefault)).append("\n");
    sb.append("    languageDefault: ").append(toIndentedString(languageDefault)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

