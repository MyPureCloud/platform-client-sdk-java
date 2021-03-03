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
import com.mypurecloud.sdk.v2.model.ArchiveRetention;
import com.mypurecloud.sdk.v2.model.DeleteRetention;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InitiateScreenRecording
 */

public class InitiateScreenRecording  implements Serializable {
  
  private Boolean recordACW = null;
  private ArchiveRetention archiveRetention = null;
  private DeleteRetention deleteRetention = null;

  
  /**
   **/
  public InitiateScreenRecording recordACW(Boolean recordACW) {
    this.recordACW = recordACW;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordACW")
  public Boolean getRecordACW() {
    return recordACW;
  }
  public void setRecordACW(Boolean recordACW) {
    this.recordACW = recordACW;
  }

  
  /**
   **/
  public InitiateScreenRecording archiveRetention(ArchiveRetention archiveRetention) {
    this.archiveRetention = archiveRetention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("archiveRetention")
  public ArchiveRetention getArchiveRetention() {
    return archiveRetention;
  }
  public void setArchiveRetention(ArchiveRetention archiveRetention) {
    this.archiveRetention = archiveRetention;
  }

  
  /**
   **/
  public InitiateScreenRecording deleteRetention(DeleteRetention deleteRetention) {
    this.deleteRetention = deleteRetention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deleteRetention")
  public DeleteRetention getDeleteRetention() {
    return deleteRetention;
  }
  public void setDeleteRetention(DeleteRetention deleteRetention) {
    this.deleteRetention = deleteRetention;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateScreenRecording initiateScreenRecording = (InitiateScreenRecording) o;
    return Objects.equals(this.recordACW, initiateScreenRecording.recordACW) &&
        Objects.equals(this.archiveRetention, initiateScreenRecording.archiveRetention) &&
        Objects.equals(this.deleteRetention, initiateScreenRecording.deleteRetention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordACW, archiveRetention, deleteRetention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateScreenRecording {\n");
    
    sb.append("    recordACW: ").append(toIndentedString(recordACW)).append("\n");
    sb.append("    archiveRetention: ").append(toIndentedString(archiveRetention)).append("\n");
    sb.append("    deleteRetention: ").append(toIndentedString(deleteRetention)).append("\n");
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

