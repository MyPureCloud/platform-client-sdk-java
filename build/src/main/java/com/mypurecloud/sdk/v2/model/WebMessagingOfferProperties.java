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
 * WebMessagingOfferProperties
 */

public class WebMessagingOfferProperties  implements Serializable {
  
  private String offerText = null;

  public WebMessagingOfferProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Text value to be used when inviting a visitor to engage with a web messaging offer.
   **/
  public WebMessagingOfferProperties offerText(String offerText) {
    this.offerText = offerText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text value to be used when inviting a visitor to engage with a web messaging offer.")
  @JsonProperty("offerText")
  public String getOfferText() {
    return offerText;
  }
  public void setOfferText(String offerText) {
    this.offerText = offerText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingOfferProperties webMessagingOfferProperties = (WebMessagingOfferProperties) o;

    return Objects.equals(this.offerText, webMessagingOfferProperties.offerText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingOfferProperties {\n");
    
    sb.append("    offerText: ").append(toIndentedString(offerText)).append("\n");
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

