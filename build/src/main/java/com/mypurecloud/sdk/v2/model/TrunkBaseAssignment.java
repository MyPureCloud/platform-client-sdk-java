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
import com.mypurecloud.sdk.v2.model.TrunkBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkBaseAssignment
 */

public class TrunkBaseAssignment  implements Serializable {
  
  private Integer family = null;
  private TrunkBase trunkBase = null;

  
  /**
   * The address family to use with the trunk base settings. 2=IPv4, 23=IPv6
   **/
  public TrunkBaseAssignment family(Integer family) {
    this.family = family;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address family to use with the trunk base settings. 2=IPv4, 23=IPv6")
  @JsonProperty("family")
  public Integer getFamily() {
    return family;
  }
  public void setFamily(Integer family) {
    this.family = family;
  }

  
  /**
   * A trunk base settings reference.
   **/
  public TrunkBaseAssignment trunkBase(TrunkBase trunkBase) {
    this.trunkBase = trunkBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A trunk base settings reference.")
  @JsonProperty("trunkBase")
  public TrunkBase getTrunkBase() {
    return trunkBase;
  }
  public void setTrunkBase(TrunkBase trunkBase) {
    this.trunkBase = trunkBase;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkBaseAssignment trunkBaseAssignment = (TrunkBaseAssignment) o;
    return Objects.equals(this.family, trunkBaseAssignment.family) &&
        Objects.equals(this.trunkBase, trunkBaseAssignment.trunkBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, trunkBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkBaseAssignment {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    trunkBase: ").append(toIndentedString(trunkBase)).append("\n");
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

