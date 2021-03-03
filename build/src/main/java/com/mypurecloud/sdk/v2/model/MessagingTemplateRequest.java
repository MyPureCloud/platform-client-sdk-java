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
import com.mypurecloud.sdk.v2.model.TemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MessagingTemplateRequest
 */

public class MessagingTemplateRequest  implements Serializable {
  
  private String responseId = null;
  private List<TemplateParameter> parameters = new ArrayList<TemplateParameter>();

  
  /**
   * A Response Management response identifier for a messaging template defined response
   **/
  public MessagingTemplateRequest responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Response Management response identifier for a messaging template defined response")
  @JsonProperty("responseId")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  
  /**
   * A list of Response Management response substitutions for the response's messaging template
   **/
  public MessagingTemplateRequest parameters(List<TemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management response substitutions for the response's messaging template")
  @JsonProperty("parameters")
  public List<TemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<TemplateParameter> parameters) {
    this.parameters = parameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingTemplateRequest messagingTemplateRequest = (MessagingTemplateRequest) o;
    return Objects.equals(this.responseId, messagingTemplateRequest.responseId) &&
        Objects.equals(this.parameters, messagingTemplateRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseId, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingTemplateRequest {\n");
    
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

