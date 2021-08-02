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
 * ImportError
 */

public class ImportError  implements Serializable {
  
  private String message = null;
  private Integer line = null;

  
  /**
   **/
  public ImportError message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public ImportError line(Integer line) {
    this.line = line;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line")
  public Integer getLine() {
    return line;
  }
  public void setLine(Integer line) {
    this.line = line;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportError importError = (ImportError) o;
    return Objects.equals(this.message, importError.message) &&
        Objects.equals(this.line, importError.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

