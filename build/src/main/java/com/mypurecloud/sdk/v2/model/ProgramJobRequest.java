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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ProgramJobRequest
 */

public class ProgramJobRequest  implements Serializable {
  
  private List<String> programIds = new ArrayList<String>();

  
  /**
   * The ids of the programs used for this job
   **/
  public ProgramJobRequest programIds(List<String> programIds) {
    this.programIds = programIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of the programs used for this job")
  @JsonProperty("programIds")
  public List<String> getProgramIds() {
    return programIds;
  }
  public void setProgramIds(List<String> programIds) {
    this.programIds = programIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramJobRequest programJobRequest = (ProgramJobRequest) o;
    return Objects.equals(this.programIds, programJobRequest.programIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramJobRequest {\n");
    
    sb.append("    programIds: ").append(toIndentedString(programIds)).append("\n");
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

