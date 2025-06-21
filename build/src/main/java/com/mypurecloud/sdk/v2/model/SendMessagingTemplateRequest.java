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
import com.mypurecloud.sdk.v2.model.TemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SendMessagingTemplateRequest
 */

public class SendMessagingTemplateRequest  implements Serializable {
  
  private String responseId = null;
  private List<TemplateParameter> parameters = null;
  private List<TemplateParameter> headerParameters = null;
  private List<TemplateParameter> bodyParameters = null;
  private List<TemplateParameter> buttonUrlParameters = null;

  public SendMessagingTemplateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      parameters = new ArrayList<TemplateParameter>();
      headerParameters = new ArrayList<TemplateParameter>();
      bodyParameters = new ArrayList<TemplateParameter>();
      buttonUrlParameters = new ArrayList<TemplateParameter>();
    }
  }

  
  /**
   * Unique identifier for a Response Management response to fetch and apply pre-configured message content when sending outbound responses.
   **/
  public SendMessagingTemplateRequest responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for a Response Management response to fetch and apply pre-configured message content when sending outbound responses.")
  @JsonProperty("responseId")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }


  /**
   * A list of Response Management response substitutions for the response's messaging template. (Deprecated) use bodyParameters instead.
   **/
  public SendMessagingTemplateRequest parameters(List<TemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management response substitutions for the response's messaging template. (Deprecated) use bodyParameters instead.")
  @JsonProperty("parameters")
  public List<TemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<TemplateParameter> parameters) {
    this.parameters = parameters;
  }


  /**
   * A list of Response Management header parameter substitutions for the response's messaging template
   **/
  public SendMessagingTemplateRequest headerParameters(List<TemplateParameter> headerParameters) {
    this.headerParameters = headerParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management header parameter substitutions for the response's messaging template")
  @JsonProperty("headerParameters")
  public List<TemplateParameter> getHeaderParameters() {
    return headerParameters;
  }
  public void setHeaderParameters(List<TemplateParameter> headerParameters) {
    this.headerParameters = headerParameters;
  }


  /**
   * A list of Response Management body parameter substitutions for the response's messaging template
   **/
  public SendMessagingTemplateRequest bodyParameters(List<TemplateParameter> bodyParameters) {
    this.bodyParameters = bodyParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management body parameter substitutions for the response's messaging template")
  @JsonProperty("bodyParameters")
  public List<TemplateParameter> getBodyParameters() {
    return bodyParameters;
  }
  public void setBodyParameters(List<TemplateParameter> bodyParameters) {
    this.bodyParameters = bodyParameters;
  }


  /**
   * A list of Response Management button url parameter substitutions for the response's messaging template
   **/
  public SendMessagingTemplateRequest buttonUrlParameters(List<TemplateParameter> buttonUrlParameters) {
    this.buttonUrlParameters = buttonUrlParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management button url parameter substitutions for the response's messaging template")
  @JsonProperty("buttonUrlParameters")
  public List<TemplateParameter> getButtonUrlParameters() {
    return buttonUrlParameters;
  }
  public void setButtonUrlParameters(List<TemplateParameter> buttonUrlParameters) {
    this.buttonUrlParameters = buttonUrlParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessagingTemplateRequest sendMessagingTemplateRequest = (SendMessagingTemplateRequest) o;

    return Objects.equals(this.responseId, sendMessagingTemplateRequest.responseId) &&
            Objects.equals(this.parameters, sendMessagingTemplateRequest.parameters) &&
            Objects.equals(this.headerParameters, sendMessagingTemplateRequest.headerParameters) &&
            Objects.equals(this.bodyParameters, sendMessagingTemplateRequest.bodyParameters) &&
            Objects.equals(this.buttonUrlParameters, sendMessagingTemplateRequest.buttonUrlParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseId, parameters, headerParameters, bodyParameters, buttonUrlParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessagingTemplateRequest {\n");
    
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    headerParameters: ").append(toIndentedString(headerParameters)).append("\n");
    sb.append("    bodyParameters: ").append(toIndentedString(bodyParameters)).append("\n");
    sb.append("    buttonUrlParameters: ").append(toIndentedString(buttonUrlParameters)).append("\n");
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

