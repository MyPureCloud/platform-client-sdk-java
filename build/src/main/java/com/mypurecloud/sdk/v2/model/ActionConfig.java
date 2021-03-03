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
  
  private RequestConfig _request = null;
  private ResponseConfig response = null;

  
  /**
   * Configuration of outbound request.
   **/
  public ActionConfig _request(RequestConfig _request) {
    this._request = _request;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration of outbound request.")
  @JsonProperty("request")
  public RequestConfig getRequest() {
    return _request;
  }
  public void setRequest(RequestConfig _request) {
    this._request = _request;
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
    return Objects.equals(this._request, actionConfig._request) &&
        Objects.equals(this.response, actionConfig.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_request, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionConfig {\n");
    
    sb.append("    _request: ").append(toIndentedString(_request)).append("\n");
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

