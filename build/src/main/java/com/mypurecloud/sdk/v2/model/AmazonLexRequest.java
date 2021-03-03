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
 * AmazonLexRequest
 */

public class AmazonLexRequest  implements Serializable {
  
  private Map<String, String> requestAttributes = null;
  private Map<String, String> sessionAttributes = null;

  
  /**
   * AttributeName/AttributeValue pairs of User Defined Request Attributes to be sent to the amazon bot See - https://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs
   **/
  public AmazonLexRequest requestAttributes(Map<String, String> requestAttributes) {
    this.requestAttributes = requestAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AttributeName/AttributeValue pairs of User Defined Request Attributes to be sent to the amazon bot See - https://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs")
  @JsonProperty("requestAttributes")
  public Map<String, String> getRequestAttributes() {
    return requestAttributes;
  }
  public void setRequestAttributes(Map<String, String> requestAttributes) {
    this.requestAttributes = requestAttributes;
  }

  
  /**
   * AttributeName/AttributeValue pairs of Session Attributes to be sent to the amazon bot. See - https://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs
   **/
  public AmazonLexRequest sessionAttributes(Map<String, String> sessionAttributes) {
    this.sessionAttributes = sessionAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AttributeName/AttributeValue pairs of Session Attributes to be sent to the amazon bot. See - https://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs")
  @JsonProperty("sessionAttributes")
  public Map<String, String> getSessionAttributes() {
    return sessionAttributes;
  }
  public void setSessionAttributes(Map<String, String> sessionAttributes) {
    this.sessionAttributes = sessionAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonLexRequest amazonLexRequest = (AmazonLexRequest) o;
    return Objects.equals(this.requestAttributes, amazonLexRequest.requestAttributes) &&
        Objects.equals(this.sessionAttributes, amazonLexRequest.sessionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestAttributes, sessionAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonLexRequest {\n");
    
    sb.append("    requestAttributes: ").append(toIndentedString(requestAttributes)).append("\n");
    sb.append("    sessionAttributes: ").append(toIndentedString(sessionAttributes)).append("\n");
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

