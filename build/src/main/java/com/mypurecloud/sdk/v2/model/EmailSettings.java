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
 * EmailSettings
 */

public class EmailSettings  implements Serializable {
  
  private Boolean multipleRouteDestinationsOnInboundEmailEnabled = null;

  public EmailSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * This setting allows a single inbound email that contains multiple routes configured in Genesys Cloud to create a conversation per route. When this setting is disabled only a single conversation will be created
   **/
  public EmailSettings multipleRouteDestinationsOnInboundEmailEnabled(Boolean multipleRouteDestinationsOnInboundEmailEnabled) {
    this.multipleRouteDestinationsOnInboundEmailEnabled = multipleRouteDestinationsOnInboundEmailEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This setting allows a single inbound email that contains multiple routes configured in Genesys Cloud to create a conversation per route. When this setting is disabled only a single conversation will be created")
  @JsonProperty("multipleRouteDestinationsOnInboundEmailEnabled")
  public Boolean getMultipleRouteDestinationsOnInboundEmailEnabled() {
    return multipleRouteDestinationsOnInboundEmailEnabled;
  }
  public void setMultipleRouteDestinationsOnInboundEmailEnabled(Boolean multipleRouteDestinationsOnInboundEmailEnabled) {
    this.multipleRouteDestinationsOnInboundEmailEnabled = multipleRouteDestinationsOnInboundEmailEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSettings emailSettings = (EmailSettings) o;

    return Objects.equals(this.multipleRouteDestinationsOnInboundEmailEnabled, emailSettings.multipleRouteDestinationsOnInboundEmailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleRouteDestinationsOnInboundEmailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    sb.append("    multipleRouteDestinationsOnInboundEmailEnabled: ").append(toIndentedString(multipleRouteDestinationsOnInboundEmailEnabled)).append("\n");
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

