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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Display attributes for an element in a journey view
 */
@ApiModel(description = "Display attributes for an element in a journey view")

public class JourneyViewElementDisplayAttributes  implements Serializable {
  
  private Integer x = null;
  private Integer y = null;
  private Integer col = null;

  public JourneyViewElementDisplayAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The horizontal position (x-coordinate) of the element on the journey view canvas
   **/
  public JourneyViewElementDisplayAttributes x(Integer x) {
    this.x = x;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The horizontal position (x-coordinate) of the element on the journey view canvas")
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }


  /**
   * The vertical position (y-coordinate) of the element on the journey view canvas
   **/
  public JourneyViewElementDisplayAttributes y(Integer y) {
    this.y = y;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vertical position (y-coordinate) of the element on the journey view canvas")
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }


  /**
   * The column position for the element in the journey view canvas
   **/
  public JourneyViewElementDisplayAttributes col(Integer col) {
    this.col = col;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The column position for the element in the journey view canvas")
  @JsonProperty("col")
  public Integer getCol() {
    return col;
  }
  public void setCol(Integer col) {
    this.col = col;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewElementDisplayAttributes journeyViewElementDisplayAttributes = (JourneyViewElementDisplayAttributes) o;

    return Objects.equals(this.x, journeyViewElementDisplayAttributes.x) &&
            Objects.equals(this.y, journeyViewElementDisplayAttributes.y) &&
            Objects.equals(this.col, journeyViewElementDisplayAttributes.col);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, col);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElementDisplayAttributes {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    col: ").append(toIndentedString(col)).append("\n");
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

