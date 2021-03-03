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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * An emergency flow associates a call flow to use in an emergency with the ivr(s) to route to it.
 */
@ApiModel(description = "An emergency flow associates a call flow to use in an emergency with the ivr(s) to route to it.")

public class EmergencyCallFlow  implements Serializable {
  
  private DomainEntityRef emergencyFlow = null;
  private List<DomainEntityRef> ivrs = new ArrayList<DomainEntityRef>();

  
  /**
   * The call flow to execute in an emergency.
   **/
  public EmergencyCallFlow emergencyFlow(DomainEntityRef emergencyFlow) {
    this.emergencyFlow = emergencyFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The call flow to execute in an emergency.")
  @JsonProperty("emergencyFlow")
  public DomainEntityRef getEmergencyFlow() {
    return emergencyFlow;
  }
  public void setEmergencyFlow(DomainEntityRef emergencyFlow) {
    this.emergencyFlow = emergencyFlow;
  }

  
  /**
   * The IVR(s) to route to the call flow during an emergency.
   **/
  public EmergencyCallFlow ivrs(List<DomainEntityRef> ivrs) {
    this.ivrs = ivrs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IVR(s) to route to the call flow during an emergency.")
  @JsonProperty("ivrs")
  public List<DomainEntityRef> getIvrs() {
    return ivrs;
  }
  public void setIvrs(List<DomainEntityRef> ivrs) {
    this.ivrs = ivrs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencyCallFlow emergencyCallFlow = (EmergencyCallFlow) o;
    return Objects.equals(this.emergencyFlow, emergencyCallFlow.emergencyFlow) &&
        Objects.equals(this.ivrs, emergencyCallFlow.ivrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emergencyFlow, ivrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyCallFlow {\n");
    
    sb.append("    emergencyFlow: ").append(toIndentedString(emergencyFlow)).append("\n");
    sb.append("    ivrs: ").append(toIndentedString(ivrs)).append("\n");
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

