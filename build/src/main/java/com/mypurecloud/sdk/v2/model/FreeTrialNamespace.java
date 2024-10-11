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
import com.mypurecloud.sdk.v2.model.FreeTrialLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FreeTrialNamespace
 */

public class FreeTrialNamespace  implements Serializable {
  
  private String name = null;
  private String friendlyName = null;
  private List<FreeTrialLimit> limits = new ArrayList<FreeTrialLimit>();

  
  /**
   **/
  public FreeTrialNamespace name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public FreeTrialNamespace friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  /**
   **/
  public FreeTrialNamespace limits(List<FreeTrialLimit> limits) {
    this.limits = limits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limits")
  public List<FreeTrialLimit> getLimits() {
    return limits;
  }
  public void setLimits(List<FreeTrialLimit> limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTrialNamespace freeTrialNamespace = (FreeTrialNamespace) o;

    return Objects.equals(this.name, freeTrialNamespace.name) &&
            Objects.equals(this.friendlyName, freeTrialNamespace.friendlyName) &&
            Objects.equals(this.limits, freeTrialNamespace.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, friendlyName, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTrialNamespace {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

