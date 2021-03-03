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
 * PINConfiguration
 */

public class PINConfiguration  implements Serializable {
  
  private Integer minimumLength = null;
  private Integer maximumLength = null;

  
  /**
   **/
  public PINConfiguration minimumLength(Integer minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimumLength")
  public Integer getMinimumLength() {
    return minimumLength;
  }
  public void setMinimumLength(Integer minimumLength) {
    this.minimumLength = minimumLength;
  }

  
  /**
   **/
  public PINConfiguration maximumLength(Integer maximumLength) {
    this.maximumLength = maximumLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maximumLength")
  public Integer getMaximumLength() {
    return maximumLength;
  }
  public void setMaximumLength(Integer maximumLength) {
    this.maximumLength = maximumLength;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PINConfiguration pINConfiguration = (PINConfiguration) o;
    return Objects.equals(this.minimumLength, pINConfiguration.minimumLength) &&
        Objects.equals(this.maximumLength, pINConfiguration.maximumLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLength, maximumLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PINConfiguration {\n");
    
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
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

