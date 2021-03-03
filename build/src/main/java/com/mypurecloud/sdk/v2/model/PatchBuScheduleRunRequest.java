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
import com.mypurecloud.sdk.v2.model.PatchBuReschedulingOptionsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchBuScheduleRunRequest
 */

public class PatchBuScheduleRunRequest  implements Serializable {
  
  private PatchBuReschedulingOptionsRequest reschedulingOptions = null;

  
  /**
   * The rescheduling options to update
   **/
  public PatchBuScheduleRunRequest reschedulingOptions(PatchBuReschedulingOptionsRequest reschedulingOptions) {
    this.reschedulingOptions = reschedulingOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rescheduling options to update")
  @JsonProperty("reschedulingOptions")
  public PatchBuReschedulingOptionsRequest getReschedulingOptions() {
    return reschedulingOptions;
  }
  public void setReschedulingOptions(PatchBuReschedulingOptionsRequest reschedulingOptions) {
    this.reschedulingOptions = reschedulingOptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchBuScheduleRunRequest patchBuScheduleRunRequest = (PatchBuScheduleRunRequest) o;
    return Objects.equals(this.reschedulingOptions, patchBuScheduleRunRequest.reschedulingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reschedulingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBuScheduleRunRequest {\n");
    
    sb.append("    reschedulingOptions: ").append(toIndentedString(reschedulingOptions)).append("\n");
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

