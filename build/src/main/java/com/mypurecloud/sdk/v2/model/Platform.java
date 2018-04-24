package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents the supported platforms for an AppFoundry listing
 */
@ApiModel(description = "Represents the supported platforms for an AppFoundry listing")

public class Platform  implements Serializable {
  
  private String name = null;
  private List<String> subcategories = new ArrayList<String>();

  
  /**
   * Name of the platform
   **/
  public Platform name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the platform")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Platform subcategories, eg, on-prem or cloud
   **/
  public Platform subcategories(List<String> subcategories) {
    this.subcategories = subcategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Platform subcategories, eg, on-prem or cloud")
  @JsonProperty("subcategories")
  public List<String> getSubcategories() {
    return subcategories;
  }
  public void setSubcategories(List<String> subcategories) {
    this.subcategories = subcategories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.name, platform.name) &&
        Objects.equals(this.subcategories, platform.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subcategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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

