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

import java.io.Serializable;
/**
 * PredictiveRouting
 */

public class PredictiveRouting  implements Serializable {
  
  private Boolean respectSkills = null;

  
  /**
   * A switch used to determine if agent skills will be considered.
   **/
  public PredictiveRouting respectSkills(Boolean respectSkills) {
    this.respectSkills = respectSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A switch used to determine if agent skills will be considered.")
  @JsonProperty("respectSkills")
  public Boolean getRespectSkills() {
    return respectSkills;
  }
  public void setRespectSkills(Boolean respectSkills) {
    this.respectSkills = respectSkills;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictiveRouting predictiveRouting = (PredictiveRouting) o;
    return Objects.equals(this.respectSkills, predictiveRouting.respectSkills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(respectSkills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictiveRouting {\n");
    
    sb.append("    respectSkills: ").append(toIndentedString(respectSkills)).append("\n");
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

