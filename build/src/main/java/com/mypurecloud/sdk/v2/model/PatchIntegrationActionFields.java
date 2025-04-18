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
import com.mypurecloud.sdk.v2.model.PatchIntegrationAction;
import com.mypurecloud.sdk.v2.model.RequestMapping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PatchIntegrationActionFields
 */

public class PatchIntegrationActionFields  implements Serializable {
  
  private PatchIntegrationAction integrationAction = null;
  private List<RequestMapping> requestMappings = null;

  public PatchIntegrationActionFields() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requestMappings = new ArrayList<RequestMapping>();
    }
  }

  
  /**
   * Reference to the Integration Action to be used when integrationAction type is qualified
   **/
  public PatchIntegrationActionFields integrationAction(PatchIntegrationAction integrationAction) {
    this.integrationAction = integrationAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the Integration Action to be used when integrationAction type is qualified")
  @JsonProperty("integrationAction")
  public PatchIntegrationAction getIntegrationAction() {
    return integrationAction;
  }
  public void setIntegrationAction(PatchIntegrationAction integrationAction) {
    this.integrationAction = integrationAction;
  }


  /**
   * Collection of Request Mappings to use
   **/
  public PatchIntegrationActionFields requestMappings(List<RequestMapping> requestMappings) {
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
    PatchIntegrationActionFields patchIntegrationActionFields = (PatchIntegrationActionFields) o;

    return Objects.equals(this.integrationAction, patchIntegrationActionFields.integrationAction) &&
            Objects.equals(this.requestMappings, patchIntegrationActionFields.requestMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationAction, requestMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchIntegrationActionFields {\n");
    
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

