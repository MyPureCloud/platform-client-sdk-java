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
import com.mypurecloud.sdk.v2.model.BaseProgramEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ProgramInsightsSettings
 */

public class ProgramInsightsSettings  implements Serializable {
  
  private BaseProgramEntity program = null;
  private Boolean enabled = null;

  public ProgramInsightsSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the program
   **/
  public ProgramInsightsSettings program(BaseProgramEntity program) {
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
   * The program AI Insights settings
   **/
  public ProgramInsightsSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The program AI Insights settings")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramInsightsSettings programInsightsSettings = (ProgramInsightsSettings) o;

    return Objects.equals(this.program, programInsightsSettings.program) &&
            Objects.equals(this.enabled, programInsightsSettings.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(program, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramInsightsSettings {\n");
    
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

