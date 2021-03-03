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
 * ImportScriptStatusResponse
 */

public class ImportScriptStatusResponse  implements Serializable {
  
  private String url = null;
  private Boolean succeeded = null;
  private String message = null;

  
  /**
   **/
  public ImportScriptStatusResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public ImportScriptStatusResponse succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("succeeded")
  public Boolean getSucceeded() {
    return succeeded;
  }
  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }

  
  /**
   **/
  public ImportScriptStatusResponse message(String message) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportScriptStatusResponse importScriptStatusResponse = (ImportScriptStatusResponse) o;
    return Objects.equals(this.url, importScriptStatusResponse.url) &&
        Objects.equals(this.succeeded, importScriptStatusResponse.succeeded) &&
        Objects.equals(this.message, importScriptStatusResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, succeeded, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportScriptStatusResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

