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
import com.mypurecloud.sdk.v2.model.CopilotContextFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeSettingDynamicFilter
 */

public class KnowledgeSettingDynamicFilter  implements Serializable {
  
  private CopilotContextFilter context = null;

  public KnowledgeSettingDynamicFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public KnowledgeSettingDynamicFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Filter based on copilot context values.
   **/
  public KnowledgeSettingDynamicFilter context(CopilotContextFilter context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter based on copilot context values.")
  @JsonProperty("context")
  public CopilotContextFilter getContext() {
    return context;
  }
  public void setContext(CopilotContextFilter context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSettingDynamicFilter knowledgeSettingDynamicFilter = (KnowledgeSettingDynamicFilter) o;

    return Objects.equals(this.context, knowledgeSettingDynamicFilter.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSettingDynamicFilter {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

