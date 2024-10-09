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
import com.mypurecloud.sdk.v2.model.TranscriptTranslation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CommunicationTranslation
 */

public class CommunicationTranslation  implements Serializable {
  
  private String communicationId = null;
  private List<TranscriptTranslation> transcripts = new ArrayList<TranscriptTranslation>();

  
  /**
   * Communication Id
   **/
  public CommunicationTranslation communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Communication Id")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * List of translated transcripts
   **/
  public CommunicationTranslation transcripts(List<TranscriptTranslation> transcripts) {
    this.transcripts = transcripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of translated transcripts")
  @JsonProperty("transcripts")
  public List<TranscriptTranslation> getTranscripts() {
    return transcripts;
  }
  public void setTranscripts(List<TranscriptTranslation> transcripts) {
    this.transcripts = transcripts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationTranslation communicationTranslation = (CommunicationTranslation) o;

    return Objects.equals(this.communicationId, communicationTranslation.communicationId) &&
            Objects.equals(this.transcripts, communicationTranslation.transcripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationId, transcripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationTranslation {\n");
    
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    transcripts: ").append(toIndentedString(transcripts)).append("\n");
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

