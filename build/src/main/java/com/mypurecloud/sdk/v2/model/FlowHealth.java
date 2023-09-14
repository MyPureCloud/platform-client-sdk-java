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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.FlowHealthIntentInfo;
import com.mypurecloud.sdk.v2.model.FlowHealthVersionInfo;
import com.mypurecloud.sdk.v2.model.LocaleInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * FlowHealth
 */

public class FlowHealth  implements Serializable {
  
  private FlowHealthVersionInfo flowVersionInfo = null;
  private Map<String, LocaleInfo> languageInfo = null;
  private List<FlowHealthIntentInfo> intents = new ArrayList<FlowHealthIntentInfo>();
  private String selfUri = null;

  
  /**
   * Info about given flow version.
   **/
  public FlowHealth flowVersionInfo(FlowHealthVersionInfo flowVersionInfo) {
    this.flowVersionInfo = flowVersionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Info about given flow version.")
  @JsonProperty("flowVersionInfo")
  public FlowHealthVersionInfo getFlowVersionInfo() {
    return flowVersionInfo;
  }
  public void setFlowVersionInfo(FlowHealthVersionInfo flowVersionInfo) {
    this.flowVersionInfo = flowVersionInfo;
  }


  /**
   * Each language's status about its health computation.
   **/
  public FlowHealth languageInfo(Map<String, LocaleInfo> languageInfo) {
    this.languageInfo = languageInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Each language's status about its health computation.")
  @JsonProperty("languageInfo")
  public Map<String, LocaleInfo> getLanguageInfo() {
    return languageInfo;
  }
  public void setLanguageInfo(Map<String, LocaleInfo> languageInfo) {
    this.languageInfo = languageInfo;
  }


  /**
   * Health metrics information for the intents.
   **/
  public FlowHealth intents(List<FlowHealthIntentInfo> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Health metrics information for the intents.")
  @JsonProperty("intents")
  public List<FlowHealthIntentInfo> getIntents() {
    return intents;
  }
  public void setIntents(List<FlowHealthIntentInfo> intents) {
    this.intents = intents;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHealth flowHealth = (FlowHealth) o;

    return Objects.equals(this.flowVersionInfo, flowHealth.flowVersionInfo) &&
            Objects.equals(this.languageInfo, flowHealth.languageInfo) &&
            Objects.equals(this.intents, flowHealth.intents) &&
            Objects.equals(this.selfUri, flowHealth.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowVersionInfo, languageInfo, intents, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHealth {\n");
    
    sb.append("    flowVersionInfo: ").append(toIndentedString(flowVersionInfo)).append("\n");
    sb.append("    languageInfo: ").append(toIndentedString(languageInfo)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

