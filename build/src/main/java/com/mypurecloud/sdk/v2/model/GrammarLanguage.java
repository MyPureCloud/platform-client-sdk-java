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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.GrammarLanguageFileMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GrammarLanguage
 */

public class GrammarLanguage  implements Serializable {
  
  private String id = null;
  private String grammarId = null;
  private String language = null;
  private String voiceFileUrl = null;
  private String dtmfFileUrl = null;
  private GrammarLanguageFileMetadata voiceFileMetadata = null;
  private GrammarLanguageFileMetadata dtmfFileMetadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public GrammarLanguage grammarId(String grammarId) {
    this.grammarId = grammarId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("grammarId")
  public String getGrammarId() {
    return grammarId;
  }
  public void setGrammarId(String grammarId) {
    this.grammarId = grammarId;
  }


  /**
   **/
  public GrammarLanguage language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @ApiModelProperty(example = "null", value = "The URL to the voice mode file associated with this grammar language")
  @JsonProperty("voiceFileUrl")
  public String getVoiceFileUrl() {
    return voiceFileUrl;
  }


  @ApiModelProperty(example = "null", value = "The URL to the DTMF mode file associated with this grammar language")
  @JsonProperty("dtmfFileUrl")
  public String getDtmfFileUrl() {
    return dtmfFileUrl;
  }


  /**
   * Additional information about the associated voice file
   **/
  public GrammarLanguage voiceFileMetadata(GrammarLanguageFileMetadata voiceFileMetadata) {
    this.voiceFileMetadata = voiceFileMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information about the associated voice file")
  @JsonProperty("voiceFileMetadata")
  public GrammarLanguageFileMetadata getVoiceFileMetadata() {
    return voiceFileMetadata;
  }
  public void setVoiceFileMetadata(GrammarLanguageFileMetadata voiceFileMetadata) {
    this.voiceFileMetadata = voiceFileMetadata;
  }


  /**
   * Additional information about the associated dtmf file
   **/
  public GrammarLanguage dtmfFileMetadata(GrammarLanguageFileMetadata dtmfFileMetadata) {
    this.dtmfFileMetadata = dtmfFileMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information about the associated dtmf file")
  @JsonProperty("dtmfFileMetadata")
  public GrammarLanguageFileMetadata getDtmfFileMetadata() {
    return dtmfFileMetadata;
  }
  public void setDtmfFileMetadata(GrammarLanguageFileMetadata dtmfFileMetadata) {
    this.dtmfFileMetadata = dtmfFileMetadata;
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
    GrammarLanguage grammarLanguage = (GrammarLanguage) o;

    return Objects.equals(this.id, grammarLanguage.id) &&
            Objects.equals(this.grammarId, grammarLanguage.grammarId) &&
            Objects.equals(this.language, grammarLanguage.language) &&
            Objects.equals(this.voiceFileUrl, grammarLanguage.voiceFileUrl) &&
            Objects.equals(this.dtmfFileUrl, grammarLanguage.dtmfFileUrl) &&
            Objects.equals(this.voiceFileMetadata, grammarLanguage.voiceFileMetadata) &&
            Objects.equals(this.dtmfFileMetadata, grammarLanguage.dtmfFileMetadata) &&
            Objects.equals(this.selfUri, grammarLanguage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grammarId, language, voiceFileUrl, dtmfFileUrl, voiceFileMetadata, dtmfFileMetadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrammarLanguage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grammarId: ").append(toIndentedString(grammarId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    voiceFileUrl: ").append(toIndentedString(voiceFileUrl)).append("\n");
    sb.append("    dtmfFileUrl: ").append(toIndentedString(dtmfFileUrl)).append("\n");
    sb.append("    voiceFileMetadata: ").append(toIndentedString(voiceFileMetadata)).append("\n");
    sb.append("    dtmfFileMetadata: ").append(toIndentedString(dtmfFileMetadata)).append("\n");
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

