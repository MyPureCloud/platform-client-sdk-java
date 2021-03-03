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
import com.mypurecloud.sdk.v2.model.RoleDivisionPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoleDivisionGrants
 */

public class RoleDivisionGrants  implements Serializable {
  
  private List<RoleDivisionPair> grants = new ArrayList<RoleDivisionPair>();

  
  /**
   * A list containing pairs of role and division IDs
   **/
  public RoleDivisionGrants grants(List<RoleDivisionPair> grants) {
    this.grants = grants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list containing pairs of role and division IDs")
  @JsonProperty("grants")
  public List<RoleDivisionPair> getGrants() {
    return grants;
  }
  public void setGrants(List<RoleDivisionPair> grants) {
    this.grants = grants;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDivisionGrants roleDivisionGrants = (RoleDivisionGrants) o;
    return Objects.equals(this.grants, roleDivisionGrants.grants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDivisionGrants {\n");
    
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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

