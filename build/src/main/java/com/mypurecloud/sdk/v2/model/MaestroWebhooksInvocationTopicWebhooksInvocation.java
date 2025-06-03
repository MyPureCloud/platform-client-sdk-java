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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * MaestroWebhooksInvocationTopicWebhooksInvocation
 */

public class MaestroWebhooksInvocationTopicWebhooksInvocation  implements Serializable {
  
  private Object body = null;
  private Map<String, List<String>> headers = null;
  private Map<String, List<String>> query = null;

  public MaestroWebhooksInvocationTopicWebhooksInvocation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public MaestroWebhooksInvocationTopicWebhooksInvocation body(Object body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }
  public void setBody(Object body) {
    this.body = body;
  }


  /**
   **/
  public MaestroWebhooksInvocationTopicWebhooksInvocation headers(Map<String, List<String>> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("headers")
  public Map<String, List<String>> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }


  /**
   **/
  public MaestroWebhooksInvocationTopicWebhooksInvocation query(Map<String, List<String>> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("query")
  public Map<String, List<String>> getQuery() {
    return query;
  }
  public void setQuery(Map<String, List<String>> query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaestroWebhooksInvocationTopicWebhooksInvocation maestroWebhooksInvocationTopicWebhooksInvocation = (MaestroWebhooksInvocationTopicWebhooksInvocation) o;

    return Objects.equals(this.body, maestroWebhooksInvocationTopicWebhooksInvocation.body) &&
            Objects.equals(this.headers, maestroWebhooksInvocationTopicWebhooksInvocation.headers) &&
            Objects.equals(this.query, maestroWebhooksInvocationTopicWebhooksInvocation.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, headers, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaestroWebhooksInvocationTopicWebhooksInvocation {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

