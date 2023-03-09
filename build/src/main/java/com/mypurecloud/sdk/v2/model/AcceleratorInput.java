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
import com.mypurecloud.sdk.v2.model.AcceleratorParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Identity of a CX infrastructure as code accelerator to be run and its inputs
 */
@ApiModel(description = "Identity of a CX infrastructure as code accelerator to be run and its inputs")

public class AcceleratorInput  implements Serializable {
  
  private Boolean dryRun = null;
  private String acceleratorId = null;
  private List<AcceleratorParameter> parameters = new ArrayList<AcceleratorParameter>();

  
  /**
   * Set this true to test the job without making any changes. Defaults to false.
   **/
  public AcceleratorInput dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set this true to test the job without making any changes. Defaults to false.")
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  /**
   * Accelerator ID
   **/
  public AcceleratorInput acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Accelerator ID")
  @JsonProperty("acceleratorId")
  public String getAcceleratorId() {
    return acceleratorId;
  }
  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }


  /**
   * Parameters required for this accelerator
   **/
  public AcceleratorInput parameters(List<AcceleratorParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters required for this accelerator")
  @JsonProperty("parameters")
  public List<AcceleratorParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<AcceleratorParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceleratorInput acceleratorInput = (AcceleratorInput) o;

    return Objects.equals(this.dryRun, acceleratorInput.dryRun) &&
            Objects.equals(this.acceleratorId, acceleratorInput.acceleratorId) &&
            Objects.equals(this.parameters, acceleratorInput.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, acceleratorId, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceleratorInput {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

