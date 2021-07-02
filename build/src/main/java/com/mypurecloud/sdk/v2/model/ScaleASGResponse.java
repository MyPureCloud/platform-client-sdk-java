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
 * ScaleASGResponse
 */

public class ScaleASGResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer desiredCapacity = null;
  private Integer minSize = null;
  private Integer maxSize = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ScaleASGResponse name(String name) {
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
   * Desired capacity for the ASG
   **/
  public ScaleASGResponse desiredCapacity(Integer desiredCapacity) {
    this.desiredCapacity = desiredCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Desired capacity for the ASG")
  @JsonProperty("desiredCapacity")
  public Integer getDesiredCapacity() {
    return desiredCapacity;
  }
  public void setDesiredCapacity(Integer desiredCapacity) {
    this.desiredCapacity = desiredCapacity;
  }

  
  /**
   * Minimum size for the ASG
   **/
  public ScaleASGResponse minSize(Integer minSize) {
    this.minSize = minSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum size for the ASG")
  @JsonProperty("minSize")
  public Integer getMinSize() {
    return minSize;
  }
  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  
  /**
   * Maximum size for the ASG
   **/
  public ScaleASGResponse maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum size for the ASG")
  @JsonProperty("maxSize")
  public Integer getMaxSize() {
    return maxSize;
  }
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleASGResponse scaleASGResponse = (ScaleASGResponse) o;
    return Objects.equals(this.id, scaleASGResponse.id) &&
        Objects.equals(this.name, scaleASGResponse.name) &&
        Objects.equals(this.desiredCapacity, scaleASGResponse.desiredCapacity) &&
        Objects.equals(this.minSize, scaleASGResponse.minSize) &&
        Objects.equals(this.maxSize, scaleASGResponse.maxSize) &&
        Objects.equals(this.selfUri, scaleASGResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, desiredCapacity, minSize, maxSize, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleASGResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

