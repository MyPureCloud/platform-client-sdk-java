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
 * Request to queue an on-demand summary for a conversation.
 */
@ApiModel(description = "Request to queue an on-demand summary for a conversation.")

public class OnDemandConversationSummaryRequest  implements Serializable {
  
  private String locale = null;

  public OnDemandConversationSummaryRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OnDemandConversationSummaryRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Locale for the summary (e.g. en-us).
   **/
  public OnDemandConversationSummaryRequest locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Locale for the summary (e.g. en-us).")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnDemandConversationSummaryRequest onDemandConversationSummaryRequest = (OnDemandConversationSummaryRequest) o;

    return Objects.equals(this.locale, onDemandConversationSummaryRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnDemandConversationSummaryRequest {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

