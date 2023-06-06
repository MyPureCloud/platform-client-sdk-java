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
import com.mypurecloud.sdk.v2.model.AdjustableLiveSpeakerDetection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DispositionParameters
 */

public class DispositionParameters  implements Serializable {
  
  private AdjustableLiveSpeakerDetection adjustableLiveSpeakerDetection = null;

  
  /**
   * ALSD evaluation inputs and output (isPersonalLikely) of the ALSD detector the last time it ran on the call (could be multiple times)
   **/
  public DispositionParameters adjustableLiveSpeakerDetection(AdjustableLiveSpeakerDetection adjustableLiveSpeakerDetection) {
    this.adjustableLiveSpeakerDetection = adjustableLiveSpeakerDetection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ALSD evaluation inputs and output (isPersonalLikely) of the ALSD detector the last time it ran on the call (could be multiple times)")
  @JsonProperty("adjustableLiveSpeakerDetection")
  public AdjustableLiveSpeakerDetection getAdjustableLiveSpeakerDetection() {
    return adjustableLiveSpeakerDetection;
  }
  public void setAdjustableLiveSpeakerDetection(AdjustableLiveSpeakerDetection adjustableLiveSpeakerDetection) {
    this.adjustableLiveSpeakerDetection = adjustableLiveSpeakerDetection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispositionParameters dispositionParameters = (DispositionParameters) o;

    return Objects.equals(this.adjustableLiveSpeakerDetection, dispositionParameters.adjustableLiveSpeakerDetection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustableLiveSpeakerDetection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositionParameters {\n");
    
    sb.append("    adjustableLiveSpeakerDetection: ").append(toIndentedString(adjustableLiveSpeakerDetection)).append("\n");
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

