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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings
 */

public class Settings  implements Serializable {
  
  private Boolean communicationBasedACW = null;
  private Boolean includeNonAgentConversationSummary = null;
  private Boolean allowCallbackQueueSelection = null;
  private Boolean callbacksInheritRoutingFromInboundCall = null;
  private Boolean completeAcwWhenAgentTransitionsOffline = null;
  private Boolean totalActiveCallback = null;

  public Settings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Communication Based ACW
   **/
  public Settings communicationBasedACW(Boolean communicationBasedACW) {
    this.communicationBasedACW = communicationBasedACW;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Communication Based ACW")
  @JsonProperty("communicationBasedACW")
  public Boolean getCommunicationBasedACW() {
    return communicationBasedACW;
  }
  public void setCommunicationBasedACW(Boolean communicationBasedACW) {
    this.communicationBasedACW = communicationBasedACW;
  }


  /**
   * Display communication summary
   **/
  public Settings includeNonAgentConversationSummary(Boolean includeNonAgentConversationSummary) {
    this.includeNonAgentConversationSummary = includeNonAgentConversationSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display communication summary")
  @JsonProperty("includeNonAgentConversationSummary")
  public Boolean getIncludeNonAgentConversationSummary() {
    return includeNonAgentConversationSummary;
  }
  public void setIncludeNonAgentConversationSummary(Boolean includeNonAgentConversationSummary) {
    this.includeNonAgentConversationSummary = includeNonAgentConversationSummary;
  }


  /**
   * Allow Callback Queue Selection
   **/
  public Settings allowCallbackQueueSelection(Boolean allowCallbackQueueSelection) {
    this.allowCallbackQueueSelection = allowCallbackQueueSelection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow Callback Queue Selection")
  @JsonProperty("allowCallbackQueueSelection")
  public Boolean getAllowCallbackQueueSelection() {
    return allowCallbackQueueSelection;
  }
  public void setAllowCallbackQueueSelection(Boolean allowCallbackQueueSelection) {
    this.allowCallbackQueueSelection = allowCallbackQueueSelection;
  }


  /**
   * Inherit callback routing data from inbound calls
   **/
  public Settings callbacksInheritRoutingFromInboundCall(Boolean callbacksInheritRoutingFromInboundCall) {
    this.callbacksInheritRoutingFromInboundCall = callbacksInheritRoutingFromInboundCall;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inherit callback routing data from inbound calls")
  @JsonProperty("callbacksInheritRoutingFromInboundCall")
  public Boolean getCallbacksInheritRoutingFromInboundCall() {
    return callbacksInheritRoutingFromInboundCall;
  }
  public void setCallbacksInheritRoutingFromInboundCall(Boolean callbacksInheritRoutingFromInboundCall) {
    this.callbacksInheritRoutingFromInboundCall = callbacksInheritRoutingFromInboundCall;
  }


  /**
   * Complete ACW When Agent Transitions Offline
   **/
  public Settings completeAcwWhenAgentTransitionsOffline(Boolean completeAcwWhenAgentTransitionsOffline) {
    this.completeAcwWhenAgentTransitionsOffline = completeAcwWhenAgentTransitionsOffline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complete ACW When Agent Transitions Offline")
  @JsonProperty("completeAcwWhenAgentTransitionsOffline")
  public Boolean getCompleteAcwWhenAgentTransitionsOffline() {
    return completeAcwWhenAgentTransitionsOffline;
  }
  public void setCompleteAcwWhenAgentTransitionsOffline(Boolean completeAcwWhenAgentTransitionsOffline) {
    this.completeAcwWhenAgentTransitionsOffline = completeAcwWhenAgentTransitionsOffline;
  }


  /**
   * Exclude the 'interacting' duration from the handle calculations of callbacks
   **/
  public Settings totalActiveCallback(Boolean totalActiveCallback) {
    this.totalActiveCallback = totalActiveCallback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exclude the 'interacting' duration from the handle calculations of callbacks")
  @JsonProperty("totalActiveCallback")
  public Boolean getTotalActiveCallback() {
    return totalActiveCallback;
  }
  public void setTotalActiveCallback(Boolean totalActiveCallback) {
    this.totalActiveCallback = totalActiveCallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;

    return Objects.equals(this.communicationBasedACW, settings.communicationBasedACW) &&
            Objects.equals(this.includeNonAgentConversationSummary, settings.includeNonAgentConversationSummary) &&
            Objects.equals(this.allowCallbackQueueSelection, settings.allowCallbackQueueSelection) &&
            Objects.equals(this.callbacksInheritRoutingFromInboundCall, settings.callbacksInheritRoutingFromInboundCall) &&
            Objects.equals(this.completeAcwWhenAgentTransitionsOffline, settings.completeAcwWhenAgentTransitionsOffline) &&
            Objects.equals(this.totalActiveCallback, settings.totalActiveCallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationBasedACW, includeNonAgentConversationSummary, allowCallbackQueueSelection, callbacksInheritRoutingFromInboundCall, completeAcwWhenAgentTransitionsOffline, totalActiveCallback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    communicationBasedACW: ").append(toIndentedString(communicationBasedACW)).append("\n");
    sb.append("    includeNonAgentConversationSummary: ").append(toIndentedString(includeNonAgentConversationSummary)).append("\n");
    sb.append("    allowCallbackQueueSelection: ").append(toIndentedString(allowCallbackQueueSelection)).append("\n");
    sb.append("    callbacksInheritRoutingFromInboundCall: ").append(toIndentedString(callbacksInheritRoutingFromInboundCall)).append("\n");
    sb.append("    completeAcwWhenAgentTransitionsOffline: ").append(toIndentedString(completeAcwWhenAgentTransitionsOffline)).append("\n");
    sb.append("    totalActiveCallback: ").append(toIndentedString(totalActiveCallback)).append("\n");
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

