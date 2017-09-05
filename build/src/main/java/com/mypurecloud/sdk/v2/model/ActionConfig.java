package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RequestConfig;
import com.mypurecloud.sdk.v2.model.ResponseConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Defines components of the Action Config.
 */
@ApiModel(description = "Defines components of the Action Config.")

public class ActionConfig  implements Serializable {
  
  private RequestConfig request = null;
  private ResponseConfig response = null;

  
  /**
   * Configuration of outbound request.
   **/
  public ActionConfig request(RequestConfig request) {
    this.request = request;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration of outbound request.")
  @JsonProperty("request")
  public RequestConfig getRequest() {
    return request;
  }
  public void setRequest(RequestConfig request) {
    this.request = request;
  }

  
  /**
   * Configuration of response processing.
   **/
  public ActionConfig response(ResponseConfig response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration of response processing.")
  @JsonProperty("response")
  public ResponseConfig getResponse() {
    return response;
  }
  public void setResponse(ResponseConfig response) {
    this.response = response;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionConfig actionConfig = (ActionConfig) o;
    return Objects.equals(this.request, actionConfig.request) &&
        Objects.equals(this.response, actionConfig.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionConfig {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

