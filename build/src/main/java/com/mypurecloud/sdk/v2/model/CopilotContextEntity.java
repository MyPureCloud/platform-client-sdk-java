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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.CopilotContextValueItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CopilotContextEntity
 */

public class CopilotContextEntity  implements Serializable {
  
  private AddressableEntityRef assistant = null;
  private List<CopilotContextValueItem> contextValues = null;

  public CopilotContextEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contextValues = new ArrayList<CopilotContextValueItem>();
    }
  }

  
  /**
   * The assistant associated with this context.
   **/
  public CopilotContextEntity assistant(AddressableEntityRef assistant) {
    this.assistant = assistant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assistant associated with this context.")
  @JsonProperty("assistant")
  public AddressableEntityRef getAssistant() {
    return assistant;
  }
  public void setAssistant(AddressableEntityRef assistant) {
    this.assistant = assistant;
  }


  /**
   * List of copilot context values for this assistant.
   **/
  public CopilotContextEntity contextValues(List<CopilotContextValueItem> contextValues) {
    this.contextValues = contextValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of copilot context values for this assistant.")
  @JsonProperty("contextValues")
  public List<CopilotContextValueItem> getContextValues() {
    return contextValues;
  }
  public void setContextValues(List<CopilotContextValueItem> contextValues) {
    this.contextValues = contextValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopilotContextEntity copilotContextEntity = (CopilotContextEntity) o;

    return Objects.equals(this.assistant, copilotContextEntity.assistant) &&
            Objects.equals(this.contextValues, copilotContextEntity.contextValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistant, contextValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopilotContextEntity {\n");
    
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
    sb.append("    contextValues: ").append(toIndentedString(contextValues)).append("\n");
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

