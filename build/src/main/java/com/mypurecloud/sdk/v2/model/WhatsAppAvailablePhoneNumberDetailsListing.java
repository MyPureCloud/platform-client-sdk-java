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
import com.mypurecloud.sdk.v2.model.WhatsAppAvailablePhoneNumberDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WhatsAppAvailablePhoneNumberDetailsListing
 */

public class WhatsAppAvailablePhoneNumberDetailsListing  implements Serializable {
  
  private List<WhatsAppAvailablePhoneNumberDetails> entities = null;

  public WhatsAppAvailablePhoneNumberDetailsListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<WhatsAppAvailablePhoneNumberDetails>();
    }
  }

  
  /**
   **/
  public WhatsAppAvailablePhoneNumberDetailsListing entities(List<WhatsAppAvailablePhoneNumberDetails> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WhatsAppAvailablePhoneNumberDetails> getEntities() {
    return entities;
  }
  public void setEntities(List<WhatsAppAvailablePhoneNumberDetails> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppAvailablePhoneNumberDetailsListing whatsAppAvailablePhoneNumberDetailsListing = (WhatsAppAvailablePhoneNumberDetailsListing) o;

    return Objects.equals(this.entities, whatsAppAvailablePhoneNumberDetailsListing.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppAvailablePhoneNumberDetailsListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

