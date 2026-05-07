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
 * SetWhatsAppIntegrationActionSettings
 */

public class SetWhatsAppIntegrationActionSettings  implements Serializable {
  
  private String whatsAppIntegrationId = null;

  public SetWhatsAppIntegrationActionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the WhatsApp integration.
   **/
  public SetWhatsAppIntegrationActionSettings whatsAppIntegrationId(String whatsAppIntegrationId) {
    this.whatsAppIntegrationId = whatsAppIntegrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the WhatsApp integration.")
  @JsonProperty("whatsAppIntegrationId")
  public String getWhatsAppIntegrationId() {
    return whatsAppIntegrationId;
  }
  public void setWhatsAppIntegrationId(String whatsAppIntegrationId) {
    this.whatsAppIntegrationId = whatsAppIntegrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetWhatsAppIntegrationActionSettings setWhatsAppIntegrationActionSettings = (SetWhatsAppIntegrationActionSettings) o;

    return Objects.equals(this.whatsAppIntegrationId, setWhatsAppIntegrationActionSettings.whatsAppIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsAppIntegrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetWhatsAppIntegrationActionSettings {\n");
    
    sb.append("    whatsAppIntegrationId: ").append(toIndentedString(whatsAppIntegrationId)).append("\n");
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

