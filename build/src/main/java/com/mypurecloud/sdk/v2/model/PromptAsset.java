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
 * PromptAsset
 */

public class PromptAsset  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String promptId = null;
  private String language = null;
  private String mediaUri = null;
  private String ttsString = null;
  private String text = null;

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
   * Audio upload status
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
  public PromptAsset name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Associated prompt ID")
  @JsonProperty("promptId")
  public String getPromptId() {
    return promptId;
  }

  
  @ApiModelProperty(example = "null", value = "Prompt resource language")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  
  @ApiModelProperty(example = "null", value = "URI of the resource audio")
  @JsonProperty("mediaUri")
  public String getMediaUri() {
    return mediaUri;
  }

  
  /**
   * Text to speech of the resource
   **/
  public PromptAsset ttsString(String ttsString) {
    this.ttsString = ttsString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to speech of the resource")
  @JsonProperty("ttsString")
  public String getTtsString() {
    return ttsString;
  }
  public void setTtsString(String ttsString) {
    this.ttsString = ttsString;
  }

  
  /**
   * Text of the resource
   **/
  public PromptAsset text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text of the resource")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  @ApiModelProperty(example = "null", value = "Audio upload status")
  @JsonProperty("uploadStatus")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Upload URI for the resource audio")
  @JsonProperty("uploadUri")
  public String getUploadUri() {
    return uploadUri;
  }

  
  @ApiModelProperty(example = "null", value = "Whether or not this resource locale is the default for the language")
  @JsonProperty("languageDefault")
  public Boolean getLanguageDefault() {
    return languageDefault;
  }

  
  /**
   **/
  public PromptAsset tags(Map<String, List<String>> tags) {
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
  public PromptAsset durationSeconds(Double durationSeconds) {
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
    PromptAsset promptAsset = (PromptAsset) o;
    return Objects.equals(this.id, promptAsset.id) &&
        Objects.equals(this.name, promptAsset.name) &&
        Objects.equals(this.promptId, promptAsset.promptId) &&
        Objects.equals(this.language, promptAsset.language) &&
        Objects.equals(this.mediaUri, promptAsset.mediaUri) &&
        Objects.equals(this.ttsString, promptAsset.ttsString) &&
        Objects.equals(this.text, promptAsset.text) &&
        Objects.equals(this.uploadStatus, promptAsset.uploadStatus) &&
        Objects.equals(this.uploadUri, promptAsset.uploadUri) &&
        Objects.equals(this.languageDefault, promptAsset.languageDefault) &&
        Objects.equals(this.tags, promptAsset.tags) &&
        Objects.equals(this.durationSeconds, promptAsset.durationSeconds) &&
        Objects.equals(this.selfUri, promptAsset.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, promptId, language, mediaUri, ttsString, text, uploadStatus, uploadUri, languageDefault, tags, durationSeconds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptAsset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    ttsString: ").append(toIndentedString(ttsString)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

