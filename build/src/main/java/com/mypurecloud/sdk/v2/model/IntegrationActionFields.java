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
import com.mypurecloud.sdk.v2.model.IntegrationAction;
import com.mypurecloud.sdk.v2.model.RequestMapping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntegrationActionFields
 */

public class IntegrationActionFields  implements Serializable {
  
  private IntegrationAction integrationAction = null;
  private List<RequestMapping> requestMappings = new ArrayList<RequestMapping>();

  
  /**
   * Reference to the Integration Action to be used when integrationAction type is qualified
   **/
  public IntegrationActionFields integrationAction(IntegrationAction integrationAction) {
    this.integrationAction = integrationAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the Integration Action to be used when integrationAction type is qualified")
  @JsonProperty("integrationAction")
  public IntegrationAction getIntegrationAction() {
    return integrationAction;
  }
  public void setIntegrationAction(IntegrationAction integrationAction) {
    this.integrationAction = integrationAction;
  }

  
  /**
   * Collection of Request Mappings to use
   **/
  public IntegrationActionFields requestMappings(List<RequestMapping> requestMappings) {
    this.requestMappings = requestMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of Request Mappings to use")
  @JsonProperty("requestMappings")
  public List<RequestMapping> getRequestMappings() {
    return requestMappings;
  }
  public void setRequestMappings(List<RequestMapping> requestMappings) {
    this.requestMappings = requestMappings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationActionFields integrationActionFields = (IntegrationActionFields) o;
    return Objects.equals(this.integrationAction, integrationActionFields.integrationAction) &&
        Objects.equals(this.requestMappings, integrationActionFields.requestMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationAction, requestMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationActionFields {\n");
    
    sb.append("    integrationAction: ").append(toIndentedString(integrationAction)).append("\n");
    sb.append("    requestMappings: ").append(toIndentedString(requestMappings)).append("\n");
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

