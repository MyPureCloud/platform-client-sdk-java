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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Adjacents
 */

public class Adjacents  implements Serializable {
  
  private List<User> superiors = new ArrayList<User>();
  private List<User> siblings = new ArrayList<User>();
  private List<User> directReports = new ArrayList<User>();

  
  /**
   **/
  public Adjacents superiors(List<User> superiors) {
    this.superiors = superiors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("superiors")
  public List<User> getSuperiors() {
    return superiors;
  }
  public void setSuperiors(List<User> superiors) {
    this.superiors = superiors;
  }

  
  /**
   **/
  public Adjacents siblings(List<User> siblings) {
    this.siblings = siblings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("siblings")
  public List<User> getSiblings() {
    return siblings;
  }
  public void setSiblings(List<User> siblings) {
    this.siblings = siblings;
  }

  
  /**
   **/
  public Adjacents directReports(List<User> directReports) {
    this.directReports = directReports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("directReports")
  public List<User> getDirectReports() {
    return directReports;
  }
  public void setDirectReports(List<User> directReports) {
    this.directReports = directReports;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adjacents adjacents = (Adjacents) o;
    return Objects.equals(this.superiors, adjacents.superiors) &&
        Objects.equals(this.siblings, adjacents.siblings) &&
        Objects.equals(this.directReports, adjacents.directReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superiors, siblings, directReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adjacents {\n");
    
    sb.append("    superiors: ").append(toIndentedString(superiors)).append("\n");
    sb.append("    siblings: ").append(toIndentedString(siblings)).append("\n");
    sb.append("    directReports: ").append(toIndentedString(directReports)).append("\n");
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

