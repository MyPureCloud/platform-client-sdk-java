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
import com.mypurecloud.sdk.v2.model.CardParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template parameters for carousel components
 */
@ApiModel(description = "Template parameters for carousel components")

public class CarouselParameters  implements Serializable {
  
  private List<CardParameters> cardParameters = null;

  public CarouselParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      cardParameters = new ArrayList<CardParameters>();
    }
  }

  
  /**
   * A list of carousel cards with their respective template parameters
   **/
  public CarouselParameters cardParameters(List<CardParameters> cardParameters) {
    this.cardParameters = cardParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of carousel cards with their respective template parameters")
  @JsonProperty("cardParameters")
  public List<CardParameters> getCardParameters() {
    return cardParameters;
  }
  public void setCardParameters(List<CardParameters> cardParameters) {
    this.cardParameters = cardParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselParameters carouselParameters = (CarouselParameters) o;

    return Objects.equals(this.cardParameters, carouselParameters.cardParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselParameters {\n");
    
    sb.append("    cardParameters: ").append(toIndentedString(cardParameters)).append("\n");
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

