package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebMessagingOfferFields
 */

public class WebMessagingOfferFields  implements Serializable {
  
  private String offerText = null;
  private AddressableEntityRef architectFlow = null;

  
  /**
   * Text value to be used when inviting a visitor to engage with a web messaging offer.
   **/
  public WebMessagingOfferFields offerText(String offerText) {
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

  
  /**
   * Flow to be invoked, overrides default flow when specified.
   **/
  public WebMessagingOfferFields architectFlow(AddressableEntityRef architectFlow) {
    this.architectFlow = architectFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow to be invoked, overrides default flow when specified.")
  @JsonProperty("architectFlow")
  public AddressableEntityRef getArchitectFlow() {
    return architectFlow;
  }
  public void setArchitectFlow(AddressableEntityRef architectFlow) {
    this.architectFlow = architectFlow;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingOfferFields webMessagingOfferFields = (WebMessagingOfferFields) o;
    return Objects.equals(this.offerText, webMessagingOfferFields.offerText) &&
        Objects.equals(this.architectFlow, webMessagingOfferFields.architectFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerText, architectFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingOfferFields {\n");
    
    sb.append("    offerText: ").append(toIndentedString(offerText)).append("\n");
    sb.append("    architectFlow: ").append(toIndentedString(architectFlow)).append("\n");
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

