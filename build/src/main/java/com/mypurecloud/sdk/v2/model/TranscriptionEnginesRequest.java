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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ProgramTranscriptionEngine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionEnginesRequest
 */

public class TranscriptionEnginesRequest  implements Serializable {
  
  private List<ProgramTranscriptionEngine> transcriptionEngines = null;

  public TranscriptionEnginesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      transcriptionEngines = new ArrayList<ProgramTranscriptionEngine>();
    }
  }

  
  /**
   * The transcription engine setting
   **/
  public TranscriptionEnginesRequest transcriptionEngines(List<ProgramTranscriptionEngine> transcriptionEngines) {
    this.transcriptionEngines = transcriptionEngines;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transcription engine setting")
  @JsonProperty("transcriptionEngines")
  public List<ProgramTranscriptionEngine> getTranscriptionEngines() {
    return transcriptionEngines;
  }
  public void setTranscriptionEngines(List<ProgramTranscriptionEngine> transcriptionEngines) {
    this.transcriptionEngines = transcriptionEngines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionEnginesRequest transcriptionEnginesRequest = (TranscriptionEnginesRequest) o;

    return Objects.equals(this.transcriptionEngines, transcriptionEnginesRequest.transcriptionEngines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcriptionEngines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionEnginesRequest {\n");
    
    sb.append("    transcriptionEngines: ").append(toIndentedString(transcriptionEngines)).append("\n");
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

