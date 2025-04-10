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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.BaseProgramEntity;
import com.mypurecloud.sdk.v2.model.ProgramTranscriptionEngine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ProgramTranscriptionEngines
 */

public class ProgramTranscriptionEngines  implements Serializable {
  
  private String id = null;
  private BaseProgramEntity program = null;
  private List<ProgramTranscriptionEngine> transcriptionEngines = null;
  private AddressableEntityRef modifiedBy = null;
  private Date dateModified = null;
  private String selfUri = null;

  public ProgramTranscriptionEngines() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      transcriptionEngines = new ArrayList<ProgramTranscriptionEngine>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The ID of the program
   **/
  public ProgramTranscriptionEngines program(BaseProgramEntity program) {
    this.program = program;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the program")
  @JsonProperty("program")
  public BaseProgramEntity getProgram() {
    return program;
  }
  public void setProgram(BaseProgramEntity program) {
    this.program = program;
  }


  /**
   * The program transcription engine settings
   **/
  public ProgramTranscriptionEngines transcriptionEngines(List<ProgramTranscriptionEngine> transcriptionEngines) {
    this.transcriptionEngines = transcriptionEngines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The program transcription engine settings")
  @JsonProperty("transcriptionEngines")
  public List<ProgramTranscriptionEngine> getTranscriptionEngines() {
    return transcriptionEngines;
  }
  public void setTranscriptionEngines(List<ProgramTranscriptionEngine> transcriptionEngines) {
    this.transcriptionEngines = transcriptionEngines;
  }


  /**
   * The user last modified the record
   **/
  public ProgramTranscriptionEngines modifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user last modified the record")
  @JsonProperty("modifiedBy")
  public AddressableEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The last modified date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ProgramTranscriptionEngines dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last modified date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
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
    ProgramTranscriptionEngines programTranscriptionEngines = (ProgramTranscriptionEngines) o;

    return Objects.equals(this.id, programTranscriptionEngines.id) &&
            Objects.equals(this.program, programTranscriptionEngines.program) &&
            Objects.equals(this.transcriptionEngines, programTranscriptionEngines.transcriptionEngines) &&
            Objects.equals(this.modifiedBy, programTranscriptionEngines.modifiedBy) &&
            Objects.equals(this.dateModified, programTranscriptionEngines.dateModified) &&
            Objects.equals(this.selfUri, programTranscriptionEngines.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, program, transcriptionEngines, modifiedBy, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramTranscriptionEngines {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    transcriptionEngines: ").append(toIndentedString(transcriptionEngines)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

