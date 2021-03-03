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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Defines response components of the Action Request.
 */
@ApiModel(description = "Defines response components of the Action Request.")

public class RequestConfig  implements Serializable {
  
  private String requestUrlTemplate = null;
  private String requestTemplate = null;
  private String requestTemplateUri = null;
  private String requestType = null;
  private Map<String, String> headers = null;

  
  /**
   * URL that may include placeholders for requests to 3rd party service
   **/
  public RequestConfig requestUrlTemplate(String requestUrlTemplate) {
    this.requestUrlTemplate = requestUrlTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL that may include placeholders for requests to 3rd party service")
  @JsonProperty("requestUrlTemplate")
  public String getRequestUrlTemplate() {
    return requestUrlTemplate;
  }
  public void setRequestUrlTemplate(String requestUrlTemplate) {
    this.requestUrlTemplate = requestUrlTemplate;
  }

  
  /**
   * Velocity template to define request body sent to 3rd party service.
   **/
  public RequestConfig requestTemplate(String requestTemplate) {
    this.requestTemplate = requestTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Velocity template to define request body sent to 3rd party service.")
  @JsonProperty("requestTemplate")
  public String getRequestTemplate() {
    return requestTemplate;
  }
  public void setRequestTemplate(String requestTemplate) {
    this.requestTemplate = requestTemplate;
  }

  
  /**
   * URI to retrieve requestTemplate
   **/
  public RequestConfig requestTemplateUri(String requestTemplateUri) {
    this.requestTemplateUri = requestTemplateUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI to retrieve requestTemplate")
  @JsonProperty("requestTemplateUri")
  public String getRequestTemplateUri() {
    return requestTemplateUri;
  }
  public void setRequestTemplateUri(String requestTemplateUri) {
    this.requestTemplateUri = requestTemplateUri;
  }

  
  /**
   * HTTP method to use for request
   **/
  public RequestConfig requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "HTTP method to use for request")
  @JsonProperty("requestType")
  public String getRequestType() {
    return requestType;
  }
  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  
  /**
   * Headers to include in request in (Header Name, Value) pairs.
   **/
  public RequestConfig headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headers to include in request in (Header Name, Value) pairs.")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestConfig requestConfig = (RequestConfig) o;
    return Objects.equals(this.requestUrlTemplate, requestConfig.requestUrlTemplate) &&
        Objects.equals(this.requestTemplate, requestConfig.requestTemplate) &&
        Objects.equals(this.requestTemplateUri, requestConfig.requestTemplateUri) &&
        Objects.equals(this.requestType, requestConfig.requestType) &&
        Objects.equals(this.headers, requestConfig.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestUrlTemplate, requestTemplate, requestTemplateUri, requestType, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestConfig {\n");
    
    sb.append("    requestUrlTemplate: ").append(toIndentedString(requestUrlTemplate)).append("\n");
    sb.append("    requestTemplate: ").append(toIndentedString(requestTemplate)).append("\n");
    sb.append("    requestTemplateUri: ").append(toIndentedString(requestTemplateUri)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

