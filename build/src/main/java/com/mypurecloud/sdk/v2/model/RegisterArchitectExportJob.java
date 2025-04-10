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
import com.mypurecloud.sdk.v2.model.ExportDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RegisterArchitectExportJob
 */

public class RegisterArchitectExportJob  implements Serializable {
  
  private List<ExportDetails> flows = null;

  public RegisterArchitectExportJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      flows = new ArrayList<ExportDetails>();
    }
  }

  
  /**
   * A list of the flows to be exported.
   **/
  public RegisterArchitectExportJob flows(List<ExportDetails> flows) {
    this.flows = flows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the flows to be exported.")
  @JsonProperty("flows")
  public List<ExportDetails> getFlows() {
    return flows;
  }
  public void setFlows(List<ExportDetails> flows) {
    this.flows = flows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterArchitectExportJob registerArchitectExportJob = (RegisterArchitectExportJob) o;

    return Objects.equals(this.flows, registerArchitectExportJob.flows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterArchitectExportJob {\n");
    
    sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
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

