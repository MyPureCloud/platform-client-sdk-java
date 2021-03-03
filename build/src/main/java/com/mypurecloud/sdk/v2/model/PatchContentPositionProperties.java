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
 * PatchContentPositionProperties
 */

public class PatchContentPositionProperties  implements Serializable {
  
  private String top = null;
  private String bottom = null;
  private String left = null;
  private String right = null;

  
  /**
   * Top positioning offset.
   **/
  public PatchContentPositionProperties top(String top) {
    this.top = top;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Top positioning offset.")
  @JsonProperty("top")
  public String getTop() {
    return top;
  }
  public void setTop(String top) {
    this.top = top;
  }

  
  /**
   * Bottom positioning offset.
   **/
  public PatchContentPositionProperties bottom(String bottom) {
    this.bottom = bottom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bottom positioning offset.")
  @JsonProperty("bottom")
  public String getBottom() {
    return bottom;
  }
  public void setBottom(String bottom) {
    this.bottom = bottom;
  }

  
  /**
   * Left positioning offset.
   **/
  public PatchContentPositionProperties left(String left) {
    this.left = left;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left positioning offset.")
  @JsonProperty("left")
  public String getLeft() {
    return left;
  }
  public void setLeft(String left) {
    this.left = left;
  }

  
  /**
   * Right positioning offset.
   **/
  public PatchContentPositionProperties right(String right) {
    this.right = right;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right positioning offset.")
  @JsonProperty("right")
  public String getRight() {
    return right;
  }
  public void setRight(String right) {
    this.right = right;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchContentPositionProperties patchContentPositionProperties = (PatchContentPositionProperties) o;
    return Objects.equals(this.top, patchContentPositionProperties.top) &&
        Objects.equals(this.bottom, patchContentPositionProperties.bottom) &&
        Objects.equals(this.left, patchContentPositionProperties.left) &&
        Objects.equals(this.right, patchContentPositionProperties.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(top, bottom, left, right);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchContentPositionProperties {\n");
    
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

