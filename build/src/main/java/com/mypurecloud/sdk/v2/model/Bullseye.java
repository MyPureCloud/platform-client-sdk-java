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
import com.mypurecloud.sdk.v2.model.Ring;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Bullseye
 */

public class Bullseye  implements Serializable {
  
  private List<Ring> rings = new ArrayList<Ring>();

  
  /**
   * The bullseye rings configured for this queue.
   **/
  public Bullseye rings(List<Ring> rings) {
    this.rings = rings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bullseye rings configured for this queue.")
  @JsonProperty("rings")
  public List<Ring> getRings() {
    return rings;
  }
  public void setRings(List<Ring> rings) {
    this.rings = rings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bullseye bullseye = (Bullseye) o;
    return Objects.equals(this.rings, bullseye.rings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bullseye {\n");
    
    sb.append("    rings: ").append(toIndentedString(rings)).append("\n");
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

