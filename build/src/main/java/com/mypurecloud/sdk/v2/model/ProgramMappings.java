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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.BaseProgramEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ProgramMappings
 */

public class ProgramMappings  implements Serializable {
  
  private BaseProgramEntity program = null;
  private List<AddressableEntityRef> queues = new ArrayList<AddressableEntityRef>();
  private List<AddressableEntityRef> flows = new ArrayList<AddressableEntityRef>();
  private AddressableEntityRef modifiedBy = null;
  private Date dateModified = null;

  
  /**
   **/
  public ProgramMappings program(BaseProgramEntity program) {
    this.program = program;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("program")
  public BaseProgramEntity getProgram() {
    return program;
  }
  public void setProgram(BaseProgramEntity program) {
    this.program = program;
  }

  
  /**
   **/
  public ProgramMappings queues(List<AddressableEntityRef> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queues")
  public List<AddressableEntityRef> getQueues() {
    return queues;
  }
  public void setQueues(List<AddressableEntityRef> queues) {
    this.queues = queues;
  }

  
  /**
   **/
  public ProgramMappings flows(List<AddressableEntityRef> flows) {
    this.flows = flows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flows")
  public List<AddressableEntityRef> getFlows() {
    return flows;
  }
  public void setFlows(List<AddressableEntityRef> flows) {
    this.flows = flows;
  }

  
  /**
   **/
  public ProgramMappings modifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public AddressableEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ProgramMappings dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramMappings programMappings = (ProgramMappings) o;
    return Objects.equals(this.program, programMappings.program) &&
        Objects.equals(this.queues, programMappings.queues) &&
        Objects.equals(this.flows, programMappings.flows) &&
        Objects.equals(this.modifiedBy, programMappings.modifiedBy) &&
        Objects.equals(this.dateModified, programMappings.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(program, queues, flows, modifiedBy, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramMappings {\n");
    
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

