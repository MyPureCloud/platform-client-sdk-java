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
 * GrammarLanguageUpdate
 */

public class GrammarLanguageUpdate  implements Serializable {
  
  private GrammarLanguageFileMetadata voiceFileMetadata = null;
  private GrammarLanguageFileMetadata dtmfFileMetadata = null;

  
  /**
   * Additional information about the associated voice file
   **/
  public GrammarLanguageUpdate voiceFileMetadata(GrammarLanguageFileMetadata voiceFileMetadata) {
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
  public GrammarLanguageUpdate dtmfFileMetadata(GrammarLanguageFileMetadata dtmfFileMetadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrammarLanguageUpdate grammarLanguageUpdate = (GrammarLanguageUpdate) o;

    return Objects.equals(this.voiceFileMetadata, grammarLanguageUpdate.voiceFileMetadata) &&
            Objects.equals(this.dtmfFileMetadata, grammarLanguageUpdate.dtmfFileMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voiceFileMetadata, dtmfFileMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrammarLanguageUpdate {\n");
    
    sb.append("    voiceFileMetadata: ").append(toIndentedString(voiceFileMetadata)).append("\n");
    sb.append("    dtmfFileMetadata: ").append(toIndentedString(dtmfFileMetadata)).append("\n");
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

